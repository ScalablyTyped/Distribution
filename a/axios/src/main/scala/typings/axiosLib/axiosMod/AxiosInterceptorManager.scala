package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxiosInterceptorManager[V] extends js.Object {
  def eject(id: scala.Double): scala.Unit = js.native
  def use(): scala.Double = js.native
  def use(onFulfilled: js.Function1[/* value */ V, V | stdLib.Promise[V]]): scala.Double = js.native
  def use(
    onFulfilled: js.Function1[/* value */ V, V | stdLib.Promise[V]],
    onRejected: js.Function1[/* error */ js.Any, _]
  ): scala.Double = js.native
}

