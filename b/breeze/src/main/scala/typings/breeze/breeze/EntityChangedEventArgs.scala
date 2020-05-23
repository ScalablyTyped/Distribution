package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityChangedEventArgs extends js.Object {
  var args: js.Object
  var entity: Entity
  var entityAction: EntityActionSymbol
}

object EntityChangedEventArgs {
  @scala.inline
  def apply(args: js.Object, entity: Entity, entityAction: EntityActionSymbol): EntityChangedEventArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], entityAction = entityAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityChangedEventArgs]
  }
}

