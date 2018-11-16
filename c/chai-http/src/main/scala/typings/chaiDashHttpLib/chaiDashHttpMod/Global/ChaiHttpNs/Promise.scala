package typings
package chaiDashHttpLib.chaiDashHttpMod.Global.ChaiHttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T] extends js.Object {
  def `then`[U](onFulfilled: js.Function1[/* value */ T, U]): Promise[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ T, U], onRejected: js.Function1[/* reason */ js.Any, U]): Promise[U] = js.native
}

