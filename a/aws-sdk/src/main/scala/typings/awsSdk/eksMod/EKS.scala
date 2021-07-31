package typings.awsSdk.eksMod

import typings.awsSdk.anon.DescribeClusterRequestwai
import typings.awsSdk.anon.DescribeNodegroupRequestw
import typings.awsSdk.awsSdkStrings.clusterActive
import typings.awsSdk.awsSdkStrings.clusterDeleted
import typings.awsSdk.awsSdkStrings.nodegroupActive
import typings.awsSdk.awsSdkStrings.nodegroupDeleted
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EKS extends Service {
  
  @JSName("config")
  var config_EKS: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, such as etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Each Amazon EKS cluster control plane is single-tenant and unique and runs on its own set of Amazon EC2 instances. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. You can use the endpointPublicAccess and endpointPrivateAccess parameters to enable or disable public and private access to your cluster's Kubernetes API server endpoint. By default, public access is enabled, and private access is disabled. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .  You can use the logging parameter to enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing.  Cluster creation typically takes between 10 and 15 minutes. After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodes in the Amazon EKS User Guide.
    */
  def createCluster(): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]): Request[CreateClusterResponse, AWSError] = js.native
  /**
    * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, such as etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Each Amazon EKS cluster control plane is single-tenant and unique and runs on its own set of Amazon EC2 instances. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. You can use the endpointPublicAccess and endpointPrivateAccess parameters to enable or disable public and private access to your cluster's Kubernetes API server endpoint. By default, public access is enabled, and private access is disabled. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .  You can use the logging parameter to enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing.  Cluster creation typically takes between 10 and 15 minutes. After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodes in the Amazon EKS User Guide.
    */
  def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]
  ): Request[CreateClusterResponse, AWSError] = js.native
  
  /**
    * Creates an AWS Fargate profile for your Amazon EKS cluster. You must have at least one Fargate profile in a cluster to be able to run pods on Fargate. The Fargate profile allows an administrator to declare which pods run on Fargate and specify which pods run on which Fargate profile. This declaration is done through the profile’s selectors. Each profile can have up to five selectors that contain a namespace and labels. A namespace is required for every selector. The label field consists of multiple optional key-value pairs. Pods that match the selectors are scheduled on Fargate. If a to-be-scheduled pod matches any of the selectors in the Fargate profile, then that pod is run on Fargate. When you create a Fargate profile, you must specify a pod execution role to use with the pods that are scheduled with the profile. This role is added to the cluster's Kubernetes Role Based Access Control (RBAC) for authorization so that the kubelet that is running on the Fargate infrastructure can register with your Amazon EKS cluster so that it can appear in your cluster as a node. The pod execution role also provides IAM permissions to the Fargate infrastructure to allow read access to Amazon ECR image repositories. For more information, see Pod Execution Role in the Amazon EKS User Guide. Fargate profiles are immutable. However, you can create a new updated profile to replace an existing profile and then delete the original after the updated profile has finished creating. If any Fargate profiles in a cluster are in the DELETING status, you must wait for that Fargate profile to finish deleting before you can create any other profiles in that cluster. For more information, see AWS Fargate Profile in the Amazon EKS User Guide.
    */
  def createFargateProfile(): Request[CreateFargateProfileResponse, AWSError] = js.native
  def createFargateProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateFargateProfileResponse, Unit]): Request[CreateFargateProfileResponse, AWSError] = js.native
  /**
    * Creates an AWS Fargate profile for your Amazon EKS cluster. You must have at least one Fargate profile in a cluster to be able to run pods on Fargate. The Fargate profile allows an administrator to declare which pods run on Fargate and specify which pods run on which Fargate profile. This declaration is done through the profile’s selectors. Each profile can have up to five selectors that contain a namespace and labels. A namespace is required for every selector. The label field consists of multiple optional key-value pairs. Pods that match the selectors are scheduled on Fargate. If a to-be-scheduled pod matches any of the selectors in the Fargate profile, then that pod is run on Fargate. When you create a Fargate profile, you must specify a pod execution role to use with the pods that are scheduled with the profile. This role is added to the cluster's Kubernetes Role Based Access Control (RBAC) for authorization so that the kubelet that is running on the Fargate infrastructure can register with your Amazon EKS cluster so that it can appear in your cluster as a node. The pod execution role also provides IAM permissions to the Fargate infrastructure to allow read access to Amazon ECR image repositories. For more information, see Pod Execution Role in the Amazon EKS User Guide. Fargate profiles are immutable. However, you can create a new updated profile to replace an existing profile and then delete the original after the updated profile has finished creating. If any Fargate profiles in a cluster are in the DELETING status, you must wait for that Fargate profile to finish deleting before you can create any other profiles in that cluster. For more information, see AWS Fargate Profile in the Amazon EKS User Guide.
    */
  def createFargateProfile(params: CreateFargateProfileRequest): Request[CreateFargateProfileResponse, AWSError] = js.native
  def createFargateProfile(
    params: CreateFargateProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFargateProfileResponse, Unit]
  ): Request[CreateFargateProfileResponse, AWSError] = js.native
  
  /**
    * Creates a managed worker node group for an Amazon EKS cluster. You can only create a node group for your cluster that is equal to the current Kubernetes version for the cluster. All node groups are created with the latest AMI release version for the respective minor Kubernetes version of the cluster, unless you deploy a custom AMI using a launch template. For more information about using launch templates, see Launch template support. An Amazon EKS managed node group is an Amazon EC2 Auto Scaling group and associated Amazon EC2 instances that are managed by AWS for an Amazon EKS cluster. Each node group uses a version of the Amazon EKS-optimized Amazon Linux 2 AMI. For more information, see Managed Node Groups in the Amazon EKS User Guide. 
    */
  def createNodegroup(): Request[CreateNodegroupResponse, AWSError] = js.native
  def createNodegroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateNodegroupResponse, Unit]): Request[CreateNodegroupResponse, AWSError] = js.native
  /**
    * Creates a managed worker node group for an Amazon EKS cluster. You can only create a node group for your cluster that is equal to the current Kubernetes version for the cluster. All node groups are created with the latest AMI release version for the respective minor Kubernetes version of the cluster, unless you deploy a custom AMI using a launch template. For more information about using launch templates, see Launch template support. An Amazon EKS managed node group is an Amazon EC2 Auto Scaling group and associated Amazon EC2 instances that are managed by AWS for an Amazon EKS cluster. Each node group uses a version of the Amazon EKS-optimized Amazon Linux 2 AMI. For more information, see Managed Node Groups in the Amazon EKS User Guide. 
    */
  def createNodegroup(params: CreateNodegroupRequest): Request[CreateNodegroupResponse, AWSError] = js.native
  def createNodegroup(
    params: CreateNodegroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNodegroupResponse, Unit]
  ): Request[CreateNodegroupResponse, AWSError] = js.native
  
  /**
    * Deletes the Amazon EKS cluster control plane. If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. If you have managed node groups or Fargate profiles attached to the cluster, you must delete them first. For more information, see DeleteNodegroup and DeleteFargateProfile.
    */
  def deleteCluster(): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]): Request[DeleteClusterResponse, AWSError] = js.native
  /**
    * Deletes the Amazon EKS cluster control plane. If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. If you have managed node groups or Fargate profiles attached to the cluster, you must delete them first. For more information, see DeleteNodegroup and DeleteFargateProfile.
    */
  def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]
  ): Request[DeleteClusterResponse, AWSError] = js.native
  
  /**
    * Deletes an AWS Fargate profile. When you delete a Fargate profile, any pods running on Fargate that were created with the profile are deleted. If those pods match another Fargate profile, then they are scheduled on Fargate with that profile. If they no longer match any Fargate profiles, then they are not scheduled on Fargate and they may remain in a pending state. Only one Fargate profile in a cluster can be in the DELETING status at a time. You must wait for a Fargate profile to finish deleting before you can delete any other profiles in that cluster.
    */
  def deleteFargateProfile(): Request[DeleteFargateProfileResponse, AWSError] = js.native
  def deleteFargateProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFargateProfileResponse, Unit]): Request[DeleteFargateProfileResponse, AWSError] = js.native
  /**
    * Deletes an AWS Fargate profile. When you delete a Fargate profile, any pods running on Fargate that were created with the profile are deleted. If those pods match another Fargate profile, then they are scheduled on Fargate with that profile. If they no longer match any Fargate profiles, then they are not scheduled on Fargate and they may remain in a pending state. Only one Fargate profile in a cluster can be in the DELETING status at a time. You must wait for a Fargate profile to finish deleting before you can delete any other profiles in that cluster.
    */
  def deleteFargateProfile(params: DeleteFargateProfileRequest): Request[DeleteFargateProfileResponse, AWSError] = js.native
  def deleteFargateProfile(
    params: DeleteFargateProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFargateProfileResponse, Unit]
  ): Request[DeleteFargateProfileResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon EKS node group for a cluster.
    */
  def deleteNodegroup(): Request[DeleteNodegroupResponse, AWSError] = js.native
  def deleteNodegroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNodegroupResponse, Unit]): Request[DeleteNodegroupResponse, AWSError] = js.native
  /**
    * Deletes an Amazon EKS node group for a cluster.
    */
  def deleteNodegroup(params: DeleteNodegroupRequest): Request[DeleteNodegroupResponse, AWSError] = js.native
  def deleteNodegroup(
    params: DeleteNodegroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNodegroupResponse, Unit]
  ): Request[DeleteNodegroupResponse, AWSError] = js.native
  
  /**
    * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data aren't available until the cluster reaches the ACTIVE state. 
    */
  def describeCluster(): Request[DescribeClusterResponse, AWSError] = js.native
  def describeCluster(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data aren't available until the cluster reaches the ACTIVE state. 
    */
  def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse, AWSError] = js.native
  def describeCluster(
    params: DescribeClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  
  /**
    * Returns descriptive information about an AWS Fargate profile.
    */
  def describeFargateProfile(): Request[DescribeFargateProfileResponse, AWSError] = js.native
  def describeFargateProfile(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFargateProfileResponse, Unit]): Request[DescribeFargateProfileResponse, AWSError] = js.native
  /**
    * Returns descriptive information about an AWS Fargate profile.
    */
  def describeFargateProfile(params: DescribeFargateProfileRequest): Request[DescribeFargateProfileResponse, AWSError] = js.native
  def describeFargateProfile(
    params: DescribeFargateProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFargateProfileResponse, Unit]
  ): Request[DescribeFargateProfileResponse, AWSError] = js.native
  
  /**
    * Returns descriptive information about an Amazon EKS node group.
    */
  def describeNodegroup(): Request[DescribeNodegroupResponse, AWSError] = js.native
  def describeNodegroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNodegroupResponse, Unit]): Request[DescribeNodegroupResponse, AWSError] = js.native
  /**
    * Returns descriptive information about an Amazon EKS node group.
    */
  def describeNodegroup(params: DescribeNodegroupRequest): Request[DescribeNodegroupResponse, AWSError] = js.native
  def describeNodegroup(
    params: DescribeNodegroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNodegroupResponse, Unit]
  ): Request[DescribeNodegroupResponse, AWSError] = js.native
  
  /**
    * Returns descriptive information about an update against your Amazon EKS cluster or associated managed node group. When the status of the update is Succeeded, the update is complete. If an update fails, the status is Failed, and an error detail explains the reason for the failure.
    */
  def describeUpdate(): Request[DescribeUpdateResponse, AWSError] = js.native
  def describeUpdate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUpdateResponse, Unit]): Request[DescribeUpdateResponse, AWSError] = js.native
  /**
    * Returns descriptive information about an update against your Amazon EKS cluster or associated managed node group. When the status of the update is Succeeded, the update is complete. If an update fails, the status is Failed, and an error detail explains the reason for the failure.
    */
  def describeUpdate(params: DescribeUpdateRequest): Request[DescribeUpdateResponse, AWSError] = js.native
  def describeUpdate(
    params: DescribeUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUpdateResponse, Unit]
  ): Request[DescribeUpdateResponse, AWSError] = js.native
  
  /**
    * Lists the Amazon EKS clusters in your AWS account in the specified Region.
    */
  def listClusters(): Request[ListClustersResponse, AWSError] = js.native
  def listClusters(callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResponse, Unit]): Request[ListClustersResponse, AWSError] = js.native
  /**
    * Lists the Amazon EKS clusters in your AWS account in the specified Region.
    */
  def listClusters(params: ListClustersRequest): Request[ListClustersResponse, AWSError] = js.native
  def listClusters(
    params: ListClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResponse, Unit]
  ): Request[ListClustersResponse, AWSError] = js.native
  
  /**
    * Lists the AWS Fargate profiles associated with the specified cluster in your AWS account in the specified Region.
    */
  def listFargateProfiles(): Request[ListFargateProfilesResponse, AWSError] = js.native
  def listFargateProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListFargateProfilesResponse, Unit]): Request[ListFargateProfilesResponse, AWSError] = js.native
  /**
    * Lists the AWS Fargate profiles associated with the specified cluster in your AWS account in the specified Region.
    */
  def listFargateProfiles(params: ListFargateProfilesRequest): Request[ListFargateProfilesResponse, AWSError] = js.native
  def listFargateProfiles(
    params: ListFargateProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFargateProfilesResponse, Unit]
  ): Request[ListFargateProfilesResponse, AWSError] = js.native
  
  /**
    * Lists the Amazon EKS managed node groups associated with the specified cluster in your AWS account in the specified Region. Self-managed node groups are not listed.
    */
  def listNodegroups(): Request[ListNodegroupsResponse, AWSError] = js.native
  def listNodegroups(callback: js.Function2[/* err */ AWSError, /* data */ ListNodegroupsResponse, Unit]): Request[ListNodegroupsResponse, AWSError] = js.native
  /**
    * Lists the Amazon EKS managed node groups associated with the specified cluster in your AWS account in the specified Region. Self-managed node groups are not listed.
    */
  def listNodegroups(params: ListNodegroupsRequest): Request[ListNodegroupsResponse, AWSError] = js.native
  def listNodegroups(
    params: ListNodegroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNodegroupsResponse, Unit]
  ): Request[ListNodegroupsResponse, AWSError] = js.native
  
  /**
    * List the tags for an Amazon EKS resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List the tags for an Amazon EKS resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists the updates associated with an Amazon EKS cluster or managed node group in your AWS account, in the specified Region.
    */
  def listUpdates(): Request[ListUpdatesResponse, AWSError] = js.native
  def listUpdates(callback: js.Function2[/* err */ AWSError, /* data */ ListUpdatesResponse, Unit]): Request[ListUpdatesResponse, AWSError] = js.native
  /**
    * Lists the updates associated with an Amazon EKS cluster or managed node group in your AWS account, in the specified Region.
    */
  def listUpdates(params: ListUpdatesRequest): Request[ListUpdatesResponse, AWSError] = js.native
  def listUpdates(
    params: ListUpdatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUpdatesResponse, Unit]
  ): Request[ListUpdatesResponse, AWSError] = js.native
  
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well. Tags that you create for Amazon EKS resources do not propagate to any other resources associated with the cluster. For example, if you tag a cluster with this operation, that tag does not automatically propagate to the subnets and worker nodes associated with the cluster.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well. Tags that you create for Amazon EKS resources do not propagate to any other resources associated with the cluster. For example, if you tag a cluster with this operation, that tag does not automatically propagate to the subnets and worker nodes associated with the cluster.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. You can use this API operation to enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing.  You can also use this API operation to enable or disable public and private access to your cluster's Kubernetes API server endpoint. By default, public access is enabled, and private access is disabled. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .   At this time, you can not update the subnets or security group IDs for an existing cluster.  Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
    */
  def updateClusterConfig(): Request[UpdateClusterConfigResponse, AWSError] = js.native
  def updateClusterConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterConfigResponse, Unit]): Request[UpdateClusterConfigResponse, AWSError] = js.native
  /**
    * Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. You can use this API operation to enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing.  You can also use this API operation to enable or disable public and private access to your cluster's Kubernetes API server endpoint. By default, public access is enabled, and private access is disabled. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .   At this time, you can not update the subnets or security group IDs for an existing cluster.  Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
    */
  def updateClusterConfig(params: UpdateClusterConfigRequest): Request[UpdateClusterConfigResponse, AWSError] = js.native
  def updateClusterConfig(
    params: UpdateClusterConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterConfigResponse, Unit]
  ): Request[UpdateClusterConfigResponse, AWSError] = js.native
  
  /**
    * Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active. If your cluster has managed node groups attached to it, all of your node groups’ Kubernetes versions must match the cluster’s Kubernetes version in order to update the cluster to a new Kubernetes version.
    */
  def updateClusterVersion(): Request[UpdateClusterVersionResponse, AWSError] = js.native
  def updateClusterVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterVersionResponse, Unit]): Request[UpdateClusterVersionResponse, AWSError] = js.native
  /**
    * Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active. If your cluster has managed node groups attached to it, all of your node groups’ Kubernetes versions must match the cluster’s Kubernetes version in order to update the cluster to a new Kubernetes version.
    */
  def updateClusterVersion(params: UpdateClusterVersionRequest): Request[UpdateClusterVersionResponse, AWSError] = js.native
  def updateClusterVersion(
    params: UpdateClusterVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterVersionResponse, Unit]
  ): Request[UpdateClusterVersionResponse, AWSError] = js.native
  
  /**
    * Updates an Amazon EKS managed node group configuration. Your node group continues to function during the update. The response output includes an update ID that you can use to track the status of your node group update with the DescribeUpdate API operation. Currently you can update the Kubernetes labels for a node group or the scaling configuration.
    */
  def updateNodegroupConfig(): Request[UpdateNodegroupConfigResponse, AWSError] = js.native
  def updateNodegroupConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNodegroupConfigResponse, Unit]): Request[UpdateNodegroupConfigResponse, AWSError] = js.native
  /**
    * Updates an Amazon EKS managed node group configuration. Your node group continues to function during the update. The response output includes an update ID that you can use to track the status of your node group update with the DescribeUpdate API operation. Currently you can update the Kubernetes labels for a node group or the scaling configuration.
    */
  def updateNodegroupConfig(params: UpdateNodegroupConfigRequest): Request[UpdateNodegroupConfigResponse, AWSError] = js.native
  def updateNodegroupConfig(
    params: UpdateNodegroupConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNodegroupConfigResponse, Unit]
  ): Request[UpdateNodegroupConfigResponse, AWSError] = js.native
  
  /**
    * Updates the Kubernetes version or AMI version of an Amazon EKS managed node group. You can update a node group using a launch template only if the node group was originally deployed with a launch template. If you need to update a custom AMI in a node group that was deployed with a launch template, then update your custom AMI, specify the new ID in a new version of the launch template, and then update the node group to the new version of the launch template. If you update without a launch template, then you can update to the latest available AMI version of a node group's current Kubernetes version by not specifying a Kubernetes version in the request. You can update to the latest AMI version of your cluster's current Kubernetes version by specifying your cluster's Kubernetes version in the request. For more information, see Amazon EKS-Optimized Linux AMI Versions in the Amazon EKS User Guide. You cannot roll back a node group to an earlier Kubernetes version or AMI version. When a node in a managed node group is terminated due to a scaling action or update, the pods in that node are drained first. Amazon EKS attempts to drain the nodes gracefully and will fail if it is unable to do so. You can force the update if Amazon EKS is unable to drain the nodes as a result of a pod disruption budget issue.
    */
  def updateNodegroupVersion(): Request[UpdateNodegroupVersionResponse, AWSError] = js.native
  def updateNodegroupVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNodegroupVersionResponse, Unit]): Request[UpdateNodegroupVersionResponse, AWSError] = js.native
  /**
    * Updates the Kubernetes version or AMI version of an Amazon EKS managed node group. You can update a node group using a launch template only if the node group was originally deployed with a launch template. If you need to update a custom AMI in a node group that was deployed with a launch template, then update your custom AMI, specify the new ID in a new version of the launch template, and then update the node group to the new version of the launch template. If you update without a launch template, then you can update to the latest available AMI version of a node group's current Kubernetes version by not specifying a Kubernetes version in the request. You can update to the latest AMI version of your cluster's current Kubernetes version by specifying your cluster's Kubernetes version in the request. For more information, see Amazon EKS-Optimized Linux AMI Versions in the Amazon EKS User Guide. You cannot roll back a node group to an earlier Kubernetes version or AMI version. When a node in a managed node group is terminated due to a scaling action or update, the pods in that node are drained first. Amazon EKS attempts to drain the nodes gracefully and will fail if it is unable to do so. You can force the update if Amazon EKS is unable to drain the nodes as a result of a pod disruption budget issue.
    */
  def updateNodegroupVersion(params: UpdateNodegroupVersionRequest): Request[UpdateNodegroupVersionResponse, AWSError] = js.native
  def updateNodegroupVersion(
    params: UpdateNodegroupVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNodegroupVersionResponse, Unit]
  ): Request[UpdateNodegroupVersionResponse, AWSError] = js.native
  
  /**
    * Waits for the clusterActive state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterActive(state: clusterActive): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterActive(
    state: clusterActive,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Waits for the clusterActive state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterActive(state: clusterActive, params: DescribeClusterRequestwai): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterActive(
    state: clusterActive,
    params: DescribeClusterRequestwai,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Waits for the clusterDeleted state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterDeleted(state: clusterDeleted): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: clusterDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Waits for the clusterDeleted state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterDeleted(state: clusterDeleted, params: DescribeClusterRequestwai): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: clusterDeleted,
    params: DescribeClusterRequestwai,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Waits for the nodegroupActive state by periodically calling the underlying EKS.describeNodegroupoperation every 30 seconds (at most 80 times).
    */
  @JSName("waitFor")
  def waitFor_nodegroupActive(state: nodegroupActive): Request[DescribeNodegroupResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_nodegroupActive(
    state: nodegroupActive,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNodegroupResponse, Unit]
  ): Request[DescribeNodegroupResponse, AWSError] = js.native
  /**
    * Waits for the nodegroupActive state by periodically calling the underlying EKS.describeNodegroupoperation every 30 seconds (at most 80 times).
    */
  @JSName("waitFor")
  def waitFor_nodegroupActive(state: nodegroupActive, params: DescribeNodegroupRequestw): Request[DescribeNodegroupResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_nodegroupActive(
    state: nodegroupActive,
    params: DescribeNodegroupRequestw,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNodegroupResponse, Unit]
  ): Request[DescribeNodegroupResponse, AWSError] = js.native
  /**
    * Waits for the nodegroupDeleted state by periodically calling the underlying EKS.describeNodegroupoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_nodegroupDeleted(state: nodegroupDeleted): Request[DescribeNodegroupResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_nodegroupDeleted(
    state: nodegroupDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNodegroupResponse, Unit]
  ): Request[DescribeNodegroupResponse, AWSError] = js.native
  /**
    * Waits for the nodegroupDeleted state by periodically calling the underlying EKS.describeNodegroupoperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_nodegroupDeleted(state: nodegroupDeleted, params: DescribeNodegroupRequestw): Request[DescribeNodegroupResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_nodegroupDeleted(
    state: nodegroupDeleted,
    params: DescribeNodegroupRequestw,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNodegroupResponse, Unit]
  ): Request[DescribeNodegroupResponse, AWSError] = js.native
}
