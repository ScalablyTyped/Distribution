package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.GPUCompareFunction
import typings.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUCacheSampler")
@js.native
open class WebGPUCacheSampler protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUCacheSampler {
  def this(device: GPUDevice) = this()
}
/* static members */
object WebGPUCacheSampler {
  
  @JSGlobal("BABYLON.WebGPUCacheSampler")
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetCompareFunction(compareFunction: Nullable[Double]): GPUCompareFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCompareFunction")(compareFunction.asInstanceOf[js.Any]).asInstanceOf[GPUCompareFunction]
  
  inline def GetSamplerHashCode(sampler: typings.babylonjs.BABYLON.TextureSampler): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSamplerHashCode")(sampler.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSGlobal("BABYLON.WebGPUCacheSampler._GetSamplerDescriptor")
  @js.native
  def _GetSamplerDescriptor: Any = js.native
  inline def _GetSamplerDescriptor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetSamplerDescriptor")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheSampler._GetSamplerFilterDescriptor")
  @js.native
  def _GetSamplerFilterDescriptor: Any = js.native
  inline def _GetSamplerFilterDescriptor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetSamplerFilterDescriptor")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheSampler._GetSamplerWrappingDescriptor")
  @js.native
  def _GetSamplerWrappingDescriptor: Any = js.native
  inline def _GetSamplerWrappingDescriptor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetSamplerWrappingDescriptor")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUCacheSampler._GetWrappingMode")
  @js.native
  def _GetWrappingMode: Any = js.native
  inline def _GetWrappingMode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetWrappingMode")(x.asInstanceOf[js.Any])
}
