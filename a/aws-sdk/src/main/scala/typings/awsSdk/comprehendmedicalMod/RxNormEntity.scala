package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Attributes: RxNormAttributeList = null,
    BeginOffset: js.UndefOr[Integer] = js.undefined,
    Category: RxNormEntityCategory = null,
    EndOffset: js.UndefOr[Integer] = js.undefined,
    Id: js.UndefOr[Integer] = js.undefined,
    RxNormConcepts: RxNormConceptList = null,
    Score: js.UndefOr[Float] = js.undefined,
    Text: OntologyLinkingBoundedLengthString = null,
    Traits: RxNormTraitList = null,
    Type: RxNormEntityType = null
  ): RxNormEntity = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(BeginOffset)) __obj.updateDynamic("BeginOffset")(BeginOffset.get.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (!js.isUndefined(EndOffset)) __obj.updateDynamic("EndOffset")(EndOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Id)) __obj.updateDynamic("Id")(Id.get.asInstanceOf[js.Any])
    if (RxNormConcepts != null) __obj.updateDynamic("RxNormConcepts")(RxNormConcepts.asInstanceOf[js.Any])
    if (!js.isUndefined(Score)) __obj.updateDynamic("Score")(Score.get.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (Traits != null) __obj.updateDynamic("Traits")(Traits.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RxNormEntity]
  }
}

