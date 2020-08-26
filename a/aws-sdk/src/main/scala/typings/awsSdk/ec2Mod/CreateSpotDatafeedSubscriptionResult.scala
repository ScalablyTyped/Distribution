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
  def apply(): CreateSpotDatafeedSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSpotDatafeedSubscriptionResult]
  }
  @scala.inline
  implicit class CreateSpotDatafeedSubscriptionResultOps[Self <: CreateSpotDatafeedSubscriptionResult] (val x: Self) extends AnyVal {
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
    def setSpotDatafeedSubscription(value: SpotDatafeedSubscription): Self = this.set("SpotDatafeedSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotDatafeedSubscription: Self = this.set("SpotDatafeedSubscription", js.undefined)
  }
  
}

