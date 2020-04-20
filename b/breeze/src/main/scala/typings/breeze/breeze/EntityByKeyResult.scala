package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityByKeyResult extends js.Object {
  var entity: Entity
  var entityKey: EntityKey
  var fromCache: Boolean
}

object EntityByKeyResult {
  @scala.inline
  def apply(entity: Entity, entityKey: EntityKey, fromCache: Boolean): EntityByKeyResult = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], entityKey = entityKey.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityByKeyResult]
  }
}

