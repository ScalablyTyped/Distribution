package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccuracyMetricsResponse extends js.Object {
  
  /**
    * An array of results from evaluating the predictor.
    */
  var PredictorEvaluationResults: js.UndefOr[typings.awsSdk.forecastserviceMod.PredictorEvaluationResults] = js.native
}
object GetAccuracyMetricsResponse {
  
  @scala.inline
  def apply(): GetAccuracyMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccuracyMetricsResponse]
  }
  
  @scala.inline
  implicit class GetAccuracyMetricsResponseOps[Self <: GetAccuracyMetricsResponse] (val x: Self) extends AnyVal {
    
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
    def setPredictorEvaluationResultsVarargs(value: EvaluationResult*): Self = this.set("PredictorEvaluationResults", js.Array(value :_*))
    
    @scala.inline
    def setPredictorEvaluationResults(value: PredictorEvaluationResults): Self = this.set("PredictorEvaluationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictorEvaluationResults: Self = this.set("PredictorEvaluationResults", js.undefined)
  }
}
