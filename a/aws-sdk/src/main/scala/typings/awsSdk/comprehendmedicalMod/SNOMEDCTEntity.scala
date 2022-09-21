package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SNOMEDCTEntity extends StObject {
  
  /**
    *  An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as the dosage of a medication taken. 
    */
  var Attributes: js.UndefOr[SNOMEDCTAttributeList] = js.undefined
  
  /**
    *  The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8 code point in the string. 
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The category of the detected entity. Possible categories are MEDICAL_CONDITION, ANATOMY, or TEST_TREATMENT_PROCEDURE. 
    */
  var Category: js.UndefOr[SNOMEDCTEntityCategory] = js.undefined
  
  /**
    *  The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8 code point in the string. 
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather than a global unique identifier. 
    */
  var Id: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The SNOMED concepts that the entity could refer to, along with a score indicating the likelihood of the match. 
    */
  var SNOMEDCTConcepts: js.UndefOr[SNOMEDCTConceptList] = js.undefined
  
  /**
    *  The level of confidence that Comprehend Medical has in the accuracy of the detected entity. 
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    *  The segment of input text extracted as this entity. 
    */
  var Text: js.UndefOr[OntologyLinkingBoundedLengthString] = js.undefined
  
  /**
    *  Contextual information for the entity. 
    */
  var Traits: js.UndefOr[SNOMEDCTTraitList] = js.undefined
  
  /**
    *  Describes the specific type of entity with category of entities. Possible types include DX_NAME, ACUITY, DIRECTION, SYSTEM_ORGAN_SITE, TEST_NAME, TEST_VALUE, TEST_UNIT, PROCEDURE_NAME, or TREATMENT_NAME. 
    */
  var Type: js.UndefOr[SNOMEDCTEntityType] = js.undefined
}
object SNOMEDCTEntity {
  
  inline def apply(): SNOMEDCTEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SNOMEDCTEntity]
  }
  
  extension [Self <: SNOMEDCTEntity](x: Self) {
    
    inline def setAttributes(value: SNOMEDCTAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: SNOMEDCTAttribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setCategory(value: SNOMEDCTEntityCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    inline def setId(value: Integer): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setSNOMEDCTConcepts(value: SNOMEDCTConceptList): Self = StObject.set(x, "SNOMEDCTConcepts", value.asInstanceOf[js.Any])
    
    inline def setSNOMEDCTConceptsUndefined: Self = StObject.set(x, "SNOMEDCTConcepts", js.undefined)
    
    inline def setSNOMEDCTConceptsVarargs(value: SNOMEDCTConcept*): Self = StObject.set(x, "SNOMEDCTConcepts", js.Array(value*))
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setText(value: OntologyLinkingBoundedLengthString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setTraits(value: SNOMEDCTTraitList): Self = StObject.set(x, "Traits", value.asInstanceOf[js.Any])
    
    inline def setTraitsUndefined: Self = StObject.set(x, "Traits", js.undefined)
    
    inline def setTraitsVarargs(value: SNOMEDCTTrait*): Self = StObject.set(x, "Traits", js.Array(value*))
    
    inline def setType(value: SNOMEDCTEntityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
