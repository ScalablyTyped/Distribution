package typings
package changeDashEmitterLib.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf2[T1, T2] extends js.Object {
  def emit(value1: T1, value2: T2): scala.Unit
  def listen(listener: ListenerOf2[T1, T2]): Unlisten
}

object ChangeEmitterOf2 {
  @scala.inline
  def apply[T1, T2](emit: js.Function2[T1, T2, scala.Unit], listen: js.Function1[ListenerOf2[T1, T2], Unlisten]): ChangeEmitterOf2[T1, T2] = {
    val __obj = js.Dynamic.literal(emit = emit, listen = listen)
  
    __obj.asInstanceOf[ChangeEmitterOf2[T1, T2]]
  }
}

