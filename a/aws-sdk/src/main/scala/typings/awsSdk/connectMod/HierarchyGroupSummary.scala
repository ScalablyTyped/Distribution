package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchyGroupSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the hierarchy group.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the hierarchy group.
    */
  var Id: js.UndefOr[HierarchyGroupId] = js.native
  /**
    * The name of the hierarchy group.
    */
  var Name: js.UndefOr[HierarchyGroupName] = js.native
}

object HierarchyGroupSummary {
  @scala.inline
  def apply(): HierarchyGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyGroupSummary]
  }
  @scala.inline
  implicit class HierarchyGroupSummaryOps[Self <: HierarchyGroupSummary] (val x: Self) extends AnyVal {
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
    def setArn(value: ARN): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setId(value: HierarchyGroupId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: HierarchyGroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

