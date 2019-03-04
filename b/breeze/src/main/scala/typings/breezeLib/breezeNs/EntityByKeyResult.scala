package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityByKeyResult extends js.Object {
  var entity: Entity
  var entityKey: EntityKey
  var fromCache: scala.Boolean
}

object EntityByKeyResult {
  @scala.inline
  def apply(entity: Entity, entityKey: EntityKey, fromCache: scala.Boolean): EntityByKeyResult = {
    val __obj = js.Dynamic.literal(entity = entity, entityKey = entityKey, fromCache = fromCache)
  
    __obj.asInstanceOf[EntityByKeyResult]
  }
}

