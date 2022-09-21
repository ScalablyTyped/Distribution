package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTokenSource extends StObject {
  
  def cancel(): Unit
  def cancel(message: String): Unit
  @JSName("cancel")
  var cancel_Original: Canceler
  
  var token: CancelToken
}
object CancelTokenSource {
  
  inline def apply(cancel: /* message */ js.UndefOr[String] => Unit, token: CancelToken): CancelTokenSource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTokenSource]
  }
  
  extension [Self <: CancelTokenSource](x: Self) {
    
    inline def setCancel(value: /* message */ js.UndefOr[String] => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setToken(value: CancelToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
