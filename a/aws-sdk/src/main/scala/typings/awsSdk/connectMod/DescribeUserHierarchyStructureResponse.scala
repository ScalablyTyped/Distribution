package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserHierarchyStructureResponse extends js.Object {
  /**
    * Information about the hierarchy structure.
    */
  var HierarchyStructure: js.UndefOr[typings.awsSdk.connectMod.HierarchyStructure] = js.native
}

object DescribeUserHierarchyStructureResponse {
  @scala.inline
  def apply(HierarchyStructure: HierarchyStructure = null): DescribeUserHierarchyStructureResponse = {
    val __obj = js.Dynamic.literal()
    if (HierarchyStructure != null) __obj.updateDynamic("HierarchyStructure")(HierarchyStructure.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserHierarchyStructureResponse]
  }
}

