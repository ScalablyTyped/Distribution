package typings.babylonjs

import typings.babylonjs.abstractSceneMod.AbstractScene
import typings.babylonjs.animationsAnimatableDotinterfaceMod.IAnimatable
import typings.babylonjs.animationsAnimationMod.Animation
import typings.babylonjs.anon.Exception
import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typings.babylonjs.materialsTexturesThinTextureMod.ThinTexture
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsSphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesBaseTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/baseTexture", "BaseTexture")
  @js.native
  /**
    * Instantiates a new BaseTexture.
    * Base class of all the textures in babylon.
    * It groups all the common properties the materials, post process, lights... might need
    * in order to make a correct use of the texture.
    * @param sceneOrEngine Define the scene or engine the texture belongs to
    * @param internalTexture Define the internal texture associated with the texture
    */
  open class BaseTexture ()
    extends ThinTexture
       with IAnimatable {
    def this(sceneOrEngine: Nullable[Scene | ThinEngine]) = this()
    def this(sceneOrEngine: Unit, internalTexture: Nullable[InternalTexture]) = this()
    def this(sceneOrEngine: Nullable[Scene | ThinEngine], internalTexture: Nullable[InternalTexture]) = this()
    
    /* protected */ var _coordinatesIndex: Double = js.native
    
    /* protected */ var _coordinatesMode: Double = js.native
    
    /* protected */ var _errorObject: js.UndefOr[Exception] = js.native
    
    /** @internal */
    var _forceSerialize: Boolean = js.native
    
    /* private */ var _gammaSpace: Any = js.native
    
    /* private */ var _getAlphaFromRGB: Any = js.native
    
    /** @internal */
    /* protected */ def _getEngine(): Nullable[ThinEngine] = js.native
    
    /**
      * @internal
      */
    def _getFromCache(url: Nullable[String], noMipmap: Boolean): Nullable[InternalTexture] = js.native
    def _getFromCache(url: Nullable[String], noMipmap: Boolean, sampling: Double): Nullable[InternalTexture] = js.native
    def _getFromCache(url: Nullable[String], noMipmap: Boolean, sampling: Double, invertY: Boolean): Nullable[InternalTexture] = js.native
    def _getFromCache(
      url: Nullable[String],
      noMipmap: Boolean,
      sampling: Double,
      invertY: Boolean,
      useSRGBBuffer: Boolean
    ): Nullable[InternalTexture] = js.native
    def _getFromCache(
      url: Nullable[String],
      noMipmap: Boolean,
      sampling: Double,
      invertY: Boolean,
      useSRGBBuffer: Boolean,
      isCube: Boolean
    ): Nullable[InternalTexture] = js.native
    def _getFromCache(
      url: Nullable[String],
      noMipmap: Boolean,
      sampling: Double,
      invertY: Boolean,
      useSRGBBuffer: Unit,
      isCube: Boolean
    ): Nullable[InternalTexture] = js.native
    def _getFromCache(url: Nullable[String], noMipmap: Boolean, sampling: Double, invertY: Unit, useSRGBBuffer: Boolean): Nullable[InternalTexture] = js.native
    def _getFromCache(
      url: Nullable[String],
      noMipmap: Boolean,
      sampling: Double,
      invertY: Unit,
      useSRGBBuffer: Boolean,
      isCube: Boolean
    ): Nullable[InternalTexture] = js.native
    def _getFromCache(
      url: Nullable[String],
      noMipmap: Boolean,
      sampling: Double,
      invertY: Unit,
      useSRGBBuffer: Unit,
      isCube: Boolean
    ): Nullable[InternalTexture] = js.native
    def _getFromCache(url: Nullable[String], noMipmap: Boolean, sampling: Unit, invertY: Boolean): Nullable[InternalTexture] = js.native
    def _getFromCache(url: Nullable[String], noMipmap: Boolean, sampling: Unit, invertY: Boolean, useSRGBBuffer: Boolean): Nullable[InternalTexture] = js.native
    def _getFromCache(
      url: Nullable[String],
      noMipmap: Boolean,
      sampling: Unit,
      invertY: Boolean,
      useSRGBBuffer: Boolean,
      isCube: Boolean
    ): Nullable[InternalTexture] = js.native
    def _getFromCache(
      url: Nullable[String],
      noMipmap: Boolean,
      sampling: Unit,
      invertY: Boolean,
      useSRGBBuffer: Unit,
      isCube: Boolean
    ): Nullable[InternalTexture] = js.native
    def _getFromCache(url: Nullable[String], noMipmap: Boolean, sampling: Unit, invertY: Unit, useSRGBBuffer: Boolean): Nullable[InternalTexture] = js.native
    def _getFromCache(
      url: Nullable[String],
      noMipmap: Boolean,
      sampling: Unit,
      invertY: Unit,
      useSRGBBuffer: Boolean,
      isCube: Boolean
    ): Nullable[InternalTexture] = js.native
    def _getFromCache(
      url: Nullable[String],
      noMipmap: Boolean,
      sampling: Unit,
      invertY: Unit,
      useSRGBBuffer: Unit,
      isCube: Boolean
    ): Nullable[InternalTexture] = js.native
    
    /* private */ var _hasAlpha: Any = js.native
    
    /** @internal */
    var _isCube: Boolean = js.native
    
    /* protected */ var _loadingError: Boolean = js.native
    
    /** @internal */
    def _lodTextureHigh: Nullable[BaseTexture] = js.native
    
    /** @internal */
    def _lodTextureLow: Nullable[BaseTexture] = js.native
    
    /** @internal */
    def _lodTextureMid: Nullable[BaseTexture] = js.native
    
    /**
      * Indicates that textures need to be re-calculated for all materials
      */
    /* protected */ def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /* private */ var _onDisposeObserver: Any = js.native
    
    /** @internal */
    var _parentContainer: Nullable[AbstractScene] = js.native
    
    /** @internal */
    var _prefiltered: Boolean = js.native
    
    /**
      * @internal
      */
    def _readPixelsSync(): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Double): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Double, level: Double): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Double, level: Double, buffer: Unit, flushRenderer: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Double, level: Double, buffer: Unit, flushRenderer: Boolean, noDataConversion: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Double, level: Double, buffer: Unit, flushRenderer: Unit, noDataConversion: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Double, level: Double, buffer: Nullable[js.typedarray.ArrayBufferView]): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Double,
      level: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Double,
      level: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Boolean,
      noDataConversion: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Double,
      level: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Unit,
      noDataConversion: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Double, level: Unit, buffer: Unit, flushRenderer: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Double, level: Unit, buffer: Unit, flushRenderer: Boolean, noDataConversion: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Double, level: Unit, buffer: Unit, flushRenderer: Unit, noDataConversion: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Double, level: Unit, buffer: Nullable[js.typedarray.ArrayBufferView]): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Double,
      level: Unit,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Double,
      level: Unit,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Boolean,
      noDataConversion: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Double,
      level: Unit,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Unit,
      noDataConversion: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Unit, level: Double): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Unit, level: Double, buffer: Unit, flushRenderer: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Unit, level: Double, buffer: Unit, flushRenderer: Boolean, noDataConversion: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Unit, level: Double, buffer: Unit, flushRenderer: Unit, noDataConversion: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Unit, level: Double, buffer: Nullable[js.typedarray.ArrayBufferView]): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Unit,
      level: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Unit,
      level: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Boolean,
      noDataConversion: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Unit,
      level: Double,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Unit,
      noDataConversion: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Unit, level: Unit, buffer: Unit, flushRenderer: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Unit, level: Unit, buffer: Unit, flushRenderer: Boolean, noDataConversion: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Unit, level: Unit, buffer: Unit, flushRenderer: Unit, noDataConversion: Boolean): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(faceIndex: Unit, level: Unit, buffer: Nullable[js.typedarray.ArrayBufferView]): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Unit,
      level: Unit,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Unit,
      level: Unit,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Boolean,
      noDataConversion: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    def _readPixelsSync(
      faceIndex: Unit,
      level: Unit,
      buffer: Nullable[js.typedarray.ArrayBufferView],
      flushRenderer: Unit,
      noDataConversion: Boolean
    ): Nullable[js.typedarray.ArrayBufferView] = js.native
    
    /** @internal */
    def _rebuild(): Unit = js.native
    
    /* protected */ var _scene: Nullable[Scene] = js.native
    
    /** @internal */
    /* private */ var _uid: Any = js.native
    
    /**
      * Array of animations
      */
    /* CompleteClass */
    var animations: Nullable[js.Array[Animation]] = js.native
    /**
      * Define the list of animation attached to the texture.
      */
    @JSName("animations")
    var animations_BaseTexture: js.Array[Animation] = js.native
    
    /**
      * Get if the texture can rescale.
      */
    def canRescale: Boolean = js.native
    
    /**
      * Checks if the texture has the same transform matrix than another texture
      * @param texture texture to check against
      * @returns true if the transforms are the same, else false
      */
    def checkTransformsAreIdentical(texture: Nullable[BaseTexture]): Boolean = js.native
    
    def coordinatesIndex: Double = js.native
    /**
      * Define the UV channel to use starting from 0 and defaulting to 0.
      * This is part of the texture as textures usually maps to one uv set.
      */
    def coordinatesIndex_=(value: Double): Unit = js.native
    
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
    def coordinatesMode_=(value: Double): Unit = js.native
    
    /**
      * If a loading error occurred this object will be populated with information about the error.
      */
    def errorObject: js.UndefOr[Exception] = js.native
    
    /**
      * Force recomputation of spherical polynomials.
      * Can be useful if you generate a cubemap multiple times (from a probe for eg) and you need the proper polynomials each time
      */
    def forceSphericalPolynomialsRecompute(): Unit = js.native
    
    /**
      * Define if the texture contains data in gamma space (most of the png/jpg aside bump).
      * HDR texture are usually stored in linear space.
      * This only impacts the PBR and Background materials
      */
    def gammaSpace: Boolean = js.native
    def gammaSpace_=(gamma: Boolean): Unit = js.native
    
    def getAlphaFromRGB: Boolean = js.native
    /**
      * Defines if the alpha value should be determined via the rgb values.
      * If true the luminance of the pixel might be used to find the corresponding alpha value.
      */
    def getAlphaFromRGB_=(value: Boolean): Unit = js.native
    
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
      * Get the texture transform matrix used to offset tile the texture for instance.
      * @returns the transformation matrix
      */
    def getTextureMatrix(): Matrix = js.native
    
    def hasAlpha: Boolean = js.native
    /**
      * Define if the texture is having a usable alpha value (can be use for transparency or glossiness for instance).
      */
    def hasAlpha_=(value: Boolean): Unit = js.native
    
    /**
      * Is Z inverted in the texture (useful in a cube texture).
      */
    var invertZ: Boolean = js.native
    
    /**
      * In case a better definition than spherical harmonics is required for the diffuse part of the environment.
      * You can set the irradiance texture to rely on a texture instead of the spherical approach.
      * This texture need to have the same characteristics than its parent (Cube vs 2d, coordinates mode, Gamma/Linear, RGBD).
      */
    def irradianceTexture: Nullable[BaseTexture] = js.native
    def irradianceTexture_=(value: Nullable[BaseTexture]): Unit = js.native
    
    /**
      * Define if the texture is preventing a material to render or not.
      * If not and the texture is not ready, the engine will use a default black texture instead.
      */
    def isBlocking: Boolean = js.native
    
    /**
      * Gets or sets whether or not the texture contains RGBD data.
      */
    def isRGBD: Boolean = js.native
    def isRGBD_=(value: Boolean): Unit = js.native
    
    /**
      * Get if the texture is ready to be consumed (either it is ready or it is not blocking)
      * @returns true if ready, not blocking or if there was an error loading the texture
      */
    def isReadyOrNotBlocking(): Boolean = js.native
    
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
      * With prefiltered texture, defined if the specular generation is based on a linear ramp.
      * By default we are using a log2 of the linear roughness helping to keep a better resolution for
      * average roughness values.
      */
    def linearSpecularLOD: Boolean = js.native
    def linearSpecularLOD_=(value: Boolean): Unit = js.native
    
    /**
      * Was there any loading error?
      */
    def loadingError: Boolean = js.native
    
    /**
      * With prefiltered texture, defined the offset used during the prefiltering steps.
      */
    def lodGenerationOffset: Double = js.native
    def lodGenerationOffset_=(value: Double): Unit = js.native
    
    /**
      * With prefiltered texture, defined the scale used during the prefiltering steps.
      */
    def lodGenerationScale: Double = js.native
    def lodGenerationScale_=(value: Double): Unit = js.native
    
    /**
      * @internal
      */
    var lodLevelInAlpha: Boolean = js.native
    
    /**
      * Gets or sets an object used to store user defined information.
      */
    var metadata: Any = js.native
    
    /**
      * Define the name of the texture.
      */
    var name: String = js.native
    
    /**
      * Are mip maps generated for this texture or not.
      */
    def noMipmap: Boolean = js.native
    
    /**
      * An event triggered when the texture is disposed.
      */
    var onDisposeObservable: Observable[BaseTexture] = js.native
    
    /**
      * Callback triggered when the texture has been disposed.
      * Kept for back compatibility, you can use the onDisposeObservable instead.
      */
    def onDispose_=(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating that the texture should try to reduce shader code if there is no UV manipulation.
      * (ie. when texture.getTextureMatrix().isIdentityAs3x2() returns true)
      */
    var optimizeUVAllocation: Boolean = js.native
    
    /**
      * Reads the pixels stored in the webgl texture and returns them as an ArrayBuffer.
      * This will returns an RGBA array buffer containing either in values (0-255) or
      * float values (0-1) depending of the underlying buffer type.
      * @param faceIndex defines the face of the texture to read (in case of cube texture)
      * @param level defines the LOD level of the texture to read (in case of Mip Maps)
      * @param buffer defines a user defined buffer to fill with data (can be null)
      * @param flushRenderer true to flush the renderer from the pending commands before reading the pixels
      * @param noDataConversion false to convert the data to Uint8Array (if texture type is UNSIGNED_BYTE) or to Float32Array (if texture type is anything but UNSIGNED_BYTE). If true, the type of the generated buffer (if buffer==null) will depend on the type of the texture
      * @param x defines the region x coordinates to start reading from (default to 0)
      * @param y defines the region y coordinates to start reading from (default to 0)
      * @param width defines the region width to read from (default to the texture size at level)
      * @param height defines the region width to read from (default to the texture size at level)
      * @returns The Array buffer promise containing the pixels data.
      */
    def readPixels(
      faceIndex: js.UndefOr[Double],
      level: js.UndefOr[Double],
      buffer: js.UndefOr[Nullable[js.typedarray.ArrayBufferView]],
      flushRenderer: js.UndefOr[Boolean],
      noDataConversion: js.UndefOr[Boolean],
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double]
    ): Nullable[js.Promise[js.typedarray.ArrayBufferView]] = js.native
    
    /**
      * For internal use only. Please do not use.
      */
    var reservedDataStore: Any = js.native
    
    /**
      * Scales the texture if is `canRescale()`
      * @param ratio the resize factor we want to use to rescale
      */
    def scale(ratio: Double): Unit = js.native
    
    /**
      * Serialize the texture into a JSON representation that can be parsed later on.
      * @returns the JSON representation of the texture
      */
    def serialize(): Any = js.native
    
    /**
      * Get the polynomial representation of the texture data.
      * This is mainly use as a fast way to recover IBL Diffuse irradiance data.
      * @see https://learnopengl.com/PBR/IBL/Diffuse-irradiance
      */
    var sphericalPolynomial: Nullable[SphericalPolynomial] = js.native
    
    /**
      * Get the texture underlying format (RGB, RGBA...)
      */
    def textureFormat: Double = js.native
    
    /**
      * Get the texture underlying type (INT, FLOAT...)
      */
    def textureType: Double = js.native
    
    /**
      * Define the unique id of the texture in the scene.
      */
    def uid: String = js.native
    
    /**
      * Gets or sets the unique id of the texture
      */
    var uniqueId: Double = js.native
  }
  /* static members */
  object BaseTexture {
    
    @JSImport("babylonjs/Materials/Textures/baseTexture", "BaseTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default anisotropic filtering level for the application.
      * It is set to 4 as a good tradeoff between perf and quality.
      */
    @JSImport("babylonjs/Materials/Textures/baseTexture", "BaseTexture.DEFAULT_ANISOTROPIC_FILTERING_LEVEL")
    @js.native
    def DEFAULT_ANISOTROPIC_FILTERING_LEVEL: Double = js.native
    inline def DEFAULT_ANISOTROPIC_FILTERING_LEVEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ANISOTROPIC_FILTERING_LEVEL")(x.asInstanceOf[js.Any])
    
    /**
      * Helper function to be called back once a list of texture contains only ready textures.
      * @param textures Define the list of textures to wait for
      * @param callback Define the callback triggered once the entire list will be ready
      */
    inline def WhenAllReady(textures: js.Array[BaseTexture], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("WhenAllReady")(textures.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("babylonjs/Materials/Textures/baseTexture", "BaseTexture._IsScene")
    @js.native
    def _IsScene: Any = js.native
    inline def _IsScene_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsScene")(x.asInstanceOf[js.Any])
  }
}
