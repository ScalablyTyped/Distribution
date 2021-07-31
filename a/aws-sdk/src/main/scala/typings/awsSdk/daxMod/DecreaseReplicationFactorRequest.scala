package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecreaseReplicationFactorRequest extends StObject {
  
  /**
    * The Availability Zone(s) from which to remove nodes.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  
  /**
    * The name of the DAX cluster from which you want to remove nodes.
    */
  var ClusterName: String
  
  /**
    * The new number of nodes for the DAX cluster.
    */
  var NewReplicationFactor: Integer
  
  /**
    * The unique identifiers of the nodes to be removed from the cluster.
    */
  var NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.undefined
}
object DecreaseReplicationFactorRequest {
  
  @scala.inline
  def apply(ClusterName: String, NewReplicationFactor: Integer): DecreaseReplicationFactorRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], NewReplicationFactor = NewReplicationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseReplicationFactorRequest]
  }
  
  @scala.inline
  implicit class DecreaseReplicationFactorRequestMutableBuilder[Self <: DecreaseReplicationFactorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewReplicationFactor(value: Integer): Self = StObject.set(x, "NewReplicationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdsToRemove(value: NodeIdentifierList): Self = StObject.set(x, "NodeIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdsToRemoveUndefined: Self = StObject.set(x, "NodeIdsToRemove", js.undefined)
    
    @scala.inline
    def setNodeIdsToRemoveVarargs(value: String*): Self = StObject.set(x, "NodeIdsToRemove", js.Array(value :_*))
  }
}
