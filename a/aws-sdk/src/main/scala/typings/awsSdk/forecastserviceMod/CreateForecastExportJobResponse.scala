package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateForecastExportJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the export job.
    */
  var ForecastExportJobArn: js.UndefOr[Arn] = js.undefined
}
object CreateForecastExportJobResponse {
  
  @scala.inline
  def apply(): CreateForecastExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateForecastExportJobResponse]
  }
  
  @scala.inline
  implicit class CreateForecastExportJobResponseMutableBuilder[Self <: CreateForecastExportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForecastExportJobArn(value: Arn): Self = StObject.set(x, "ForecastExportJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastExportJobArnUndefined: Self = StObject.set(x, "ForecastExportJobArn", js.undefined)
  }
}
