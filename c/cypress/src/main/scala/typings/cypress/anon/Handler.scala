package typings.cypress.anon

import typings.cypress.typesNetStubbingMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handler extends StObject {
  
  def handler(data: Any): js.Promise[Unit] | Unit
  
  var subscription: Subscription
}
object Handler {
  
  inline def apply(handler: Any => js.Promise[Unit] | Unit, subscription: Subscription): Handler = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  extension [Self <: Handler](x: Self) {
    
    inline def setHandler(value: Any => js.Promise[Unit] | Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
  }
}
