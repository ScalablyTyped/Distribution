package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entity extends js.Object {
  /**
    *  The extracted attributes that relate to this entity.
    */
  var Attributes: js.UndefOr[AttributeList] = js.native
  /**
    *  The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8 code point in the string. 
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  /**
    *  The category of the entity.
    */
  var Category: js.UndefOr[EntityType] = js.native
  /**
    *  The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8 code point in the string. 
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  /**
    *  The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather than a global unique identifier. 
    */
  var Id: js.UndefOr[Integer] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.native
  /**
    *  The segment of input text extracted as this entity.
    */
  var Text: js.UndefOr[String] = js.native
  /**
    * Contextual information for the entity.
    */
  var Traits: js.UndefOr[TraitList] = js.native
  /**
    *  Describes the specific type of entity with category of entities.
    */
  var Type: js.UndefOr[EntitySubType] = js.native
}

object Entity {
  @scala.inline
  def apply(
    Attributes: AttributeList = null,
    BeginOffset: Int | Double = null,
    Category: EntityType = null,
    EndOffset: Int | Double = null,
    Id: Int | Double = null,
    Score: Int | Double = null,
    Text: String = null,
    Traits: TraitList = null,
    Type: EntitySubType = null
  ): Entity = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (BeginOffset != null) __obj.updateDynamic("BeginOffset")(BeginOffset.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (EndOffset != null) __obj.updateDynamic("EndOffset")(EndOffset.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Score != null) __obj.updateDynamic("Score")(Score.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (Traits != null) __obj.updateDynamic("Traits")(Traits.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

