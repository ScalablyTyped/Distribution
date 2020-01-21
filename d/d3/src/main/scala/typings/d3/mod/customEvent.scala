package typings.d3.mod

import typings.d3Selection.mod.BaseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "customEvent")
@js.native
object customEvent extends js.Object {
  def apply[Context, Result](
    event: BaseEvent,
    listener: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, Result],
    that: Context,
    args: js.Any*
  ): Result = js.native
}

