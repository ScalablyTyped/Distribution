package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class of all the textures in babylon.
  * It groups all the common properties the materials, post process, lights... might need
  * in order to make a correct use of the texture.
  */
@JSGlobal("BABYLON.BaseTexture")
@js.native
class BaseTexture protected () extends js.Object {
  /**
    * Instantiates a new BaseTexture.
    * Base class of all the textures in babylon.
    * It groups all the common properties the materials, post process, lights... might need
    * in order to make a correct use of the texture.
    * @param scene Define the scene the texture blongs to
    */
  def this(scene: Nullable[Scene]) = this()
  var _cachedSize: js.Any = js.native
  var _coordinatesMode: js.Any = js.native
  var _hasAlpha: js.Any = js.native
  /** @hidden */
  val _lodTextureHigh: Nullable[BaseTexture] = js.native
  /** @hidden */
  val _lodTextureLow: Nullable[BaseTexture] = js.native
  /** @hidden */
  val _lodTextureMid: Nullable[BaseTexture] = js.native
  var _onDisposeObserver: js.Any = js.native
  var _scene: js.Any = js.native
  /** @hidden */
  var _texture: Nullable[InternalTexture] = js.native
  var _uid: js.Any = js.native
  /**
    * Define the list of animation attached to the texture.
    */
  var animations: js.Array[Animation] = js.native
  /**
    * With compliant hardware and browser (supporting anisotropic filtering)
    * this defines the level of anisotropic filtering in the texture.
    * The higher the better but the slower. This defaults to 4 as it seems to be the best tradeoff.
    */
  var anisotropicFilteringLevel: scala.Double = js.native
  /**
    * Get if the texture can rescale.
    */
  val canRescale: scala.Boolean = js.native
  /**
    * Define the UV chanel to use starting from 0 and defaulting to 0.
    * This is part of the texture as textures usually maps to one uv set.
    */
  var coordinatesIndex: scala.Double = js.native
  /**
    * How a texture is mapped.
    *
    * | Value | Type                                | Description |
    * | ----- | ----------------------------------- | ----------- |
    * | 0     | EXPLICIT_MODE                       |             |
    * | 1     | SPHERICAL_MODE                      |             |
    * | 2     | PLANAR_MODE                         |             |
    * | 3     | CUBIC_MODE                          |             |
    * | 4     | PROJECTION_MODE                     |             |
    * | 5     | SKYBOX_MODE                         |             |
    * | 6     | INVCUBIC_MODE                       |             |
    * | 7     | EQUIRECTANGULAR_MODE                |             |
    * | 8     | FIXED_EQUIRECTANGULAR_MODE          |             |
    * | 9     | FIXED_EQUIRECTANGULAR_MIRRORED_MODE |             |
    */
  var coordinatesMode: scala.Double = js.native
  /**
    * Define the current state of the loading sequence when in delayed load mode.
    */
  var delayLoadState: scala.Double = js.native
  /**
    * Define if the texture contains data in gamma space (most of the png/jpg aside bump).
    * HDR texture are usually stored in linear space.
    * This only impacts the PBR and Background materials
    */
  var gammaSpace: scala.Boolean = js.native
  /**
    * Defines if the alpha value should be determined via the rgb values.
    * If true the luminance of the pixel might be used to find the corresponding alpha value.
    */
  var getAlphaFromRGB: scala.Boolean = js.native
  /**
    * Define if the texture is having a usable alpha value (can be use for transparency or glossiness for instance).
    */
  var hasAlpha: scala.Boolean = js.native
  /**
    * Is Z inverted in the texture (useful in a cube texture).
    */
  var invertZ: scala.Boolean = js.native
  /**
    * Define if the texture is a 3d texture (webgl 2) or if false a 2d texture.
    */
  var is3D: scala.Boolean = js.native
  /**
    * Define if the texture is preventinga material to render or not.
    * If not and the texture is not ready, the engine will use a default black texture instead.
    */
  val isBlocking: scala.Boolean = js.native
  /**
    * Define if the texture is a cube texture or if false a 2d texture.
    */
  var isCube: scala.Boolean = js.native
  /**
    * Gets whether or not the texture contains RGBD data.
    */
  val isRGBD: scala.Boolean = js.native
  /**
    * Define if the texture is a render target.
    */
  var isRenderTarget: scala.Boolean = js.native
  /**
    * Intensity or strength of the texture.
    * It is commonly used by materials to fine tune the intensity of the texture
    */
  var level: scala.Double = js.native
  /**
    * With prefiltered texture, defined the offset used during the prefiltering steps.
    */
  var lodGenerationOffset: scala.Double = js.native
  /**
    * With prefiltered texture, defined the scale used during the prefiltering steps.
    */
  var lodGenerationScale: scala.Double = js.native
  /**
    * @hidden
    */
  var lodLevelInAlpha: scala.Boolean = js.native
  /**
    * Define the name of the texture.
    */
  var name: java.lang.String = js.native
  /**
    * An event triggered when the texture is disposed.
    */
  var onDisposeObservable: Observable[BaseTexture] = js.native
  /**
    * Get the polynomial representation of the texture data.
    * This is mainly use as a fast way to recover IBL Diffuse irradiance data.
    * @see https://learnopengl.com/PBR/IBL/Diffuse-irradiance
    */
  var sphericalPolynomial: Nullable[SphericalPolynomial] = js.native
  /**
    * Get the texture underlying format (RGB, RGBA...)
    */
  val textureFormat: scala.Double = js.native
  /**
    * Get the texture underlying type (INT, FLOAT...)
    */
  val textureType: scala.Double = js.native
  /**
    * Define the unique id of the texture in the scene.
    */
  val uid: java.lang.String = js.native
  /**
    * | Value | Type               | Description |
    * | ----- | ------------------ | ----------- |
    * | 0     | CLAMP_ADDRESSMODE  |             |
    * | 1     | WRAP_ADDRESSMODE   |             |
    * | 2     | MIRROR_ADDRESSMODE |             |
    */
  var wrapR: scala.Double = js.native
  /**
    * | Value | Type               | Description |
    * | ----- | ------------------ | ----------- |
    * | 0     | CLAMP_ADDRESSMODE  |             |
    * | 1     | WRAP_ADDRESSMODE   |             |
    * | 2     | MIRROR_ADDRESSMODE |             |
    */
  var wrapU: scala.Double = js.native
  /**
    * | Value | Type               | Description |
    * | ----- | ------------------ | ----------- |
    * | 0     | CLAMP_ADDRESSMODE  |             |
    * | 1     | WRAP_ADDRESSMODE   |             |
    * | 2     | MIRROR_ADDRESSMODE |             |
    */
  var wrapV: scala.Double = js.native
  /** @hidden */
  def _getFromCache(url: Nullable[java.lang.String], noMipmap: scala.Boolean): Nullable[InternalTexture] = js.native
  def _getFromCache(url: Nullable[java.lang.String], noMipmap: scala.Boolean, sampling: scala.Double): Nullable[InternalTexture] = js.native
  /** @hidden */
  def _rebuild(): scala.Unit = js.native
  /**
    * Triggers the load sequence in delayed load mode.
    */
  def delayLoad(): scala.Unit = js.native
  /**
    * Dispose the texture and release its associated resources.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Get the base size of the texture.
    * It can be different from the size if the texture has been resized for POT for instance
    * @returns the base size
    */
  def getBaseSize(): ISize = js.native
  /**
    * Get the class name of the texture.
    * @returns "BaseTexture"
    */
  def getClassName(): java.lang.String = js.native
  /**
    * Get the underlying lower level texture from Babylon.
    * @returns the insternal texture
    */
  def getInternalTexture(): Nullable[InternalTexture] = js.native
  /**
    * Get the texture reflection matrix used to rotate/transform the reflection.
    * @returns the reflection matrix
    */
  def getReflectionTextureMatrix(): Matrix = js.native
  /**
    * Get the scene the texture belongs to.
    * @returns the scene or null if undefined
    */
  def getScene(): Nullable[Scene] = js.native
  /**
    * Get the size of the texture.
    * @returns the texture size.
    */
  def getSize(): ISize = js.native
  /**
    * Get the texture transform matrix used to offset tile the texture for istance.
    * @returns the transformation matrix
    */
  def getTextureMatrix(): Matrix = js.native
  /**
    * Get if the texture is ready to be used (downloaded, converted, mip mapped...).
    * @returns true if fully ready
    */
  def isReady(): scala.Boolean = js.native
  /**
    * Get if the texture is ready to be consumed (either it is ready or it is not blocking)
    * @returns true if ready or not blocking
    */
  def isReadyOrNotBlocking(): scala.Boolean = js.native
  /**
    * Callback triggered when the texture has been disposed.
    * Kept for back compatibility, you can use the onDisposeObservable instead.
    */
  def onDispose(): scala.Unit = js.native
  /**
    * Reads the pixels stored in the webgl texture and returns them as an ArrayBuffer.
    * This will returns an RGBA array buffer containing either in values (0-255) or
    * float values (0-1) depending of the underlying buffer type.
    * @param faceIndex defines the face of the texture to read (in case of cube texture)
    * @param level defines the LOD level of the texture to read (in case of Mip Maps)
    * @param buffer defines a user defined buffer to fill with data (can be null)
    * @returns The Array buffer containing the pixels data.
    */
  def readPixels(): Nullable[stdLib.ArrayBufferView] = js.native
  def readPixels(faceIndex: scala.Double): Nullable[stdLib.ArrayBufferView] = js.native
  def readPixels(faceIndex: scala.Double, level: scala.Double): Nullable[stdLib.ArrayBufferView] = js.native
  def readPixels(faceIndex: scala.Double, level: scala.Double, buffer: Nullable[stdLib.ArrayBufferView]): Nullable[stdLib.ArrayBufferView] = js.native
  /**
    * Release and destroy the underlying lower level texture aka internalTexture.
    */
  def releaseInternalTexture(): scala.Unit = js.native
  /**
    * Scales the texture if is `canRescale()`
    * @param ratio the resize factor we want to use to rescale
    */
  def scale(ratio: scala.Double): scala.Unit = js.native
  /**
    * Serialize the texture into a JSON representation that can be parsed later on.
    * @returns the JSON representation of the texture
    */
  def serialize(): js.Any = js.native
}

/**
  * Base class of all the textures in babylon.
  * It groups all the common properties the materials, post process, lights... might need
  * in order to make a correct use of the texture.
  */
@JSGlobal("BABYLON.BaseTexture")
@js.native
object BaseTexture extends js.Object {
  /**
    * Default anisotropic filtering level for the application.
    * It is set to 4 as a good tradeoff between perf and quality.
    */
  var DEFAULT_ANISOTROPIC_FILTERING_LEVEL: scala.Double = js.native
  /**
    * Helper function to be called back once a list of texture contains only ready textures.
    * @param textures Define the list of textures to wait for
    * @param callback Define the callback triggered once the entire list will be ready
    */
  def WhenAllReady(textures: js.Array[babylonjsLib.BABYLONNs.BaseTexture], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

