package typings.azureCoreHttpCompat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPolicy extends StObject {
  
  def sendRequest(httpRequest: WebResourceLike): js.Promise[CompatResponse]
}
object RequestPolicy {
  
  inline def apply(sendRequest: WebResourceLike => js.Promise[CompatResponse]): RequestPolicy = {
    val __obj = js.Dynamic.literal(sendRequest = js.Any.fromFunction1(sendRequest))
    __obj.asInstanceOf[RequestPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestPolicy] (val x: Self) extends AnyVal {
    
    inline def setSendRequest(value: WebResourceLike => js.Promise[CompatResponse]): Self = StObject.set(x, "sendRequest", js.Any.fromFunction1(value))
  }
}
