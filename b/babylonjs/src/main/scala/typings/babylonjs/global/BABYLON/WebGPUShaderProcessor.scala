package typings.babylonjs.global.BABYLON

import typings.babylonjs.GPUTextureViewDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUShaderProcessor")
@js.native
abstract class WebGPUShaderProcessor ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUShaderProcessor {
  
  /* CompleteClass */
  var shaderLanguage: typings.babylonjs.BABYLON.ShaderLanguage = js.native
}
/* static members */
object WebGPUShaderProcessor {
  
  @JSGlobal("BABYLON.WebGPUShaderProcessor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.WebGPUShaderProcessor.AutoSamplerSuffix")
  @js.native
  val AutoSamplerSuffix: /* "Sampler" */ String = js.native
  
  @JSGlobal("BABYLON.WebGPUShaderProcessor.InternalsUBOName")
  @js.native
  val InternalsUBOName: /* "Internals" */ String = js.native
  
  @JSGlobal("BABYLON.WebGPUShaderProcessor.LeftOvertUBOName")
  @js.native
  val LeftOvertUBOName: /* "LeftOver" */ String = js.native
  
  @JSGlobal("BABYLON.WebGPUShaderProcessor.UniformSizes")
  @js.native
  def UniformSizes: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  inline def UniformSizes_=(x: org.scalablytyped.runtime.StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniformSizes")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUShaderProcessor._GpuTextureViewDimensionByWebGPUTextureType")
  @js.native
  def _GpuTextureViewDimensionByWebGPUTextureType: org.scalablytyped.runtime.StringDictionary[GPUTextureViewDimension] = js.native
  inline def _GpuTextureViewDimensionByWebGPUTextureType_=(x: org.scalablytyped.runtime.StringDictionary[GPUTextureViewDimension]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GpuTextureViewDimensionByWebGPUTextureType")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUShaderProcessor._IsComparisonSamplerByWebGPUSamplerType")
  @js.native
  def _IsComparisonSamplerByWebGPUSamplerType: org.scalablytyped.runtime.StringDictionary[Boolean] = js.native
  inline def _IsComparisonSamplerByWebGPUSamplerType_=(x: org.scalablytyped.runtime.StringDictionary[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsComparisonSamplerByWebGPUSamplerType")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUShaderProcessor._SamplerFunctionByWebGLSamplerType")
  @js.native
  def _SamplerFunctionByWebGLSamplerType: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def _SamplerFunctionByWebGLSamplerType_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SamplerFunctionByWebGLSamplerType")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUShaderProcessor._SamplerTypeByWebGLSamplerType")
  @js.native
  def _SamplerTypeByWebGLSamplerType: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def _SamplerTypeByWebGLSamplerType_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SamplerTypeByWebGLSamplerType")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUShaderProcessor._TextureTypeByWebGLSamplerType")
  @js.native
  def _TextureTypeByWebGLSamplerType: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def _TextureTypeByWebGLSamplerType_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureTypeByWebGLSamplerType")(x.asInstanceOf[js.Any])
}
