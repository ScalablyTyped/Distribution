package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsDecoderModule extends js.Object {
  
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
  implicit class JsDecoderModuleOps[Self <: JsDecoderModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJsDecoderModule(value: String): Self = this.set("jsDecoderModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsMSCTranscoder(value: Null): Self = this.set("jsMSCTranscoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmMSCTranscoder(value: Null): Self = this.set("wasmMSCTranscoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmUASTCToASTC(value: Null): Self = this.set("wasmUASTCToASTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmUASTCToBC7(value: Null): Self = this.set("wasmUASTCToBC7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmUASTCToRGBA_SRGB(value: Null): Self = this.set("wasmUASTCToRGBA_SRGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasmUASTCToRGBA_UNORM(value: Null): Self = this.set("wasmUASTCToRGBA_UNORM", value.asInstanceOf[js.Any])
  }
}
