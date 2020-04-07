package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import typings.std.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandler extends js.Object {
  var handler: Nullable[js.Function1[/* e */ FocusEvent, _]]
  var name: String
}

object AnonHandler {
  @scala.inline
  def apply(name: String, handler: /* e */ FocusEvent => _ = null): AnonHandler = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1(handler))
    __obj.asInstanceOf[AnonHandler]
  }
}

