package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

