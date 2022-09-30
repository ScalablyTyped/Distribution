package typings.babylonjs

import typings.babylonjs.anon.Layers
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.thinEngineMod.ISceneLike
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.WebGLBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nullEngineMod {
  
  @JSImport("babylonjs/Engines/nullEngine", "NullEngine")
  @js.native
  open class NullEngine () extends Engine {
    def this(options: NullEngineOptions) = this()
    
    /**
      * @internal
      */
    def _bindTexture(channel: Double, texture: InternalTexture): Unit = js.native
    
    /**
      * @internal
      */
    def _createHardwareRenderTargetWrapper(isMulti: Boolean, isCube: Boolean, size: Double): RenderTargetWrapper = js.native
    def _createHardwareRenderTargetWrapper(isMulti: Boolean, isCube: Boolean, size: Layers): RenderTargetWrapper = js.native
    
    /* protected */ def _deleteBuffer(buffer: WebGLBuffer): Unit = js.native
    
    /* private */ var _options: Any = js.native
    
    /**
      * Binds the frame buffer to the specified texture.
      * @param rtWrapper The render target wrapper to render to
      * @param faceIndex The face of the texture to render to in case of cube texture
      * @param requiredWidth The width of the target to render to
      * @param requiredHeight The height of the target to render to
      * @param forceFullscreenViewport Forces the viewport to be the entire texture/screen if true
      */
    def bindFramebuffer(rtWrapper: RenderTargetWrapper): Unit = js.native
    def bindFramebuffer(rtWrapper: RenderTargetWrapper, faceIndex: Double): Unit = js.native
    def bindFramebuffer(rtWrapper: RenderTargetWrapper, faceIndex: Double, requiredWidth: Double): Unit = js.native
    def bindFramebuffer(rtWrapper: RenderTargetWrapper, faceIndex: Double, requiredWidth: Double, requiredHeight: Double): Unit = js.native
    def bindFramebuffer(
      rtWrapper: RenderTargetWrapper,
      faceIndex: Double,
      requiredWidth: Double,
      requiredHeight: Double,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(
      rtWrapper: RenderTargetWrapper,
      faceIndex: Double,
      requiredWidth: Double,
      requiredHeight: Unit,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(rtWrapper: RenderTargetWrapper, faceIndex: Double, requiredWidth: Unit, requiredHeight: Double): Unit = js.native
    def bindFramebuffer(
      rtWrapper: RenderTargetWrapper,
      faceIndex: Double,
      requiredWidth: Unit,
      requiredHeight: Double,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(
      rtWrapper: RenderTargetWrapper,
      faceIndex: Double,
      requiredWidth: Unit,
      requiredHeight: Unit,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(rtWrapper: RenderTargetWrapper, faceIndex: Unit, requiredWidth: Double): Unit = js.native
    def bindFramebuffer(rtWrapper: RenderTargetWrapper, faceIndex: Unit, requiredWidth: Double, requiredHeight: Double): Unit = js.native
    def bindFramebuffer(
      rtWrapper: RenderTargetWrapper,
      faceIndex: Unit,
      requiredWidth: Double,
      requiredHeight: Double,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(
      rtWrapper: RenderTargetWrapper,
      faceIndex: Unit,
      requiredWidth: Double,
      requiredHeight: Unit,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(rtWrapper: RenderTargetWrapper, faceIndex: Unit, requiredWidth: Unit, requiredHeight: Double): Unit = js.native
    def bindFramebuffer(
      rtWrapper: RenderTargetWrapper,
      faceIndex: Unit,
      requiredWidth: Unit,
      requiredHeight: Double,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindFramebuffer(
      rtWrapper: RenderTargetWrapper,
      faceIndex: Unit,
      requiredWidth: Unit,
      requiredHeight: Unit,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    
    /**
      * Creates a dynamic vertex buffer
      * @param vertices the data for the dynamic vertex buffer
      * @returns the new WebGL dynamic buffer
      */
    def createDynamicVertexBuffer(vertices: FloatArray): DataBuffer = js.native
    
    /**
      * Creates a raw texture
      * @param data defines the data to store in the texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param format defines the format of the data
      * @param generateMipMaps defines if the engine should generate the mip levels
      * @param invertY defines if data must be stored with Y axis inverted
      * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
      * @param compression defines the compression used (null by default)
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
      * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
      * @returns the raw texture inside an InternalTexture
      */
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ): InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Unit,
      `type`: Double
    ): InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Unit,
      `type`: Double,
      creationFlags: Double
    ): InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Unit,
      `type`: Double,
      creationFlags: Double,
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Unit,
      `type`: Double,
      creationFlags: Unit,
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Unit,
      `type`: Unit,
      creationFlags: Double
    ): InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Unit,
      `type`: Unit,
      creationFlags: Double,
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Unit,
      `type`: Unit,
      creationFlags: Unit,
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String]
    ): InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      `type`: Unit,
      creationFlags: Double
    ): InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      `type`: Unit,
      creationFlags: Double,
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      `type`: Unit,
      creationFlags: Unit,
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    
    /**
      * Usually called from Texture.ts.
      * Passed information to create a WebGLTexture
      * @param urlArg defines a value which contains one of the following:
      * * A conventional http URL, e.g. 'http://...' or 'file://...'
      * * A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
      * * An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file
      * @param invertY when true, image is flipped when loaded.  You probably want true. Certain compressed textures may invert this if their default is inverted (eg. ktx)
      * @param scene needed for loading to the correct scene
      * @param samplingMode mode with should be used sample / access the texture (Default: Texture.TRILINEAR_SAMPLINGMODE)
      * @param onLoad optional callback to be called upon successful completion
      * @param onError optional callback to be called upon failure
      * @param buffer a source of a file previously fetched as either a base64 string, an ArrayBuffer (compressed or image format), HTMLImageElement (image format), or a Blob
      * @param fallback an internal argument in case the function must be called again, due to etc1 not having alpha capabilities
      * @param format internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param mimeType defines an optional mime type
      * @returns a InternalTexture for assignment back into BABYLON.Texture
      */
    def createTexture(
      urlArg: Nullable[String],
      noMipmap: Boolean,
      invertY: Boolean,
      scene: Nullable[ISceneLike],
      samplingMode: js.UndefOr[Double],
      onLoad: js.UndefOr[Nullable[js.Function1[/* texture */ InternalTexture, Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[/* message */ String, /* exception */ Any, Unit]]],
      buffer: js.UndefOr[
          Nullable[
            String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob | ImageBitmap
          ]
        ],
      fallback: js.UndefOr[Nullable[InternalTexture]],
      format: js.UndefOr[Nullable[Double]],
      forcedExtension: js.UndefOr[Nullable[String]],
      mimeType: js.UndefOr[String]
    ): InternalTexture = js.native
    
    /**
      * Creates a vertex buffer
      * @param vertices the data for the vertex buffer
      * @returns the new WebGL static buffer
      */
    def createVertexBuffer(vertices: FloatArray): DataBuffer = js.native
    
    /**
      * Set the value of an uniform to a boolean
      * @param uniform defines the webGL uniform location where to store the value
      * @param bool defines the boolean to store
      * @returns true if value was set
      */
    def setBool(uniform: WebGLUniformLocation, bool: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of float32
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of float32 to store
      * @returns true if value was set
      */
    def setFloatArray(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of float32 (stored as vec2)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of float32 to store
      * @returns true if value was set
      */
    def setFloatArray2(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of float32 (stored as vec3)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of float32 to store
      * @returns true if value was set
      */
    def setFloatArray3(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of float32 (stored as vec4)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of float32 to store
      * @returns true if value was set
      */
    def setFloatArray4(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Boolean = js.native
    
    /**
      * Update a dynamic index buffer
      * @param indexBuffer defines the target index buffer
      * @param indices defines the data to update
      * @param offset defines the offset in the target index buffer where update should start
      */
    def updateDynamicIndexBuffer(indexBuffer: WebGLBuffer, indices: IndicesArray): Unit = js.native
    def updateDynamicIndexBuffer(indexBuffer: WebGLBuffer, indices: IndicesArray, offset: Double): Unit = js.native
    
    /**
      * Update the content of a dynamic texture
      * @param texture defines the texture to update
      * @param canvas defines the canvas containing the source
      * @param invertY defines if data must be stored with Y axis inverted
      * @param premulAlpha defines if alpha is stored as premultiplied
      * @param format defines the format of the data
      */
    def updateDynamicTexture(texture: Nullable[InternalTexture], canvas: HTMLCanvasElement, invertY: Boolean): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Boolean
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Boolean,
      format: Double
    ): Unit = js.native
    def updateDynamicTexture(
      texture: Nullable[InternalTexture],
      canvas: HTMLCanvasElement,
      invertY: Boolean,
      premulAlpha: Unit,
      format: Double
    ): Unit = js.native
    
    /**
      * Updates a dynamic vertex buffer.
      * @param vertexBuffer the vertex buffer to update
      * @param vertices the data used to update the vertex buffer
      * @param byteOffset the byte offset of the data (optional)
      * @param byteLength the byte length of the data (optional)
      */
    def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: FloatArray): Unit = js.native
    def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: FloatArray, byteOffset: Double): Unit = js.native
    def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: FloatArray, byteOffset: Double, byteLength: Double): Unit = js.native
    def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: FloatArray, byteOffset: Unit, byteLength: Double): Unit = js.native
    
    def updateRawTexture(
      texture: Nullable[InternalTexture],
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Unit,
      `type`: Double
    ): Unit = js.native
    def updateRawTexture(
      texture: Nullable[InternalTexture],
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Unit,
      `type`: Double,
      useSRGBBuffer: Boolean
    ): Unit = js.native
    def updateRawTexture(
      texture: Nullable[InternalTexture],
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Unit,
      `type`: Unit,
      useSRGBBuffer: Boolean
    ): Unit = js.native
    def updateRawTexture(
      texture: Nullable[InternalTexture],
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Nullable[String]
    ): Unit = js.native
    def updateRawTexture(
      texture: Nullable[InternalTexture],
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Nullable[String],
      `type`: Double
    ): Unit = js.native
    def updateRawTexture(
      texture: Nullable[InternalTexture],
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Nullable[String],
      `type`: Unit,
      useSRGBBuffer: Boolean
    ): Unit = js.native
  }
  
  @JSImport("babylonjs/Engines/nullEngine", "NullEngineOptions")
  @js.native
  open class NullEngineOptions () extends StObject {
    
    /**
      * If delta time between frames should be constant
      * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
      */
    var deterministicLockstep: Boolean = js.native
    
    /**
      * Maximum about of steps between frames (Default: 4)
      * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
      */
    var lockstepMaxSteps: Double = js.native
    
    /**
      * Render height (Default: 256)
      */
    var renderHeight: Double = js.native
    
    /**
      * Render width (Default: 512)
      */
    var renderWidth: Double = js.native
    
    /**
      * Texture size (Default: 512)
      */
    var textureSize: Double = js.native
    
    /**
      * Make the matrix computations to be performed in 64 bits instead of 32 bits. False by default
      */
    var useHighPrecisionMatrix: js.UndefOr[Boolean] = js.native
  }
}
