package typings.babylonjs.BABYLON

import typings.babylonjs.anon.IsReady
import typings.babylonjs.anon.Partialmessagestringexcep
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalTexture
  extends StObject
     with TextureSampler {
  
  /** @internal */
  var _associatedChannel: Double = js.native
  
  /** @internal */
  var _buffer: Nullable[
    String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob | ImageBitmap
  ] = js.native
  
  /** @internal */
  var _bufferView: Nullable[js.typedarray.ArrayBufferView] = js.native
  
  /** @internal */
  var _bufferViewArray: Nullable[js.Array[js.typedarray.ArrayBufferView]] = js.native
  
  /** @internal */
  var _bufferViewArrayArray: Nullable[js.Array[js.Array[js.typedarray.ArrayBufferView]]] = js.native
  
  /** @internal */
  var _cachedCoordinatesMode: Nullable[Double] = js.native
  
  /** @internal */
  var _compression: Nullable[String] = js.native
  
  /* private */ var _engine: Any = js.native
  
  /** @internal */
  var _extension: String = js.native
  
  /** @internal */
  var _files: Nullable[js.Array[String]] = js.native
  
  /** @internal */
  var _gammaSpace: Nullable[Boolean] = js.native
  
  /** @internal */
  var _hardwareTexture: Nullable[HardwareTextureWrapper] = js.native
  
  /** @internal */
  var _invertVScale: Boolean = js.native
  
  /** @internal */
  var _irradianceTexture: Nullable[BaseTexture] = js.native
  
  /** @internal */
  var _isDisabled: Boolean = js.native
  
  /** @internal */
  var _isRGBD: Boolean = js.native
  
  /** @internal */
  var _linearSpecularLOD: Boolean = js.native
  
  /** @internal */
  var _lodGenerationOffset: Double = js.native
  
  /** @internal */
  var _lodGenerationScale: Double = js.native
  
  /** @internal */
  var _lodTextureHigh: Nullable[BaseTexture] = js.native
  
  /** @internal */
  var _lodTextureLow: Nullable[BaseTexture] = js.native
  
  /** @internal */
  var _lodTextureMid: Nullable[BaseTexture] = js.native
  
  /** @internal */
  var _maxLodLevel: Nullable[Double] = js.native
  
  /** @internal */
  var _originalUrl: String = js.native
  
  /** @internal */
  def _rebuild(): Unit = js.native
  
  /** @internal */
  var _references: Double = js.native
  
  /** @internal */
  def _setUniqueId(id: Double): Unit = js.native
  
  /** @internal */
  var _size: Double = js.native
  
  /** @internal */
  var _source: InternalTextureSource = js.native
  
  /** @internal */
  var _sphericalPolynomial: Nullable[SphericalPolynomial] = js.native
  
  /** @internal */
  var _sphericalPolynomialComputed: Boolean = js.native
  
  /** @internal */
  var _sphericalPolynomialPromise: Nullable[js.Promise[SphericalPolynomial]] = js.native
  
  /**
    * @internal
    */
  def _swapAndDie(target: InternalTexture): Unit = js.native
  def _swapAndDie(target: InternalTexture, swapAll: Boolean): Unit = js.native
  
  /* private */ var _uniqueId: Any = js.native
  
  /** @internal */
  var _useSRGBBuffer: Boolean = js.native
  
  /** @internal */
  var _workingCanvas: Nullable[ICanvas] = js.native
  
  /** @internal */
  var _workingContext: Nullable[ICanvasRenderingContext] = js.native
  
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
    * Dispose the current allocated resources
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets the format of the texture (RGB, RGBA...)
    */
  var format: Double = js.native
  
  /**
    * Gets a boolean indicating if the texture needs mipmaps generation
    */
  var generateMipMaps: Boolean = js.native
  
  /**
    * Gets the Engine the texture belongs to.
    * @returns The babylon engine
    */
  def getEngine(): ThinEngine = js.native
  
  /**
    * Gets the height of the texture
    */
  var height: Double = js.native
  
  /**
    * Increments the number of references (ie. the number of Texture that point to it)
    */
  def incrementReferences(): Unit = js.native
  
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
    * Used for debugging purpose only
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Observable called when the texture load is raising an error
    */
  var onErrorObservable: Observable[Partialmessagestringexcep] = js.native
  
  /**
    * Observable called when the texture is loaded
    */
  var onLoadedObservable: Observable[InternalTexture] = js.native
  
  /**
    * If this callback is defined it will be called instead of the default _rebuild function
    */
  var onRebuildCallback: Nullable[js.Function1[/* internalTexture */ this.type, IsReady]] = js.native
  
  /**
    * Gets the number of samples used by the texture (WebGL2+ only)
    */
  var samples: Double = js.native
  
  /**
    * Gets the data source type of the texture
    */
  def source: InternalTextureSource = js.native
  
  /**
    * Gets the type of the texture (int, float...)
    */
  var `type`: Double = js.native
  
  /** Gets the unique id of the internal texture */
  def uniqueId: Double = js.native
  
  /**
    * Change the size of the texture (not the size of the content)
    * @param width defines the new width
    * @param height defines the new height
    * @param depth defines the new depth (1 by default)
    */
  def updateSize(width: int, height: int): Unit = js.native
  def updateSize(width: int, height: int, depth: int): Unit = js.native
  
  /**
    * Gets the URL used to load this texture
    */
  var url: String = js.native
  
  /**
    * Gets the width of the texture
    */
  var width: Double = js.native
}
