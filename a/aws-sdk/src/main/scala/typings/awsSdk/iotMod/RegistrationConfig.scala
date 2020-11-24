package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrationConfig extends js.Object {
  
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
  implicit class RegistrationConfigOps[Self <: RegistrationConfig] (val x: Self) extends AnyVal {
    
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
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateBody: Self = this.set("templateBody", js.undefined)
  }
}
