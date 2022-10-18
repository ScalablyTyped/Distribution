package typings.azureMsalCommon

import typings.azureMsalCommon.distAuthorityCloudDiscoveryMetadataMod.CloudDiscoveryMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthorityCloudInstanceDiscoveryResponseMod {
  
  @JSImport("@azure/msal-common/dist/authority/CloudInstanceDiscoveryResponse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCloudInstanceDiscoveryResponse(response: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloudInstanceDiscoveryResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait CloudInstanceDiscoveryResponse extends StObject {
    
    var metadata: js.Array[CloudDiscoveryMetadata]
    
    var tenant_discovery_endpoint: String
  }
  object CloudInstanceDiscoveryResponse {
    
    inline def apply(metadata: js.Array[CloudDiscoveryMetadata], tenant_discovery_endpoint: String): CloudInstanceDiscoveryResponse = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], tenant_discovery_endpoint = tenant_discovery_endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudInstanceDiscoveryResponse]
    }
    
    extension [Self <: CloudInstanceDiscoveryResponse](x: Self) {
      
      inline def setMetadata(value: js.Array[CloudDiscoveryMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataVarargs(value: CloudDiscoveryMetadata*): Self = StObject.set(x, "metadata", js.Array(value*))
      
      inline def setTenant_discovery_endpoint(value: String): Self = StObject.set(x, "tenant_discovery_endpoint", value.asInstanceOf[js.Any])
    }
  }
}
