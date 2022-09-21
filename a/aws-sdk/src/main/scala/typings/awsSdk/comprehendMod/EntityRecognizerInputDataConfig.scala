package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognizerInputDataConfig extends StObject {
  
  /**
    * The S3 location of the CSV file that annotates your training documents.
    */
  var Annotations: js.UndefOr[EntityRecognizerAnnotations] = js.undefined
  
  /**
    * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth. This parameter is required if you set DataFormat to AUGMENTED_MANIFEST.
    */
  var AugmentedManifests: js.UndefOr[EntityRecognizerAugmentedManifestsList] = js.undefined
  
  /**
    * The format of your training data:    COMPREHEND_CSV: A CSV file that supplements your training documents. The CSV file contains information about the custom entities that your trained model will detect. The required format of the file depends on whether you are providing annotations or an entity list. If you use this value, you must provide your CSV file by using either the Annotations or EntityList parameters. You must provide your training documents by using the Documents parameter.    AUGMENTED_MANIFEST: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file is in JSON lines format. Each line is a complete JSON object that contains a training document and its labels. Each label annotates a named entity in the training document.  If you use this value, you must provide the AugmentedManifests parameter in your request.   If you don't specify a value, Amazon Comprehend uses COMPREHEND_CSV as the default.
    */
  var DataFormat: js.UndefOr[EntityRecognizerDataFormat] = js.undefined
  
  /**
    * The S3 location of the folder that contains the training documents for your custom entity recognizer. This parameter is required if you set DataFormat to COMPREHEND_CSV.
    */
  var Documents: js.UndefOr[EntityRecognizerDocuments] = js.undefined
  
  /**
    * The S3 location of the CSV file that has the entity list for your custom entity recognizer.
    */
  var EntityList: js.UndefOr[EntityRecognizerEntityList] = js.undefined
  
  /**
    * The entity types in the labeled training data that Amazon Comprehend uses to train the custom entity recognizer. Any entity types that you don't specify are ignored. A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity types must not contain the following invalid characters: \n (line break), \\n (escaped line break), \r (carriage return), \\r (escaped carriage return), \t (tab), \\t (escaped tab), space, and , (comma). 
    */
  var EntityTypes: EntityTypesList
}
object EntityRecognizerInputDataConfig {
  
  inline def apply(EntityTypes: EntityTypesList): EntityRecognizerInputDataConfig = {
    val __obj = js.Dynamic.literal(EntityTypes = EntityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerInputDataConfig]
  }
  
  extension [Self <: EntityRecognizerInputDataConfig](x: Self) {
    
    inline def setAnnotations(value: EntityRecognizerAnnotations): Self = StObject.set(x, "Annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "Annotations", js.undefined)
    
    inline def setAugmentedManifests(value: EntityRecognizerAugmentedManifestsList): Self = StObject.set(x, "AugmentedManifests", value.asInstanceOf[js.Any])
    
    inline def setAugmentedManifestsUndefined: Self = StObject.set(x, "AugmentedManifests", js.undefined)
    
    inline def setAugmentedManifestsVarargs(value: AugmentedManifestsListItem*): Self = StObject.set(x, "AugmentedManifests", js.Array(value*))
    
    inline def setDataFormat(value: EntityRecognizerDataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "DataFormat", js.undefined)
    
    inline def setDocuments(value: EntityRecognizerDocuments): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "Documents", js.undefined)
    
    inline def setEntityList(value: EntityRecognizerEntityList): Self = StObject.set(x, "EntityList", value.asInstanceOf[js.Any])
    
    inline def setEntityListUndefined: Self = StObject.set(x, "EntityList", js.undefined)
    
    inline def setEntityTypes(value: EntityTypesList): Self = StObject.set(x, "EntityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesVarargs(value: EntityTypesListItem*): Self = StObject.set(x, "EntityTypes", js.Array(value*))
  }
}
