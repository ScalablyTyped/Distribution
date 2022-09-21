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
    * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster control plane logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see CloudWatch Pricing. 
    */
  var logging: js.UndefOr[Logging] = js.undefined
  
  /**
    * The unique name to give to your cluster.
    */
  var name: ClusterName
  
  /**
    * An object representing the configuration of your local Amazon EKS cluster on an Amazon Web Services Outpost. Before creating a local cluster on an Outpost, review Creating an Amazon EKS cluster on an Amazon Web Services Outpost in the Amazon EKS User Guide. This object isn't available for creating Amazon EKS clusters on the Amazon Web Services cloud.
    */
  var outpostConfig: js.UndefOr[OutpostConfigRequest] = js.undefined
  
  /**
    * The VPC configuration that's used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide. You must specify at least two subnets. You can specify up to five security groups. However, we recommend that you use a dedicated security group for your cluster control plane.
    */
  var resourcesVpcConfig: VpcConfigRequest
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to Amazon Web Services API operations on your behalf. For more information, see Amazon EKS Service IAM Role in the  Amazon EKS User Guide .
    */
  var roleArn: String
  
  /**
    * The metadata to apply to the cluster to assist with categorization and organization. Each tag consists of a key and an optional value. You define both.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The desired Kubernetes version for your cluster. If you don't specify a value here, the default version available in Amazon EKS is used.  The default version might not be the latest version available. 
    */
  var version: js.UndefOr[String] = js.undefined
}
object CreateClusterRequest {
  
  inline def apply(name: ClusterName, resourcesVpcConfig: VpcConfigRequest, roleArn: String): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourcesVpcConfig = resourcesVpcConfig.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  extension [Self <: CreateClusterRequest](x: Self) {
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setEncryptionConfig(value: EncryptionConfigList): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setEncryptionConfigVarargs(value: EncryptionConfig*): Self = StObject.set(x, "encryptionConfig", js.Array(value*))
    
    inline def setKubernetesNetworkConfig(value: KubernetesNetworkConfigRequest): Self = StObject.set(x, "kubernetesNetworkConfig", value.asInstanceOf[js.Any])
    
    inline def setKubernetesNetworkConfigUndefined: Self = StObject.set(x, "kubernetesNetworkConfig", js.undefined)
    
    inline def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setName(value: ClusterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutpostConfig(value: OutpostConfigRequest): Self = StObject.set(x, "outpostConfig", value.asInstanceOf[js.Any])
    
    inline def setOutpostConfigUndefined: Self = StObject.set(x, "outpostConfig", js.undefined)
    
    inline def setResourcesVpcConfig(value: VpcConfigRequest): Self = StObject.set(x, "resourcesVpcConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
