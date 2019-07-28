package typings.axios.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxiosInterceptorManager[V] extends js.Object {
  def eject(id: Double): Unit = js.native
  def use(): Double = js.native
  def use(onFulfilled: js.Function1[/* value */ V, V | js.Promise[V]]): Double = js.native
  def use(
    onFulfilled: js.Function1[/* value */ V, V | js.Promise[V]],
    onRejected: js.Function1[/* error */ js.Any, _]
  ): Double = js.native
}

