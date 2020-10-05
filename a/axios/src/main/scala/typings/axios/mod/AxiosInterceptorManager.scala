package typings.axios.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxiosInterceptorManager[V] extends js.Object {
  def eject(id: Double): Unit = js.native
  def use(): Double = js.native
  def use(onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function1[/* error */ js.Any, _]): Double = js.native
  def use(onFulfilled: js.Function1[/* value */ V, V | js.Promise[V]]): Double = js.native
  def use(
    onFulfilled: js.Function1[/* value */ V, V | js.Promise[V]],
    onRejected: js.Function1[/* error */ js.Any, _]
  ): Double = js.native
}

