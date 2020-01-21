package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSpotDatafeedSubscriptionResult extends js.Object {
  /**
    * The Spot Instance data feed subscription.
    */
  var SpotDatafeedSubscription: js.UndefOr[typings.awsSdk.ec2Mod.SpotDatafeedSubscription] = js.native
}

object CreateSpotDatafeedSubscriptionResult {
  @scala.inline
  def apply(SpotDatafeedSubscription: SpotDatafeedSubscription = null): CreateSpotDatafeedSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (SpotDatafeedSubscription != null) __obj.updateDynamic("SpotDatafeedSubscription")(SpotDatafeedSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSpotDatafeedSubscriptionResult]
  }
}

