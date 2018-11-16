package typings
package changeDashEmitterLib.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChangeEmitterOf1[T] extends js.Object {
  def emit(value: T): scala.Unit
  def listen(listener: ListenerOf1[T]): Unlisten
}

