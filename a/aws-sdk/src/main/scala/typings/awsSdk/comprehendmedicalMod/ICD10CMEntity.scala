package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICD10CMEntity extends js.Object {
  
  /**
    * The detected attributes that relate to the entity. An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as the nature of a medical condition.
    */
  var Attributes: js.UndefOr[ICD10CMAttributeList] = js.native
  
  /**
    * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  
  /**
    *  The category of the entity. InferICD10CM detects entities in the MEDICAL_CONDITION category. 
    */
  var Category: js.UndefOr[ICD10CMEntityCategory] = js.native
  
  /**
    * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  
  /**
    * The ICD-10-CM concepts that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  var ICD10CMConcepts: js.UndefOr[ICD10CMConceptList] = js.native
  
  /**
    * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.native
  
  /**
    * The segment of input text that is matched to the detected entity.
    */
  var Text: js.UndefOr[OntologyLinkingBoundedLengthString] = js.native
  
  /**
    * Provides Contextual information for the entity. The traits recognized by InferICD10CM are DIAGNOSIS, SIGN, SYMPTOM, and NEGATION. 
    */
  var Traits: js.UndefOr[ICD10CMTraitList] = js.native
  
  /**
    * Describes the specific type of entity with category of entities. InferICD10CM detects entities of the type DX_NAME.
    */
  var Type: js.UndefOr[ICD10CMEntityType] = js.native
}
object ICD10CMEntity {
  
  @scala.inline
  def apply(): ICD10CMEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICD10CMEntity]
  }
  
  @scala.inline
  implicit class ICD10CMEntityOps[Self <: ICD10CMEntity] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: ICD10CMAttribute*): Self = this.set("Attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: ICD10CMAttributeList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setBeginOffset(value: Integer): Self = this.set("BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginOffset: Self = this.set("BeginOffset", js.undefined)
    
    @scala.inline
    def setCategory(value: ICD10CMEntityCategory): Self = this.set("Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    
    @scala.inline
    def setEndOffset(value: Integer): Self = this.set("EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOffset: Self = this.set("EndOffset", js.undefined)
    
    @scala.inline
    def setICD10CMConceptsVarargs(value: ICD10CMConcept*): Self = this.set("ICD10CMConcepts", js.Array(value :_*))
    
    @scala.inline
    def setICD10CMConcepts(value: ICD10CMConceptList): Self = this.set("ICD10CMConcepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteICD10CMConcepts: Self = this.set("ICD10CMConcepts", js.undefined)
    
    @scala.inline
    def setId(value: Integer): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = this.set("Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("Score", js.undefined)
    
    @scala.inline
    def setText(value: OntologyLinkingBoundedLengthString): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
    
    @scala.inline
    def setTraitsVarargs(value: ICD10CMTrait*): Self = this.set("Traits", js.Array(value :_*))
    
    @scala.inline
    def setTraits(value: ICD10CMTraitList): Self = this.set("Traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraits: Self = this.set("Traits", js.undefined)
    
    @scala.inline
    def setType(value: ICD10CMEntityType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
