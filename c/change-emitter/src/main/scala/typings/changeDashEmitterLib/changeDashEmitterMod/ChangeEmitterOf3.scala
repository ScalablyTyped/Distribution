package typings
package changeDashEmitterLib.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf3[T1, T2, T3] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3): scala.Unit
  def listen(listener: ListenerOf3[T1, T2, T3]): Unlisten
}

object ChangeEmitterOf3 {
  @scala.inline
  def apply[T1, T2, T3](
    emit: js.Function3[T1, T2, T3, scala.Unit],
    listen: js.Function1[ListenerOf3[T1, T2, T3], Unlisten]
  ): ChangeEmitterOf3[T1, T2, T3] = {
    val __obj = js.Dynamic.literal(emit = emit, listen = listen)
  
    __obj.asInstanceOf[ChangeEmitterOf3[T1, T2, T3]]
  }
}

