package typings
package changeDashEmitterLib.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitter extends js.Object {
  def emit(args: js.Any*): scala.Unit
  def listen(listener: Listener): Unlisten
}

object ChangeEmitter {
  @scala.inline
  def apply(emit: js.Function1[/* repeated */ js.Any, scala.Unit], listen: js.Function1[Listener, Unlisten]): ChangeEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("listen")(listen)
    __obj.asInstanceOf[ChangeEmitter]
  }
}

