package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableSecurityHubRequest extends js.Object {
  /**
    * Whether to enable the security standards that Security Hub has designated as automatically enabled. If you do not provide a value for EnableDefaultStandards, it is set to true. To not enable the automatically enabled standards, set EnableDefaultStandards to false.
    */
  var EnableDefaultStandards: js.UndefOr[Boolean] = js.native
  /**
    * The tags to add to the hub resource when you enable Security Hub.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object EnableSecurityHubRequest {
  @scala.inline
  def apply(EnableDefaultStandards: js.UndefOr[Boolean] = js.undefined, Tags: TagMap = null): EnableSecurityHubRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnableDefaultStandards)) __obj.updateDynamic("EnableDefaultStandards")(EnableDefaultStandards.get.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableSecurityHubRequest]
  }
}

