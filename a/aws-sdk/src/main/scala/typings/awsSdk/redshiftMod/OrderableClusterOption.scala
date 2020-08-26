package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableClusterOption extends js.Object {
  /**
    * A list of availability zones for the orderable cluster.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * The cluster type, for example multi-node. 
    */
  var ClusterType: js.UndefOr[String] = js.native
  /**
    * The version of the orderable cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * The node type for the orderable cluster.
    */
  var NodeType: js.UndefOr[String] = js.native
}

object OrderableClusterOption {
  @scala.inline
  def apply(): OrderableClusterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableClusterOption]
  }
  @scala.inline
  implicit class OrderableClusterOptionOps[Self <: OrderableClusterOption] (val x: Self) extends AnyVal {
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
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setClusterType(value: String): Self = this.set("ClusterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterType: Self = this.set("ClusterType", js.undefined)
    @scala.inline
    def setClusterVersion(value: String): Self = this.set("ClusterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterVersion: Self = this.set("ClusterVersion", js.undefined)
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
  }
  
}

