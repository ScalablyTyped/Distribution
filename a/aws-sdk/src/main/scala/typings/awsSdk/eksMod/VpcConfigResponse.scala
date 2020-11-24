package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcConfigResponse extends js.Object {
  
  /**
    * The cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
    */
  var clusterSecurityGroupId: js.UndefOr[String] = js.native
  
  /**
    * This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS private API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's VPC use the private VPC endpoint instead of traversing the internet. If this value is disabled and you have worker nodes or AWS Fargate pods in the cluster, then ensure that publicAccessCidrs includes the necessary CIDR blocks for communication with the worker nodes or Fargate pods. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .
    */
  var endpointPrivateAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS public API server endpoint is disabled, your cluster's Kubernetes API server can only receive requests that originate from within the cluster VPC.
    */
  var endpointPublicAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint. Communication to the endpoint from addresses outside of the listed CIDR blocks is denied. The default value is 0.0.0.0/0. If you've disabled private endpoint access and you have worker nodes or AWS Fargate pods in the cluster, then ensure that the necessary CIDR blocks are listed. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .
    */
  var publicAccessCidrs: js.UndefOr[StringList] = js.native
  
  /**
    * The security groups associated with the cross-account elastic network interfaces that are used to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var securityGroupIds: js.UndefOr[StringList] = js.native
  
  /**
    * The subnets associated with your cluster.
    */
  var subnetIds: js.UndefOr[StringList] = js.native
  
  /**
    * The VPC associated with your cluster.
    */
  var vpcId: js.UndefOr[String] = js.native
}
object VpcConfigResponse {
  
  @scala.inline
  def apply(): VpcConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConfigResponse]
  }
  
  @scala.inline
  implicit class VpcConfigResponseOps[Self <: VpcConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setClusterSecurityGroupId(value: String): Self = this.set("clusterSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSecurityGroupId: Self = this.set("clusterSecurityGroupId", js.undefined)
    
    @scala.inline
    def setEndpointPrivateAccess(value: Boolean): Self = this.set("endpointPrivateAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointPrivateAccess: Self = this.set("endpointPrivateAccess", js.undefined)
    
    @scala.inline
    def setEndpointPublicAccess(value: Boolean): Self = this.set("endpointPublicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointPublicAccess: Self = this.set("endpointPublicAccess", js.undefined)
    
    @scala.inline
    def setPublicAccessCidrsVarargs(value: String*): Self = this.set("publicAccessCidrs", js.Array(value :_*))
    
    @scala.inline
    def setPublicAccessCidrs(value: StringList): Self = this.set("publicAccessCidrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicAccessCidrs: Self = this.set("publicAccessCidrs", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: StringList): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: StringList): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
