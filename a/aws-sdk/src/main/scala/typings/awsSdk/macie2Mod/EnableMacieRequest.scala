package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableMacieRequest extends js.Object {
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[string] = js.native
  /**
    * Specifies how often to publish findings for the account. This includes adding findings to AWS Security Hub and exporting finding events to Amazon CloudWatch.
    */
  var findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.native
  /**
    * Specifies the status for the account. To enable Amazon Macie and start all Amazon Macie activities for the account, set this value to ENABLED.
    */
  var status: js.UndefOr[MacieStatus] = js.native
}

object EnableMacieRequest {
  @scala.inline
  def apply(
    clientToken: string = null,
    findingPublishingFrequency: FindingPublishingFrequency = null,
    status: MacieStatus = null
  ): EnableMacieRequest = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (findingPublishingFrequency != null) __obj.updateDynamic("findingPublishingFrequency")(findingPublishingFrequency.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableMacieRequest]
  }
}

