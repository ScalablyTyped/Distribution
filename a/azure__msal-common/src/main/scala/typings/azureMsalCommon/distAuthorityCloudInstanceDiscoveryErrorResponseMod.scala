package typings.azureMsalCommon

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthorityCloudInstanceDiscoveryErrorResponseMod {
  
  @JSImport("@azure/msal-common/dist/authority/CloudInstanceDiscoveryErrorResponse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCloudInstanceDiscoveryErrorResponse(response: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloudInstanceDiscoveryErrorResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait CloudInstanceDiscoveryErrorResponse extends StObject {
    
    var correlation_id: js.UndefOr[String] = js.undefined
    
    var error: String
    
    var error_codes: js.UndefOr[js.Array[Number]] = js.undefined
    
    var error_description: String
    
    var error_uri: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[String] = js.undefined
    
    var trace_id: js.UndefOr[String] = js.undefined
  }
  object CloudInstanceDiscoveryErrorResponse {
    
    inline def apply(error: String, error_description: String): CloudInstanceDiscoveryErrorResponse = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], error_description = error_description.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudInstanceDiscoveryErrorResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudInstanceDiscoveryErrorResponse] (val x: Self) extends AnyVal {
      
      inline def setCorrelation_id(value: String): Self = StObject.set(x, "correlation_id", value.asInstanceOf[js.Any])
      
      inline def setCorrelation_idUndefined: Self = StObject.set(x, "correlation_id", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setError_codes(value: js.Array[Number]): Self = StObject.set(x, "error_codes", value.asInstanceOf[js.Any])
      
      inline def setError_codesUndefined: Self = StObject.set(x, "error_codes", js.undefined)
      
      inline def setError_codesVarargs(value: Number*): Self = StObject.set(x, "error_codes", js.Array(value*))
      
      inline def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
      
      inline def setError_uri(value: String): Self = StObject.set(x, "error_uri", value.asInstanceOf[js.Any])
      
      inline def setError_uriUndefined: Self = StObject.set(x, "error_uri", js.undefined)
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
      
      inline def setTrace_idUndefined: Self = StObject.set(x, "trace_id", js.undefined)
    }
  }
}
