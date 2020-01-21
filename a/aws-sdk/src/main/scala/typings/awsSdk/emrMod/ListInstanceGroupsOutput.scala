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
  def apply(InstanceGroups: InstanceGroupList = null, Marker: Marker = null): ListInstanceGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (InstanceGroups != null) __obj.updateDynamic("InstanceGroups")(InstanceGroups.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceGroupsOutput]
  }
}

