package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccuracyMetricsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor to get metrics for.
    */
  var PredictorArn: Arn
}
object GetAccuracyMetricsRequest {
  
  @scala.inline
  def apply(PredictorArn: Arn): GetAccuracyMetricsRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccuracyMetricsRequest]
  }
  
  @scala.inline
  implicit class GetAccuracyMetricsRequestMutableBuilder[Self <: GetAccuracyMetricsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
  }
}
