package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLoggingConfigurationsResponse extends StObject {
  
  /**
    * 
    */
  var LoggingConfigurations: js.UndefOr[typings.awsSdk.clientsWafv2Mod.LoggingConfigurations] = js.undefined
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafv2Mod.NextMarker] = js.undefined
}
object ListLoggingConfigurationsResponse {
  
  inline def apply(): ListLoggingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLoggingConfigurationsResponse]
  }
  
  extension [Self <: ListLoggingConfigurationsResponse](x: Self) {
    
    inline def setLoggingConfigurations(value: LoggingConfigurations): Self = StObject.set(x, "LoggingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationsUndefined: Self = StObject.set(x, "LoggingConfigurations", js.undefined)
    
    inline def setLoggingConfigurationsVarargs(value: LoggingConfiguration*): Self = StObject.set(x, "LoggingConfigurations", js.Array(value*))
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
