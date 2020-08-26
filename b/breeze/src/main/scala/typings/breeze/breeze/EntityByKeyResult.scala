package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityByKeyResult extends js.Object {
  var entity: Entity = js.native
  var entityKey: EntityKey = js.native
  var fromCache: Boolean = js.native
}

object EntityByKeyResult {
  @scala.inline
  def apply(entity: Entity, entityKey: EntityKey, fromCache: Boolean): EntityByKeyResult = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], entityKey = entityKey.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityByKeyResult]
  }
  @scala.inline
  implicit class EntityByKeyResultOps[Self <: EntityByKeyResult] (val x: Self) extends AnyVal {
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
    def setEntity(value: Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityKey(value: EntityKey): Self = this.set("entityKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromCache(value: Boolean): Self = this.set("fromCache", value.asInstanceOf[js.Any])
  }
  
}

