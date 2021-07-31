package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The encryption configuration for the cluster.
    */
  var encryptionConfig: js.UndefOr[EncryptionConfigList] = js.undefined
  
  /**
    * The Kubernetes network configuration for the cluster.
    */
  var kubernetesNetworkConfig: js.UndefOr[KubernetesNetworkConfigRequest] = js.undefined
  
  /**
    * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing. 
    */
  var logging: js.UndefOr[Logging] = js.undefined
  
  /**
    * The unique name to give to your cluster.
    */
  var name: ClusterName
  
  /**
    * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide. You must specify at least two subnets. You can specify up to five security groups, but we recommend that you use a dedicated security group for your cluster control plane.
    */
  var resourcesVpcConfig: VpcConfigRequest
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf. For more information, see Amazon EKS Service IAM Role in the  Amazon EKS User Guide .
    */
  var roleArn: String
  
  /**
    * The metadata to apply to the cluster to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The desired Kubernetes version for your cluster. If you don't specify a value here, the latest version available in Amazon EKS is used.
    */
  var version: js.UndefOr[String] = js.undefined
}
object CreateClusterRequest {
  
  @scala.inline
  def apply(name: ClusterName, resourcesVpcConfig: VpcConfigRequest, roleArn: String): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourcesVpcConfig = resourcesVpcConfig.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  @scala.inline
  implicit class CreateClusterRequestMutableBuilder[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfigList): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    @scala.inline
    def setEncryptionConfigVarargs(value: EncryptionConfig*): Self = StObject.set(x, "encryptionConfig", js.Array(value :_*))
    
    @scala.inline
    def setKubernetesNetworkConfig(value: KubernetesNetworkConfigRequest): Self = StObject.set(x, "kubernetesNetworkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubernetesNetworkConfigUndefined: Self = StObject.set(x, "kubernetesNetworkConfig", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setName(value: ClusterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVpcConfig(value: VpcConfigRequest): Self = StObject.set(x, "resourcesVpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
