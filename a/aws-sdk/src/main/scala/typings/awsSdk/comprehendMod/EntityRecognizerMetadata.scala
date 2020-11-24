package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): EntityRecognizerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerMetadata]
  }
  
  @scala.inline
  implicit class EntityRecognizerMetadataOps[Self <: EntityRecognizerMetadata] (val x: Self) extends AnyVal {
    
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
    def setEntityTypesVarargs(value: EntityRecognizerMetadataEntityTypesListItem*): Self = this.set("EntityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEntityTypes(value: EntityRecognizerMetadataEntityTypesList): Self = this.set("EntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityTypes: Self = this.set("EntityTypes", js.undefined)
    
    @scala.inline
    def setEvaluationMetrics(value: EntityRecognizerEvaluationMetrics): Self = this.set("EvaluationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationMetrics: Self = this.set("EvaluationMetrics", js.undefined)
    
    @scala.inline
    def setNumberOfTestDocuments(value: Integer): Self = this.set("NumberOfTestDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfTestDocuments: Self = this.set("NumberOfTestDocuments", js.undefined)
    
    @scala.inline
    def setNumberOfTrainedDocuments(value: Integer): Self = this.set("NumberOfTrainedDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfTrainedDocuments: Self = this.set("NumberOfTrainedDocuments", js.undefined)
  }
}
