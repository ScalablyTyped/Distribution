package typings.babylonjs

import typings.babylonjs.BABYLON.Nullable
import typings.std.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandlerName extends js.Object {
  var handler: Nullable[js.Function1[/* e */ FocusEvent, _]]
  var name: String
}

object AnonHandlerName {
  @scala.inline
  def apply(name: String, handler: /* e */ FocusEvent => _ = null): AnonHandlerName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1(handler))
    __obj.asInstanceOf[AnonHandlerName]
  }
}

