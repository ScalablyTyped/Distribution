package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncreaseReplicationFactorRequest extends js.Object {
  /**
    * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * The name of the DAX cluster that will receive additional nodes.
    */
  var ClusterName: String = js.native
  /**
    * The new number of nodes for the DAX cluster.
    */
  var NewReplicationFactor: Integer = js.native
}

object IncreaseReplicationFactorRequest {
  @scala.inline
  def apply(ClusterName: String, NewReplicationFactor: Integer, AvailabilityZones: AvailabilityZoneList = null): IncreaseReplicationFactorRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], NewReplicationFactor = NewReplicationFactor.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseReplicationFactorRequest]
  }
}

