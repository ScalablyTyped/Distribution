package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMacieSessionRequest extends js.Object {
  /**
    * Specifies how often to publish findings for the account. This includes adding findings to AWS Security Hub and exporting finding events to Amazon CloudWatch.
    */
  var findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.native
  /**
    * Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie activities for the account; and, PAUSED, suspend all Macie activities for the account.
    */
  var status: js.UndefOr[MacieStatus] = js.native
}

object UpdateMacieSessionRequest {
  @scala.inline
  def apply(findingPublishingFrequency: FindingPublishingFrequency = null, status: MacieStatus = null): UpdateMacieSessionRequest = {
    val __obj = js.Dynamic.literal()
    if (findingPublishingFrequency != null) __obj.updateDynamic("findingPublishingFrequency")(findingPublishingFrequency.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMacieSessionRequest]
  }
}

