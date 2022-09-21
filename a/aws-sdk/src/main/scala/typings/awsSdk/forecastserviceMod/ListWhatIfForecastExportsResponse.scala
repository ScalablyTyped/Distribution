package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWhatIfForecastExportsResponse extends StObject {
  
  /**
    * If the response is truncated, Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.undefined
  
  /**
    * An array of WhatIfForecastExports objects that describe the matched forecast exports.
    */
  var WhatIfForecastExports: js.UndefOr[typings.awsSdk.forecastserviceMod.WhatIfForecastExports] = js.undefined
}
object ListWhatIfForecastExportsResponse {
  
  inline def apply(): ListWhatIfForecastExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWhatIfForecastExportsResponse]
  }
  
  extension [Self <: ListWhatIfForecastExportsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWhatIfForecastExports(value: WhatIfForecastExports): Self = StObject.set(x, "WhatIfForecastExports", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastExportsUndefined: Self = StObject.set(x, "WhatIfForecastExports", js.undefined)
    
    inline def setWhatIfForecastExportsVarargs(value: WhatIfForecastExportSummary*): Self = StObject.set(x, "WhatIfForecastExports", js.Array(value*))
  }
}
