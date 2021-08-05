package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientTokenGateway extends StObject {
  
  def generate(request: ClientTokenRequest): js.Promise[ValidatedResponse[ClientToken]]
}
object ClientTokenGateway {
  
  inline def apply(generate: ClientTokenRequest => js.Promise[ValidatedResponse[ClientToken]]): ClientTokenGateway = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[ClientTokenGateway]
  }
  
  extension [Self <: ClientTokenGateway](x: Self) {
    
    inline def setGenerate(value: ClientTokenRequest => js.Promise[ValidatedResponse[ClientToken]]): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
  }
}
