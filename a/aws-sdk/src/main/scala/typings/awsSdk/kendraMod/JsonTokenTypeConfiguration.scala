package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonTokenTypeConfiguration extends StObject {
  
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
  implicit class JsonTokenTypeConfigurationMutableBuilder[Self <: JsonTokenTypeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupAttributeField(value: String): Self = StObject.set(x, "GroupAttributeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameAttributeField(value: String): Self = StObject.set(x, "UserNameAttributeField", value.asInstanceOf[js.Any])
  }
}
