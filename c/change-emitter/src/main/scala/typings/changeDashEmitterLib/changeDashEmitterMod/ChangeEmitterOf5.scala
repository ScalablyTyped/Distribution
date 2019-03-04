package typings
package changeDashEmitterLib.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf5[T1, T2, T3, T4, T5] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3, value4: T4, value5: T5): scala.Unit
  def listen(listener: ListenerOf5[T1, T2, T3, T4, T5]): Unlisten
}

object ChangeEmitterOf5 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5](
    emit: js.Function5[T1, T2, T3, T4, T5, scala.Unit],
    listen: js.Function1[ListenerOf5[T1, T2, T3, T4, T5], Unlisten]
  ): ChangeEmitterOf5[T1, T2, T3, T4, T5] = {
    val __obj = js.Dynamic.literal(emit = emit, listen = listen)
  
    __obj.asInstanceOf[ChangeEmitterOf5[T1, T2, T3, T4, T5]]
  }
}

