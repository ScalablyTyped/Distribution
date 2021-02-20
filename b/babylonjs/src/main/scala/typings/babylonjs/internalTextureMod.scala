package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.int
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.OffscreenCanvas
import typings.std.OffscreenCanvasRenderingContext2D
import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderbuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/internalTexture", "InternalTexture")
  @js.native
  class InternalTexture protected () extends StObject {
    /**
      * Creates a new InternalTexture
      * @param engine defines the engine to use
      * @param source defines the type of data that will be used
      * @param delayAllocation if the texture allocation should be delayed (default: false)
      */
    def this(engine: ThinEngine, source: InternalTextureSource) = this()
    def this(engine: ThinEngine, source: InternalTextureSource, delayAllocation: Boolean) = this()
    
    /** @hidden */
    var _MSAAFramebuffer: Nullable[WebGLFramebuffer] = js.native
    
    /** @hidden */
    var _MSAARenderBuffer: Nullable[WebGLRenderbuffer] = js.native
    
    /** @hidden */
    var _associatedChannel: Double = js.native
    
    /** @hidden */
    var _attachments: Nullable[js.Array[Double]] = js.native
    
    /** @hidden */
    var _buffer: Nullable[String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap] = js.native
    
    /** @hidden */
    var _bufferView: Nullable[ArrayBufferView] = js.native
    
    /** @hidden */
    var _bufferViewArray: Nullable[js.Array[ArrayBufferView]] = js.native
    
    /** @hidden */
    var _bufferViewArrayArray: Nullable[js.Array[js.Array[ArrayBufferView]]] = js.native
    
    /** @hidden */
    var _cachedAnisotropicFilteringLevel: Nullable[Double] = js.native
    
    /** @hidden */
    var _cachedCoordinatesMode: Nullable[Double] = js.native
    
    /** @hidden */
    var _cachedWrapR: Nullable[Double] = js.native
    
    /** @hidden */
    var _cachedWrapU: Nullable[Double] = js.native
    
    /** @hidden */
    var _cachedWrapV: Nullable[Double] = js.native
    
    /** @hidden */
    var _colorTextureArray: Nullable[WebGLTexture] = js.native
    
    /** @hidden */
    var _comparisonFunction: Double = js.native
    
    /** @hidden */
    var _compression: Nullable[String] = js.native
    
    /** @hidden */
    var _depthStencilBuffer: Nullable[WebGLRenderbuffer] = js.native
    
    /** @hidden */
    var _depthStencilTexture: Nullable[InternalTexture] = js.native
    
    /** @hidden */
    var _depthStencilTextureArray: Nullable[WebGLTexture] = js.native
    
    var _engine: js.Any = js.native
    
    /** @hidden */
    var _extension: String = js.native
    
    /** @hidden */
    var _files: Nullable[js.Array[String]] = js.native
    
    /** @hidden */
    var _framebuffer: Nullable[WebGLFramebuffer] = js.native
    
    /** @hidden */
    var _gammaSpace: Nullable[Boolean] = js.native
    
    /** @hidden */
    var _generateDepthBuffer: Boolean = js.native
    
    /** @hidden */
    var _generateStencilBuffer: Boolean = js.native
    
    /** @hidden */
    var _invertVScale: Boolean = js.native
    
    /** @hidden */
    var _irradianceTexture: Nullable[BaseTexture] = js.native
    
    /** @hidden */
    var _isDisabled: Boolean = js.native
    
    /** @hidden */
    var _isRGBD: Boolean = js.native
    
    /** @hidden */
    var _linearSpecularLOD: Boolean = js.native
    
    /** @hidden */
    var _lodGenerationOffset: Double = js.native
    
    /** @hidden */
    var _lodGenerationScale: Double = js.native
    
    /** @hidden */
    var _lodTextureHigh: Nullable[BaseTexture] = js.native
    
    /** @hidden */
    var _lodTextureLow: Nullable[BaseTexture] = js.native
    
    /** @hidden */
    var _lodTextureMid: Nullable[BaseTexture] = js.native
    
    /** @hidden */
    var _originalUrl: String = js.native
    
    /** @hidden */
    def _rebuild(): Unit = js.native
    
    /** @hidden */
    var _references: Double = js.native
    
    /** @hidden */
    var _size: Double = js.native
    
    /** @hidden */
    var _source: InternalTextureSource = js.native
    
    /** @hidden */
    var _sphericalPolynomial: Nullable[SphericalPolynomial] = js.native
    
    /** @hidden */
    def _swapAndDie(target: InternalTexture): Unit = js.native
    
    /** @hidden */
    var _textureArray: Nullable[js.Array[InternalTexture]] = js.native
    
    /** @hidden */
    var _webGLTexture: Nullable[WebGLTexture] = js.native
    
    /** @hidden */
    var _workingCanvas: Nullable[HTMLCanvasElement | OffscreenCanvas] = js.native
    
    /** @hidden */
    var _workingContext: Nullable[CanvasRenderingContext2D | OffscreenCanvasRenderingContext2D] = js.native
    
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
      * Observable called when the texture is loaded
      */
    var onLoadedObservable: Observable[InternalTexture] = js.native
    
    /**
      * Gets the number of samples used by the texture (WebGL2+ only)
      */
    var samples: Double = js.native
    
    /**
      * Gets the sampling mode of the texture
      */
    var samplingMode: Double = js.native
    
    /**
      * Gets the data source type of the texture
      */
    def source: InternalTextureSource = js.native
    
    /**
      * Gets the type of the texture (int, float...)
      */
    var `type`: Double = js.native
    
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
    
    /** @hidden */
    @JSImport("babylonjs/Materials/Textures/internalTexture", "InternalTexture._UpdateRGBDAsync")
    @js.native
    def _UpdateRGBDAsync(
      internalTexture: InternalTexture,
      data: js.Array[js.Array[ArrayBufferView]],
      sphericalPolynomial: Nullable[SphericalPolynomial],
      lodScale: Double,
      lodOffset: Double
    ): js.Promise[Unit] = js.native
  }
  
  @js.native
  sealed trait InternalTextureSource extends StObject
  @JSImport("babylonjs/Materials/Textures/internalTexture", "InternalTextureSource")
  @js.native
  object InternalTextureSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InternalTextureSource with Double] = js.native
    
    /**
      * Texture data comes from a cube data file
      */
    @js.native
    sealed trait Cube extends InternalTextureSource
    /* 7 */ val Cube: typings.babylonjs.internalTextureMod.InternalTextureSource.Cube with Double = js.native
    
    /**
      * Texture data come from a prefiltered cube data file
      */
    @js.native
    sealed trait CubePrefiltered extends InternalTextureSource
    /* 9 */ val CubePrefiltered: typings.babylonjs.internalTextureMod.InternalTextureSource.CubePrefiltered with Double = js.native
    
    /**
      * Texture data comes from a raw cube data
      */
    @js.native
    sealed trait CubeRaw extends InternalTextureSource
    /* 8 */ val CubeRaw: typings.babylonjs.internalTextureMod.InternalTextureSource.CubeRaw with Double = js.native
    
    /**
      * Texture data comes from a raw cube data encoded with RGBD
      */
    @js.native
    sealed trait CubeRawRGBD extends InternalTextureSource
    /* 13 */ val CubeRawRGBD: typings.babylonjs.internalTextureMod.InternalTextureSource.CubeRawRGBD with Double = js.native
    
    /**
      * Texture content is a depth texture
      */
    @js.native
    sealed trait Depth extends InternalTextureSource
    /* 12 */ val Depth: typings.babylonjs.internalTextureMod.InternalTextureSource.Depth with Double = js.native
    
    /**
      * Texture content is dynamic (video or dynamic texture)
      */
    @js.native
    sealed trait Dynamic extends InternalTextureSource
    /* 4 */ val Dynamic: typings.babylonjs.internalTextureMod.InternalTextureSource.Dynamic with Double = js.native
    
    /**
      * Texture content is part of a multi render target process
      */
    @js.native
    sealed trait MultiRenderTarget extends InternalTextureSource
    /* 6 */ val MultiRenderTarget: typings.babylonjs.internalTextureMod.InternalTextureSource.MultiRenderTarget with Double = js.native
    
    /**
      * Texture data comes from raw data (ArrayBuffer)
      */
    @js.native
    sealed trait Raw extends InternalTextureSource
    /* 3 */ val Raw: typings.babylonjs.internalTextureMod.InternalTextureSource.Raw with Double = js.native
    
    /**
      * Texture content is raw 2D array data
      */
    @js.native
    sealed trait Raw2DArray extends InternalTextureSource
    /* 11 */ val Raw2DArray: typings.babylonjs.internalTextureMod.InternalTextureSource.Raw2DArray with Double = js.native
    
    /**
      * Texture content is raw 3D data
      */
    @js.native
    sealed trait Raw3D extends InternalTextureSource
    /* 10 */ val Raw3D: typings.babylonjs.internalTextureMod.InternalTextureSource.Raw3D with Double = js.native
    
    /**
      * Texture content is generated by rendering to it
      */
    @js.native
    sealed trait RenderTarget extends InternalTextureSource
    /* 5 */ val RenderTarget: typings.babylonjs.internalTextureMod.InternalTextureSource.RenderTarget with Double = js.native
    
    /**
      * Texture data is only used for temporary storage
      */
    @js.native
    sealed trait Temp extends InternalTextureSource
    /* 2 */ val Temp: typings.babylonjs.internalTextureMod.InternalTextureSource.Temp with Double = js.native
    
    /**
      * The source of the texture data is unknown
      */
    @js.native
    sealed trait Unknown extends InternalTextureSource
    /* 0 */ val Unknown: typings.babylonjs.internalTextureMod.InternalTextureSource.Unknown with Double = js.native
    
    /**
      * Texture data comes from an URL
      */
    @js.native
    sealed trait Url extends InternalTextureSource
    /* 1 */ val Url: typings.babylonjs.internalTextureMod.InternalTextureSource.Url with Double = js.native
  }
}
