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
  def apply(): DescribeUserHierarchyStructureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserHierarchyStructureResponse]
  }
  @scala.inline
  implicit class DescribeUserHierarchyStructureResponseOps[Self <: DescribeUserHierarchyStructureResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHierarchyStructure(value: HierarchyStructure): Self = this.set("HierarchyStructure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHierarchyStructure: Self = this.set("HierarchyStructure", js.undefined)
  }
  
}

