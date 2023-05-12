package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomKeyStoreRequest extends StObject {
  
  /**
    * <p>Associates the custom key store with a related CloudHSM cluster. This parameter is valid only
    *       for custom key stores with a <code>CustomKeyStoreType</code> of
    *       <code>AWS_CLOUDHSM</code>.</p>
    *          <p>Enter the cluster ID of the cluster that you used to create the custom key store or a
    *       cluster that shares a backup history and has the same cluster certificate as the original
    *       cluster. You cannot use this parameter to associate a custom key store with an unrelated
    *       cluster. In addition, the replacement cluster must <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore">fulfill the requirements</a> for
    *       a cluster associated with a custom key store. To view the cluster certificate of a cluster,
    *       use the <a href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a> operation.</p>
    *          <p>To change this value, the CloudHSM key store must be disconnected.</p>
    */
  var CloudHsmClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Identifies the custom key store that you want to update. Enter the ID of the custom key
    *       store. To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
    */
  var CustomKeyStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Enter the current password of the <code>kmsuser</code> crypto user (CU) in the CloudHSM
    *       cluster that is associated with the custom key store. This parameter is valid only for custom
    *       key stores with a <code>CustomKeyStoreType</code> of <code>AWS_CLOUDHSM</code>.</p>
    *          <p>This parameter tells KMS the current password of the <code>kmsuser</code> crypto user
    *       (CU). It does not set or change the password of any users in the CloudHSM cluster.</p>
    *          <p>To change this value, the CloudHSM key store must be disconnected.</p>
    */
  var KeyStorePassword: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Changes the friendly name of the custom key store to the value that you specify. The
    *       custom key store name must be unique in the Amazon Web Services account.</p>
    *          <important>
    *             <p>Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.</p>
    *          </important>
    *          <p>To change this value, an CloudHSM key store must be disconnected. An external key store can
    *       be connected or disconnected.</p>
    */
  var NewCustomKeyStoreName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Changes the credentials that KMS uses to sign requests to the external key store proxy
    *       (XKS proxy). This parameter is valid only for custom key stores with a
    *         <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.</p>
    *          <p>You must specify both the <code>AccessKeyId</code> and <code>SecretAccessKey</code> value
    *       in the authentication credential, even if you are only updating one value.</p>
    *          <p>This parameter doesn't establish or change your authentication credentials on the proxy.
    *       It just tells KMS the credential that you established with your external key store proxy.
    *       For example, if you rotate the credential on your external key store proxy, you can use this
    *       parameter to update the credential in KMS.</p>
    *          <p>You can change this value when the external key store is connected or disconnected.</p>
    */
  var XksProxyAuthenticationCredential: js.UndefOr[XksProxyAuthenticationCredentialType] = js.undefined
  
  /**
    * <p>Changes the connectivity setting for the external key store. To indicate that the external
    *       key store proxy uses a Amazon VPC endpoint service to communicate with KMS, specify
    *         <code>VPC_ENDPOINT_SERVICE</code>. Otherwise, specify <code>PUBLIC_ENDPOINT</code>.</p>
    *          <p>If you change the <code>XksProxyConnectivity</code> to <code>VPC_ENDPOINT_SERVICE</code>,
    *       you must also change the <code>XksProxyUriEndpoint</code> and add an
    *         <code>XksProxyVpcEndpointServiceName</code> value. </p>
    *          <p>If you change the <code>XksProxyConnectivity</code> to <code>PUBLIC_ENDPOINT</code>, you
    *       must also change the <code>XksProxyUriEndpoint</code> and specify a null or empty string for
    *       the <code>XksProxyVpcEndpointServiceName</code> value.</p>
    *          <p>To change this value, the external key store must be disconnected.</p>
    */
  var XksProxyConnectivity: js.UndefOr[XksProxyConnectivityType | String] = js.undefined
  
  /**
    * <p>Changes the URI endpoint that KMS uses to connect to your external key store proxy (XKS
    *       proxy). This parameter is valid only for custom key stores with a
    *         <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>.</p>
    *          <p>For external key stores with an <code>XksProxyConnectivity</code> value of
    *         <code>PUBLIC_ENDPOINT</code>, the protocol must be HTTPS.</p>
    *          <p>For external key stores with an <code>XksProxyConnectivity</code> value of
    *         <code>VPC_ENDPOINT_SERVICE</code>, specify <code>https://</code> followed by the private DNS
    *       name associated with the VPC endpoint service. Each external key store must use a different
    *       private DNS name.</p>
    *          <p>The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must
    *       be unique in the Amazon Web Services account and Region.</p>
    *          <p>To change this value, the external key store must be disconnected.</p>
    */
  var XksProxyUriEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Changes the base path to the proxy APIs for this external key store. To find this value,
    *       see the documentation for your external key manager and external key store proxy (XKS proxy).
    *       This parameter is valid only for custom key stores with a <code>CustomKeyStoreType</code> of
    *         <code>EXTERNAL_KEY_STORE</code>.</p>
    *          <p>The value must start with <code>/</code> and must end with <code>/kms/xks/v1</code>, where
    *         <code>v1</code> represents the version of the KMS external key store proxy API. You can
    *       include an optional prefix between the required elements such as
    *           <code>/<i>example</i>/kms/xks/v1</code>.</p>
    *          <p>The combined <code>XksProxyUriEndpoint</code> and <code>XksProxyUriPath</code> values must
    *       be unique in the Amazon Web Services account and Region.</p>
    *          <p>You can change this value when the external key store is connected or disconnected.</p>
    */
  var XksProxyUriPath: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Changes the name that KMS uses to identify the Amazon VPC endpoint service for your external
    *       key store proxy (XKS proxy). This parameter is valid when the <code>CustomKeyStoreType</code>
    *       is <code>EXTERNAL_KEY_STORE</code> and the <code>XksProxyConnectivity</code> is
    *         <code>VPC_ENDPOINT_SERVICE</code>.</p>
    *          <p>To change this value, the external key store must be disconnected.</p>
    */
  var XksProxyVpcEndpointServiceName: js.UndefOr[String] = js.undefined
}
object UpdateCustomKeyStoreRequest {
  
  inline def apply(): UpdateCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCustomKeyStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCustomKeyStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setCloudHsmClusterId(value: String): Self = StObject.set(x, "CloudHsmClusterId", value.asInstanceOf[js.Any])
    
    inline def setCloudHsmClusterIdUndefined: Self = StObject.set(x, "CloudHsmClusterId", js.undefined)
    
    inline def setCustomKeyStoreId(value: String): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    inline def setKeyStorePassword(value: String): Self = StObject.set(x, "KeyStorePassword", value.asInstanceOf[js.Any])
    
    inline def setKeyStorePasswordUndefined: Self = StObject.set(x, "KeyStorePassword", js.undefined)
    
    inline def setNewCustomKeyStoreName(value: String): Self = StObject.set(x, "NewCustomKeyStoreName", value.asInstanceOf[js.Any])
    
    inline def setNewCustomKeyStoreNameUndefined: Self = StObject.set(x, "NewCustomKeyStoreName", js.undefined)
    
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
