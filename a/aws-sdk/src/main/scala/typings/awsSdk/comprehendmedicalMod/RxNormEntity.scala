package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RxNormEntity extends js.Object {
  
  /**
    * The extracted attributes that relate to the entity. The attributes recognized by InferRxNorm are DOSAGE, DURATION, FORM, FREQUENCY, RATE, ROUTE_OR_MODE, and STRENGTH.
    */
  var Attributes: js.UndefOr[RxNormAttributeList] = js.native
  
  /**
    * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  
  /**
    * The category of the entity. The recognized categories are GENERIC or BRAND_NAME.
    */
  var Category: js.UndefOr[RxNormEntityCategory] = js.native
  
  /**
    * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  
  /**
    * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.native
  
  /**
    *  The RxNorm concepts that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  var RxNormConcepts: js.UndefOr[RxNormConceptList] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detected entity.
    */
  var Score: js.UndefOr[Float] = js.native
  
  /**
    * The segment of input text extracted from which the entity was detected.
    */
  var Text: js.UndefOr[OntologyLinkingBoundedLengthString] = js.native
  
  /**
    *  Contextual information for the entity.
    */
  var Traits: js.UndefOr[RxNormTraitList] = js.native
  
  /**
    *  Describes the specific type of entity. For InferRxNorm, the recognized entity type is MEDICATION.
    */
  var Type: js.UndefOr[RxNormEntityType] = js.native
}
object RxNormEntity {
  
  @scala.inline
  def apply(): RxNormEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormEntity]
  }
  
  @scala.inline
  implicit class RxNormEntityOps[Self <: RxNormEntity] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: RxNormAttribute*): Self = this.set("Attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: RxNormAttributeList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setBeginOffset(value: Integer): Self = this.set("BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginOffset: Self = this.set("BeginOffset", js.undefined)
    
    @scala.inline
    def setCategory(value: RxNormEntityCategory): Self = this.set("Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    
    @scala.inline
    def setEndOffset(value: Integer): Self = this.set("EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOffset: Self = this.set("EndOffset", js.undefined)
    
    @scala.inline
    def setId(value: Integer): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setRxNormConceptsVarargs(value: RxNormConcept*): Self = this.set("RxNormConcepts", js.Array(value :_*))
    
    @scala.inline
    def setRxNormConcepts(value: RxNormConceptList): Self = this.set("RxNormConcepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRxNormConcepts: Self = this.set("RxNormConcepts", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = this.set("Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("Score", js.undefined)
    
    @scala.inline
    def setText(value: OntologyLinkingBoundedLengthString): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
    
    @scala.inline
    def setTraitsVarargs(value: RxNormTrait*): Self = this.set("Traits", js.Array(value :_*))
    
    @scala.inline
    def setTraits(value: RxNormTraitList): Self = this.set("Traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraits: Self = this.set("Traits", js.undefined)
    
    @scala.inline
    def setType(value: RxNormEntityType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
