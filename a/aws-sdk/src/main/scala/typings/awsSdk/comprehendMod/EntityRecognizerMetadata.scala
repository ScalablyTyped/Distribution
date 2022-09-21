package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognizerMetadata extends StObject {
  
  /**
    * Entity types from the metadata of an entity recognizer.
    */
  var EntityTypes: js.UndefOr[EntityRecognizerMetadataEntityTypesList] = js.undefined
  
  /**
    * Detailed information about the accuracy of an entity recognizer.
    */
  var EvaluationMetrics: js.UndefOr[EntityRecognizerEvaluationMetrics] = js.undefined
  
  /**
    *  The number of documents in the input data that were used to test the entity recognizer. Typically this is 10 to 20 percent of the input documents.
    */
  var NumberOfTestDocuments: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The number of documents in the input data that were used to train the entity recognizer. Typically this is 80 to 90 percent of the input documents.
    */
  var NumberOfTrainedDocuments: js.UndefOr[Integer] = js.undefined
}
object EntityRecognizerMetadata {
  
  inline def apply(): EntityRecognizerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerMetadata]
  }
  
  extension [Self <: EntityRecognizerMetadata](x: Self) {
    
    inline def setEntityTypes(value: EntityRecognizerMetadataEntityTypesList): Self = StObject.set(x, "EntityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "EntityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: EntityRecognizerMetadataEntityTypesListItem*): Self = StObject.set(x, "EntityTypes", js.Array(value*))
    
    inline def setEvaluationMetrics(value: EntityRecognizerEvaluationMetrics): Self = StObject.set(x, "EvaluationMetrics", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMetricsUndefined: Self = StObject.set(x, "EvaluationMetrics", js.undefined)
    
    inline def setNumberOfTestDocuments(value: Integer): Self = StObject.set(x, "NumberOfTestDocuments", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTestDocumentsUndefined: Self = StObject.set(x, "NumberOfTestDocuments", js.undefined)
    
    inline def setNumberOfTrainedDocuments(value: Integer): Self = StObject.set(x, "NumberOfTrainedDocuments", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTrainedDocumentsUndefined: Self = StObject.set(x, "NumberOfTrainedDocuments", js.undefined)
  }
}
