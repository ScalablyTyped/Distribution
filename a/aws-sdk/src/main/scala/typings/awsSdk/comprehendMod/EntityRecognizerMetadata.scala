package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityRecognizerMetadata extends StObject {
  
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
  def apply(): EntityRecognizerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerMetadata]
  }
  
  @scala.inline
  implicit class EntityRecognizerMetadataMutableBuilder[Self <: EntityRecognizerMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: EntityRecognizerMetadataEntityTypesList): Self = StObject.set(x, "EntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "EntityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: EntityRecognizerMetadataEntityTypesListItem*): Self = StObject.set(x, "EntityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEvaluationMetrics(value: EntityRecognizerEvaluationMetrics): Self = StObject.set(x, "EvaluationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMetricsUndefined: Self = StObject.set(x, "EvaluationMetrics", js.undefined)
    
    @scala.inline
    def setNumberOfTestDocuments(value: Integer): Self = StObject.set(x, "NumberOfTestDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTestDocumentsUndefined: Self = StObject.set(x, "NumberOfTestDocuments", js.undefined)
    
    @scala.inline
    def setNumberOfTrainedDocuments(value: Integer): Self = StObject.set(x, "NumberOfTrainedDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTrainedDocumentsUndefined: Self = StObject.set(x, "NumberOfTrainedDocuments", js.undefined)
  }
}
