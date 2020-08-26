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
    * The Amazon Resource Name (ARN) of the service-linked role that allows Amazon Macie to monitor and analyze data in AWS resources for the account.
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
  def apply(): GetMacieSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMacieSessionResponse]
  }
  @scala.inline
  implicit class GetMacieSessionResponseOps[Self <: GetMacieSessionResponse] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: timestampIso8601): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = this.set("findingPublishingFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingPublishingFrequency: Self = this.set("findingPublishingFrequency", js.undefined)
    @scala.inline
    def setServiceRole(value: string): Self = this.set("serviceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRole: Self = this.set("serviceRole", js.undefined)
    @scala.inline
    def setStatus(value: MacieStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUpdatedAt(value: timestampIso8601): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
  }
  
}

