package typings.changeDashEmitter.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf2[T1, T2] extends js.Object {
  def emit(value1: T1, value2: T2): Unit
  def listen(listener: ListenerOf2[T1, T2]): Unlisten
}

object ChangeEmitterOf2 {
  @scala.inline
  def apply[T1, T2](emit: (T1, T2) => Unit, listen: ListenerOf2[T1, T2] => Unlisten): ChangeEmitterOf2[T1, T2] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), listen = js.Any.fromFunction1(listen))
  
    __obj.asInstanceOf[ChangeEmitterOf2[T1, T2]]
  }
}

