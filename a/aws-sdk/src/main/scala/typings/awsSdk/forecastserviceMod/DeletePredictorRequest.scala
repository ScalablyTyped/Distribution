package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePredictorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor to delete.
    */
  var PredictorArn: Arn
}
object DeletePredictorRequest {
  
  @scala.inline
  def apply(PredictorArn: Arn): DeletePredictorRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePredictorRequest]
  }
  
  @scala.inline
  implicit class DeletePredictorRequestMutableBuilder[Self <: DeletePredictorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
  }
}
