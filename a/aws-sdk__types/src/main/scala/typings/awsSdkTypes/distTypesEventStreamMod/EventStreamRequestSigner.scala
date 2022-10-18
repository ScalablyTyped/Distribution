package typings.awsSdkTypes.distTypesEventStreamMod

import typings.awsSdkTypes.distTypesHttpMod.HttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStreamRequestSigner extends StObject {
  
  def sign(request: HttpRequest): js.Promise[HttpRequest]
}
object EventStreamRequestSigner {
  
  inline def apply(sign: HttpRequest => js.Promise[HttpRequest]): EventStreamRequestSigner = {
    val __obj = js.Dynamic.literal(sign = js.Any.fromFunction1(sign))
    __obj.asInstanceOf[EventStreamRequestSigner]
  }
  
  extension [Self <: EventStreamRequestSigner](x: Self) {
    
    inline def setSign(value: HttpRequest => js.Promise[HttpRequest]): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
  }
}
