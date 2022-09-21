package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerRegistrationEventMap extends StObject {
  
  var updatefound: Event
}
object ServiceWorkerRegistrationEventMap {
  
  inline def apply(updatefound: Event): ServiceWorkerRegistrationEventMap = {
    val __obj = js.Dynamic.literal(updatefound = updatefound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerRegistrationEventMap]
  }
  
  extension [Self <: ServiceWorkerRegistrationEventMap](x: Self) {
    
    inline def setUpdatefound(value: Event): Self = StObject.set(x, "updatefound", value.asInstanceOf[js.Any])
  }
}
