package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.GPUDevice
import typings.babylonjs.GPUTextureFormat
import typings.babylonjs.anon.Height
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUTextureHelper")
@js.native
open class WebGPUTextureHelper protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUTextureHelper {
  def this(
    device: GPUDevice,
    glslang: Any,
    tintWASM: Nullable[typings.babylonjs.BABYLON.WebGPUTintWASM],
    bufferManager: typings.babylonjs.BABYLON.WebGPUBufferManager
  ) = this()
}
/* static members */
object WebGPUTextureHelper {
  
  @JSGlobal("BABYLON.WebGPUTextureHelper")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ComputeNumMipmapLevels(width: Double, height: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ComputeNumMipmapLevels")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def GetDepthFormatOnly(format: GPUTextureFormat): GPUTextureFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDepthFormatOnly")(format.asInstanceOf[js.Any]).asInstanceOf[GPUTextureFormat]
  
  inline def GetNumChannelsFromWebGPUTextureFormat(format: GPUTextureFormat): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetNumChannelsFromWebGPUTextureFormat")(format.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def GetWebGPUTextureFormat(`type`: Double, format: Double): GPUTextureFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("GetWebGPUTextureFormat")(`type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[GPUTextureFormat]
  inline def GetWebGPUTextureFormat(`type`: Double, format: Double, useSRGBBuffer: Boolean): GPUTextureFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("GetWebGPUTextureFormat")(`type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], useSRGBBuffer.asInstanceOf[js.Any])).asInstanceOf[GPUTextureFormat]
  
  inline def HasDepthAndStencilAspects(format: GPUTextureFormat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("HasDepthAndStencilAspects")(format.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def HasStencilAspect(format: GPUTextureFormat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("HasStencilAspect")(format.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def IsCompressedFormat(format: GPUTextureFormat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsCompressedFormat")(format.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def IsImageBitmap(imageBitmap: Height): /* is std.ImageBitmap */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsImageBitmap")(imageBitmap.asInstanceOf[js.Any]).asInstanceOf[/* is std.ImageBitmap */ Boolean]
  inline def IsImageBitmap(imageBitmap: ImageBitmap): /* is std.ImageBitmap */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsImageBitmap")(imageBitmap.asInstanceOf[js.Any]).asInstanceOf[/* is std.ImageBitmap */ Boolean]
  
  inline def IsImageBitmapArray(imageBitmap: js.Array[ImageBitmap]): /* is std.Array<std.ImageBitmap> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsImageBitmapArray")(imageBitmap.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<std.ImageBitmap> */ Boolean]
  inline def IsImageBitmapArray(imageBitmap: Height): /* is std.Array<std.ImageBitmap> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsImageBitmapArray")(imageBitmap.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<std.ImageBitmap> */ Boolean]
  
  @JSGlobal("BABYLON.WebGPUTextureHelper._GetBlockInformationFromFormat")
  @js.native
  def _GetBlockInformationFromFormat: Any = js.native
  inline def _GetBlockInformationFromFormat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetBlockInformationFromFormat")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUTextureHelper._GetTextureTypeFromFormat")
  @js.native
  def _GetTextureTypeFromFormat: Any = js.native
  inline def _GetTextureTypeFromFormat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetTextureTypeFromFormat")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUTextureHelper._IsHardwareTexture")
  @js.native
  def _IsHardwareTexture: Any = js.native
  inline def _IsHardwareTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsHardwareTexture")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUTextureHelper._IsInternalTexture")
  @js.native
  def _IsInternalTexture: Any = js.native
  inline def _IsInternalTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsInternalTexture")(x.asInstanceOf[js.Any])
}
