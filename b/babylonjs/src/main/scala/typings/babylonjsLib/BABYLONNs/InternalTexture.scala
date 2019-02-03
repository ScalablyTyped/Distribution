package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store data associated with WebGL texture data for the engine
  * This class should not be used directly
  */
@JSGlobal("BABYLON.InternalTexture")
@js.native
class InternalTexture protected () extends IInternalTextureTracker {
  /**
    * Creates a new InternalTexture
    * @param engine defines the engine to use
    * @param dataSource defines the type of data that will be used
    */
  def this(engine: Engine, dataSource: scala.Double) = this()
  /** @hidden */
  var _MSAAFramebuffer: Nullable[stdLib.WebGLFramebuffer] = js.native
  /** @hidden */
  var _MSAARenderBuffer: Nullable[stdLib.WebGLRenderbuffer] = js.native
  /** @hidden */
  var _attachments: Nullable[js.Array[scala.Double]] = js.native
  /** @hidden */
  var _buffer: Nullable[java.lang.String | stdLib.ArrayBuffer | stdLib.HTMLImageElement | stdLib.Blob] = js.native
  /** @hidden */
  var _bufferView: Nullable[stdLib.ArrayBufferView] = js.native
  /** @hidden */
  var _bufferViewArray: Nullable[js.Array[stdLib.ArrayBufferView]] = js.native
  /** @hidden */
  var _bufferViewArrayArray: Nullable[js.Array[js.Array[stdLib.ArrayBufferView]]] = js.native
  /** @hidden */
  var _cachedAnisotropicFilteringLevel: Nullable[scala.Double] = js.native
  /** @hidden */
  var _cachedCoordinatesMode: Nullable[scala.Double] = js.native
  /** @hidden */
  var _cachedWrapR: Nullable[scala.Double] = js.native
  /** @hidden */
  var _cachedWrapU: Nullable[scala.Double] = js.native
  /** @hidden */
  var _cachedWrapV: Nullable[scala.Double] = js.native
  /** @hidden */
  var _comparisonFunction: scala.Double = js.native
  /** @hidden */
  var _compression: Nullable[java.lang.String] = js.native
  /** @hidden */
  var _dataSource: scala.Double = js.native
  /** @hidden */
  var _depthStencilBuffer: Nullable[stdLib.WebGLRenderbuffer] = js.native
  /** @hidden */
  var _designatedSlot: scala.Double = js.native
  var _engine: js.Any = js.native
  /** @hidden */
  var _extension: java.lang.String = js.native
  /** @hidden */
  var _files: Nullable[js.Array[java.lang.String]] = js.native
  /** @hidden */
  var _framebuffer: Nullable[stdLib.WebGLFramebuffer] = js.native
  /** @hidden */
  var _generateDepthBuffer: scala.Boolean = js.native
  /** @hidden */
  var _generateStencilBuffer: scala.Boolean = js.native
  /** @hidden */
  var _initialSlot: scala.Double = js.native
  /** @hidden */
  var _isDisabled: scala.Boolean = js.native
  /** @hidden */
  var _isRGBD: scala.Boolean = js.native
  /** @hidden */
  var _lodGenerationOffset: scala.Double = js.native
  /** @hidden */
  var _lodGenerationScale: scala.Double = js.native
  /** @hidden */
  var _lodTextureHigh: BaseTexture = js.native
  /** @hidden */
  var _lodTextureLow: BaseTexture = js.native
  /** @hidden */
  var _lodTextureMid: BaseTexture = js.native
  /** @hidden */
  var _references: scala.Double = js.native
  /** @hidden */
  var _size: scala.Double = js.native
  /** @hidden */
  var _sphericalPolynomial: Nullable[SphericalPolynomial] = js.native
  /** @hidden */
  var _webGLTexture: Nullable[stdLib.WebGLTexture] = js.native
  /** @hidden */
  var _workingCanvas: babylonjsLib.HTMLCanvasElement = js.native
  /** @hidden */
  var _workingContext: babylonjsLib.CanvasRenderingContext2D = js.native
  /**
    * Gets the initial depth of the texture (It could be rescaled if the current system does not support non power of two textures)
    */
  var baseDepth: scala.Double = js.native
  /**
    * Gets the initial height of the texture (It could be rescaled if the current system does not support non power of two textures)
    */
  var baseHeight: scala.Double = js.native
  /**
    * Gets the initial width of the texture (It could be rescaled if the current system does not support non power of two textures)
    */
  var baseWidth: scala.Double = js.native
  /**
    * Gets the data source type of the texture (can be one of the BABYLON.InternalTexture.DATASOURCE_XXXX)
    */
  val dataSource: scala.Double = js.native
  /**
    * Gets the depth of the texture
    */
  var depth: scala.Double = js.native
  /**
    * Gets the format of the texture (RGB, RGBA...)
    */
  var format: scala.Double = js.native
  /**
    * Gets a boolean indicating if the texture needs mipmaps generation
    */
  var generateMipMaps: scala.Boolean = js.native
  /**
    * Gets the height of the texture
    */
  var height: scala.Double = js.native
  /**
    * Gets a boolean indicating if the texture is inverted on Y axis
    */
  var invertY: scala.Boolean = js.native
  /**
    * Defines if the texture contains 3D data
    */
  var is3D: scala.Boolean = js.native
  /**
    * Defines if the texture is a cube texture
    */
  var isCube: scala.Boolean = js.native
  /**
    * Defines if the texture is ready
    */
  var isReady: scala.Boolean = js.native
  /**
    * Gets or set the next tracker in the list
    */
  /* CompleteClass */
  override var next: Nullable[IInternalTextureTracker] = js.native
  /**
    * Observable called when the texture is loaded
    */
  var onLoadedObservable: Observable[InternalTexture] = js.native
  /**
    * Gets or set the previous tracker in the list
    */
  /* CompleteClass */
  override var previous: Nullable[IInternalTextureTracker] = js.native
  /**
    * Gets the number of samples used by the texture (WebGL2+ only)
    */
  var samples: scala.Double = js.native
  /**
    * Gets the sampling mode of the texture
    */
  var samplingMode: scala.Double = js.native
  /**
    * Gets the type of the texture (int, float...)
    */
  var `type`: scala.Double = js.native
  /**
    * Gets the URL used to load this texture
    */
  var url: java.lang.String = js.native
  /**
    * Gets the width of the texture
    */
  var width: scala.Double = js.native
  /** @hidden */
  def _rebuild(): scala.Unit = js.native
  /** @hidden */
  def _swapAndDie(target: InternalTexture): scala.Unit = js.native
  /**
    * Dispose the current allocated resources
    */
  def dispose(): scala.Unit = js.native
  /**
    * Gets the Engine the texture belongs to.
    * @returns The babylon engine
    */
  def getEngine(): Engine = js.native
  /**
    * Increments the number of references (ie. the number of Texture that point to it)
    */
  def incrementReferences(): scala.Unit = js.native
  /**
    * Change the size of the texture (not the size of the content)
    * @param width defines the new width
    * @param height defines the new height
    * @param depth defines the new depth (1 by default)
    */
  def updateSize(width: int, height: int): scala.Unit = js.native
  def updateSize(width: int, height: int, depth: int): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.InternalTexture")
@js.native
object InternalTexture extends js.Object {
  /**
    * Texture data comes from a cube data file
    */
  var DATASOURCE_CUBE: scala.Double = js.native
  /**
    * Texture data come from a prefiltered cube data file
    */
  var DATASOURCE_CUBEPREFILTERED: scala.Double = js.native
  /**
    * Texture data comes from a raw cube data
    */
  var DATASOURCE_CUBERAW: scala.Double = js.native
  /**
    * Texture data comes from a raw cube data encoded with RGBD
    */
  var DATASOURCE_CUBERAW_RGBD: scala.Double = js.native
  /**
    * Texture content is a depth texture
    */
  var DATASOURCE_DEPTHTEXTURE: scala.Double = js.native
  /**
    * Texture content is dynamic (video or dynamic texture)
    */
  var DATASOURCE_DYNAMIC: scala.Double = js.native
  /**
    * Texture content is part of a multi render target process
    */
  var DATASOURCE_MULTIRENDERTARGET: scala.Double = js.native
  /**
    * Texture data comes from raw data (ArrayBuffer)
    */
  var DATASOURCE_RAW: scala.Double = js.native
  /**
    * Texture content is raw 3D data
    */
  var DATASOURCE_RAW3D: scala.Double = js.native
  /**
    * Texture content is generated by rendering to it
    */
  var DATASOURCE_RENDERTARGET: scala.Double = js.native
  /**
    * Texture data is only used for temporary storage
    */
  var DATASOURCE_TEMP: scala.Double = js.native
  /**
    * The source of the texture data is unknown
    */
  var DATASOURCE_UNKNOWN: scala.Double = js.native
  /**
    * Texture data comes from an URL
    */
  var DATASOURCE_URL: scala.Double = js.native
}

