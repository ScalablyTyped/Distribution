package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entity extends js.Object {
  var entityAspect: EntityAspect = js.native
  var entityType: EntityType = js.native
}

object Entity {
  @scala.inline
  def apply(entityAspect: EntityAspect, entityType: EntityType): Entity = {
    val __obj = js.Dynamic.literal(entityAspect = entityAspect.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  @scala.inline
  implicit class EntityOps[Self <: Entity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntityAspect(value: EntityAspect): Self = this.set("entityAspect", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityType(value: EntityType): Self = this.set("entityType", value.asInstanceOf[js.Any])
  }
  
}

