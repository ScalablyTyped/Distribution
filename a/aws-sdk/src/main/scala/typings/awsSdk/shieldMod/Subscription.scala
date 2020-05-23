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
  def apply(
    AutoRenew: AutoRenew = null,
    EndTime: Timestamp = null,
    Limits: Limits = null,
    StartTime: Timestamp = null,
    TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  ): Subscription = {
    val __obj = js.Dynamic.literal()
    if (AutoRenew != null) __obj.updateDynamic("AutoRenew")(AutoRenew.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (!js.isUndefined(TimeCommitmentInSeconds)) __obj.updateDynamic("TimeCommitmentInSeconds")(TimeCommitmentInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
}

