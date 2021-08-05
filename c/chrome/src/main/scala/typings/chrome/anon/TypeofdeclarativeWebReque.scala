package typings.chrome.anon

import typings.chrome.chrome.declarativeWebRequest.RequestedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdeclarativeWebReque extends StObject {
  
  var onRequest: RequestedEvent
}
object TypeofdeclarativeWebReque {
  
  inline def apply(onRequest: RequestedEvent): TypeofdeclarativeWebReque = {
    val __obj = js.Dynamic.literal(onRequest = onRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdeclarativeWebReque]
  }
  
  extension [Self <: TypeofdeclarativeWebReque](x: Self) {
    
    inline def setOnRequest(value: RequestedEvent): Self = StObject.set(x, "onRequest", value.asInstanceOf[js.Any])
  }
}
