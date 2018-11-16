package typings
package bluebirdDashRetryLib.bluebirdDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bluebird-retry", JSImport.Namespace)
@js.native
object bluebirdDashRetryModMembers extends js.Object {
  def apply[T](func: js.Function1[/* param */ T, scala.Unit]): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def apply[T](
    func: js.Function1[/* param */ T, scala.Unit],
    options: bluebirdDashRetryLib.bluebirdDashRetryMod.retryNs.Options
  ): bluebirdLib.bluebirdMod.namespaced[T] = js.native
}

