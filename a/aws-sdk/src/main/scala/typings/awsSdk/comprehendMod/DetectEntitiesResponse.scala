package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectEntitiesResponse extends js.Object {
  /**
    * A collection of entities identified in the input text. For each entity, the response provides the entity text, entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the detection.  If your request uses a custom entity recognition model, Amazon Comprehend detects the entities that the model is trained to recognize. Otherwise, it detects the default entity types. For a list of default entity types, see how-entities.
    */
  var Entities: js.UndefOr[ListOfEntities] = js.native
}

object DetectEntitiesResponse {
  @scala.inline
  def apply(): DetectEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectEntitiesResponse]
  }
  @scala.inline
  implicit class DetectEntitiesResponseOps[Self <: DetectEntitiesResponse] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: Entity*): Self = this.set("Entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: ListOfEntities): Self = this.set("Entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("Entities", js.undefined)
  }
  
}

