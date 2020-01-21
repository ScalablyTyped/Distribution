package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    BeginOffset: Int | Double = null,
    EndOffset: Int | Double = null,
    Id: Int | Double = null,
    RelationshipScore: Int | Double = null,
    Score: Int | Double = null,
    Text: String = null,
    Traits: ICD10CMTraitList = null,
    Type: ICD10CMAttributeType = null
  ): ICD10CMAttribute = {
    val __obj = js.Dynamic.literal()
    if (BeginOffset != null) __obj.updateDynamic("BeginOffset")(BeginOffset.asInstanceOf[js.Any])
    if (EndOffset != null) __obj.updateDynamic("EndOffset")(EndOffset.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (RelationshipScore != null) __obj.updateDynamic("RelationshipScore")(RelationshipScore.asInstanceOf[js.Any])
    if (Score != null) __obj.updateDynamic("Score")(Score.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (Traits != null) __obj.updateDynamic("Traits")(Traits.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICD10CMAttribute]
  }
}

