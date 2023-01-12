package typings.azureMobileApps.Azure.MobileApps

import typings.azureMobileApps.Express.Request
import typings.azureMobileApps.Express.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiDefinition extends StObject {
  
  var authorize: js.UndefOr[Boolean] = js.undefined
  
  var delete: js.UndefOr[Middleware | js.Array[Middleware]] = js.undefined
  
  var get: js.UndefOr[Middleware | js.Array[Middleware]] = js.undefined
  
  var patch: js.UndefOr[Middleware | js.Array[Middleware]] = js.undefined
  
  var post: js.UndefOr[Middleware | js.Array[Middleware]] = js.undefined
  
  var put: js.UndefOr[Middleware | js.Array[Middleware]] = js.undefined
}
object ApiDefinition {
  
  inline def apply(): ApiDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiDefinition] (val x: Self) extends AnyVal {
    
    inline def setAuthorize(value: Boolean): Self = StObject.set(x, "authorize", value.asInstanceOf[js.Any])
    
    inline def setAuthorizeUndefined: Self = StObject.set(x, "authorize", js.undefined)
    
    inline def setDelete(value: Middleware | js.Array[Middleware]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteFunction3(value: (/* req */ Request, /* res */ Response, /* next */ NextMiddleware) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction3(value))
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setDeleteVarargs(value: Middleware*): Self = StObject.set(x, "delete", js.Array(value*))
    
    inline def setGet(value: Middleware | js.Array[Middleware]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetFunction3(value: (/* req */ Request, /* res */ Response, /* next */ NextMiddleware) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setGetVarargs(value: Middleware*): Self = StObject.set(x, "get", js.Array(value*))
    
    inline def setPatch(value: Middleware | js.Array[Middleware]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchFunction3(value: (/* req */ Request, /* res */ Response, /* next */ NextMiddleware) => Unit): Self = StObject.set(x, "patch", js.Any.fromFunction3(value))
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPatchVarargs(value: Middleware*): Self = StObject.set(x, "patch", js.Array(value*))
    
    inline def setPost(value: Middleware | js.Array[Middleware]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostFunction3(value: (/* req */ Request, /* res */ Response, /* next */ NextMiddleware) => Unit): Self = StObject.set(x, "post", js.Any.fromFunction3(value))
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPostVarargs(value: Middleware*): Self = StObject.set(x, "post", js.Array(value*))
    
    inline def setPut(value: Middleware | js.Array[Middleware]): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    inline def setPutFunction3(value: (/* req */ Request, /* res */ Response, /* next */ NextMiddleware) => Unit): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
    
    inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
    
    inline def setPutVarargs(value: Middleware*): Self = StObject.set(x, "put", js.Array(value*))
  }
}
