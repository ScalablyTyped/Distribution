package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterValue extends js.Object {
  
  /**
    * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation
    uses the default value that is specified in your template.
    */
  var Name: string = js.native
  
  /**
    * The input value associated with the parameter.
    */
  var Value: string = js.native
}
object ParameterValue {
  
  @scala.inline
  def apply(Name: string, Value: string): ParameterValue = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterValue]
  }
  
  @scala.inline
  implicit class ParameterValueOps[Self <: ParameterValue] (val x: Self) extends AnyVal {
    
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
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: string): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
