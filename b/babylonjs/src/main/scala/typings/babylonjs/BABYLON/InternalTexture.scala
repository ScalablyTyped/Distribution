package typings.babylonjs.BABYLON

import typings.babylonjs.CanvasRenderingContext2D
import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.ImageBitmap
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.OffscreenCanvas
import typings.std.OffscreenCanvasRenderingContext2D
import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderbuffer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.InternalTexture")
@js.native
class InternalTexture protected () extends js.Object {
  /**
    * Creates a new InternalTexture
    * @param engine defines the engine to use
    * @param source defines the type of data that will be used
    * @param delayAllocation if the texture allocation should be delayed (default: false)
    */
  def this(engine: ThinEngine, source: InternalTextureSource) = this()
  def this(engine: ThinEngine, source: InternalTextureSource, delayAllocation: Boolean) = this()
  /** @hidden */
  var _MSAAFramebuffer: Nullable[WebGLFramebuffer] = js.native
  /** @hidden */
  var _MSAARenderBuffer: Nullable[WebGLRenderbuffer] = js.native
  /** @hidden */
  var _associatedChannel: Double = js.native
  /** @hidden */
  var _attachments: Nullable[js.Array[Double]] = js.native
  /** @hidden */
  var _buffer: Nullable[String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap] = js.native
  /** @hidden */
  var _bufferView: Nullable[ArrayBufferView] = js.native
  /** @hidden */
  var _bufferViewArray: Nullable[js.Array[ArrayBufferView]] = js.native
  /** @hidden */
  var _bufferViewArrayArray: Nullable[js.Array[js.Array[ArrayBufferView]]] = js.native
  /** @hidden */
  var _cachedAnisotropicFilteringLevel: Nullable[Double] = js.native
  /** @hidden */
  var _cachedCoordinatesMode: Nullable[Double] = js.native
  /** @hidden */
  var _cachedWrapR: Nullable[Double] = js.native
  /** @hidden */
  var _cachedWrapU: Nullable[Double] = js.native
  /** @hidden */
  var _cachedWrapV: Nullable[Double] = js.native
  /** @hidden */
  var _colorTextureArray: Nullable[WebGLTexture] = js.native
  /** @hidden */
  var _comparisonFunction: Double = js.native
  /** @hidden */
  var _compression: Nullable[String] = js.native
  /** @hidden */
  var _depthStencilBuffer: Nullable[WebGLRenderbuffer] = js.native
  /** @hidden */
  var _depthStencilTexture: Nullable[InternalTexture] = js.native
  /** @hidden */
  var _depthStencilTextureArray: Nullable[WebGLTexture] = js.native
  var _engine: js.Any = js.native
  /** @hidden */
  var _extension: String = js.native
  /** @hidden */
  var _files: Nullable[js.Array[String]] = js.native
  /** @hidden */
  var _framebuffer: Nullable[WebGLFramebuffer] = js.native
  /** @hidden */
  var _generateDepthBuffer: Boolean = js.native
  /** @hidden */
  var _generateStencilBuffer: Boolean = js.native
  /** @hidden */
  var _invertVScale: Boolean = js.native
  /** @hidden */
  var _irradianceTexture: Nullable[BaseTexture] = js.native
  /** @hidden */
  var _isDisabled: Boolean = js.native
  /** @hidden */
  var _isRGBD: Boolean = js.native
  /** @hidden */
  var _linearSpecularLOD: Boolean = js.native
  /** @hidden */
  var _lodGenerationOffset: Double = js.native
  /** @hidden */
  var _lodGenerationScale: Double = js.native
  /** @hidden */
  var _lodTextureHigh: Nullable[BaseTexture] = js.native
  /** @hidden */
  var _lodTextureLow: Nullable[BaseTexture] = js.native
  /** @hidden */
  var _lodTextureMid: Nullable[BaseTexture] = js.native
  /** @hidden */
  var _references: Double = js.native
  /** @hidden */
  var _size: Double = js.native
  /** @hidden */
  var _source: InternalTextureSource = js.native
  /** @hidden */
  var _sphericalPolynomial: Nullable[SphericalPolynomial] = js.native
  /** @hidden */
  var _webGLTexture: Nullable[WebGLTexture] = js.native
  /** @hidden */
  var _workingCanvas: Nullable[HTMLCanvasElement | OffscreenCanvas] = js.native
  /** @hidden */
  var _workingContext: Nullable[CanvasRenderingContext2D | OffscreenCanvasRenderingContext2D] = js.native
  /**
    * Gets the initial depth of the texture (It could be rescaled if the current system does not support non power of two textures)
    */
  var baseDepth: Double = js.native
  /**
    * Gets the initial height of the texture (It could be rescaled if the current system does not support non power of two textures)
    */
  var baseHeight: Double = js.native
  /**
    * Gets the initial width of the texture (It could be rescaled if the current system does not support non power of two textures)
    */
  var baseWidth: Double = js.native
  /**
    * Gets the depth of the texture
    */
  var depth: Double = js.native
  /**
    * Gets the format of the texture (RGB, RGBA...)
    */
  var format: Double = js.native
  /**
    * Gets a boolean indicating if the texture needs mipmaps generation
    */
  var generateMipMaps: Boolean = js.native
  /**
    * Gets the height of the texture
    */
  var height: Double = js.native
  /**
    * Gets a boolean indicating if the texture is inverted on Y axis
    */
  var invertY: Boolean = js.native
  /**
    * Defines if the texture contains 2D array data
    */
  var is2DArray: Boolean = js.native
  /**
    * Defines if the texture contains 3D data
    */
  var is3D: Boolean = js.native
  /**
    * Defines if the texture is a cube texture
    */
  var isCube: Boolean = js.native
  /**
    * Defines if the texture contains multiview data
    */
  var isMultiview: Boolean = js.native
  /**
    * Defines if the texture is ready
    */
  var isReady: Boolean = js.native
  /**
    * Observable called when the texture is loaded
    */
  var onLoadedObservable: Observable[InternalTexture] = js.native
  /**
    * Gets the number of samples used by the texture (WebGL2+ only)
    */
  var samples: Double = js.native
  /**
    * Gets the sampling mode of the texture
    */
  var samplingMode: Double = js.native
  /**
    * Gets the type of the texture (int, float...)
    */
  var `type`: Double = js.native
  /**
    * Gets the URL used to load this texture
    */
  var url: String = js.native
  /**
    * Gets the width of the texture
    */
  var width: Double = js.native
  /** @hidden */
  def _rebuild(): Unit = js.native
  /** @hidden */
  def _swapAndDie(target: InternalTexture): Unit = js.native
  /**
    * Dispose the current allocated resources
    */
  def dispose(): Unit = js.native
  /**
    * Gets the Engine the texture belongs to.
    * @returns The babylon engine
    */
  def getEngine(): ThinEngine = js.native
  /**
    * Increments the number of references (ie. the number of Texture that point to it)
    */
  def incrementReferences(): Unit = js.native
  /**
    * Gets the data source type of the texture
    */
  def source(): InternalTextureSource = js.native
  /**
    * Change the size of the texture (not the size of the content)
    * @param width defines the new width
    * @param height defines the new height
    * @param depth defines the new depth (1 by default)
    */
  def updateSize(width: int, height: int): Unit = js.native
  def updateSize(width: int, height: int, depth: int): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.InternalTexture")
@js.native
object InternalTexture extends js.Object {
  /** @hidden */
  def _UpdateRGBDAsync(
    internalTexture: InternalTexture,
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: Nullable[SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}

