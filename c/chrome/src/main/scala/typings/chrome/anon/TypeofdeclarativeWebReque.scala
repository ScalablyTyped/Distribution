package typings.chrome.anon

import typings.chrome.chrome.declarativeWebRequest.RequestedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdeclarativeWebReque extends StObject {
  
  var onRequest: RequestedEvent
}
object TypeofdeclarativeWebReque {
  
  @scala.inline
  def apply(onRequest: RequestedEvent): TypeofdeclarativeWebReque = {
    val __obj = js.Dynamic.literal(onRequest = onRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdeclarativeWebReque]
  }
  
  @scala.inline
  implicit class TypeofdeclarativeWebRequeMutableBuilder[Self <: TypeofdeclarativeWebReque] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnRequest(value: RequestedEvent): Self = StObject.set(x, "onRequest", value.asInstanceOf[js.Any])
  }
}
