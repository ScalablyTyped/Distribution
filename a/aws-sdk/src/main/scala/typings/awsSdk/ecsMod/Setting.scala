package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Setting extends StObject {
  
  /**
    * The Amazon ECS resource name.
    */
  var name: js.UndefOr[SettingName] = js.native
  
  /**
    * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the authenticated user is assumed.
    */
  var principalArn: js.UndefOr[String] = js.native
  
  /**
    * Whether the account setting is enabled or disabled for the specified resource.
    */
  var value: js.UndefOr[String] = js.native
}
object Setting {
  
  @scala.inline
  def apply(): Setting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Setting]
  }
  
  @scala.inline
  implicit class SettingMutableBuilder[Self <: Setting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SettingName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrincipalArn(value: String): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalArnUndefined: Self = StObject.set(x, "principalArn", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
