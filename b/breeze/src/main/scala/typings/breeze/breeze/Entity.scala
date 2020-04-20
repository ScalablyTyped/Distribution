package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  var entityAspect: EntityAspect
  var entityType: EntityType
}

object Entity {
  @scala.inline
  def apply(entityAspect: EntityAspect, entityType: EntityType): Entity = {
    val __obj = js.Dynamic.literal(entityAspect = entityAspect.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

