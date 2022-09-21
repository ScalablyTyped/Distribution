package typings.babylonjs

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.mathSizeMod.ISize
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thinTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/thinTexture", "ThinTexture")
  @js.native
  open class ThinTexture protected () extends StObject {
    /**
      * Instantiates a new ThinTexture.
      * Base class of all the textures in babylon.
      * This can be used as an internal texture wrapper in ThinEngine to benefit from the cache
      * @param internalTexture Define the internalTexture to wrap
      */
    def this(internalTexture: Nullable[InternalTexture]) = this()
    
    /* private */ var _cachedBaseSize: Any = js.native
    
    /* private */ var _cachedSize: Any = js.native
    
    /* protected */ var _engine: Nullable[ThinEngine] = js.native
    
    /** @hidden */
    /* protected */ var _initialSamplingMode: Double = js.native
    
    /** @hidden */
    var _texture: Nullable[InternalTexture] = js.native
    
    /* protected */ var _wrapU: Double = js.native
    
    /* protected */ var _wrapV: Double = js.native
    
    /**
      * With compliant hardware and browser (supporting anisotropic filtering)
      * this defines the level of anisotropic filtering in the texture.
      * The higher the better but the slower. This defaults to 4 as it seems to be the best tradeoff.
      */
    var anisotropicFilteringLevel: Double = js.native
    
    /**
      * How a texture is mapped.
      * Unused in thin texture mode.
      */
    def coordinatesMode: Double = js.native
    
    /**
      * Triggers the load sequence in delayed load mode.
      */
    def delayLoad(): Unit = js.native
    
    /**
      * Define the current state of the loading sequence when in delayed load mode.
      */
    var delayLoadState: Double = js.native
    
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
      * @returns "ThinTexture"
      */
    def getClassName(): String = js.native
    
    /**
      * Get the underlying lower level texture from Babylon.
      * @returns the internal texture
      */
    def getInternalTexture(): Nullable[InternalTexture] = js.native
    
    /**
      * Get the size of the texture.
      * @returns the texture size.
      */
    def getSize(): ISize = js.native
    
    /**
      * Define if the texture is a 2d array texture (webgl 2) or if false a 2d texture.
      */
    def is2DArray: Boolean = js.native
    def is2DArray_=(value: Boolean): Unit = js.native
    
    /**
      * Define if the texture is a 3d texture (webgl 2) or if false a 2d texture.
      */
    def is3D: Boolean = js.native
    def is3D_=(value: Boolean): Unit = js.native
    
    /**
      * Define if the texture is a cube texture or if false a 2d texture.
      */
    def isCube: Boolean = js.native
    def isCube_=(value: Boolean): Unit = js.native
    
    /**
      * Get if the texture is ready to be used (downloaded, converted, mip mapped...).
      * @returns true if fully ready
      */
    def isReady(): Boolean = js.native
    
    /**
      * Release and destroy the underlying lower level texture aka internalTexture.
      */
    def releaseInternalTexture(): Unit = js.native
    
    /**
      * Get the current sampling mode associated with the texture.
      */
    def samplingMode: Double = js.native
    
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
    def wrapU: Double = js.native
    def wrapU_=(value: Double): Unit = js.native
    
    /**
      * | Value | Type               | Description |
      * | ----- | ------------------ | ----------- |
      * | 0     | CLAMP_ADDRESSMODE  |             |
      * | 1     | WRAP_ADDRESSMODE   |             |
      * | 2     | MIRROR_ADDRESSMODE |             |
      */
    def wrapV: Double = js.native
    def wrapV_=(value: Double): Unit = js.native
  }
}
