package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlacementGroupResult extends js.Object {
  var PlacementGroup: js.UndefOr[typings.awsSdk.ec2Mod.PlacementGroup] = js.native
}

object CreatePlacementGroupResult {
  @scala.inline
  def apply(PlacementGroup: PlacementGroup = null): CreatePlacementGroupResult = {
    val __obj = js.Dynamic.literal()
    if (PlacementGroup != null) __obj.updateDynamic("PlacementGroup")(PlacementGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlacementGroupResult]
  }
}

