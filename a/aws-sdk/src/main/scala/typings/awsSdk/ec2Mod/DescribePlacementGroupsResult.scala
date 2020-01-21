package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePlacementGroupsResult extends js.Object {
  /**
    * Information about the placement groups.
    */
  var PlacementGroups: js.UndefOr[PlacementGroupList] = js.native
}

object DescribePlacementGroupsResult {
  @scala.inline
  def apply(PlacementGroups: PlacementGroupList = null): DescribePlacementGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (PlacementGroups != null) __obj.updateDynamic("PlacementGroups")(PlacementGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePlacementGroupsResult]
  }
}

