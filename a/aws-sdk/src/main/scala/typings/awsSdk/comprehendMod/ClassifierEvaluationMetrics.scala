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
  def apply(
    Accuracy: js.UndefOr[Double] = js.undefined,
    F1Score: js.UndefOr[Double] = js.undefined,
    HammingLoss: js.UndefOr[Double] = js.undefined,
    MicroF1Score: js.UndefOr[Double] = js.undefined,
    MicroPrecision: js.UndefOr[Double] = js.undefined,
    MicroRecall: js.UndefOr[Double] = js.undefined,
    Precision: js.UndefOr[Double] = js.undefined,
    Recall: js.UndefOr[Double] = js.undefined
  ): ClassifierEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Accuracy)) __obj.updateDynamic("Accuracy")(Accuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(F1Score)) __obj.updateDynamic("F1Score")(F1Score.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HammingLoss)) __obj.updateDynamic("HammingLoss")(HammingLoss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MicroF1Score)) __obj.updateDynamic("MicroF1Score")(MicroF1Score.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MicroPrecision)) __obj.updateDynamic("MicroPrecision")(MicroPrecision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MicroRecall)) __obj.updateDynamic("MicroRecall")(MicroRecall.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Precision)) __obj.updateDynamic("Precision")(Precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Recall)) __obj.updateDynamic("Recall")(Recall.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierEvaluationMetrics]
  }
}

