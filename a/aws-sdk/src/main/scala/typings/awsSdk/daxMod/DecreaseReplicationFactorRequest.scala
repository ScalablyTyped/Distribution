package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecreaseReplicationFactorRequest extends js.Object {
  
  /**
    * The Availability Zone(s) from which to remove nodes.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  
  /**
    * The name of the DAX cluster from which you want to remove nodes.
    */
  var ClusterName: String = js.native
  
  /**
    * The new number of nodes for the DAX cluster.
    */
  var NewReplicationFactor: Integer = js.native
  
  /**
    * The unique identifiers of the nodes to be removed from the cluster.
    */
  var NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.native
}
object DecreaseReplicationFactorRequest {
  
  @scala.inline
  def apply(ClusterName: String, NewReplicationFactor: Integer): DecreaseReplicationFactorRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], NewReplicationFactor = NewReplicationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseReplicationFactorRequest]
  }
  
  @scala.inline
  implicit class DecreaseReplicationFactorRequestOps[Self <: DecreaseReplicationFactorRequest] (val x: Self) extends AnyVal {
    
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
    def setClusterName(value: String): Self = this.set("ClusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewReplicationFactor(value: Integer): Self = this.set("NewReplicationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    
    @scala.inline
    def setNodeIdsToRemoveVarargs(value: String*): Self = this.set("NodeIdsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setNodeIdsToRemove(value: NodeIdentifierList): Self = this.set("NodeIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeIdsToRemove: Self = this.set("NodeIdsToRemove", js.undefined)
  }
}
