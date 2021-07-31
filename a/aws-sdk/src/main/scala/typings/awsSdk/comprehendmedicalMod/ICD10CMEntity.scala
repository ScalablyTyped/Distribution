package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICD10CMEntity extends StObject {
  
  /**
    * The detected attributes that relate to the entity. An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as the nature of a medical condition.
    */
  var Attributes: js.UndefOr[ICD10CMAttributeList] = js.undefined
  
  /**
    * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The category of the entity. InferICD10CM detects entities in the MEDICAL_CONDITION category. 
    */
  var Category: js.UndefOr[ICD10CMEntityCategory] = js.undefined
  
  /**
    * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ICD-10-CM concepts that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  var ICD10CMConcepts: js.UndefOr[ICD10CMConceptList] = js.undefined
  
  /**
    * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    * The segment of input text that is matched to the detected entity.
    */
  var Text: js.UndefOr[OntologyLinkingBoundedLengthString] = js.undefined
  
  /**
    * Provides Contextual information for the entity. The traits recognized by InferICD10CM are DIAGNOSIS, SIGN, SYMPTOM, and NEGATION. 
    */
  var Traits: js.UndefOr[ICD10CMTraitList] = js.undefined
  
  /**
    * Describes the specific type of entity with category of entities. InferICD10CM detects entities of the type DX_NAME.
    */
  var Type: js.UndefOr[ICD10CMEntityType] = js.undefined
}
object ICD10CMEntity {
  
  @scala.inline
  def apply(): ICD10CMEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICD10CMEntity]
  }
  
  @scala.inline
  implicit class ICD10CMEntityMutableBuilder[Self <: ICD10CMEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: ICD10CMAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: ICD10CMAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    @scala.inline
    def setCategory(value: ICD10CMEntityCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    @scala.inline
    def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    @scala.inline
    def setICD10CMConcepts(value: ICD10CMConceptList): Self = StObject.set(x, "ICD10CMConcepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICD10CMConceptsUndefined: Self = StObject.set(x, "ICD10CMConcepts", js.undefined)
    
    @scala.inline
    def setICD10CMConceptsVarargs(value: ICD10CMConcept*): Self = StObject.set(x, "ICD10CMConcepts", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Integer): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    @scala.inline
    def setText(value: OntologyLinkingBoundedLengthString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    @scala.inline
    def setTraits(value: ICD10CMTraitList): Self = StObject.set(x, "Traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraitsUndefined: Self = StObject.set(x, "Traits", js.undefined)
    
    @scala.inline
    def setTraitsVarargs(value: ICD10CMTrait*): Self = StObject.set(x, "Traits", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ICD10CMEntityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
