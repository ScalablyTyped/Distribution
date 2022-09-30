package typings.babylonjs.mod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.OffscreenCanvas
import typings.babylonjs.anon.PartialRenderTargetCreati
import typings.babylonjs.computeEffectMod.IComputeEffectCreationOptions
import typings.babylonjs.engineComputeShaderMod.ComputeBindingList
import typings.babylonjs.engineComputeShaderMod.ComputeBindingMapping
import typings.babylonjs.icanvasMod.ICanvas
import typings.babylonjs.icomputecontextMod.IComputeContext
import typings.babylonjs.icomputepipelinecontextMod.IComputePipelineContext
import typings.babylonjs.ipipelinecontextMod.IPipelineContext
import typings.babylonjs.multiRenderTargetMod.IMultiRenderTargetOptions
import typings.babylonjs.textureCreationOptionsMod.DepthTextureCreationOptions
import typings.babylonjs.textureCreationOptionsMod.RenderTargetCreationOptions
import typings.babylonjs.textureCreationOptionsMod.TextureSize
import typings.babylonjs.typesMod.DataArray
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsEnginesThinEngineAugmentingMod {
  
  @js.native
  trait ThinEngine extends StObject {
    
    /** @internal */
    def _cascadeLoadFiles(
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      onfinish: js.Function1[/* images */ js.Array[js.typedarray.ArrayBuffer], Unit],
      files: js.Array[String],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
    ): Unit = js.native
    
    /** @internal */
    def _cascadeLoadImgs(
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      onfinish: Nullable[
          js.Function2[
            /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
            /* images */ js.Array[HTMLImageElement | ImageBitmap], 
            Unit
          ]
        ],
      files: js.Array[String],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
    ): Unit = js.native
    def _cascadeLoadImgs(
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      onfinish: Nullable[
          js.Function2[
            /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
            /* images */ js.Array[HTMLImageElement | ImageBitmap], 
            Unit
          ]
        ],
      files: js.Array[String],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      mimeType: String
    ): Unit = js.native
    
    /**
      * Creates a depth stencil cube texture.
      * This is only available in WebGL 2.
      * @param size The size of face edge in the cube texture.
      * @param options The options defining the cube texture.
      * @param rtWrapper The render target wrapper for which the depth/stencil texture must be created
      * @returns The cube texture
      */
    def _createDepthStencilCubeTexture(
      size: Double,
      options: DepthTextureCreationOptions,
      rtWrapper: typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /** @internal */
    def _createDepthStencilTexture(
      size: TextureSize,
      options: DepthTextureCreationOptions,
      rtWrapper: typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /** @internal */
    def _createHardwareRenderTargetWrapper(isMulti: Boolean, isCube: Boolean, size: TextureSize): typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper = js.native
    
    /** @internal */
    def _debugFlushPendingCommands(): Unit = js.native
    
    /** @internal */
    def _debugInsertMarker(text: String): Unit = js.native
    def _debugInsertMarker(text: String, targetObject: Double): Unit = js.native
    
    /** @internal */
    def _debugPopGroup(): Unit = js.native
    def _debugPopGroup(targetObject: Double): Unit = js.native
    
    /** @internal */
    def _debugPushGroup(groupName: String): Unit = js.native
    def _debugPushGroup(groupName: String, targetObject: Double): Unit = js.native
    
    /** @internal */
    def _deleteComputePipelineContext(pipelineContext: IComputePipelineContext): Unit = js.native
    
    /** @internal */
    def _executeWhenComputeStateIsCompiled(pipelineContext: IComputePipelineContext, action: js.Function0[Unit]): Unit = js.native
    
    /** @internal */
    def _partialLoadFile(
      url: String,
      index: Double,
      loadedFiles: js.Array[js.typedarray.ArrayBuffer],
      onfinish: js.Function1[/* files */ js.Array[js.typedarray.ArrayBuffer], Unit],
      onErrorCallBack: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
    ): Unit = js.native
    
    /** @internal */
    def _partialLoadImg(
      url: String,
      index: Double,
      loadedImages: js.Array[HTMLImageElement | ImageBitmap],
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      onfinish: Nullable[
          js.Function2[
            /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
            /* images */ js.Array[HTMLImageElement | ImageBitmap], 
            Unit
          ]
        ],
      onErrorCallBack: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[Any], Unit]]
    ): Unit = js.native
    def _partialLoadImg(
      url: String,
      index: Double,
      loadedImages: js.Array[HTMLImageElement | ImageBitmap],
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      onfinish: Nullable[
          js.Function2[
            /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
            /* images */ js.Array[HTMLImageElement | ImageBitmap], 
            Unit
          ]
        ],
      onErrorCallBack: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[Any], Unit]],
      mimeType: String
    ): Unit = js.native
    
    /** @internal */
    def _prepareComputePipelineContext(
      pipelineContext: IComputePipelineContext,
      computeSourceCode: String,
      rawComputeSourceCode: String,
      defines: Nullable[String],
      entryPoint: String
    ): Unit = js.native
    
    /** @internal */
    def _readTexturePixels(
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      width: Double,
      height: Double,
      faceIndex: js.UndefOr[Double],
      level: js.UndefOr[Double],
      buffer: js.UndefOr[Nullable[js.typedarray.ArrayBufferView]],
      flushRenderer: js.UndefOr[Boolean],
      noDataConversion: js.UndefOr[Boolean],
      x: js.UndefOr[Double],
      y: js.UndefOr[Double]
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    
    /** @internal */
    def _readTexturePixelsSync(
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      width: Double,
      height: Double,
      faceIndex: js.UndefOr[Double],
      level: js.UndefOr[Double],
      buffer: js.UndefOr[Nullable[js.typedarray.ArrayBufferView]],
      flushRenderer: js.UndefOr[Boolean],
      noDataConversion: js.UndefOr[Boolean],
      x: js.UndefOr[Double],
      y: js.UndefOr[Double]
    ): js.typedarray.ArrayBufferView = js.native
    
    /** @internal */
    def _rebuildComputeEffects(): Unit = js.native
    
    /** @internal */
    def _releaseComputeEffect(effect: typings.babylonjs.computeEffectMod.ComputeEffect): Unit = js.native
    
    /**
      * @internal
      */
    def _setCubeMapTextureParams(texture: typings.babylonjs.internalTextureMod.InternalTexture, loadMipmap: Boolean): Unit = js.native
    def _setCubeMapTextureParams(
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      loadMipmap: Boolean,
      maxLevel: Double
    ): Unit = js.native
    
    /**
      * Gets a boolean indicating if all created compute effects are ready
      * @returns true if all effects are ready
      */
    def areAllComputeEffectsReady(): Boolean = js.native
    
    /**
      * Select a subsets of attachments to draw to.
      * @param attachments gl attachments
      */
    def bindAttachments(attachments: js.Array[Double]): Unit = js.native
    
    /**
      * Bind a specific block at a given index in a specific shader program
      * @param pipelineContext defines the pipeline context to use
      * @param blockName defines the block name
      * @param index defines the index where to bind the block
      */
    def bindUniformBlock(pipelineContext: IPipelineContext, blockName: String, index: Double): Unit = js.native
    
    /**
      * Bind an uniform buffer to the current webGL context
      * @param buffer defines the buffer to bind
      */
    def bindUniformBuffer(buffer: Nullable[typings.babylonjs.dataBufferMod.DataBuffer]): Unit = js.native
    
    /**
      * Bind a buffer to the current webGL context at a given location
      * @param buffer defines the buffer to bind
      * @param location defines the index where to bind the buffer
      * @param name Name of the uniform variable to bind
      */
    def bindUniformBufferBase(buffer: typings.babylonjs.dataBufferMod.DataBuffer, location: Double, name: String): Unit = js.native
    
    /**
      * Creates a layout object to draw/clear on specific textures in a MRT
      * @param textureStatus textureStatus[i] indicates if the i-th is active
      * @returns A layout to be fed to the engine, calling `bindAttachments`.
      */
    def buildTextureLayout(textureStatus: js.Array[Boolean]): js.Array[Double] = js.native
    
    /**
      * Dispatches a compute shader
      * @param effect The compute effect
      * @param context The compute context
      * @param bindings The list of resources to bind to the shader
      * @param x The number of workgroups to execute on the X dimension
      * @param y The number of workgroups to execute on the Y dimension
      * @param z The number of workgroups to execute on the Z dimension
      * @param bindingsMapping list of bindings mapping (key is property name, value is binding location)
      */
    def computeDispatch(
      effect: typings.babylonjs.computeEffectMod.ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double
    ): Unit = js.native
    def computeDispatch(
      effect: typings.babylonjs.computeEffectMod.ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Double
    ): Unit = js.native
    def computeDispatch(
      effect: typings.babylonjs.computeEffectMod.ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Double,
      z: Double
    ): Unit = js.native
    def computeDispatch(
      effect: typings.babylonjs.computeEffectMod.ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Double,
      z: Double,
      bindingsMapping: ComputeBindingMapping
    ): Unit = js.native
    def computeDispatch(
      effect: typings.babylonjs.computeEffectMod.ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Double,
      z: Unit,
      bindingsMapping: ComputeBindingMapping
    ): Unit = js.native
    def computeDispatch(
      effect: typings.babylonjs.computeEffectMod.ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Unit,
      z: Double
    ): Unit = js.native
    def computeDispatch(
      effect: typings.babylonjs.computeEffectMod.ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Unit,
      z: Double,
      bindingsMapping: ComputeBindingMapping
    ): Unit = js.native
    def computeDispatch(
      effect: typings.babylonjs.computeEffectMod.ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Unit,
      z: Unit,
      bindingsMapping: ComputeBindingMapping
    ): Unit = js.native
    
    /**
      * Creates a new compute context
      * @returns the new context
      */
    def createComputeContext(): js.UndefOr[IComputeContext] = js.native
    
    /**
      * Creates a new compute effect
      * @param baseName Name of the effect
      * @param options Options used to create the effect
      * @returns The new compute effect
      */
    def createComputeEffect(baseName: Any, options: IComputeEffectCreationOptions): typings.babylonjs.computeEffectMod.ComputeEffect = js.native
    
    /**
      * Creates a new compute pipeline context
      * @returns the new pipeline
      */
    def createComputePipelineContext(): IComputePipelineContext = js.native
    
    /**
      * Creates a cube texture
      * @param rootUrl defines the url where the files to load is located
      * @param scene defines the current scene
      * @param files defines the list of files to load (1 per face)
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @returns the cube texture as an InternalTexture
      */
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    /**
      * Creates a cube texture
      * @param rootUrl defines the url where the files to load is located
      * @param scene defines the current scene
      * @param files defines the list of files to load (1 per face)
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param createPolynomials if a polynomial sphere should be created for the cube texture
      * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
      * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
      * @returns the cube texture as an InternalTexture
      */
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    /**
      * Creates a cube texture
      * @param rootUrl defines the url where the files to load is located
      * @param scene defines the current scene
      * @param files defines the list of files to load (1 per face)
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param createPolynomials if a polynomial sphere should be created for the cube texture
      * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
      * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
      * @param fallback defines texture to use while falling back when (compressed) texture file not found.
      * @param loaderOptions options to be passed to the loader
      * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
      * @returns the cube texture as an InternalTexture
      */
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[typings.babylonjs.internalTextureMod.InternalTexture],
      loaderOptions: Any,
      useSRGBBuffer: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[typings.babylonjs.internalTextureMod.InternalTexture],
      loaderOptions: Any,
      useSRGBBuffer: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Unit,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[typings.babylonjs.internalTextureMod.InternalTexture],
      loaderOptions: Any,
      useSRGBBuffer: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Unit,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[typings.babylonjs.internalTextureMod.InternalTexture],
      loaderOptions: Any,
      useSRGBBuffer: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /** @internal */
    def createCubeTextureBase(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[typings.babylonjs.internalTextureMod.InternalTexture],
      beforeLoadCubeDataCallback: Nullable[
          js.Function2[
            /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
            /* data */ js.typedarray.ArrayBufferView | js.Array[js.typedarray.ArrayBufferView], 
            Unit
          ]
        ],
      imageHandler: Nullable[
          js.Function2[
            /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
            /* imgs */ js.Array[HTMLImageElement | ImageBitmap], 
            Unit
          ]
        ],
      useSRGBBuffer: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createCubeTextureBase(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean,
      lodScale: Double,
      lodOffset: Double,
      fallback: Nullable[typings.babylonjs.internalTextureMod.InternalTexture],
      beforeLoadCubeDataCallback: Nullable[
          js.Function2[
            /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
            /* data */ js.typedarray.ArrayBufferView | js.Array[js.typedarray.ArrayBufferView], 
            Unit
          ]
        ],
      imageHandler: Nullable[
          js.Function2[
            /* texture */ typings.babylonjs.internalTextureMod.InternalTexture, 
            /* imgs */ js.Array[HTMLImageElement | ImageBitmap], 
            Unit
          ]
        ],
      useSRGBBuffer: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a depth stencil texture.
      * This is only available in WebGL 2 or with the depth texture extension available.
      * @param size The size of face edge in the texture.
      * @param options The options defining the texture.
      * @param rtWrapper The render target wrapper for which the depth/stencil texture must be created
      * @returns The texture
      */
    def createDepthStencilTexture(
      size: TextureSize,
      options: DepthTextureCreationOptions,
      rtWrapper: typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a dynamic texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param generateMipMaps defines if the engine should generate the mip levels
      * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
      * @returns the dynamic texture inside an InternalTexture
      */
    def createDynamicTexture(width: Double, height: Double, generateMipMaps: Boolean, samplingMode: Double): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Create a dynamic uniform buffer
      * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param elements defines the content of the uniform buffer
      * @returns the webGL uniform buffer
      */
    def createDynamicUniformBuffer(elements: FloatArray): typings.babylonjs.dataBufferMod.DataBuffer = js.native
    
    /**
      * Creates an external texture
      * @param video video element
      * @returns the external texture, or null if external textures are not supported by the engine
      */
    def createExternalTexture(video: HTMLVideoElement): Nullable[typings.babylonjs.externalTextureMod.ExternalTexture] = js.native
    
    /**
      * Create a multi render target texture
      * @see https://doc.babylonjs.com/features/webgl2#multiple-render-target
      * @param size defines the size of the texture
      * @param options defines the creation options
      * @param initializeBuffers if set to true, the engine will make an initializing call of drawBuffers
      * @returns a new render target wrapper ready to render textures
      */
    def createMultipleRenderTarget(size: TextureSize, options: IMultiRenderTargetOptions): typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper = js.native
    def createMultipleRenderTarget(size: TextureSize, options: IMultiRenderTargetOptions, initializeBuffers: Boolean): typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper = js.native
    
    /**
      * Create a cube texture from prefiltered data (ie. the mipmaps contain ready to use data for PBR reflection)
      * @param rootUrl defines the url where the file to load is located
      * @param scene defines the current scene
      * @param lodScale defines scale to apply to the mip map selection
      * @param lodOffset defines offset to apply to the mip map selection
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param createPolynomials defines wheter or not to create polynomails harmonics for the texture
      * @returns the cube texture as an InternalTexture
      */
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Double,
      forcedExtension: Any
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Double,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Unit,
      forcedExtension: Any
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Unit,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ]
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Unit,
      format: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Unit,
      format: Double,
      forcedExtension: Any
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Unit,
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Unit,
      format: Double,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Unit,
      format: Unit,
      forcedExtension: Any
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Unit,
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Unit,
      format: Unit,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[
          js.Function1[
            /* internalTexture */ Nullable[typings.babylonjs.internalTextureMod.InternalTexture], 
            Unit
          ]
        ],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a new raw cube texture
      * @param data defines the array of data to use to create each face
      * @param size defines the size of the textures
      * @param format defines the format of the data
      * @param type defines the type of the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
      * @param generateMipMaps  defines if the engine should generate the mip levels
      * @param invertY defines if data must be stored with Y axis inverted
      * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
      * @param compression defines the compression used (null by default)
      * @returns the cube texture as an InternalTexture
      */
    def createRawCubeTexture(
      data: Nullable[js.Array[js.typedarray.ArrayBufferView]],
      size: Double,
      format: Double,
      `type`: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String]
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a new raw cube texture from a specified url
      * @param url defines the url where the data is located
      * @param scene defines the current scene
      * @param size defines the size of the textures
      * @param format defines the format of the data
      * @param type defines the type fo the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
      * @param noMipmap defines if the engine should avoid generating the mip levels
      * @param callback defines a callback used to extract texture data from loaded data
      * @param mipmapGenerator defines to provide an optional tool to generate mip levels
      * @param onLoad defines a callback called when texture is loaded
      * @param onError defines a callback called if there is an error
      * @returns the cube texture as an InternalTexture
      */
    def createRawCubeTextureFromUrl(
      url: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      size: Double,
      format: Double,
      `type`: Double,
      noMipmap: Boolean,
      callback: js.Function1[
          /* ArrayBuffer */ js.typedarray.ArrayBuffer, 
          Nullable[js.Array[js.typedarray.ArrayBufferView]]
        ],
      mipmapGenerator: Nullable[
          js.Function1[
            /* faces */ js.Array[js.typedarray.ArrayBufferView], 
            js.Array[js.Array[js.typedarray.ArrayBufferView]]
          ]
        ],
      onLoad: Nullable[js.Function0[Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    /**
      * Creates a new raw cube texture from a specified url
      * @param url defines the url where the data is located
      * @param scene defines the current scene
      * @param size defines the size of the textures
      * @param format defines the format of the data
      * @param type defines the type fo the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
      * @param noMipmap defines if the engine should avoid generating the mip levels
      * @param callback defines a callback used to extract texture data from loaded data
      * @param mipmapGenerator defines to provide an optional tool to generate mip levels
      * @param onLoad defines a callback called when texture is loaded
      * @param onError defines a callback called if there is an error
      * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
      * @param invertY defines if data must be stored with Y axis inverted
      * @returns the cube texture as an InternalTexture
      */
    def createRawCubeTextureFromUrl(
      url: String,
      scene: Nullable[typings.babylonjs.sceneMod.Scene],
      size: Double,
      format: Double,
      `type`: Double,
      noMipmap: Boolean,
      callback: js.Function1[
          /* ArrayBuffer */ js.typedarray.ArrayBuffer, 
          Nullable[js.Array[js.typedarray.ArrayBufferView]]
        ],
      mipmapGenerator: Nullable[
          js.Function1[
            /* faces */ js.Array[js.typedarray.ArrayBufferView], 
            js.Array[js.Array[js.typedarray.ArrayBufferView]]
          ]
        ],
      onLoad: Nullable[js.Function0[Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      samplingMode: Double,
      invertY: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a raw texture
      * @param data defines the data to store in the texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param format defines the format of the data
      * @param generateMipMaps defines if the engine should generate the mip levels
      * @param invertY defines if data must be stored with Y axis inverted
      * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
      * @param compression defines the compression used (null by default)
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
      * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
      * @returns the raw texture inside an InternalTexture
      */
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      `type`: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      `type`: Double,
      creationFlags: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      `type`: Double,
      creationFlags: Double,
      useSRGBBuffer: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createRawTexture(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      `type`: Double,
      creationFlags: Unit,
      useSRGBBuffer: Boolean
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a new raw 2D array texture
      * @param data defines the data used to create the texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param depth defines the number of layers of the texture
      * @param format defines the format of the texture
      * @param generateMipMaps defines if the engine must generate mip levels
      * @param invertY defines if data must be stored with Y axis inverted
      * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
      * @param compression defines the compressed used (can be null)
      * @param textureType defines the compressed used (can be null)
      * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
      * @returns a new raw 2D array texture (stored in an InternalTexture)
      */
    def createRawTexture2DArray(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      depth: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      textureType: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createRawTexture2DArray(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      depth: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      textureType: Double,
      creationFlags: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a new raw 3D texture
      * @param data defines the data used to create the texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param depth defines the depth of the texture
      * @param format defines the format of the texture
      * @param generateMipMaps defines if the engine must generate mip levels
      * @param invertY defines if data must be stored with Y axis inverted
      * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
      * @param compression defines the compressed used (can be null)
      * @param textureType defines the compressed used (can be null)
      * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
      * @returns a new raw 3D texture (stored in an InternalTexture)
      */
    def createRawTexture3D(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      depth: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      textureType: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    def createRawTexture3D(
      data: Nullable[js.typedarray.ArrayBufferView],
      width: Double,
      height: Double,
      depth: Double,
      format: Double,
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      compression: Nullable[String],
      textureType: Double,
      creationFlags: Double
    ): typings.babylonjs.internalTextureMod.InternalTexture = js.native
    
    /**
      * Creates a new render target cube wrapper
      * @param size defines the size of the texture
      * @param options defines the options used to create the texture
      * @returns a new render target cube wrapper
      */
    def createRenderTargetCubeTexture(size: Double): typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper = js.native
    def createRenderTargetCubeTexture(size: Double, options: PartialRenderTargetCreati): typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper = js.native
    
    /**
      * Creates a new render target texture
      * @param size defines the size of the texture
      * @param options defines the options used to create the texture
      * @returns a new render target wrapper ready to render texture
      */
    def createRenderTargetTexture(size: TextureSize, options: Boolean): typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper = js.native
    def createRenderTargetTexture(size: TextureSize, options: RenderTargetCreationOptions): typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper = js.native
    
    def createStorageBuffer(data: Double, creationFlags: Double): typings.babylonjs.dataBufferMod.DataBuffer = js.native
    /**
      * Creates a storage buffer
      * @param data the data for the storage buffer or the size of the buffer
      * @param creationFlags flags to use when creating the buffer (see Constants.BUFFER_CREATIONFLAG_XXX). The BUFFER_CREATIONFLAG_STORAGE flag will be automatically added
      * @returns the new buffer
      */
    def createStorageBuffer(data: DataArray, creationFlags: Double): typings.babylonjs.dataBufferMod.DataBuffer = js.native
    
    /**
      * Create an uniform buffer
      * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param elements defines the content of the uniform buffer
      * @returns the webGL uniform buffer
      */
    def createUniformBuffer(elements: FloatArray): typings.babylonjs.dataBufferMod.DataBuffer = js.native
    
    /**
      * Gets the current alpha equation.
      * @returns the current alpha equation
      */
    def getAlphaEquation(): Double = js.native
    
    /**
      * Gets the current alpha mode
      * @see https://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered
      * @returns the current alpha mode
      */
    def getAlphaMode(): Double = js.native
    
    /**
      * Read data from a storage buffer
      * @param storageBuffer The storage buffer to read from
      * @param offset The offset in the storage buffer to start reading from (default: 0)
      * @param size  The number of bytes to read from the storage buffer (default: capacity of the buffer)
      * @param buffer The buffer to write the data we have read from the storage buffer to (optional)
      * @returns If not undefined, returns the (promise) buffer (as provided by the 4th parameter) filled with the data, else it returns a (promise) Uint8Array with the data read from the storage buffer
      */
    def readFromStorageBuffer(storageBuffer: typings.babylonjs.dataBufferMod.DataBuffer): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(storageBuffer: typings.babylonjs.dataBufferMod.DataBuffer, offset: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(storageBuffer: typings.babylonjs.dataBufferMod.DataBuffer, offset: Double, size: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(
      storageBuffer: typings.babylonjs.dataBufferMod.DataBuffer,
      offset: Double,
      size: Double,
      buffer: js.typedarray.ArrayBufferView
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(
      storageBuffer: typings.babylonjs.dataBufferMod.DataBuffer,
      offset: Double,
      size: Unit,
      buffer: js.typedarray.ArrayBufferView
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(storageBuffer: typings.babylonjs.dataBufferMod.DataBuffer, offset: Unit, size: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(
      storageBuffer: typings.babylonjs.dataBufferMod.DataBuffer,
      offset: Unit,
      size: Double,
      buffer: js.typedarray.ArrayBufferView
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(
      storageBuffer: typings.babylonjs.dataBufferMod.DataBuffer,
      offset: Unit,
      size: Unit,
      buffer: js.typedarray.ArrayBufferView
    ): js.Promise[js.typedarray.ArrayBufferView] = js.native
    
    /**
      * Forces the engine to release all cached compute effects. This means that next effect compilation will have to be done completely even if a similar effect was already compiled
      */
    def releaseComputeEffects(): Unit = js.native
    
    /**
      * Restores the webgl state to only draw on the main color attachment
      * when the frame buffer associated is the canvas frame buffer
      */
    def restoreSingleAttachment(): Unit = js.native
    
    /**
      * Restores the webgl state to only draw on the main color attachment
      * when the frame buffer associated is not the canvas frame buffer
      */
    def restoreSingleAttachmentForRenderTarget(): Unit = js.native
    
    /**
      * Sets alpha constants used by some alpha blending modes
      * @param r defines the red component
      * @param g defines the green component
      * @param b defines the blue component
      * @param a defines the alpha component
      */
    def setAlphaConstants(r: Double, g: Double, b: Double, a: Double): Unit = js.native
    
    /**
      * Sets the current alpha equation
      * @param equation defines the equation to use (one of the Engine.ALPHA_EQUATION_XXX)
      */
    def setAlphaEquation(equation: Double): Unit = js.native
    
    /**
      * Sets the current alpha mode
      * @param mode defines the mode to use (one of the Engine.ALPHA_XXX)
      * @param noDepthWriteChange defines if depth writing state should remains unchanged (false by default)
      * @see https://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered
      */
    def setAlphaMode(mode: Double): Unit = js.native
    def setAlphaMode(mode: Double, noDepthWriteChange: Boolean): Unit = js.native
    
    /**
      * Sets an internal texture to the according uniform.
      * @param name The name of the uniform in the effect
      * @param texture The texture to apply
      */
    def setExternalTexture(name: String, texture: Nullable[typings.babylonjs.externalTextureMod.ExternalTexture]): Unit = js.native
    
    /**
      * Sets a storage buffer in the shader
      * @param name Defines the name of the storage buffer as defined in the shader
      * @param buffer Defines the value to give to the uniform
      */
    def setStorageBuffer(name: String, buffer: Nullable[typings.babylonjs.storageBufferMod.StorageBuffer]): Unit = js.native
    
    /**
      * Sets a texture sampler to the according uniform.
      * @param name The name of the uniform in the effect
      * @param sampler The sampler to apply
      */
    def setTextureSampler(name: String, sampler: Nullable[typings.babylonjs.textureSamplerMod.TextureSampler]): Unit = js.native
    
    /**
      * Unbind a list of render target textures from the webGL context
      * This is used only when drawBuffer extension or webGL2 are active
      * @param rtWrapper defines the render target wrapper to unbind
      * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
      * @param onBeforeUnbind defines a function which will be called before the effective unbind
      */
    def unBindMultiColorAttachmentFramebuffer(
      rtWrapper: typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper,
      disableGenerateMipMaps: Boolean
    ): Unit = js.native
    def unBindMultiColorAttachmentFramebuffer(
      rtWrapper: typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper,
      disableGenerateMipMaps: Boolean,
      onBeforeUnbind: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Update a dynamic index buffer
      * @param indexBuffer defines the target index buffer
      * @param indices defines the data to update
      * @param offset defines the offset in the target index buffer where update should start
      */
    def updateDynamicIndexBuffer(indexBuffer: typings.babylonjs.dataBufferMod.DataBuffer, indices: IndicesArray): Unit = js.native
    def updateDynamicIndexBuffer(indexBuffer: typings.babylonjs.dataBufferMod.DataBuffer, indices: IndicesArray, offset: Double): Unit = js.native
    
    /**
      * Update the content of a dynamic texture
      * @param texture defines the texture to update
      * @param source defines the source containing the data
      * @param invertY defines if data must be stored with Y axis inverted
      * @param premulAlpha defines if alpha is stored as premultiplied
      * @param format defines the format of the data
      * @param forceBindTexture if the texture should be forced to be bound eg. after a graphics context loss (Default: false)
      * @param allowGPUOptimization true to allow some specific GPU optimizations (subject to engine feature "allowGPUOptimizationsForGUI" being true)
      */
    def updateDynamicTexture(
      texture: Nullable[typings.babylonjs.internalTextureMod.InternalTexture],
      source: ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas | ICanvas,
      invertY: js.UndefOr[Boolean],
      premulAlpha: js.UndefOr[Boolean],
      format: js.UndefOr[Double],
      forceBindTexture: js.UndefOr[Boolean],
      allowGPUOptimization: js.UndefOr[Boolean]
    ): Unit = js.native
    
    /**
      * Updates a dynamic vertex buffer.
      * @param vertexBuffer the vertex buffer to update
      * @param data the data used to update the vertex buffer
      * @param byteOffset the byte offset of the data
      * @param byteLength the byte length of the data
      */
    def updateDynamicVertexBuffer(vertexBuffer: typings.babylonjs.dataBufferMod.DataBuffer, data: DataArray): Unit = js.native
    def updateDynamicVertexBuffer(vertexBuffer: typings.babylonjs.dataBufferMod.DataBuffer, data: DataArray, byteOffset: Double): Unit = js.native
    def updateDynamicVertexBuffer(
      vertexBuffer: typings.babylonjs.dataBufferMod.DataBuffer,
      data: DataArray,
      byteOffset: Double,
      byteLength: Double
    ): Unit = js.native
    def updateDynamicVertexBuffer(
      vertexBuffer: typings.babylonjs.dataBufferMod.DataBuffer,
      data: DataArray,
      byteOffset: Unit,
      byteLength: Double
    ): Unit = js.native
    
    /**
      * Update the sample count for a given multiple render target texture
      * @see https://doc.babylonjs.com/features/webgl2#multisample-render-targets
      * @param rtWrapper defines the render target wrapper to update
      * @param samples defines the sample count to set
      * @param initializeBuffers if set to true, the engine will make an initializing call of drawBuffers
      * @returns the effective sample count (could be 0 if multisample render targets are not supported)
      */
    def updateMultipleRenderTargetTextureSampleCount(rtWrapper: Nullable[typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper], samples: Double): Double = js.native
    def updateMultipleRenderTargetTextureSampleCount(
      rtWrapper: Nullable[typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper],
      samples: Double,
      initializeBuffers: Boolean
    ): Double = js.native
    
    /**
      * Update a raw cube texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateRawCubeTexture(
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      data: js.Array[js.typedarray.ArrayBufferView],
      format: Double,
      `type`: Double,
      invertY: Boolean
    ): Unit = js.native
    /**
      * Update a raw cube texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param invertY defines if data must be stored with Y axis inverted
      * @param compression defines the compression used (null by default)
      */
    def updateRawCubeTexture(
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      data: js.Array[js.typedarray.ArrayBufferView],
      format: Double,
      `type`: Double,
      invertY: Boolean,
      compression: Nullable[String]
    ): Unit = js.native
    /**
      * Update a raw cube texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param invertY defines if data must be stored with Y axis inverted
      * @param compression defines the compression used (null by default)
      * @param level defines which level of the texture to update
      */
    def updateRawCubeTexture(
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      data: js.Array[js.typedarray.ArrayBufferView],
      format: Double,
      `type`: Double,
      invertY: Boolean,
      compression: Nullable[String],
      level: Double
    ): Unit = js.native
    
    /**
      * Update a raw texture
      * @param texture defines the texture to update
      * @param data defines the data to store in the texture
      * @param format defines the format of the data
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateRawTexture(
      texture: Nullable[typings.babylonjs.internalTextureMod.InternalTexture],
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean
    ): Unit = js.native
    /**
      * Update a raw texture
      * @param texture defines the texture to update
      * @param data defines the data to store in the texture
      * @param format defines the format of the data
      * @param invertY defines if data must be stored with Y axis inverted
      * @param compression defines the compression used (null by default)
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
      */
    def updateRawTexture(
      texture: Nullable[typings.babylonjs.internalTextureMod.InternalTexture],
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Nullable[String],
      `type`: Double,
      useSRGBBuffer: Boolean
    ): Unit = js.native
    
    /**
      * Update a raw 2D array texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateRawTexture2DArray(
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean
    ): Unit = js.native
    /**
      * Update a raw 2D array texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param invertY defines if data must be stored with Y axis inverted
      * @param compression defines the used compression (can be null)
      * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
      */
    def updateRawTexture2DArray(
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Nullable[String],
      textureType: Double
    ): Unit = js.native
    
    /**
      * Update a raw 3D texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateRawTexture3D(
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean
    ): Unit = js.native
    /**
      * Update a raw 3D texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param invertY defines if data must be stored with Y axis inverted
      * @param compression defines the used compression (can be null)
      * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
      */
    def updateRawTexture3D(
      texture: typings.babylonjs.internalTextureMod.InternalTexture,
      data: Nullable[js.typedarray.ArrayBufferView],
      format: Double,
      invertY: Boolean,
      compression: Nullable[String],
      textureType: Double
    ): Unit = js.native
    
    /**
      * Updates the sample count of a render target texture
      * @see https://doc.babylonjs.com/features/webgl2#multisample-render-targets
      * @param rtWrapper defines the render target wrapper to update
      * @param samples defines the sample count to set
      * @returns the effective sample count (could be 0 if multisample render targets are not supported)
      */
    def updateRenderTargetTextureSampleCount(rtWrapper: Nullable[typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper], samples: Double): Double = js.native
    
    /**
      * Updates a storage buffer
      * @param buffer the storage buffer to update
      * @param data the data used to update the storage buffer
      * @param byteOffset the byte offset of the data
      * @param byteLength the byte length of the data
      */
    def updateStorageBuffer(buffer: typings.babylonjs.dataBufferMod.DataBuffer, data: DataArray): Unit = js.native
    def updateStorageBuffer(buffer: typings.babylonjs.dataBufferMod.DataBuffer, data: DataArray, byteOffset: Double): Unit = js.native
    def updateStorageBuffer(
      buffer: typings.babylonjs.dataBufferMod.DataBuffer,
      data: DataArray,
      byteOffset: Double,
      byteLength: Double
    ): Unit = js.native
    def updateStorageBuffer(
      buffer: typings.babylonjs.dataBufferMod.DataBuffer,
      data: DataArray,
      byteOffset: Unit,
      byteLength: Double
    ): Unit = js.native
    
    /**
      * Update an existing uniform buffer
      * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param uniformBuffer defines the target uniform buffer
      * @param elements defines the content to update
      * @param offset defines the offset in the uniform buffer where update should start
      * @param count defines the size of the data to update
      */
    def updateUniformBuffer(uniformBuffer: typings.babylonjs.dataBufferMod.DataBuffer, elements: FloatArray): Unit = js.native
    def updateUniformBuffer(uniformBuffer: typings.babylonjs.dataBufferMod.DataBuffer, elements: FloatArray, offset: Double): Unit = js.native
    def updateUniformBuffer(
      uniformBuffer: typings.babylonjs.dataBufferMod.DataBuffer,
      elements: FloatArray,
      offset: Double,
      count: Double
    ): Unit = js.native
    def updateUniformBuffer(
      uniformBuffer: typings.babylonjs.dataBufferMod.DataBuffer,
      elements: FloatArray,
      offset: Unit,
      count: Double
    ): Unit = js.native
    
    /**
      * Update a video texture
      * @param texture defines the texture to update
      * @param video defines the video element to use
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateVideoTexture(
      texture: Nullable[typings.babylonjs.internalTextureMod.InternalTexture],
      video: HTMLVideoElement,
      invertY: Boolean
    ): Unit = js.native
  }
}
