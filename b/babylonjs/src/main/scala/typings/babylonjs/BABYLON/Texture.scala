package typings.babylonjs.BABYLON

import typings.babylonjs.ImageBitmap
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Texture extends BaseTexture {
  
  /** @hidden */
  var _buffer: Nullable[String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap] = js.native
  
  var _cachedCoordinatesMode: js.Any = js.native
  
  var _cachedHomogeneousRotationInUVTransform: js.Any = js.native
  
  var _cachedProjectionMatrixId: js.Any = js.native
  
  var _cachedTextureMatrix: js.Any = js.native
  
  var _cachedUAng: js.Any = js.native
  
  var _cachedUOffset: js.Any = js.native
  
  var _cachedURotationCenter: js.Any = js.native
  
  var _cachedUScale: js.Any = js.native
  
  var _cachedVAng: js.Any = js.native
  
  var _cachedVOffset: js.Any = js.native
  
  var _cachedVRotationCenter: js.Any = js.native
  
  var _cachedVScale: js.Any = js.native
  
  var _cachedWAng: js.Any = js.native
  
  var _cachedWRotationCenter: js.Any = js.native
  
  var _delayedOnError: js.Any = js.native
  
  var _delayedOnLoad: js.Any = js.native
  
  var _deleteBuffer: js.Any = js.native
  
  var _format: Nullable[Double] = js.native
  
  /** @hidden */
  var _initialSamplingMode: Double = js.native
  
  /** @hidden */
  var _invertY: Boolean = js.native
  
  var _isBlocking: Boolean = js.native
  
  var _loaderOptions: js.Any = js.native
  
  var _mimeType: js.Any = js.native
  
  var _noMipmap: js.Any = js.native
  
  var _prepareRowForTextureGeneration: js.Any = js.native
  
  var _projectionModeMatrix: js.Any = js.native
  
  var _rowGenerationMatrix: js.Any = js.native
  
  var _t0: js.Any = js.native
  
  var _t1: js.Any = js.native
  
  var _t2: js.Any = js.native
  
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
    * Get the current sampling mode associated with the texture.
    */
  def samplingMode: Double = js.native
  
  /**
    * Define an offset on the texture to rotate around the u coordinates of the UVs
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
    */
  def updateURL(url: String): Unit = js.native
  def updateURL(
    url: String,
    buffer: js.UndefOr[Nullable[String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob]],
    onLoad: js.Function0[Unit]
  ): Unit = js.native
  def updateURL(url: String, buffer: Nullable[String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob]): Unit = js.native
  
  /**
    * Define the url of the texture.
    */
  var url: Nullable[String] = js.native
  
  /**
    * Define an offset on the texture to rotate around the v coordinates of the UVs
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
    * @see https://doc.babylonjs.com/how_to/more_materials
    */
  var wAng: Double = js.native
  
  /**
    * Defines the center of rotation (W)
    */
  var wRotationCenter: Double = js.native
}
