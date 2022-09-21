package typings.axios.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxiosStatic extends AxiosInstance {
  
  var Axios: Instantiable1[/* config */ js.UndefOr[AxiosRequestConfig[Any]], typings.axios.mod.Axios] = js.native
  
  var Cancel: CancelStatic = js.native
  
  var CancelToken: CancelTokenStatic = js.native
  
  val VERSION: String = js.native
  
  def all[T](values: js.Array[T | js.Promise[T]]): js.Promise[js.Array[T]] = js.native
  
  def create(): AxiosInstance = js.native
  def create(config: AxiosRequestConfig[Any]): AxiosInstance = js.native
  
  def isAxiosError(payload: Any): /* is axios.axios.AxiosError<unknown, any> */ Boolean = js.native
  
  def isCancel(value: Any): Boolean = js.native
  
  def spread[T, R](callback: js.Function1[/* repeated */ T, R]): js.Function1[/* array */ js.Array[T], R] = js.native
}
