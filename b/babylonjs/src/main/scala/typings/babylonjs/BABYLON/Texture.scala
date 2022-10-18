package typings.babylonjs.BABYLON

import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Texture
  extends StObject
     with BaseTexture {
  
  /** @internal */
  var _buffer: Nullable[
    String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob | ImageBitmap
  ] = js.native
  
  /* private */ var _cachedHomogeneousRotationInUVTransform: Any = js.native
  
  /* private */ var _cachedReflectionCoordinatesMode: Any = js.native
  
  /* private */ var _cachedReflectionProjectionMatrixId: Any = js.native
  
  /* private */ var _cachedReflectionTextureMatrix: Any = js.native
  
  /* private */ var _cachedReflectionUOffset: Any = js.native
  
  /* private */ var _cachedReflectionUScale: Any = js.native
  
  /* private */ var _cachedReflectionVOffset: Any = js.native
  
  /* private */ var _cachedReflectionVScale: Any = js.native
  
  /* private */ var _cachedTextureMatrix: Any = js.native
  
  /* private */ var _cachedUAng: Any = js.native
  
  /* private */ var _cachedUOffset: Any = js.native
  
  /* private */ var _cachedURotationCenter: Any = js.native
  
  /* private */ var _cachedUScale: Any = js.native
  
  /* private */ var _cachedVAng: Any = js.native
  
  /* private */ var _cachedVOffset: Any = js.native
  
  /* private */ var _cachedVRotationCenter: Any = js.native
  
  /* private */ var _cachedVScale: Any = js.native
  
  /* private */ var _cachedWAng: Any = js.native
  
  /* private */ var _cachedWRotationCenter: Any = js.native
  
  /* private */ var _creationFlags: Any = js.native
  
  /* private */ var _delayedOnError: Any = js.native
  
  /* private */ var _delayedOnLoad: Any = js.native
  
  /* private */ var _deleteBuffer: Any = js.native
  
  /* private */ var _forcedExtension: Any = js.native
  
  /* protected */ var _format: Nullable[Double] = js.native
  
  /** @internal */
  var _invertY: Boolean = js.native
  
  /* protected */ var _isBlocking: Boolean = js.native
  
  /* private */ var _loaderOptions: Any = js.native
  
  /* private */ var _mimeType: Any = js.native
  
  /* private */ var _noMipmap: Any = js.native
  
  /* private */ var _prepareRowForTextureGeneration: Any = js.native
  
  /* private */ var _projectionModeMatrix: Any = js.native
  
  /* private */ var _rowGenerationMatrix: Any = js.native
  
  /* private */ var _t0: Any = js.native
  
  /* private */ var _t1: Any = js.native
  
  /* private */ var _t2: Any = js.native
  
  /* private */ var _useSRGBBuffer: Any = js.native
  
  /**
    * Checks if the texture has the same transform matrix than another texture
    * @param texture texture to check against
    * @returns true if the transforms are the same, else false
    */
  def checkTransformsAreIdentical(texture: Nullable[Texture]): Boolean = js.native
  
  def getTextureMatrix(uBase: Double): Matrix = js.native
  
  /**
    * Sets this property to true to avoid deformations when rotating the texture with non-uniform scaling
    */
  var homogeneousRotationInUVTransform: Boolean = js.native
  
  /**
    * List of inspectable custom properties (used by the Inspector)
    * @see https://doc.babylonjs.com/how_to/debug_layer#extensibility
    */
  var inspectableCustomProperties: Nullable[js.Array[IInspectable]] = js.native
  
  /**
    * Gets a boolean indicating if the texture needs to be inverted on the y axis during loading
    */
  def invertY: Boolean = js.native
  
  /**
    * Is the texture preventing material to render while loading.
    * If false, a default texture will be used instead of the loading one during the preparation step.
    */
  def isBlocking_=(value: Boolean): Unit = js.native
  
  /** Returns the texture mime type if it was defined by a loader (undefined else) */
  def mimeType: js.UndefOr[String] = js.native
  
  /**
    * Observable triggered once the texture has been loaded.
    */
  var onLoadObservable: Observable[Texture] = js.native
  
  /**
    * Define an offset on the texture to rotate around the u coordinates of the UVs
    * The angle is defined in radians.
    * @see https://doc.babylonjs.com/how_to/more_materials
    */
  var uAng: Double = js.native
  
  /**
    * Define an offset on the texture to offset the u coordinates of the UVs
    * @see https://doc.babylonjs.com/how_to/more_materials#offsetting
    */
  var uOffset: Double = js.native
  
  /**
    * Defines the center of rotation (U)
    */
  var uRotationCenter: Double = js.native
  
  /**
    * Define an offset on the texture to scale the u coordinates of the UVs
    * @see https://doc.babylonjs.com/how_to/more_materials#tiling
    */
  var uScale: Double = js.native
  
  /**
    * Update the url (and optional buffer) of this texture if url was null during construction.
    * @param url the url of the texture
    * @param buffer the buffer of the texture (defaults to null)
    * @param onLoad callback called when the texture is loaded  (defaults to null)
    * @param forcedExtension defines the extension to use to pick the right loader
    */
  def updateURL(url: String): Unit = js.native
  def updateURL(url: String, buffer: Unit, onLoad: js.Function0[Unit]): Unit = js.native
  def updateURL(url: String, buffer: Unit, onLoad: js.Function0[Unit], forcedExtension: String): Unit = js.native
  def updateURL(url: String, buffer: Unit, onLoad: Unit, forcedExtension: String): Unit = js.native
  def updateURL(
    url: String,
    buffer: Nullable[
      String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob
    ]
  ): Unit = js.native
  def updateURL(
    url: String,
    buffer: Nullable[
      String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob
    ],
    onLoad: js.Function0[Unit]
  ): Unit = js.native
  def updateURL(
    url: String,
    buffer: Nullable[
      String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob
    ],
    onLoad: js.Function0[Unit],
    forcedExtension: String
  ): Unit = js.native
  def updateURL(
    url: String,
    buffer: Nullable[
      String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob
    ],
    onLoad: Unit,
    forcedExtension: String
  ): Unit = js.native
  
  /**
    * Define the url of the texture.
    */
  var url: Nullable[String] = js.native
  
  /**
    * Define an offset on the texture to rotate around the v coordinates of the UVs
    * The angle is defined in radians.
    * @see https://doc.babylonjs.com/how_to/more_materials
    */
  var vAng: Double = js.native
  
  /**
    * Define an offset on the texture to offset the v coordinates of the UVs
    * @see https://doc.babylonjs.com/how_to/more_materials#offsetting
    */
  var vOffset: Double = js.native
  
  /**
    * Defines the center of rotation (V)
    */
  var vRotationCenter: Double = js.native
  
  /**
    * Define an offset on the texture to scale the v coordinates of the UVs
    * @see https://doc.babylonjs.com/how_to/more_materials#tiling
    */
  var vScale: Double = js.native
  
  /**
    * Define an offset on the texture to rotate around the w coordinates of the UVs (in case of 3d texture)
    * The angle is defined in radians.
    * @see https://doc.babylonjs.com/how_to/more_materials
    */
  var wAng: Double = js.native
  
  /**
    * Defines the center of rotation (W)
    */
  var wRotationCenter: Double = js.native
}
