package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLoggingConfigurationsResponse extends StObject {
  
  /**
    * 
    */
  var LoggingConfigurations: js.UndefOr[typings.awsSdk.wafv2Mod.LoggingConfigurations] = js.undefined
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.undefined
}
object ListLoggingConfigurationsResponse {
  
  @scala.inline
  def apply(): ListLoggingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLoggingConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListLoggingConfigurationsResponseMutableBuilder[Self <: ListLoggingConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingConfigurations(value: LoggingConfigurations): Self = StObject.set(x, "LoggingConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigurationsUndefined: Self = StObject.set(x, "LoggingConfigurations", js.undefined)
    
    @scala.inline
    def setLoggingConfigurationsVarargs(value: LoggingConfiguration*): Self = StObject.set(x, "LoggingConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
