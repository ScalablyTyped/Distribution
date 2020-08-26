package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventPredictionResult extends js.Object {
  /**
    * The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud risk and 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For example, a score of 600 corresponds to an estimated 10% false positive rate whereas a score of 900 corresponds to an estimated 2% false positive rate.
    */
  var modelScores: js.UndefOr[ListOfModelScores] = js.native
  /**
    * The results.
    */
  var ruleResults: js.UndefOr[ListOfRuleResults] = js.native
}

object GetEventPredictionResult {
  @scala.inline
  def apply(): GetEventPredictionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventPredictionResult]
  }
  @scala.inline
  implicit class GetEventPredictionResultOps[Self <: GetEventPredictionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModelScoresVarargs(value: ModelScores*): Self = this.set("modelScores", js.Array(value :_*))
    @scala.inline
    def setModelScores(value: ListOfModelScores): Self = this.set("modelScores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelScores: Self = this.set("modelScores", js.undefined)
    @scala.inline
    def setRuleResultsVarargs(value: RuleResult*): Self = this.set("ruleResults", js.Array(value :_*))
    @scala.inline
    def setRuleResults(value: ListOfRuleResults): Self = this.set("ruleResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleResults: Self = this.set("ruleResults", js.undefined)
  }
  
}

