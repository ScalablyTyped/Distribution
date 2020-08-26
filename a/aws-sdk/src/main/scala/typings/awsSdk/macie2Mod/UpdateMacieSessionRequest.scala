package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMacieSessionRequest extends js.Object {
  /**
    * Specifies how often to publish updates to policy findings for the account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events).
    */
  var findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.native
  /**
    * Specifies whether to change the status of the account. Valid values are: ENABLED, resume all Amazon Macie activities for the account; and, PAUSED, suspend all Macie activities for the account.
    */
  var status: js.UndefOr[MacieStatus] = js.native
}

object UpdateMacieSessionRequest {
  @scala.inline
  def apply(): UpdateMacieSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMacieSessionRequest]
  }
  @scala.inline
  implicit class UpdateMacieSessionRequestOps[Self <: UpdateMacieSessionRequest] (val x: Self) extends AnyVal {
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
    def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = this.set("findingPublishingFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingPublishingFrequency: Self = this.set("findingPublishingFrequency", js.undefined)
    @scala.inline
    def setStatus(value: MacieStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

