package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchEventInit
  extends StObject
     with EventInit {
  
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  
  var handled: js.UndefOr[Promise[Unit]] = js.undefined
  
  var preloadResponse: js.UndefOr[Promise[Any]] = js.undefined
  
  var replacesClientId: js.UndefOr[java.lang.String] = js.undefined
  
  var request: Request
  
  var resultingClientId: js.UndefOr[java.lang.String] = js.undefined
}
object FetchEventInit {
  
  inline def apply(request: Request): FetchEventInit = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchEventInit]
  }
  
  extension [Self <: FetchEventInit](x: Self) {
    
    inline def setClientId(value: java.lang.String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setHandled(value: Promise[Unit]): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
    
    inline def setPreloadResponse(value: Promise[Any]): Self = StObject.set(x, "preloadResponse", value.asInstanceOf[js.Any])
    
    inline def setPreloadResponseUndefined: Self = StObject.set(x, "preloadResponse", js.undefined)
    
    inline def setReplacesClientId(value: java.lang.String): Self = StObject.set(x, "replacesClientId", value.asInstanceOf[js.Any])
    
    inline def setReplacesClientIdUndefined: Self = StObject.set(x, "replacesClientId", js.undefined)
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResultingClientId(value: java.lang.String): Self = StObject.set(x, "resultingClientId", value.asInstanceOf[js.Any])
    
    inline def setResultingClientIdUndefined: Self = StObject.set(x, "resultingClientId", js.undefined)
  }
}
