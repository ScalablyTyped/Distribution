package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointAccessMessage extends StObject {
  
  /**
    * The cluster identifier of the cluster to access.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The Redshift-managed VPC endpoint name. An endpoint name must contain 1-30 characters. Valid characters are A-Z, a-z, 0-9, and hyphen(-). The first character must be a letter. The name can't contain two consecutive hyphens or end with a hyphen.
    */
  var EndpointName: String
  
  /**
    * The Amazon Web Services account ID of the owner of the cluster. This is only required if the cluster is in another Amazon Web Services account.
    */
  var ResourceOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The subnet group from which Amazon Redshift chooses the subnet to deploy the endpoint.
    */
  var SubnetGroupName: String
  
  /**
    * The security group that defines the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}
object CreateEndpointAccessMessage {
  
  inline def apply(EndpointName: String, SubnetGroupName: String): CreateEndpointAccessMessage = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any], SubnetGroupName = SubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointAccessMessage]
  }
  
  extension [Self <: CreateEndpointAccessMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setEndpointName(value: String): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setResourceOwner(value: String): Self = StObject.set(x, "ResourceOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerUndefined: Self = StObject.set(x, "ResourceOwner", js.undefined)
    
    inline def setSubnetGroupName(value: String): Self = StObject.set(x, "SubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIds(value: VpcSecurityGroupIdList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value*))
  }
}
