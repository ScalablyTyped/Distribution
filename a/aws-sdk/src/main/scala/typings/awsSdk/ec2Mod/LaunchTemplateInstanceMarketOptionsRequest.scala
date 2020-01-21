package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateInstanceMarketOptionsRequest extends js.Object {
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[typings.awsSdk.ec2Mod.MarketType] = js.native
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptionsRequest] = js.native
}

object LaunchTemplateInstanceMarketOptionsRequest {
  @scala.inline
  def apply(MarketType: MarketType = null, SpotOptions: LaunchTemplateSpotMarketOptionsRequest = null): LaunchTemplateInstanceMarketOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (MarketType != null) __obj.updateDynamic("MarketType")(MarketType.asInstanceOf[js.Any])
    if (SpotOptions != null) __obj.updateDynamic("SpotOptions")(SpotOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptionsRequest]
  }
}

