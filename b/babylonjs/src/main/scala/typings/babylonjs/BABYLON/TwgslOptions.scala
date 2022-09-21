package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwgslOptions extends StObject {
  
  /**
    * Defines the URL of the twgsl JS File.
    */
  var jsPath: js.UndefOr[String] = js.undefined
  
  /**
    * Defines an existing instance of Twgsl (useful in modules who do not access the global instance).
    */
  var twgsl: js.UndefOr[Any] = js.undefined
  
  /**
    * Defines the URL of the twgsl WASM File.
    */
  var wasmPath: js.UndefOr[String] = js.undefined
}
object TwgslOptions {
  
  inline def apply(): TwgslOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwgslOptions]
  }
  
  extension [Self <: TwgslOptions](x: Self) {
    
    inline def setJsPath(value: String): Self = StObject.set(x, "jsPath", value.asInstanceOf[js.Any])
    
    inline def setJsPathUndefined: Self = StObject.set(x, "jsPath", js.undefined)
    
    inline def setTwgsl(value: Any): Self = StObject.set(x, "twgsl", value.asInstanceOf[js.Any])
    
    inline def setTwgslUndefined: Self = StObject.set(x, "twgsl", js.undefined)
    
    inline def setWasmPath(value: String): Self = StObject.set(x, "wasmPath", value.asInstanceOf[js.Any])
    
    inline def setWasmPathUndefined: Self = StObject.set(x, "wasmPath", js.undefined)
  }
}
