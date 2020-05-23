package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerMetadataEntityTypesListItem extends js.Object {
  /**
    * Detailed information about the accuracy of the entity recognizer for a specific item on the list of entity types. 
    */
  var EvaluationMetrics: js.UndefOr[EntityTypesEvaluationMetrics] = js.native
  /**
    * Indicates the number of times the given entity type was seen in the training data. 
    */
  var NumberOfTrainMentions: js.UndefOr[Integer] = js.native
  /**
    * Type of entity from the list of entity types in the metadata of an entity recognizer. 
    */
  var Type: js.UndefOr[AnyLengthString] = js.native
}

object EntityRecognizerMetadataEntityTypesListItem {
  @scala.inline
  def apply(
    EvaluationMetrics: EntityTypesEvaluationMetrics = null,
    NumberOfTrainMentions: js.UndefOr[Integer] = js.undefined,
    Type: AnyLengthString = null
  ): EntityRecognizerMetadataEntityTypesListItem = {
    val __obj = js.Dynamic.literal()
    if (EvaluationMetrics != null) __obj.updateDynamic("EvaluationMetrics")(EvaluationMetrics.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfTrainMentions)) __obj.updateDynamic("NumberOfTrainMentions")(NumberOfTrainMentions.get.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerMetadataEntityTypesListItem]
  }
}

