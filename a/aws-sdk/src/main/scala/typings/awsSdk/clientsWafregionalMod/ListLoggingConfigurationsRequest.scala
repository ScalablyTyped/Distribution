package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLoggingConfigurationsRequest extends StObject {
  
  /**
    * Specifies the number of LoggingConfigurations that you want AWS WAF to return for this request. If you have more LoggingConfigurations than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of LoggingConfigurations.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  
  /**
    * If you specify a value for Limit and you have more LoggingConfigurations than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of LoggingConfigurations. For the second and subsequent ListLoggingConfigurations requests, specify the value of NextMarker from the previous response to get information about another batch of ListLoggingConfigurations.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafregionalMod.NextMarker] = js.undefined
}
object ListLoggingConfigurationsRequest {
  
  inline def apply(): ListLoggingConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLoggingConfigurationsRequest]
  }
  
  extension [Self <: ListLoggingConfigurationsRequest](x: Self) {
    
    inline def setLimit(value: PaginationLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
