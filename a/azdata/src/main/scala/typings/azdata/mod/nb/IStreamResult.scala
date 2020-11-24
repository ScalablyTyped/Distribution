package typings.azdata.mod.nb

import typings.azdata.azdataStrings.stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamResult
  extends ICellOutput
     with Output {
  
  /**
    * Stream output field defining the stream name, for example stdout
    */
  var name: StreamType = js.native
  
  @JSName("output_type")
  var output_type_IStreamResult: stream = js.native
  
  /**
    * Stream output field defining the multiline stream text
    */
  var text: MultilineString = js.native
}
object IStreamResult {
  
  @scala.inline
  def apply(name: StreamType, output_type: stream, text: MultilineString): IStreamResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamResult]
  }
  
  @scala.inline
  implicit class IStreamResultOps[Self <: IStreamResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: StreamType): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_type(value: stream): Self = this.set("output_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    
    @scala.inline
    def setText(value: MultilineString): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
