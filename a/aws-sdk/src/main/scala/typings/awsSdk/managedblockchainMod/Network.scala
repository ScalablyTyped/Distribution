package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Network extends StObject {
  
  /**
    * The date and time that the network was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Attributes of the blockchain framework for the network.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The blockchain framework that the network uses.
    */
  var Framework: js.UndefOr[typings.awsSdk.managedblockchainMod.Framework] = js.undefined
  
  /**
    * Attributes of the blockchain framework that the network uses.
    */
  var FrameworkAttributes: js.UndefOr[NetworkFrameworkAttributes] = js.undefined
  
  /**
    * The version of the blockchain framework that the network uses.
    */
  var FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.undefined
  
  /**
    * The unique identifier of the network.
    */
  var Id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The name of the network.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * The current status of the network.
    */
  var Status: js.UndefOr[NetworkStatus] = js.undefined
  
  /**
    * The voting rules for the network to decide if a proposal is accepted.
    */
  var VotingPolicy: js.UndefOr[typings.awsSdk.managedblockchainMod.VotingPolicy] = js.undefined
  
  /**
    * The VPC endpoint service name of the VPC endpoint service of the network. Members use the VPC endpoint service name to create a VPC endpoint to access network resources.
    */
  var VpcEndpointServiceName: js.UndefOr[String] = js.undefined
}
object Network {
  
  inline def apply(): Network = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Network]
  }
  
  extension [Self <: Network](x: Self) {
    
    inline def setCreationDate(value: Timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFramework(value: Framework): Self = StObject.set(x, "Framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkAttributes(value: NetworkFrameworkAttributes): Self = StObject.set(x, "FrameworkAttributes", value.asInstanceOf[js.Any])
    
    inline def setFrameworkAttributesUndefined: Self = StObject.set(x, "FrameworkAttributes", js.undefined)
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "Framework", js.undefined)
    
    inline def setFrameworkVersion(value: FrameworkVersionString): Self = StObject.set(x, "FrameworkVersion", value.asInstanceOf[js.Any])
    
    inline def setFrameworkVersionUndefined: Self = StObject.set(x, "FrameworkVersion", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: NetworkStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVotingPolicy(value: VotingPolicy): Self = StObject.set(x, "VotingPolicy", value.asInstanceOf[js.Any])
    
    inline def setVotingPolicyUndefined: Self = StObject.set(x, "VotingPolicy", js.undefined)
    
    inline def setVpcEndpointServiceName(value: String): Self = StObject.set(x, "VpcEndpointServiceName", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointServiceNameUndefined: Self = StObject.set(x, "VpcEndpointServiceName", js.undefined)
  }
}
