package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfigRequest extends js.Object {
  /**
    * Set this value to true to enable private access for your cluster's Kubernetes API server endpoint. If you enable private access, Kubernetes API requests from within your cluster's VPC use the private VPC endpoint. The default value for this parameter is false, which disables private access for your Kubernetes API server. If you disable private access and you have worker nodes or AWS Fargate pods in the cluster, then ensure that publicAccessCidrs includes the necessary CIDR blocks for communication with the worker nodes or Fargate pods. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .
    */
  var endpointPrivateAccess: js.UndefOr[BoxedBoolean] = js.native
  /**
    * Set this value to false to disable public access to your cluster's Kubernetes API server endpoint. If you disable public access, your cluster's Kubernetes API server can only receive requests from within the cluster VPC. The default value for this parameter is true, which enables public access for your Kubernetes API server. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .
    */
  var endpointPublicAccess: js.UndefOr[BoxedBoolean] = js.native
  /**
    * The CIDR blocks that are allowed access to your cluster's public Kubernetes API server endpoint. Communication to the endpoint from addresses outside of the CIDR blocks that you specify is denied. The default value is 0.0.0.0/0. If you've disabled private endpoint access and you have worker nodes or AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .
    */
  var publicAccessCidrs: js.UndefOr[StringList] = js.native
  /**
    * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you don't specify a security group, the default security group for your VPC is used.
    */
  var securityGroupIds: js.UndefOr[StringList] = js.native
  /**
    * Specify subnets for your Amazon EKS worker nodes. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var subnetIds: js.UndefOr[StringList] = js.native
}

object VpcConfigRequest {
  @scala.inline
  def apply(): VpcConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConfigRequest]
  }
  @scala.inline
  implicit class VpcConfigRequestOps[Self <: VpcConfigRequest] (val x: Self) extends AnyVal {
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
    def setEndpointPrivateAccess(value: BoxedBoolean): Self = this.set("endpointPrivateAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointPrivateAccess: Self = this.set("endpointPrivateAccess", js.undefined)
    @scala.inline
    def setEndpointPublicAccess(value: BoxedBoolean): Self = this.set("endpointPublicAccess", value.asInstanceOf[js.Any])
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
  }
  
}

