package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputTransformer extends js.Object {
  
  /**
    * Map of JSON paths to be extracted from the event. You can then insert these in the template in InputTemplate to produce the output you want to be sent to the target.  InputPathsMap is an array key-value pairs, where each value is a valid JSON path. You can have as many as 10 key-value pairs. You must use JSON dot notation, not bracket notation. The keys cannot start with "AWS." 
    */
  var InputPathsMap: js.UndefOr[TransformerPaths] = js.native
  
  /**
    * Input template where you specify placeholders that will be filled with the values of the keys from InputPathsMap to customize the data sent to the target. Enclose each InputPathsMaps value in brackets: &lt;value&gt; The InputTemplate must be valid JSON. If InputTemplate is a JSON object (surrounded by curly braces), the following restrictions apply:   The placeholder cannot be used as an object key.   Object values cannot include quote marks.   The following example shows the syntax for using InputPathsMap and InputTemplate.   "InputTransformer":   {   "InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},   "InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"   }  To have the InputTemplate include quote marks within a JSON string, escape each quote marks with a slash, as in the following example:   "InputTransformer":   {   "InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},   "InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""   } 
    */
  var InputTemplate: TransformerInput = js.native
}
object InputTransformer {
  
  @scala.inline
  def apply(InputTemplate: TransformerInput): InputTransformer = {
    val __obj = js.Dynamic.literal(InputTemplate = InputTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTransformer]
  }
  
  @scala.inline
  implicit class InputTransformerOps[Self <: InputTransformer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputTemplate(value: TransformerInput): Self = this.set("InputTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPathsMap(value: TransformerPaths): Self = this.set("InputPathsMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputPathsMap: Self = this.set("InputPathsMap", js.undefined)
  }
}
