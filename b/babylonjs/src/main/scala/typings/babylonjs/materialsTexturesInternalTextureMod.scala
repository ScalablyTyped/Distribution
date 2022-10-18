package typings.babylonjs

import typings.babylonjs.anon.IsAsync
import typings.babylonjs.anon.Partialmessagestringexcep
import typings.babylonjs.enginesIcanvasMod.ICanvas
import typings.babylonjs.enginesIcanvasMod.ICanvasRenderingContext
import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.materialsTexturesHardwareTextureWrapperMod.HardwareTextureWrapper
import typings.babylonjs.materialsTexturesTextureSamplerMod.TextureSampler
import typings.babylonjs.mathsSphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.int
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesInternalTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/internalTexture", "InternalTexture")
  @js.native
  open class InternalTexture protected () extends TextureSampler {
    /**
      * Creates a new InternalTexture
      * @param engine defines the engine to use
      * @param source defines the type of data that will be used
      * @param delayAllocation if the texture allocation should be delayed (default: false)
      */
    def this(engine: ThinEngine, source: InternalTextureSource) = this()
    def this(engine: ThinEngine, source: InternalTextureSource, delayAllocation: Boolean) = this()
    
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
    var onRebuildCallback: Nullable[js.Function1[/* internalTexture */ this.type, IsAsync]] = js.native
    
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
  /* static members */
  object InternalTexture {
    
    @JSImport("babylonjs/Materials/Textures/internalTexture", "InternalTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    @JSImport("babylonjs/Materials/Textures/internalTexture", "InternalTexture._Counter")
    @js.native
    def _Counter: Double = js.native
    inline def _Counter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait InternalTextureSource extends StObject
  @JSImport("babylonjs/Materials/Textures/internalTexture", "InternalTextureSource")
  @js.native
  object InternalTextureSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InternalTextureSource & Double] = js.native
    
    /**
      * Texture data comes from a cube data file
      */
    @js.native
    sealed trait Cube
      extends StObject
         with InternalTextureSource
    /* 7 */ val Cube: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.Cube & Double = js.native
    
    /**
      * Texture data come from a prefiltered cube data file
      */
    @js.native
    sealed trait CubePrefiltered
      extends StObject
         with InternalTextureSource
    /* 9 */ val CubePrefiltered: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.CubePrefiltered & Double = js.native
    
    /**
      * Texture data comes from a raw cube data
      */
    @js.native
    sealed trait CubeRaw
      extends StObject
         with InternalTextureSource
    /* 8 */ val CubeRaw: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.CubeRaw & Double = js.native
    
    /**
      * Texture data comes from a raw cube data encoded with RGBD
      */
    @js.native
    sealed trait CubeRawRGBD
      extends StObject
         with InternalTextureSource
    /* 13 */ val CubeRawRGBD: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.CubeRawRGBD & Double = js.native
    
    /**
      * Texture content is a depth texture
      */
    @js.native
    sealed trait Depth
      extends StObject
         with InternalTextureSource
    /* 14 */ val Depth: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.Depth & Double = js.native
    
    /**
      * Texture content is a depth/stencil texture
      */
    @js.native
    sealed trait DepthStencil
      extends StObject
         with InternalTextureSource
    /* 12 */ val DepthStencil: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.DepthStencil & Double = js.native
    
    /**
      * Texture content is dynamic (video or dynamic texture)
      */
    @js.native
    sealed trait Dynamic
      extends StObject
         with InternalTextureSource
    /* 4 */ val Dynamic: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.Dynamic & Double = js.native
    
    /**
      * Texture content is part of a multi render target process
      */
    @js.native
    sealed trait MultiRenderTarget
      extends StObject
         with InternalTextureSource
    /* 6 */ val MultiRenderTarget: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.MultiRenderTarget & Double = js.native
    
    /**
      * Texture data comes from raw data (ArrayBuffer)
      */
    @js.native
    sealed trait Raw
      extends StObject
         with InternalTextureSource
    /* 3 */ val Raw: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.Raw & Double = js.native
    
    /**
      * Texture content is raw 2D array data
      */
    @js.native
    sealed trait Raw2DArray
      extends StObject
         with InternalTextureSource
    /* 11 */ val Raw2DArray: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.Raw2DArray & Double = js.native
    
    /**
      * Texture content is raw 3D data
      */
    @js.native
    sealed trait Raw3D
      extends StObject
         with InternalTextureSource
    /* 10 */ val Raw3D: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.Raw3D & Double = js.native
    
    /**
      * Texture content is generated by rendering to it
      */
    @js.native
    sealed trait RenderTarget
      extends StObject
         with InternalTextureSource
    /* 5 */ val RenderTarget: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.RenderTarget & Double = js.native
    
    /**
      * Texture data is only used for temporary storage
      */
    @js.native
    sealed trait Temp
      extends StObject
         with InternalTextureSource
    /* 2 */ val Temp: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.Temp & Double = js.native
    
    /**
      * The source of the texture data is unknown
      */
    @js.native
    sealed trait Unknown
      extends StObject
         with InternalTextureSource
    /* 0 */ val Unknown: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.Unknown & Double = js.native
    
    /**
      * Texture data comes from an URL
      */
    @js.native
    sealed trait Url
      extends StObject
         with InternalTextureSource
    /* 1 */ val Url: typings.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource.Url & Double = js.native
  }
}
