package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  /**
    *  The 0-based character offset in the input text that shows where the attribute begins. The offset returns the UTF-8 code point in the string. 
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The category of attribute. 
    */
  var Category: js.UndefOr[EntityType] = js.undefined
  
  /**
    *  The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The numeric identifier for this attribute. This is a monotonically increasing id unique within this response rather than a global unique identifier. 
    */
  var Id: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The level of confidence that Comprehend Medical; has that this attribute is correctly related to this entity. 
    */
  var RelationshipScore: js.UndefOr[Float] = js.undefined
  
  /**
    * The type of relationship between the entity and attribute. Type for the relationship is OVERLAP, indicating that the entity occurred at the same time as the Date_Expression. 
    */
  var RelationshipType: js.UndefOr[typings.awsSdk.comprehendmedicalMod.RelationshipType] = js.undefined
  
  /**
    *  The level of confidence that Comprehend Medical; has that the segment of text is correctly recognized as an attribute. 
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    *  The segment of input text extracted as this attribute.
    */
  var Text: js.UndefOr[String] = js.undefined
  
  /**
    *  Contextual information for this attribute. 
    */
  var Traits: js.UndefOr[TraitList] = js.undefined
  
  /**
    *  The type of attribute. 
    */
  var Type: js.UndefOr[EntitySubType] = js.undefined
}
object Attribute {
  
  inline def apply(): Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setCategory(value: EntityType): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    inline def setId(value: Integer): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setRelationshipScore(value: Float): Self = StObject.set(x, "RelationshipScore", value.asInstanceOf[js.Any])
    
    inline def setRelationshipScoreUndefined: Self = StObject.set(x, "RelationshipScore", js.undefined)
    
    inline def setRelationshipType(value: RelationshipType): Self = StObject.set(x, "RelationshipType", value.asInstanceOf[js.Any])
    
    inline def setRelationshipTypeUndefined: Self = StObject.set(x, "RelationshipType", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setTraits(value: TraitList): Self = StObject.set(x, "Traits", value.asInstanceOf[js.Any])
    
    inline def setTraitsUndefined: Self = StObject.set(x, "Traits", js.undefined)
    
    inline def setTraitsVarargs(value: Trait*): Self = StObject.set(x, "Traits", js.Array(value*))
    
    inline def setType(value: EntitySubType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
