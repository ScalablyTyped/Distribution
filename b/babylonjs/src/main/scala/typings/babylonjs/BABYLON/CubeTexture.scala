package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CubeTexture
  extends StObject
     with BaseTexture {
  
  /* private */ var _boundingBoxSize: Any = js.native
  
  /* private */ var _createPolynomials: Any = js.native
  
  /* private */ var _delayedOnError: Any = js.native
  
  /* private */ var _delayedOnLoad: Any = js.native
  
  /* private */ var _extensions: Any = js.native
  
  /** @internal */
  var _files: Nullable[js.Array[String]] = js.native
  
  /* protected */ var _forcedExtension: Nullable[String] = js.native
  
  /* private */ var _format: Any = js.native
  
  /* private */ var _loadTexture: Any = js.native
  
  /* private */ var _loaderOptions: Any = js.native
  
  /* private */ var _lodOffset: Any = js.native
  
  /* private */ var _lodScale: Any = js.native
  
  /* private */ var _noMipmap: Any = js.native
  
  /* protected */ var _rotationY: Double = js.native
  
  /* private */ var _textureMatrix: Any = js.native
  
  /* private */ var _textureMatrixRefraction: Any = js.native
  
  /* private */ var _useSRGBBuffer: Any = js.native
  
  /**
    * Gets or sets the center of the bounding box associated with the cube texture.
    * It must define where the camera used to render the texture was set
    * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/reflectionTexture#using-local-cubemap-mode
    */
  var boundingBoxPosition: Vector3 = js.native
  
  /**
    * Returns the bounding box size
    * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/reflectionTexture#using-local-cubemap-mode
    */
  def boundingBoxSize: Vector3 = js.native
  /**
    * Gets or sets the size of the bounding box associated with the cube texture
    * When defined, the cubemap will switch to local mode
    * @see https://community.arm.com/graphics/b/blog/posts/reflections-based-on-local-cubemaps-in-unity
    * @example https://www.babylonjs-playground.com/#RNASML
    */
  def boundingBoxSize_=(value: Vector3): Unit = js.native
  
  def delayLoad(forcedExtension: String): Unit = js.native
  
  /**
    * Gets the forced extension (if any)
    */
  def forcedExtension: Nullable[String] = js.native
  
  /**
    * Observable triggered once the texture has been loaded.
    */
  var onLoadObservable: Observable[CubeTexture] = js.native
  
  /**
    * Gets texture matrix rotation angle around Y axis radians.
    */
  def rotationY: Double = js.native
  /**
    * Sets texture matrix rotation angle around Y axis in radians.
    */
  def rotationY_=(value: Double): Unit = js.native
  
  /**
    * Sets the reflection texture matrix
    * @param value Reflection texture matrix
    */
  def setReflectionTextureMatrix(value: Matrix): Unit = js.native
  
  /**
    * Update the url (and optional buffer) of this texture if url was null during construction.
    * @param url the url of the texture
    * @param forcedExtension defines the extension to use
    * @param onLoad callback called when the texture is loaded  (defaults to null)
    * @param prefiltered Defines whether the updated texture is prefiltered or not
    * @param onError callback called if there was an error during the loading process (defaults to null)
    * @param extensions defines the suffixes add to the picture name in case six images are in use like _px.jpg...
    * @param delayLoad defines if the texture should be loaded now (false by default)
    * @param files defines the six files to load for the different faces in that order: px, py, pz, nx, ny, nz
    */
  def updateURL(
    url: String,
    forcedExtension: js.UndefOr[String],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    prefiltered: js.UndefOr[Boolean],
    onError: js.UndefOr[
      Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
    ],
    extensions: js.UndefOr[Nullable[js.Array[String]]],
    delayLoad: js.UndefOr[Boolean],
    files: js.UndefOr[Nullable[js.Array[String]]]
  ): Unit = js.native
  
  /**
    * The url of the texture
    */
  var url: String = js.native
}
