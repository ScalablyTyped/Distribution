package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeConfiguration extends StObject {
  
  /**
    * The Availability Zone in which the node exists.
    */
  var AvailabilityZone: AvailabilityZoneString
  
  /**
    * The Amazon Managed Blockchain instance type for the node.
    */
  var InstanceType: InstanceTypeString
  
  /**
    * Configuration properties for logging events associated with a peer node owned by a member in a Managed Blockchain network. 
    */
  var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.undefined
  
  /**
    * The state database that the node uses. Values are LevelDB or CouchDB. When using an Amazon Managed Blockchain network with Hyperledger Fabric version 1.4 or later, the default is CouchDB.
    */
  var StateDB: js.UndefOr[StateDBType] = js.undefined
}
object NodeConfiguration {
  
  @scala.inline
  def apply(AvailabilityZone: AvailabilityZoneString, InstanceType: InstanceTypeString): NodeConfiguration = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfiguration]
  }
  
  @scala.inline
  implicit class NodeConfigurationMutableBuilder[Self <: NodeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: AvailabilityZoneString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: InstanceTypeString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPublishingConfiguration(value: NodeLogPublishingConfiguration): Self = StObject.set(x, "LogPublishingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPublishingConfigurationUndefined: Self = StObject.set(x, "LogPublishingConfiguration", js.undefined)
    
    @scala.inline
    def setStateDB(value: StateDBType): Self = StObject.set(x, "StateDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateDBUndefined: Self = StObject.set(x, "StateDB", js.undefined)
  }
}
