package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrationConfig extends StObject {
  
  /**
    * The ARN of the role.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * The template body.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.native
}
object RegistrationConfig {
  
  @scala.inline
  def apply(): RegistrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationConfig]
  }
  
  @scala.inline
  implicit class RegistrationConfigMutableBuilder[Self <: RegistrationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
  }
}
