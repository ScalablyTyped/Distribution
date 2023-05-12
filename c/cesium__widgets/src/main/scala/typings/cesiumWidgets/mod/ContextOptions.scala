package typings.cesiumWidgets.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextOptions extends StObject {
  
  var allowTextureFilterAnisotropic: js.UndefOr[Boolean] = js.undefined
  
  var getWebGLStub: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var requestWebgl1: js.UndefOr[Boolean] = js.undefined
  
  var webgl: js.UndefOr[WebGLOptions] = js.undefined
}
object ContextOptions {
  
  inline def apply(): ContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowTextureFilterAnisotropic(value: Boolean): Self = StObject.set(x, "allowTextureFilterAnisotropic", value.asInstanceOf[js.Any])
    
    inline def setAllowTextureFilterAnisotropicUndefined: Self = StObject.set(x, "allowTextureFilterAnisotropic", js.undefined)
    
    inline def setGetWebGLStub(value: /* repeated */ Any => Any): Self = StObject.set(x, "getWebGLStub", js.Any.fromFunction1(value))
    
    inline def setGetWebGLStubUndefined: Self = StObject.set(x, "getWebGLStub", js.undefined)
    
    inline def setRequestWebgl1(value: Boolean): Self = StObject.set(x, "requestWebgl1", value.asInstanceOf[js.Any])
    
    inline def setRequestWebgl1Undefined: Self = StObject.set(x, "requestWebgl1", js.undefined)
    
    inline def setWebgl(value: WebGLOptions): Self = StObject.set(x, "webgl", value.asInstanceOf[js.Any])
    
    inline def setWebglUndefined: Self = StObject.set(x, "webgl", js.undefined)
  }
}
