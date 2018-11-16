package typings
package changeDashEmitterLib.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChangeEmitterOf4[T1, T2, T3, T4] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3, value4: T4): scala.Unit
  def listen(listener: ListenerOf4[T1, T2, T3, T4]): Unlisten
}

