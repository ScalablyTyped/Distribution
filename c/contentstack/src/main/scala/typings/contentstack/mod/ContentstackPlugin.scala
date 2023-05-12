package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentstackPlugin extends StObject {
  
  var onRequest: js.UndefOr[
    js.Function2[/* stack */ Stack, /* request */ ContentstackRequest, ContentstackRequest]
  ] = js.undefined
  
  var onResponse: js.UndefOr[
    js.Function4[
      /* stack */ Stack, 
      /* request */ ContentstackRequest, 
      /* response */ Any, 
      /* data */ Any, 
      Any
    ]
  ] = js.undefined
}
object ContentstackPlugin {
  
  inline def apply(): ContentstackPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentstackPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentstackPlugin] (val x: Self) extends AnyVal {
    
    inline def setOnRequest(value: (/* stack */ Stack, /* request */ ContentstackRequest) => ContentstackRequest): Self = StObject.set(x, "onRequest", js.Any.fromFunction2(value))
    
    inline def setOnRequestUndefined: Self = StObject.set(x, "onRequest", js.undefined)
    
    inline def setOnResponse(
      value: (/* stack */ Stack, /* request */ ContentstackRequest, /* response */ Any, /* data */ Any) => Any
    ): Self = StObject.set(x, "onResponse", js.Any.fromFunction4(value))
    
    inline def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
  }
}
