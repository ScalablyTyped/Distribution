package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxiosInterceptorManager[V] extends StObject {
  
  def eject(id: Double): Unit = js.native
  
  def use[T](): Double = js.native
  def use[T](onFulfilled: js.Function1[/* value */ V, T | js.Promise[T]]): Double = js.native
  def use[T](
    onFulfilled: js.Function1[/* value */ V, T | js.Promise[T]],
    onRejected: js.Function1[/* error */ Any, Any]
  ): Double = js.native
  def use[T](
    onFulfilled: js.Function1[/* value */ V, T | js.Promise[T]],
    onRejected: js.Function1[/* error */ Any, Any],
    options: AxiosInterceptorOptions
  ): Double = js.native
  def use[T](
    onFulfilled: js.Function1[/* value */ V, T | js.Promise[T]],
    onRejected: Unit,
    options: AxiosInterceptorOptions
  ): Double = js.native
  def use[T](onFulfilled: Unit, onRejected: js.Function1[/* error */ Any, Any]): Double = js.native
  def use[T](
    onFulfilled: Unit,
    onRejected: js.Function1[/* error */ Any, Any],
    options: AxiosInterceptorOptions
  ): Double = js.native
  def use[T](onFulfilled: Unit, onRejected: Unit, options: AxiosInterceptorOptions): Double = js.native
}
