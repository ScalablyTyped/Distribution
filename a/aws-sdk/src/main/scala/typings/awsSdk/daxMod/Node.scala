package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends StObject {
  
  /**
    * The Availability Zone (AZ) in which the node has been deployed.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect directly to a node endpoint, if desired (as an alternative to allowing DAX client software to intelligently route requests and responses to nodes in the DAX cluster.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.daxMod.Endpoint] = js.native
  
  /**
    * The date and time (in UNIX epoch format) when the node was launched.
    */
  var NodeCreateTime: js.UndefOr[TStamp] = js.native
  
  /**
    * A system-generated identifier for the node.
    */
  var NodeId: js.UndefOr[String] = js.native
  
  /**
    * The current status of the node. For example: available.
    */
  var NodeStatus: js.UndefOr[String] = js.native
  
  /**
    * The status of the parameter group associated with this node. For example, in-sync.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.native
}
object Node {
  
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setNodeCreateTime(value: TStamp): Self = StObject.set(x, "NodeCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeCreateTimeUndefined: Self = StObject.set(x, "NodeCreateTime", js.undefined)
    
    @scala.inline
    def setNodeId(value: String): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "NodeId", js.undefined)
    
    @scala.inline
    def setNodeStatus(value: String): Self = StObject.set(x, "NodeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeStatusUndefined: Self = StObject.set(x, "NodeStatus", js.undefined)
    
    @scala.inline
    def setParameterGroupStatus(value: String): Self = StObject.set(x, "ParameterGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupStatusUndefined: Self = StObject.set(x, "ParameterGroupStatus", js.undefined)
  }
}
