package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesApiCallAction extends StObject {
  
  /**
    * Parameters related to the Kubernetes API call action.
    */
  var Parameters: js.UndefOr[String] = js.undefined
  
  var RemoteIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemoteIpDetails] = js.undefined
  
  /**
    * The Kubernetes API request URI.
    */
  var RequestUri: js.UndefOr[String] = js.undefined
  
  /**
    * The IP of the Kubernetes API caller and the IPs of any proxies or load balancers between the caller and the API endpoint.
    */
  var SourceIps: js.UndefOr[typings.awsSdk.guarddutyMod.SourceIps] = js.undefined
  
  /**
    * The resulting HTTP response code of the Kubernetes API call action.
    */
  var StatusCode: js.UndefOr[Integer] = js.undefined
  
  /**
    * The user agent of the caller of the Kubernetes API.
    */
  var UserAgent: js.UndefOr[String] = js.undefined
  
  /**
    * The Kubernetes API request HTTP verb.
    */
  var Verb: js.UndefOr[String] = js.undefined
}
object KubernetesApiCallAction {
  
  inline def apply(): KubernetesApiCallAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesApiCallAction]
  }
  
  extension [Self <: KubernetesApiCallAction](x: Self) {
    
    inline def setParameters(value: String): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setRemoteIpDetails(value: RemoteIpDetails): Self = StObject.set(x, "RemoteIpDetails", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpDetailsUndefined: Self = StObject.set(x, "RemoteIpDetails", js.undefined)
    
    inline def setRequestUri(value: String): Self = StObject.set(x, "RequestUri", value.asInstanceOf[js.Any])
    
    inline def setRequestUriUndefined: Self = StObject.set(x, "RequestUri", js.undefined)
    
    inline def setSourceIps(value: SourceIps): Self = StObject.set(x, "SourceIps", value.asInstanceOf[js.Any])
    
    inline def setSourceIpsUndefined: Self = StObject.set(x, "SourceIps", js.undefined)
    
    inline def setSourceIpsVarargs(value: String*): Self = StObject.set(x, "SourceIps", js.Array(value*))
    
    inline def setStatusCode(value: Integer): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "UserAgent", js.undefined)
    
    inline def setVerb(value: String): Self = StObject.set(x, "Verb", value.asInstanceOf[js.Any])
    
    inline def setVerbUndefined: Self = StObject.set(x, "Verb", js.undefined)
  }
}
