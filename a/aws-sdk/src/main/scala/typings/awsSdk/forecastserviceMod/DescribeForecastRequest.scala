package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeForecastRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the forecast.
    */
  var ForecastArn: Arn = js.native
}
object DescribeForecastRequest {
  
  @scala.inline
  def apply(ForecastArn: Arn): DescribeForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastArn = ForecastArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeForecastRequest]
  }
  
  @scala.inline
  implicit class DescribeForecastRequestMutableBuilder[Self <: DescribeForecastRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForecastArn(value: Arn): Self = StObject.set(x, "ForecastArn", value.asInstanceOf[js.Any])
  }
}
