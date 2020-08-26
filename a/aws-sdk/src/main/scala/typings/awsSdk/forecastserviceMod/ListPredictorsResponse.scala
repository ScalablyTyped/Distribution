package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPredictorsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.native
  /**
    * An array of objects that summarize each predictor's properties.
    */
  var Predictors: js.UndefOr[typings.awsSdk.forecastserviceMod.Predictors] = js.native
}

object ListPredictorsResponse {
  @scala.inline
  def apply(): ListPredictorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPredictorsResponse]
  }
  @scala.inline
  implicit class ListPredictorsResponseOps[Self <: ListPredictorsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPredictorsVarargs(value: PredictorSummary*): Self = this.set("Predictors", js.Array(value :_*))
    @scala.inline
    def setPredictors(value: Predictors): Self = this.set("Predictors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictors: Self = this.set("Predictors", js.undefined)
  }
  
}

