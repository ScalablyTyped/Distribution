package typings.babylonjs

import typings.babylonjs.textureSamplerMod.TextureSampler
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuCacheSamplerMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuCacheSampler", "WebGPUCacheSampler")
  @js.native
  open class WebGPUCacheSampler protected () extends StObject {
    def this(device: GPUDevice) = this()
    
    /* private */ var _device: Any = js.native
    
    /* private */ var _samplers: Any = js.native
    
    var disabled: Boolean = js.native
    
    def getSampler(sampler: TextureSampler): GPUSampler = js.native
    def getSampler(sampler: TextureSampler, bypassCache: Boolean): GPUSampler = js.native
    def getSampler(sampler: TextureSampler, bypassCache: Boolean, hash: Double): GPUSampler = js.native
    def getSampler(sampler: TextureSampler, bypassCache: Unit, hash: Double): GPUSampler = js.native
  }
  /* static members */
  object WebGPUCacheSampler {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheSampler", "WebGPUCacheSampler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def GetCompareFunction(compareFunction: Nullable[Double]): GPUCompareFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCompareFunction")(compareFunction.asInstanceOf[js.Any]).asInstanceOf[GPUCompareFunction]
    
    inline def GetSamplerHashCode(sampler: TextureSampler): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSamplerHashCode")(sampler.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheSampler", "WebGPUCacheSampler._GetSamplerDescriptor")
    @js.native
    def _GetSamplerDescriptor: Any = js.native
    inline def _GetSamplerDescriptor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetSamplerDescriptor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheSampler", "WebGPUCacheSampler._GetSamplerFilterDescriptor")
    @js.native
    def _GetSamplerFilterDescriptor: Any = js.native
    inline def _GetSamplerFilterDescriptor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetSamplerFilterDescriptor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheSampler", "WebGPUCacheSampler._GetSamplerWrappingDescriptor")
    @js.native
    def _GetSamplerWrappingDescriptor: Any = js.native
    inline def _GetSamplerWrappingDescriptor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetSamplerWrappingDescriptor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheSampler", "WebGPUCacheSampler._GetWrappingMode")
    @js.native
    def _GetWrappingMode: Any = js.native
    inline def _GetWrappingMode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetWrappingMode")(x.asInstanceOf[js.Any])
  }
}
