package typings.babylonjs

import typings.babylonjs.anon.Height
import typings.babylonjs.anon.Width
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webgpuBufferManagerMod.WebGPUBufferManager
import typings.babylonjs.webgpuHardwareTextureMod.WebGPUHardwareTexture
import typings.babylonjs.webgpuTintWASMMod.WebGPUTintWASM
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuTextureHelperMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuTextureHelper", "WebGPUTextureHelper")
  @js.native
  open class WebGPUTextureHelper protected () extends StObject {
    def this(
      device: GPUDevice,
      glslang: Any,
      tintWASM: Nullable[WebGPUTintWASM],
      bufferManager: WebGPUBufferManager
    ) = this()
    
    /* private */ var _bufferManager: Any = js.native
    
    /* private */ var _commandEncoderForCreation: Any = js.native
    
    /* private */ var _compiledShaders: Any = js.native
    
    /* private */ var _deferredReleaseTextures: Any = js.native
    
    /* private */ var _device: Any = js.native
    
    /* private */ var _getPipeline: Any = js.native
    
    /* private */ var _glslang: Any = js.native
    
    /* private */ var _mipmapSampler: Any = js.native
    
    /* private */ var _pipelines: Any = js.native
    
    /* private */ var _tintWASM: Any = js.native
    
    /* private */ var _ubCopyWithOfst: Any = js.native
    
    def copyWithInvertY(
      srcTextureView: GPUTextureView,
      format: GPUTextureFormat,
      renderPassDescriptor: GPURenderPassDescriptor
    ): Unit = js.native
    def copyWithInvertY(
      srcTextureView: GPUTextureView,
      format: GPUTextureFormat,
      renderPassDescriptor: GPURenderPassDescriptor,
      commandEncoder: GPUCommandEncoder
    ): Unit = js.native
    
    def createCubeTexture(
      imageBitmaps: js.Array[ImageBitmap] | Height,
      hasMipmaps: js.UndefOr[Boolean],
      generateMipmaps: js.UndefOr[Boolean],
      invertY: js.UndefOr[Boolean],
      premultiplyAlpha: js.UndefOr[Boolean],
      format: js.UndefOr[GPUTextureFormat],
      sampleCount: js.UndefOr[Double],
      commandEncoder: js.UndefOr[GPUCommandEncoder],
      usage: js.UndefOr[Double],
      additionalUsages: js.UndefOr[Double]
    ): GPUTexture = js.native
    
    def createGPUTextureForInternalTexture(texture: InternalTexture): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Double, height: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Double, height: Double, depth: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Double, height: Double, depth: Double, creationFlags: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Double, height: Double, depth: Unit, creationFlags: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Double, height: Unit, depth: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Double, height: Unit, depth: Double, creationFlags: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Double, height: Unit, depth: Unit, creationFlags: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Unit, height: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Unit, height: Double, depth: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Unit, height: Double, depth: Double, creationFlags: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Unit, height: Double, depth: Unit, creationFlags: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Unit, height: Unit, depth: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Unit, height: Unit, depth: Double, creationFlags: Double): WebGPUHardwareTexture = js.native
    def createGPUTextureForInternalTexture(texture: InternalTexture, width: Unit, height: Unit, depth: Unit, creationFlags: Double): WebGPUHardwareTexture = js.native
    
    def createMSAATexture(texture: InternalTexture, samples: Double): Unit = js.native
    
    def createTexture(
      imageBitmap: ImageBitmap | Width,
      hasMipmaps: js.UndefOr[Boolean],
      generateMipmaps: js.UndefOr[Boolean],
      invertY: js.UndefOr[Boolean],
      premultiplyAlpha: js.UndefOr[Boolean],
      is3D: js.UndefOr[Boolean],
      format: js.UndefOr[GPUTextureFormat],
      sampleCount: js.UndefOr[Double],
      commandEncoder: js.UndefOr[GPUCommandEncoder],
      usage: js.UndefOr[Double],
      additionalUsages: js.UndefOr[Double]
    ): GPUTexture = js.native
    
    def destroyDeferredTextures(): Unit = js.native
    
    def generateCubeMipmaps(gpuTexture: GPUTexture, format: GPUTextureFormat, mipLevelCount: Double): Unit = js.native
    def generateCubeMipmaps(
      gpuTexture: GPUTexture,
      format: GPUTextureFormat,
      mipLevelCount: Double,
      commandEncoder: GPUCommandEncoder
    ): Unit = js.native
    def generateCubeMipmaps(gpuTexture: WebGPUHardwareTexture, format: GPUTextureFormat, mipLevelCount: Double): Unit = js.native
    def generateCubeMipmaps(
      gpuTexture: WebGPUHardwareTexture,
      format: GPUTextureFormat,
      mipLevelCount: Double,
      commandEncoder: GPUCommandEncoder
    ): Unit = js.native
    
    def generateMipmaps(gpuOrHdwTexture: GPUTexture, format: GPUTextureFormat, mipLevelCount: Double): Unit = js.native
    def generateMipmaps(gpuOrHdwTexture: GPUTexture, format: GPUTextureFormat, mipLevelCount: Double, faceIndex: Double): Unit = js.native
    def generateMipmaps(
      gpuOrHdwTexture: GPUTexture,
      format: GPUTextureFormat,
      mipLevelCount: Double,
      faceIndex: Double,
      commandEncoder: GPUCommandEncoder
    ): Unit = js.native
    def generateMipmaps(
      gpuOrHdwTexture: GPUTexture,
      format: GPUTextureFormat,
      mipLevelCount: Double,
      faceIndex: Unit,
      commandEncoder: GPUCommandEncoder
    ): Unit = js.native
    def generateMipmaps(gpuOrHdwTexture: WebGPUHardwareTexture, format: GPUTextureFormat, mipLevelCount: Double): Unit = js.native
    def generateMipmaps(
      gpuOrHdwTexture: WebGPUHardwareTexture,
      format: GPUTextureFormat,
      mipLevelCount: Double,
      faceIndex: Double
    ): Unit = js.native
    def generateMipmaps(
      gpuOrHdwTexture: WebGPUHardwareTexture,
      format: GPUTextureFormat,
      mipLevelCount: Double,
      faceIndex: Double,
      commandEncoder: GPUCommandEncoder
    ): Unit = js.native
    def generateMipmaps(
      gpuOrHdwTexture: WebGPUHardwareTexture,
      format: GPUTextureFormat,
      mipLevelCount: Double,
      faceIndex: Unit,
      commandEncoder: GPUCommandEncoder
    ): Unit = js.native
    
    def invertYPreMultiplyAlpha(
      gpuOrHdwTexture: GPUTexture | WebGPUHardwareTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: js.UndefOr[Boolean],
      premultiplyAlpha: js.UndefOr[Boolean],
      faceIndex: js.UndefOr[Double],
      mipLevel: js.UndefOr[Double],
      layers: js.UndefOr[Double],
      ofstX: js.UndefOr[Double],
      ofstY: js.UndefOr[Double],
      rectWidth: js.UndefOr[Double],
      rectHeight: js.UndefOr[Double],
      commandEncoder: js.UndefOr[GPUCommandEncoder],
      allowGPUOptimization: js.UndefOr[Boolean]
    ): Unit = js.native
    
    def readPixels(texture: GPUTexture, x: Double, y: Double, width: Double, height: Double, format: GPUTextureFormat): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Double
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Double,
      mipLevel: Double
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Double,
      mipLevel: Double,
      buffer: Unit,
      noDataConversion: Boolean
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Double,
      mipLevel: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView]
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Double,
      mipLevel: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      noDataConversion: Boolean
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Double,
      mipLevel: Unit,
      buffer: Unit,
      noDataConversion: Boolean
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Double,
      mipLevel: Unit,
      buffer: Nullable[js.typedarray.ArrayBufferView]
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Double,
      mipLevel: Unit,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      noDataConversion: Boolean
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Unit,
      mipLevel: Double
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Unit,
      mipLevel: Double,
      buffer: Unit,
      noDataConversion: Boolean
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Unit,
      mipLevel: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView]
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Unit,
      mipLevel: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      noDataConversion: Boolean
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Unit,
      mipLevel: Unit,
      buffer: Unit,
      noDataConversion: Boolean
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Unit,
      mipLevel: Unit,
      buffer: Nullable[js.typedarray.ArrayBufferView]
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(
      texture: GPUTexture,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      faceIndex: Unit,
      mipLevel: Unit,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      noDataConversion: Boolean
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    
    def releaseTexture(texture: GPUTexture): Unit = js.native
    def releaseTexture(texture: InternalTexture): Unit = js.native
    
    def setCommandEncoder(encoder: GPUCommandEncoder): Unit = js.native
    
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Boolean
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Boolean,
      premultiplyAlpha: Boolean
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Boolean,
      premultiplyAlpha: Boolean,
      offsetX: Double
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Boolean,
      premultiplyAlpha: Boolean,
      offsetX: Double,
      offsetY: Double
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Boolean,
      premultiplyAlpha: Boolean,
      offsetX: Unit,
      offsetY: Double
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Boolean,
      premultiplyAlpha: Unit,
      offsetX: Double
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Boolean,
      premultiplyAlpha: Unit,
      offsetX: Double,
      offsetY: Double
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Boolean,
      premultiplyAlpha: Unit,
      offsetX: Unit,
      offsetY: Double
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Unit,
      premultiplyAlpha: Boolean
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Unit,
      premultiplyAlpha: Boolean,
      offsetX: Double
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Unit,
      premultiplyAlpha: Boolean,
      offsetX: Double,
      offsetY: Double
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Unit,
      premultiplyAlpha: Boolean,
      offsetX: Unit,
      offsetY: Double
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Unit,
      premultiplyAlpha: Unit,
      offsetX: Double
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Unit,
      premultiplyAlpha: Unit,
      offsetX: Double,
      offsetY: Double
    ): Unit = js.native
    def updateCubeTextures(
      imageBitmaps: js.Array[ImageBitmap | js.typedarray.Uint8Array],
      gpuTexture: GPUTexture,
      width: Double,
      height: Double,
      format: GPUTextureFormat,
      invertY: Unit,
      premultiplyAlpha: Unit,
      offsetX: Unit,
      offsetY: Double
    ): Unit = js.native
    
    def updateTexture(
      imageBitmap: ImageBitmap | js.typedarray.Uint8Array | HTMLCanvasElement | OffscreenCanvas,
      texture: GPUTexture | InternalTexture,
      width: Double,
      height: Double,
      layers: Double,
      format: GPUTextureFormat,
      faceIndex: js.UndefOr[Double],
      mipLevel: js.UndefOr[Double],
      invertY: js.UndefOr[Boolean],
      premultiplyAlpha: js.UndefOr[Boolean],
      offsetX: js.UndefOr[Double],
      offsetY: js.UndefOr[Double],
      allowGPUOptimization: js.UndefOr[Boolean]
    ): Unit = js.native
  }
  /* static members */
  object WebGPUTextureHelper {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuTextureHelper", "WebGPUTextureHelper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ComputeNumMipmapLevels(width: Double, height: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ComputeNumMipmapLevels")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuTextureHelper", "WebGPUTextureHelper._GetBlockInformationFromFormat")
    @js.native
    def _GetBlockInformationFromFormat: Any = js.native
    inline def _GetBlockInformationFromFormat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetBlockInformationFromFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuTextureHelper", "WebGPUTextureHelper._GetTextureTypeFromFormat")
    @js.native
    def _GetTextureTypeFromFormat: Any = js.native
    inline def _GetTextureTypeFromFormat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetTextureTypeFromFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuTextureHelper", "WebGPUTextureHelper._IsHardwareTexture")
    @js.native
    def _IsHardwareTexture: Any = js.native
    inline def _IsHardwareTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsHardwareTexture")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuTextureHelper", "WebGPUTextureHelper._IsInternalTexture")
    @js.native
    def _IsInternalTexture: Any = js.native
    inline def _IsInternalTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsInternalTexture")(x.asInstanceOf[js.Any])
  }
}
