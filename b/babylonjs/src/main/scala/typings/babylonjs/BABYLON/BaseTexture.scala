package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BaseTexture")
@js.native
class BaseTexture protected () extends IAnimatable {
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
  var _onDisposeObserver: js.Any = js.native
  var _scene: js.Any = js.native
  /** @hidden */
  var _texture: Nullable[InternalTexture] = js.native
  var _uid: js.Any = js.native
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[Animation]] = js.native
  /**
    * Define the list of animation attached to the texture.
    */
  @JSName("animations")
  var animations_BaseTexture: js.Array[Animation] = js.native
  /**
    * With compliant hardware and browser (supporting anisotropic filtering)
    * this defines the level of anisotropic filtering in the texture.
    * The higher the better but the slower. This defaults to 4 as it seems to be the best tradeoff.
    */
  var anisotropicFilteringLevel: Double = js.native
  /**
    * Define the UV chanel to use starting from 0 and defaulting to 0.
    * This is part of the texture as textures usually maps to one uv set.
    */
  var coordinatesIndex: Double = js.native
  /**
    * Define the current state of the loading sequence when in delayed load mode.
    */
  var delayLoadState: Double = js.native
  /**
    * Define if the texture contains data in gamma space (most of the png/jpg aside bump).
    * HDR texture are usually stored in linear space.
    * This only impacts the PBR and Background materials
    */
  var gammaSpace: Boolean = js.native
  /**
    * Defines if the alpha value should be determined via the rgb values.
    * If true the luminance of the pixel might be used to find the corresponding alpha value.
    */
  var getAlphaFromRGB: Boolean = js.native
  /**
    * Is Z inverted in the texture (useful in a cube texture).
    */
  var invertZ: Boolean = js.native
  /**
    * Define if the texture is a render target.
    */
  var isRenderTarget: Boolean = js.native
  /**
    * Intensity or strength of the texture.
    * It is commonly used by materials to fine tune the intensity of the texture
    */
  var level: Double = js.native
  /**
    * @hidden
    */
  var lodLevelInAlpha: Boolean = js.native
  /**
    * Gets or sets an object used to store user defined information.
    */
  var metadata: js.Any = js.native
  /**
    * Define the name of the texture.
    */
  var name: String = js.native
  /**
    * An event triggered when the texture is disposed.
    */
  var onDisposeObservable: Observable[BaseTexture] = js.native
  /**
    * For internal use only. Please do not use.
    */
  var reservedDataStore: js.Any = js.native
  /**
    * Get the polynomial representation of the texture data.
    * This is mainly use as a fast way to recover IBL Diffuse irradiance data.
    * @see https://learnopengl.com/PBR/IBL/Diffuse-irradiance
    */
  var sphericalPolynomial: Nullable[SphericalPolynomial] = js.native
  /**
    * Gets or sets the unique id of the texture
    */
  var uniqueId: Double = js.native
  /**
    * | Value | Type               | Description |
    * | ----- | ------------------ | ----------- |
    * | 0     | CLAMP_ADDRESSMODE  |             |
    * | 1     | WRAP_ADDRESSMODE   |             |
    * | 2     | MIRROR_ADDRESSMODE |             |
    */
  var wrapR: Double = js.native
  /**
    * | Value | Type               | Description |
    * | ----- | ------------------ | ----------- |
    * | 0     | CLAMP_ADDRESSMODE  |             |
    * | 1     | WRAP_ADDRESSMODE   |             |
    * | 2     | MIRROR_ADDRESSMODE |             |
    */
  var wrapU: Double = js.native
  /**
    * | Value | Type               | Description |
    * | ----- | ------------------ | ----------- |
    * | 0     | CLAMP_ADDRESSMODE  |             |
    * | 1     | WRAP_ADDRESSMODE   |             |
    * | 2     | MIRROR_ADDRESSMODE |             |
    */
  var wrapV: Double = js.native
  /** @hidden */
  def _getFromCache(url: Nullable[String], noMipmap: Boolean): Nullable[InternalTexture] = js.native
  def _getFromCache(url: Nullable[String], noMipmap: Boolean, sampling: Double): Nullable[InternalTexture] = js.native
  def _getFromCache(url: Nullable[String], noMipmap: Boolean, sampling: Double, invertY: Boolean): Nullable[InternalTexture] = js.native
  /** @hidden */
  def _lodTextureHigh(): Nullable[BaseTexture] = js.native
  /** @hidden */
  def _lodTextureLow(): Nullable[BaseTexture] = js.native
  /** @hidden */
  def _lodTextureMid(): Nullable[BaseTexture] = js.native
  /**
    * Indicates that textures need to be re-calculated for all materials
    */
  /* protected */ def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  /** @hidden */
  def _rebuild(): Unit = js.native
  /**
    * Get if the texture can rescale.
    */
  def canRescale(): Boolean = js.native
  def coordinatesMode(): Double = js.native
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
  def coordinatesMode(value: Double): js.Any = js.native
  /**
    * Triggers the load sequence in delayed load mode.
    */
  def delayLoad(): Unit = js.native
  /**
    * Dispose the texture and release its associated resources.
    */
  def dispose(): Unit = js.native
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
  def getClassName(): String = js.native
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
  def hasAlpha(): Boolean = js.native
  /**
    * Define if the texture is having a usable alpha value (can be use for transparency or glossiness for instance).
    */
  def hasAlpha(value: Boolean): js.Any = js.native
  /**
    * In case a better definition than spherical harmonics is required for the diffuse part of the environment.
    * You can set the irradiance texture to rely on a texture instead of the spherical approach.
    * This texture need to have the same characteristics than its parent (Cube vs 2d, coordinates mode, Gamma/Linear, RGBD).
    */
  def irradianceTexture(): Nullable[BaseTexture] = js.native
  def irradianceTexture(value: Nullable[BaseTexture]): js.Any = js.native
  /**
    * Define if the texture is a 2d array texture (webgl 2) or if false a 2d texture.
    */
  def is2DArray(): Boolean = js.native
  def is2DArray(value: Boolean): js.Any = js.native
  /**
    * Define if the texture is a 3d texture (webgl 2) or if false a 2d texture.
    */
  def is3D(): Boolean = js.native
  def is3D(value: Boolean): js.Any = js.native
  /**
    * Define if the texture is preventinga material to render or not.
    * If not and the texture is not ready, the engine will use a default black texture instead.
    */
  def isBlocking(): Boolean = js.native
  /**
    * Define if the texture is a cube texture or if false a 2d texture.
    */
  def isCube(): Boolean = js.native
  def isCube(value: Boolean): js.Any = js.native
  /**
    * Gets or sets whether or not the texture contains RGBD data.
    */
  def isRGBD(): Boolean = js.native
  def isRGBD(value: Boolean): js.Any = js.native
  /**
    * Get if the texture is ready to be used (downloaded, converted, mip mapped...).
    * @returns true if fully ready
    */
  def isReady(): Boolean = js.native
  /**
    * Get if the texture is ready to be consumed (either it is ready or it is not blocking)
    * @returns true if ready or not blocking
    */
  def isReadyOrNotBlocking(): Boolean = js.native
  /**
    * With prefiltered texture, defined if the specular generation is based on a linear ramp.
    * By default we are using a log2 of the linear roughness helping to keep a better resolution for
    * average roughness values.
    */
  def linearSpecularLOD(): Boolean = js.native
  def linearSpecularLOD(value: Boolean): js.Any = js.native
  /**
    * With prefiltered texture, defined the offset used during the prefiltering steps.
    */
  def lodGenerationOffset(): Double = js.native
  def lodGenerationOffset(value: Double): js.Any = js.native
  /**
    * With prefiltered texture, defined the scale used during the prefiltering steps.
    */
  def lodGenerationScale(): Double = js.native
  def lodGenerationScale(value: Double): js.Any = js.native
  /**
    * Are mip maps generated for this texture or not.
    */
  def noMipmap(): Boolean = js.native
  /**
    * Callback triggered when the texture has been disposed.
    * Kept for back compatibility, you can use the onDisposeObservable instead.
    */
  def onDispose(callback: js.Function0[Unit]): js.Any = js.native
  /**
    * Reads the pixels stored in the webgl texture and returns them as an ArrayBuffer.
    * This will returns an RGBA array buffer containing either in values (0-255) or
    * float values (0-1) depending of the underlying buffer type.
    * @param faceIndex defines the face of the texture to read (in case of cube texture)
    * @param level defines the LOD level of the texture to read (in case of Mip Maps)
    * @param buffer defines a user defined buffer to fill with data (can be null)
    * @returns The Array buffer containing the pixels data.
    */
  def readPixels(): Nullable[ArrayBufferView] = js.native
  def readPixels(faceIndex: Double): Nullable[ArrayBufferView] = js.native
  def readPixels(faceIndex: Double, level: Double): Nullable[ArrayBufferView] = js.native
  def readPixels(faceIndex: Double, level: Double, buffer: Nullable[ArrayBufferView]): Nullable[ArrayBufferView] = js.native
  /**
    * Release and destroy the underlying lower level texture aka internalTexture.
    */
  def releaseInternalTexture(): Unit = js.native
  /**
    * Scales the texture if is `canRescale()`
    * @param ratio the resize factor we want to use to rescale
    */
  def scale(ratio: Double): Unit = js.native
  /**
    * Serialize the texture into a JSON representation that can be parsed later on.
    * @returns the JSON representation of the texture
    */
  def serialize(): js.Any = js.native
  /**
    * Get the texture underlying format (RGB, RGBA...)
    */
  def textureFormat(): Double = js.native
  /**
    * Get the texture underlying type (INT, FLOAT...)
    */
  def textureType(): Double = js.native
  /**
    * Define the unique id of the texture in the scene.
    */
  def uid(): String = js.native
  /**
    * Update the sampling mode of the texture.
    * Default is Trilinear mode.
    *
    * | Value | Type               | Description |
    * | ----- | ------------------ | ----------- |
    * | 1     | NEAREST_SAMPLINGMODE or NEAREST_NEAREST_MIPLINEAR  | Nearest is: mag = nearest, min = nearest, mip = linear |
    * | 2     | BILINEAR_SAMPLINGMODE or LINEAR_LINEAR_MIPNEAREST | Bilinear is: mag = linear, min = linear, mip = nearest |
    * | 3     | TRILINEAR_SAMPLINGMODE or LINEAR_LINEAR_MIPLINEAR | Trilinear is: mag = linear, min = linear, mip = linear |
    * | 4     | NEAREST_NEAREST_MIPNEAREST |             |
    * | 5    | NEAREST_LINEAR_MIPNEAREST |             |
    * | 6    | NEAREST_LINEAR_MIPLINEAR |             |
    * | 7    | NEAREST_LINEAR |             |
    * | 8    | NEAREST_NEAREST |             |
    * | 9   | LINEAR_NEAREST_MIPNEAREST |             |
    * | 10   | LINEAR_NEAREST_MIPLINEAR |             |
    * | 11   | LINEAR_LINEAR |             |
    * | 12   | LINEAR_NEAREST |             |
    *
    *    > _mag_: magnification filter (close to the viewer)
    *    > _min_: minification filter (far from the viewer)
    *    > _mip_: filter used between mip map levels
    *@param samplingMode Define the new sampling mode of the texture
    */
  def updateSamplingMode(samplingMode: Double): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.BaseTexture")
@js.native
object BaseTexture extends js.Object {
  /**
    * Default anisotropic filtering level for the application.
    * It is set to 4 as a good tradeoff between perf and quality.
    */
  var DEFAULT_ANISOTROPIC_FILTERING_LEVEL: Double = js.native
  /**
    * Helper function to be called back once a list of texture contains only ready textures.
    * @param textures Define the list of textures to wait for
    * @param callback Define the callback triggered once the entire list will be ready
    */
  def WhenAllReady(textures: js.Array[BaseTexture], callback: js.Function0[Unit]): Unit = js.native
}

