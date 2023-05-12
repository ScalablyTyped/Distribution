package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XksProxyConfigurationType extends StObject {
  
  /**
    * <p>The part of the external key store <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateCustomKeyStore.html#KMS-CreateCustomKeyStore-request-XksProxyAuthenticationCredential">proxy authentication credential</a>
    *       that uniquely identifies the secret access key.</p>
    */
  var AccessKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Indicates whether the external key store proxy uses a public endpoint or an Amazon VPC endpoint
    *       service to communicate with KMS.</p>
    */
  var Connectivity: js.UndefOr[XksProxyConnectivityType | String] = js.undefined
  
  /**
    * <p>The URI endpoint for the external key store proxy.</p>
    *          <p>If the external key store proxy has a public endpoint, it is displayed here.</p>
    *          <p>If the external key store proxy uses an Amazon VPC endpoint service name, this field displays
    *       the private DNS name associated with the VPC endpoint service.</p>
    */
  var UriEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The path to the external key store proxy APIs.</p>
    */
  var UriPath: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon VPC endpoint service used to communicate with the external key store proxy. This
    *       field appears only when the external key store proxy uses an Amazon VPC endpoint service to
    *       communicate with KMS.</p>
    */
  var VpcEndpointServiceName: js.UndefOr[String] = js.undefined
}
object XksProxyConfigurationType {
  
  inline def apply(): XksProxyConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XksProxyConfigurationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XksProxyConfigurationType] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    inline def setConnectivity(value: XksProxyConnectivityType | String): Self = StObject.set(x, "Connectivity", value.asInstanceOf[js.Any])
    
    inline def setConnectivityUndefined: Self = StObject.set(x, "Connectivity", js.undefined)
    
    inline def setUriEndpoint(value: String): Self = StObject.set(x, "UriEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUriEndpointUndefined: Self = StObject.set(x, "UriEndpoint", js.undefined)
    
    inline def setUriPath(value: String): Self = StObject.set(x, "UriPath", value.asInstanceOf[js.Any])
    
    inline def setUriPathUndefined: Self = StObject.set(x, "UriPath", js.undefined)
    
    inline def setVpcEndpointServiceName(value: String): Self = StObject.set(x, "VpcEndpointServiceName", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointServiceNameUndefined: Self = StObject.set(x, "VpcEndpointServiceName", js.undefined)
  }
}
