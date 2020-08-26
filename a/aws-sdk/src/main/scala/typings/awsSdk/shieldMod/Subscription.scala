package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  /**
    * If ENABLED, the subscription will be automatically renewed at the end of the existing subscription period. When you initally create a subscription, AutoRenew is set to ENABLED. You can change this by submitting an UpdateSubscription request. If the UpdateSubscription request does not included a value for AutoRenew, the existing value for AutoRenew remains unchanged.
    */
  var AutoRenew: js.UndefOr[typings.awsSdk.shieldMod.AutoRenew] = js.native
  /**
    * The date and time your subscription will end.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * Specifies how many protections of a given type you can create.
    */
  var Limits: js.UndefOr[typings.awsSdk.shieldMod.Limits] = js.native
  /**
    * If ENABLED, the DDoS Response Team (DRT) will use email and phone to notify contacts about escalations to the DRT and to initiate proactive customer support. If PENDING, you have requested proactive engagement and the request is pending. The status changes to ENABLED when your request is fully processed. If DISABLED, the DRT will not proactively notify contacts about escalations or to initiate proactive customer support. 
    */
  var ProactiveEngagementStatus: js.UndefOr[typings.awsSdk.shieldMod.ProactiveEngagementStatus] = js.native
  /**
    * The start time of the subscription, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  /**
    * The length, in seconds, of the AWS Shield Advanced subscription for the account.
    */
  var TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds] = js.native
}

object Subscription {
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoRenew(value: AutoRenew): Self = this.set("AutoRenew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRenew: Self = this.set("AutoRenew", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setLimitsVarargs(value: Limit*): Self = this.set("Limits", js.Array(value :_*))
    @scala.inline
    def setLimits(value: Limits): Self = this.set("Limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("Limits", js.undefined)
    @scala.inline
    def setProactiveEngagementStatus(value: ProactiveEngagementStatus): Self = this.set("ProactiveEngagementStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProactiveEngagementStatus: Self = this.set("ProactiveEngagementStatus", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setTimeCommitmentInSeconds(value: DurationInSeconds): Self = this.set("TimeCommitmentInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeCommitmentInSeconds: Self = this.set("TimeCommitmentInSeconds", js.undefined)
  }
  
}

