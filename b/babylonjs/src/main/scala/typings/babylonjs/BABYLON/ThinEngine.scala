package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.NumberDictionary
import typings.babylonjs.CanvasRenderingContext2D
import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.ImageBitmap
import typings.babylonjs.WebGLProgram
import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.WebGLUniformLocation
import typings.babylonjs.Window
import typings.babylonjs.anon.FramebufferHeight
import typings.babylonjs.anon.Height
import typings.babylonjs.anon.Mag
import typings.babylonjs.anon.PartialRenderTargetCreati
import typings.babylonjs.anon.Renderer
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.Document
import typings.std.Float32Array
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.Int32Array
import typings.std.OffscreenCanvas
import typings.std.OffscreenCanvasRenderingContext2D
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.WebGLBuffer
import typings.std.WebGLContextEvent
import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderbuffer
import typings.std.WebGLShader
import typings.std.WebGLTexture
import typings.std.WebGLVertexArrayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThinEngine extends StObject {
  
  /* private */ var _activateCurrentTexture: js.Any = js.native
  
  /** @hidden */
  /* protected */ var _activeChannel: Double = js.native
  
  /* protected */ var _activeRenderLoops: js.Array[js.Function0[Unit]] = js.native
  
  /* private */ var _activeRequests: js.Any = js.native
  
  /** @hidden */
  var _alphaEquation: Double = js.native
  
  /** @hidden */
  var _alphaMode: Double = js.native
  
  /** @hidden */
  var _alphaState: AlphaState = js.native
  
  /** @hidden */
  var _badDesktopOS: Boolean = js.native
  
  /** @hidden */
  var _badOS: Boolean = js.native
  
  /** @hidden */
  def _bindIndexBufferWithCache(indexBuffer: Nullable[DataBuffer]): Unit = js.native
  
  /* private */ var _bindSamplerUniformToChannel: js.Any = js.native
  
  /** @hidden */
  def _bindTexture(channel: Double, texture: Nullable[InternalTexture]): Unit = js.native
  
  /** @hidden */
  def _bindTextureDirectly(target: Double, texture: Nullable[InternalTexture]): Boolean = js.native
  def _bindTextureDirectly(target: Double, texture: Nullable[InternalTexture], forTextureDataUpdate: Boolean): Boolean = js.native
  def _bindTextureDirectly(target: Double, texture: Nullable[InternalTexture], forTextureDataUpdate: Boolean, force: Boolean): Boolean = js.native
  def _bindTextureDirectly(target: Double, texture: Nullable[InternalTexture], forTextureDataUpdate: Unit, force: Boolean): Boolean = js.native
  
  /** @hidden */
  def _bindUnboundFramebuffer(framebuffer: Nullable[WebGLFramebuffer]): Unit = js.native
  
  /* private */ var _bindVertexBuffersAttributes: js.Any = js.native
  
  /** @hidden */
  var _boundRenderFunction: js.Any = js.native
  
  /** @hidden */
  /* protected */ var _boundTexturesCache: org.scalablytyped.runtime.StringDictionary[Nullable[InternalTexture]] = js.native
  
  /* protected */ var _boundUniforms: NumberDictionary[WebGLUniformLocation] = js.native
  
  /** @hidden */
  /* protected */ var _cachedEffectForVertexBuffers: Nullable[Effect] = js.native
  
  /** @hidden */
  /* protected */ var _cachedIndexBuffer: Nullable[DataBuffer] = js.native
  
  /* private */ var _cachedVertexArrayObject: js.Any = js.native
  
  /** @hidden */
  /* protected */ var _cachedVertexBuffers: js.Any = js.native
  
  /** @hidden */
  /* protected */ var _cachedViewport: Nullable[IViewportLike] = js.native
  
  /* private */ var _canRenderToFloatFramebuffer: js.Any = js.native
  
  /* private */ var _canRenderToFramebuffer: js.Any = js.native
  
  /* private */ var _canRenderToHalfFloatFramebuffer: js.Any = js.native
  
  /** @hidden */
  var _caps: EngineCapabilities = js.native
  
  /** @hidden */
  def _cascadeLoadFiles(
    scene: Nullable[Scene],
    onfinish: js.Function1[/* images */ js.Array[ArrayBuffer], Unit],
    files: js.Array[String],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ]
  ): Unit = js.native
  
  /** @hidden */
  def _cascadeLoadImgs(
    scene: Nullable[Scene],
    onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
    files: js.Array[String],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ]
  ): Unit = js.native
  def _cascadeLoadImgs(
    scene: Nullable[Scene],
    onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
    files: js.Array[String],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    mimeType: String
  ): Unit = js.native
  
  /** @hidden */
  /* protected */ var _colorWrite: Boolean = js.native
  
  /** @hidden */
  /* protected */ var _colorWriteChanged: Boolean = js.native
  
  /* private */ var _compileRawShader: js.Any = js.native
  
  /* private */ var _compileShader: js.Any = js.native
  
  /* private */ var _compiledEffects: js.Any = js.native
  
  /* protected */ var _contextWasLost: Boolean = js.native
  
  /**
    * Creates a depth stencil cube texture.
    * This is only available in WebGL 2.
    * @param size The size of face edge in the cube texture.
    * @param options The options defining the cube texture.
    * @returns The cube texture
    */
  def _createDepthStencilCubeTexture(size: Double, options: DepthTextureCreationOptions): InternalTexture = js.native
  
  /** @hidden */
  def _createDepthStencilTexture(size: RenderTargetTextureSize, options: DepthTextureCreationOptions): InternalTexture = js.native
  
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
  def _createTexture(): WebGLTexture = js.native
  
  /* private */ var _createVertexBuffer: js.Any = js.native
  
  /* protected */ var _creationOptions: EngineOptions = js.native
  
  /* protected */ var _currentBoundBuffer: js.Array[Nullable[WebGLBuffer]] = js.native
  
  /* private */ var _currentBufferPointers: js.Any = js.native
  
  /** @hidden */
  /* protected */ var _currentEffect: Nullable[Effect] = js.native
  
  /** @hidden */
  var _currentFramebuffer: Nullable[WebGLFramebuffer] = js.native
  
  /* private */ var _currentInstanceBuffers: js.Any = js.native
  
  /* private */ var _currentInstanceLocations: js.Any = js.native
  
  /** @hidden */
  /* protected */ var _currentProgram: Nullable[WebGLProgram] = js.native
  
  /** @hidden */
  var _currentRenderTarget: Nullable[InternalTexture] = js.native
  
  /* private */ var _currentTextureChannel: js.Any = js.native
  
  /* protected */ def _deleteBuffer(buffer: DataBuffer): Unit = js.native
  
  /** @hidden */
  def _deletePipelineContext(pipelineContext: IPipelineContext): Unit = js.native
  
  /* protected */ def _deleteTexture(texture: Nullable[WebGLTexture]): Unit = js.native
  
  /** @hidden */
  /* protected */ var _depthCullingState: DepthCullingState = js.native
  
  /** @hidden */
  var _doNotHandleContextLost: Boolean = js.native
  
  /* private */ var _drawMode: js.Any = js.native
  
  /** @hidden */
  var _dummyFramebuffer: Nullable[WebGLFramebuffer] = js.native
  
  /* private */ var _emptyCubeTexture: js.Any = js.native
  
  /* private */ var _emptyTexture: js.Any = js.native
  
  /* private */ var _emptyTexture2DArray: js.Any = js.native
  
  /* private */ var _emptyTexture3D: js.Any = js.native
  
  /** @hidden */
  def _executeWhenRenderingStateIsCompiled(pipelineContext: IPipelineContext, action: js.Function0[Unit]): Unit = js.native
  
  /* protected */ def _finalizePipelineContext(pipelineContext: WebGLPipelineContext): Unit = js.native
  
  /** @hidden */
  var _frameHandler: Double = js.native
  
  /* private */ var _framebufferDimensionsObject: js.Any = js.native
  
  /* private */ var _getDepthStencilBuffer: js.Any = js.native
  
  /** @hidden */
  def _getInternalFormat(format: Double): Double = js.native
  
  /** @hidden */
  def _getRGBABufferInternalSizedFormat(`type`: Double): Double = js.native
  def _getRGBABufferInternalSizedFormat(`type`: Double, format: Double): Double = js.native
  
  /** @hidden */
  def _getRGBAMultiSampleBufferFormat(`type`: Double): Double = js.native
  
  /** @hidden */
  def _getSamplingParameters(samplingMode: Double, generateMipMaps: Boolean): Mag = js.native
  
  /** @hidden */
  def _getShaderSource(shader: WebGLShader): Nullable[String] = js.native
  
  /* private */ var _getTextureTarget: js.Any = js.native
  
  /* private */ var _getTextureWrapMode: js.Any = js.native
  
  /** @hidden */
  def _getUnpackAlignement(): Double = js.native
  
  /** @hidden */
  def _getWebGLTextureType(`type`: Double): Double = js.native
  
  /** @hidden */
  var _gl: WebGLRenderingContext = js.native
  
  /* private */ var _glRenderer: js.Any = js.native
  
  /* private */ var _glVendor: js.Any = js.native
  
  /* private */ var _glVersion: js.Any = js.native
  
  /* private */ var _hardwareScalingLevel: js.Any = js.native
  
  /* protected */ var _highPrecisionShadersAllowed: Boolean = js.native
  
  /* protected */ def _initGLContext(): Unit = js.native
  
  /** @hidden */
  var _internalTexturesCache: js.Array[InternalTexture] = js.native
  
  /** @hidden */
  def _isRenderingStateCompiled(pipelineContext: IPipelineContext): Boolean = js.native
  
  /* private */ var _isStencilEnable: js.Any = js.native
  
  /** @hidden */
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit]
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit]
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: Unit,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[js.Any], Unit]
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[js.Any], Unit]
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[js.Any], Unit]
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[js.Any], Unit]
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[js.Any], Unit]
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[js.Any], Unit]
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[js.Any], Unit]
  ): IFileRequest = js.native
  def _loadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: js.Function2[/* request */ js.UndefOr[IWebRequest], /* exception */ js.UndefOr[js.Any], Unit]
  ): IFileRequest = js.native
  
  /* private */ var _maxSimultaneousTextures: js.Any = js.native
  
  /* private */ var _mustWipeVertexAttributes: js.Any = js.native
  
  /* private */ var _nextFreeTextureSlots: js.Any = js.native
  
  /* protected */ def _normalizeIndexData(indices: IndicesArray): Uint16Array | Uint32Array = js.native
  
  /* private */ var _onContextLost: js.Any = js.native
  
  /* private */ var _onContextRestored: js.Any = js.native
  
  /** @hidden */
  def _partialLoadFile(
    url: String,
    index: Double,
    loadedFiles: js.Array[ArrayBuffer],
    onfinish: js.Function1[/* files */ js.Array[ArrayBuffer], Unit],
    onErrorCallBack: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ]
  ): Unit = js.native
  
  /** @hidden */
  def _partialLoadImg(
    url: String,
    index: Double,
    loadedImages: js.Array[HTMLImageElement],
    scene: Nullable[Scene],
    onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
    onErrorCallBack: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ]
  ): Unit = js.native
  def _partialLoadImg(
    url: String,
    index: Double,
    loadedImages: js.Array[HTMLImageElement],
    scene: Nullable[Scene],
    onfinish: js.Function1[/* images */ js.Array[HTMLImageElement], Unit],
    onErrorCallBack: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    mimeType: String
  ): Unit = js.native
  
  /** @hidden */
  def _preparePipelineContext(
    pipelineContext: IPipelineContext,
    vertexSourceCode: String,
    fragmentSourceCode: String,
    createAsRaw: Boolean,
    rebuildRebind: js.Any,
    defines: Nullable[String],
    transformFeedbackVaryings: Nullable[js.Array[String]]
  ): Unit = js.native
  
  /* private */ var _prepareWebGLTexture: js.Any = js.native
  
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
    * @hidden
    */
  /* protected */ def _queueNewFrame(bindedRenderFunction: js.Any): Double = js.native
  /* protected */ def _queueNewFrame(bindedRenderFunction: js.Any, requester: js.Any): Double = js.native
  
  /** @hidden */
  def _readTexturePixels(texture: InternalTexture, width: Double, height: Double): ArrayBufferView = js.native
  def _readTexturePixels(texture: InternalTexture, width: Double, height: Double, faceIndex: Double): ArrayBufferView = js.native
  def _readTexturePixels(texture: InternalTexture, width: Double, height: Double, faceIndex: Double, level: Double): ArrayBufferView = js.native
  def _readTexturePixels(
    texture: InternalTexture,
    width: Double,
    height: Double,
    faceIndex: Double,
    level: Double,
    buffer: Nullable[ArrayBufferView]
  ): ArrayBufferView = js.native
  def _readTexturePixels(
    texture: InternalTexture,
    width: Double,
    height: Double,
    faceIndex: Double,
    level: Unit,
    buffer: Nullable[ArrayBufferView]
  ): ArrayBufferView = js.native
  def _readTexturePixels(texture: InternalTexture, width: Double, height: Double, faceIndex: Unit, level: Double): ArrayBufferView = js.native
  def _readTexturePixels(
    texture: InternalTexture,
    width: Double,
    height: Double,
    faceIndex: Unit,
    level: Double,
    buffer: Nullable[ArrayBufferView]
  ): ArrayBufferView = js.native
  def _readTexturePixels(
    texture: InternalTexture,
    width: Double,
    height: Double,
    faceIndex: Unit,
    level: Unit,
    buffer: Nullable[ArrayBufferView]
  ): ArrayBufferView = js.native
  
  /* protected */ def _rebuildBuffers(): Unit = js.native
  
  /* private */ var _rebuildEffects: js.Any = js.native
  
  /* private */ var _rebuildInternalTextures: js.Any = js.native
  
  /** @hidden */
  def _releaseBuffer(buffer: DataBuffer): Boolean = js.native
  
  /** @hidden */
  def _releaseEffect(effect: Effect): Unit = js.native
  
  /** @hidden */
  def _releaseFramebufferObjects(texture: InternalTexture): Unit = js.native
  
  /** @hidden */
  def _releaseTexture(texture: InternalTexture): Unit = js.native
  
  /** @hidden */
  def _renderLoop(): Unit = js.native
  
  /* protected */ var _renderingCanvas: Nullable[HTMLCanvasElement] = js.native
  
  /* protected */ var _renderingQueueLaunched: Boolean = js.native
  
  /** @hidden */
  /* protected */ def _reportDrawCall(): Unit = js.native
  
  /**
    * @hidden
    */
  def _rescaleTexture(
    source: InternalTexture,
    destination: InternalTexture,
    scene: Nullable[js.Any],
    internalFormat: Double,
    onComplete: js.Function0[Unit]
  ): Unit = js.native
  
  /* protected */ def _resetIndexBufferBinding(): Unit = js.native
  
  /** @hidden */
  /* protected */ def _resetVertexBufferBinding(): Unit = js.native
  
  /** @hidden */
  def _setAnisotropicLevel(target: Double, internalTexture: InternalTexture, anisotropicFilteringLevel: Double): Unit = js.native
  
  /**
    * @hidden
    */
  def _setCubeMapTextureParams(texture: InternalTexture, loadMipmap: Boolean): Unit = js.native
  
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
    isPartOfTextureArray: Unit,
    depthStencilTexture: Boolean
  ): Boolean = js.native
  
  /* private */ var _setTextureParameterFloat: js.Any = js.native
  
  /* private */ var _setTextureParameterInteger: js.Any = js.native
  
  /** @hidden */
  def _setupDepthStencilTexture(
    internalTexture: InternalTexture,
    size: Double,
    generateStencil: Boolean,
    bilinearFiltering: Boolean,
    comparisonFunction: Double
  ): Unit = js.native
  def _setupDepthStencilTexture(
    internalTexture: InternalTexture,
    size: Height,
    generateStencil: Boolean,
    bilinearFiltering: Boolean,
    comparisonFunction: Double
  ): Unit = js.native
  
  /** @hidden */
  def _setupFramebufferDepthAttachments(generateStencilBuffer: Boolean, generateDepthBuffer: Boolean, width: Double, height: Double): Nullable[WebGLRenderbuffer] = js.native
  def _setupFramebufferDepthAttachments(
    generateStencilBuffer: Boolean,
    generateDepthBuffer: Boolean,
    width: Double,
    height: Double,
    samples: Double
  ): Nullable[WebGLRenderbuffer] = js.native
  
  /** @hidden */
  var _shaderProcessor: IShaderProcessor = js.native
  
  /** @hidden */
  def _shouldUseHighPrecisionShader: Boolean = js.native
  
  /** @hidden */
  /* protected */ var _stencilState: StencilState = js.native
  
  /* protected */ def _supportsHardwareTextureRescaling: Boolean = js.native
  
  /* private */ var _textureUnits: js.Any = js.native
  
  /** @hidden */
  var _transformTextureUrl: Nullable[js.Function1[/* url */ String, String]] = js.native
  
  /* private */ var _uintIndicesCurrentlySet: js.Any = js.native
  
  /* private */ var _unbindVertexArrayObject: js.Any = js.native
  
  /** @hidden */
  var _uniformBuffers: js.Array[UniformBuffer] = js.native
  
  /** @hidden */
  def _unpackFlipY(value: Boolean): Unit = js.native
  
  /* private */ var _unpackFlipYCached: js.Any = js.native
  
  /** @hidden */
  def _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: ArrayBufferView): Unit = js.native
  def _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Double): Unit = js.native
  def _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Double, lod: Double): Unit = js.native
  def _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Unit, lod: Double): Unit = js.native
  
  /** @hidden */
  def _uploadCompressedDataToTextureDirectly(
    texture: InternalTexture,
    internalFormat: Double,
    width: Double,
    height: Double,
    data: ArrayBufferView
  ): Unit = js.native
  def _uploadCompressedDataToTextureDirectly(
    texture: InternalTexture,
    internalFormat: Double,
    width: Double,
    height: Double,
    data: ArrayBufferView,
    faceIndex: Double
  ): Unit = js.native
  def _uploadCompressedDataToTextureDirectly(
    texture: InternalTexture,
    internalFormat: Double,
    width: Double,
    height: Double,
    data: ArrayBufferView,
    faceIndex: Double,
    lod: Double
  ): Unit = js.native
  def _uploadCompressedDataToTextureDirectly(
    texture: InternalTexture,
    internalFormat: Double,
    width: Double,
    height: Double,
    data: ArrayBufferView,
    faceIndex: Unit,
    lod: Double
  ): Unit = js.native
  
  /** @hidden */
  def _uploadDataToTextureDirectly(texture: InternalTexture, imageData: ArrayBufferView): Unit = js.native
  def _uploadDataToTextureDirectly(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Double): Unit = js.native
  def _uploadDataToTextureDirectly(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Double, lod: Double): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Double,
    lod: Double,
    babylonInternalFormat: Double
  ): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Double,
    lod: Double,
    babylonInternalFormat: Double,
    useTextureWidthAndHeight: Boolean
  ): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Double,
    lod: Double,
    babylonInternalFormat: Unit,
    useTextureWidthAndHeight: Boolean
  ): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Double,
    lod: Unit,
    babylonInternalFormat: Double
  ): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Double,
    lod: Unit,
    babylonInternalFormat: Double,
    useTextureWidthAndHeight: Boolean
  ): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Double,
    lod: Unit,
    babylonInternalFormat: Unit,
    useTextureWidthAndHeight: Boolean
  ): Unit = js.native
  def _uploadDataToTextureDirectly(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Unit, lod: Double): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Unit,
    lod: Double,
    babylonInternalFormat: Double
  ): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Unit,
    lod: Double,
    babylonInternalFormat: Double,
    useTextureWidthAndHeight: Boolean
  ): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Unit,
    lod: Double,
    babylonInternalFormat: Unit,
    useTextureWidthAndHeight: Boolean
  ): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Unit,
    lod: Unit,
    babylonInternalFormat: Double
  ): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Unit,
    lod: Unit,
    babylonInternalFormat: Double,
    useTextureWidthAndHeight: Boolean
  ): Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    faceIndex: Unit,
    lod: Unit,
    babylonInternalFormat: Unit,
    useTextureWidthAndHeight: Boolean
  ): Unit = js.native
  
  /* private */ var _vaoRecordInProgress: js.Any = js.native
  
  /* private */ var _vertexAttribArraysEnabled: js.Any = js.native
  
  /* private */ var _vertexAttribPointer: js.Any = js.native
  
  /** @hidden */
  var _videoTextureSupported: Boolean = js.native
  
  /** @hidden */
  def _viewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /* private */ var _viewportCached: js.Any = js.native
  
  /** @hidden */
  var _webGLVersion: Double = js.native
  
  /* protected */ var _windowIsBackground: Boolean = js.native
  
  /** @hidden */
  var _workingCanvas: Nullable[HTMLCanvasElement | OffscreenCanvas] = js.native
  
  /** @hidden */
  var _workingContext: Nullable[CanvasRenderingContext2D | OffscreenCanvasRenderingContext2D] = js.native
  
  /**
    * Gets the alpha state manager
    */
  def alphaState: AlphaState = js.native
  
  /**
    * Apply all cached states (depth, culling, stencil and alpha)
    */
  def applyStates(): Unit = js.native
  
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
  
  /* private */ var bindBuffer: js.Any = js.native
  
  /**
    * Bind a list of vertex buffers to the webGL context
    * @param vertexBuffers defines the list of vertex buffers to bind
    * @param indexBuffer defines the index buffer to bind
    * @param effect defines the effect associated with the vertex buffers
    */
  def bindBuffers(
    vertexBuffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]],
    indexBuffer: Nullable[DataBuffer],
    effect: Effect
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
    * @param texture The texture to render to or null for the default canvas
    * @param faceIndex The face of the texture to render to in case of cube texture
    * @param requiredWidth The width of the target to render to
    * @param requiredHeight The height of the target to render to
    * @param forceFullscreenViewport Forces the viewport to be the entire texture/screen if true
    * @param lodLevel defines the lod level to bind to the frame buffer
    * @param layer defines the 2d array index to bind to frame buffer to
    */
  def bindFramebuffer(
    texture: InternalTexture,
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
    */
  def bindUniformBufferBase(buffer: DataBuffer, location: Double): Unit = js.native
  
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
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Double,
    forcedExtension: js.Any
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
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Double,
    forcedExtension: js.Any,
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
    * @returns the cube texture as an InternalTexture
    */
  def createCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    files: Nullable[js.Array[String]],
    noMipmap: Boolean,
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Double,
    forcedExtension: js.Any,
    createPolynomials: Boolean,
    lodScale: Double,
    lodOffset: Double,
    fallback: Nullable[InternalTexture],
    loaderOptions: js.Any
  ): InternalTexture = js.native
  def createCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    files: Nullable[js.Array[String]],
    noMipmap: Boolean,
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Unit,
    forcedExtension: js.Any
  ): InternalTexture = js.native
  def createCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    files: Nullable[js.Array[String]],
    noMipmap: Boolean,
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Unit,
    forcedExtension: js.Any,
    createPolynomials: Boolean,
    lodScale: Double,
    lodOffset: Double
  ): InternalTexture = js.native
  def createCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    files: Nullable[js.Array[String]],
    noMipmap: Boolean,
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Unit,
    forcedExtension: js.Any,
    createPolynomials: Boolean,
    lodScale: Double,
    lodOffset: Double,
    fallback: Nullable[InternalTexture],
    loaderOptions: js.Any
  ): InternalTexture = js.native
  def createCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    files: Nullable[js.Array[String]],
    noMipmap: Unit,
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Double,
    forcedExtension: js.Any,
    createPolynomials: Boolean,
    lodScale: Double,
    lodOffset: Double,
    fallback: Nullable[InternalTexture],
    loaderOptions: js.Any
  ): InternalTexture = js.native
  def createCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    files: Nullable[js.Array[String]],
    noMipmap: Unit,
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[js.Any], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Unit,
    forcedExtension: js.Any,
    createPolynomials: Boolean,
    lodScale: Double,
    lodOffset: Double,
    fallback: Nullable[InternalTexture],
    loaderOptions: js.Any
  ): InternalTexture = js.native
  
  /**
    * Creates a depth stencil texture.
    * This is only available in WebGL 2 or with the depth texture extension available.
    * @param size The size of face edge in the texture.
    * @param options The options defining the texture.
    * @returns The texture
    */
  def createDepthStencilTexture(size: RenderTargetTextureSize, options: DepthTextureCreationOptions): InternalTexture = js.native
  
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
    * @param fallbacks defines the list of potential fallbacks to use if shader conmpilation fails
    * @param onCompiled defines a function to call when the effect creation is successful
    * @param onError defines a function to call when the effect creation has failed
    * @param indexParameters defines an object containing the index values to use to compile shaders (like the maximum number of simultaneous lights)
    * @returns the new Effect
    */
  def createEffect(
    baseName: js.Any,
    attributesNamesOrOptions: js.Array[String] | IEffectCreationOptions,
    uniformsNamesOrEngine: js.Array[String] | ThinEngine,
    samplers: js.UndefOr[js.Array[String]],
    defines: js.UndefOr[String],
    fallbacks: js.UndefOr[IEffectFallbacks],
    onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ Effect, Unit]]],
    onError: js.UndefOr[Nullable[js.Function2[/* effect */ Effect, /* errors */ String, Unit]]],
    indexParameters: js.UndefOr[js.Any]
  ): Effect = js.native
  
  /**
    * Creates a new index buffer
    * @param indices defines the content of the index buffer
    * @param updatable defines if the index buffer must be updatable
    * @returns a new webGL buffer
    */
  def createIndexBuffer(indices: IndicesArray): DataBuffer = js.native
  def createIndexBuffer(indices: IndicesArray, updatable: Boolean): DataBuffer = js.native
  
  /**
    * Create a multi render target texture
    * @see https://doc.babylonjs.com/features/webgl2#multiple-render-target
    * @param size defines the size of the texture
    * @param options defines the creation options
    * @returns the cube texture as an InternalTexture
    */
  def createMultipleRenderTarget(size: js.Any, options: IMultiRenderTargetOptions): js.Array[InternalTexture] = js.native
  
  /**
    * Creates a new pipeline context
    * @returns the new pipeline
    */
  def createPipelineContext(): IPipelineContext = js.native
  
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
    forcedExtension: js.Any
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Unit,
    onError: Unit,
    format: Double,
    forcedExtension: js.Any,
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
    forcedExtension: js.Any
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Unit,
    onError: Unit,
    format: Unit,
    forcedExtension: js.Any,
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
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ]
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Unit,
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
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
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Double,
    forcedExtension: js.Any
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Unit,
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Double,
    forcedExtension: js.Any,
    createPolynomials: Boolean
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Unit,
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
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
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Unit,
    forcedExtension: js.Any
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Unit,
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Unit,
    forcedExtension: js.Any,
    createPolynomials: Boolean
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Unit,
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
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
    forcedExtension: js.Any
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
    onError: Unit,
    format: Double,
    forcedExtension: js.Any,
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
    forcedExtension: js.Any
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
    onError: Unit,
    format: Unit,
    forcedExtension: js.Any,
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
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ]
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
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
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Double,
    forcedExtension: js.Any
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Double,
    forcedExtension: js.Any,
    createPolynomials: Boolean
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
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
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Unit,
    forcedExtension: js.Any
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
    ],
    format: Unit,
    forcedExtension: js.Any,
    createPolynomials: Boolean
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: String,
    scene: Nullable[Scene],
    lodScale: Double,
    lodOffset: Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
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
    data: Nullable[js.Array[ArrayBufferView]],
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
    callback: js.Function1[/* ArrayBuffer */ ArrayBuffer, Nullable[js.Array[ArrayBufferView]]],
    mipmapGenerator: Nullable[
      js.Function1[/* faces */ js.Array[ArrayBufferView], js.Array[js.Array[ArrayBufferView]]]
    ],
    onLoad: Nullable[js.Function0[Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
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
    callback: js.Function1[/* ArrayBuffer */ ArrayBuffer, Nullable[js.Array[ArrayBufferView]]],
    mipmapGenerator: Nullable[
      js.Function1[/* faces */ js.Array[ArrayBufferView], js.Array[js.Array[ArrayBufferView]]]
    ],
    onLoad: Nullable[js.Function0[Unit]],
    onError: Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
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
    * @returns the raw texture inside an InternalTexture
    */
  def createRawTexture(
    data: Nullable[ArrayBufferView],
    width: Double,
    height: Double,
    format: Double,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    compression: Nullable[String],
    `type`: Double
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
    * @returns a new raw 2D array texture (stored in an InternalTexture)
    */
  def createRawTexture2DArray(
    data: Nullable[ArrayBufferView],
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
    * @returns a new raw 3D texture (stored in an InternalTexture)
    */
  def createRawTexture3D(
    data: Nullable[ArrayBufferView],
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
  
  /**
    * Creates a new render target cube texture
    * @param size defines the size of the texture
    * @param options defines the options used to create the texture
    * @returns a new render target cube texture stored in an InternalTexture
    */
  def createRenderTargetCubeTexture(size: Double): InternalTexture = js.native
  def createRenderTargetCubeTexture(size: Double, options: PartialRenderTargetCreati): InternalTexture = js.native
  
  /**
    * Creates a new render target texture
    * @param size defines the size of the texture
    * @param options defines the options used to create the texture
    * @returns a new render target texture stored in an InternalTexture
    */
  def createRenderTargetTexture(size: RenderTargetTextureSize, options: Boolean): InternalTexture = js.native
  def createRenderTargetTexture(size: RenderTargetTextureSize, options: RenderTargetCreationOptions): InternalTexture = js.native
  
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
    * @returns a InternalTexture for assignment back into BABYLON.Texture
    */
  def createTexture(
    url: Nullable[String],
    noMipmap: Boolean,
    invertY: Boolean,
    scene: Nullable[ISceneLike],
    samplingMode: js.UndefOr[Double],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[Nullable[js.Function2[/* message */ String, /* exception */ js.Any, Unit]]],
    buffer: js.UndefOr[
      Nullable[String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap]
    ],
    fallback: js.UndefOr[Nullable[InternalTexture]],
    format: js.UndefOr[Nullable[Double]],
    forcedExtension: js.UndefOr[Nullable[String]],
    mimeType: js.UndefOr[String],
    loaderOptions: js.UndefOr[js.Any]
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
    * Gets or sets a boolean indicating if back faces must be culled (true by default)
    */
  var cullBackFaces: Boolean = js.native
  
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
    * @param instancesCount defines the number of instances to draw (if instanciation is enabled)
    */
  def draw(useTriangles: Boolean, indexStart: Double, indexCount: Double): Unit = js.native
  def draw(useTriangles: Boolean, indexStart: Double, indexCount: Double, instancesCount: Double): Unit = js.native
  
  /**
    * Draw a list of unindexed primitives
    * @param fillMode defines the primitive to use
    * @param verticesStart defines the index of first vertex to draw
    * @param verticesCount defines the count of vertices to draw
    * @param instancesCount defines the number of instances to draw (if instanciation is enabled)
    */
  def drawArraysType(fillMode: Double, verticesStart: Double, verticesCount: Double): Unit = js.native
  def drawArraysType(fillMode: Double, verticesStart: Double, verticesCount: Double, instancesCount: Double): Unit = js.native
  
  /**
    * Draw a list of indexed primitives
    * @param fillMode defines the primitive to use
    * @param indexStart defines the starting index
    * @param indexCount defines the number of index to draw
    * @param instancesCount defines the number of instances to draw (if instanciation is enabled)
    */
  def drawElementsType(fillMode: Double, indexStart: Double, indexCount: Double): Unit = js.native
  def drawElementsType(fillMode: Double, indexStart: Double, indexCount: Double, instancesCount: Double): Unit = js.native
  
  /**
    * Draw a list of points
    * @param verticesStart defines the index of first vertex to draw
    * @param verticesCount defines the count of vertices to draw
    * @param instancesCount defines the number of instances to draw (if instanciation is enabled)
    */
  def drawPointClouds(verticesStart: Double, verticesCount: Double): Unit = js.native
  def drawPointClouds(verticesStart: Double, verticesCount: Double, instancesCount: Double): Unit = js.native
  
  /**
    * Draw a list of unindexed primitives
    * @param useTriangles defines if triangles must be used to draw (else wireframe will be used)
    * @param verticesStart defines the index of first vertex to draw
    * @param verticesCount defines the count of vertices to draw
    * @param instancesCount defines the number of instances to draw (if instanciation is enabled)
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
    * Activates an effect, mkaing it the current one (ie. the one used for rendering)
    * @param effect defines the effect to activate
    */
  def enableEffect(effect: Nullable[Effect]): Unit = js.native
  
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
    * sets the object from which width and height will be taken from when getting render width and height
    * Will fallback to the gl object
    * @param dimensions the framebuffer width and height that will be used.
    */
  def framebufferDimensionsObject_=(dimensions: Nullable[FramebufferHeight]): Unit = js.native
  
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
    * Gets the lsit of active attributes for a given webGL program
    * @param pipelineContext defines the pipeline context to use
    * @param attributesNames defines the list of attribute names to get
    * @returns an array of indices indicating the offset of each attribute
    */
  def getAttributes(pipelineContext: IPipelineContext, attributesNames: js.Array[String]): js.Array[Double] = js.native
  
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
    * Get the current error code of the webGL context
    * @returns the error code
    * @see https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getError
    */
  def getError(): Double = js.native
  
  /**
    * Gets an object containing information about the current webGL context
    * @returns an object containing the vender, the renderer and the version of the current webGL context
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
    * Gets information about the current host
    */
  var hostInformation: HostInformation = js.native
  
  /**
    * Gets a boolean indicating if the engine is currently rendering in fullscreen mode
    */
  var isFullscreen: Boolean = js.native
  
  /**
    * Returns true if the stencil buffer has been enabled through the creation option of the context.
    */
  def isStencilEnable: Boolean = js.native
  
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
    * Defines whether the engine has been created with the premultipliedAlpha option on or not.
    */
  val premultipliedAlpha: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating that cache can be kept between frames
    */
  var preventCacheWipeBetweenFrames: Boolean = js.native
  
  /**
    * Reads pixels from the current frame buffer. Please note that this function can be slow
    * @param x defines the x coordinate of the rectangle where pixels must be read
    * @param y defines the y coordinate of the rectangle where pixels must be read
    * @param width defines the width of the rectangle where pixels must be read
    * @param height defines the height of the rectangle where pixels must be read
    * @param hasAlpha defines whether the output should have alpha or not (defaults to true)
    * @returns a Uint8Array containing RGBA colors
    */
  def readPixels(x: Double, y: Double, width: Double, height: Double): Uint8Array = js.native
  def readPixels(x: Double, y: Double, width: Double, height: Double, hasAlpha: Boolean): Uint8Array = js.native
  
  /**
    * Records a vertex array object
    * @see https://doc.babylonjs.com/features/webgl2#vertex-array-objects
    * @param vertexBuffers defines the list of vertex buffers to store
    * @param indexBuffer defines the index buffer to store
    * @param effect defines the effect to store
    * @returns the new vertex array object
    */
  def recordVertexArrayObject(
    vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer],
    indexBuffer: Nullable[DataBuffer],
    effect: Effect
  ): WebGLVertexArrayObject = js.native
  
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
    * Gets or sets a boolean indicating if the engine must keep rendering even if the window is not in foregroun
    */
  var renderEvenInBackground: Boolean = js.native
  
  /**
    * Reset the texture cache to empty state
    */
  def resetTextureCache(): Unit = js.native
  
  /**
    * Resize the view according to the canvas' size
    */
  def resize(): Unit = js.native
  
  /**
    * Unbind the current render target and bind the default framebuffer
    */
  def restoreDefaultFramebuffer(): Unit = js.native
  
  /**
    * Restores the webgl state to only draw on the main color attachment
    */
  def restoreSingleAttachment(): Unit = js.native
  
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
  def setArray(uniform: Nullable[WebGLUniformLocation], array: Float32Array): Boolean = js.native
  
  /**
    * Set the value of an uniform to an array of number (stored as vec2)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of number to store
    * @returns true if the value was set
    */
  def setArray2(uniform: Nullable[WebGLUniformLocation], array: js.Array[Double]): Boolean = js.native
  def setArray2(uniform: Nullable[WebGLUniformLocation], array: Float32Array): Boolean = js.native
  
  /**
    * Set the value of an uniform to an array of number (stored as vec3)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of number to store
    * @returns true if the value was set
    */
  def setArray3(uniform: Nullable[WebGLUniformLocation], array: js.Array[Double]): Boolean = js.native
  def setArray3(uniform: Nullable[WebGLUniformLocation], array: Float32Array): Boolean = js.native
  
  /**
    * Set the value of an uniform to an array of number (stored as vec4)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of number to store
    * @returns true if the value was set
    */
  def setArray4(uniform: Nullable[WebGLUniformLocation], array: js.Array[Double]): Boolean = js.native
  def setArray4(uniform: Nullable[WebGLUniformLocation], array: Float32Array): Boolean = js.native
  
  /**
    * Enable or disable color writing
    * @param enable defines the state to set
    */
  def setColorWrite(enable: Boolean): Unit = js.native
  
  /**
    * Set the value of an uniform to a number (float)
    * @param uniform defines the webGL uniform location where to store the value
    * @param value defines the float number to store
    * @returns true if the value was transfered
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
    * Set the value of an uniform to an array of int32
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    * @returns true if the value was set
    */
  def setIntArray(uniform: Nullable[WebGLUniformLocation], array: Int32Array): Boolean = js.native
  
  /**
    * Set the value of an uniform to an array of int32 (stored as vec2)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    * @returns true if the value was set
    */
  def setIntArray2(uniform: Nullable[WebGLUniformLocation], array: Int32Array): Boolean = js.native
  
  /**
    * Set the value of an uniform to an array of int32 (stored as vec3)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    * @returns true if the value was set
    */
  def setIntArray3(uniform: Nullable[WebGLUniformLocation], array: Int32Array): Boolean = js.native
  
  /**
    * Set the value of an uniform to an array of int32 (stored as vec4)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    * @returns true if the value was set
    */
  def setIntArray4(uniform: Nullable[WebGLUniformLocation], array: Int32Array): Boolean = js.native
  
  /**
    * Set the value of an uniform to an array of float32 (stored as matrices)
    * @param uniform defines the webGL uniform location where to store the value
    * @param matrices defines the array of float32 to store
    * @returns true if the value was set
    */
  def setMatrices(uniform: Nullable[WebGLUniformLocation], matrices: Float32Array): Boolean = js.native
  
  /**
    * Set the value of an uniform to a matrix (2x2)
    * @param uniform defines the webGL uniform location where to store the value
    * @param matrix defines the Float32Array representing the 2x2 matrix to store
    * @returns true if the value was set
    */
  def setMatrix2x2(uniform: Nullable[WebGLUniformLocation], matrix: Float32Array): Boolean = js.native
  
  /**
    * Set the value of an uniform to a matrix (3x3)
    * @param uniform defines the webGL uniform location where to store the value
    * @param matrix defines the Float32Array representing the 3x3 matrix to store
    * @returns true if the value was set
    */
  def setMatrix3x3(uniform: Nullable[WebGLUniformLocation], matrix: Float32Array): Boolean = js.native
  
  /**
    * Force a specific size of the canvas
    * @param width defines the new canvas' width
    * @param height defines the new canvas' height
    * @returns true if the size was changed
    */
  def setSize(width: Double, height: Double): Boolean = js.native
  
  /**
    * Sets a texture to the according uniform.
    * @param channel The texture channel
    * @param uniform The uniform to set
    * @param texture The texture to apply
    */
  def setTexture(channel: Double, uniform: Nullable[WebGLUniformLocation], texture: Nullable[ThinTexture]): Unit = js.native
  
  /**
    * Sets an array of texture to the webGL context
    * @param channel defines the channel where the texture array must be set
    * @param uniform defines the associated uniform location
    * @param textures defines the array of textures to bind
    */
  def setTextureArray(channel: Double, uniform: Nullable[WebGLUniformLocation], textures: js.Array[ThinTexture]): Unit = js.native
  
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
    * Gets the stencil state manager
    */
  def stencilState: StencilState = js.native
  
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
    * @param texture defines the render target texture to unbind
    * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
    * @param onBeforeUnbind defines a function which will be called before the effective unbind
    */
  def unBindFramebuffer(texture: InternalTexture): Unit = js.native
  def unBindFramebuffer(texture: InternalTexture, disableGenerateMipMaps: Boolean): Unit = js.native
  def unBindFramebuffer(texture: InternalTexture, disableGenerateMipMaps: Boolean, onBeforeUnbind: js.Function0[Unit]): Unit = js.native
  def unBindFramebuffer(texture: InternalTexture, disableGenerateMipMaps: Unit, onBeforeUnbind: js.Function0[Unit]): Unit = js.native
  
  /**
    * Unbind a list of render target textures from the webGL context
    * This is used only when drawBuffer extension or webGL2 are active
    * @param textures defines the render target textures to unbind
    * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
    * @param onBeforeUnbind defines a function which will be called before the effective unbind
    */
  def unBindMultiColorAttachmentFramebuffer(textures: js.Array[InternalTexture], disableGenerateMipMaps: Boolean): Unit = js.native
  def unBindMultiColorAttachmentFramebuffer(
    textures: js.Array[InternalTexture],
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
    * Update the content of a webGL buffer used with instanciation and bind it to the webGL context
    * @param instancesBuffer defines the webGL buffer to update and bind
    * @param data defines the data to store in the buffer
    * @param offsetLocations defines the offsets or attributes information used to determine where data must be stored in the buffer
    */
  def updateAndBindInstancesBuffer(
    instancesBuffer: DataBuffer,
    data: Float32Array,
    offsetLocations: js.Array[Double | InstancingAttributeInfo]
  ): Unit = js.native
  
  /**
    * update the bound buffer with the given data
    * @param data defines the data to update
    */
  def updateArrayBuffer(data: Float32Array): Unit = js.native
  
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
    */
  def updateDynamicTexture(
    texture: Nullable[InternalTexture],
    source: ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas,
    invertY: js.UndefOr[Boolean],
    premulAlpha: js.UndefOr[Boolean],
    format: js.UndefOr[Double],
    forceBindTexture: js.UndefOr[Boolean]
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
    * @param textures defines the textures to update
    * @param samples defines the sample count to set
    * @returns the effective sample count (could be 0 if multisample render targets are not supported)
    */
  def updateMultipleRenderTargetTextureSampleCount(textures: Nullable[js.Array[InternalTexture]], samples: Double): Double = js.native
  
  /**
    * Update a raw cube texture
    * @param texture defines the texture to udpdate
    * @param data defines the data to store
    * @param format defines the data format
    * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
    * @param invertY defines if data must be stored with Y axis inverted
    */
  def updateRawCubeTexture(
    texture: InternalTexture,
    data: js.Array[ArrayBufferView],
    format: Double,
    `type`: Double,
    invertY: Boolean
  ): Unit = js.native
  /**
    * Update a raw cube texture
    * @param texture defines the texture to udpdate
    * @param data defines the data to store
    * @param format defines the data format
    * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
    * @param invertY defines if data must be stored with Y axis inverted
    * @param compression defines the compression used (null by default)
    */
  def updateRawCubeTexture(
    texture: InternalTexture,
    data: js.Array[ArrayBufferView],
    format: Double,
    `type`: Double,
    invertY: Boolean,
    compression: Nullable[String]
  ): Unit = js.native
  /**
    * Update a raw cube texture
    * @param texture defines the texture to udpdate
    * @param data defines the data to store
    * @param format defines the data format
    * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
    * @param invertY defines if data must be stored with Y axis inverted
    * @param compression defines the compression used (null by default)
    * @param level defines which level of the texture to update
    */
  def updateRawCubeTexture(
    texture: InternalTexture,
    data: js.Array[ArrayBufferView],
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
    data: Nullable[ArrayBufferView],
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
    */
  def updateRawTexture(
    texture: Nullable[InternalTexture],
    data: Nullable[ArrayBufferView],
    format: Double,
    invertY: Boolean,
    compression: Nullable[String],
    `type`: Double
  ): Unit = js.native
  
  /**
    * Update a raw 2D array texture
    * @param texture defines the texture to update
    * @param data defines the data to store
    * @param format defines the data format
    * @param invertY defines if data must be stored with Y axis inverted
    */
  def updateRawTexture2DArray(texture: InternalTexture, data: Nullable[ArrayBufferView], format: Double, invertY: Boolean): Unit = js.native
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
    data: Nullable[ArrayBufferView],
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
  def updateRawTexture3D(texture: InternalTexture, data: Nullable[ArrayBufferView], format: Double, invertY: Boolean): Unit = js.native
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
    data: Nullable[ArrayBufferView],
    format: Double,
    invertY: Boolean,
    compression: Nullable[String],
    textureType: Double
  ): Unit = js.native
  
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
    */
  def updateTextureData(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    xOffset: Double,
    yOffset: Double,
    width: Double,
    height: Double
  ): Unit = js.native
  def updateTextureData(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    xOffset: Double,
    yOffset: Double,
    width: Double,
    height: Double,
    faceIndex: Double
  ): Unit = js.native
  def updateTextureData(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    xOffset: Double,
    yOffset: Double,
    width: Double,
    height: Double,
    faceIndex: Double,
    lod: Double
  ): Unit = js.native
  def updateTextureData(
    texture: InternalTexture,
    imageData: ArrayBufferView,
    xOffset: Double,
    yOffset: Double,
    width: Double,
    height: Double,
    faceIndex: Unit,
    lod: Double
  ): Unit = js.native
  
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
    * Gets or sets a boolean indicating if depth buffer should be reverse, going from far to near.
    * This can provide greater z depth for distant objects.
    */
  var useReverseDepthBuffer: Boolean = js.native
  
  /** Gets or sets a boolean indicating if the engine should validate programs after compilation */
  var validateShaderPrograms: Boolean = js.native
  
  /**
    * Gets version of the current webGL context
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
