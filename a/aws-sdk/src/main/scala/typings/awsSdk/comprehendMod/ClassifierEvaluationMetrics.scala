package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierEvaluationMetrics extends js.Object {
  /**
    * The fraction of the labels that were correct recognized. It is computed by dividing the number of labels in the test documents that were correctly recognized by the total number of labels in the test documents.
    */
  var Accuracy: js.UndefOr[Double] = js.native
  /**
    * A measure of how accurate the classifier results are for the test data. It is derived from the Precision and Recall values. The F1Score is the harmonic average of the two scores. The highest score is 1, and the worst score is 0. 
    */
  var F1Score: js.UndefOr[Double] = js.native
  /**
    * Indicates the fraction of labels that are incorrectly predicted. Also seen as the fraction of wrong labels compared to the total number of labels. Scores closer to zero are better.
    */
  var HammingLoss: js.UndefOr[Double] = js.native
  /**
    * A measure of how accurate the classifier results are for the test data. It is a combination of the Micro Precision and Micro Recall values. The Micro F1Score is the harmonic mean of the two scores. The highest score is 1, and the worst score is 0.
    */
  var MicroF1Score: js.UndefOr[Double] = js.native
  /**
    * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer returned substantially more relevant results than irrelevant ones. Unlike the Precision metric which comes from averaging the precision of all available labels, this is based on the overall score of all precision scores added together.
    */
  var MicroPrecision: js.UndefOr[Double] = js.native
  /**
    * A measure of how complete the classifier results are for the test data. High recall means that the classifier returned most of the relevant results. Specifically, this indicates how many of the correct categories in the text that the model can predict. It is a percentage of correct categories in the text that can found. Instead of averaging the recall scores of all labels (as with Recall), micro Recall is based on the overall score of all recall scores added together.
    */
  var MicroRecall: js.UndefOr[Double] = js.native
  /**
    * A measure of the usefulness of the classifier results in the test data. High precision means that the classifier returned substantially more relevant results than irrelevant ones.
    */
  var Precision: js.UndefOr[Double] = js.native
  /**
    * A measure of how complete the classifier results are for the test data. High recall means that the classifier returned most of the relevant results. 
    */
  var Recall: js.UndefOr[Double] = js.native
}

object ClassifierEvaluationMetrics {
  @scala.inline
  def apply(): ClassifierEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifierEvaluationMetrics]
  }
  @scala.inline
  implicit class ClassifierEvaluationMetricsOps[Self <: ClassifierEvaluationMetrics] (val x: Self) extends AnyVal {
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
    def setAccuracy(value: Double): Self = this.set("Accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccuracy: Self = this.set("Accuracy", js.undefined)
    @scala.inline
    def setF1Score(value: Double): Self = this.set("F1Score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF1Score: Self = this.set("F1Score", js.undefined)
    @scala.inline
    def setHammingLoss(value: Double): Self = this.set("HammingLoss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHammingLoss: Self = this.set("HammingLoss", js.undefined)
    @scala.inline
    def setMicroF1Score(value: Double): Self = this.set("MicroF1Score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicroF1Score: Self = this.set("MicroF1Score", js.undefined)
    @scala.inline
    def setMicroPrecision(value: Double): Self = this.set("MicroPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicroPrecision: Self = this.set("MicroPrecision", js.undefined)
    @scala.inline
    def setMicroRecall(value: Double): Self = this.set("MicroRecall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicroRecall: Self = this.set("MicroRecall", js.undefined)
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

