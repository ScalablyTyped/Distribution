package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstanceGroupsOutput extends js.Object {
  /**
    * The list of instance groups for the cluster and given filters.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}

object ListInstanceGroupsOutput {
  @scala.inline
  def apply(): ListInstanceGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceGroupsOutput]
  }
  @scala.inline
  implicit class ListInstanceGroupsOutputOps[Self <: ListInstanceGroupsOutput] (val x: Self) extends AnyVal {
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
    def setInstanceGroupsVarargs(value: InstanceGroup*): Self = this.set("InstanceGroups", js.Array(value :_*))
    @scala.inline
    def setInstanceGroups(value: InstanceGroupList): Self = this.set("InstanceGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceGroups: Self = this.set("InstanceGroups", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

