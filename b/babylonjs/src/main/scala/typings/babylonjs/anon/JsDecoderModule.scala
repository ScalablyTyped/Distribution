package typings.babylonjs.anon

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsDecoderModule extends StObject {
  
  var jsDecoderModule: String
  
  var jsMSCTranscoder: Nullable[String]
  
  var wasmMSCTranscoder: Nullable[String]
  
  var wasmUASTCToASTC: Nullable[String]
  
  var wasmUASTCToBC7: Nullable[String]
  
  var wasmUASTCToRGBA_SRGB: Nullable[String]
  
  var wasmUASTCToRGBA_UNORM: Nullable[String]
  
  var wasmZSTDDecoder: Nullable[String]
}
object JsDecoderModule {
  
  inline def apply(jsDecoderModule: String): JsDecoderModule = {
    val __obj = js.Dynamic.literal(jsDecoderModule = jsDecoderModule.asInstanceOf[js.Any], jsMSCTranscoder = null, wasmMSCTranscoder = null, wasmUASTCToASTC = null, wasmUASTCToBC7 = null, wasmUASTCToRGBA_SRGB = null, wasmUASTCToRGBA_UNORM = null, wasmZSTDDecoder = null)
    __obj.asInstanceOf[JsDecoderModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsDecoderModule] (val x: Self) extends AnyVal {
    
    inline def setJsDecoderModule(value: String): Self = StObject.set(x, "jsDecoderModule", value.asInstanceOf[js.Any])
    
    inline def setJsMSCTranscoder(value: Nullable[String]): Self = StObject.set(x, "jsMSCTranscoder", value.asInstanceOf[js.Any])
    
    inline def setJsMSCTranscoderNull: Self = StObject.set(x, "jsMSCTranscoder", null)
    
    inline def setWasmMSCTranscoder(value: Nullable[String]): Self = StObject.set(x, "wasmMSCTranscoder", value.asInstanceOf[js.Any])
    
    inline def setWasmMSCTranscoderNull: Self = StObject.set(x, "wasmMSCTranscoder", null)
    
    inline def setWasmUASTCToASTC(value: Nullable[String]): Self = StObject.set(x, "wasmUASTCToASTC", value.asInstanceOf[js.Any])
    
    inline def setWasmUASTCToASTCNull: Self = StObject.set(x, "wasmUASTCToASTC", null)
    
    inline def setWasmUASTCToBC7(value: Nullable[String]): Self = StObject.set(x, "wasmUASTCToBC7", value.asInstanceOf[js.Any])
    
    inline def setWasmUASTCToBC7Null: Self = StObject.set(x, "wasmUASTCToBC7", null)
    
    inline def setWasmUASTCToRGBA_SRGB(value: Nullable[String]): Self = StObject.set(x, "wasmUASTCToRGBA_SRGB", value.asInstanceOf[js.Any])
    
    inline def setWasmUASTCToRGBA_SRGBNull: Self = StObject.set(x, "wasmUASTCToRGBA_SRGB", null)
    
    inline def setWasmUASTCToRGBA_UNORM(value: Nullable[String]): Self = StObject.set(x, "wasmUASTCToRGBA_UNORM", value.asInstanceOf[js.Any])
    
    inline def setWasmUASTCToRGBA_UNORMNull: Self = StObject.set(x, "wasmUASTCToRGBA_UNORM", null)
    
    inline def setWasmZSTDDecoder(value: Nullable[String]): Self = StObject.set(x, "wasmZSTDDecoder", value.asInstanceOf[js.Any])
    
    inline def setWasmZSTDDecoderNull: Self = StObject.set(x, "wasmZSTDDecoder", null)
  }
}
