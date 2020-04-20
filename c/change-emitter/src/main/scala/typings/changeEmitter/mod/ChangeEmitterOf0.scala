package typings.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf0 extends js.Object {
  def emit(): Unit
  def listen(listener: ListenerOf0): Unlisten
}

object ChangeEmitterOf0 {
  @scala.inline
  def apply(emit: () => Unit, listen: ListenerOf0 => Unlisten): ChangeEmitterOf0 = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction0(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf0]
  }
}

