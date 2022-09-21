package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfigRequest extends StObject {
  
  /**
    * Set this value to true to enable private access for your cluster's Kubernetes API server endpoint. If you enable private access, Kubernetes API requests from within your cluster's VPC use the private VPC endpoint. The default value for this parameter is false, which disables private access for your Kubernetes API server. If you disable private access and you have nodes or Fargate pods in the cluster, then ensure that publicAccessCidrs includes the necessary CIDR blocks for communication with the nodes or Fargate pods. For more information, see Amazon EKS cluster endpoint access control in the  Amazon EKS User Guide .
    */
  var endpointPrivateAccess: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Set this value to false to disable public access to your cluster's Kubernetes API server endpoint. If you disable public access, your cluster's Kubernetes API server can only receive requests from within the cluster VPC. The default value for this parameter is true, which enables public access for your Kubernetes API server. For more information, see Amazon EKS cluster endpoint access control in the  Amazon EKS User Guide .
    */
  var endpointPublicAccess: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint. Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is 0.0.0.0/0. If you've disabled private endpoint access and you have nodes or Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks. For more information, see Amazon EKS cluster endpoint access control in the  Amazon EKS User Guide .
    */
  var publicAccessCidrs: js.UndefOr[StringList] = js.undefined
  
  /**
    * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to use that allow communication between your nodes and the Kubernetes control plane. If you don't specify any security groups, then familiarize yourself with the difference between Amazon EKS defaults for clusters deployed with Kubernetes:   1.14 Amazon EKS platform version eks.2 and earlier   1.14 Amazon EKS platform version eks.3 and later    For more information, see Amazon EKS security group considerations in the  Amazon EKS User Guide .
    */
  var securityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * Specify subnets for your Amazon EKS nodes. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your nodes and the Kubernetes control plane.
    */
  var subnetIds: js.UndefOr[StringList] = js.undefined
}
object VpcConfigRequest {
  
  inline def apply(): VpcConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConfigRequest]
  }
  
  extension [Self <: VpcConfigRequest](x: Self) {
    
    inline def setEndpointPrivateAccess(value: BoxedBoolean): Self = StObject.set(x, "endpointPrivateAccess", value.asInstanceOf[js.Any])
    
    inline def setEndpointPrivateAccessUndefined: Self = StObject.set(x, "endpointPrivateAccess", js.undefined)
    
    inline def setEndpointPublicAccess(value: BoxedBoolean): Self = StObject.set(x, "endpointPublicAccess", value.asInstanceOf[js.Any])
    
    inline def setEndpointPublicAccessUndefined: Self = StObject.set(x, "endpointPublicAccess", js.undefined)
    
    inline def setPublicAccessCidrs(value: StringList): Self = StObject.set(x, "publicAccessCidrs", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessCidrsUndefined: Self = StObject.set(x, "publicAccessCidrs", js.undefined)
    
    inline def setPublicAccessCidrsVarargs(value: String*): Self = StObject.set(x, "publicAccessCidrs", js.Array(value*))
    
    inline def setSecurityGroupIds(value: StringList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: StringList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value*))
  }
}
