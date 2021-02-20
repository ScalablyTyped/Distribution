package typings.babylonjs

import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.animationMod.Animation
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.thinTextureMod.ThinTexture
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/baseTexture", "BaseTexture")
  @js.native
  class BaseTexture protected ()
    extends ThinTexture
       with IAnimatable {
    /**
      * Instantiates a new BaseTexture.
      * Base class of all the textures in babylon.
      * It groups all the common properties the materials, post process, lights... might need
      * in order to make a correct use of the texture.
      * @param sceneOrEngine Define the scene or engine the texture blongs to
      */
    def this(sceneOrEngine: Nullable[Scene | ThinEngine]) = this()
    
    var _coordinatesMode: Double = js.native
    
    var _gammaSpace: js.Any = js.native
    
    /** @hidden */
    /* protected */ def _getEngine(): Nullable[ThinEngine] = js.native
    
    /** @hidden */
    def _getFromCache(url: Nullable[String], noMipmap: Boolean): Nullable[InternalTexture] = js.native
    def _getFromCache(url: Nullable[String], noMipmap: Boolean, sampling: js.UndefOr[scala.Nothing], invertY: Boolean): Nullable[InternalTexture] = js.native
    def _getFromCache(url: Nullable[String], noMipmap: Boolean, sampling: Double): Nullable[InternalTexture] = js.native
    def _getFromCache(url: Nullable[String], noMipmap: Boolean, sampling: Double, invertY: Boolean): Nullable[InternalTexture] = js.native
    
    var _hasAlpha: js.Any = js.native
    
    var _isCube: js.Any = js.native
    
    /** @hidden */
    def _lodTextureHigh: Nullable[BaseTexture] = js.native
    
    /** @hidden */
    def _lodTextureLow: Nullable[BaseTexture] = js.native
    
    /** @hidden */
    def _lodTextureMid: Nullable[BaseTexture] = js.native
    
    /**
      * Indicates that textures need to be re-calculated for all materials
      */
    /* protected */ def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    var _onDisposeObserver: js.Any = js.native
    
    /** @hidden */
    var _prefiltered: Boolean = js.native
    
    /** @hidden */
    def _rebuild(): Unit = js.native
    
    var _scene: Nullable[Scene] = js.native
    
    var _uid: js.Any = js.native
    
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
    
    /**
      * Define the UV chanel to use starting from 0 and defaulting to 0.
      * This is part of the texture as textures usually maps to one uv set.
      */
    var coordinatesIndex: Double = js.native
    
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
      * Define if the texture contains data in gamma space (most of the png/jpg aside bump).
      * HDR texture are usually stored in linear space.
      * This only impacts the PBR and Background materials
      */
    def gammaSpace: Boolean = js.native
    def gammaSpace_=(gamma: Boolean): Unit = js.native
    
    /**
      * Defines if the alpha value should be determined via the rgb values.
      * If true the luminance of the pixel might be used to find the corresponding alpha value.
      */
    var getAlphaFromRGB: Boolean = js.native
    
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
      * Get the texture transform matrix used to offset tile the texture for istance.
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
      * Define if the texture is preventinga material to render or not.
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
      * @returns true if ready or not blocking
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
      * Reads the pixels stored in the webgl texture and returns them as an ArrayBuffer.
      * This will returns an RGBA array buffer containing either in values (0-255) or
      * float values (0-1) depending of the underlying buffer type.
      * @param faceIndex defines the face of the texture to read (in case of cube texture)
      * @param level defines the LOD level of the texture to read (in case of Mip Maps)
      * @param buffer defines a user defined buffer to fill with data (can be null)
      * @returns The Array buffer containing the pixels data.
      */
    def readPixels(): Nullable[ArrayBufferView] = js.native
    def readPixels(
      faceIndex: js.UndefOr[scala.Nothing],
      level: js.UndefOr[scala.Nothing],
      buffer: Nullable[ArrayBufferView]
    ): Nullable[ArrayBufferView] = js.native
    def readPixels(faceIndex: js.UndefOr[scala.Nothing], level: Double): Nullable[ArrayBufferView] = js.native
    def readPixels(faceIndex: js.UndefOr[scala.Nothing], level: Double, buffer: Nullable[ArrayBufferView]): Nullable[ArrayBufferView] = js.native
    def readPixels(faceIndex: Double): Nullable[ArrayBufferView] = js.native
    def readPixels(faceIndex: Double, level: js.UndefOr[scala.Nothing], buffer: Nullable[ArrayBufferView]): Nullable[ArrayBufferView] = js.native
    def readPixels(faceIndex: Double, level: Double): Nullable[ArrayBufferView] = js.native
    def readPixels(faceIndex: Double, level: Double, buffer: Nullable[ArrayBufferView]): Nullable[ArrayBufferView] = js.native
    
    /**
      * For internal use only. Please do not use.
      */
    var reservedDataStore: js.Any = js.native
    
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
    @scala.inline
    def DEFAULT_ANISOTROPIC_FILTERING_LEVEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ANISOTROPIC_FILTERING_LEVEL")(x.asInstanceOf[js.Any])
    
    /**
      * Helper function to be called back once a list of texture contains only ready textures.
      * @param textures Define the list of textures to wait for
      * @param callback Define the callback triggered once the entire list will be ready
      */
    @JSImport("babylonjs/Materials/Textures/baseTexture", "BaseTexture.WhenAllReady")
    @js.native
    def WhenAllReady(textures: js.Array[BaseTexture], callback: js.Function0[Unit]): Unit = js.native
    
    @JSImport("babylonjs/Materials/Textures/baseTexture", "BaseTexture._isScene")
    @js.native
    def _isScene: js.Any = js.native
    @scala.inline
    def _isScene_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isScene")(x.asInstanceOf[js.Any])
  }
}
