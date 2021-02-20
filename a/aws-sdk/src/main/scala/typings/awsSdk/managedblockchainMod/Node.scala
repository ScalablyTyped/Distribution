package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends StObject {
  
  /**
    * The Availability Zone in which the node exists.
    */
  var AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.native
  
  /**
    * The date and time that the node was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * Attributes of the blockchain framework being used.
    */
  var FrameworkAttributes: js.UndefOr[NodeFrameworkAttributes] = js.native
  
  /**
    * The unique identifier of the node.
    */
  var Id: js.UndefOr[ResourceIdString] = js.native
  
  /**
    * The instance type of the node.
    */
  var InstanceType: js.UndefOr[InstanceTypeString] = js.native
  
  /**
    * Configuration properties for logging events associated with a peer node owned by a member in a Managed Blockchain network.
    */
  var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.native
  
  /**
    * The unique identifier of the member to which the node belongs.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.native
  
  /**
    * The unique identifier of the network that the node is in.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.native
  
  /**
    * The state database that the node uses. Values are LevelDB or CouchDB.
    */
  var StateDB: js.UndefOr[StateDBType] = js.native
  
  /**
    * The status of the node.
    */
  var Status: js.UndefOr[NodeStatus] = js.native
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
    def setAvailabilityZone(value: AvailabilityZoneString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setFrameworkAttributes(value: NodeFrameworkAttributes): Self = StObject.set(x, "FrameworkAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkAttributesUndefined: Self = StObject.set(x, "FrameworkAttributes", js.undefined)
    
    @scala.inline
    def setId(value: ResourceIdString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceTypeString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setLogPublishingConfiguration(value: NodeLogPublishingConfiguration): Self = StObject.set(x, "LogPublishingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPublishingConfigurationUndefined: Self = StObject.set(x, "LogPublishingConfiguration", js.undefined)
    
    @scala.inline
    def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIdUndefined: Self = StObject.set(x, "NetworkId", js.undefined)
    
    @scala.inline
    def setStateDB(value: StateDBType): Self = StObject.set(x, "StateDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateDBUndefined: Self = StObject.set(x, "StateDB", js.undefined)
    
    @scala.inline
    def setStatus(value: NodeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
