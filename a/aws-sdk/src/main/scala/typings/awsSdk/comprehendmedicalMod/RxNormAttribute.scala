package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RxNormAttribute extends StObject {
  
  /**
    * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that the attribute is accurately linked to an entity.
    */
  var RelationshipScore: js.UndefOr[Float] = js.undefined
  
  /**
    * The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an attribute.
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    * The segment of input text which corresponds to the detected attribute.
    */
  var Text: js.UndefOr[String] = js.undefined
  
  /**
    * Contextual information for the attribute. InferRxNorm recognizes the trait NEGATION for attributes, i.e. that the patient is not taking a specific dose or form of a medication.
    */
  var Traits: js.UndefOr[RxNormTraitList] = js.undefined
  
  /**
    * The type of attribute. The types of attributes recognized by InferRxNorm are BRAND_NAME and GENERIC_NAME.
    */
  var Type: js.UndefOr[RxNormAttributeType] = js.undefined
}
object RxNormAttribute {
  
  @scala.inline
  def apply(): RxNormAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormAttribute]
  }
  
  @scala.inline
  implicit class RxNormAttributeMutableBuilder[Self <: RxNormAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    @scala.inline
    def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    @scala.inline
    def setId(value: Integer): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setRelationshipScore(value: Float): Self = StObject.set(x, "RelationshipScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipScoreUndefined: Self = StObject.set(x, "RelationshipScore", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    @scala.inline
    def setTraits(value: RxNormTraitList): Self = StObject.set(x, "Traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraitsUndefined: Self = StObject.set(x, "Traits", js.undefined)
    
    @scala.inline
    def setTraitsVarargs(value: RxNormTrait*): Self = StObject.set(x, "Traits", js.Array(value :_*))
    
    @scala.inline
    def setType(value: RxNormAttributeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
