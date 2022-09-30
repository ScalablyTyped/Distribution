package typings.babylonjs.BABYLON

import typings.babylonjs.GPUCommandEncoder
import typings.babylonjs.GPUDevice
import typings.babylonjs.GPUFeatureName
import typings.babylonjs.GPUProgrammableStage
import typings.babylonjs.GPURenderPassEncoder
import typings.babylonjs.GPUTexture
import typings.babylonjs.WebGLProgram
import typings.babylonjs.WebGLUniformLocation
import typings.babylonjs.anon.Mag
import typings.babylonjs.anon.NumBundleCreationNonCompatMode
import typings.babylonjs.anon.W
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUEngine
  extends StObject
     with Engine {
  
  /* private */ var _adapter: Any = js.native
  
  /* private */ var _adapterSupportedExtensions: Any = js.native
  
  /* private */ var _applyBlendColor: Any = js.native
  
  /* private */ var _applyRenderPassChanges: Any = js.native
  
  /* private */ var _applyScissor: Any = js.native
  
  /**
    * @internal
    */
  def _applyStencilRef(renderPass: GPURenderPassEncoder): Unit = js.native
  
  /* private */ var _applyViewport: Any = js.native
  
  /**
    * @internal
    */
  def _bindTextureDirectly(): Boolean = js.native
  
  /**
    * @internal
    */
  def _bindUnboundFramebuffer(): Unit = js.native
  
  /* private */ var _blendColorsCurrent: Any = js.native
  
  /** @internal */
  var _bufferManager: WebGPUBufferManager = js.native
  
  /** @internal */
  var _bundleList: WebGPUBundleList = js.native
  
  /** @internal */
  var _bundleListRenderTarget: WebGPUBundleList = js.native
  
  /* private */ var _cacheBindGroups: Any = js.native
  
  /** @internal */
  var _cacheRenderPipeline: WebGPUCacheRenderPipeline = js.native
  
  /** @internal */
  var _cacheSampler: WebGPUCacheSampler = js.native
  
  /* private */ var _canvas: Any = js.native
  
  /** @internal */
  val _clearDepthValue: /* 1 */ Double = js.native
  
  /* private */ var _clearFullQuad: Any = js.native
  
  /* private */ var _clearQuad: Any = js.native
  
  /** @internal */
  val _clearReverseDepthValue: /* 0 */ Double = js.native
  
  /** @internal */
  val _clearStencilValue: /* 0 */ Double = js.native
  
  /* private */ var _colorFormat: Any = js.native
  
  /* private */ var _colorWriteLocal: Any = js.native
  
  /* private */ var _commandBuffers: Any = js.native
  
  /* private */ var _compilePipelineStageDescriptor: Any = js.native
  
  /* private */ var _compileRawPipelineStageDescriptor: Any = js.native
  
  /* private */ var _compileRawShaderToSpirV: Any = js.native
  
  /* private */ var _compileShaderToSpirV: Any = js.native
  
  /** @internal */
  var _compiledComputeEffects: org.scalablytyped.runtime.StringDictionary[ComputeEffect] = js.native
  
  /* private */ var _configureContext: Any = js.native
  
  /* private */ var _context: Any = js.native
  
  /** @internal */
  var _counters: NumBundleCreationNonCompatMode = js.native
  
  def _createBuffer(data: Double, creationFlags: Double): DataBuffer = js.native
  /**
    * @internal
    */
  def _createBuffer(data: DataArray, creationFlags: Double): DataBuffer = js.native
  
  /** @internal */
  def _createComputePipelineStageDescriptor(computeShader: String, defines: Nullable[String], entryPoint: String): GPUProgrammableStage = js.native
  
  /* private */ var _createPipelineStageDescriptor: Any = js.native
  
  /** @internal */
  @JSName("_currentDrawContext")
  var _currentDrawContext_WebGPUEngine: WebGPUDrawContext = js.native
  
  /* private */ var _currentIndexBuffer: Any = js.native
  
  /** @internal */
  @JSName("_currentMaterialContext")
  var _currentMaterialContext_WebGPUEngine: WebGPUMaterialContext = js.native
  
  /* private */ var _currentOverrideVertexBuffers: Any = js.native
  
  /** @internal */
  var _currentRenderPass: Nullable[GPURenderPassEncoder] = js.native
  
  /* private */ var _defaultDrawContext: Any = js.native
  
  /* private */ var _defaultMaterialContext: Any = js.native
  
  /* private */ val _defaultSampleCount: Any = js.native
  
  /* private */ var _depthTexture: Any = js.native
  
  /* private */ var _depthTextureFormat: Any = js.native
  
  /** @internal */
  var _device: GPUDevice = js.native
  
  /* private */ var _deviceEnabledExtensions: Any = js.native
  
  /* private */ var _draw: Any = js.native
  
  /* private */ var _emptyVertexBuffer: Any = js.native
  
  /* private */ var _endMainRenderPass: Any = js.native
  
  /** @internal */
  def _endRenderTargetRenderPass(): Unit = js.native
  
  /* private */ var _forceEnableEffect: Any = js.native
  
  /**
    * @internal
    */
  def _generateMipmaps(texture: InternalTexture): Unit = js.native
  def _generateMipmaps(texture: InternalTexture, commandEncoder: GPUCommandEncoder): Unit = js.native
  
  /* private */ var _getCurrentRenderPass: Any = js.native
  
  /** @internal */
  def _getCurrentRenderPassIndex(): Double = js.native
  
  /**
    * @internal
    */
  def _getRGBABufferInternalSizedFormat(): Double = js.native
  
  /**
    * @internal
    */
  def _getSamplingParameters(): Mag = js.native
  
  /* private */ var _getWGSLShader: Any = js.native
  
  /* private */ var _glslang: Any = js.native
  
  /* private */ var _initGlslang: Any = js.native
  
  /* private */ var _initializeContextAndSwapChain: Any = js.native
  
  /* private */ var _initializeLimits: Any = js.native
  
  /* private */ var _initializeMainAttachments: Any = js.native
  
  /**
    * @internal
    */
  def _isRenderingStateCompiled(): Boolean = js.native
  
  /* private */ var _mainPassSampleCount: Any = js.native
  
  /** @internal */
  var _mainRenderPassWrapper: WebGPURenderPassWrapper = js.native
  
  /* private */ var _mainTexture: Any = js.native
  
  /* private */ var _mainTextureExtends: Any = js.native
  
  /* private */ var _mainTextureLastCopy: Any = js.native
  
  /** @internal */
  var _mrtAttachments: js.Array[Double] = js.native
  
  /* private */ var _mustUpdateBlendColor: Any = js.native
  
  /* private */ var _mustUpdateScissor: Any = js.native
  
  /* private */ var _mustUpdateStencilRef: Any = js.native
  
  /* private */ var _mustUpdateViewport: Any = js.native
  
  /** @internal */
  var _occlusionQuery: WebGPUOcclusionQuery = js.native
  
  /** @internal */
  var _onAfterUnbindFrameBufferObservable: Observable[WebGPUEngine] = js.native
  
  /** @internal */
  var _options: WebGPUEngineOptions = js.native
  
  /** @internal */
  var _pendingDebugCommands: js.Array[js.Tuple2[String, Nullable[String]]] = js.native
  
  /**
    * @internal
    */
  def _preparePipelineContext(
    pipelineContext: IPipelineContext,
    vertexSourceCode: String,
    fragmentSourceCode: String,
    createAsRaw: Boolean,
    rawVertexSourceCode: String,
    rawFragmentSourceCode: String,
    rebuildRebind: Any,
    defines: Nullable[String]
  ): Unit = js.native
  
  /** @internal */
  var _renderEncoder: GPUCommandEncoder = js.native
  
  /* private */ val _renderEncoderDescriptor: Any = js.native
  
  /** @internal */
  var _renderTargetEncoder: GPUCommandEncoder = js.native
  
  /* private */ val _renderTargetEncoderDescriptor: Any = js.native
  
  /* private */ var _resetCurrentColorBlend: Any = js.native
  
  /* private */ var _resetCurrentScissor: Any = js.native
  
  /* private */ var _resetCurrentStencilRef: Any = js.native
  
  /* private */ var _resetCurrentViewport: Any = js.native
  
  /** @internal */
  var _rttRenderPassWrapper: WebGPURenderPassWrapper = js.native
  
  /* protected */ var _scissorCached: W = js.native
  
  /* private */ var _scissorIsActive: Any = js.native
  
  /* private */ var _scissorsCurrent: Any = js.native
  
  /**
    * @internal
    */
  def _setColorFormat(wrapper: WebGPURenderPassWrapper): Unit = js.native
  
  /**
    * @internal
    */
  def _setDepthTextureFormat(wrapper: WebGPURenderPassWrapper): Unit = js.native
  
  /**
    * @internal
    */
  def _setInternalTexture(name: String, texture: Nullable[InternalTexture | ExternalTexture]): Unit = js.native
  def _setInternalTexture(name: String, texture: Nullable[InternalTexture | ExternalTexture], baseName: String): Unit = js.native
  
  /* protected */ def _setTexture(channel: Double, texture: Nullable[BaseTexture]): Boolean = js.native
  /* protected */ def _setTexture(channel: Double, texture: Nullable[BaseTexture], isPartOfTextureArray: Boolean): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Boolean,
    depthStencilTexture: Boolean
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Boolean,
    depthStencilTexture: Boolean,
    name: String
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Boolean,
    depthStencilTexture: Boolean,
    name: String,
    baseName: String
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Boolean,
    depthStencilTexture: Boolean,
    name: Unit,
    baseName: String
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Boolean,
    depthStencilTexture: Unit,
    name: String
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Boolean,
    depthStencilTexture: Unit,
    name: String,
    baseName: String
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Boolean,
    depthStencilTexture: Unit,
    name: Unit,
    baseName: String
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Unit,
    depthStencilTexture: Boolean
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Unit,
    depthStencilTexture: Boolean,
    name: String
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Unit,
    depthStencilTexture: Boolean,
    name: String,
    baseName: String
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Unit,
    depthStencilTexture: Boolean,
    name: Unit,
    baseName: String
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Unit,
    depthStencilTexture: Unit,
    name: String
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Unit,
    depthStencilTexture: Unit,
    name: String,
    baseName: String
  ): Boolean = js.native
  /* protected */ def _setTexture(
    channel: Double,
    texture: Nullable[BaseTexture],
    isPartOfTextureArray: Unit,
    depthStencilTexture: Unit,
    name: Unit,
    baseName: String
  ): Boolean = js.native
  
  /* private */ var _shaderProcessorWGSL: Any = js.native
  
  /* private */ var _snapshotRendering: Any = js.native
  
  /* private */ var _startMainRenderPass: Any = js.native
  
  /* private */ var _startRenderTargetRenderPass: Any = js.native
  
  /* private */ var _stencilRefsCurrent: Any = js.native
  
  /* private */ var _swapChainTexture: Any = js.native
  
  /** @internal */
  var _textureHelper: WebGPUTextureHelper = js.native
  
  /** @internal */
  var _timestampQuery: WebGPUTimestampQuery = js.native
  
  /* private */ var _tintWASM: Any = js.native
  
  /** @internal */
  var _ubDontInvertY: WebGPUDataBuffer = js.native
  
  /** @internal */
  var _ubInvertY: WebGPUDataBuffer = js.native
  
  /**
    * @internal
    */
  def _unpackFlipY(): Unit = js.native
  
  /** @internal */
  var _uploadEncoder: GPUCommandEncoder = js.native
  
  /* private */ val _uploadEncoderDescriptor: Any = js.native
  
  /* private */ var _viewportsCurrent: Any = js.native
  
  /**
    * @internal
    */
  def bindBuffersDirectly(): Unit = js.native
  
  /**
    * @internal
    */
  def bindSamplers(): Unit = js.native
  
  /**
    * Counters from last frame
    */
  val countersLastFrame: NumBundleCreationNonCompatMode = js.native
  
  /**
    * @internal
    */
  def createRawShaderProgram(): WebGLProgram = js.native
  
  /**
    * @internal
    */
  def createShaderProgram(): WebGLProgram = js.native
  
  /** @internal */
  def currentSampleCount: Double = js.native
  
  /** @internal */
  var dbgLogIfNotDrawWrapper: Boolean = js.native
  
  /** @internal */
  var dbgSanityChecks: Boolean = js.native
  
  /** @internal */
  var dbgShowEmptyEnableEffectCalls: Boolean = js.native
  
  /** @internal */
  var dbgShowShaderCode: Boolean = js.native
  
  /** @internal */
  var dbgVerboseLogsForFirstFrames: Boolean = js.native
  
  /** @internal */
  var dbgVerboseLogsNumFrames: Double = js.native
  
  /**
    * Sets this to true to disable the cache for the bind groups. You should do it only for testing purpose!
    */
  def disableCacheBindGroups: Boolean = js.native
  def disableCacheBindGroups_=(disable: Boolean): Unit = js.native
  
  /**
    * Sets this to true to disable the cache for the render pipelines. You should do it only for testing purpose!
    */
  def disableCacheRenderPipelines: Boolean = js.native
  def disableCacheRenderPipelines_=(disable: Boolean): Unit = js.native
  
  /**
    * Sets this to true to disable the cache for the samplers. You should do it only for testing purpose!
    */
  def disableCacheSamplers: Boolean = js.native
  def disableCacheSamplers_=(disable: Boolean): Unit = js.native
  
  /** Gets the currently enabled extensions on the WebGPU device */
  def enabledExtensions: Immutable[js.Array[GPUFeatureName]] = js.native
  
  def flushFramebuffer(reopenPass: Boolean): Unit = js.native
  
  /**
    * @internal
    */
  def getUniforms(): js.Array[Nullable[WebGLUniformLocation]] = js.native
  
  /**
    * Initializes the WebGPU context and dependencies.
    * @param glslangOptions Defines the GLSLang compiler options if necessary
    * @param twgslOptions Defines the Twgsl compiler options if necessary
    * @returns a promise notifying the readiness of the engine.
    */
  def initAsync(): js.Promise[Unit] = js.native
  def initAsync(glslangOptions: Unit, twgslOptions: TwgslOptions): js.Promise[Unit] = js.native
  def initAsync(glslangOptions: GlslangOptions): js.Promise[Unit] = js.native
  def initAsync(glslangOptions: GlslangOptions, twgslOptions: TwgslOptions): js.Promise[Unit] = js.native
  
  /**
    * Max number of uncaptured error messages to log
    */
  var numMaxUncapturedErrors: Double = js.native
  
  /**
    * @internal
    */
  def setArray(): Boolean = js.native
  
  /**
    * @internal
    */
  def setArray2(): Boolean = js.native
  
  /**
    * @internal
    */
  def setArray3(): Boolean = js.native
  
  /**
    * @internal
    */
  def setArray4(): Boolean = js.native
  
  def setDitheringState(): Unit = js.native
  
  /**
    * @internal
    */
  def setFloat(): Boolean = js.native
  
  /**
    * @internal
    */
  def setFloat2(): Boolean = js.native
  
  /**
    * @internal
    */
  def setFloat3(): Boolean = js.native
  
  /**
    * @internal
    */
  def setFloat4(): Boolean = js.native
  
  /**
    * @internal
    */
  def setIntArray(): Boolean = js.native
  
  /**
    * @internal
    */
  def setIntArray2(): Boolean = js.native
  
  /**
    * @internal
    */
  def setIntArray3(): Boolean = js.native
  
  /**
    * @internal
    */
  def setIntArray4(): Boolean = js.native
  
  /**
    * @internal
    */
  def setMatrices(): Boolean = js.native
  
  /**
    * @internal
    */
  def setMatrix2x2(): Boolean = js.native
  
  /**
    * @internal
    */
  def setMatrix3x3(): Boolean = js.native
  
  def setRasterizerState(): Unit = js.native
  
  /**
    * Sets a texture to the according uniform.
    * @param channel The texture channel
    * @param unused unused parameter
    * @param texture The texture to apply
    * @param name The name of the uniform in the effect
    */
  def setTexture(
    channel: Double,
    unused: Nullable[WebGLUniformLocation],
    texture: Nullable[BaseTexture],
    name: String
  ): Unit = js.native
  
  /** Gets the supported extensions by the WebGPU adapter */
  def supportedExtensions: Immutable[js.Array[GPUFeatureName]] = js.native
  
  /**
    * @internal
    */
  def updateAndBindInstancesBuffer(): Unit = js.native
  
  /**
    * Wraps an external web gl texture in a Babylon texture.
    * @returns the babylon internal texture
    */
  def wrapWebGLTexture(): InternalTexture = js.native
  
  /**
    * Wraps an external web gpu texture in a Babylon texture.
    * @param texture defines the external texture
    * @returns the babylon internal texture
    */
  def wrapWebGPUTexture(texture: GPUTexture): InternalTexture = js.native
}
