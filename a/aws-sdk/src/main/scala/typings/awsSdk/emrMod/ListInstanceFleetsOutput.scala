package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstanceFleetsOutput extends js.Object {
  /**
    * The list of instance fleets for the cluster and given filters.
    */
  var InstanceFleets: js.UndefOr[InstanceFleetList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}

object ListInstanceFleetsOutput {
  @scala.inline
  def apply(InstanceFleets: InstanceFleetList = null, Marker: Marker = null): ListInstanceFleetsOutput = {
    val __obj = js.Dynamic.literal()
    if (InstanceFleets != null) __obj.updateDynamic("InstanceFleets")(InstanceFleets.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceFleetsOutput]
  }
}

