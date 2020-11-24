package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePredictorResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor.
    */
  var PredictorArn: js.UndefOr[Arn] = js.native
}
object CreatePredictorResponse {
  
  @scala.inline
  def apply(): CreatePredictorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePredictorResponse]
  }
  
  @scala.inline
  implicit class CreatePredictorResponseOps[Self <: CreatePredictorResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deletePredictorArn: Self = this.set("PredictorArn", js.undefined)
  }
}
