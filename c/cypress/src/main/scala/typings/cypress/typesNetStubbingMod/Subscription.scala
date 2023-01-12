package typings.cypress.typesNetStubbingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  var await: Boolean
  
  var eventName: String
  
  /**
    * If not defined, this is a default subscription.
    */
  var id: js.UndefOr[String] = js.undefined
  
  var routeId: String
  
  var skip: js.UndefOr[Boolean] = js.undefined
}
object Subscription {
  
  inline def apply(await: Boolean, eventName: String, routeId: String): Subscription = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], routeId = routeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    inline def setAwait(value: Boolean): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRouteId(value: String): Self = StObject.set(x, "routeId", value.asInstanceOf[js.Any])
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
