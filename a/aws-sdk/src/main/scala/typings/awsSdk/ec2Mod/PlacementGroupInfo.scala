package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementGroupInfo extends js.Object {
  /**
    * A list of supported placement groups types.
    */
  var SupportedStrategies: js.UndefOr[PlacementGroupStrategyList] = js.native
}

object PlacementGroupInfo {
  @scala.inline
  def apply(SupportedStrategies: PlacementGroupStrategyList = null): PlacementGroupInfo = {
    val __obj = js.Dynamic.literal()
    if (SupportedStrategies != null) __obj.updateDynamic("SupportedStrategies")(SupportedStrategies.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroupInfo]
  }
}

