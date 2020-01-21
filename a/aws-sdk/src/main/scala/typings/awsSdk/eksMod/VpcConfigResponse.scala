package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    clusterSecurityGroupId: String = null,
    endpointPrivateAccess: js.UndefOr[scala.Boolean] = js.undefined,
    endpointPublicAccess: js.UndefOr[scala.Boolean] = js.undefined,
    publicAccessCidrs: StringList = null,
    securityGroupIds: StringList = null,
    subnetIds: StringList = null,
    vpcId: String = null
  ): VpcConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (clusterSecurityGroupId != null) __obj.updateDynamic("clusterSecurityGroupId")(clusterSecurityGroupId.asInstanceOf[js.Any])
    if (!js.isUndefined(endpointPrivateAccess)) __obj.updateDynamic("endpointPrivateAccess")(endpointPrivateAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(endpointPublicAccess)) __obj.updateDynamic("endpointPublicAccess")(endpointPublicAccess.asInstanceOf[js.Any])
    if (publicAccessCidrs != null) __obj.updateDynamic("publicAccessCidrs")(publicAccessCidrs.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfigResponse]
  }
}

