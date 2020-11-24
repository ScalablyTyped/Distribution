package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityRecognizerInputDataConfig extends js.Object {
  
  /**
    * The S3 location of the CSV file that annotates your training documents.
    */
  var Annotations: js.UndefOr[EntityRecognizerAnnotations] = js.native
  
  /**
    * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth. This parameter is required if you set DataFormat to AUGMENTED_MANIFEST.
    */
  var AugmentedManifests: js.UndefOr[EntityRecognizerAugmentedManifestsList] = js.native
  
  /**
    * The format of your training data:    COMPREHEND_CSV: A CSV file that supplements your training documents. The CSV file contains information about the custom entities that your trained model will detect. The required format of the file depends on whether you are providing annotations or an entity list. If you use this value, you must provide your CSV file by using either the Annotations or EntityList parameters. You must provide your training documents by using the Documents parameter.    AUGMENTED_MANIFEST: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file is in JSON lines format. Each line is a complete JSON object that contains a training document and its labels. Each label annotates a named entity in the training document.  If you use this value, you must provide the AugmentedManifests parameter in your request.   If you don't specify a value, Amazon Comprehend uses COMPREHEND_CSV as the default.
    */
  var DataFormat: js.UndefOr[EntityRecognizerDataFormat] = js.native
  
  /**
    * The S3 location of the folder that contains the training documents for your custom entity recognizer. This parameter is required if you set DataFormat to COMPREHEND_CSV.
    */
  var Documents: js.UndefOr[EntityRecognizerDocuments] = js.native
  
  /**
    * The S3 location of the CSV file that has the entity list for your custom entity recognizer.
    */
  var EntityList: js.UndefOr[EntityRecognizerEntityList] = js.native
  
  /**
    * The entity types in the labeled training data that Amazon Comprehend uses to train the custom entity recognizer. Any entity types that you don't specify are ignored. A maximum of 25 entity types can be used at one time to train an entity recognizer. Entity types must not contain the following invalid characters: \n (line break), \\n (escaped line break), \r (carriage return), \\r (escaped carriage return), \t (tab), \\t (escaped tab), space, and , (comma). 
    */
  var EntityTypes: EntityTypesList = js.native
}
object EntityRecognizerInputDataConfig {
  
  @scala.inline
  def apply(EntityTypes: EntityTypesList): EntityRecognizerInputDataConfig = {
    val __obj = js.Dynamic.literal(EntityTypes = EntityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerInputDataConfig]
  }
  
  @scala.inline
  implicit class EntityRecognizerInputDataConfigOps[Self <: EntityRecognizerInputDataConfig] (val x: Self) extends AnyVal {
    
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
    def setEntityTypesVarargs(value: EntityTypesListItem*): Self = this.set("EntityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEntityTypes(value: EntityTypesList): Self = this.set("EntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotations(value: EntityRecognizerAnnotations): Self = this.set("Annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("Annotations", js.undefined)
    
    @scala.inline
    def setAugmentedManifestsVarargs(value: AugmentedManifestsListItem*): Self = this.set("AugmentedManifests", js.Array(value :_*))
    
    @scala.inline
    def setAugmentedManifests(value: EntityRecognizerAugmentedManifestsList): Self = this.set("AugmentedManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAugmentedManifests: Self = this.set("AugmentedManifests", js.undefined)
    
    @scala.inline
    def setDataFormat(value: EntityRecognizerDataFormat): Self = this.set("DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFormat: Self = this.set("DataFormat", js.undefined)
    
    @scala.inline
    def setDocuments(value: EntityRecognizerDocuments): Self = this.set("Documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocuments: Self = this.set("Documents", js.undefined)
    
    @scala.inline
    def setEntityList(value: EntityRecognizerEntityList): Self = this.set("EntityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityList: Self = this.set("EntityList", js.undefined)
  }
}
