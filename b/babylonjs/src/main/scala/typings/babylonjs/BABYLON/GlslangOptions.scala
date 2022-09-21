package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlslangOptions extends StObject {
  
  /**
    * Defines an existing instance of Glslang (useful in modules who do not access the global instance).
    */
  var glslang: js.UndefOr[Any] = js.undefined
  
  /**
    * Defines the URL of the glslang JS File.
    */
  var jsPath: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the URL of the glslang WASM File.
    */
  var wasmPath: js.UndefOr[String] = js.undefined
}
object GlslangOptions {
  
  inline def apply(): GlslangOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlslangOptions]
  }
  
  extension [Self <: GlslangOptions](x: Self) {
    
    inline def setGlslang(value: Any): Self = StObject.set(x, "glslang", value.asInstanceOf[js.Any])
    
    inline def setGlslangUndefined: Self = StObject.set(x, "glslang", js.undefined)
    
    inline def setJsPath(value: String): Self = StObject.set(x, "jsPath", value.asInstanceOf[js.Any])
    
    inline def setJsPathUndefined: Self = StObject.set(x, "jsPath", js.undefined)
    
    inline def setWasmPath(value: String): Self = StObject.set(x, "wasmPath", value.asInstanceOf[js.Any])
    
    inline def setWasmPathUndefined: Self = StObject.set(x, "wasmPath", js.undefined)
  }
}
