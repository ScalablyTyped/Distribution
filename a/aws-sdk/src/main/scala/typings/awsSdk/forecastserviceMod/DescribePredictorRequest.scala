package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePredictorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the predictor that you want information about.
    */
  var PredictorArn: Arn = js.native
}

object DescribePredictorRequest {
  @scala.inline
  def apply(PredictorArn: Arn): DescribePredictorRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribePredictorRequest]
  }
}

