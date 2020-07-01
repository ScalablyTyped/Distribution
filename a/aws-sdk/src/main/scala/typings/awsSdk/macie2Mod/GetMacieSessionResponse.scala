package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMacieSessionResponse extends js.Object {
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the Amazon Macie account was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.native
  /**
    * The frequency with which Amazon Macie publishes updates to policy findings for the account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
    */
  var findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service-level role that allows Amazon Macie to monitor and analyze data in AWS resources for the account.
    */
  var serviceRole: js.UndefOr[string] = js.native
  /**
    * The current status of the Amazon Macie account. Possible values are: PAUSED, the account is enabled but all Amazon Macie activities are suspended (paused) for the account; and, ENABLED, the account is enabled and all Amazon Macie activities are enabled for the account.
    */
  var status: js.UndefOr[MacieStatus] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the Amazon Macie account.
    */
  var updatedAt: js.UndefOr[timestampIso8601] = js.native
}

object GetMacieSessionResponse {
  @scala.inline
  def apply(
    createdAt: timestampIso8601 = null,
    findingPublishingFrequency: FindingPublishingFrequency = null,
    serviceRole: string = null,
    status: MacieStatus = null,
    updatedAt: timestampIso8601 = null
  ): GetMacieSessionResponse = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (findingPublishingFrequency != null) __obj.updateDynamic("findingPublishingFrequency")(findingPublishingFrequency.asInstanceOf[js.Any])
    if (serviceRole != null) __obj.updateDynamic("serviceRole")(serviceRole.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMacieSessionResponse]
  }
}

