package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cluster extends StObject {
  
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
  implicit class ClusterMutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCertificateAuthority(value: Certificate): Self = StObject.set(x, "certificateAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityUndefined: Self = StObject.set(x, "certificateAuthority", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfigList): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    @scala.inline
    def setEncryptionConfigVarargs(value: EncryptionConfig*): Self = StObject.set(x, "encryptionConfig", js.Array(value :_*))
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    @scala.inline
    def setKubernetesNetworkConfig(value: KubernetesNetworkConfigResponse): Self = StObject.set(x, "kubernetesNetworkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubernetesNetworkConfigUndefined: Self = StObject.set(x, "kubernetesNetworkConfig", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    @scala.inline
    def setResourcesVpcConfig(value: VpcConfigResponse): Self = StObject.set(x, "resourcesVpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVpcConfigUndefined: Self = StObject.set(x, "resourcesVpcConfig", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ClusterStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
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
