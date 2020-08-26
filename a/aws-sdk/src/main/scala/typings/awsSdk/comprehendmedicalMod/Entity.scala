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
  def apply(): Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entity]
  }
  @scala.inline
  implicit class EntityOps[Self <: Entity] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: Attribute*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: AttributeList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setBeginOffset(value: Integer): Self = this.set("BeginOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginOffset: Self = this.set("BeginOffset", js.undefined)
    @scala.inline
    def setCategory(value: EntityType): Self = this.set("Category", value.asInstanceOf[js.Any])
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
    def setScore(value: Float): Self = this.set("Score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("Score", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
    @scala.inline
    def setTraitsVarargs(value: Trait*): Self = this.set("Traits", js.Array(value :_*))
    @scala.inline
    def setTraits(value: TraitList): Self = this.set("Traits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraits: Self = this.set("Traits", js.undefined)
    @scala.inline
    def setType(value: EntitySubType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

