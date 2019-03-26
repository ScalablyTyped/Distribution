package typings
package bluebirdDashGlobalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ErrorOnFulfilled[T] extends js.Object {
  def apply[U](): scala.Unit = js.native
  def apply[U](onFulfilled: js.Function1[/* value */ T, bluebirdLib.Resolvable[U]]): scala.Unit = js.native
  def apply[U](
    onFulfilled: js.Function1[/* value */ T, bluebirdLib.Resolvable[U]],
    onRejected: js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[U]]
  ): scala.Unit = js.native
}

