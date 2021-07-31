package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognizerMetadataEntityTypesListItem extends StObject {
  
  /**
    * Detailed information about the accuracy of the entity recognizer for a specific item on the list of entity types. 
    */
  var EvaluationMetrics: js.UndefOr[EntityTypesEvaluationMetrics] = js.undefined
  
  /**
    * Indicates the number of times the given entity type was seen in the training data. 
    */
  var NumberOfTrainMentions: js.UndefOr[Integer] = js.undefined
  
  /**
    * Type of entity from the list of entity types in the metadata of an entity recognizer. 
    */
  var Type: js.UndefOr[AnyLengthString] = js.undefined
}
object EntityRecognizerMetadataEntityTypesListItem {
  
  @scala.inline
  def apply(): EntityRecognizerMetadataEntityTypesListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerMetadataEntityTypesListItem]
  }
  
  @scala.inline
  implicit class EntityRecognizerMetadataEntityTypesListItemMutableBuilder[Self <: EntityRecognizerMetadataEntityTypesListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationMetrics(value: EntityTypesEvaluationMetrics): Self = StObject.set(x, "EvaluationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMetricsUndefined: Self = StObject.set(x, "EvaluationMetrics", js.undefined)
    
    @scala.inline
    def setNumberOfTrainMentions(value: Integer): Self = StObject.set(x, "NumberOfTrainMentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTrainMentionsUndefined: Self = StObject.set(x, "NumberOfTrainMentions", js.undefined)
    
    @scala.inline
    def setType(value: AnyLengthString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
