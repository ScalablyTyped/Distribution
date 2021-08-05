package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteForecastExportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the forecast export job to delete.
    */
  var ForecastExportJobArn: Arn
}
object DeleteForecastExportJobRequest {
  
  inline def apply(ForecastExportJobArn: Arn): DeleteForecastExportJobRequest = {
    val __obj = js.Dynamic.literal(ForecastExportJobArn = ForecastExportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteForecastExportJobRequest]
  }
  
  extension [Self <: DeleteForecastExportJobRequest](x: Self) {
    
    inline def setForecastExportJobArn(value: Arn): Self = StObject.set(x, "ForecastExportJobArn", value.asInstanceOf[js.Any])
  }
}
