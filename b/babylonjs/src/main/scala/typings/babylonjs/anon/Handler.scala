package typings.babylonjs.anon

import typings.babylonjs.typesMod.Nullable
import typings.std.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handler extends js.Object {
  var handler: Nullable[js.Function1[/* e */ FocusEvent, _]]
  var name: String
}

object Handler {
  @scala.inline
  def apply(name: String, handler: /* e */ FocusEvent => _ = null): Handler = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler))
    __obj.asInstanceOf[Handler]
  }
}

