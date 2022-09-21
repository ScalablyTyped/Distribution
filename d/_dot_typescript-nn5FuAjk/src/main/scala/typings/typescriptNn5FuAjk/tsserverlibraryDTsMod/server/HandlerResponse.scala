package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerResponse extends StObject {
  
  var response: js.UndefOr[js.Object] = js.undefined
  
  var responseRequired: js.UndefOr[Boolean] = js.undefined
}
object HandlerResponse {
  
  inline def apply(): HandlerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerResponse]
  }
  
  extension [Self <: HandlerResponse](x: Self) {
    
    inline def setResponse(value: js.Object): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseRequired(value: Boolean): Self = StObject.set(x, "responseRequired", value.asInstanceOf[js.Any])
    
    inline def setResponseRequiredUndefined: Self = StObject.set(x, "responseRequired", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
