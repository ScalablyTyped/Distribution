package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOrganizationConfigurationRequest extends js.Object {
  
  /**
    * Specifies whether Amazon Macie is enabled automatically for each account, when the account is added to the AWS organization.
    */
  var autoEnable: boolean = js.native
}
object UpdateOrganizationConfigurationRequest {
  
  @scala.inline
  def apply(autoEnable: boolean): UpdateOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(autoEnable = autoEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateOrganizationConfigurationRequestOps[Self <: UpdateOrganizationConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setAutoEnable(value: boolean): Self = this.set("autoEnable", value.asInstanceOf[js.Any])
  }
}
