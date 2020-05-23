package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConfigurationResponse extends js.Object {
  /**
    * Specifies whether Amazon Macie is enabled automatically for accounts that are added to the AWS organization.
    */
  var autoEnable: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether the maximum number of Amazon Macie member accounts are already associated with the AWS organization.
    */
  var maxAccountLimitReached: js.UndefOr[boolean] = js.native
}

object DescribeOrganizationConfigurationResponse {
  @scala.inline
  def apply(
    autoEnable: js.UndefOr[boolean] = js.undefined,
    maxAccountLimitReached: js.UndefOr[boolean] = js.undefined
  ): DescribeOrganizationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoEnable)) __obj.updateDynamic("autoEnable")(autoEnable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAccountLimitReached)) __obj.updateDynamic("maxAccountLimitReached")(maxAccountLimitReached.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
  }
}

