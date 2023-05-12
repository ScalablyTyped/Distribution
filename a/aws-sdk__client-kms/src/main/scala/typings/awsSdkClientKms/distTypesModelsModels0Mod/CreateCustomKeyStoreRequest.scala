package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomKeyStoreRequest extends StObject {
  
  /**
    * <p>Identifies the CloudHSM cluster for an CloudHSM key store. This parameter is required for custom
    *       key stores with <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
    *          <p>Enter the cluster ID of any active CloudHSM cluster that is not already associated with a
    *       custom key store. To find the cluster ID, use the <a href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a> operation.</p>
    */
  var CloudHsmClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Specifies a friendly name for the custom key store. The name must be unique in your
    *       Amazon Web Services account and Region. This parameter is required for all custom key stores.</p>
    *          <important>
    *             <p>Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.</p>
    *          </important>
    */
  var CustomKeyStoreName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Specifies the type of custom key store. The default value is
    *       <code>AWS_CLOUDHSM</code>.</p>
    *          <p>For a custom key store backed by an CloudHSM cluster, omit the parameter or enter
    *         <code>AWS_CLOUDHSM</code>. For a custom key store backed by an external key manager outside
    *       of Amazon Web Services, enter <code>EXTERNAL_KEY_STORE</code>. You cannot change this property after the key
    *       store is created.</p>
    */
  var CustomKeyStoreType: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.CustomKeyStoreType | String] = js.undefined
  
  /**
    * <p>Specifies the <code>kmsuser</code> password for an CloudHSM key store. This parameter is
    *       required for custom key stores with a <code>CustomKeyStoreType</code> of
    *         <code>AWS_CLOUDHSM</code>.</p>
    *          <p>Enter the password of the <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
    *                <code>kmsuser</code> crypto user
    *         (CU) account</a> in the specified CloudHSM cluster. KMS logs into the cluster as this
    *       user to manage key material on your behalf.</p>
    *          <p>The password must be a string of 7 to 32 characters. Its value is case sensitive.</p>
    *          <p>This parameter tells KMS the <code>kmsuser</code> account password; it does not change
    *       the password in the CloudHSM cluster.</p>
    */
  var KeyStorePassword: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Specifies the certificate for an CloudHSM key store. This parameter is required for custom
    *       key stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
    *          <p>Enter the content of the trust anchor certificate for the CloudHSM cluster. This is the
    *       content of the <code>customerCA.crt</code> file that you created when you <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html">initialized the
    *         cluster</a>.</p>
    */
  var TrustAnchorCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Specifies an authentication credential for the external key store proxy (XKS proxy). This
    *       parameter is required for all custom key stores with a <code>CustomKeyStoreType</code> of
    *         <code>EXTERNAL_KEY_STORE</code>.</p>
    *          <p>The <code>XksProxyAuthenticationCredential</code> has two required elements:
    *         <code>RawSecretAccessKey</code>, a secret key, and <code>AccessKeyId</code>, a unique
    *       identifier for the <code>RawSecretAccessKey</code>. For character requirements, see <a href="kms/latest/APIReference/API_XksProxyAuthenticationCredentialType.html">XksProxyAuthenticationCredentialType</a>.</p>
    *          <p>KMS uses this authentication credential to sign requests to the external key store proxy
    *       on your behalf. This credential is unrelated to Identity and Access Management (IAM) and Amazon Web Services credentials.</p>
    *          <p>This parameter doesn't set or change the authentication credentials on the XKS proxy. It
    *       just tells KMS the credential that you established on your external key store proxy. If you
    *       rotate your proxy authentication credential, use the <a>UpdateCustomKeyStore</a>
    *       operation to provide the new credential to KMS.</p>
    */
  var XksProxyAuthenticationCredential: js.UndefOr[XksProxyAuthenticationCredentialType] = js.undefined
  
  /**
    * <p>Indicates how KMS communicates with the external key store proxy. This parameter is
    *       required for custom key stores with a <code>CustomKeyStoreType</code> of
    *         <code>EXTERNAL_KEY_STORE</code>.</p>
    *          <p>If the external key store proxy uses a public endpoint, specify
    *         <code>PUBLIC_ENDPOINT</code>. If the external key store proxy uses a Amazon VPC
    *       endpoint service for communication with KMS, specify <code>VPC_ENDPOINT_SERVICE</code>. For
    *       help making this choice, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/plan-xks-keystore.html#choose-xks-connectivity">Choosing a connectivity option</a> in the <i>Key Management Service Developer Guide</i>.</p>
    *          <p>An Amazon VPC endpoint service keeps your communication with KMS in a private address space
    *       entirely within Amazon Web Services, but it requires more configuration, including establishing a Amazon VPC with multiple subnets, a VPC endpoint service, a network load balancer, and a
    *       verified private DNS name. A public endpoint is simpler to set up, but it might be slower and
    *       might not fulfill your security requirements. You might consider testing with a public
    *       endpoint, and then establishing a VPC endpoint service for production tasks. Note that this
    *       choice does not determine the location of the external key store proxy. Even if you choose a
    *       VPC endpoint service, the proxy can be hosted within the VPC or outside of Amazon Web Services such as in
    *       your corporate data center.</p>
    */
  var XksProxyConnectivity: js.UndefOr[XksProxyConnectivityType | String] = js.undefined
  
  /**
    * <p>Specifies the endpoint that KMS uses to send requests to the external key store proxy
    *       (XKS proxy). This parameter is required for custom key stores with a
    *         <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.</p>
    *          <p>The protocol must be HTTPS. KMS communicates on port 443. Do not specify the port in the
    *         <code>XksProxyUriEndpoint</code> value.</p>
    *          <p>For external key stores with <code>XksProxyConnectivity</code> value of
    *         <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code> followed by the private DNS
    *       name of the VPC endpoint service.</p>
    *          <p>For external key stores with <code>PUBLIC_ENDPOINT</code> connectivity, this endpoint must
    *       be reachable before you create the custom key store. KMS connects to the external key store
    *       proxy while creating the custom key store. For external key stores with
    *         <code>VPC_ENDPOINT_SERVICE</code> connectivity, KMS connects when you call the <a>ConnectCustomKeyStore</a> operation.</p>
    *          <p>The value of this parameter must begin with <code>https://</code>. The remainder can
    *       contain upper and lower case letters (A-Z and a-z), numbers (0-9), dots (<code>.</code>), and
    *       hyphens (<code>-</code>). Additional slashes (<code>/</code> and <code>\</code>) are not
    *       permitted.</p>
    *          <p>
    *             <b>Uniqueness requirements: </b>
    *          </p>
    *          <ul>
    *             <li>
    *                <p>The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values
    *           must be unique in the Amazon Web Services account and Region.</p>
    *             </li>
    *             <li>
    *                <p>An external key store with <code>PUBLIC_ENDPOINT</code> connectivity cannot use the
    *           same <code>XksProxyUriEndpoint</code> value as an external key store with
    *             <code>VPC_ENDPOINT_SERVICE</code> connectivity in the same Amazon Web Services Region.</p>
    *             </li>
    *             <li>
    *                <p>Each external key store with <code>VPC_ENDPOINT_SERVICE</code> connectivity must have
    *           its own private DNS name. The <code>XksProxyUriEndpoint</code> value for external key
    *           stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity (private DNS name) must be
    *           unique in the Amazon Web Services account and Region.</p>
    *             </li>
    *          </ul>
    */
  var XksProxyUriEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Specifies the base path to the proxy APIs for this external key store. To find this value,
    *       see the documentation for your external key store proxy. This parameter is required for all
    *       custom key stores with a <code>CustomKeyStoreType</code> of
    *       <code>EXTERNAL_KEY_STORE</code>.</p>
    *          <p>The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code> where
    *         <code>v1</code> represents the version of the KMS external key store proxy API. This path
    *       can include an optional prefix between the required elements such as
    *           <code>/<i>prefix</i>/kms/xks/v1</code>.</p>
    *          <p>
    *             <b>Uniqueness requirements: </b>
    *          </p>
    *          <ul>
    *             <li>
    *                <p>The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values
    *           must be unique in the Amazon Web Services account and Region.</p>
    *             </li>
    *          </ul>
    */
  var XksProxyUriPath: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Specifies the name of the Amazon VPC endpoint service for interface endpoints that is used to
    *       communicate with your external key store proxy (XKS proxy). This parameter is required when
    *       the value of <code>CustomKeyStoreType</code> is <code>EXTERNAL_KEY_STORE</code> and the value
    *       of <code>XksProxyConnectivity</code> is <code>VPC_ENDPOINT_SERVICE</code>.</p>
    *          <p>The Amazon VPC endpoint service must <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements">fulfill all requirements</a> for use with an external key
    *       store. </p>
    *          <p>
    *             <b>Uniqueness requirements:</b>
    *          </p>
    *          <ul>
    *             <li>
    *                <p>External key stores with <code>VPC_ENDPOINT_SERVICE</code> connectivity can share an
    *           Amazon VPC, but each external key store must have its own VPC endpoint service and private DNS
    *           name.</p>
    *             </li>
    *          </ul>
    */
  var XksProxyVpcEndpointServiceName: js.UndefOr[String] = js.undefined
}
object CreateCustomKeyStoreRequest {
  
  inline def apply(): CreateCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomKeyStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomKeyStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setCloudHsmClusterId(value: String): Self = StObject.set(x, "CloudHsmClusterId", value.asInstanceOf[js.Any])
    
    inline def setCloudHsmClusterIdUndefined: Self = StObject.set(x, "CloudHsmClusterId", js.undefined)
    
    inline def setCustomKeyStoreName(value: String): Self = StObject.set(x, "CustomKeyStoreName", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreNameUndefined: Self = StObject.set(x, "CustomKeyStoreName", js.undefined)
    
    inline def setCustomKeyStoreType(value: CustomKeyStoreType | String): Self = StObject.set(x, "CustomKeyStoreType", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreTypeUndefined: Self = StObject.set(x, "CustomKeyStoreType", js.undefined)
    
    inline def setKeyStorePassword(value: String): Self = StObject.set(x, "KeyStorePassword", value.asInstanceOf[js.Any])
    
    inline def setKeyStorePasswordUndefined: Self = StObject.set(x, "KeyStorePassword", js.undefined)
    
    inline def setTrustAnchorCertificate(value: String): Self = StObject.set(x, "TrustAnchorCertificate", value.asInstanceOf[js.Any])
    
    inline def setTrustAnchorCertificateUndefined: Self = StObject.set(x, "TrustAnchorCertificate", js.undefined)
    
    inline def setXksProxyAuthenticationCredential(value: XksProxyAuthenticationCredentialType): Self = StObject.set(x, "XksProxyAuthenticationCredential", value.asInstanceOf[js.Any])
    
    inline def setXksProxyAuthenticationCredentialUndefined: Self = StObject.set(x, "XksProxyAuthenticationCredential", js.undefined)
    
    inline def setXksProxyConnectivity(value: XksProxyConnectivityType | String): Self = StObject.set(x, "XksProxyConnectivity", value.asInstanceOf[js.Any])
    
    inline def setXksProxyConnectivityUndefined: Self = StObject.set(x, "XksProxyConnectivity", js.undefined)
    
    inline def setXksProxyUriEndpoint(value: String): Self = StObject.set(x, "XksProxyUriEndpoint", value.asInstanceOf[js.Any])
    
    inline def setXksProxyUriEndpointUndefined: Self = StObject.set(x, "XksProxyUriEndpoint", js.undefined)
    
    inline def setXksProxyUriPath(value: String): Self = StObject.set(x, "XksProxyUriPath", value.asInstanceOf[js.Any])
    
    inline def setXksProxyUriPathUndefined: Self = StObject.set(x, "XksProxyUriPath", js.undefined)
    
    inline def setXksProxyVpcEndpointServiceName(value: String): Self = StObject.set(x, "XksProxyVpcEndpointServiceName", value.asInstanceOf[js.Any])
    
    inline def setXksProxyVpcEndpointServiceNameUndefined: Self = StObject.set(x, "XksProxyVpcEndpointServiceName", js.undefined)
  }
}
