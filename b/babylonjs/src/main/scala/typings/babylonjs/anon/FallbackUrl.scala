package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FallbackUrl extends StObject {
  
  /**
    * The url to the fallback JavaScript module.
    */
  var fallbackUrl: js.UndefOr[String] = js.native
  
  /**
    * The url to the WebAssembly binary.
    */
  var wasmBinaryUrl: js.UndefOr[String] = js.native
  
  /**
    * The url to the WebAssembly module.
    */
  var wasmUrl: js.UndefOr[String] = js.native
}
object FallbackUrl {
  
  @scala.inline
  def apply(): FallbackUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FallbackUrl]
  }
  
  @scala.inline
  implicit class FallbackUrlMutableBuilder[Self <: FallbackUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackUrl(value: String): Self = StObject.set(x, "fallbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUrlUndefined: Self = StObject.set(x, "fallbackUrl", js.undefined)
    
    @scala.inline
    def setWasmBinaryUrl(value: String): Self = StObject.set(x, "wasmBinaryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmBinaryUrlUndefined: Self = StObject.set(x, "wasmBinaryUrl", js.undefined)
    
    @scala.inline
    def setWasmUrl(value: String): Self = StObject.set(x, "wasmUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmUrlUndefined: Self = StObject.set(x, "wasmUrl", js.undefined)
  }
}
