package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonTokenTypeConfiguration extends js.Object {
  
  /**
    * The group attribute field.
    */
  var GroupAttributeField: String = js.native
  
  /**
    * The user name attribute field.
    */
  var UserNameAttributeField: String = js.native
}
object JsonTokenTypeConfiguration {
  
  @scala.inline
  def apply(GroupAttributeField: String, UserNameAttributeField: String): JsonTokenTypeConfiguration = {
    val __obj = js.Dynamic.literal(GroupAttributeField = GroupAttributeField.asInstanceOf[js.Any], UserNameAttributeField = UserNameAttributeField.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonTokenTypeConfiguration]
  }
  
  @scala.inline
  implicit class JsonTokenTypeConfigurationOps[Self <: JsonTokenTypeConfiguration] (val x: Self) extends AnyVal {
    
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
    def setGroupAttributeField(value: String): Self = this.set("GroupAttributeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameAttributeField(value: String): Self = this.set("UserNameAttributeField", value.asInstanceOf[js.Any])
  }
}
