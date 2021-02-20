package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOrganizationConfigurationRequest extends StObject {
  
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
  implicit class UpdateOrganizationConfigurationRequestMutableBuilder[Self <: UpdateOrganizationConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoEnable(value: boolean): Self = StObject.set(x, "autoEnable", value.asInstanceOf[js.Any])
  }
}
