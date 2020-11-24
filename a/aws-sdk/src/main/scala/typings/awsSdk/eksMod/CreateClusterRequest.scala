package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterRequest extends js.Object {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  
  /**
    * The encryption configuration for the cluster.
    */
  var encryptionConfig: js.UndefOr[EncryptionConfigList] = js.native
  
  /**
    * The Kubernetes network configuration for the cluster.
    */
  var kubernetesNetworkConfig: js.UndefOr[KubernetesNetworkConfigRequest] = js.native
  
  /**
    * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing. 
    */
  var logging: js.UndefOr[Logging] = js.native
  
  /**
    * The unique name to give to your cluster.
    */
  var name: ClusterName = js.native
  
  /**
    * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide. You must specify at least two subnets. You can specify up to five security groups, but we recommend that you use a dedicated security group for your cluster control plane.
    */
  var resourcesVpcConfig: VpcConfigRequest = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf. For more information, see Amazon EKS Service IAM Role in the  Amazon EKS User Guide .
    */
  var roleArn: String = js.native
  
  /**
    * The metadata to apply to the cluster to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The desired Kubernetes version for your cluster. If you don't specify a value here, the latest version available in Amazon EKS is used.
    */
  var version: js.UndefOr[String] = js.native
}
object CreateClusterRequest {
  
  @scala.inline
  def apply(name: ClusterName, resourcesVpcConfig: VpcConfigRequest, roleArn: String): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourcesVpcConfig = resourcesVpcConfig.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  @scala.inline
  implicit class CreateClusterRequestOps[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: ClusterName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVpcConfig(value: VpcConfigRequest): Self = this.set("resourcesVpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: String): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setEncryptionConfigVarargs(value: EncryptionConfig*): Self = this.set("encryptionConfig", js.Array(value :_*))
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfigList): Self = this.set("encryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionConfig: Self = this.set("encryptionConfig", js.undefined)
    
    @scala.inline
    def setKubernetesNetworkConfig(value: KubernetesNetworkConfigRequest): Self = this.set("kubernetesNetworkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKubernetesNetworkConfig: Self = this.set("kubernetesNetworkConfig", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
