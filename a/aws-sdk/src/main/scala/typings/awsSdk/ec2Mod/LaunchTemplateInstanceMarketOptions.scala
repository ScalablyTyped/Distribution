package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateInstanceMarketOptions extends js.Object {
  /**
    * The market type.
    */
  var MarketType: js.UndefOr[typings.awsSdk.ec2Mod.MarketType] = js.native
  /**
    * The options for Spot Instances.
    */
  var SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptions] = js.native
}

object LaunchTemplateInstanceMarketOptions {
  @scala.inline
  def apply(MarketType: MarketType = null, SpotOptions: LaunchTemplateSpotMarketOptions = null): LaunchTemplateInstanceMarketOptions = {
    val __obj = js.Dynamic.literal()
    if (MarketType != null) __obj.updateDynamic("MarketType")(MarketType.asInstanceOf[js.Any])
    if (SpotOptions != null) __obj.updateDynamic("SpotOptions")(SpotOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptions]
  }
}

