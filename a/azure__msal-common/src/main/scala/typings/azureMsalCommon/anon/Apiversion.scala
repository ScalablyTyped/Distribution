package typings.azureMsalCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apiversion extends StObject {
  
  var `api-version`: String
  
  var metadata: js.Array[Aliases]
  
  var tenant_discovery_endpoint: String
}
object Apiversion {
  
  inline def apply(`api-version`: String, metadata: js.Array[Aliases], tenant_discovery_endpoint: String): Apiversion = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], tenant_discovery_endpoint = tenant_discovery_endpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("api-version")(`api-version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apiversion]
  }
  
  extension [Self <: Apiversion](x: Self) {
    
    inline def `setApi-version`(value: String): Self = StObject.set(x, "api-version", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: js.Array[Aliases]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataVarargs(value: Aliases*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setTenant_discovery_endpoint(value: String): Self = StObject.set(x, "tenant_discovery_endpoint", value.asInstanceOf[js.Any])
  }
}
