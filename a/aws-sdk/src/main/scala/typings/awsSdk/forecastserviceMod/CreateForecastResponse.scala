package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateForecastResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the forecast.
    */
  var ForecastArn: js.UndefOr[Arn] = js.undefined
}
object CreateForecastResponse {
  
  @scala.inline
  def apply(): CreateForecastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateForecastResponse]
  }
  
  @scala.inline
  implicit class CreateForecastResponseMutableBuilder[Self <: CreateForecastResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForecastArn(value: Arn): Self = StObject.set(x, "ForecastArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastArnUndefined: Self = StObject.set(x, "ForecastArn", js.undefined)
  }
}
