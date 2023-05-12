package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUWebgpuTintWASMMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuTintWASM", "WebGPUTintWASM")
  @js.native
  open class WebGPUTintWASM () extends StObject {
    
    def convertSpirV2WGSL(code: js.typedarray.Uint32Array): String = js.native
    def convertSpirV2WGSL(code: js.typedarray.Uint32Array, disableUniformityAnalysis: Boolean): String = js.native
    
    def initTwgsl(): js.Promise[Unit] = js.native
    def initTwgsl(twgslOptions: TwgslOptions): js.Promise[Unit] = js.native
  }
  /* static members */
  object WebGPUTintWASM {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuTintWASM", "WebGPUTintWASM")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuTintWASM", "WebGPUTintWASM.DisableUniformityAnalysis")
    @js.native
    def DisableUniformityAnalysis: Boolean = js.native
    inline def DisableUniformityAnalysis_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DisableUniformityAnalysis")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuTintWASM", "WebGPUTintWASM.ShowWGSLShaderCode")
    @js.native
    def ShowWGSLShaderCode: Boolean = js.native
    inline def ShowWGSLShaderCode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShowWGSLShaderCode")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuTintWASM", "WebGPUTintWASM._TWgslDefaultOptions")
    @js.native
    val _TWgslDefaultOptions: Any = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuTintWASM", "WebGPUTintWASM._twgsl")
    @js.native
    def _twgsl: Any = js.native
    inline def _twgsl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_twgsl")(x.asInstanceOf[js.Any])
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TwgslOptions] (val x: Self) extends AnyVal {
      
      inline def setJsPath(value: String): Self = StObject.set(x, "jsPath", value.asInstanceOf[js.Any])
      
      inline def setJsPathUndefined: Self = StObject.set(x, "jsPath", js.undefined)
      
      inline def setTwgsl(value: Any): Self = StObject.set(x, "twgsl", value.asInstanceOf[js.Any])
      
      inline def setTwgslUndefined: Self = StObject.set(x, "twgsl", js.undefined)
      
      inline def setWasmPath(value: String): Self = StObject.set(x, "wasmPath", value.asInstanceOf[js.Any])
      
      inline def setWasmPathUndefined: Self = StObject.set(x, "wasmPath", js.undefined)
    }
  }
}
