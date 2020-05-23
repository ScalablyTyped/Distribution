package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
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
  def apply(
    BeginOffset: js.UndefOr[Integer] = js.undefined,
    Category: EntityType = null,
    EndOffset: js.UndefOr[Integer] = js.undefined,
    Id: js.UndefOr[Integer] = js.undefined,
    RelationshipScore: js.UndefOr[Float] = js.undefined,
    RelationshipType: RelationshipType = null,
    Score: js.UndefOr[Float] = js.undefined,
    Text: String = null,
    Traits: TraitList = null,
    Type: EntitySubType = null
  ): Attribute = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BeginOffset)) __obj.updateDynamic("BeginOffset")(BeginOffset.get.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (!js.isUndefined(EndOffset)) __obj.updateDynamic("EndOffset")(EndOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Id)) __obj.updateDynamic("Id")(Id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RelationshipScore)) __obj.updateDynamic("RelationshipScore")(RelationshipScore.get.asInstanceOf[js.Any])
    if (RelationshipType != null) __obj.updateDynamic("RelationshipType")(RelationshipType.asInstanceOf[js.Any])
    if (!js.isUndefined(Score)) __obj.updateDynamic("Score")(Score.get.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (Traits != null) __obj.updateDynamic("Traits")(Traits.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

