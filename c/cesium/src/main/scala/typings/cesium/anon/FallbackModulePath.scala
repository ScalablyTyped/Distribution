package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FallbackModulePath extends StObject {
  
  var fallbackModulePath: js.UndefOr[String] = js.undefined
  
  var modulePath: js.UndefOr[String] = js.undefined
  
  var wasmBinaryFile: js.UndefOr[String] = js.undefined
}
object FallbackModulePath {
  
  inline def apply(): FallbackModulePath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FallbackModulePath]
  }
  
  extension [Self <: FallbackModulePath](x: Self) {
    
    inline def setFallbackModulePath(value: String): Self = StObject.set(x, "fallbackModulePath", value.asInstanceOf[js.Any])
    
    inline def setFallbackModulePathUndefined: Self = StObject.set(x, "fallbackModulePath", js.undefined)
    
    inline def setModulePath(value: String): Self = StObject.set(x, "modulePath", value.asInstanceOf[js.Any])
    
    inline def setModulePathUndefined: Self = StObject.set(x, "modulePath", js.undefined)
    
    inline def setWasmBinaryFile(value: String): Self = StObject.set(x, "wasmBinaryFile", value.asInstanceOf[js.Any])
    
    inline def setWasmBinaryFileUndefined: Self = StObject.set(x, "wasmBinaryFile", js.undefined)
  }
}
