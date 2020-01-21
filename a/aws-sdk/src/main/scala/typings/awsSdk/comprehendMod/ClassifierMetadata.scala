package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierMetadata extends js.Object {
  /**
    *  Describes the result metrics for the test data associated with an documentation classifier.
    */
  var EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics] = js.native
  /**
    * The number of labels in the input data. 
    */
  var NumberOfLabels: js.UndefOr[Integer] = js.native
  /**
    * The number of documents in the input data that were used to test the classifier. Typically this is 10 to 20 percent of the input documents.
    */
  var NumberOfTestDocuments: js.UndefOr[Integer] = js.native
  /**
    * The number of documents in the input data that were used to train the classifier. Typically this is 80 to 90 percent of the input documents.
    */
  var NumberOfTrainedDocuments: js.UndefOr[Integer] = js.native
}

object ClassifierMetadata {
  @scala.inline
  def apply(
    EvaluationMetrics: ClassifierEvaluationMetrics = null,
    NumberOfLabels: Int | scala.Double = null,
    NumberOfTestDocuments: Int | scala.Double = null,
    NumberOfTrainedDocuments: Int | scala.Double = null
  ): ClassifierMetadata = {
    val __obj = js.Dynamic.literal()
    if (EvaluationMetrics != null) __obj.updateDynamic("EvaluationMetrics")(EvaluationMetrics.asInstanceOf[js.Any])
    if (NumberOfLabels != null) __obj.updateDynamic("NumberOfLabels")(NumberOfLabels.asInstanceOf[js.Any])
    if (NumberOfTestDocuments != null) __obj.updateDynamic("NumberOfTestDocuments")(NumberOfTestDocuments.asInstanceOf[js.Any])
    if (NumberOfTrainedDocuments != null) __obj.updateDynamic("NumberOfTrainedDocuments")(NumberOfTrainedDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierMetadata]
  }
}

