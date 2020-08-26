package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePredictorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the predictor to delete.
    */
  var PredictorArn: Arn = js.native
}

object DeletePredictorRequest {
  @scala.inline
  def apply(PredictorArn: Arn): DeletePredictorRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePredictorRequest]
  }
  @scala.inline
  implicit class DeletePredictorRequestOps[Self <: DeletePredictorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPredictorArn(value: Arn): Self = this.set("PredictorArn", value.asInstanceOf[js.Any])
  }
  
}

