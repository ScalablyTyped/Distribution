package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstancesOutput extends js.Object {
  /**
    * The list of instances for the cluster and given filters.
    */
  var Instances: js.UndefOr[InstanceList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}

object ListInstancesOutput {
  @scala.inline
  def apply(Instances: InstanceList = null, Marker: Marker = null): ListInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstancesOutput]
  }
}

