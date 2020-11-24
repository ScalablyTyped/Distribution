package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityRecognizerEvaluationMetrics extends js.Object {
  
  /**
    * A measure of how accurate the recognizer results are for the test data. It is derived from the Precision and Recall values. The F1Score is the harmonic average of the two scores. The highest score is 1, and the worst score is 0. 
    */
  var F1Score: js.UndefOr[Double] = js.native
  
  /**
    * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer returned substantially more relevant results than irrelevant ones. 
    */
  var Precision: js.UndefOr[Double] = js.native
  
  /**
    * A measure of how complete the recognizer results are for the test data. High recall means that the recognizer returned most of the relevant results.
    */
  var Recall: js.UndefOr[Double] = js.native
}
object EntityRecognizerEvaluationMetrics {
  
  @scala.inline
  def apply(): EntityRecognizerEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerEvaluationMetrics]
  }
  
  @scala.inline
  implicit class EntityRecognizerEvaluationMetricsOps[Self <: EntityRecognizerEvaluationMetrics] (val x: Self) extends AnyVal {
    
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
    def setF1Score(value: Double): Self = this.set("F1Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF1Score: Self = this.set("F1Score", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("Precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("Precision", js.undefined)
    
    @scala.inline
    def setRecall(value: Double): Self = this.set("Recall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecall: Self = this.set("Recall", js.undefined)
  }
}
