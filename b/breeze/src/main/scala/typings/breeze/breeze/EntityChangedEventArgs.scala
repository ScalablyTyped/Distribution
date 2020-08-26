package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityChangedEventArgs extends js.Object {
  var args: js.Object = js.native
  var entity: Entity = js.native
  var entityAction: EntityActionSymbol = js.native
}

object EntityChangedEventArgs {
  @scala.inline
  def apply(args: js.Object, entity: Entity, entityAction: EntityActionSymbol): EntityChangedEventArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], entityAction = entityAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityChangedEventArgs]
  }
  @scala.inline
  implicit class EntityChangedEventArgsOps[Self <: EntityChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setArgs(value: js.Object): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntity(value: Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityAction(value: EntityActionSymbol): Self = this.set("entityAction", value.asInstanceOf[js.Any])
  }
  
}

