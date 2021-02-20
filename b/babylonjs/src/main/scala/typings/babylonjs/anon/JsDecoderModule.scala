package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsDecoderModule extends StObject {
  
  var jsDecoderModule: String = js.native
  
  var jsMSCTranscoder: Null = js.native
  
  var wasmMSCTranscoder: Null = js.native
  
  var wasmUASTCToASTC: Null = js.native
  
  var wasmUASTCToBC7: Null = js.native
  
  var wasmUASTCToRGBA_SRGB: Null = js.native
  
  var wasmUASTCToRGBA_UNORM: Null = js.native
}
object JsDecoderModule {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class JsDecoderModuleMutableBuilder[Self <: JsDecoderModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsDecoderModule(value: String): Self = StObject.set(x, "jsDecoderModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsMSCTranscoder(value: Null): Self = StObject.set(x, "jsMSCTranscoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmMSCTranscoder(value: Null): Self = StObject.set(x, "wasmMSCTranscoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmUASTCToASTC(value: Null): Self = StObject.set(x, "wasmUASTCToASTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmUASTCToBC7(value: Null): Self = StObject.set(x, "wasmUASTCToBC7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmUASTCToRGBA_SRGB(value: Null): Self = StObject.set(x, "wasmUASTCToRGBA_SRGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmUASTCToRGBA_UNORM(value: Null): Self = StObject.set(x, "wasmUASTCToRGBA_UNORM", value.asInstanceOf[js.Any])
  }
}
