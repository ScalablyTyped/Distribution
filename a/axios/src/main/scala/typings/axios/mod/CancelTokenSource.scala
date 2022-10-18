package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTokenSource extends StObject {
  
  def cancel(): Unit
  def cancel(message: String): Unit
  def cancel(message: String, config: Unit, request: Any): Unit
  def cancel(message: String, config: AxiosRequestConfig[Any]): Unit
  def cancel(message: String, config: AxiosRequestConfig[Any], request: Any): Unit
  def cancel(message: Unit, config: Unit, request: Any): Unit
  def cancel(message: Unit, config: AxiosRequestConfig[Any]): Unit
  def cancel(message: Unit, config: AxiosRequestConfig[Any], request: Any): Unit
  @JSName("cancel")
  var cancel_Original: Canceler
  
  var token: CancelToken
}
object CancelTokenSource {
  
  inline def apply(
    cancel: (/* message */ js.UndefOr[String], /* config */ js.UndefOr[AxiosRequestConfig[Any]], /* request */ js.UndefOr[Any]) => Unit,
    token: CancelToken
  ): CancelTokenSource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction3(cancel), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTokenSource]
  }
  
  extension [Self <: CancelTokenSource](x: Self) {
    
    inline def setCancel(
      value: (/* message */ js.UndefOr[String], /* config */ js.UndefOr[AxiosRequestConfig[Any]], /* request */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "cancel", js.Any.fromFunction3(value))
    
    inline def setToken(value: CancelToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
