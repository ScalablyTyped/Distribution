package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsDecoderModule extends StObject {
  
  var jsDecoderModule: String
  
  var jsMSCTranscoder: Null
  
  var wasmMSCTranscoder: Null
  
  var wasmUASTCToASTC: Null
  
  var wasmUASTCToBC7: Null
  
  var wasmUASTCToRGBA_SRGB: Null
  
  var wasmUASTCToRGBA_UNORM: Null
}
object JsDecoderModule {
  
  inline def apply(
    jsDecoderModule: String,
    jsMSCTranscoder: Null,
    wasmMSCTranscoder: Null,
    wasmUASTCToASTC: Null,
    wasmUASTCToBC7: Null,
    wasmUASTCToRGBA_SRGB: Null,
    wasmUASTCToRGBA_UNORM: Null
  ): JsDecoderModule = {
    val __obj = js.Dynamic.literal(jsDecoderModule = jsDecoderModule.asInstanceOf[js.Any], jsMSCTranscoder = jsMSCTranscoder.asInstanceOf[js.Any], wasmMSCTranscoder = wasmMSCTranscoder.asInstanceOf[js.Any], wasmUASTCToASTC = wasmUASTCToASTC.asInstanceOf[js.Any], wasmUASTCToBC7 = wasmUASTCToBC7.asInstanceOf[js.Any], wasmUASTCToRGBA_SRGB = wasmUASTCToRGBA_SRGB.asInstanceOf[js.Any], wasmUASTCToRGBA_UNORM = wasmUASTCToRGBA_UNORM.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsDecoderModule]
  }
  
  extension [Self <: JsDecoderModule](x: Self) {
    
    inline def setJsDecoderModule(value: String): Self = StObject.set(x, "jsDecoderModule", value.asInstanceOf[js.Any])
    
    inline def setJsMSCTranscoder(value: Null): Self = StObject.set(x, "jsMSCTranscoder", value.asInstanceOf[js.Any])
    
    inline def setWasmMSCTranscoder(value: Null): Self = StObject.set(x, "wasmMSCTranscoder", value.asInstanceOf[js.Any])
    
    inline def setWasmUASTCToASTC(value: Null): Self = StObject.set(x, "wasmUASTCToASTC", value.asInstanceOf[js.Any])
    
    inline def setWasmUASTCToBC7(value: Null): Self = StObject.set(x, "wasmUASTCToBC7", value.asInstanceOf[js.Any])
    
    inline def setWasmUASTCToRGBA_SRGB(value: Null): Self = StObject.set(x, "wasmUASTCToRGBA_SRGB", value.asInstanceOf[js.Any])
    
    inline def setWasmUASTCToRGBA_UNORM(value: Null): Self = StObject.set(x, "wasmUASTCToRGBA_UNORM", value.asInstanceOf[js.Any])
  }
}
