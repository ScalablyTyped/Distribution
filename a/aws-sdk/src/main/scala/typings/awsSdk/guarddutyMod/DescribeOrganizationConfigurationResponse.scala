package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConfigurationResponse extends js.Object {
  /**
    * Indicates whether GuardDuty is automatically enabled for accounts added to the organization.
    */
  var AutoEnable: Boolean = js.native
  /**
    * Indicates whether the maximum number of allowed member accounts are already associated with the delegated administrator master account.
    */
  var MemberAccountLimitReached: Boolean = js.native
}

object DescribeOrganizationConfigurationResponse {
  @scala.inline
  def apply(AutoEnable: Boolean, MemberAccountLimitReached: Boolean): DescribeOrganizationConfigurationResponse = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any], MemberAccountLimitReached = MemberAccountLimitReached.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
  }
}

