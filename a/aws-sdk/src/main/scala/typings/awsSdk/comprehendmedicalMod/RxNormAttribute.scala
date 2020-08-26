package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RxNormAttribute extends js.Object {
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
    * The level of confidence that Amazon Comprehend Medical has that the attribute is accurately linked to an entity.
    */
  var RelationshipScore: js.UndefOr[Float] = js.native
  /**
    * The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an attribute.
    */
  var Score: js.UndefOr[Float] = js.native
  /**
    * The segment of input text which corresponds to the detected attribute.
    */
  var Text: js.UndefOr[String] = js.native
  /**
    * Contextual information for the attribute. InferRxNorm recognizes the trait NEGATION for attributes, i.e. that the patient is not taking a specific dose or form of a medication.
    */
  var Traits: js.UndefOr[RxNormTraitList] = js.native
  /**
    * The type of attribute. The types of attributes recognized by InferRxNorm are BRAND_NAME and GENERIC_NAME.
    */
  var Type: js.UndefOr[RxNormAttributeType] = js.native
}

object RxNormAttribute {
  @scala.inline
  def apply(): RxNormAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormAttribute]
  }
  @scala.inline
  implicit class RxNormAttributeOps[Self <: RxNormAttribute] (val x: Self) extends AnyVal {
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
    def setTraitsVarargs(value: RxNormTrait*): Self = this.set("Traits", js.Array(value :_*))
    @scala.inline
    def setTraits(value: RxNormTraitList): Self = this.set("Traits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraits: Self = this.set("Traits", js.undefined)
    @scala.inline
    def setType(value: RxNormAttributeType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

