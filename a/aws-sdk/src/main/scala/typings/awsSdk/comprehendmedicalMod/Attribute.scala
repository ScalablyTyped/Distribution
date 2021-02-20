package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribute extends StObject {
  
  /**
    *  The 0-based character offset in the input text that shows where the attribute begins. The offset returns the UTF-8 code point in the string. 
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  
  /**
    *  The category of attribute. 
    */
  var Category: js.UndefOr[EntityType] = js.native
  
  /**
    *  The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  
  /**
    *  The numeric identifier for this attribute. This is a monotonically increasing id unique within this response rather than a global unique identifier. 
    */
  var Id: js.UndefOr[Integer] = js.native
  
  /**
    *  The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to this entity. 
    */
  var RelationshipScore: js.UndefOr[Float] = js.native
  
  /**
    * The type of relationship between the entity and attribute. Type for the relationship is OVERLAP, indicating that the entity occurred at the same time as the Date_Expression. 
    */
  var RelationshipType: js.UndefOr[typings.awsSdk.comprehendmedicalMod.RelationshipType] = js.native
  
  /**
    *  The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly recognized as an attribute. 
    */
  var Score: js.UndefOr[Float] = js.native
  
  /**
    *  The segment of input text extracted as this attribute.
    */
  var Text: js.UndefOr[String] = js.native
  
  /**
    *  Contextual information for this attribute. 
    */
  var Traits: js.UndefOr[TraitList] = js.native
  
  /**
    *  The type of attribute. 
    */
  var Type: js.UndefOr[EntitySubType] = js.native
}
object Attribute {
  
  @scala.inline
  def apply(): Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    @scala.inline
    def setCategory(value: EntityType): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
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
    def setRelationshipType(value: RelationshipType): Self = StObject.set(x, "RelationshipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipTypeUndefined: Self = StObject.set(x, "RelationshipType", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    @scala.inline
    def setTraits(value: TraitList): Self = StObject.set(x, "Traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraitsUndefined: Self = StObject.set(x, "Traits", js.undefined)
    
    @scala.inline
    def setTraitsVarargs(value: Trait*): Self = StObject.set(x, "Traits", js.Array(value :_*))
    
    @scala.inline
    def setType(value: EntitySubType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
