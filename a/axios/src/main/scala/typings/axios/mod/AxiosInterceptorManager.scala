package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxiosInterceptorManager[V] extends StObject {
  
  def clear(): Unit = js.native
  
  def eject(id: Double): Unit = js.native
  
  def use(): Double = js.native
  def use(onFulfilled: js.Function1[/* value */ V, V | js.Promise[V]]): Double = js.native
  def use(
    onFulfilled: js.Function1[/* value */ V, V | js.Promise[V]],
    onRejected: js.Function1[/* error */ Any, Any]
  ): Double = js.native
  def use(
    onFulfilled: js.Function1[/* value */ V, V | js.Promise[V]],
    onRejected: js.Function1[/* error */ Any, Any],
    options: AxiosInterceptorOptions
  ): Double = js.native
  def use(
    onFulfilled: js.Function1[/* value */ V, V | js.Promise[V]],
    onRejected: Null,
    options: AxiosInterceptorOptions
  ): Double = js.native
  def use(
    onFulfilled: js.Function1[/* value */ V, V | js.Promise[V]],
    onRejected: Unit,
    options: AxiosInterceptorOptions
  ): Double = js.native
  def use(onFulfilled: Null, onRejected: js.Function1[/* error */ Any, Any]): Double = js.native
  def use(
    onFulfilled: Null,
    onRejected: js.Function1[/* error */ Any, Any],
    options: AxiosInterceptorOptions
  ): Double = js.native
  def use(onFulfilled: Null, onRejected: Null, options: AxiosInterceptorOptions): Double = js.native
  def use(onFulfilled: Null, onRejected: Unit, options: AxiosInterceptorOptions): Double = js.native
  def use(onFulfilled: Unit, onRejected: js.Function1[/* error */ Any, Any]): Double = js.native
  def use(
    onFulfilled: Unit,
    onRejected: js.Function1[/* error */ Any, Any],
    options: AxiosInterceptorOptions
  ): Double = js.native
  def use(onFulfilled: Unit, onRejected: Null, options: AxiosInterceptorOptions): Double = js.native
  def use(onFulfilled: Unit, onRejected: Unit, options: AxiosInterceptorOptions): Double = js.native
}
