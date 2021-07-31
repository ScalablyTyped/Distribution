package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLoggingConfigurationsResponse extends StObject {
  
  /**
    * An array of LoggingConfiguration objects.
    */
  var LoggingConfigurations: js.UndefOr[typings.awsSdk.wafregionalMod.LoggingConfigurations] = js.undefined
  
  /**
    * If you have more LoggingConfigurations than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more LoggingConfigurations, submit another ListLoggingConfigurations request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.undefined
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
