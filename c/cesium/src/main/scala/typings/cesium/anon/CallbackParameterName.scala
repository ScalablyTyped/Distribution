package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackParameterName extends StObject {
  
  var callbackParameterName: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[js.Any] = js.undefined
  
  var proxy: js.UndefOr[js.Any] = js.undefined
}
object CallbackParameterName {
  
  inline def apply(): CallbackParameterName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackParameterName]
  }
  
  extension [Self <: CallbackParameterName](x: Self) {
    
    inline def setCallbackParameterName(value: String): Self = StObject.set(x, "callbackParameterName", value.asInstanceOf[js.Any])
    
    inline def setCallbackParameterNameUndefined: Self = StObject.set(x, "callbackParameterName", js.undefined)
    
    inline def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
  }
}
