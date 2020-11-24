package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessorParameter extends js.Object {
  
  /**
    * The name of the parameter.
    */
  var ParameterName: ProcessorParameterName = js.native
  
  /**
    * The parameter value.
    */
  var ParameterValue: ProcessorParameterValue = js.native
}
object ProcessorParameter {
  
  @scala.inline
  def apply(ParameterName: ProcessorParameterName, ParameterValue: ProcessorParameterValue): ProcessorParameter = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorParameter]
  }
  
  @scala.inline
  implicit class ProcessorParameterOps[Self <: ProcessorParameter] (val x: Self) extends AnyVal {
    
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
    def setParameterName(value: ProcessorParameterName): Self = this.set("ParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValue(value: ProcessorParameterValue): Self = this.set("ParameterValue", value.asInstanceOf[js.Any])
  }
}
