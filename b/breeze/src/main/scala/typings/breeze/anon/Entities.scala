package typings.breeze.anon

import org.scalablytyped.runtime.StringDictionary
import typings.breeze.breeze.Entity
import typings.breeze.breeze.EntityKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entities extends js.Object {
  var entities: js.Array[Entity] = js.native
  var tempKeyMapping: StringDictionary[EntityKey] = js.native
}

object Entities {
  @scala.inline
  def apply(entities: js.Array[Entity], tempKeyMapping: StringDictionary[EntityKey]): Entities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], tempKeyMapping = tempKeyMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entities]
  }
  @scala.inline
  implicit class EntitiesOps[Self <: Entities] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: Entity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempKeyMapping(value: StringDictionary[EntityKey]): Self = this.set("tempKeyMapping", value.asInstanceOf[js.Any])
  }
  
}

