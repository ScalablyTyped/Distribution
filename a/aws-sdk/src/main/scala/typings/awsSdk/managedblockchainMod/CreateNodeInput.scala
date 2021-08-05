package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNodeInput extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
    */
  var ClientRequestToken: ClientRequestTokenString
  
  /**
    * The unique identifier of the member that owns this node.
    */
  var MemberId: ResourceIdString
  
  /**
    * The unique identifier of the network in which this node runs.
    */
  var NetworkId: ResourceIdString
  
  /**
    * The properties of a node configuration.
    */
  var NodeConfiguration: typings.awsSdk.managedblockchainMod.NodeConfiguration
}
object CreateNodeInput {
  
  inline def apply(
    ClientRequestToken: ClientRequestTokenString,
    MemberId: ResourceIdString,
    NetworkId: ResourceIdString,
    NodeConfiguration: NodeConfiguration
  ): CreateNodeInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], NodeConfiguration = NodeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodeInput]
  }
  
  extension [Self <: CreateNodeInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNodeConfiguration(value: NodeConfiguration): Self = StObject.set(x, "NodeConfiguration", value.asInstanceOf[js.Any])
  }
}
