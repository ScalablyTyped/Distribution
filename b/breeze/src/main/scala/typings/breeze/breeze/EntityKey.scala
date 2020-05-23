package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityKey extends js.Object {
  var entityType: EntityType
  var values: js.Array[_]
  def equals(entityKey: EntityKey): Boolean
}

object EntityKey {
  @scala.inline
  def apply(entityType: EntityType, equals: EntityKey => Boolean, values: js.Array[_]): EntityKey = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityKey]
  }
}

