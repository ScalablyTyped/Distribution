package typings.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf5[T1, T2, T3, T4, T5] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3, value4: T4, value5: T5): Unit
  def listen(listener: ListenerOf5[T1, T2, T3, T4, T5]): Unlisten
}

object ChangeEmitterOf5 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5](emit: (T1, T2, T3, T4, T5) => Unit, listen: ListenerOf5[T1, T2, T3, T4, T5] => Unlisten): ChangeEmitterOf5[T1, T2, T3, T4, T5] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction5(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf5[T1, T2, T3, T4, T5]]
  }
}

