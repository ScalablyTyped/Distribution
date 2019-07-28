package typings.changeDashEmitter.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitter extends js.Object {
  def emit(args: js.Any*): Unit
  def listen(listener: Listener): Unlisten
}

object ChangeEmitter {
  @scala.inline
  def apply(emit: /* repeated */ js.Any => Unit, listen: Listener => Unlisten): ChangeEmitter = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listen = js.Any.fromFunction1(listen))
  
    __obj.asInstanceOf[ChangeEmitter]
  }
}

