package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWhatIfForecastExportRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the what-if forecast export that you want to delete.
    */
  var WhatIfForecastExportArn: LongArn
}
object DeleteWhatIfForecastExportRequest {
  
  inline def apply(WhatIfForecastExportArn: LongArn): DeleteWhatIfForecastExportRequest = {
    val __obj = js.Dynamic.literal(WhatIfForecastExportArn = WhatIfForecastExportArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWhatIfForecastExportRequest]
  }
  
  extension [Self <: DeleteWhatIfForecastExportRequest](x: Self) {
    
    inline def setWhatIfForecastExportArn(value: LongArn): Self = StObject.set(x, "WhatIfForecastExportArn", value.asInstanceOf[js.Any])
  }
}
