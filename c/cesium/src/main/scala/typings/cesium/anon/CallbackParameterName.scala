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
  
  @scala.inline
  def apply(): CallbackParameterName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackParameterName]
  }
  
  @scala.inline
  implicit class CallbackParameterNameMutableBuilder[Self <: CallbackParameterName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackParameterName(value: String): Self = StObject.set(x, "callbackParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackParameterNameUndefined: Self = StObject.set(x, "callbackParameterName", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
  }
}
