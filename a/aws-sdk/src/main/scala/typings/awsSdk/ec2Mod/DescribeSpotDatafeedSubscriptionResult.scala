package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSpotDatafeedSubscriptionResult extends js.Object {
  /**
    * The Spot Instance data feed subscription.
    */
  var SpotDatafeedSubscription: js.UndefOr[typings.awsSdk.ec2Mod.SpotDatafeedSubscription] = js.native
}

object DescribeSpotDatafeedSubscriptionResult {
  @scala.inline
  def apply(SpotDatafeedSubscription: SpotDatafeedSubscription = null): DescribeSpotDatafeedSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (SpotDatafeedSubscription != null) __obj.updateDynamic("SpotDatafeedSubscription")(SpotDatafeedSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSpotDatafeedSubscriptionResult]
  }
}

