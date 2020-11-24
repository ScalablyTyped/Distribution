package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cluster extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  var arn: js.UndefOr[String] = js.native
  
  /**
    * The certificate-authority-data for your cluster.
    */
  var certificateAuthority: js.UndefOr[Certificate] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  
  /**
    * The Unix epoch timestamp in seconds for when the cluster was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The encryption configuration for the cluster.
    */
  var encryptionConfig: js.UndefOr[EncryptionConfigList] = js.native
  
  /**
    * The endpoint for your Kubernetes API server.
    */
  var endpoint: js.UndefOr[String] = js.native
  
  /**
    * The identity provider information for the cluster.
    */
  var identity: js.UndefOr[Identity] = js.native
  
  /**
    * Network configuration settings for your cluster.
    */
  var kubernetesNetworkConfig: js.UndefOr[KubernetesNetworkConfigResponse] = js.native
  
  /**
    * The logging configuration for your cluster.
    */
  var logging: js.UndefOr[Logging] = js.native
  
  /**
    * The name of the cluster.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The platform version of your Amazon EKS cluster. For more information, see Platform Versions in the  Amazon EKS User Guide .
    */
  var platformVersion: js.UndefOr[String] = js.native
  
  /**
    * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide.
    */
  var resourcesVpcConfig: js.UndefOr[VpcConfigResponse] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
    */
  var roleArn: js.UndefOr[String] = js.native
  
  /**
    * The current status of the cluster.
    */
  var status: js.UndefOr[ClusterStatus] = js.native
  
  /**
    * The metadata that you apply to the cluster to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Cluster tags do not propagate to any other resources associated with the cluster. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The Kubernetes server version for the cluster.
    */
  var version: js.UndefOr[String] = js.native
}
object Cluster {
  
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCertificateAuthority(value: Certificate): Self = this.set("certificateAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateAuthority: Self = this.set("certificateAuthority", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: String): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setEncryptionConfigVarargs(value: EncryptionConfig*): Self = this.set("encryptionConfig", js.Array(value :_*))
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfigList): Self = this.set("encryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionConfig: Self = this.set("encryptionConfig", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setIdentity(value: Identity): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setKubernetesNetworkConfig(value: KubernetesNetworkConfigResponse): Self = this.set("kubernetesNetworkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKubernetesNetworkConfig: Self = this.set("kubernetesNetworkConfig", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformVersion: Self = this.set("platformVersion", js.undefined)
    
    @scala.inline
    def setResourcesVpcConfig(value: VpcConfigResponse): Self = this.set("resourcesVpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcesVpcConfig: Self = this.set("resourcesVpcConfig", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ClusterStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
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
