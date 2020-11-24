package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVariableRequest extends js.Object {
  
  /**
    * The new default value of the variable.
    */
  var defaultValue: js.UndefOr[String] = js.native
  
  /**
    * The new description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The name of the variable.
    */
  var name: String = js.native
  
  /**
    * The variable type. For more information see Variable types.
    */
  var variableType: js.UndefOr[String] = js.native
}
object UpdateVariableRequest {
  
  @scala.inline
  def apply(name: String): UpdateVariableRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVariableRequest]
  }
  
  @scala.inline
  implicit class UpdateVariableRequestOps[Self <: UpdateVariableRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setVariableType(value: String): Self = this.set("variableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableType: Self = this.set("variableType", js.undefined)
  }
}
