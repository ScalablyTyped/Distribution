package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerMetadata extends js.Object {
  /**
    * Entity types from the metadata of an entity recognizer.
    */
  var EntityTypes: js.UndefOr[EntityRecognizerMetadataEntityTypesList] = js.native
  /**
    * Detailed information about the accuracy of an entity recognizer.
    */
  var EvaluationMetrics: js.UndefOr[EntityRecognizerEvaluationMetrics] = js.native
  /**
    *  The number of documents in the input data that were used to test the entity recognizer. Typically this is 10 to 20 percent of the input documents.
    */
  var NumberOfTestDocuments: js.UndefOr[Integer] = js.native
  /**
    *  The number of documents in the input data that were used to train the entity recognizer. Typically this is 80 to 90 percent of the input documents.
    */
  var NumberOfTrainedDocuments: js.UndefOr[Integer] = js.native
}

object EntityRecognizerMetadata {
  @scala.inline
  def apply(
    EntityTypes: EntityRecognizerMetadataEntityTypesList = null,
    EvaluationMetrics: EntityRecognizerEvaluationMetrics = null,
    NumberOfTestDocuments: js.UndefOr[Integer] = js.undefined,
    NumberOfTrainedDocuments: js.UndefOr[Integer] = js.undefined
  ): EntityRecognizerMetadata = {
    val __obj = js.Dynamic.literal()
    if (EntityTypes != null) __obj.updateDynamic("EntityTypes")(EntityTypes.asInstanceOf[js.Any])
    if (EvaluationMetrics != null) __obj.updateDynamic("EvaluationMetrics")(EvaluationMetrics.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfTestDocuments)) __obj.updateDynamic("NumberOfTestDocuments")(NumberOfTestDocuments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfTrainedDocuments)) __obj.updateDynamic("NumberOfTrainedDocuments")(NumberOfTrainedDocuments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerMetadata]
  }
}

