package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICD10CMAttribute extends js.Object {
  
  /**
    * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  
  /**
    * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  
  /**
    * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to this entity.
    */
  var RelationshipScore: js.UndefOr[Float] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly recognized as an attribute.
    */
  var Score: js.UndefOr[Float] = js.native
  
  /**
    * The segment of input text which contains the detected attribute.
    */
  var Text: js.UndefOr[String] = js.native
  
  /**
    * The contextual information for the attribute. The traits recognized by InferICD10CM are DIAGNOSIS, SIGN, SYMPTOM, and NEGATION.
    */
  var Traits: js.UndefOr[ICD10CMTraitList] = js.native
  
  /**
    * The type of attribute. InferICD10CM detects entities of the type DX_NAME. 
    */
  var Type: js.UndefOr[ICD10CMAttributeType] = js.native
}
object ICD10CMAttribute {
  
  @scala.inline
  def apply(): ICD10CMAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICD10CMAttribute]
  }
  
  @scala.inline
  implicit class ICD10CMAttributeOps[Self <: ICD10CMAttribute] (val x: Self) extends AnyVal {
    
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
    def setBeginOffset(value: Integer): Self = this.set("BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginOffset: Self = this.set("BeginOffset", js.undefined)
    
    @scala.inline
    def setEndOffset(value: Integer): Self = this.set("EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOffset: Self = this.set("EndOffset", js.undefined)
    
    @scala.inline
    def setId(value: Integer): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setRelationshipScore(value: Float): Self = this.set("RelationshipScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipScore: Self = this.set("RelationshipScore", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = this.set("Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("Score", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
    
    @scala.inline
    def setTraitsVarargs(value: ICD10CMTrait*): Self = this.set("Traits", js.Array(value :_*))
    
    @scala.inline
    def setTraits(value: ICD10CMTraitList): Self = this.set("Traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraits: Self = this.set("Traits", js.undefined)
    
    @scala.inline
    def setType(value: ICD10CMAttributeType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
