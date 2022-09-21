package typings.babylonjs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.alphaCullingStateMod.AlphaState
import typings.babylonjs.anon.Capture
import typings.babylonjs.anon.CaptureConstraint
import typings.babylonjs.anon.FramebufferHeight
import typings.babylonjs.anon.Height
import typings.babylonjs.anon.Layers
import typings.babylonjs.anon.Mag
import typings.babylonjs.anon.PartialRenderTargetCreati
import typings.babylonjs.anon.Renderer
import typings.babylonjs.anon.W
import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.computeEffectMod.ComputeEffect
import typings.babylonjs.computeEffectMod.IComputeEffectCreationOptions
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.depthCullingStateMod.DepthCullingState
import typings.babylonjs.drawWrapperMod.DrawWrapper
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.effectMod.IEffectCreationOptions
import typings.babylonjs.engineCapabilitiesMod.EngineCapabilities
import typings.babylonjs.engineComputeShaderMod.ComputeBindingList
import typings.babylonjs.engineComputeShaderMod.ComputeBindingMapping
import typings.babylonjs.engineFeaturesMod.EngineFeatures
import typings.babylonjs.externalTextureMod.ExternalTexture
import typings.babylonjs.fileRequestMod.IFileRequest
import typings.babylonjs.fileToolsMod.LoadFileError
import typings.babylonjs.hardwareTextureWrapperMod.HardwareTextureWrapper
import typings.babylonjs.iEffectFallbacksMod.IEffectFallbacks
import typings.babylonjs.iShaderProcessorMod.IShaderProcessor
import typings.babylonjs.iWebRequestMod.IWebRequest
import typings.babylonjs.iaudioengineoptionsMod.IAudioEngineOptions
import typings.babylonjs.icanvasMod.ICanvas
import typings.babylonjs.icanvasMod.ICanvasRenderingContext
import typings.babylonjs.icanvasMod.IImage
import typings.babylonjs.icomputecontextMod.IComputeContext
import typings.babylonjs.icomputepipelinecontextMod.IComputePipelineContext
import typings.babylonjs.idrawcontextMod.IDrawContext
import typings.babylonjs.imaterialcontextMod.IMaterialContext
import typings.babylonjs.instancingAttributeInfoMod.InstancingAttributeInfo
import typings.babylonjs.internalTextureLoaderMod.IInternalTextureLoader
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.internalTextureMod.InternalTextureSource
import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import typings.babylonjs.ipipelinecontextMod.IPipelineContext
import typings.babylonjs.istencilstateMod.IStencilState
import typings.babylonjs.mathLikeMod.IColor4Like
import typings.babylonjs.mathLikeMod.IViewportLike
import typings.babylonjs.multiRenderTargetMod.IMultiRenderTargetOptions
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shaderLanguageMod.ShaderLanguage
import typings.babylonjs.shaderProcessingOptionsMod.ShaderProcessingContext
import typings.babylonjs.stencilStateComposerMod.StencilStateComposer
import typings.babylonjs.stencilStateMod.StencilState
import typings.babylonjs.storageBufferMod.StorageBuffer
import typings.babylonjs.textureCreationOptionsMod.DepthTextureCreationOptions
import typings.babylonjs.textureCreationOptionsMod.InternalTextureCreationOptions
import typings.babylonjs.textureCreationOptionsMod.RenderTargetCreationOptions
import typings.babylonjs.textureCreationOptionsMod.TextureSize
import typings.babylonjs.textureMod.Texture
import typings.babylonjs.textureSamplerMod.TextureSampler
import typings.babylonjs.thinTextureMod.ThinTexture
import typings.babylonjs.typesMod.DataArray
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferMod.UniformBuffer
import typings.babylonjs.webGLPipelineContextMod.WebGLPipelineContext
import typings.babylonjs.webRequestMod.WebRequest
import typings.std.AudioContext
import typings.std.AudioDestinationNode
import typings.std.Blob
import typings.std.Document
import typings.std.EventTarget
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.ImageBitmapOptions
import typings.std.ImageData
import typings.std.MediaStreamAudioDestinationNode
import typings.std.ProgressEvent
import typings.std.WebGLBuffer
import typings.std.WebGLContextAttributes
import typings.std.WebGLContextEvent
import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderbuffer
import typings.std.WebGLRenderingContext
import typings.std.WebGLShader
import typings.std.WebGLTexture
import typings.std.WebGLVertexArrayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thinEngineMod {
  
  @JSImport("babylonjs/Engines/thinEngine", "ThinEngine")
  @js.native
  open class ThinEngine protected () extends StObject {
    /**
      * Creates a new engine
      * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which already used the WebGL context
      * @param antialias defines enable antialiasing (default: false)
      * @param options defines further options to be sent to the getContext() function
      * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
      */
    def this(canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ]) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Boolean
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Boolean,
      options: EngineOptions
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Unit,
      options: EngineOptions
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Boolean,
      options: Unit,
      adaptToDeviceRatio: Boolean
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Boolean,
      options: EngineOptions,
      adaptToDeviceRatio: Boolean
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Unit,
      options: Unit,
      adaptToDeviceRatio: Boolean
    ) = this()
    def this(
      canvasOrContext: Nullable[
            HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
          ],
      antialias: Unit,
      options: EngineOptions,
      adaptToDeviceRatio: Boolean
    ) = this()
    
    /* private */ var _activateCurrentTexture: Any = js.native
    
    /** @hidden */
    /* protected */ var _activeChannel: Double = js.native
    
    /* protected */ var _activeRenderLoops: js.Array[js.Function0[Unit]] = js.native
    
    /* private */ var _activeRequests: Any = js.native
    
    /** @hidden */
    var _alphaEquation: Double = js.native
    
    /** @hidden */
    var _alphaMode: Double = js.native
    
    /** @hidden */
    var _alphaState: AlphaState = js.native
    
    /* protected */ var _audioContext: Nullable[AudioContext] = js.native
    
    /* protected */ var _audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode] = js.native
    
    /** @hidden */
    var _badDesktopOS: Boolean = js.native
    
    /** @hidden */
    var _badOS: Boolean = js.native
    
    /* private */ var _bindBuffer: Any = js.native
    
    /**
      * @param indexBuffer
      * @hidden
      */
    def _bindIndexBufferWithCache(indexBuffer: Nullable[DataBuffer]): Unit = js.native
    
    /* private */ var _bindSamplerUniformToChannel: Any = js.native
    
    /**
      * @param channel
      * @param texture
      * @param name
      * @hidden
      */
    def _bindTexture(channel: Double, texture: Nullable[InternalTexture], name: String): Unit = js.native
    
    /**
      * @param target
      * @param texture
      * @param forTextureDataUpdate
      * @param force
      * @hidden
      */
    def _bindTextureDirectly(target: Double, texture: Nullable[InternalTexture]): Boolean = js.native
    def _bindTextureDirectly(target: Double, texture: Nullable[InternalTexture], forTextureDataUpdate: Boolean): Boolean = js.native
    def _bindTextureDirectly(target: Double, texture: Nullable[InternalTexture], forTextureDataUpdate: Boolean, force: Boolean): Boolean = js.native
    def _bindTextureDirectly(target: Double, texture: Nullable[InternalTexture], forTextureDataUpdate: Unit, force: Boolean): Boolean = js.native
    
    /**
      * @param framebuffer
      * @hidden
      */
    def _bindUnboundFramebuffer(framebuffer: Nullable[WebGLFramebuffer]): Unit = js.native
    
    /* private */ var _bindVertexBuffersAttributes: Any = js.native
    
    /** @hidden */
    var _boundRenderFunction: Any = js.native
    
    /** @hidden */
    /* protected */ var _boundTexturesCache: StringDictionary[Nullable[InternalTexture]] = js.native
    
    /* protected */ var _boundUniforms: NumberDictionary[WebGLUniformLocation] = js.native
    
    /** @hidden */
    /* protected */ var _cachedEffectForVertexBuffers: Nullable[Effect] = js.native
    
    /** @hidden */
    /* protected */ var _cachedIndexBuffer: Nullable[DataBuffer] = js.native
    
    /* private */ var _cachedVertexArrayObject: Any = js.native
    
    /** @hidden */
    /* protected */ var _cachedVertexBuffers: Any = js.native
    
    /** @hidden */
    /* protected */ var _cachedViewport: Nullable[IViewportLike] = js.native
    
    /* private */ var _canRenderToFloatFramebuffer: Any = js.native
    
    /* private */ var _canRenderToFramebuffer: Any = js.native
    
    /* private */ var _canRenderToHalfFloatFramebuffer: Any = js.native
    
    /** @hidden */
    var _caps: EngineCapabilities = js.native
    
    /** @hidden */
    def _cascadeLoadFiles(
      scene: Nullable[Scene],
      onfinish: js.Function1[/* images */ js.Array[js.typedarray.ArrayBuffer], Unit],
      files: js.Array[String],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
    ): Unit = js.native
    
    /** @hidden */
    def _cascadeLoadImgs(
      scene: Nullable[Scene],
      texture: InternalTexture,
      onfinish: Nullable[
          js.Function2[
            /* texture */ InternalTexture, 
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
      scene: Nullable[Scene],
      texture: InternalTexture,
      onfinish: Nullable[
          js.Function2[
            /* texture */ InternalTexture, 
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
    
    /* private */ var _checkForMobile: Any = js.native
    
    /** @hidden */
    /* protected */ var _colorWrite: Boolean = js.native
    
    /** @hidden */
    /* protected */ var _colorWriteChanged: Boolean = js.native
    
    /* private */ var _compileRawShader: Any = js.native
    
    /* private */ var _compileShader: Any = js.native
    
    /* protected */ var _compiledEffects: StringDictionary[Effect] = js.native
    
    /* protected */ var _contextWasLost: Boolean = js.native
    
    /**
      * Creates a depth stencil cube texture.
      * This is only available in WebGL 2.
      * @param size The size of face edge in the cube texture.
      * @param options The options defining the cube texture.
      * @param rtWrapper The render target wrapper for which the depth/stencil texture must be created
      * @returns The cube texture
      */
    def _createDepthStencilCubeTexture(size: Double, options: DepthTextureCreationOptions, rtWrapper: RenderTargetWrapper): InternalTexture = js.native
    
    /** @hidden */
    def _createDepthStencilTexture(size: TextureSize, options: DepthTextureCreationOptions, rtWrapper: RenderTargetWrapper): InternalTexture = js.native
    
    /** @hidden */
    def _createHardwareRenderTargetWrapper(isMulti: Boolean, isCube: Boolean, size: TextureSize): RenderTargetWrapper = js.native
    
    /** @hidden */
    def _createHardwareTexture(): HardwareTextureWrapper = js.native
    
    /**
      * Creates an internal texture without binding it to a framebuffer
      * @hidden
      * @param size defines the size of the texture
      * @param options defines the options used to create the texture
      * @param delayGPUTextureCreation true to delay the texture creation the first time it is really needed. false to create it right away
      * @param source source type of the texture
      * @returns a new internal texture
      */
    def _createInternalTexture(size: TextureSize, options: Boolean): InternalTexture = js.native
    def _createInternalTexture(size: TextureSize, options: Boolean, delayGPUTextureCreation: Boolean): InternalTexture = js.native
    def _createInternalTexture(
      size: TextureSize,
      options: Boolean,
      delayGPUTextureCreation: Boolean,
      source: InternalTextureSource
    ): InternalTexture = js.native
    def _createInternalTexture(size: TextureSize, options: Boolean, delayGPUTextureCreation: Unit, source: InternalTextureSource): InternalTexture = js.native
    def _createInternalTexture(size: TextureSize, options: InternalTextureCreationOptions): InternalTexture = js.native
    def _createInternalTexture(size: TextureSize, options: InternalTextureCreationOptions, delayGPUTextureCreation: Boolean): InternalTexture = js.native
    def _createInternalTexture(
      size: TextureSize,
      options: InternalTextureCreationOptions,
      delayGPUTextureCreation: Boolean,
      source: InternalTextureSource
    ): InternalTexture = js.native
    def _createInternalTexture(
      size: TextureSize,
      options: InternalTextureCreationOptions,
      delayGPUTextureCreation: Unit,
      source: InternalTextureSource
    ): InternalTexture = js.native
    
    /**
      * @param width
      * @param height
      * @param samples
      * @param internalFormat
      * @param msInternalFormat
      * @param attachment
      * @param unbindBuffer
      * @hidden
      */
    def _createRenderBuffer(
      width: Double,
      height: Double,
      samples: Double,
      internalFormat: Double,
      msInternalFormat: Double,
      attachment: Double
    ): Nullable[WebGLRenderbuffer] = js.native
    def _createRenderBuffer(
      width: Double,
      height: Double,
      samples: Double,
      internalFormat: Double,
      msInternalFormat: Double,
      attachment: Double,
      unbindBuffer: Boolean
    ): Nullable[WebGLRenderbuffer] = js.native
    
    /* protected */ def _createShaderProgram(
      pipelineContext: WebGLPipelineContext,
      vertexShader: WebGLShader,
      fragmentShader: WebGLShader,
      context: WebGLRenderingContext
    ): WebGLProgram = js.native
    /* protected */ def _createShaderProgram(
      pipelineContext: WebGLPipelineContext,
      vertexShader: WebGLShader,
      fragmentShader: WebGLShader,
      context: WebGLRenderingContext,
      transformFeedbackVaryings: Nullable[js.Array[String]]
    ): WebGLProgram = js.native
    
    /** @hidden */
    /* protected */ def _createTexture(): WebGLTexture = js.native
    
    /* protected */ def _createTextureBase(
      url: Nullable[String],
      noMipmap: Boolean,
      invertY: Boolean,
      scene: Nullable[ISceneLike],
      samplingMode: js.UndefOr[Double],
      onLoad: js.UndefOr[Nullable[js.Function1[/* texture */ InternalTexture, Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[/* message */ String, /* exception */ Any, Unit]]],
      prepareTexture: js.Function9[
          /* texture */ InternalTexture, 
          /* extension */ String, 
          /* scene */ Nullable[ISceneLike], 
          /* img */ HTMLImageElement | ImageBitmap | Height, 
          /* invertY */ Boolean, 
          /* noMipmap */ Boolean, 
          /* isCompressed */ Boolean, 
          /* processFunction */ js.Function6[
            /* width */ Double, 
            /* height */ Double, 
            /* img */ HTMLImageElement | ImageBitmap | Height, 
            /* extension */ String, 
            /* texture */ InternalTexture, 
            /* continuationCallback */ js.Function0[Unit], 
            Boolean
          ], 
          /* samplingMode */ Double, 
          Unit
        ],
      prepareTextureProcessFunction: js.Function6[
          /* width */ Double, 
          /* height */ Double, 
          /* img */ HTMLImageElement | ImageBitmap | Height, 
          /* extension */ String, 
          /* texture */ InternalTexture, 
          /* continuationCallback */ js.Function0[Unit], 
          Boolean
        ],
      buffer: js.UndefOr[
          Nullable[
            String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob | ImageBitmap
          ]
        ],
      fallback: js.UndefOr[Nullable[InternalTexture]],
      format: js.UndefOr[Nullable[Double]],
      forcedExtension: js.UndefOr[Nullable[String]],
      mimeType: js.UndefOr[String],
      loaderOptions: js.UndefOr[Any],
      useSRGBBuffer: js.UndefOr[Boolean]
    ): InternalTexture = js.native
    
    /* private */ var _createVertexBuffer: Any = js.native
    
    /* protected */ var _creationOptions: EngineOptions = js.native
    
    /* protected */ var _currentBoundBuffer: js.Array[Nullable[WebGLBuffer]] = js.native
    
    /* private */ var _currentBufferPointers: Any = js.native
    
    /** @hidden */
    var _currentDrawContext: IDrawContext = js.native
    
    /* protected */ var _currentEffect: Nullable[Effect] = js.native
    
    /** @hidden */
    def _currentFrameBufferIsDefaultFrameBuffer(): Boolean = js.native
    
    /** @hidden */
    var _currentFramebuffer: Nullable[WebGLFramebuffer] = js.native
    
    /* private */ var _currentInstanceBuffers: Any = js.native
    
    /* private */ var _currentInstanceLocations: Any = js.native
    
    /** @hidden */
    var _currentMaterialContext: IMaterialContext = js.native
    
    /** @hidden */
    /* protected */ var _currentProgram: Nullable[WebGLProgram] = js.native
    
    /** @hidden */
    var _currentRenderTarget: Nullable[RenderTargetWrapper] = js.native
    
    /* private */ var _currentTextureChannel: Any = js.native
    
    /** @hidden */
    def _debugFlushPendingCommands(): Unit = js.native
    
    /** @hidden */
    def _debugInsertMarker(text: String): Unit = js.native
    def _debugInsertMarker(text: String, targetObject: Double): Unit = js.native
    
    /** @hidden */
    def _debugPopGroup(): Unit = js.native
    def _debugPopGroup(targetObject: Double): Unit = js.native
    
    /** @hidden */
    def _debugPushGroup(groupName: String): Unit = js.native
    def _debugPushGroup(groupName: String, targetObject: Double): Unit = js.native
    
    /* protected */ def _deleteBuffer(buffer: DataBuffer): Unit = js.native
    
    /** @hidden */
    def _deleteComputePipelineContext(pipelineContext: IComputePipelineContext): Unit = js.native
    
    /**
      * @param pipelineContext
      * @hidden
      */
    def _deletePipelineContext(pipelineContext: IPipelineContext): Unit = js.native
    
    /* protected */ def _deleteTexture(texture: Nullable[WebGLTexture]): Unit = js.native
    
    /** @hidden */
    /* protected */ var _depthCullingState: DepthCullingState = js.native
    
    /** @hidden */
    var _doNotHandleContextLost: Boolean = js.native
    
    /* private */ var _drawMode: Any = js.native
    
    /** @hidden */
    var _dummyFramebuffer: Nullable[WebGLFramebuffer] = js.native
    
    /* private */ var _emptyCubeTexture: Any = js.native
    
    /* private */ var _emptyTexture: Any = js.native
    
    /* private */ var _emptyTexture2DArray: Any = js.native
    
    /* private */ var _emptyTexture3D: Any = js.native
    
    /** @hidden */
    def _executeWhenComputeStateIsCompiled(pipelineContext: IComputePipelineContext, action: js.Function0[Unit]): Unit = js.native
    
    /**
      * @param pipelineContext
      * @param action
      * @hidden
      */
    def _executeWhenRenderingStateIsCompiled(pipelineContext: IPipelineContext, action: js.Function0[Unit]): Unit = js.native
    
    /** @hidden */
    var _features: EngineFeatures = js.native
    
    /* protected */ def _finalizePipelineContext(pipelineContext: WebGLPipelineContext): Unit = js.native
    
    /** @hidden */
    var _frameHandler: Double = js.native
    
    /* private */ var _frameId: Any = js.native
    
    /* private */ var _framebufferDimensionsObject: Any = js.native
    
    /** @hidden */
    def _getGlobalDefines(): js.UndefOr[String] = js.native
    def _getGlobalDefines(defines: StringDictionary[String]): js.UndefOr[String] = js.native
    
    /**
      * @param format
      * @param useSRGBBuffer
      * @hidden
      */
    def _getInternalFormat(format: Double): Double = js.native
    def _getInternalFormat(format: Double, useSRGBBuffer: Boolean): Double = js.native
    
    /**
      * @param type
      * @param format
      * @param useSRGBBuffer
      * @hidden
      */
    def _getRGBABufferInternalSizedFormat(`type`: Double): Double = js.native
    def _getRGBABufferInternalSizedFormat(`type`: Double, format: Double): Double = js.native
    def _getRGBABufferInternalSizedFormat(`type`: Double, format: Double, useSRGBBuffer: Boolean): Double = js.native
    def _getRGBABufferInternalSizedFormat(`type`: Double, format: Unit, useSRGBBuffer: Boolean): Double = js.native
    
    /**
      * @param type
      * @hidden
      */
    def _getRGBAMultiSampleBufferFormat(`type`: Double): Double = js.native
    
    /**
      * @param samplingMode
      * @param generateMipMaps
      * @hidden
      */
    def _getSamplingParameters(samplingMode: Double, generateMipMaps: Boolean): Mag = js.native
    
    /**
      * @param shaderLanguage
      * @hidden
      */
    def _getShaderProcessingContext(shaderLanguage: ShaderLanguage): Nullable[ShaderProcessingContext] = js.native
    
    /**
      * @param shaderLanguage
      * @hidden
      */
    def _getShaderProcessor(shaderLanguage: ShaderLanguage): Nullable[IShaderProcessor] = js.native
    
    /**
      * @param shader
      * @hidden
      */
    def _getShaderSource(shader: WebGLShader): Nullable[String] = js.native
    
    /* private */ var _getTextureTarget: Any = js.native
    
    /* private */ var _getTextureWrapMode: Any = js.native
    
    /** @hidden */
    def _getUnpackAlignement(): Double = js.native
    
    /**
      * @param useSRGBBuffer
      * @param noMipmap
      * @hidden
      */
    def _getUseSRGBBuffer(useSRGBBuffer: Boolean, noMipmap: Boolean): Boolean = js.native
    
    /**
      * @param type
      * @hidden
      */
    def _getWebGLTextureType(`type`: Double): Double = js.native
    
    /** @hidden */
    var _gl: WebGL2RenderingContext = js.native
    
    /* private */ var _glRenderer: Any = js.native
    
    /* private */ var _glVendor: Any = js.native
    
    /* private */ var _glVersion: Any = js.native
    
    /** @hidden */
    var _hardwareScalingLevel: Double = js.native
    
    /* protected */ var _highPrecisionShadersAllowed: Boolean = js.native
    
    /* protected */ def _initFeatures(): Unit = js.native
    
    /* protected */ def _initGLContext(): Unit = js.native
    
    /** @hidden */
    var _internalTexturesCache: js.Array[InternalTexture] = js.native
    
    /**
      * @param pipelineContext
      * @hidden
      */
    def _isRenderingStateCompiled(pipelineContext: IPipelineContext): Boolean = js.native
    
    /* protected */ var _isStencilEnable: Boolean = js.native
    
    /** @hidden */
    /* protected */ var _isWebGPU: Boolean = js.native
    
    /** @hidden */
    /* private */ var _lastDevicePixelRatio: Any = js.native
    
    /**
      * @param url
      * @param onSuccess
      * @param onProgress
      * @param offlineProvider
      * @param useArrayBuffer
      * @param onError
      * @hidden
      */
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ]
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit]
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: IOfflineProvider
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = js.native
    def _loadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = js.native
    
    /* private */ var _maxMSAASamplesOverride: Any = js.native
    
    /* private */ var _maxSimultaneousTextures: Any = js.native
    
    /* private */ var _mustWipeVertexAttributes: Any = js.native
    
    /** @hidden */
    /* protected */ var _name: String = js.native
    
    /* private */ var _nextFreeTextureSlots: Any = js.native
    
    /* protected */ def _normalizeIndexData(indices: IndicesArray): js.typedarray.Uint16Array | js.typedarray.Uint32Array = js.native
    
    /* private */ var _onContextLost: Any = js.native
    
    /* private */ var _onContextRestored: Any = js.native
    
    /** @hidden */
    def _partialLoadFile(
      url: String,
      index: Double,
      loadedFiles: js.Array[js.typedarray.ArrayBuffer],
      onfinish: js.Function1[/* files */ js.Array[js.typedarray.ArrayBuffer], Unit],
      onErrorCallBack: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
    ): Unit = js.native
    
    /** @hidden */
    def _partialLoadImg(
      url: String,
      index: Double,
      loadedImages: js.Array[HTMLImageElement | ImageBitmap],
      scene: Nullable[Scene],
      texture: InternalTexture,
      onfinish: Nullable[
          js.Function2[
            /* texture */ InternalTexture, 
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
      scene: Nullable[Scene],
      texture: InternalTexture,
      onfinish: Nullable[
          js.Function2[
            /* texture */ InternalTexture, 
            /* images */ js.Array[HTMLImageElement | ImageBitmap], 
            Unit
          ]
        ],
      onErrorCallBack: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[Any], Unit]],
      mimeType: String
    ): Unit = js.native
    
    /** @hidden */
    def _prepareComputePipelineContext(
      pipelineContext: IComputePipelineContext,
      computeSourceCode: String,
      rawComputeSourceCode: String,
      defines: Nullable[String],
      entryPoint: String
    ): Unit = js.native
    
    /**
      * @param pipelineContext
      * @param vertexSourceCode
      * @param fragmentSourceCode
      * @param createAsRaw
      * @param rawVertexSourceCode
      * @param rawFragmentSourceCode
      * @param rebuildRebind
      * @param defines
      * @param transformFeedbackVaryings
      * @param key
      * @hidden
      */
    def _preparePipelineContext(
      pipelineContext: IPipelineContext,
      vertexSourceCode: String,
      fragmentSourceCode: String,
      createAsRaw: Boolean,
      rawVertexSourceCode: String,
      rawFragmentSourceCode: String,
      rebuildRebind: Any,
      defines: Nullable[String],
      transformFeedbackVaryings: Nullable[js.Array[String]],
      key: String
    ): Unit = js.native
    
    /* private */ var _prepareWebGLTexture: Any = js.native
    
    /* protected */ def _prepareWebGLTextureContinuation(
      texture: InternalTexture,
      scene: Nullable[ISceneLike],
      noMipmap: Boolean,
      isCompressed: Boolean,
      samplingMode: Double
    ): Unit = js.native
    
    /** @hidden */
    def _prepareWorkingCanvas(): Unit = js.native
    
    /**
      * Can be used to override the current requestAnimationFrame requester.
      * @param bindedRenderFunction
      * @param requester
      * @hidden
      */
    /* protected */ def _queueNewFrame(bindedRenderFunction: Any): Double = js.native
    /* protected */ def _queueNewFrame(bindedRenderFunction: Any, requester: Any): Double = js.native
    
    /** @hidden */
    def _readTexturePixels(
      texture: InternalTexture,
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
    
    /** @hidden */
    def _readTexturePixelsSync(
      texture: InternalTexture,
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
    
    /* protected */ def _rebuildBuffers(): Unit = js.native
    
    /** @hidden */
    def _rebuildComputeEffects(): Unit = js.native
    
    /* private */ var _rebuildEffects: Any = js.native
    
    /* private */ var _rebuildInternalTextures: Any = js.native
    
    /* private */ var _rebuildRenderTargetWrappers: Any = js.native
    
    /**
      * @param buffer
      * @hidden
      */
    def _releaseBuffer(buffer: DataBuffer): Boolean = js.native
    
    /** @hidden */
    def _releaseComputeEffect(effect: ComputeEffect): Unit = js.native
    
    /**
      * @param effect
      * @hidden
      */
    def _releaseEffect(effect: Effect): Unit = js.native
    
    /**
      * @param rtWrapper
      * @hidden
      */
    def _releaseRenderTargetWrapper(rtWrapper: RenderTargetWrapper): Unit = js.native
    
    /**
      * @param texture
      * @hidden
      */
    def _releaseTexture(texture: InternalTexture): Unit = js.native
    
    /** @hidden */
    def _renderLoop(): Unit = js.native
    
    /** @hidden */
    var _renderTargetWrapperCache: js.Array[RenderTargetWrapper] = js.native
    
    /* protected */ var _renderingCanvas: Nullable[HTMLCanvasElement] = js.native
    
    /* protected */ var _renderingQueueLaunched: Boolean = js.native
    
    /** @hidden */
    /* protected */ def _reportDrawCall(): Unit = js.native
    
    /**
      * @param source
      * @param destination
      * @param scene
      * @param internalFormat
      * @param onComplete
      * @hidden
      */
    def _rescaleTexture(
      source: InternalTexture,
      destination: InternalTexture,
      scene: Nullable[Any],
      internalFormat: Double,
      onComplete: js.Function0[Unit]
    ): Unit = js.native
    
    /* protected */ def _resetIndexBufferBinding(): Unit = js.native
    
    /** @hidden */
    /* protected */ def _resetVertexBufferBinding(): Unit = js.native
    
    /* protected */ def _restoreEngineAfterContextLost(initEngine: js.Function0[Unit]): Unit = js.native
    
    /**
      * @param target
      * @param internalTexture
      * @param anisotropicFilteringLevel
      * @hidden
      */
    def _setAnisotropicLevel(target: Double, internalTexture: InternalTexture, anisotropicFilteringLevel: Double): Unit = js.native
    
    /**
      * @hidden
      */
    def _setCubeMapTextureParams(texture: InternalTexture, loadMipmap: Boolean): Unit = js.native
    def _setCubeMapTextureParams(texture: InternalTexture, loadMipmap: Boolean, maxLevel: Double): Unit = js.native
    
    /* protected */ def _setProgram(program: WebGLProgram): Unit = js.native
    
    /* protected */ def _setTexture(channel: Double, texture: Nullable[ThinTexture]): Boolean = js.native
    /* protected */ def _setTexture(channel: Double, texture: Nullable[ThinTexture], isPartOfTextureArray: Boolean): Boolean = js.native
    /* protected */ def _setTexture(
      channel: Double,
      texture: Nullable[ThinTexture],
      isPartOfTextureArray: Boolean,
      depthStencilTexture: Boolean
    ): Boolean = js.native
    /* protected */ def _setTexture(
      channel: Double,
      texture: Nullable[ThinTexture],
      isPartOfTextureArray: Boolean,
      depthStencilTexture: Boolean,
      name: String
    ): Boolean = js.native
    /* protected */ def _setTexture(
      channel: Double,
      texture: Nullable[ThinTexture],
      isPartOfTextureArray: Boolean,
      depthStencilTexture: Unit,
      name: String
    ): Boolean = js.native
    /* protected */ def _setTexture(
      channel: Double,
      texture: Nullable[ThinTexture],
      isPartOfTextureArray: Unit,
      depthStencilTexture: Boolean
    ): Boolean = js.native
    /* protected */ def _setTexture(
      channel: Double,
      texture: Nullable[ThinTexture],
      isPartOfTextureArray: Unit,
      depthStencilTexture: Boolean,
      name: String
    ): Boolean = js.native
    /* protected */ def _setTexture(
      channel: Double,
      texture: Nullable[ThinTexture],
      isPartOfTextureArray: Unit,
      depthStencilTexture: Unit,
      name: String
    ): Boolean = js.native
    
    /* private */ var _setTextureParameterFloat: Any = js.native
    
    /* private */ var _setTextureParameterInteger: Any = js.native
    
    /**
      * @param internalTexture
      * @param size
      * @param generateStencil
      * @param bilinearFiltering
      * @param comparisonFunction
      * @param samples
      * @hidden
      */
    def _setupDepthStencilTexture(
      internalTexture: InternalTexture,
      size: Double,
      generateStencil: Boolean,
      bilinearFiltering: Boolean,
      comparisonFunction: Double
    ): Unit = js.native
    def _setupDepthStencilTexture(
      internalTexture: InternalTexture,
      size: Double,
      generateStencil: Boolean,
      bilinearFiltering: Boolean,
      comparisonFunction: Double,
      samples: Double
    ): Unit = js.native
    def _setupDepthStencilTexture(
      internalTexture: InternalTexture,
      size: Layers,
      generateStencil: Boolean,
      bilinearFiltering: Boolean,
      comparisonFunction: Double
    ): Unit = js.native
    def _setupDepthStencilTexture(
      internalTexture: InternalTexture,
      size: Layers,
      generateStencil: Boolean,
      bilinearFiltering: Boolean,
      comparisonFunction: Double,
      samples: Double
    ): Unit = js.native
    
    /**
      * @param generateStencilBuffer
      * @param generateDepthBuffer
      * @param width
      * @param height
      * @param samples
      * @hidden
      */
    def _setupFramebufferDepthAttachments(generateStencilBuffer: Boolean, generateDepthBuffer: Boolean, width: Double, height: Double): Nullable[WebGLRenderbuffer] = js.native
    def _setupFramebufferDepthAttachments(
      generateStencilBuffer: Boolean,
      generateDepthBuffer: Boolean,
      width: Double,
      height: Double,
      samples: Double
    ): Nullable[WebGLRenderbuffer] = js.native
    
    /** @hidden */
    /* protected */ var _shaderPlatformName: String = js.native
    
    /* protected */ var _shaderProcessor: Nullable[IShaderProcessor] = js.native
    
    /**
      * Shared initialization across engines types.
      * @param canvas The canvas associated with this instance of the engine.
      * @param doNotHandleTouchAction Defines that engine should ignore modifying touch action attribute and style
      * @param audioEngine Defines if an audio engine should be created by default
      */
    /* protected */ def _sharedInit(canvas: HTMLCanvasElement, doNotHandleTouchAction: Boolean, audioEngine: Boolean): Unit = js.native
    
    /** @hidden */
    def _shouldUseHighPrecisionShader: Boolean = js.native
    
    /* protected */ var _snapshotRenderingMode: Double = js.native
    
    /** @hidden */
    /* protected */ var _stencilState: StencilState = js.native
    
    /** @hidden */
    /* protected */ var _stencilStateComposer: StencilStateComposer = js.native
    
    /** @hidden */
    var _storageBuffers: js.Array[StorageBuffer] = js.native
    
    /* protected */ def _supportsHardwareTextureRescaling: Boolean = js.native
    
    /* private */ var _textureUnits: Any = js.native
    
    /** @hidden */
    var _transformTextureUrl: Nullable[js.Function1[/* url */ String, String]] = js.native
    
    /* private */ var _uintIndicesCurrentlySet: Any = js.native
    
    /* private */ var _unbindVertexArrayObject: Any = js.native
    
    /** @hidden */
    var _uniformBuffers: js.Array[UniformBuffer] = js.native
    
    /**
      * @param value
      * @hidden
      */
    def _unpackFlipY(value: Boolean): Unit = js.native
    
    /* private */ var _unpackFlipYCached: Any = js.native
    
    def _updateRenderBuffer(
      renderBuffer: Nullable[WebGLRenderbuffer],
      width: Double,
      height: Double,
      samples: Double,
      internalFormat: Double,
      msInternalFormat: Double,
      attachment: Double
    ): Nullable[WebGLRenderbuffer] = js.native
    def _updateRenderBuffer(
      renderBuffer: Nullable[WebGLRenderbuffer],
      width: Double,
      height: Double,
      samples: Double,
      internalFormat: Double,
      msInternalFormat: Double,
      attachment: Double,
      unbindBuffer: Boolean
    ): Nullable[WebGLRenderbuffer] = js.native
    
    /**
      * @param texture
      * @param imageData
      * @param faceIndex
      * @param lod
      * @hidden
      */
    def _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: js.typedarray.ArrayBufferView): Unit = js.native
    def _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: js.typedarray.ArrayBufferView, faceIndex: Double): Unit = js.native
    def _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: js.typedarray.ArrayBufferView, faceIndex: Double, lod: Double): Unit = js.native
    def _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: js.typedarray.ArrayBufferView, faceIndex: Unit, lod: Double): Unit = js.native
    
    /**
      * @param texture
      * @param internalFormat
      * @param width
      * @param height
      * @param data
      * @param faceIndex
      * @param lod
      * @hidden
      */
    def _uploadCompressedDataToTextureDirectly(
      texture: InternalTexture,
      internalFormat: Double,
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView
    ): Unit = js.native
    def _uploadCompressedDataToTextureDirectly(
      texture: InternalTexture,
      internalFormat: Double,
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      faceIndex: Double
    ): Unit = js.native
    def _uploadCompressedDataToTextureDirectly(
      texture: InternalTexture,
      internalFormat: Double,
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      faceIndex: Double,
      lod: Double
    ): Unit = js.native
    def _uploadCompressedDataToTextureDirectly(
      texture: InternalTexture,
      internalFormat: Double,
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      faceIndex: Unit,
      lod: Double
    ): Unit = js.native
    
    /**
      * @param texture
      * @param imageData
      * @param faceIndex
      * @param lod
      * @param babylonInternalFormat
      * @param useTextureWidthAndHeight
      * @hidden
      */
    def _uploadDataToTextureDirectly(texture: InternalTexture, imageData: js.typedarray.ArrayBufferView): Unit = js.native
    def _uploadDataToTextureDirectly(texture: InternalTexture, imageData: js.typedarray.ArrayBufferView, faceIndex: Double): Unit = js.native
    def _uploadDataToTextureDirectly(texture: InternalTexture, imageData: js.typedarray.ArrayBufferView, faceIndex: Double, lod: Double): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Double,
      lod: Double,
      babylonInternalFormat: Double
    ): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Double,
      lod: Double,
      babylonInternalFormat: Double,
      useTextureWidthAndHeight: Boolean
    ): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Double,
      lod: Double,
      babylonInternalFormat: Unit,
      useTextureWidthAndHeight: Boolean
    ): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Double,
      lod: Unit,
      babylonInternalFormat: Double
    ): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Double,
      lod: Unit,
      babylonInternalFormat: Double,
      useTextureWidthAndHeight: Boolean
    ): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Double,
      lod: Unit,
      babylonInternalFormat: Unit,
      useTextureWidthAndHeight: Boolean
    ): Unit = js.native
    def _uploadDataToTextureDirectly(texture: InternalTexture, imageData: js.typedarray.ArrayBufferView, faceIndex: Unit, lod: Double): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Unit,
      lod: Double,
      babylonInternalFormat: Double
    ): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Unit,
      lod: Double,
      babylonInternalFormat: Double,
      useTextureWidthAndHeight: Boolean
    ): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Unit,
      lod: Double,
      babylonInternalFormat: Unit,
      useTextureWidthAndHeight: Boolean
    ): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Unit,
      lod: Unit,
      babylonInternalFormat: Double
    ): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Unit,
      lod: Unit,
      babylonInternalFormat: Double,
      useTextureWidthAndHeight: Boolean
    ): Unit = js.native
    def _uploadDataToTextureDirectly(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      faceIndex: Unit,
      lod: Unit,
      babylonInternalFormat: Unit,
      useTextureWidthAndHeight: Boolean
    ): Unit = js.native
    
    /* protected */ var _useExactSrgbConversions: Boolean = js.native
    
    /* private */ var _useReverseDepthBuffer: Any = js.native
    
    /* private */ var _vaoRecordInProgress: Any = js.native
    
    /* private */ var _vertexAttribArraysEnabled: Any = js.native
    
    /* private */ var _vertexAttribPointer: Any = js.native
    
    /** @hidden */
    var _videoTextureSupported: Boolean = js.native
    
    /**
      * @param x
      * @param y
      * @param width
      * @param height
      * @hidden
      */
    def _viewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /* protected */ var _viewportCached: W = js.native
    
    /** @hidden */
    var _webGLVersion: Double = js.native
    
    /* protected */ var _windowIsBackground: Boolean = js.native
    
    /** @hidden */
    var _workingCanvas: Nullable[ICanvas] = js.native
    
    /** @hidden */
    var _workingContext: Nullable[ICanvasRenderingContext] = js.native
    
    /**
      * Gets the list of current active render loop functions
      * @returns an array with the current render loop functions
      */
    def activeRenderLoops: js.Array[js.Function0[Unit]] = js.native
    
    /**
      * If set to true zooming in and out in the browser will rescale the hardware-scaling correctly.
      */
    var adaptToDeviceRatio: Boolean = js.native
    
    /**
      * Gets the alpha state manager
      */
    def alphaState: AlphaState = js.native
    
    /**
      * Apply all cached states (depth, culling, stencil and alpha)
      */
    def applyStates(): Unit = js.native
    
    /**
      * Gets a boolean indicating if all created compute effects are ready
      * @returns true if all effects are ready
      */
    def areAllComputeEffectsReady(): Boolean = js.native
    
    /**
      * Gets a boolean indicating if all created effects are ready
      * @returns true if all effects are ready
      */
    def areAllEffectsReady(): Boolean = js.native
    
    /**
      * Attach a new callback raised when context lost event is fired
      * @param callback defines the callback to call
      */
    def attachContextLostEvent(callback: js.Function1[/* event */ WebGLContextEvent, Unit]): Unit = js.native
    
    /**
      * Attach a new callback raised when context restored event is fired
      * @param callback defines the callback to call
      */
    def attachContextRestoredEvent(callback: js.Function1[/* event */ WebGLContextEvent, Unit]): Unit = js.native
    
    /**
      * Begin a new frame
      */
    def beginFrame(): Unit = js.native
    
    /**
      * Bind a webGL buffer to the webGL context
      * @param buffer defines the buffer to bind
      */
    def bindArrayBuffer(buffer: Nullable[DataBuffer]): Unit = js.native
    
    /**
      * Select a subsets of attachments to draw to.
      * @param attachments gl attachments
      */
    def bindAttachments(attachments: js.Array[Double]): Unit = js.native
    
    /**
      * Bind a list of vertex buffers to the webGL context
      * @param vertexBuffers defines the list of vertex buffers to bind
      * @param indexBuffer defines the index buffer to bind
      * @param effect defines the effect associated with the vertex buffers
      * @param overrideVertexBuffers defines optional list of avertex buffers that overrides the entries in vertexBuffers
      */
    def bindBuffers(
      vertexBuffers: StringDictionary[Nullable[VertexBuffer]],
      indexBuffer: Nullable[DataBuffer],
      effect: Effect
    ): Unit = js.native
    def bindBuffers(
      vertexBuffers: StringDictionary[Nullable[VertexBuffer]],
      indexBuffer: Nullable[DataBuffer],
      effect: Effect,
      overrideVertexBuffers: StringDictionary[Nullable[VertexBuffer]]
    ): Unit = js.native
    
    /**
      * Bind webGl buffers directly to the webGL context
      * @param vertexBuffer defines the vertex buffer to bind
      * @param indexBuffer defines the index buffer to bind
      * @param vertexDeclaration defines the vertex declaration to use with the vertex buffer
      * @param vertexStrideSize defines the vertex stride of the vertex buffer
      * @param effect defines the effect associated with the vertex buffer
      */
    def bindBuffersDirectly(
      vertexBuffer: DataBuffer,
      indexBuffer: DataBuffer,
      vertexDeclaration: js.Array[Double],
      vertexStrideSize: Double,
      effect: Effect
    ): Unit = js.native
    
    /**
      * Binds the frame buffer to the specified texture.
      * @param texture The render target wrapper to render to
      * @param faceIndex The face of the texture to render to in case of cube texture
      * @param requiredWidth The width of the target to render to
      * @param requiredHeight The height of the target to render to
      * @param forceFullscreenViewport Forces the viewport to be the entire texture/screen if true
      * @param lodLevel defines the lod level to bind to the frame buffer
      * @param layer defines the 2d array index to bind to frame buffer to
      */
    def bindFramebuffer(
      texture: RenderTargetWrapper,
      faceIndex: js.UndefOr[Double],
      requiredWidth: js.UndefOr[Double],
      requiredHeight: js.UndefOr[Double],
      forceFullscreenViewport: js.UndefOr[Boolean],
      lodLevel: js.UndefOr[Double],
      layer: js.UndefOr[Double]
    ): Unit = js.native
    
    /* protected */ def bindIndexBuffer(buffer: Nullable[DataBuffer]): Unit = js.native
    
    /**
      * Bind the content of a webGL buffer used with instantiation
      * @param instancesBuffer defines the webGL buffer to bind
      * @param attributesInfo defines the offsets or attributes information used to determine where data must be stored in the buffer
      * @param computeStride defines Whether to compute the strides from the info or use the default 0
      */
    def bindInstancesBuffer(instancesBuffer: DataBuffer, attributesInfo: js.Array[InstancingAttributeInfo]): Unit = js.native
    def bindInstancesBuffer(
      instancesBuffer: DataBuffer,
      attributesInfo: js.Array[InstancingAttributeInfo],
      computeStride: Boolean
    ): Unit = js.native
    
    /**
      * Binds an effect to the webGL context
      * @param effect defines the effect to bind
      */
    def bindSamplers(effect: Effect): Unit = js.native
    
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
    def bindUniformBuffer(buffer: Nullable[DataBuffer]): Unit = js.native
    
    /**
      * Bind a buffer to the current webGL context at a given location
      * @param buffer defines the buffer to bind
      * @param location defines the index where to bind the buffer
      * @param name Name of the uniform variable to bind
      */
    def bindUniformBufferBase(buffer: DataBuffer, location: Double, name: String): Unit = js.native
    
    /**
      * Bind a specific vertex array object
      * @see https://doc.babylonjs.com/features/webgl2#vertex-array-objects
      * @param vertexArrayObject defines the vertex array object to bind
      * @param indexBuffer defines the index buffer to bind
      */
    def bindVertexArrayObject(vertexArrayObject: WebGLVertexArrayObject, indexBuffer: Nullable[DataBuffer]): Unit = js.native
    
    /**
      * Creates a layout object to draw/clear on specific textures in a MRT
      * @param textureStatus textureStatus[i] indicates if the i-th is active
      * @returns A layout to be fed to the engine, calling `bindAttachments`.
      */
    def buildTextureLayout(textureStatus: js.Array[Boolean]): js.Array[Double] = js.native
    
    /**
      * Clear the current render buffer or the current render target (if any is set up)
      * @param color defines the color to use
      * @param backBuffer defines if the back buffer must be cleared
      * @param depth defines if the depth buffer must be cleared
      * @param stencil defines if the stencil buffer must be cleared
      */
    def clear(color: Nullable[IColor4Like], backBuffer: Boolean, depth: Boolean): Unit = js.native
    def clear(color: Nullable[IColor4Like], backBuffer: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    
    /**
      * Clears the list of texture accessible through engine.
      * This can help preventing texture load conflict due to name collision.
      */
    def clearInternalTexturesCache(): Unit = js.native
    
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
    def computeDispatch(effect: ComputeEffect, context: IComputeContext, bindings: ComputeBindingList, x: Double): Unit = js.native
    def computeDispatch(
      effect: ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Double
    ): Unit = js.native
    def computeDispatch(
      effect: ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Double,
      z: Double
    ): Unit = js.native
    def computeDispatch(
      effect: ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Double,
      z: Double,
      bindingsMapping: ComputeBindingMapping
    ): Unit = js.native
    def computeDispatch(
      effect: ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Double,
      z: Unit,
      bindingsMapping: ComputeBindingMapping
    ): Unit = js.native
    def computeDispatch(
      effect: ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Unit,
      z: Double
    ): Unit = js.native
    def computeDispatch(
      effect: ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Unit,
      z: Double,
      bindingsMapping: ComputeBindingMapping
    ): Unit = js.native
    def computeDispatch(
      effect: ComputeEffect,
      context: IComputeContext,
      bindings: ComputeBindingList,
      x: Double,
      y: Unit,
      z: Unit,
      bindingsMapping: ComputeBindingMapping
    ): Unit = js.native
    
    /**
      * Create a canvas. This method is overridden by other engines
      * @param width width
      * @param height height
      * @returns ICanvas interface
      */
    def createCanvas(width: Double, height: Double): ICanvas = js.native
    
    /**
      * Create an image to use with canvas
      * @returns IImage interface
      */
    def createCanvasImage(): IImage = js.native
    
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
    def createComputeEffect(baseName: Any, options: IComputeEffectCreationOptions): ComputeEffect = js.native
    
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
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any
    ): InternalTexture = js.native
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
      scene: Nullable[Scene],
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
    ): InternalTexture = js.native
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
      scene: Nullable[Scene],
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
      fallback: Nullable[InternalTexture],
      loaderOptions: Any,
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: Boolean,
      onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
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
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
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
      fallback: Nullable[InternalTexture],
      loaderOptions: Any,
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
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
      fallback: Nullable[InternalTexture],
      loaderOptions: Any,
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
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
      fallback: Nullable[InternalTexture],
      loaderOptions: Any,
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    
    /** @hidden */
    def createCubeTextureBase(
      rootUrl: String,
      scene: Nullable[Scene],
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
      fallback: Nullable[InternalTexture],
      beforeLoadCubeDataCallback: Nullable[
          js.Function2[
            /* texture */ InternalTexture, 
            /* data */ js.typedarray.ArrayBufferView | js.Array[js.typedarray.ArrayBufferView], 
            Unit
          ]
        ],
      imageHandler: Nullable[
          js.Function2[
            /* texture */ InternalTexture, 
            /* imgs */ js.Array[HTMLImageElement | ImageBitmap], 
            Unit
          ]
        ],
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    def createCubeTextureBase(
      rootUrl: String,
      scene: Nullable[Scene],
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
      fallback: Nullable[InternalTexture],
      beforeLoadCubeDataCallback: Nullable[
          js.Function2[
            /* texture */ InternalTexture, 
            /* data */ js.typedarray.ArrayBufferView | js.Array[js.typedarray.ArrayBufferView], 
            Unit
          ]
        ],
      imageHandler: Nullable[
          js.Function2[
            /* texture */ InternalTexture, 
            /* imgs */ js.Array[HTMLImageElement | ImageBitmap], 
            Unit
          ]
        ],
      useSRGBBuffer: Boolean
    ): InternalTexture = js.native
    
    /**
      * Creates a depth stencil texture.
      * This is only available in WebGL 2 or with the depth texture extension available.
      * @param size The size of face edge in the texture.
      * @param options The options defining the texture.
      * @param rtWrapper The render target wrapper for which the depth/stencil texture must be created
      * @returns The texture
      */
    def createDepthStencilTexture(size: TextureSize, options: DepthTextureCreationOptions, rtWrapper: RenderTargetWrapper): InternalTexture = js.native
    
    /**
      * Creates a new draw context
      * @returns the new context
      */
    def createDrawContext(): js.UndefOr[IDrawContext] = js.native
    
    /**
      * Creates a dynamic texture
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @param generateMipMaps defines if the engine should generate the mip levels
      * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
      * @returns the dynamic texture inside an InternalTexture
      */
    def createDynamicTexture(width: Double, height: Double, generateMipMaps: Boolean, samplingMode: Double): InternalTexture = js.native
    
    /**
      * Create a dynamic uniform buffer
      * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param elements defines the content of the uniform buffer
      * @returns the webGL uniform buffer
      */
    def createDynamicUniformBuffer(elements: FloatArray): DataBuffer = js.native
    
    /**
      * Creates a dynamic vertex buffer
      * @param data the data for the dynamic vertex buffer
      * @returns the new WebGL dynamic buffer
      */
    def createDynamicVertexBuffer(data: DataArray): DataBuffer = js.native
    
    /**
      * Create a new effect (used to store vertex/fragment shaders)
      * @param baseName defines the base name of the effect (The name of file without .fragment.fx or .vertex.fx)
      * @param attributesNamesOrOptions defines either a list of attribute names or an IEffectCreationOptions object
      * @param uniformsNamesOrEngine defines either a list of uniform names or the engine to use
      * @param samplers defines an array of string used to represent textures
      * @param defines defines the string containing the defines to use to compile the shaders
      * @param fallbacks defines the list of potential fallbacks to use if shader compilation fails
      * @param onCompiled defines a function to call when the effect creation is successful
      * @param onError defines a function to call when the effect creation has failed
      * @param indexParameters defines an object containing the index values to use to compile shaders (like the maximum number of simultaneous lights)
      * @param shaderLanguage the language the shader is written in (default: GLSL)
      * @returns the new Effect
      */
    def createEffect(
      baseName: Any,
      attributesNamesOrOptions: js.Array[String] | IEffectCreationOptions,
      uniformsNamesOrEngine: js.Array[String] | ThinEngine,
      samplers: js.UndefOr[js.Array[String]],
      defines: js.UndefOr[String],
      fallbacks: js.UndefOr[IEffectFallbacks],
      onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ Effect, Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[/* effect */ Effect, /* errors */ String, Unit]]],
      indexParameters: js.UndefOr[Any],
      shaderLanguage: js.UndefOr[ShaderLanguage]
    ): Effect = js.native
    
    /**
      * Creates an external texture
      * @param video video element
      * @returns the external texture, or null if external textures are not supported by the engine
      */
    def createExternalTexture(video: HTMLVideoElement): Nullable[ExternalTexture] = js.native
    
    /**
      * Creates a new index buffer
      * @param indices defines the content of the index buffer
      * @param updatable defines if the index buffer must be updatable
      * @returns a new webGL buffer
      */
    def createIndexBuffer(indices: IndicesArray): DataBuffer = js.native
    def createIndexBuffer(indices: IndicesArray, updatable: Boolean): DataBuffer = js.native
    
    /**
      * Creates a new material context
      * @returns the new context
      */
    def createMaterialContext(): js.UndefOr[IMaterialContext] = js.native
    
    /**
      * Create a multi render target texture
      * @see https://doc.babylonjs.com/features/webgl2#multiple-render-target
      * @param size defines the size of the texture
      * @param options defines the creation options
      * @param initializeBuffers if set to true, the engine will make an initializing call of drawBuffers
      * @returns a new render target wrapper ready to render textures
      */
    def createMultipleRenderTarget(size: TextureSize, options: IMultiRenderTargetOptions): RenderTargetWrapper = js.native
    def createMultipleRenderTarget(size: TextureSize, options: IMultiRenderTargetOptions, initializeBuffers: Boolean): RenderTargetWrapper = js.native
    
    /**
      * Creates a new pipeline context
      * @param shaderProcessingContext defines the shader processing context used during the processing if available
      * @returns the new pipeline
      */
    def createPipelineContext(shaderProcessingContext: Nullable[ShaderProcessingContext]): IPipelineContext = js.native
    
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
    def createPrefilteredCubeTexture(rootUrl: String, scene: Nullable[Scene], lodScale: Double, lodOffset: Double): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Double
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Double,
      forcedExtension: Any
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Double,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Unit,
      forcedExtension: Any
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Unit,
      format: Unit,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Unit,
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Unit,
      format: Double
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Unit,
      format: Double,
      forcedExtension: Any
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Unit,
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Unit,
      format: Double,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Unit,
      format: Unit,
      forcedExtension: Any
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Unit,
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Unit,
      format: Unit,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Double,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Any,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
      onError: Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ],
      format: Unit,
      forcedExtension: Unit,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    
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
    ): InternalTexture = js.native
    
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
      scene: Nullable[Scene],
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
    ): InternalTexture = js.native
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
      scene: Nullable[Scene],
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
    ): InternalTexture = js.native
    
    /**
      * Directly creates a webGL program
      * @param pipelineContext  defines the pipeline context to attach to
      * @param vertexCode defines the vertex shader code to use
      * @param fragmentCode defines the fragment shader code to use
      * @param context defines the webGL context to use (if not set, the current one will be used)
      * @param transformFeedbackVaryings defines the list of transform feedback varyings to use
      * @returns the new webGL program
      */
    def createRawShaderProgram(pipelineContext: IPipelineContext, vertexCode: String, fragmentCode: String): WebGLProgram = js.native
    def createRawShaderProgram(
      pipelineContext: IPipelineContext,
      vertexCode: String,
      fragmentCode: String,
      context: Unit,
      transformFeedbackVaryings: Nullable[js.Array[String]]
    ): WebGLProgram = js.native
    def createRawShaderProgram(
      pipelineContext: IPipelineContext,
      vertexCode: String,
      fragmentCode: String,
      context: WebGLRenderingContext
    ): WebGLProgram = js.native
    def createRawShaderProgram(
      pipelineContext: IPipelineContext,
      vertexCode: String,
      fragmentCode: String,
      context: WebGLRenderingContext,
      transformFeedbackVaryings: Nullable[js.Array[String]]
    ): WebGLProgram = js.native
    
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
    ): InternalTexture = js.native
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
    ): InternalTexture = js.native
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
    ): InternalTexture = js.native
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
    ): InternalTexture = js.native
    
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
    ): InternalTexture = js.native
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
    ): InternalTexture = js.native
    
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
    ): InternalTexture = js.native
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
    ): InternalTexture = js.native
    
    /**
      * Creates a new render target cube wrapper
      * @param size defines the size of the texture
      * @param options defines the options used to create the texture
      * @returns a new render target cube wrapper
      */
    def createRenderTargetCubeTexture(size: Double): RenderTargetWrapper = js.native
    def createRenderTargetCubeTexture(size: Double, options: PartialRenderTargetCreati): RenderTargetWrapper = js.native
    
    /**
      * Creates a new render target texture
      * @param size defines the size of the texture
      * @param options defines the options used to create the texture
      * @returns a new render target wrapper ready to render texture
      */
    def createRenderTargetTexture(size: TextureSize, options: Boolean): RenderTargetWrapper = js.native
    def createRenderTargetTexture(size: TextureSize, options: RenderTargetCreationOptions): RenderTargetWrapper = js.native
    
    /**
      * Creates a webGL program
      * @param pipelineContext  defines the pipeline context to attach to
      * @param vertexCode  defines the vertex shader code to use
      * @param fragmentCode defines the fragment shader code to use
      * @param defines defines the string containing the defines to use to compile the shaders
      * @param context defines the webGL context to use (if not set, the current one will be used)
      * @param transformFeedbackVaryings defines the list of transform feedback varyings to use
      * @returns the new webGL program
      */
    def createShaderProgram(
      pipelineContext: IPipelineContext,
      vertexCode: String,
      fragmentCode: String,
      defines: Nullable[String]
    ): WebGLProgram = js.native
    def createShaderProgram(
      pipelineContext: IPipelineContext,
      vertexCode: String,
      fragmentCode: String,
      defines: Nullable[String],
      context: Unit,
      transformFeedbackVaryings: Nullable[js.Array[String]]
    ): WebGLProgram = js.native
    def createShaderProgram(
      pipelineContext: IPipelineContext,
      vertexCode: String,
      fragmentCode: String,
      defines: Nullable[String],
      context: WebGLRenderingContext
    ): WebGLProgram = js.native
    def createShaderProgram(
      pipelineContext: IPipelineContext,
      vertexCode: String,
      fragmentCode: String,
      defines: Nullable[String],
      context: WebGLRenderingContext,
      transformFeedbackVaryings: Nullable[js.Array[String]]
    ): WebGLProgram = js.native
    
    def createStorageBuffer(data: Double, creationFlags: Double): DataBuffer = js.native
    /**
      * Creates a storage buffer
      * @param data the data for the storage buffer or the size of the buffer
      * @param creationFlags flags to use when creating the buffer (see Constants.BUFFER_CREATIONFLAG_XXX). The BUFFER_CREATIONFLAG_STORAGE flag will be automatically added
      * @returns the new buffer
      */
    def createStorageBuffer(data: DataArray, creationFlags: Double): DataBuffer = js.native
    
    /**
      * Usually called from Texture.ts.
      * Passed information to create a WebGLTexture
      * @param url defines a value which contains one of the following:
      * * A conventional http URL, e.g. 'http://...' or 'file://...'
      * * A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
      * * An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file
      * @param invertY when true, image is flipped when loaded.  You probably want true. Certain compressed textures may invert this if their default is inverted (eg. ktx)
      * @param scene needed for loading to the correct scene
      * @param samplingMode mode with should be used sample / access the texture (Default: Texture.TRILINEAR_SAMPLINGMODE)
      * @param onLoad optional callback to be called upon successful completion
      * @param onError optional callback to be called upon failure
      * @param buffer a source of a file previously fetched as either a base64 string, an ArrayBuffer (compressed or image format), HTMLImageElement (image format), or a Blob
      * @param fallback an internal argument in case the function must be called again, due to etc1 not having alpha capabilities
      * @param format internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param mimeType defines an optional mime type
      * @param loaderOptions options to be passed to the loader
      * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
      * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
      * @returns a InternalTexture for assignment back into BABYLON.Texture
      */
    def createTexture(
      url: Nullable[String],
      noMipmap: Boolean,
      invertY: Boolean,
      scene: Nullable[ISceneLike],
      samplingMode: js.UndefOr[Double],
      onLoad: js.UndefOr[Nullable[js.Function1[/* texture */ InternalTexture, Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[/* message */ String, /* exception */ Any, Unit]]],
      buffer: js.UndefOr[
          Nullable[
            String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob | ImageBitmap
          ]
        ],
      fallback: js.UndefOr[Nullable[InternalTexture]],
      format: js.UndefOr[Nullable[Double]],
      forcedExtension: js.UndefOr[Nullable[String]],
      mimeType: js.UndefOr[String],
      loaderOptions: js.UndefOr[Any],
      creationFlags: js.UndefOr[Double],
      useSRGBBuffer: js.UndefOr[Boolean]
    ): InternalTexture = js.native
    
    /**
      * Create an uniform buffer
      * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param elements defines the content of the uniform buffer
      * @returns the webGL uniform buffer
      */
    def createUniformBuffer(elements: FloatArray): DataBuffer = js.native
    
    /**
      * Creates a vertex buffer
      * @param data the data for the vertex buffer
      * @returns the new WebGL static buffer
      */
    def createVertexBuffer(data: DataArray): DataBuffer = js.native
    
    /**
      * Gets or sets a boolean indicating if back faces must be culled. If false, front faces are culled instead (true by default)
      * If non null, this takes precedence over the value from the material
      */
    var cullBackFaces: Nullable[Boolean] = js.native
    
    /**
      * Gets the current viewport
      */
    def currentViewport: Nullable[IViewportLike] = js.native
    
    /**
      * Gets the depth culling state manager
      */
    def depthCullingState: DepthCullingState = js.native
    
    /**
      * Returns a string describing the current engine
      */
    def description: String = js.native
    
    /**
      * Disable the attribute corresponding to the location in parameter
      * @param attributeLocation defines the attribute location of the attribute to disable
      */
    def disableAttributeByIndex(attributeLocation: Double): Unit = js.native
    
    /**
      * Disable the instance attribute corresponding to the location in parameter
      * @param attributeLocation defines the attribute location of the attribute to disable
      */
    def disableInstanceAttribute(attributeLocation: Double): Unit = js.native
    
    /**
      * Disable the instance attribute corresponding to the name in parameter
      * @param name defines the name of the attribute to disable
      */
    def disableInstanceAttributeByName(name: String): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating that uniform buffers must be disabled even if they are supported
      */
    var disableUniformBuffers: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating that vertex array object must be disabled even if they are supported
      */
    var disableVertexArrayObjects: Boolean = js.native
    
    /**
      * Dispose and release all associated resources
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if resources should be retained to be able to handle context lost events
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene#handling-webgl-context-lost
      */
    def doNotHandleContextLost: Boolean = js.native
    def doNotHandleContextLost_=(value: Boolean): Unit = js.native
    
    /**
      * Send a draw order
      * @param useTriangles defines if triangles must be used to draw (else wireframe will be used)
      * @param indexStart defines the starting index
      * @param indexCount defines the number of index to draw
      * @param instancesCount defines the number of instances to draw (if instantiation is enabled)
      */
    def draw(useTriangles: Boolean, indexStart: Double, indexCount: Double): Unit = js.native
    def draw(useTriangles: Boolean, indexStart: Double, indexCount: Double, instancesCount: Double): Unit = js.native
    
    /**
      * Draw a list of unindexed primitives
      * @param fillMode defines the primitive to use
      * @param verticesStart defines the index of first vertex to draw
      * @param verticesCount defines the count of vertices to draw
      * @param instancesCount defines the number of instances to draw (if instantiation is enabled)
      */
    def drawArraysType(fillMode: Double, verticesStart: Double, verticesCount: Double): Unit = js.native
    def drawArraysType(fillMode: Double, verticesStart: Double, verticesCount: Double, instancesCount: Double): Unit = js.native
    
    /**
      * Draw a list of indexed primitives
      * @param fillMode defines the primitive to use
      * @param indexStart defines the starting index
      * @param indexCount defines the number of index to draw
      * @param instancesCount defines the number of instances to draw (if instantiation is enabled)
      */
    def drawElementsType(fillMode: Double, indexStart: Double, indexCount: Double): Unit = js.native
    def drawElementsType(fillMode: Double, indexStart: Double, indexCount: Double, instancesCount: Double): Unit = js.native
    
    /**
      * Draw a list of points
      * @param verticesStart defines the index of first vertex to draw
      * @param verticesCount defines the count of vertices to draw
      * @param instancesCount defines the number of instances to draw (if instantiation is enabled)
      */
    def drawPointClouds(verticesStart: Double, verticesCount: Double): Unit = js.native
    def drawPointClouds(verticesStart: Double, verticesCount: Double, instancesCount: Double): Unit = js.native
    
    /**
      * Draw a list of unindexed primitives
      * @param useTriangles defines if triangles must be used to draw (else wireframe will be used)
      * @param verticesStart defines the index of first vertex to draw
      * @param verticesCount defines the count of vertices to draw
      * @param instancesCount defines the number of instances to draw (if instantiation is enabled)
      */
    def drawUnIndexed(useTriangles: Boolean, verticesStart: Double, verticesCount: Double): Unit = js.native
    def drawUnIndexed(useTriangles: Boolean, verticesStart: Double, verticesCount: Double, instancesCount: Double): Unit = js.native
    
    /**
      * Gets the default empty cube texture
      */
    def emptyCubeTexture: InternalTexture = js.native
    
    /**
      * Gets the default empty texture
      */
    def emptyTexture: InternalTexture = js.native
    
    /**
      * Gets the default empty 2D array texture
      */
    def emptyTexture2DArray: InternalTexture = js.native
    
    /**
      * Gets the default empty 3D texture
      */
    def emptyTexture3D: InternalTexture = js.native
    
    /**
      * Activates an effect, making it the current one (ie. the one used for rendering)
      * @param effect defines the effect to activate
      */
    def enableEffect(effect: Nullable[Effect | DrawWrapper]): Unit = js.native
    
    /**
      * In case you are sharing the context with other applications, it might
      * be interested to not cache the unpack flip y state to ensure a consistent
      * value would be set.
      */
    var enableUnpackFlipYCached: Boolean = js.native
    
    /**
      * Enf the current frame
      */
    def endFrame(): Unit = js.native
    
    /**
      * Force a webGL flush (ie. a flush of all waiting webGL commands)
      */
    def flushFramebuffer(): Unit = js.native
    
    /**
      * Gets or sets a boolean that indicates if textures must be forced to power of 2 size even if not required
      */
    var forcePOTTextures: Boolean = js.native
    
    /**
      * Gets the current frame id
      */
    def frameId: Double = js.native
    
    /**
      * sets the object from which width and height will be taken from when getting render width and height
      * Will fallback to the gl object
      * @param dimensions the framebuffer width and height that will be used.
      */
    def framebufferDimensionsObject_=(dimensions: Nullable[FramebufferHeight]): Unit = js.native
    
    /**
      * Generates the mipmaps for a texture
      * @param texture texture to generate the mipmaps for
      */
    def generateMipmaps(texture: InternalTexture): Unit = js.native
    
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
      * Gets the list of active attributes for a given webGL program
      * @param pipelineContext defines the pipeline context to use
      * @param attributesNames defines the list of attribute names to get
      * @returns an array of indices indicating the offset of each attribute
      */
    def getAttributes(pipelineContext: IPipelineContext, attributesNames: js.Array[String]): js.Array[Double] = js.native
    
    /**
      * Gets the audio context specified in engine initialization options
      * @returns an Audio Context
      */
    def getAudioContext(): Nullable[AudioContext] = js.native
    
    /**
      * Gets the audio destination specified in engine initialization options
      * @returns an audio destination node
      */
    def getAudioDestination(): Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode] = js.native
    
    /**
      * Gets the object containing all engine capabilities
      * @returns the EngineCapabilities object
      */
    def getCaps(): EngineCapabilities = js.native
    
    /**
      * Gets a string identifying the name of the class
      * @returns "Engine" string
      */
    def getClassName(): String = js.native
    
    /**
      * Gets a boolean indicating if color writing is enabled
      * @returns the current color writing state
      */
    def getColorWrite(): Boolean = js.native
    
    /**
      * Gets the options used for engine creation
      * @returns EngineOptions object
      */
    def getCreationOptions(): EngineOptions = js.native
    
    /**
      * Gets a boolean indicating if depth testing is enabled
      * @returns the current state
      */
    def getDepthBuffer(): Boolean = js.native
    
    /**
      * Get the current error code of the webGL context
      * @returns the error code
      * @see https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getError
      */
    def getError(): Double = js.native
    
    /**
      * Gets an object containing information about the current webGL context
      * @returns an object containing the vendor, the renderer and the version of the current webGL context
      */
    def getGlInfo(): Renderer = js.native
    
    /**
      * Gets the current hardware scaling level.
      * By default the hardware scaling level is computed from the window device ratio.
      * if level = 1 then the engine will render at the exact resolution of the canvas. If level = 0.5 then the engine will render at twice the size of the canvas.
      * @returns a number indicating the current hardware scaling level
      */
    def getHardwareScalingLevel(): Double = js.native
    
    /**
      * Gets host document
      * @returns the host document object
      */
    def getHostDocument(): Nullable[Document] = js.native
    
    /**
      * Gets host window
      * @returns the host window object
      */
    def getHostWindow(): Nullable[Window] = js.native
    
    /**
      * Gets an object containing information about the current engine context
      * @returns an object containing the vendor, the renderer and the version of the current engine context
      */
    def getInfo(): Renderer = js.native
    
    /**
      * Gets the list of loaded textures
      * @returns an array containing all loaded textures
      */
    def getLoadedTexturesCache(): js.Array[InternalTexture] = js.native
    
    /**
      * Gets the current render height
      * @param useScreen defines if screen size must be used (or the current render target if any)
      * @returns a number defining the current render height
      */
    def getRenderHeight(): Double = js.native
    def getRenderHeight(useScreen: Boolean): Double = js.native
    
    /**
      * Gets the current render width
      * @param useScreen defines if screen size must be used (or the current render target if any)
      * @returns a number defining the current render width
      */
    def getRenderWidth(): Double = js.native
    def getRenderWidth(useScreen: Boolean): Double = js.native
    
    /**
      * Gets the HTML canvas attached with the current webGL context
      * @returns a HTML canvas
      */
    def getRenderingCanvas(): Nullable[HTMLCanvasElement] = js.native
    
    /**
      * Gets the list of webGL uniform locations associated with a specific program based on a list of uniform names
      * @param pipelineContext defines the pipeline context to use
      * @param uniformsNames defines the list of uniform names
      * @returns an array of webGL uniform locations
      */
    def getUniforms(pipelineContext: IPipelineContext, uniformsNames: js.Array[String]): js.Array[Nullable[WebGLUniformLocation]] = js.native
    
    /**
      * Gets the current value of the zOffset Factor
      * @returns the current zOffset Factor state
      */
    def getZOffset(): Double = js.native
    
    /**
      * Gets the current value of the zOffset Units
      * @returns the current zOffset Units state
      */
    def getZOffsetUnits(): Double = js.native
    
    /**
      * Indicates that the origin of the texture/framebuffer space is the bottom left corner. If false, the origin is top left
      */
    val hasOriginBottomLeft: Boolean = js.native
    
    /**
      * Gets information about the current host
      */
    var hostInformation: HostInformation = js.native
    
    /**
      * Inline functions in shader code that are marked to be inlined
      * @param code code to inline
      * @returns inlined code
      */
    def inlineShaderCode(code: String): String = js.native
    
    /**
      * Gets a boolean indicating if the engine is currently rendering in fullscreen mode
      */
    var isFullscreen: Boolean = js.native
    
    /**
      * Indicates if the z range in NDC space is 0..1 (value: true) or -1..1 (value: false)
      */
    val isNDCHalfZRange: Boolean = js.native
    
    /**
      * Returns true if the stencil buffer has been enabled through the creation option of the context.
      */
    def isStencilEnable: Boolean = js.native
    
    /**
      * Gets a boolean indicating if the engine runs in WebGPU or not.
      */
    def isWebGPU: Boolean = js.native
    
    /**
      * Gets or sets the name of the engine
      */
    def name: String = js.native
    def name_=(value: String): Unit = js.native
    
    /**
      * Gets a boolean indicating that only power of 2 textures are supported
      * Please note that you can still use non power of 2 textures but in this case the engine will forcefully convert them
      */
    def needPOTTextures: Boolean = js.native
    
    /**
      * Observable event triggered before each texture is initialized
      */
    var onBeforeTextureInitObservable: Observable[Texture] = js.native
    
    /**
      * Observable signaled when a context lost event is raised
      */
    var onContextLostObservable: Observable[ThinEngine] = js.native
    
    /**
      * Observable signaled when a context restored event is raised
      */
    var onContextRestoredObservable: Observable[ThinEngine] = js.native
    
    /**
      * An event triggered when the engine is disposed.
      */
    val onDisposeObservable: Observable[ThinEngine] = js.native
    
    /**
      * Defines whether the engine has been created with the premultipliedAlpha option on or not.
      */
    var premultipliedAlpha: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating that cache can be kept between frames
      */
    var preventCacheWipeBetweenFrames: Boolean = js.native
    
    /**
      * Read data from a storage buffer
      * @param storageBuffer The storage buffer to read from
      * @param offset The offset in the storage buffer to start reading from (default: 0)
      * @param size  The number of bytes to read from the storage buffer (default: capacity of the buffer)
      * @param buffer The buffer to write the data we have read from the storage buffer to (optional)
      * @returns If not undefined, returns the (promise) buffer (as provided by the 4th parameter) filled with the data, else it returns a (promise) Uint8Array with the data read from the storage buffer
      */
    def readFromStorageBuffer(storageBuffer: DataBuffer): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double, size: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double, size: Double, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double, size: Unit, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Unit, size: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Unit, size: Double, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Unit, size: Unit, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
    
    /**
      * Reads pixels from the current frame buffer. Please note that this function can be slow
      * @param x defines the x coordinate of the rectangle where pixels must be read
      * @param y defines the y coordinate of the rectangle where pixels must be read
      * @param width defines the width of the rectangle where pixels must be read
      * @param height defines the height of the rectangle where pixels must be read
      * @param hasAlpha defines whether the output should have alpha or not (defaults to true)
      * @param flushRenderer true to flush the renderer from the pending commands before reading the pixels
      * @returns a ArrayBufferView promise (Uint8Array) containing RGBA colors
      */
    def readPixels(x: Double, y: Double, width: Double, height: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(x: Double, y: Double, width: Double, height: Double, hasAlpha: Boolean): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(x: Double, y: Double, width: Double, height: Double, hasAlpha: Boolean, flushRenderer: Boolean): js.Promise[js.typedarray.ArrayBufferView] = js.native
    def readPixels(x: Double, y: Double, width: Double, height: Double, hasAlpha: Unit, flushRenderer: Boolean): js.Promise[js.typedarray.ArrayBufferView] = js.native
    
    /**
      * Records a vertex array object
      * @see https://doc.babylonjs.com/features/webgl2#vertex-array-objects
      * @param vertexBuffers defines the list of vertex buffers to store
      * @param indexBuffer defines the index buffer to store
      * @param effect defines the effect to store
      * @param overrideVertexBuffers defines optional list of avertex buffers that overrides the entries in vertexBuffers
      * @returns the new vertex array object
      */
    def recordVertexArrayObject(vertexBuffers: StringDictionary[VertexBuffer], indexBuffer: Nullable[DataBuffer], effect: Effect): WebGLVertexArrayObject = js.native
    def recordVertexArrayObject(
      vertexBuffers: StringDictionary[VertexBuffer],
      indexBuffer: Nullable[DataBuffer],
      effect: Effect,
      overrideVertexBuffers: StringDictionary[Nullable[VertexBuffer]]
    ): WebGLVertexArrayObject = js.native
    
    /**
      * Forces the engine to release all cached compute effects. This means that next effect compilation will have to be done completely even if a similar effect was already compiled
      */
    def releaseComputeEffects(): Unit = js.native
    
    /**
      * Force the engine to release all cached effects. This means that next effect compilation will have to be done completely even if a similar effect was already compiled
      */
    def releaseEffects(): Unit = js.native
    
    /**
      * Release and free the memory of a vertex array object
      * @param vao defines the vertex array object to delete
      */
    def releaseVertexArrayObject(vao: WebGLVertexArrayObject): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if the engine must keep rendering even if the window is not in foreground
      */
    var renderEvenInBackground: Boolean = js.native
    
    /**
      * Reset the texture cache to empty state
      */
    def resetTextureCache(): Unit = js.native
    
    /**
      * Resize the view according to the canvas' size
      * @param forceSetSize true to force setting the sizes of the underlying canvas
      */
    def resize(): Unit = js.native
    def resize(forceSetSize: Boolean): Unit = js.native
    
    /**
      * Unbind the current render target and bind the default framebuffer
      */
    def restoreDefaultFramebuffer(): Unit = js.native
    
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
      * Register and execute a render loop. The engine can have more than one render function
      * @param renderFunction defines the function to continuously execute
      */
    def runRenderLoop(renderFunction: js.Function0[Unit]): Unit = js.native
    
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
      * Set the value of an uniform to an array of number
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of number to store
      * @returns true if the value was set
      */
    def setArray(uniform: Nullable[WebGLUniformLocation], array: js.Array[Double]): Boolean = js.native
    def setArray(uniform: Nullable[WebGLUniformLocation], array: js.typedarray.Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of number (stored as vec2)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of number to store
      * @returns true if the value was set
      */
    def setArray2(uniform: Nullable[WebGLUniformLocation], array: js.Array[Double]): Boolean = js.native
    def setArray2(uniform: Nullable[WebGLUniformLocation], array: js.typedarray.Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of number (stored as vec3)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of number to store
      * @returns true if the value was set
      */
    def setArray3(uniform: Nullable[WebGLUniformLocation], array: js.Array[Double]): Boolean = js.native
    def setArray3(uniform: Nullable[WebGLUniformLocation], array: js.typedarray.Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of number (stored as vec4)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of number to store
      * @returns true if the value was set
      */
    def setArray4(uniform: Nullable[WebGLUniformLocation], array: js.Array[Double]): Boolean = js.native
    def setArray4(uniform: Nullable[WebGLUniformLocation], array: js.typedarray.Float32Array): Boolean = js.native
    
    /**
      * Enable or disable color writing
      * @param enable defines the state to set
      */
    def setColorWrite(enable: Boolean): Unit = js.native
    
    /**
      * Enable or disable depth buffering
      * @param enable defines the state to set
      */
    def setDepthBuffer(enable: Boolean): Unit = js.native
    
    /**
      * Sets an internal texture to the according uniform.
      * @param name The name of the uniform in the effect
      * @param texture The texture to apply
      */
    def setExternalTexture(name: String, texture: Nullable[ExternalTexture]): Unit = js.native
    
    /**
      * Set the value of an uniform to a number (float)
      * @param uniform defines the webGL uniform location where to store the value
      * @param value defines the float number to store
      * @returns true if the value was transferred
      */
    def setFloat(uniform: Nullable[WebGLUniformLocation], value: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to a vec2
      * @param uniform defines the webGL uniform location where to store the value
      * @param x defines the 1st component of the value
      * @param y defines the 2nd component of the value
      * @returns true if the value was set
      */
    def setFloat2(uniform: Nullable[WebGLUniformLocation], x: Double, y: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to a vec3
      * @param uniform defines the webGL uniform location where to store the value
      * @param x defines the 1st component of the value
      * @param y defines the 2nd component of the value
      * @param z defines the 3rd component of the value
      * @returns true if the value was set
      */
    def setFloat3(uniform: Nullable[WebGLUniformLocation], x: Double, y: Double, z: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to a vec4
      * @param uniform defines the webGL uniform location where to store the value
      * @param x defines the 1st component of the value
      * @param y defines the 2nd component of the value
      * @param z defines the 3rd component of the value
      * @param w defines the 4th component of the value
      * @returns true if the value was set
      */
    def setFloat4(uniform: Nullable[WebGLUniformLocation], x: Double, y: Double, z: Double, w: Double): Boolean = js.native
    
    /**
      * Defines the hardware scaling level.
      * By default the hardware scaling level is computed from the window device ratio.
      * if level = 1 then the engine will render at the exact resolution of the canvas. If level = 0.5 then the engine will render at twice the size of the canvas.
      * @param level defines the level to use
      */
    def setHardwareScalingLevel(level: Double): Unit = js.native
    
    /**
      * Set the value of an uniform to a number (int)
      * @param uniform defines the webGL uniform location where to store the value
      * @param value defines the int number to store
      * @returns true if the value was set
      */
    def setInt(uniform: Nullable[WebGLUniformLocation], value: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to a int2
      * @param uniform defines the webGL uniform location where to store the value
      * @param x defines the 1st component of the value
      * @param y defines the 2nd component of the value
      * @returns true if the value was set
      */
    def setInt2(uniform: Nullable[WebGLUniformLocation], x: Double, y: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to a int3
      * @param uniform defines the webGL uniform location where to store the value
      * @param x defines the 1st component of the value
      * @param y defines the 2nd component of the value
      * @param z defines the 3rd component of the value
      * @returns true if the value was set
      */
    def setInt3(uniform: Nullable[WebGLUniformLocation], x: Double, y: Double, z: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to a int4
      * @param uniform defines the webGL uniform location where to store the value
      * @param x defines the 1st component of the value
      * @param y defines the 2nd component of the value
      * @param z defines the 3rd component of the value
      * @param w defines the 4th component of the value
      * @returns true if the value was set
      */
    def setInt4(uniform: Nullable[WebGLUniformLocation], x: Double, y: Double, z: Double, w: Double): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of int32
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of int32 to store
      * @returns true if the value was set
      */
    def setIntArray(uniform: Nullable[WebGLUniformLocation], array: js.typedarray.Int32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of int32 (stored as vec2)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of int32 to store
      * @returns true if the value was set
      */
    def setIntArray2(uniform: Nullable[WebGLUniformLocation], array: js.typedarray.Int32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of int32 (stored as vec3)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of int32 to store
      * @returns true if the value was set
      */
    def setIntArray3(uniform: Nullable[WebGLUniformLocation], array: js.typedarray.Int32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of int32 (stored as vec4)
      * @param uniform defines the webGL uniform location where to store the value
      * @param array defines the array of int32 to store
      * @returns true if the value was set
      */
    def setIntArray4(uniform: Nullable[WebGLUniformLocation], array: js.typedarray.Int32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to an array of float32 (stored as matrices)
      * @param uniform defines the webGL uniform location where to store the value
      * @param matrices defines the array of float32 to store
      * @returns true if the value was set
      */
    def setMatrices(uniform: Nullable[WebGLUniformLocation], matrices: js.typedarray.Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to a matrix (2x2)
      * @param uniform defines the webGL uniform location where to store the value
      * @param matrix defines the Float32Array representing the 2x2 matrix to store
      * @returns true if the value was set
      */
    def setMatrix2x2(uniform: Nullable[WebGLUniformLocation], matrix: js.typedarray.Float32Array): Boolean = js.native
    
    /**
      * Set the value of an uniform to a matrix (3x3)
      * @param uniform defines the webGL uniform location where to store the value
      * @param matrix defines the Float32Array representing the 3x3 matrix to store
      * @returns true if the value was set
      */
    def setMatrix3x3(uniform: Nullable[WebGLUniformLocation], matrix: js.typedarray.Float32Array): Boolean = js.native
    
    /**
      * Force a specific size of the canvas
      * @param width defines the new canvas' width
      * @param height defines the new canvas' height
      * @param forceSetSize true to force setting the sizes of the underlying canvas
      * @returns true if the size was changed
      */
    def setSize(width: Double, height: Double): Boolean = js.native
    def setSize(width: Double, height: Double, forceSetSize: Boolean): Boolean = js.native
    
    /**
      * Set various states to the webGL context
      * @param culling defines culling state: true to enable culling, false to disable it
      * @param zOffset defines the value to apply to zOffset (0 by default)
      * @param force defines if states must be applied even if cache is up to date
      * @param reverseSide defines if culling must be reversed (CCW if false, CW if true)
      * @param cullBackFaces true to cull back faces, false to cull front faces (if culling is enabled)
      * @param stencil stencil states to set
      * @param zOffsetUnits defines the value to apply to zOffsetUnits (0 by default)
      */
    def setState(
      culling: Boolean,
      zOffset: js.UndefOr[Double],
      force: js.UndefOr[Boolean],
      reverseSide: js.UndefOr[Boolean],
      cullBackFaces: js.UndefOr[Boolean],
      stencil: js.UndefOr[IStencilState],
      zOffsetUnits: js.UndefOr[Double]
    ): Unit = js.native
    
    /**
      * Sets a storage buffer in the shader
      * @param name Defines the name of the storage buffer as defined in the shader
      * @param buffer Defines the value to give to the uniform
      */
    def setStorageBuffer(name: String, buffer: Nullable[StorageBuffer]): Unit = js.native
    
    /**
      * Sets a texture to the according uniform.
      * @param channel The texture channel
      * @param uniform The uniform to set
      * @param texture The texture to apply
      * @param name The name of the uniform in the effect
      */
    def setTexture(
      channel: Double,
      uniform: Nullable[WebGLUniformLocation],
      texture: Nullable[ThinTexture],
      name: String
    ): Unit = js.native
    
    /**
      * Sets an array of texture to the webGL context
      * @param channel defines the channel where the texture array must be set
      * @param uniform defines the associated uniform location
      * @param textures defines the array of textures to bind
      * @param name name of the channel
      */
    def setTextureArray(
      channel: Double,
      uniform: Nullable[WebGLUniformLocation],
      textures: js.Array[ThinTexture],
      name: String
    ): Unit = js.native
    
    /**
      * Sets a texture sampler to the according uniform.
      * @param name The name of the uniform in the effect
      * @param sampler The sampler to apply
      */
    def setTextureSampler(name: String, sampler: Nullable[TextureSampler]): Unit = js.native
    
    /**
      * Set the WebGL's viewport
      * @param viewport defines the viewport element to be used
      * @param requiredWidth defines the width required for rendering. If not provided the rendering canvas' width is used
      * @param requiredHeight defines the height required for rendering. If not provided the rendering canvas' height is used
      */
    def setViewport(viewport: IViewportLike): Unit = js.native
    def setViewport(viewport: IViewportLike, requiredWidth: Double): Unit = js.native
    def setViewport(viewport: IViewportLike, requiredWidth: Double, requiredHeight: Double): Unit = js.native
    def setViewport(viewport: IViewportLike, requiredWidth: Unit, requiredHeight: Double): Unit = js.native
    
    /**
      * Set the z offset Factor to apply to current rendering
      * @param value defines the offset to apply
      */
    def setZOffset(value: Double): Unit = js.native
    
    /**
      * Set the z offset Units to apply to current rendering
      * @param value defines the offset to apply
      */
    def setZOffsetUnits(value: Double): Unit = js.native
    
    /**
      * Gets the shader platform name used by the effects.
      */
    def shaderPlatformName: String = js.native
    
    /**
      * Enables or disables the snapshot rendering mode
      * Note that the WebGL engine does not support snapshot rendering so setting the value won't have any effect for this engine
      */
    def snapshotRendering: Boolean = js.native
    
    /**
      * Gets or sets the snapshot rendering mode
      */
    def snapshotRenderingMode: Double = js.native
    def snapshotRenderingMode_=(mode: Double): Unit = js.native
    
    /**
      * Creates a new snapshot at the next frame using the current snapshotRenderingMode
      */
    def snapshotRenderingReset(): Unit = js.native
    
    def snapshotRendering_=(activate: Boolean): Unit = js.native
    
    /**
      * Gets the stencil state manager
      */
    def stencilState: StencilState = js.native
    
    /**
      * Gets the stencil state composer
      */
    def stencilStateComposer: StencilStateComposer = js.native
    
    /**
      * stop executing a render loop function and remove it from the execution array
      * @param renderFunction defines the function to be removed. If not provided all functions will be removed.
      */
    def stopRenderLoop(): Unit = js.native
    def stopRenderLoop(renderFunction: js.Function0[Unit]): Unit = js.native
    
    /**
      * Gets a boolean indicating that the engine supports uniform buffers
      * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      */
    def supportsUniformBuffers: Boolean = js.native
    
    /**
      * Unbind the current render target texture from the webGL context
      * @param texture defines the render target wrapper to unbind
      * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
      * @param onBeforeUnbind defines a function which will be called before the effective unbind
      */
    def unBindFramebuffer(texture: RenderTargetWrapper): Unit = js.native
    def unBindFramebuffer(texture: RenderTargetWrapper, disableGenerateMipMaps: Boolean): Unit = js.native
    def unBindFramebuffer(texture: RenderTargetWrapper, disableGenerateMipMaps: Boolean, onBeforeUnbind: js.Function0[Unit]): Unit = js.native
    def unBindFramebuffer(texture: RenderTargetWrapper, disableGenerateMipMaps: Unit, onBeforeUnbind: js.Function0[Unit]): Unit = js.native
    
    /**
      * Unbind a list of render target textures from the webGL context
      * This is used only when drawBuffer extension or webGL2 are active
      * @param rtWrapper defines the render target wrapper to unbind
      * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
      * @param onBeforeUnbind defines a function which will be called before the effective unbind
      */
    def unBindMultiColorAttachmentFramebuffer(rtWrapper: RenderTargetWrapper, disableGenerateMipMaps: Boolean): Unit = js.native
    def unBindMultiColorAttachmentFramebuffer(
      rtWrapper: RenderTargetWrapper,
      disableGenerateMipMaps: Boolean,
      onBeforeUnbind: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Unbind all vertex attributes from the webGL context
      */
    def unbindAllAttributes(): Unit = js.native
    
    /**
      * Unbind all textures from the webGL context
      */
    def unbindAllTextures(): Unit = js.native
    
    /**
      * Unbind all instance attributes
      */
    def unbindInstanceAttributes(): Unit = js.native
    
    /**
      * Update the content of a webGL buffer used with instantiation and bind it to the webGL context
      * @param instancesBuffer defines the webGL buffer to update and bind
      * @param data defines the data to store in the buffer
      * @param offsetLocations defines the offsets or attributes information used to determine where data must be stored in the buffer
      */
    def updateAndBindInstancesBuffer(
      instancesBuffer: DataBuffer,
      data: js.typedarray.Float32Array,
      offsetLocations: js.Array[Double | InstancingAttributeInfo]
    ): Unit = js.native
    
    /**
      * update the bound buffer with the given data
      * @param data defines the data to update
      */
    def updateArrayBuffer(data: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Update a dynamic index buffer
      * @param indexBuffer defines the target index buffer
      * @param indices defines the data to update
      * @param offset defines the offset in the target index buffer where update should start
      */
    def updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: IndicesArray): Unit = js.native
    def updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: IndicesArray, offset: Double): Unit = js.native
    
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
      texture: Nullable[InternalTexture],
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
    def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray): Unit = js.native
    def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Double): Unit = js.native
    def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Double, byteLength: Double): Unit = js.native
    def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Unit, byteLength: Double): Unit = js.native
    
    /**
      * Update the sample count for a given multiple render target texture
      * @see https://doc.babylonjs.com/features/webgl2#multisample-render-targets
      * @param rtWrapper defines the render target wrapper to update
      * @param samples defines the sample count to set
      * @param initializeBuffers if set to true, the engine will make an initializing call of drawBuffers
      * @returns the effective sample count (could be 0 if multisample render targets are not supported)
      */
    def updateMultipleRenderTargetTextureSampleCount(rtWrapper: Nullable[RenderTargetWrapper], samples: Double): Double = js.native
    def updateMultipleRenderTargetTextureSampleCount(rtWrapper: Nullable[RenderTargetWrapper], samples: Double, initializeBuffers: Boolean): Double = js.native
    
    /**
      * Update a raw cube texture
      * @param texture defines the texture to update
      * @param data defines the data to store
      * @param format defines the data format
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateRawCubeTexture(
      texture: InternalTexture,
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
      texture: InternalTexture,
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
      texture: InternalTexture,
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
      texture: Nullable[InternalTexture],
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
      texture: Nullable[InternalTexture],
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
      texture: InternalTexture,
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
      texture: InternalTexture,
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
      texture: InternalTexture,
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
      texture: InternalTexture,
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
    def updateRenderTargetTextureSampleCount(rtWrapper: Nullable[RenderTargetWrapper], samples: Double): Double = js.native
    
    /**
      * Updates a storage buffer
      * @param buffer the storage buffer to update
      * @param data the data used to update the storage buffer
      * @param byteOffset the byte offset of the data
      * @param byteLength the byte length of the data
      */
    def updateStorageBuffer(buffer: DataBuffer, data: DataArray): Unit = js.native
    def updateStorageBuffer(buffer: DataBuffer, data: DataArray, byteOffset: Double): Unit = js.native
    def updateStorageBuffer(buffer: DataBuffer, data: DataArray, byteOffset: Double, byteLength: Double): Unit = js.native
    def updateStorageBuffer(buffer: DataBuffer, data: DataArray, byteOffset: Unit, byteLength: Double): Unit = js.native
    
    /**
      * Update a portion of an internal texture
      * @param texture defines the texture to update
      * @param imageData defines the data to store into the texture
      * @param xOffset defines the x coordinates of the update rectangle
      * @param yOffset defines the y coordinates of the update rectangle
      * @param width defines the width of the update rectangle
      * @param height defines the height of the update rectangle
      * @param faceIndex defines the face index if texture is a cube (0 by default)
      * @param lod defines the lod level to update (0 by default)
      * @param generateMipMaps defines whether to generate mipmaps or not
      */
    def updateTextureData(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      xOffset: Double,
      yOffset: Double,
      width: Double,
      height: Double
    ): Unit = js.native
    def updateTextureData(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      xOffset: Double,
      yOffset: Double,
      width: Double,
      height: Double,
      faceIndex: Double
    ): Unit = js.native
    def updateTextureData(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      xOffset: Double,
      yOffset: Double,
      width: Double,
      height: Double,
      faceIndex: Double,
      lod: Double
    ): Unit = js.native
    def updateTextureData(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      xOffset: Double,
      yOffset: Double,
      width: Double,
      height: Double,
      faceIndex: Double,
      lod: Double,
      generateMipMaps: Boolean
    ): Unit = js.native
    def updateTextureData(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      xOffset: Double,
      yOffset: Double,
      width: Double,
      height: Double,
      faceIndex: Double,
      lod: Unit,
      generateMipMaps: Boolean
    ): Unit = js.native
    def updateTextureData(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      xOffset: Double,
      yOffset: Double,
      width: Double,
      height: Double,
      faceIndex: Unit,
      lod: Double
    ): Unit = js.native
    def updateTextureData(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      xOffset: Double,
      yOffset: Double,
      width: Double,
      height: Double,
      faceIndex: Unit,
      lod: Double,
      generateMipMaps: Boolean
    ): Unit = js.native
    def updateTextureData(
      texture: InternalTexture,
      imageData: js.typedarray.ArrayBufferView,
      xOffset: Double,
      yOffset: Double,
      width: Double,
      height: Double,
      faceIndex: Unit,
      lod: Unit,
      generateMipMaps: Boolean
    ): Unit = js.native
    
    /**
      * Update the dimensions of a texture
      * @param texture texture to update
      * @param width new width of the texture
      * @param height new height of the texture
      * @param depth new depth of the texture
      */
    def updateTextureDimensions(texture: InternalTexture, width: Double, height: Double): Unit = js.native
    def updateTextureDimensions(texture: InternalTexture, width: Double, height: Double, depth: Double): Unit = js.native
    
    /**
      * Update the sampling mode of a given texture
      * @param samplingMode defines the required sampling mode
      * @param texture defines the texture to update
      * @param generateMipMaps defines whether to generate mipmaps for the texture
      */
    def updateTextureSamplingMode(samplingMode: Double, texture: InternalTexture): Unit = js.native
    def updateTextureSamplingMode(samplingMode: Double, texture: InternalTexture, generateMipMaps: Boolean): Unit = js.native
    
    /**
      * Update the sampling mode of a given texture
      * @param texture defines the texture to update
      * @param wrapU defines the texture wrap mode of the u coordinates
      * @param wrapV defines the texture wrap mode of the v coordinates
      * @param wrapR defines the texture wrap mode of the r coordinates
      */
    def updateTextureWrappingMode(texture: InternalTexture, wrapU: Nullable[Double]): Unit = js.native
    def updateTextureWrappingMode(texture: InternalTexture, wrapU: Nullable[Double], wrapV: Unit, wrapR: Nullable[Double]): Unit = js.native
    def updateTextureWrappingMode(texture: InternalTexture, wrapU: Nullable[Double], wrapV: Nullable[Double]): Unit = js.native
    def updateTextureWrappingMode(
      texture: InternalTexture,
      wrapU: Nullable[Double],
      wrapV: Nullable[Double],
      wrapR: Nullable[Double]
    ): Unit = js.native
    
    /**
      * Update an existing uniform buffer
      * @see https://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
      * @param uniformBuffer defines the target uniform buffer
      * @param elements defines the content to update
      * @param offset defines the offset in the uniform buffer where update should start
      * @param count defines the size of the data to update
      */
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray): Unit = js.native
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double): Unit = js.native
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double, count: Double): Unit = js.native
    def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Unit, count: Double): Unit = js.native
    
    /**
      * Update a video texture
      * @param texture defines the texture to update
      * @param video defines the video element to use
      * @param invertY defines if data must be stored with Y axis inverted
      */
    def updateVideoTexture(texture: Nullable[InternalTexture], video: HTMLVideoElement, invertY: Boolean): Unit = js.native
    
    /**
      * Gets a boolean indicating if the exact sRGB conversions or faster approximations are used for converting to and from linear space.
      */
    def useExactSrgbConversions: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if depth buffer should be reverse, going from far to near.
      * This can provide greater z depth for distant objects.
      */
    def useReverseDepthBuffer: Boolean = js.native
    def useReverseDepthBuffer_=(useReverse: Boolean): Unit = js.native
    
    /** Gets or sets a boolean indicating if the engine should validate programs after compilation */
    var validateShaderPrograms: Boolean = js.native
    
    /**
      * Returns the version of the engine
      */
    def version: Double = js.native
    
    /**
      * Gets version of the current webGL context
      * Keep it for back compat - use version instead
      */
    def webGLVersion: Double = js.native
    
    /**
      * Force the entire cache to be cleared
      * You should not have to use this function unless your engine needs to share the webGL context with another engine
      * @param bruteForce defines a boolean to force clearing ALL caches (including stencil, detoh and alpha states)
      */
    def wipeCaches(): Unit = js.native
    def wipeCaches(bruteForce: Boolean): Unit = js.native
  }
  /* static members */
  object ThinEngine {
    
    @JSImport("babylonjs/Engines/thinEngine", "ThinEngine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Find the next highest power of two.
      * @param x Number to start search from.
      * @returns Next highest power of two.
      */
    inline def CeilingPOT(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("CeilingPOT")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Gets or sets the epsilon value used by collision engine
      */
    @JSImport("babylonjs/Engines/thinEngine", "ThinEngine.CollisionsEpsilon")
    @js.native
    def CollisionsEpsilon: Double = js.native
    inline def CollisionsEpsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CollisionsEpsilon")(x.asInstanceOf[js.Any])
    
    /** Use this array to turn off some WebGL2 features on known buggy browsers version */
    @JSImport("babylonjs/Engines/thinEngine", "ThinEngine.ExceptionList")
    @js.native
    def ExceptionList: js.Array[Capture | CaptureConstraint] = js.native
    inline def ExceptionList_=(x: js.Array[Capture | CaptureConstraint]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExceptionList")(x.asInstanceOf[js.Any])
    
    /**
      * Find the next lowest power of two.
      * @param x Number to start search from.
      * @returns Next lowest power of two.
      */
    inline def FloorPOT(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("FloorPOT")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Get the closest exponent of two
      * @param value defines the value to approximate
      * @param max defines the maximum value to return
      * @param mode defines how to define the closest value
      * @returns closest exponent of two of the given value
      */
    inline def GetExponentOfTwo(value: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetExponentOfTwo")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def GetExponentOfTwo(value: Double, max: Double, mode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetExponentOfTwo")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the nearest power of two.
      * @param x Number to start search from.
      * @returns Next nearest power of two.
      */
    inline def NearestPOT(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("NearestPOT")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Queue a new function into the requested animation frame pool (ie. this function will be executed byt the browser for the next frame)
      * @param func - the function to be called
      * @param requester - the object that will request the next frame. Falls back to window.
      * @returns frame number
      */
    inline def QueueNewFrame(func: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("QueueNewFrame")(func.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def QueueNewFrame(func: js.Function0[Unit], requester: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("QueueNewFrame")(func.asInstanceOf[js.Any], requester.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def _ConcatenateShader(source: String, defines: Nullable[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_ConcatenateShader")(source.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def _ConcatenateShader(source: String, defines: Nullable[String], shaderVersion: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_ConcatenateShader")(source.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], shaderVersion.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("babylonjs/Engines/thinEngine", "ThinEngine._CreateCanvas")
    @js.native
    def _CreateCanvas: Any = js.native
    inline def _CreateCanvas_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCanvas")(x.asInstanceOf[js.Any])
    
    /**
      * Loads a file from a url
      * @param url url to load
      * @param onSuccess callback called when the file successfully loads
      * @param onProgress callback called while file is loading (if the server supports this mode)
      * @param offlineProvider defines the offline provider for caching
      * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
      * @param onError callback called when the file fails to load
      * @returns a file request object
      * @hidden
      */
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    
    /**
      * Loads an image as an HTMLImageElement.
      * @param input url string, ArrayBuffer, or Blob to load
      * @param onLoad callback called when the image successfully loads
      * @param onError callback called when the image fails to load
      * @param offlineProvider offline provider for caching
      * @param mimeType optional mime type
      * @param imageBitmapOptions optional the options to use when creating an ImageBitmap
      * @returns the HTMLImageElement of the loaded image
      * @hidden
      */
    inline def _FileToolsLoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: Unit,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: js.typedarray.ArrayBufferView,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: js.typedarray.ArrayBufferView,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: js.typedarray.ArrayBufferView,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: js.typedarray.ArrayBufferView,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: Unit,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: js.typedarray.ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: js.typedarray.ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: js.typedarray.ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: js.typedarray.ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: Unit,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def _FileToolsLoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: Unit,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("_FileToolsLoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    
    @JSImport("babylonjs/Engines/thinEngine", "ThinEngine._HasMajorPerformanceCaveat")
    @js.native
    def _HasMajorPerformanceCaveat: Any = js.native
    inline def _HasMajorPerformanceCaveat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_HasMajorPerformanceCaveat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/thinEngine", "ThinEngine._IsSupported")
    @js.native
    def _IsSupported: Any = js.native
    inline def _IsSupported_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsSupported")(x.asInstanceOf[js.Any])
    
    /** @hidden */
    @JSImport("babylonjs/Engines/thinEngine", "ThinEngine._TextureLoaders")
    @js.native
    def _TextureLoaders: js.Array[IInternalTextureLoader] = js.native
    inline def _TextureLoaders_=(x: js.Array[IInternalTextureLoader]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureLoaders")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a boolean indicating if the engine can be instantiated (ie. if a webGL context can be found)
      * @returns true if the engine can be created
      * @ignorenaming
      */
    inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  }
  
  trait EngineOptions
    extends StObject
       with WebGLContextAttributes {
    
    /**
      * Defines whether to adapt to the device's viewport characteristics (default: false)
      */
    var adaptToDeviceRatio: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines if webaudio should be initialized as well
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
      */
    var audioEngine: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies options for the audio engine
      */
    var audioEngineOptions: js.UndefOr[IAudioEngineOptions] = js.undefined
    
    /**
      * Defines if webvr should be enabled automatically
      * @see https://doc.babylonjs.com/how_to/webvr_camera
      */
    var autoEnableWebVR: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines if animations should run using a deterministic lock step
      * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
      */
    var deterministicLockstep: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines if webgl2 should be turned off even if supported
      * @see https://doc.babylonjs.com/features/webgl2
      */
    var disableWebGL2Support: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines that engine should ignore context lost events
      * If this event happens when this parameter is true, you will have to reload the page to restore rendering
      */
    var doNotHandleContextLost: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines that engine should ignore modifying touch action attribute and style
      * If not handle, you might need to set it up on your side for expected touch devices behavior.
      */
    var doNotHandleTouchAction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If sRGB Buffer support is not set during construction, use this value to force a specific state
      * This is added due to an issue when processing textures in chrome/edge/firefox
      * This will not influence NativeEngine and WebGPUEngine which set the behavior to true during construction.
      */
    var forceSRGBBufferSupportState: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines if the engine should no exceed a specified device ratio
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio
      */
    var limitDeviceRatio: js.UndefOr[Double] = js.undefined
    
    /** Defines the maximum steps to use with deterministic lock step mode */
    var lockstepMaxSteps: js.UndefOr[Double] = js.undefined
    
    /** Defines the seconds between each deterministic lock step */
    var timeStep: js.UndefOr[Double] = js.undefined
    
    /**
      * True if the more expensive but exact conversions should be used for transforming colors to and from linear space within shaders.
      * Otherwise, the default is to use a cheaper approximation.
      */
    var useExactSrgbConversions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines that engine should compile shaders with high precision floats (if supported). True by default
      */
    var useHighPrecisionFloats: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Make the matrix computations to be performed in 64 bits instead of 32 bits. False by default
      */
    var useHighPrecisionMatrix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Make the canvas XR Compatible for XR sessions
      */
    var xrCompatible: js.UndefOr[Boolean] = js.undefined
  }
  object EngineOptions {
    
    inline def apply(): EngineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EngineOptions]
    }
    
    extension [Self <: EngineOptions](x: Self) {
      
      inline def setAdaptToDeviceRatio(value: Boolean): Self = StObject.set(x, "adaptToDeviceRatio", value.asInstanceOf[js.Any])
      
      inline def setAdaptToDeviceRatioUndefined: Self = StObject.set(x, "adaptToDeviceRatio", js.undefined)
      
      inline def setAudioEngine(value: Boolean): Self = StObject.set(x, "audioEngine", value.asInstanceOf[js.Any])
      
      inline def setAudioEngineOptions(value: IAudioEngineOptions): Self = StObject.set(x, "audioEngineOptions", value.asInstanceOf[js.Any])
      
      inline def setAudioEngineOptionsUndefined: Self = StObject.set(x, "audioEngineOptions", js.undefined)
      
      inline def setAudioEngineUndefined: Self = StObject.set(x, "audioEngine", js.undefined)
      
      inline def setAutoEnableWebVR(value: Boolean): Self = StObject.set(x, "autoEnableWebVR", value.asInstanceOf[js.Any])
      
      inline def setAutoEnableWebVRUndefined: Self = StObject.set(x, "autoEnableWebVR", js.undefined)
      
      inline def setDeterministicLockstep(value: Boolean): Self = StObject.set(x, "deterministicLockstep", value.asInstanceOf[js.Any])
      
      inline def setDeterministicLockstepUndefined: Self = StObject.set(x, "deterministicLockstep", js.undefined)
      
      inline def setDisableWebGL2Support(value: Boolean): Self = StObject.set(x, "disableWebGL2Support", value.asInstanceOf[js.Any])
      
      inline def setDisableWebGL2SupportUndefined: Self = StObject.set(x, "disableWebGL2Support", js.undefined)
      
      inline def setDoNotHandleContextLost(value: Boolean): Self = StObject.set(x, "doNotHandleContextLost", value.asInstanceOf[js.Any])
      
      inline def setDoNotHandleContextLostUndefined: Self = StObject.set(x, "doNotHandleContextLost", js.undefined)
      
      inline def setDoNotHandleTouchAction(value: Boolean): Self = StObject.set(x, "doNotHandleTouchAction", value.asInstanceOf[js.Any])
      
      inline def setDoNotHandleTouchActionUndefined: Self = StObject.set(x, "doNotHandleTouchAction", js.undefined)
      
      inline def setForceSRGBBufferSupportState(value: Boolean): Self = StObject.set(x, "forceSRGBBufferSupportState", value.asInstanceOf[js.Any])
      
      inline def setForceSRGBBufferSupportStateUndefined: Self = StObject.set(x, "forceSRGBBufferSupportState", js.undefined)
      
      inline def setLimitDeviceRatio(value: Double): Self = StObject.set(x, "limitDeviceRatio", value.asInstanceOf[js.Any])
      
      inline def setLimitDeviceRatioUndefined: Self = StObject.set(x, "limitDeviceRatio", js.undefined)
      
      inline def setLockstepMaxSteps(value: Double): Self = StObject.set(x, "lockstepMaxSteps", value.asInstanceOf[js.Any])
      
      inline def setLockstepMaxStepsUndefined: Self = StObject.set(x, "lockstepMaxSteps", js.undefined)
      
      inline def setTimeStep(value: Double): Self = StObject.set(x, "timeStep", value.asInstanceOf[js.Any])
      
      inline def setTimeStepUndefined: Self = StObject.set(x, "timeStep", js.undefined)
      
      inline def setUseExactSrgbConversions(value: Boolean): Self = StObject.set(x, "useExactSrgbConversions", value.asInstanceOf[js.Any])
      
      inline def setUseExactSrgbConversionsUndefined: Self = StObject.set(x, "useExactSrgbConversions", js.undefined)
      
      inline def setUseHighPrecisionFloats(value: Boolean): Self = StObject.set(x, "useHighPrecisionFloats", value.asInstanceOf[js.Any])
      
      inline def setUseHighPrecisionFloatsUndefined: Self = StObject.set(x, "useHighPrecisionFloats", js.undefined)
      
      inline def setUseHighPrecisionMatrix(value: Boolean): Self = StObject.set(x, "useHighPrecisionMatrix", value.asInstanceOf[js.Any])
      
      inline def setUseHighPrecisionMatrixUndefined: Self = StObject.set(x, "useHighPrecisionMatrix", js.undefined)
      
      inline def setXrCompatible(value: Boolean): Self = StObject.set(x, "xrCompatible", value.asInstanceOf[js.Any])
      
      inline def setXrCompatibleUndefined: Self = StObject.set(x, "xrCompatible", js.undefined)
    }
  }
  
  trait HostInformation extends StObject {
    
    /**
      * Defines if the current host is a mobile
      */
    var isMobile: Boolean
  }
  object HostInformation {
    
    inline def apply(isMobile: Boolean): HostInformation = {
      val __obj = js.Dynamic.literal(isMobile = isMobile.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostInformation]
    }
    
    extension [Self <: HostInformation](x: Self) {
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISceneLike extends StObject {
    
    def addPendingData(data: Any): Unit
    
    var offlineProvider: IOfflineProvider
    
    def removePendingData(data: Any): Unit
  }
  object ISceneLike {
    
    inline def apply(addPendingData: Any => Unit, offlineProvider: IOfflineProvider, removePendingData: Any => Unit): ISceneLike = {
      val __obj = js.Dynamic.literal(addPendingData = js.Any.fromFunction1(addPendingData), offlineProvider = offlineProvider.asInstanceOf[js.Any], removePendingData = js.Any.fromFunction1(removePendingData))
      __obj.asInstanceOf[ISceneLike]
    }
    
    extension [Self <: ISceneLike](x: Self) {
      
      inline def setAddPendingData(value: Any => Unit): Self = StObject.set(x, "addPendingData", js.Any.fromFunction1(value))
      
      inline def setOfflineProvider(value: IOfflineProvider): Self = StObject.set(x, "offlineProvider", value.asInstanceOf[js.Any])
      
      inline def setRemovePendingData(value: Any => Unit): Self = StObject.set(x, "removePendingData", js.Any.fromFunction1(value))
    }
  }
}
