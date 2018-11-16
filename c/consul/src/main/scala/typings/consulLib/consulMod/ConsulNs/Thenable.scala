package typings
package consulLib.consulMod.ConsulNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thenable[T] extends js.Object {
  def `catch`[U](): Thenable[U] = js.native
  def `catch`[U](onRejected: js.Function1[/* error */ js.Any, U | Thenable[U]]): Thenable[U] = js.native
  def `then`[U](): Thenable[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ T, U | Thenable[U]]): Thenable[U] = js.native
  def `then`[U](
    onFulfilled: js.Function1[/* value */ T, U | Thenable[U]],
    onRejected: js.Function1[/* error */ js.Any, U | Thenable[U] | scala.Unit]
  ): Thenable[U] = js.native
}

