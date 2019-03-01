package typings
package changeDashEmitterLib.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf1[T] extends js.Object {
  def emit(value: T): scala.Unit
  def listen(listener: ListenerOf1[T]): Unlisten
}

object ChangeEmitterOf1 {
  @scala.inline
  def apply[T](emit: js.Function1[T, scala.Unit], listen: js.Function1[ListenerOf1[T], Unlisten]): ChangeEmitterOf1[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("listen")(listen)
    __obj.asInstanceOf[ChangeEmitterOf1[T]]
  }
}

