package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The engine class is responsible for interfacing with all lower-level APIs such as WebGL and Audio
  */
@JSGlobal("BABYLON.Engine")
@js.native
class Engine protected () extends js.Object {
  /**
    * Creates a new engine
    * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which alreay used the WebGL context
    * @param antialias defines enable antialiasing (default: false)
    * @param options defines further options to be sent to the getContext() function
    * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
    */
  def this(canvasOrContext: Nullable[babylonjsLib.HTMLCanvasElement | babylonjsLib.WebGLRenderingContext]) = this()
  def this(canvasOrContext: Nullable[babylonjsLib.HTMLCanvasElement | babylonjsLib.WebGLRenderingContext], antialias: scala.Boolean) = this()
  def this(canvasOrContext: Nullable[babylonjsLib.HTMLCanvasElement | babylonjsLib.WebGLRenderingContext], antialias: scala.Boolean, options: EngineOptions) = this()
  def this(canvasOrContext: Nullable[babylonjsLib.HTMLCanvasElement | babylonjsLib.WebGLRenderingContext], antialias: scala.Boolean, options: EngineOptions, adaptToDeviceRatio: scala.Boolean) = this()
  var _activateCurrentTexture: js.Any = js.native
  /** @hidden */
  var _activeChannel: scala.Double = js.native
  var _activeRenderLoops: js.Any = js.native
  var _activeRequests: js.Any = js.native
  /** @hidden */
  var _alphaMode: scala.Double = js.native
  /** @hidden */
  var _alphaState: _AlphaState = js.native
  /** @hidden */
  var _badDesktopOS: scala.Boolean = js.native
  /** @hidden */
  var _badOS: scala.Boolean = js.native
  var _bindIndexBufferWithCache: js.Any = js.native
  var _bindSamplerUniformToChannel: js.Any = js.native
  var _bindVertexBuffersAttributes: js.Any = js.native
  var _bindedRenderFunction: js.Any = js.native
  /** @hidden */
  var _boundTexturesCache: org.scalablytyped.runtime.StringDictionary[Nullable[InternalTexture]] = js.native
  var _boundUniforms: js.Any = js.native
  /** @hidden */
  var _cachedEffectForVertexBuffers: Nullable[Effect] = js.native
  /** @hidden */
  var _cachedIndexBuffer: Nullable[babylonjsLib.WebGLBuffer] = js.native
  var _cachedVertexArrayObject: js.Any = js.native
  /** @hidden */
  var _cachedVertexBuffers: js.Any = js.native
  /** @hidden */
  var _cachedViewport: Nullable[Viewport] = js.native
  var _canRenderToFloatFramebuffer: js.Any = js.native
  var _canRenderToFramebuffer: js.Any = js.native
  var _canRenderToHalfFloatFramebuffer: js.Any = js.native
  /** @hidden */
  var _caps: EngineCapabilities = js.native
  var _cascadeLoadFiles: js.Any = js.native
  var _cascadeLoadImgs: js.Any = js.native
  var _colorWrite: js.Any = js.native
  var _compileRawShader: js.Any = js.native
  var _compileShader: js.Any = js.native
  var _compiledEffects: js.Any = js.native
  var _contextWasLost: js.Any = js.native
  var _convertRGBtoRGBATextureData: js.Any = js.native
  /**
    * Creates a depth stencil cube texture.
    * This is only available in WebGL 2.
    * @param size The size of face edge in the cube texture.
    * @param options The options defining the cube texture.
    * @returns The cube texture
    */
  var _createDepthStencilCubeTexture: js.Any = js.native
  /**
    * Creates a depth stencil texture.
    * This is only available in WebGL 2 or with the depth texture extension available.
    * @param size The size of face edge in the texture.
    * @param options The options defining the texture.
    * @returns The texture
    */
  var _createDepthStencilTexture: js.Any = js.native
  var _createShaderProgram: js.Any = js.native
  var _currentBoundBuffer: js.Any = js.native
  var _currentBufferPointers: js.Any = js.native
  /** @hidden */
  var _currentEffect: Nullable[Effect] = js.native
  /** @hidden */
  var _currentFramebuffer: Nullable[stdLib.WebGLFramebuffer] = js.native
  var _currentInstanceBuffers: js.Any = js.native
  var _currentInstanceLocations: js.Any = js.native
  /** @hidden */
  var _currentNonTimestampToken: Nullable[_TimeToken] = js.native
  /** @hidden */
  var _currentProgram: Nullable[babylonjsLib.WebGLProgram] = js.native
  /** @hidden */
  var _currentRenderTarget: Nullable[InternalTexture] = js.native
  var _currentTextureChannel: js.Any = js.native
  var _deltaTime: js.Any = js.native
  /** @hidden */
  var _depthCullingState: _DepthCullingState = js.native
  var _deterministicLockstep: js.Any = js.native
  var _doNotHandleContextLost: js.Any = js.native
  /** @hidden */
  var _drawCalls: PerfCounter = js.native
  var _drawMode: js.Any = js.native
  var _dummyFramebuffer: js.Any = js.native
  var _emptyCubeTexture: js.Any = js.native
  var _emptyTexture: js.Any = js.native
  var _emptyTexture3D: js.Any = js.native
  var _externalData: js.Any = js.native
  var _firstBoundInternalTextureTracker: js.Any = js.native
  var _fps: js.Any = js.native
  var _frameHandler: js.Any = js.native
  var _getCorrectTextureChannel: js.Any = js.native
  var _getInternalFormat: js.Any = js.native
  var _getSamplingParameters: js.Any = js.native
  var _getTextureWrapMode: js.Any = js.native
  var _getVRDisplaysAsync: js.Any = js.native
  /** @hidden */
  var _gl: babylonjsLib.WebGLRenderingContext = js.native
  var _glRenderer: js.Any = js.native
  var _glVendor: js.Any = js.native
  var _glVersion: js.Any = js.native
  var _hardwareScalingLevel: js.Any = js.native
  var _initGLContext: js.Any = js.native
  var _internalTexturesCache: js.Array[InternalTexture] = js.native
  var _isStencilEnable: js.Any = js.native
  var _lastBoundInternalTextureTracker: js.Any = js.native
  var _linkTrackers: js.Any = js.native
  var _loadingScreen: js.Any = js.native
  var _lockstepMaxSteps: js.Any = js.native
  var _maxSimultaneousTextures: js.Any = js.native
  var _measureFps: js.Any = js.native
  var _moveBoundTextureOnTop: js.Any = js.native
  var _mustWipeVertexAttributes: js.Any = js.native
  var _nextFreeTextureSlots: js.Any = js.native
  var _oldHardwareScaleFactor: js.Any = js.native
  var _oldSize: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onCanvasBlur: js.Any = js.native
  var _onCanvasFocus: js.Any = js.native
  var _onCanvasPointerOut: js.Any = js.native
  var _onContextLost: js.Any = js.native
  var _onContextRestored: js.Any = js.native
  var _onFocus: js.Any = js.native
  var _onFullscreenChange: js.Any = js.native
  var _onPointerLockChange: js.Any = js.native
  var _onVRDisplayPointerRestricted: js.Any = js.native
  var _onVRDisplayPointerUnrestricted: js.Any = js.native
  var _onVRFullScreenTriggered: js.Any = js.native
  var _onVrDisplayConnect: js.Any = js.native
  var _onVrDisplayDisconnect: js.Any = js.native
  var _onVrDisplayPresentChange: js.Any = js.native
  var _partialLoadFile: js.Any = js.native
  var _partialLoadImg: js.Any = js.native
  var _performanceMonitor: js.Any = js.native
  var _pointerLockRequested: js.Any = js.native
  var _prepareWebGLTexture: js.Any = js.native
  var _prepareWebGLTextureContinuation: js.Any = js.native
  var _prepareWorkingCanvas: js.Any = js.native
  var _rebuildBuffers: js.Any = js.native
  var _rebuildEffects: js.Any = js.native
  var _rebuildInternalTextures: js.Any = js.native
  var _removeDesignatedSlot: js.Any = js.native
  var _renderingCanvas: js.Any = js.native
  var _renderingQueueLaunched: js.Any = js.native
  var _rescalePostProcess: js.Any = js.native
  var _rescaleTexture: js.Any = js.native
  var _resetIndexBufferBinding: js.Any = js.native
  var _resetVertexBufferBinding: js.Any = js.native
  var _setTexture: js.Any = js.native
  var _setTextureParameterFloat: js.Any = js.native
  var _setTextureParameterInteger: js.Any = js.native
  var _setupDepthStencilTexture: js.Any = js.native
  var _setupFramebufferDepthAttachments: js.Any = js.native
  /** @hidden */
  var _stencilState: _StencilState = js.native
  /** @hidden */
  var _textureCollisions: PerfCounter = js.native
  var _textureFormatInUse: js.Any = js.native
  var _textureUnits: js.Any = js.native
  var _texturesSupported: js.Any = js.native
  var _uintIndicesCurrentlySet: js.Any = js.native
  var _unbindVertexArrayObject: js.Any = js.native
  /** @hidden */
  var _uniformBuffers: js.Array[UniformBuffer] = js.native
  var _unpackFlipYCached: js.Any = js.native
  var _vaoRecordInProgress: js.Any = js.native
  var _vertexAttribArraysEnabled: js.Any = js.native
  var _vertexAttribPointer: js.Any = js.native
  var _videoTextureSupported: js.Any = js.native
  var _viewportCached: js.Any = js.native
  var _vrDisplay: js.Any = js.native
  var _vrExclusivePointerMode: js.Any = js.native
  var _vrSupported: js.Any = js.native
  var _webGLVersion: js.Any = js.native
  var _webVRInitPromise: js.Any = js.native
  var _windowIsBackground: js.Any = js.native
  var _workingCanvas: js.Any = js.native
  var _workingContext: js.Any = js.native
  var bindBuffer: js.Any = js.native
  var bindIndexBuffer: js.Any = js.native
  var bindUnboundFramebuffer: js.Any = js.native
  /**
    * Gets or sets a boolean indicating if back faces must be culled (true by default)
    */
  var cullBackFaces: scala.Boolean = js.native
  /**
    * Gets the current viewport
    */
  val currentViewport: Nullable[Viewport] = js.native
  /**
    * Gets or sets a boolean to enable/disable checking manifest if IndexedDB support is enabled (Babylon.js will always consider the database is up to date)
    **/
  var disableManifestCheck: scala.Boolean = js.native
  /**
    * Turn this value on if you want to pause FPS computation when in background
    */
  var disablePerformanceMonitorInBackground: scala.Boolean = js.native
  /**
    * Gets or sets a value indicating if we want to disable texture binding optmization.
    * This could be required on some buggy drivers which wants to have textures bound in a progressive order.
    * By default Babylon.js will try to let textures bound where they are and only update the samplers to point where the texture is
    */
  var disableTextureBindingOptimization: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating that uniform buffers must be disabled even if they are supported
    */
  var disableUniformBuffers: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating if resources should be retained to be able to handle context lost events
    * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#handling-webgl-context-lost
    */
  var doNotHandleContextLost: scala.Boolean = js.native
  /** @hidden */
  val drawCalls: scala.Double = js.native
  /** @hidden */
  val drawCallsPerfCounter: Nullable[PerfCounter] = js.native
  /**
    * Gets the default empty cube texture
    */
  val emptyCubeTexture: InternalTexture = js.native
  /**
    * Gets the default empty texture
    */
  val emptyTexture: InternalTexture = js.native
  /**
    * Gets the default empty 3D texture
    */
  val emptyTexture3D: InternalTexture = js.native
  /**
    * Gets or sets a boolean to enable/disable IndexedDB support and avoid XHR on .manifest
    **/
  var enableOfflineSupport: scala.Boolean = js.native
  /**
    * In case you are sharing the context with other applications, it might
    * be interested to not cache the unpack flip y state to ensure a consistent
    * value would be set.
    */
  var enableUnpackFlipYCached: scala.Boolean = js.native
  /**
    * Gets or sets a boolean that indicates if textures must be forced to power of 2 size even if not required
    */
  var forcePOTTextures: scala.Boolean = js.native
  /**
    * Gets a boolean indicating if the engine is currently rendering in fullscreen mode
    */
  var isFullscreen: scala.Boolean = js.native
  /**
    * Gets a boolean indicating that the engine is currently in VR exclusive mode for the pointers
    * @see https://docs.microsoft.com/en-us/microsoft-edge/webvr/essentials#mouse-input
    */
  val isInVRExclusivePointerMode: scala.Boolean = js.native
  /**
    * Gets a boolean indicating if the pointer is currently locked
    */
  var isPointerLock: scala.Boolean = js.native
  /**
    * Returns true if the stencil buffer has been enabled through the creation option of the context.
    */
  val isStencilEnable: scala.Boolean = js.native
  /**
    * Gets the current loading screen object
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  /**
    * Sets the current loading screen object
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  var loadingScreen: ILoadingScreen = js.native
  /**
    * Sets the current loading screen background color
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  var loadingUIBackgroundColor: java.lang.String = js.native
  /**
    * Sets the current loading screen text
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  var loadingUIText: java.lang.String = js.native
  /**
    * Gets a boolean indicating that only power of 2 textures are supported
    * Please note that you can still use non power of 2 textures but in this case the engine will forcefully convert them
    */
  val needPOTTextures: scala.Boolean = js.native
  /**
    * Observable raised when the engine has jsut compiled a shader
    */
  var onAfterShaderCompilationObservable: Observable[Engine] = js.native
  /**
    * Observable raised when the engine is about to compile a shader
    */
  var onBeforeShaderCompilationObservable: Observable[Engine] = js.native
  /**
    * Observable event triggered before each texture is initialized
    */
  var onBeforeTextureInitObservable: Observable[Texture] = js.native
  /**
    * Observable raised when the engine begins a new frame
    */
  var onBeginFrameObservable: Observable[Engine] = js.native
  /**
    * Observable event triggered each time the canvas loses focus
    */
  var onCanvasBlurObservable: Observable[Engine] = js.native
  /**
    * Observable event triggered each time the canvas gains focus
    */
  var onCanvasFocusObservable: Observable[Engine] = js.native
  /**
    * Observable event triggered each time the canvas receives pointerout event
    */
  var onCanvasPointerOutObservable: Observable[stdLib.PointerEvent] = js.native
  /**
    * Observable signaled when a context lost event is raised
    */
  var onContextLostObservable: Observable[Engine] = js.native
  /**
    * Observable signaled when a context restored event is raised
    */
  var onContextRestoredObservable: Observable[Engine] = js.native
  /**
    * Observable raised when the engine ends the current frame
    */
  var onEndFrameObservable: Observable[Engine] = js.native
  /**
    * Observable event triggered each time the rendering canvas is resized
    */
  var onResizeObservable: Observable[Engine] = js.native
  /**
    * Observable signaled when VR display mode changes
    */
  var onVRDisplayChangedObservable: Observable[IDisplayChangedEventArgs] = js.native
  /**
    * Observable signaled when VR request present is complete
    */
  var onVRRequestPresentComplete: Observable[scala.Boolean] = js.native
  /**
    * Observable signaled when VR request present starts
    */
  var onVRRequestPresentStart: Observable[Engine] = js.native
  /**
    * Gets the performance monitor attached to this engine
    * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
    */
  val performanceMonitor: PerformanceMonitor = js.native
  /**
    * Gets the list of created postprocesses
    */
  var postProcesses: js.Array[PostProcess] = js.native
  /**
    * Defines whether the engine has been created with the premultipliedAlpha option on or not.
    */
  val premultipliedAlpha: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating that cache can be kept between frames
    */
  var preventCacheWipeBetweenFrames: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating if the engine must keep rendering even if the window is not in foregroun
    */
  var renderEvenInBackground: scala.Boolean = js.native
  /**
    * Gets the list of created scenes
    */
  var scenes: js.Array[Scene] = js.native
  var setProgram: js.Any = js.native
  /**
    * Gets a boolean indicating that the engine supports uniform buffers
    * @see http://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
    */
  val supportsUniformBuffers: scala.Boolean = js.native
  /**
    * Gets the list of texture formats in use
    */
  val textureFormatInUse: Nullable[java.lang.String] = js.native
  /**
    * Gets the list of texture formats supported
    */
  val texturesSupported: js.Array[java.lang.String] = js.native
  /** Gets or sets a boolean indicating if the engine should validate programs after compilation */
  var validateShaderPrograms: scala.Boolean = js.native
  /**
    * Gets version of the current webGL context
    */
  val webGLVersion: scala.Double = js.native
  /** @hidden */
  def _bindTexture(channel: scala.Double, texture: Nullable[InternalTexture]): scala.Unit = js.native
  /** @hidden */
  /* protected */ def _bindTextureDirectly(target: scala.Double, texture: Nullable[InternalTexture]): scala.Boolean = js.native
  /* protected */ def _bindTextureDirectly(target: scala.Double, texture: Nullable[InternalTexture], forTextureDataUpdate: scala.Boolean): scala.Boolean = js.native
  /* protected */ def _bindTextureDirectly(
    target: scala.Double,
    texture: Nullable[InternalTexture],
    forTextureDataUpdate: scala.Boolean,
    force: scala.Boolean
  ): scala.Boolean = js.native
  /** @hidden */
  def _createTexture(): stdLib.WebGLTexture = js.native
  /** @hidden */
  def _createTimeQuery(): babylonjsLib.WebGLQuery = js.native
  /** @hidden */
  def _deleteProgram(program: babylonjsLib.WebGLProgram): scala.Unit = js.native
  /** @hidden */
  def _deleteTimeQuery(query: babylonjsLib.WebGLQuery): scala.Unit = js.native
  /** @hidden */
  def _getGlAlgorithmType(algorithmType: scala.Double): scala.Double = js.native
  /** @hidden */
  def _getRGBABufferInternalSizedFormat(`type`: scala.Double): scala.Double = js.native
  def _getRGBABufferInternalSizedFormat(`type`: scala.Double, format: scala.Double): scala.Double = js.native
  /** @hidden */
  def _getRGBAMultiSampleBufferFormat(`type`: scala.Double): scala.Double = js.native
  /** @hidden */
  def _getTimeQueryAvailability(query: babylonjsLib.WebGLQuery): js.Any = js.native
  /** @hidden */
  def _getTimeQueryResult(query: babylonjsLib.WebGLQuery): js.Any = js.native
  /** @hidden */
  def _getUnpackAlignement(): scala.Double = js.native
  /** @hidden */
  def _getWebGLTextureType(`type`: scala.Double): scala.Double = js.native
  /** @hidden */
  def _loadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): IFileRequest = js.native
  def _loadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit]
  ): IFileRequest = js.native
  def _loadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit],
    database: Database
  ): IFileRequest = js.native
  def _loadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit],
    database: Database,
    useArrayBuffer: scala.Boolean
  ): IFileRequest = js.native
  def _loadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit],
    database: Database,
    useArrayBuffer: scala.Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[stdLib.XMLHttpRequest], 
      /* exception */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): IFileRequest = js.native
  /** @hidden */
  def _loadFileAsync(url: java.lang.String): js.Promise[java.lang.String | stdLib.ArrayBuffer] = js.native
  def _loadFileAsync(url: java.lang.String, database: Database): js.Promise[java.lang.String | stdLib.ArrayBuffer] = js.native
  def _loadFileAsync(url: java.lang.String, database: Database, useArrayBuffer: scala.Boolean): js.Promise[java.lang.String | stdLib.ArrayBuffer] = js.native
  /** @hidden */
  def _readTexturePixels(texture: InternalTexture, width: scala.Double, height: scala.Double): stdLib.ArrayBufferView = js.native
  def _readTexturePixels(texture: InternalTexture, width: scala.Double, height: scala.Double, faceIndex: scala.Double): stdLib.ArrayBufferView = js.native
  def _readTexturePixels(
    texture: InternalTexture,
    width: scala.Double,
    height: scala.Double,
    faceIndex: scala.Double,
    level: scala.Double
  ): stdLib.ArrayBufferView = js.native
  def _readTexturePixels(
    texture: InternalTexture,
    width: scala.Double,
    height: scala.Double,
    faceIndex: scala.Double,
    level: scala.Double,
    buffer: Nullable[stdLib.ArrayBufferView]
  ): stdLib.ArrayBufferView = js.native
  /** @hidden */
  def _releaseBuffer(buffer: babylonjsLib.WebGLBuffer): scala.Boolean = js.native
  /** @hidden */
  def _releaseEffect(effect: Effect): scala.Unit = js.native
  /** @hidden */
  def _releaseFramebufferObjects(texture: InternalTexture): scala.Unit = js.native
  /** @hidden */
  def _releaseTexture(texture: InternalTexture): scala.Unit = js.native
  /** @hidden */
  def _renderLoop(): scala.Unit = js.native
  /** @hidden */
  def _setAnisotropicLevel(target: scala.Double, texture: BaseTexture): scala.Unit = js.native
  /**
    * @hidden
    */
  def _setCubeMapTextureParams(loadMipmap: scala.Boolean): scala.Unit = js.native
  /** @hidden */
  def _unpackFlipY(value: scala.Boolean): scala.Unit = js.native
  /** @hidden */
  def _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: stdLib.ArrayBufferView): scala.Unit = js.native
  def _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: stdLib.ArrayBufferView, faceIndex: scala.Double): scala.Unit = js.native
  def _uploadArrayBufferViewToTexture(
    texture: InternalTexture,
    imageData: stdLib.ArrayBufferView,
    faceIndex: scala.Double,
    lod: scala.Double
  ): scala.Unit = js.native
  /** @hidden */
  def _uploadCompressedDataToTextureDirectly(
    texture: InternalTexture,
    internalFormat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    data: stdLib.ArrayBufferView
  ): scala.Unit = js.native
  def _uploadCompressedDataToTextureDirectly(
    texture: InternalTexture,
    internalFormat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    data: stdLib.ArrayBufferView,
    faceIndex: scala.Double
  ): scala.Unit = js.native
  def _uploadCompressedDataToTextureDirectly(
    texture: InternalTexture,
    internalFormat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    data: stdLib.ArrayBufferView,
    faceIndex: scala.Double,
    lod: scala.Double
  ): scala.Unit = js.native
  /** @hidden */
  def _uploadDataToTextureDirectly(texture: InternalTexture, imageData: stdLib.ArrayBufferView): scala.Unit = js.native
  def _uploadDataToTextureDirectly(texture: InternalTexture, imageData: stdLib.ArrayBufferView, faceIndex: scala.Double): scala.Unit = js.native
  def _uploadDataToTextureDirectly(
    texture: InternalTexture,
    imageData: stdLib.ArrayBufferView,
    faceIndex: scala.Double,
    lod: scala.Double
  ): scala.Unit = js.native
  /** @hidden */
  def _uploadImageToTexture(texture: InternalTexture, image: stdLib.HTMLImageElement): scala.Unit = js.native
  def _uploadImageToTexture(texture: InternalTexture, image: stdLib.HTMLImageElement, faceIndex: scala.Double): scala.Unit = js.native
  def _uploadImageToTexture(
    texture: InternalTexture,
    image: stdLib.HTMLImageElement,
    faceIndex: scala.Double,
    lod: scala.Double
  ): scala.Unit = js.native
  /** @hidden */
  def _viewport(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Add an externaly attached data from its key.
    * This method call will fail and return false, if such key already exists.
    * If you don't care and just want to get the data no matter what, use the more convenient getOrAddExternalDataWithFactory() method.
    * @param key the unique key that identifies the data
    * @param data the data object to associate to the key for this Engine instance
    * @return true if no such key were already present and the data was added successfully, false otherwise
    */
  def addExternalData[T](key: java.lang.String, data: T): scala.Boolean = js.native
  /**
    * Apply all cached states (depth, culling, stencil and alpha)
    */
  def applyStates(): scala.Unit = js.native
  /**
    * Attach a new callback raised when context lost event is fired
    * @param callback defines the callback to call
    */
  def attachContextLostEvent(callback: js.Function1[/* event */ stdLib.WebGLContextEvent, scala.Unit]): scala.Unit = js.native
  /**
    * Attach a new callback raised when context restored event is fired
    * @param callback defines the callback to call
    */
  def attachContextRestoredEvent(callback: js.Function1[/* event */ stdLib.WebGLContextEvent, scala.Unit]): scala.Unit = js.native
  /**
    * Begin a new frame
    */
  def beginFrame(): scala.Unit = js.native
  /**
    * Initiates an occlusion query
    * @param algorithmType defines the algorithm to use
    * @param query defines the query to use
    * @returns the current engine
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  def beginOcclusionQuery(algorithmType: scala.Double, query: babylonjsLib.WebGLQuery): Engine = js.native
  /**
    * Begins a transform feedback operation
    * @param usePoints defines if points or triangles must be used
    */
  def beginTransformFeedback(usePoints: scala.Boolean): scala.Unit = js.native
  /**
    * Bind a webGL buffer to the webGL context
    * @param buffer defines the buffer to bind
    */
  def bindArrayBuffer(buffer: Nullable[babylonjsLib.WebGLBuffer]): scala.Unit = js.native
  /**
    * Bind a list of vertex buffers to the webGL context
    * @param vertexBuffers defines the list of vertex buffers to bind
    * @param indexBuffer defines the index buffer to bind
    * @param effect defines the effect associated with the vertex buffers
    */
  def bindBuffers(
    vertexBuffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]],
    indexBuffer: Nullable[babylonjsLib.WebGLBuffer],
    effect: Effect
  ): scala.Unit = js.native
  /**
    * Bind webGl buffers directly to the webGL context
    * @param vertexBuffer defines the vertex buffer to bind
    * @param indexBuffer defines the index buffer to bind
    * @param vertexDeclaration defines the vertex declaration to use with the vertex buffer
    * @param vertexStrideSize defines the vertex stride of the vertex buffer
    * @param effect defines the effect associated with the vertex buffer
    */
  def bindBuffersDirectly(
    vertexBuffer: babylonjsLib.WebGLBuffer,
    indexBuffer: babylonjsLib.WebGLBuffer,
    vertexDeclaration: js.Array[scala.Double],
    vertexStrideSize: scala.Double,
    effect: Effect
  ): scala.Unit = js.native
  /**
    * Binds the frame buffer to the specified texture.
    * @param texture The texture to render to or null for the default canvas
    * @param faceIndex The face of the texture to render to in case of cube texture
    * @param requiredWidth The width of the target to render to
    * @param requiredHeight The height of the target to render to
    * @param forceFullscreenViewport Forces the viewport to be the entire texture/screen if true
    * @param depthStencilTexture The depth stencil texture to use to render
    * @param lodLevel defines le lod level to bind to the frame buffer
    */
  def bindFramebuffer(
    texture: InternalTexture,
    faceIndex: js.UndefOr[scala.Double],
    requiredWidth: js.UndefOr[scala.Double],
    requiredHeight: js.UndefOr[scala.Double],
    forceFullscreenViewport: js.UndefOr[scala.Boolean],
    depthStencilTexture: js.UndefOr[InternalTexture],
    lodLevel: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
  /**
    * Binds an effect to the webGL context
    * @param effect defines the effect to bind
    */
  def bindSamplers(effect: Effect): scala.Unit = js.native
  /**
    * Bind a webGL transform feedback object to the webgl context
    * @param value defines the webGL transform feedback object to bind
    */
  def bindTransformFeedback(value: Nullable[babylonjsLib.WebGLTransformFeedback]): scala.Unit = js.native
  /**
    * Bind a webGL buffer for a transform feedback operation
    * @param value defines the webGL buffer to bind
    */
  def bindTransformFeedbackBuffer(value: Nullable[babylonjsLib.WebGLBuffer]): scala.Unit = js.native
  /**
    * Bind a specific block at a given index in a specific shader program
    * @param shaderProgram defines the shader program
    * @param blockName defines the block name
    * @param index defines the index where to bind the block
    */
  def bindUniformBlock(shaderProgram: babylonjsLib.WebGLProgram, blockName: java.lang.String, index: scala.Double): scala.Unit = js.native
  /**
    * Bind an uniform buffer to the current webGL context
    * @param buffer defines the buffer to bind
    */
  def bindUniformBuffer(buffer: Nullable[babylonjsLib.WebGLBuffer]): scala.Unit = js.native
  /**
    * Bind a buffer to the current webGL context at a given location
    * @param buffer defines the buffer to bind
    * @param location defines the index where to bind the buffer
    */
  def bindUniformBufferBase(buffer: babylonjsLib.WebGLBuffer, location: scala.Double): scala.Unit = js.native
  /**
    * Bind a specific vertex array object
    * @see http://doc.babylonjs.com/features/webgl2#vertex-array-objects
    * @param vertexArrayObject defines the vertex array object to bind
    * @param indexBuffer defines the index buffer to bind
    */
  def bindVertexArrayObject(
    vertexArrayObject: babylonjsLib.WebGLVertexArrayObject,
    indexBuffer: Nullable[babylonjsLib.WebGLBuffer]
  ): scala.Unit = js.native
  /**
    * Clear the current render buffer or the current render target (if any is set up)
    * @param color defines the color to use
    * @param backBuffer defines if the back buffer must be cleared
    * @param depth defines if the depth buffer must be cleared
    * @param stencil defines if the stencil buffer must be cleared
    */
  def clear(color: Nullable[Color4], backBuffer: scala.Boolean, depth: scala.Boolean): scala.Unit = js.native
  def clear(color: Nullable[Color4], backBuffer: scala.Boolean, depth: scala.Boolean, stencil: scala.Boolean): scala.Unit = js.native
  /**
    * Clears the list of texture accessible through engine.
    * This can help preventing texture load conflict due to name collision.
    */
  def clearInternalTexturesCache(): scala.Unit = js.native
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
    * @returns the cube texture as an InternalTexture
    */
  def createCubeTexture(
    rootUrl: java.lang.String,
    scene: Nullable[Scene],
    files: Nullable[js.Array[java.lang.String]],
    noMipmap: js.UndefOr[scala.Boolean],
    onLoad: js.UndefOr[Nullable[js.Function1[/* data */ js.UndefOr[_], scala.Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function2[
          /* message */ js.UndefOr[java.lang.String], 
          /* exception */ js.UndefOr[_], 
          scala.Unit
        ]
      ]
    ],
    format: js.UndefOr[scala.Double],
    forcedExtension: js.UndefOr[js.Any],
    createPolynomials: js.UndefOr[scala.Boolean],
    lodScale: js.UndefOr[scala.Double],
    lodOffset: js.UndefOr[scala.Double],
    fallback: js.UndefOr[Nullable[InternalTexture]]
  ): InternalTexture = js.native
  def createDepthStencilTexture(size: babylonjsLib.Anon_Height, options: DepthTextureCreationOptions): InternalTexture = js.native
  /**
    * Creates a depth stencil texture.
    * This is only available in WebGL 2 or with the depth texture extension available.
    * @param size The size of face edge in the texture.
    * @param options The options defining the texture.
    * @returns The texture
    */
  def createDepthStencilTexture(size: scala.Double, options: DepthTextureCreationOptions): InternalTexture = js.native
  /**
    * Creates a dynamic texture
    * @param width defines the width of the texture
    * @param height defines the height of the texture
    * @param generateMipMaps defines if the engine should generate the mip levels
    * @param samplingMode defines the required sampling mode (BABYLON.Texture.NEAREST_SAMPLINGMODE by default)
    * @returns the dynamic texture inside an InternalTexture
    */
  def createDynamicTexture(
    width: scala.Double,
    height: scala.Double,
    generateMipMaps: scala.Boolean,
    samplingMode: scala.Double
  ): InternalTexture = js.native
  /**
    * Create a dynamic uniform buffer
    * @see http://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
    * @param elements defines the content of the uniform buffer
    * @returns the webGL uniform buffer
    */
  def createDynamicUniformBuffer(elements: FloatArray): babylonjsLib.WebGLBuffer = js.native
  /**
    * Creates a dynamic vertex buffer
    * @param data the data for the dynamic vertex buffer
    * @returns the new WebGL dynamic buffer
    */
  def createDynamicVertexBuffer(data: DataArray): babylonjsLib.WebGLBuffer = js.native
  def createEffect(
    baseName: js.Any,
    attributesNamesOrOptions: EffectCreationOptions,
    uniformsNamesOrEngine: Engine,
    samplers: js.UndefOr[js.Array[java.lang.String]],
    defines: js.UndefOr[java.lang.String],
    fallbacks: js.UndefOr[EffectFallbacks],
    onCompiled: js.UndefOr[js.Function1[/* effect */ Effect, scala.Unit]],
    onError: js.UndefOr[js.Function2[/* effect */ Effect, /* errors */ java.lang.String, scala.Unit]],
    indexParameters: js.UndefOr[js.Any]
  ): Effect = js.native
  def createEffect(
    baseName: js.Any,
    attributesNamesOrOptions: EffectCreationOptions,
    uniformsNamesOrEngine: js.Array[java.lang.String],
    samplers: js.UndefOr[js.Array[java.lang.String]],
    defines: js.UndefOr[java.lang.String],
    fallbacks: js.UndefOr[EffectFallbacks],
    onCompiled: js.UndefOr[js.Function1[/* effect */ Effect, scala.Unit]],
    onError: js.UndefOr[js.Function2[/* effect */ Effect, /* errors */ java.lang.String, scala.Unit]],
    indexParameters: js.UndefOr[js.Any]
  ): Effect = js.native
  def createEffect(
    baseName: js.Any,
    attributesNamesOrOptions: js.Array[java.lang.String],
    uniformsNamesOrEngine: Engine,
    samplers: js.UndefOr[js.Array[java.lang.String]],
    defines: js.UndefOr[java.lang.String],
    fallbacks: js.UndefOr[EffectFallbacks],
    onCompiled: js.UndefOr[js.Function1[/* effect */ Effect, scala.Unit]],
    onError: js.UndefOr[js.Function2[/* effect */ Effect, /* errors */ java.lang.String, scala.Unit]],
    indexParameters: js.UndefOr[js.Any]
  ): Effect = js.native
  /**
    * Create a new effect (used to store vertex/fragment shaders)
    * @param baseName defines the base name of the effect (The name of file without .fragment.fx or .vertex.fx)
    * @param attributesNamesOrOptions defines either a list of attribute names or an EffectCreationOptions object
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
    attributesNamesOrOptions: js.Array[java.lang.String],
    uniformsNamesOrEngine: js.Array[java.lang.String],
    samplers: js.UndefOr[js.Array[java.lang.String]],
    defines: js.UndefOr[java.lang.String],
    fallbacks: js.UndefOr[EffectFallbacks],
    onCompiled: js.UndefOr[js.Function1[/* effect */ Effect, scala.Unit]],
    onError: js.UndefOr[js.Function2[/* effect */ Effect, /* errors */ java.lang.String, scala.Unit]],
    indexParameters: js.UndefOr[js.Any]
  ): Effect = js.native
  /**
    * Create an effect to use with particle systems.
    * Please note that some parameters like animation sheets or not being billboard are not supported in this configuration
    * @param fragmentName defines the base name of the effect (The name of file without .fragment.fx)
    * @param uniformsNames defines a list of attribute names
    * @param samplers defines an array of string used to represent textures
    * @param defines defines the string containing the defines to use to compile the shaders
    * @param fallbacks defines the list of potential fallbacks to use if shader conmpilation fails
    * @param onCompiled defines a function to call when the effect creation is successful
    * @param onError defines a function to call when the effect creation has failed
    * @returns the new Effect
    */
  def createEffectForParticles(
    fragmentName: java.lang.String,
    uniformsNames: js.Array[java.lang.String],
    samplers: js.Array[java.lang.String],
    defines: java.lang.String
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: java.lang.String,
    uniformsNames: js.Array[java.lang.String],
    samplers: js.Array[java.lang.String],
    defines: java.lang.String,
    fallbacks: EffectFallbacks
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: java.lang.String,
    uniformsNames: js.Array[java.lang.String],
    samplers: js.Array[java.lang.String],
    defines: java.lang.String,
    fallbacks: EffectFallbacks,
    onCompiled: js.Function1[/* effect */ Effect, scala.Unit]
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: java.lang.String,
    uniformsNames: js.Array[java.lang.String],
    samplers: js.Array[java.lang.String],
    defines: java.lang.String,
    fallbacks: EffectFallbacks,
    onCompiled: js.Function1[/* effect */ Effect, scala.Unit],
    onError: js.Function2[/* effect */ Effect, /* errors */ java.lang.String, scala.Unit]
  ): Effect = js.native
  /**
    * Creates a new index buffer
    * @param indices defines the content of the index buffer
    * @param updatable defines if the index buffer must be updatable
    * @returns a new webGL buffer
    */
  def createIndexBuffer(indices: IndicesArray): babylonjsLib.WebGLBuffer = js.native
  def createIndexBuffer(indices: IndicesArray, updatable: scala.Boolean): babylonjsLib.WebGLBuffer = js.native
  /**
    * Creates a webGL buffer to use with instanciation
    * @param capacity defines the size of the buffer
    * @returns the webGL buffer
    */
  def createInstancesBuffer(capacity: scala.Double): babylonjsLib.WebGLBuffer = js.native
  /**
    * Create a multi render target texture
    * @see http://doc.babylonjs.com/features/webgl2#multiple-render-target
    * @param size defines the size of the texture
    * @param options defines the creation options
    * @returns the cube texture as an InternalTexture
    */
  def createMultipleRenderTarget(size: js.Any, options: IMultiRenderTargetOptions): js.Array[InternalTexture] = js.native
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
  def createPrefilteredCubeTexture(rootUrl: java.lang.String, scene: Nullable[Scene], lodScale: scala.Double, lodOffset: scala.Double): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: java.lang.String,
    scene: Nullable[Scene],
    lodScale: scala.Double,
    lodOffset: scala.Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], scala.Unit]]
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: java.lang.String,
    scene: Nullable[Scene],
    lodScale: scala.Double,
    lodOffset: scala.Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], scala.Unit]],
    onError: Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ]
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: java.lang.String,
    scene: Nullable[Scene],
    lodScale: scala.Double,
    lodOffset: scala.Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], scala.Unit]],
    onError: Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ],
    format: scala.Double
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: java.lang.String,
    scene: Nullable[Scene],
    lodScale: scala.Double,
    lodOffset: scala.Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], scala.Unit]],
    onError: Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ],
    format: scala.Double,
    forcedExtension: js.Any
  ): InternalTexture = js.native
  def createPrefilteredCubeTexture(
    rootUrl: java.lang.String,
    scene: Nullable[Scene],
    lodScale: scala.Double,
    lodOffset: scala.Double,
    onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], scala.Unit]],
    onError: Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ],
    format: scala.Double,
    forcedExtension: js.Any,
    createPolynomials: scala.Boolean
  ): InternalTexture = js.native
  /**
    * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
    * @return the new query
    */
  def createQuery(): babylonjsLib.WebGLQuery = js.native
  /**
    * Creates a new raw cube texture
    * @param data defines the array of data to use to create each face
    * @param size defines the size of the textures
    * @param format defines the format of the data
    * @param type defines the type of the data (like BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT)
    * @param generateMipMaps  defines if the engine should generate the mip levels
    * @param invertY defines if data must be stored with Y axis inverted
    * @param samplingMode defines the required sampling mode (like BABYLON.Texture.NEAREST_SAMPLINGMODE)
    * @param compression defines the compression used (null by default)
    * @returns the cube texture as an InternalTexture
    */
  def createRawCubeTexture(
    data: Nullable[js.Array[stdLib.ArrayBufferView]],
    size: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    generateMipMaps: scala.Boolean,
    invertY: scala.Boolean,
    samplingMode: scala.Double
  ): InternalTexture = js.native
  def createRawCubeTexture(
    data: Nullable[js.Array[stdLib.ArrayBufferView]],
    size: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    generateMipMaps: scala.Boolean,
    invertY: scala.Boolean,
    samplingMode: scala.Double,
    compression: Nullable[java.lang.String]
  ): InternalTexture = js.native
  /**
    * Creates a new raw cube texture from a specified url
    * @param url defines the url where the data is located
    * @param scene defines the current scene
    * @param size defines the size of the textures
    * @param format defines the format of the data
    * @param type defines the type fo the data (like BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT)
    * @param noMipmap defines if the engine should avoid generating the mip levels
    * @param callback defines a callback used to extract texture data from loaded data
    * @param mipmapGenerator defines to provide an optional tool to generate mip levels
    * @param onLoad defines a callback called when texture is loaded
    * @param onError defines a callback called if there is an error
    * @param samplingMode defines the required sampling mode (like BABYLON.Texture.NEAREST_SAMPLINGMODE)
    * @param invertY defines if data must be stored with Y axis inverted
    * @returns the cube texture as an InternalTexture
    */
  def createRawCubeTextureFromUrl(
    url: java.lang.String,
    scene: Scene,
    size: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    noMipmap: scala.Boolean,
    callback: js.Function1[/* ArrayBuffer */ stdLib.ArrayBuffer, Nullable[js.Array[stdLib.ArrayBufferView]]],
    mipmapGenerator: Nullable[
      js.Function1[
        /* faces */ js.Array[stdLib.ArrayBufferView], 
        js.Array[js.Array[stdLib.ArrayBufferView]]
      ]
    ]
  ): InternalTexture = js.native
  def createRawCubeTextureFromUrl(
    url: java.lang.String,
    scene: Scene,
    size: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    noMipmap: scala.Boolean,
    callback: js.Function1[/* ArrayBuffer */ stdLib.ArrayBuffer, Nullable[js.Array[stdLib.ArrayBufferView]]],
    mipmapGenerator: Nullable[
      js.Function1[
        /* faces */ js.Array[stdLib.ArrayBufferView], 
        js.Array[js.Array[stdLib.ArrayBufferView]]
      ]
    ],
    onLoad: Nullable[js.Function0[scala.Unit]]
  ): InternalTexture = js.native
  def createRawCubeTextureFromUrl(
    url: java.lang.String,
    scene: Scene,
    size: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    noMipmap: scala.Boolean,
    callback: js.Function1[/* ArrayBuffer */ stdLib.ArrayBuffer, Nullable[js.Array[stdLib.ArrayBufferView]]],
    mipmapGenerator: Nullable[
      js.Function1[
        /* faces */ js.Array[stdLib.ArrayBufferView], 
        js.Array[js.Array[stdLib.ArrayBufferView]]
      ]
    ],
    onLoad: Nullable[js.Function0[scala.Unit]],
    onError: Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ]
  ): InternalTexture = js.native
  def createRawCubeTextureFromUrl(
    url: java.lang.String,
    scene: Scene,
    size: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    noMipmap: scala.Boolean,
    callback: js.Function1[/* ArrayBuffer */ stdLib.ArrayBuffer, Nullable[js.Array[stdLib.ArrayBufferView]]],
    mipmapGenerator: Nullable[
      js.Function1[
        /* faces */ js.Array[stdLib.ArrayBufferView], 
        js.Array[js.Array[stdLib.ArrayBufferView]]
      ]
    ],
    onLoad: Nullable[js.Function0[scala.Unit]],
    onError: Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ],
    samplingMode: scala.Double
  ): InternalTexture = js.native
  def createRawCubeTextureFromUrl(
    url: java.lang.String,
    scene: Scene,
    size: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    noMipmap: scala.Boolean,
    callback: js.Function1[/* ArrayBuffer */ stdLib.ArrayBuffer, Nullable[js.Array[stdLib.ArrayBufferView]]],
    mipmapGenerator: Nullable[
      js.Function1[
        /* faces */ js.Array[stdLib.ArrayBufferView], 
        js.Array[js.Array[stdLib.ArrayBufferView]]
      ]
    ],
    onLoad: Nullable[js.Function0[scala.Unit]],
    onError: Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ],
    samplingMode: scala.Double,
    invertY: scala.Boolean
  ): InternalTexture = js.native
  /**
    * Directly creates a webGL program
    * @param vertexCode defines the vertex shader code to use
    * @param fragmentCode defines the fragment shader code to use
    * @param context defines the webGL context to use (if not set, the current one will be used)
    * @param transformFeedbackVaryings defines the list of transform feedback varyings to use
    * @returns the new webGL program
    */
  def createRawShaderProgram(vertexCode: java.lang.String, fragmentCode: java.lang.String): babylonjsLib.WebGLProgram = js.native
  def createRawShaderProgram(
    vertexCode: java.lang.String,
    fragmentCode: java.lang.String,
    context: babylonjsLib.WebGLRenderingContext
  ): babylonjsLib.WebGLProgram = js.native
  def createRawShaderProgram(
    vertexCode: java.lang.String,
    fragmentCode: java.lang.String,
    context: babylonjsLib.WebGLRenderingContext,
    transformFeedbackVaryings: Nullable[js.Array[java.lang.String]]
  ): babylonjsLib.WebGLProgram = js.native
  /**
    * Creates a raw texture
    * @param data defines the data to store in the texture
    * @param width defines the width of the texture
    * @param height defines the height of the texture
    * @param format defines the format of the data
    * @param generateMipMaps defines if the engine should generate the mip levels
    * @param invertY defines if data must be stored with Y axis inverted
    * @param samplingMode defines the required sampling mode (BABYLON.Texture.NEAREST_SAMPLINGMODE by default)
    * @param compression defines the compression used (null by default)
    * @param type defines the type fo the data (BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT by default)
    * @returns the raw texture inside an InternalTexture
    */
  def createRawTexture(
    data: Nullable[stdLib.ArrayBufferView],
    width: scala.Double,
    height: scala.Double,
    format: scala.Double,
    generateMipMaps: scala.Boolean,
    invertY: scala.Boolean,
    samplingMode: scala.Double
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[stdLib.ArrayBufferView],
    width: scala.Double,
    height: scala.Double,
    format: scala.Double,
    generateMipMaps: scala.Boolean,
    invertY: scala.Boolean,
    samplingMode: scala.Double,
    compression: Nullable[java.lang.String]
  ): InternalTexture = js.native
  def createRawTexture(
    data: Nullable[stdLib.ArrayBufferView],
    width: scala.Double,
    height: scala.Double,
    format: scala.Double,
    generateMipMaps: scala.Boolean,
    invertY: scala.Boolean,
    samplingMode: scala.Double,
    compression: Nullable[java.lang.String],
    `type`: scala.Double
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
    * @param samplingMode defines the required sampling mode (like BABYLON.Texture.NEAREST_SAMPLINGMODE)
    * @param compression defines the compressed used (can be null)
    * @param textureType defines the compressed used (can be null)
    * @returns a new raw 3D texture (stored in an InternalTexture)
    */
  def createRawTexture3D(
    data: Nullable[stdLib.ArrayBufferView],
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    format: scala.Double,
    generateMipMaps: scala.Boolean,
    invertY: scala.Boolean,
    samplingMode: scala.Double
  ): InternalTexture = js.native
  def createRawTexture3D(
    data: Nullable[stdLib.ArrayBufferView],
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    format: scala.Double,
    generateMipMaps: scala.Boolean,
    invertY: scala.Boolean,
    samplingMode: scala.Double,
    compression: Nullable[java.lang.String]
  ): InternalTexture = js.native
  def createRawTexture3D(
    data: Nullable[stdLib.ArrayBufferView],
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    format: scala.Double,
    generateMipMaps: scala.Boolean,
    invertY: scala.Boolean,
    samplingMode: scala.Double,
    compression: Nullable[java.lang.String],
    textureType: scala.Double
  ): InternalTexture = js.native
  /**
    * Creates a new render target cube texture
    * @param size defines the size of the texture
    * @param options defines the options used to create the texture
    * @returns a new render target cube texture stored in an InternalTexture
    */
  def createRenderTargetCubeTexture(size: scala.Double): InternalTexture = js.native
  def createRenderTargetCubeTexture(size: scala.Double, options: stdLib.Partial[RenderTargetCreationOptions]): InternalTexture = js.native
  def createRenderTargetTexture(size: babylonjsLib.Anon_Height, options: RenderTargetCreationOptions): InternalTexture = js.native
  def createRenderTargetTexture(size: babylonjsLib.Anon_Height, options: scala.Boolean): InternalTexture = js.native
  def createRenderTargetTexture(size: scala.Double, options: RenderTargetCreationOptions): InternalTexture = js.native
  /**
    * Creates a new render target texture
    * @param size defines the size of the texture
    * @param options defines the options used to create the texture
    * @returns a new render target texture stored in an InternalTexture
    */
  def createRenderTargetTexture(size: scala.Double, options: scala.Boolean): InternalTexture = js.native
  /**
    * Creates a webGL program
    * @param vertexCode  defines the vertex shader code to use
    * @param fragmentCode defines the fragment shader code to use
    * @param defines defines the string containing the defines to use to compile the shaders
    * @param context defines the webGL context to use (if not set, the current one will be used)
    * @param transformFeedbackVaryings defines the list of transform feedback varyings to use
    * @returns the new webGL program
    */
  def createShaderProgram(vertexCode: java.lang.String, fragmentCode: java.lang.String, defines: Nullable[java.lang.String]): babylonjsLib.WebGLProgram = js.native
  def createShaderProgram(
    vertexCode: java.lang.String,
    fragmentCode: java.lang.String,
    defines: Nullable[java.lang.String],
    context: babylonjsLib.WebGLRenderingContext
  ): babylonjsLib.WebGLProgram = js.native
  def createShaderProgram(
    vertexCode: java.lang.String,
    fragmentCode: java.lang.String,
    defines: Nullable[java.lang.String],
    context: babylonjsLib.WebGLRenderingContext,
    transformFeedbackVaryings: Nullable[js.Array[java.lang.String]]
  ): babylonjsLib.WebGLProgram = js.native
  /**
    * Usually called from BABYLON.Texture.ts.
    * Passed information to create a WebGLTexture
    * @param urlArg defines a value which contains one of the following:
    * * A conventional http URL, e.g. 'http://...' or 'file://...'
    * * A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
    * * An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
    * @param noMipmap defines a boolean indicating that no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file
    * @param invertY when true, image is flipped when loaded.  You probably want true. Ignored for compressed textures.  Must be flipped in the file
    * @param scene needed for loading to the correct scene
    * @param samplingMode mode with should be used sample / access the texture (Default: BABYLON.Texture.TRILINEAR_SAMPLINGMODE)
    * @param onLoad optional callback to be called upon successful completion
    * @param onError optional callback to be called upon failure
    * @param buffer a source of a file previously fetched as either a base64 string, an ArrayBuffer (compressed or image format), HTMLImageElement (image format), or a Blob
    * @param fallback an internal argument in case the function must be called again, due to etc1 not having alpha capabilities
    * @param format internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures
    * @param forcedExtension defines the extension to use to pick the right loader
    * @returns a InternalTexture for assignment back into BABYLON.Texture
    */
  def createTexture(
    urlArg: Nullable[java.lang.String],
    noMipmap: scala.Boolean,
    invertY: scala.Boolean,
    scene: Nullable[Scene],
    samplingMode: js.UndefOr[scala.Double],
    onLoad: js.UndefOr[Nullable[js.Function0[scala.Unit]]],
    onError: js.UndefOr[
      Nullable[js.Function2[/* message */ java.lang.String, /* exception */ _, scala.Unit]]
    ],
    buffer: js.UndefOr[
      Nullable[java.lang.String | stdLib.ArrayBuffer | stdLib.HTMLImageElement | stdLib.Blob]
    ],
    fallback: js.UndefOr[Nullable[InternalTexture]],
    format: js.UndefOr[Nullable[scala.Double]],
    forcedExtension: js.UndefOr[Nullable[java.lang.String]]
  ): InternalTexture = js.native
  /**
    * Creates a webGL transform feedback object
    * Please makes sure to check webGLVersion property to check if you are running webGL 2+
    * @returns the webGL transform feedback object
    */
  def createTransformFeedback(): babylonjsLib.WebGLTransformFeedback = js.native
  /**
    * Create an uniform buffer
    * @see http://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
    * @param elements defines the content of the uniform buffer
    * @returns the webGL uniform buffer
    */
  def createUniformBuffer(elements: FloatArray): babylonjsLib.WebGLBuffer = js.native
  /**
    * Creates a vertex buffer
    * @param data the data for the vertex buffer
    * @returns the new WebGL static buffer
    */
  def createVertexBuffer(data: DataArray): babylonjsLib.WebGLBuffer = js.native
  /**
    * Delete a webGL buffer used with instanciation
    * @param buffer defines the webGL buffer to delete
    */
  def deleteInstancesBuffer(buffer: babylonjsLib.WebGLBuffer): scala.Unit = js.native
  /**
    * Delete and release a webGL query
    * @param query defines the query to delete
    * @return the current engine
    */
  def deleteQuery(query: babylonjsLib.WebGLQuery): Engine = js.native
  /**
    * Delete a webGL transform feedback object
    * @param value defines the webGL transform feedback object to delete
    */
  def deleteTransformFeedback(value: babylonjsLib.WebGLTransformFeedback): scala.Unit = js.native
  /**
    * Call this function to leave webVR mode
    * Will do nothing if webVR is not supported or if there is no webVR device
    * @see http://doc.babylonjs.com/how_to/webvr_camera
    */
  def disableVR(): scala.Unit = js.native
  /**
    * Display the loading screen
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def displayLoadingUI(): scala.Unit = js.native
  /**
    * Dispose and release all associated resources
    */
  def dispose(): scala.Unit = js.native
  /**
    * Send a draw order
    * @param useTriangles defines if triangles must be used to draw (else wireframe will be used)
    * @param indexStart defines the starting index
    * @param indexCount defines the number of index to draw
    * @param instancesCount defines the number of instances to draw (if instanciation is enabled)
    */
  def draw(useTriangles: scala.Boolean, indexStart: scala.Double, indexCount: scala.Double): scala.Unit = js.native
  def draw(
    useTriangles: scala.Boolean,
    indexStart: scala.Double,
    indexCount: scala.Double,
    instancesCount: scala.Double
  ): scala.Unit = js.native
  /**
    * Draw a list of unindexed primitives
    * @param fillMode defines the primitive to use
    * @param verticesStart defines the index of first vertex to draw
    * @param verticesCount defines the count of vertices to draw
    * @param instancesCount defines the number of instances to draw (if instanciation is enabled)
    */
  def drawArraysType(fillMode: scala.Double, verticesStart: scala.Double, verticesCount: scala.Double): scala.Unit = js.native
  def drawArraysType(
    fillMode: scala.Double,
    verticesStart: scala.Double,
    verticesCount: scala.Double,
    instancesCount: scala.Double
  ): scala.Unit = js.native
  /**
    * Draw a list of indexed primitives
    * @param fillMode defines the primitive to use
    * @param indexStart defines the starting index
    * @param indexCount defines the number of index to draw
    * @param instancesCount defines the number of instances to draw (if instanciation is enabled)
    */
  def drawElementsType(fillMode: scala.Double, indexStart: scala.Double, indexCount: scala.Double): scala.Unit = js.native
  def drawElementsType(
    fillMode: scala.Double,
    indexStart: scala.Double,
    indexCount: scala.Double,
    instancesCount: scala.Double
  ): scala.Unit = js.native
  /**
    * Draw a list of points
    * @param verticesStart defines the index of first vertex to draw
    * @param verticesCount defines the count of vertices to draw
    * @param instancesCount defines the number of instances to draw (if instanciation is enabled)
    */
  def drawPointClouds(verticesStart: scala.Double, verticesCount: scala.Double): scala.Unit = js.native
  def drawPointClouds(verticesStart: scala.Double, verticesCount: scala.Double, instancesCount: scala.Double): scala.Unit = js.native
  /**
    * Draw a list of unindexed primitives
    * @param useTriangles defines if triangles must be used to draw (else wireframe will be used)
    * @param verticesStart defines the index of first vertex to draw
    * @param verticesCount defines the count of vertices to draw
    * @param instancesCount defines the number of instances to draw (if instanciation is enabled)
    */
  def drawUnIndexed(useTriangles: scala.Boolean, verticesStart: scala.Double, verticesCount: scala.Double): scala.Unit = js.native
  def drawUnIndexed(
    useTriangles: scala.Boolean,
    verticesStart: scala.Double,
    verticesCount: scala.Double,
    instancesCount: scala.Double
  ): scala.Unit = js.native
  /**
    * Activates an effect, mkaing it the current one (ie. the one used for rendering)
    * @param effect defines the effect to activate
    */
  def enableEffect(effect: Nullable[Effect]): scala.Unit = js.native
  /**
    * Call this function to switch to webVR mode
    * Will do nothing if webVR is not supported or if there is no webVR device
    * @see http://doc.babylonjs.com/how_to/webvr_camera
    */
  def enableVR(): scala.Unit = js.native
  /**
    * Enf the current frame
    */
  def endFrame(): scala.Unit = js.native
  /**
    * Ends an occlusion query
    * @see http://doc.babylonjs.com/features/occlusionquery
    * @param algorithmType defines the algorithm to use
    * @returns the current engine
    */
  def endOcclusionQuery(algorithmType: scala.Double): Engine = js.native
  /**
    * Ends a time query
    * @param token defines the token used to measure the time span
    * @returns the time spent (in ns)
    */
  def endTimeQuery(token: _TimeToken): int = js.native
  /**
    * Ends a transform feedback operation
    */
  def endTransformFeedback(): scala.Unit = js.native
  /**
    * Force a webGL flush (ie. a flush of all waiting webGL commands)
    */
  def flushFramebuffer(): scala.Unit = js.native
  /**
    * Force the mipmap generation for the given render target texture
    * @param texture defines the render target texture to use
    */
  def generateMipMapsForCubemap(texture: InternalTexture): scala.Unit = js.native
  /**
    * Gets the current alpha mode
    * @see http://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered
    * @returns the current alpha mode
    */
  def getAlphaMode(): scala.Double = js.native
  /**
    * Gets current aspect ratio
    * @param camera defines the camera to use to get the aspect ratio
    * @param useScreen defines if screen size must be used (or the current render target if any)
    * @returns a number defining the aspect ratio
    */
  def getAspectRatio(camera: Camera): scala.Double = js.native
  def getAspectRatio(camera: Camera, useScreen: scala.Boolean): scala.Double = js.native
  /**
    * Gets the lsit of active attributes for a given webGL program
    * @param shaderProgram defines the webGL program to use
    * @param attributesNames defines the list of attribute names to get
    * @returns an array of indices indicating the offset of each attribute
    */
  def getAttributes(shaderProgram: babylonjsLib.WebGLProgram, attributesNames: js.Array[java.lang.String]): js.Array[scala.Double] = js.native
  /**
    * Gets the object containing all engine capabilities
    * @returns the EngineCapabilities object
    */
  def getCaps(): EngineCapabilities = js.native
  /**
    * Gets a boolean indicating if color writing is enabled
    * @returns the current color writing state
    */
  def getColorWrite(): scala.Boolean = js.native
  /**
    * Gets the time spent between current and previous frame
    * @returns a number representing the delta time in ms
    */
  def getDeltaTime(): scala.Double = js.native
  /**
    * Gets the current depth function
    * @returns a number defining the depth function
    */
  def getDepthFunction(): Nullable[scala.Double] = js.native
  /**
    * Gets a boolean indicating if depth writing is enabled
    * @returns the current depth writing state
    */
  def getDepthWrite(): scala.Boolean = js.native
  /**
    * Get the current error code of the webGL context
    * @returns the error code
    * @see https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getError
    */
  def getError(): scala.Double = js.native
  /**
    * Get an externaly attached data from its key
    * @param key the unique key that identifies the data
    * @return the associated data, if present (can be null), or undefined if not present
    */
  def getExternalData[T](key: java.lang.String): T = js.native
  /**
    * Gets the current framerate
    * @returns a number representing the framerate
    */
  def getFps(): scala.Double = js.native
  /**
    * Gets the source code of the fragment shader associated with a specific webGL program
    * @param program defines the program to use
    * @returns a string containing the source code of the fragment shader associated with the program
    */
  def getFragmentShaderSource(program: babylonjsLib.WebGLProgram): Nullable[java.lang.String] = js.native
  /**
    * Gets an object containing information about the current webGL context
    * @returns an object containing the vender, the renderer and the version of the current webGL context
    */
  def getGlInfo(): babylonjsLib.Anon_Renderer = js.native
  /**
    * Gets the current hardware scaling level.
    * By default the hardware scaling level is computed from the window device ratio.
    * if level = 1 then the engine will render at the exact resolution of the canvas. If level = 0.5 then the engine will render at twice the size of the canvas.
    * @returns a number indicating the current hardware scaling level
    */
  def getHardwareScalingLevel(): scala.Double = js.native
  /**
    * Gets the list of loaded textures
    * @returns an array containing all loaded textures
    */
  def getLoadedTexturesCache(): js.Array[InternalTexture] = js.native
  /**
    * Gets the max steps when engine is running in deterministic lock step
    * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    * @returns the max steps
    */
  def getLockstepMaxSteps(): scala.Double = js.native
  /**
    * Get an externaly attached data from its key, create it using a factory if it's not already present
    * @param key the unique key that identifies the data
    * @param factory the factory that will be called to create the instance if and only if it doesn't exists
    * @return the associated data, can be null if the factory returned null.
    */
  def getOrAddExternalDataWithFactory[T](key: java.lang.String, factory: js.Function1[/* k */ java.lang.String, T]): T = js.native
  /**
    * Gets the value of a given query
    * @param query defines the query to check
    * @returns the value of the query
    */
  def getQueryResult(query: babylonjsLib.WebGLQuery): scala.Double = js.native
  /**
    * Gets the current render height
    * @param useScreen defines if screen size must be used (or the current render target if any)
    * @returns a number defining the current render height
    */
  def getRenderHeight(): scala.Double = js.native
  def getRenderHeight(useScreen: scala.Boolean): scala.Double = js.native
  /**
    * Gets the current render width
    * @param useScreen defines if screen size must be used (or the current render target if any)
    * @returns a number defining the current render width
    */
  def getRenderWidth(): scala.Double = js.native
  def getRenderWidth(useScreen: scala.Boolean): scala.Double = js.native
  /**
    * Gets the HTML canvas attached with the current webGL context
    * @returns a HTML canvas
    */
  def getRenderingCanvas(): Nullable[babylonjsLib.HTMLCanvasElement] = js.native
  /**
    * Gets the client rect of the HTML canvas attached with the current webGL context
    * @returns a client rectanglee
    */
  def getRenderingCanvasClientRect(): Nullable[stdLib.ClientRect] = js.native
  /**
    * Gets current screen aspect ratio
    * @returns a number defining the aspect ratio
    */
  def getScreenAspectRatio(): scala.Double = js.native
  /**
    * Gets a boolean indicating if stencil buffer is enabled
    * @returns the current stencil buffer state
    */
  def getStencilBuffer(): scala.Boolean = js.native
  /**
    * Gets the current stencil function
    * @returns a number defining the stencil function to use
    */
  def getStencilFunction(): scala.Double = js.native
  /**
    * Gets the current stencil mask
    * @returns a number defining the stencil mask to use
    */
  def getStencilFunctionMask(): scala.Double = js.native
  /**
    * Gets the current stencil reference value
    * @returns a number defining the stencil reference value to use
    */
  def getStencilFunctionReference(): scala.Double = js.native
  /**
    * Gets the current stencil mask
    * @returns a number defining the new stencil mask to use
    */
  def getStencilMask(): scala.Double = js.native
  /**
    * Gets the current stencil operation when depth fails
    * @returns a number defining stencil operation to use when depth fails
    */
  def getStencilOperationDepthFail(): scala.Double = js.native
  /**
    * Gets the current stencil operation when stencil fails
    * @returns a number defining stencil operation to use when stencil fails
    */
  def getStencilOperationFail(): scala.Double = js.native
  /**
    * Gets the current stencil operation when stencil passes
    * @returns a number defining stencil operation to use when stencil passes
    */
  def getStencilOperationPass(): scala.Double = js.native
  /**
    * Gets the list of webGL uniform locations associated with a specific program based on a list of uniform names
    * @param shaderProgram defines the webGL program to use
    * @param uniformsNames defines the list of uniform names
    * @returns an array of webGL uniform locations
    */
  def getUniforms(shaderProgram: babylonjsLib.WebGLProgram, uniformsNames: js.Array[java.lang.String]): js.Array[Nullable[babylonjsLib.WebGLUniformLocation]] = js.native
  /**
    * Gets the current webVR device
    * @returns the current webVR device (or null)
    */
  def getVRDevice(): js.Any = js.native
  /**
    * Gets the source code of the vertex shader associated with a specific webGL program
    * @param program defines the program to use
    * @returns a string containing the source code of the vertex shader associated with the program
    */
  def getVertexShaderSource(program: babylonjsLib.WebGLProgram): Nullable[java.lang.String] = js.native
  /**
    * Gets the current value of the zOffset
    * @returns the current zOffset state
    */
  def getZOffset(): scala.Double = js.native
  /**
    * Hide the loading screen
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def hideLoadingUI(): scala.Unit = js.native
  /**
    * Initializes a webVR display and starts listening to display change events
    * The onVRDisplayChangedObservable will be notified upon these changes
    * @returns The onVRDisplayChangedObservable
    */
  def initWebVR(): Observable[IDisplayChangedEventArgs] = js.native
  /**
    * Initializes a webVR display and starts listening to display change events
    * The onVRDisplayChangedObservable will be notified upon these changes
    * @returns A promise containing a VRDisplay and if vr is supported
    */
  def initWebVRAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
  /**
    * Gets a boolean indicating that the engine is running in deterministic lock step mode
    * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    * @returns true if engine is in deterministic lock step mode
    */
  def isDeterministicLockStep(): scala.Boolean = js.native
  /**
    * Check if a given query has resolved and got its value
    * @param query defines the query to check
    * @returns true if the query got its value
    */
  def isQueryResultAvailable(query: babylonjsLib.WebGLQuery): scala.Boolean = js.native
  /**
    * Gets a boolean indicating if a webVR device was detected
    * @returns true if a webVR device was detected
    */
  def isVRDevicePresent(): scala.Boolean = js.native
  /**
    * Reads pixels from the current frame buffer. Please note that this function can be slow
    * @param x defines the x coordinate of the rectangle where pixels must be read
    * @param y defines the y coordinate of the rectangle where pixels must be read
    * @param width defines the width of the rectangle where pixels must be read
    * @param height defines the height of the rectangle where pixels must be read
    * @returns a Uint8Array containing RGBA colors
    */
  def readPixels(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): stdLib.Uint8Array = js.native
  /**
    * Records a vertex array object
    * @see http://doc.babylonjs.com/features/webgl2#vertex-array-objects
    * @param vertexBuffers defines the list of vertex buffers to store
    * @param indexBuffer defines the index buffer to store
    * @param effect defines the effect to store
    * @returns the new vertex array object
    */
  def recordVertexArrayObject(
    vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer],
    indexBuffer: Nullable[babylonjsLib.WebGLBuffer],
    effect: Effect
  ): babylonjsLib.WebGLVertexArrayObject = js.native
  /**
    * Force the engine to release all cached effects. This means that next effect compilation will have to be done completely even if a similar effect was already compiled
    */
  def releaseEffects(): scala.Unit = js.native
  /**
    * Release and free the memory of a vertex array object
    * @param vao defines the vertex array object to delete
    */
  def releaseVertexArrayObject(vao: babylonjsLib.WebGLVertexArrayObject): scala.Unit = js.native
  /**
    * Remove an externaly attached data from the Engine instance
    * @param key the unique key that identifies the data
    * @return true if the data was successfully removed, false if it doesn't exist
    */
  def removeExternalData(key: java.lang.String): scala.Boolean = js.native
  /**
    * Reset the texture cache to empty state
    */
  def resetTextureCache(): scala.Unit = js.native
  /**
    * Resize the view according to the canvas' size
    */
  def resize(): scala.Unit = js.native
  /**
    * Unbind the current render target and bind the default framebuffer
    */
  def restoreDefaultFramebuffer(): scala.Unit = js.native
  /**
    * Register and execute a render loop. The engine can have more than one render function
    * @param renderFunction defines the function to continuously execute
    */
  def runRenderLoop(renderFunction: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Executes a scissor clear (ie. a clear on a specific portion of the screen)
    * @param x defines the x-coordinate of the top left corner of the clear rectangle
    * @param y defines the y-coordinate of the corner of the clear rectangle
    * @param width defines the width of the clear rectangle
    * @param height defines the height of the clear rectangle
    * @param clearColor defines the clear color
    */
  def scissorClear(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, clearColor: Color4): scala.Unit = js.native
  /**
    * Sets alpha constants used by some alpha blending modes
    * @param r defines the red component
    * @param g defines the green component
    * @param b defines the blue component
    * @param a defines the alpha component
    */
  def setAlphaConstants(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): scala.Unit = js.native
  /**
    * Sets the current alpha mode
    * @param mode defines the mode to use (one of the BABYLON.Engine.ALPHA_XXX)
    * @param noDepthWriteChange defines if depth writing state should remains unchanged (false by default)
    * @see http://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered
    */
  def setAlphaMode(mode: scala.Double): scala.Unit = js.native
  def setAlphaMode(mode: scala.Double, noDepthWriteChange: scala.Boolean): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of number
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of number to store
    */
  def setArray(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of number (stored as vec2)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of number to store
    */
  def setArray2(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of number (stored as vec3)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of number to store
    */
  def setArray3(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of number (stored as vec4)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of number to store
    */
  def setArray4(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Set the value of an uniform to a boolean
    * @param uniform defines the webGL uniform location where to store the value
    * @param bool defines the boolean to store
    */
  def setBool(uniform: Nullable[babylonjsLib.WebGLUniformLocation], bool: scala.Double): scala.Unit = js.native
  /**
    * Set the value of an uniform to a Color3
    * @param uniform defines the webGL uniform location where to store the value
    * @param color3 defines the color to store
    */
  def setColor3(uniform: Nullable[babylonjsLib.WebGLUniformLocation], color3: Color3): scala.Unit = js.native
  /**
    * Set the value of an uniform to a Color3 and an alpha value
    * @param uniform defines the webGL uniform location where to store the value
    * @param color3 defines the color to store
    * @param alpha defines the alpha component to store
    */
  def setColor4(uniform: Nullable[babylonjsLib.WebGLUniformLocation], color3: Color3, alpha: scala.Double): scala.Unit = js.native
  /**
    * Enable or disable color writing
    * @param enable defines the state to set
    */
  def setColorWrite(enable: scala.Boolean): scala.Unit = js.native
  /**
    * Enable or disable depth buffering
    * @param enable defines the state to set
    */
  def setDepthBuffer(enable: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the current depth function
    * @param depthFunc defines the function to use
    */
  def setDepthFunction(depthFunc: scala.Double): scala.Unit = js.native
  /**
    * Sets the current depth function to GREATER
    */
  def setDepthFunctionToGreater(): scala.Unit = js.native
  /**
    * Sets the current depth function to GEQUAL
    */
  def setDepthFunctionToGreaterOrEqual(): scala.Unit = js.native
  /**
    * Sets the current depth function to LESS
    */
  def setDepthFunctionToLess(): scala.Unit = js.native
  /**
    * Sets the current depth function to LEQUAL
    */
  def setDepthFunctionToLessOrEqual(): scala.Unit = js.native
  /**
    * Sets a depth stencil texture from a render target to the according uniform.
    * @param channel The texture channel
    * @param uniform The uniform to set
    * @param texture The render target texture containing the depth stencil texture to apply
    */
  def setDepthStencilTexture(
    channel: scala.Double,
    uniform: Nullable[babylonjsLib.WebGLUniformLocation],
    texture: Nullable[RenderTargetTexture]
  ): scala.Unit = js.native
  /**
    * Enable or disable depth writing
    * @param enable defines the state to set
    */
  def setDepthWrite(enable: scala.Boolean): scala.Unit = js.native
  /**
    * Sets a Color4 on a uniform variable
    * @param uniform defines the uniform location
    * @param color4 defines the value to be set
    */
  def setDirectColor4(uniform: Nullable[babylonjsLib.WebGLUniformLocation], color4: Color4): scala.Unit = js.native
  /**
    * Directly set the WebGL Viewport
    * @param x defines the x coordinate of the viewport (in screen space)
    * @param y defines the y coordinate of the viewport (in screen space)
    * @param width defines the width of the viewport (in screen space)
    * @param height defines the height of the viewport (in screen space)
    * @return the current viewport Object (if any) that is being replaced by this call. You can restore this viewport later on to go back to the original state
    */
  def setDirectViewport(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Nullable[Viewport] = js.native
  /**
    * Sets a boolean indicating if the dithering state is enabled or disabled
    * @param value defines the dithering state
    */
  def setDitheringState(value: scala.Boolean): scala.Unit = js.native
  /**
    * Set the value of an uniform to a number (float)
    * @param uniform defines the webGL uniform location where to store the value
    * @param value defines the float number to store
    */
  def setFloat(uniform: Nullable[babylonjsLib.WebGLUniformLocation], value: scala.Double): scala.Unit = js.native
  /**
    * Set the value of an uniform to a vec2
    * @param uniform defines the webGL uniform location where to store the value
    * @param x defines the 1st component of the value
    * @param y defines the 2nd component of the value
    */
  def setFloat2(uniform: Nullable[babylonjsLib.WebGLUniformLocation], x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Set the value of an uniform to a vec3
    * @param uniform defines the webGL uniform location where to store the value
    * @param x defines the 1st component of the value
    * @param y defines the 2nd component of the value
    * @param z defines the 3rd component of the value
    */
  def setFloat3(
    uniform: Nullable[babylonjsLib.WebGLUniformLocation],
    x: scala.Double,
    y: scala.Double,
    z: scala.Double
  ): scala.Unit = js.native
  /**
    * Set the value of an uniform to a vec4
    * @param uniform defines the webGL uniform location where to store the value
    * @param x defines the 1st component of the value
    * @param y defines the 2nd component of the value
    * @param z defines the 3rd component of the value
    * @param w defines the 4th component of the value
    */
  def setFloat4(
    uniform: Nullable[babylonjsLib.WebGLUniformLocation],
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    w: scala.Double
  ): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of float32
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of float32 to store
    */
  def setFloatArray(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: stdLib.Float32Array): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of float32 (stored as vec2)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of float32 to store
    */
  def setFloatArray2(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: stdLib.Float32Array): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of float32 (stored as vec3)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of float32 to store
    */
  def setFloatArray3(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: stdLib.Float32Array): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of float32 (stored as vec4)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of float32 to store
    */
  def setFloatArray4(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: stdLib.Float32Array): scala.Unit = js.native
  /**
    * Sets the frame buffer Depth / Stencil attachement of the render target to the defined depth stencil texture.
    * @param renderTarget The render target to set the frame buffer for
    */
  def setFrameBufferDepthStencilTexture(renderTarget: RenderTargetTexture): scala.Unit = js.native
  /**
    * Defines the hardware scaling level.
    * By default the hardware scaling level is computed from the window device ratio.
    * if level = 1 then the engine will render at the exact resolution of the canvas. If level = 0.5 then the engine will render at twice the size of the canvas.
    * @param level defines the level to use
    */
  def setHardwareScalingLevel(level: scala.Double): scala.Unit = js.native
  /**
    * Set the value of an uniform to a number (int)
    * @param uniform defines the webGL uniform location where to store the value
    * @param value defines the int number to store
    */
  def setInt(uniform: Nullable[babylonjsLib.WebGLUniformLocation], value: scala.Double): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of int32
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    */
  def setIntArray(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: stdLib.Int32Array): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of int32 (stored as vec2)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    */
  def setIntArray2(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: stdLib.Int32Array): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of int32 (stored as vec3)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    */
  def setIntArray3(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: stdLib.Int32Array): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of int32 (stored as vec4)
    * @param uniform defines the webGL uniform location where to store the value
    * @param array defines the array of int32 to store
    */
  def setIntArray4(uniform: Nullable[babylonjsLib.WebGLUniformLocation], array: stdLib.Int32Array): scala.Unit = js.native
  /**
    * Set the value of an uniform to an array of float32 (stored as matrices)
    * @param uniform defines the webGL uniform location where to store the value
    * @param matrices defines the array of float32 to store
    */
  def setMatrices(uniform: Nullable[babylonjsLib.WebGLUniformLocation], matrices: stdLib.Float32Array): scala.Unit = js.native
  /**
    * Set the value of an uniform to a matrix
    * @param uniform defines the webGL uniform location where to store the value
    * @param matrix defines the matrix to store
    */
  def setMatrix(uniform: Nullable[babylonjsLib.WebGLUniformLocation], matrix: Matrix): scala.Unit = js.native
  /**
    * Set the value of an uniform to a matrix (2x2)
    * @param uniform defines the webGL uniform location where to store the value
    * @param matrix defines the Float32Array representing the 2x2 matrix to store
    */
  def setMatrix2x2(uniform: Nullable[babylonjsLib.WebGLUniformLocation], matrix: stdLib.Float32Array): scala.Unit = js.native
  /**
    * Set the value of an uniform to a matrix (3x3)
    * @param uniform defines the webGL uniform location where to store the value
    * @param matrix defines the Float32Array representing the 3x3 matrix to store
    */
  def setMatrix3x3(uniform: Nullable[babylonjsLib.WebGLUniformLocation], matrix: stdLib.Float32Array): scala.Unit = js.native
  /**
    * Sets a boolean indicating if the rasterizer state is enabled or disabled
    * @param value defines the rasterizer state
    */
  def setRasterizerState(value: scala.Boolean): scala.Unit = js.native
  /**
    * Force a specific size of the canvas
    * @param width defines the new canvas' width
    * @param height defines the new canvas' height
    */
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Set various states to the webGL context
    * @param culling defines backface culling state
    * @param zOffset defines the value to apply to zOffset (0 by default)
    * @param force defines if states must be applied even if cache is up to date
    * @param reverseSide defines if culling must be reversed (CCW instead of CW and CW instead of CCW)
    */
  def setState(culling: scala.Boolean): scala.Unit = js.native
  def setState(culling: scala.Boolean, zOffset: scala.Double): scala.Unit = js.native
  def setState(culling: scala.Boolean, zOffset: scala.Double, force: scala.Boolean): scala.Unit = js.native
  def setState(culling: scala.Boolean, zOffset: scala.Double, force: scala.Boolean, reverseSide: scala.Boolean): scala.Unit = js.native
  /**
    * Enable or disable the stencil buffer
    * @param enable defines if the stencil buffer must be enabled or disabled
    */
  def setStencilBuffer(enable: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the current stencil function
    * @param stencilFunc defines the new stencil function to use
    */
  def setStencilFunction(stencilFunc: scala.Double): scala.Unit = js.native
  /**
    * Sets the current stencil mask
    * @param mask defines the new stencil mask to use
    */
  def setStencilFunctionMask(mask: scala.Double): scala.Unit = js.native
  /**
    * Sets the current stencil reference
    * @param reference defines the new stencil reference to use
    */
  def setStencilFunctionReference(reference: scala.Double): scala.Unit = js.native
  /**
    * Sets the current stencil mask
    * @param mask defines the new stencil mask to use
    */
  def setStencilMask(mask: scala.Double): scala.Unit = js.native
  /**
    * Sets the stencil operation to use when depth fails
    * @param operation defines the stencil operation to use when depth fails
    */
  def setStencilOperationDepthFail(operation: scala.Double): scala.Unit = js.native
  /**
    * Sets the stencil operation to use when stencil fails
    * @param operation defines the stencil operation to use when stencil fails
    */
  def setStencilOperationFail(operation: scala.Double): scala.Unit = js.native
  /**
    * Sets the stencil operation to use when stencil passes
    * @param operation defines the stencil operation to use when stencil passes
    */
  def setStencilOperationPass(operation: scala.Double): scala.Unit = js.native
  /**
    * Sets a texture to the according uniform.
    * @param channel The texture channel
    * @param uniform The uniform to set
    * @param texture The texture to apply
    */
  def setTexture(
    channel: scala.Double,
    uniform: Nullable[babylonjsLib.WebGLUniformLocation],
    texture: Nullable[BaseTexture]
  ): scala.Unit = js.native
  /**
    * Sets an array of texture to the webGL context
    * @param channel defines the channel where the texture array must be set
    * @param uniform defines the associated uniform location
    * @param textures defines the array of textures to bind
    */
  def setTextureArray(
    channel: scala.Double,
    uniform: Nullable[babylonjsLib.WebGLUniformLocation],
    textures: js.Array[BaseTexture]
  ): scala.Unit = js.native
  /**
    * Set the compressed texture format to use, based on the formats you have, and the formats
    * supported by the hardware / browser.
    *
    * Khronos Texture Container (.ktx) files are used to support this.  This format has the
    * advantage of being specifically designed for OpenGL.  Header elements directly correspond
    * to API arguments needed to compressed textures.  This puts the burden on the container
    * generator to house the arcane code for determining these for current & future formats.
    *
    * for description see https://www.khronos.org/opengles/sdk/tools/KTX/
    * for file layout see https://www.khronos.org/opengles/sdk/tools/KTX/file_format_spec/
    *
    * Note: The result of this call is not taken into account when a texture is base64.
    *
    * @param formatsAvailable defines the list of those format families you have created
    * on your server.  Syntax: '-' + format family + '.ktx'.  (Case and order do not matter.)
    *
    * Current families are astc, dxt, pvrtc, etc2, & etc1.
    * @returns The extension selected.
    */
  def setTextureFormatToUse(formatsAvailable: js.Array[java.lang.String]): Nullable[java.lang.String] = js.native
  /**
    * Sets a texture to the webGL context from a postprocess
    * @param channel defines the channel to use
    * @param postProcess defines the source postprocess
    */
  def setTextureFromPostProcess(channel: scala.Double, postProcess: Nullable[PostProcess]): scala.Unit = js.native
  /**
    * Binds the output of the passed in post process to the texture channel specified
    * @param channel The channel the texture should be bound to
    * @param postProcess The post process which's output should be bound
    */
  def setTextureFromPostProcessOutput(channel: scala.Double, postProcess: Nullable[PostProcess]): scala.Unit = js.native
  /**
    * Specify the varyings to use with transform feedback
    * @param program defines the associated webGL program
    * @param value defines the list of strings representing the varying names
    */
  def setTranformFeedbackVaryings(program: babylonjsLib.WebGLProgram, value: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Set the WebGL's viewport
    * @param viewport defines the viewport element to be used
    * @param requiredWidth defines the width required for rendering. If not provided the rendering canvas' width is used
    * @param requiredHeight defines the height required for rendering. If not provided the rendering canvas' height is used
    */
  def setViewport(viewport: Viewport): scala.Unit = js.native
  def setViewport(viewport: Viewport, requiredWidth: scala.Double): scala.Unit = js.native
  def setViewport(viewport: Viewport, requiredWidth: scala.Double, requiredHeight: scala.Double): scala.Unit = js.native
  /**
    * Set the z offset to apply to current rendering
    * @param value defines the offset to apply
    */
  def setZOffset(value: scala.Double): scala.Unit = js.native
  /**
    * Starts a time query (used to measure time spent by the GPU on a specific frame)
    * Please note that only one query can be issued at a time
    * @returns a time token used to track the time span
    */
  def startTimeQuery(): Nullable[_TimeToken] = js.native
  /**
    * stop executing a render loop function and remove it from the execution array
    * @param renderFunction defines the function to be removed. If not provided all functions will be removed.
    */
  def stopRenderLoop(): scala.Unit = js.native
  def stopRenderLoop(renderFunction: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Toggle full screen mode
    * @param requestPointerLock defines if a pointer lock should be requested from the user
    */
  def switchFullscreen(requestPointerLock: scala.Boolean): scala.Unit = js.native
  /**
    * Unbind the current render target texture from the webGL context
    * @param texture defines the render target texture to unbind
    * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
    * @param onBeforeUnbind defines a function which will be called before the effective unbind
    */
  def unBindFramebuffer(texture: InternalTexture): scala.Unit = js.native
  def unBindFramebuffer(texture: InternalTexture, disableGenerateMipMaps: scala.Boolean): scala.Unit = js.native
  def unBindFramebuffer(
    texture: InternalTexture,
    disableGenerateMipMaps: scala.Boolean,
    onBeforeUnbind: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Unbind a list of render target textures from the webGL context
    * This is used only when drawBuffer extension or webGL2 are active
    * @param textures defines the render target textures to unbind
    * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
    * @param onBeforeUnbind defines a function which will be called before the effective unbind
    */
  def unBindMultiColorAttachmentFramebuffer(textures: js.Array[InternalTexture]): scala.Unit = js.native
  def unBindMultiColorAttachmentFramebuffer(textures: js.Array[InternalTexture], disableGenerateMipMaps: scala.Boolean): scala.Unit = js.native
  def unBindMultiColorAttachmentFramebuffer(
    textures: js.Array[InternalTexture],
    disableGenerateMipMaps: scala.Boolean,
    onBeforeUnbind: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Unbind all vertex attributes from the webGL context
    */
  def unbindAllAttributes(): scala.Unit = js.native
  /**
    * Unbind all textures from the webGL context
    */
  def unbindAllTextures(): scala.Unit = js.native
  /**
    * Unbind all instance attributes
    */
  def unbindInstanceAttributes(): scala.Unit = js.native
  /**
    * Update the content of a webGL buffer used with instanciation and bind it to the webGL context
    * @param instancesBuffer defines the webGL buffer to update and bind
    * @param data defines the data to store in the buffer
    * @param offsetLocations defines the offsets or attributes information used to determine where data must be stored in the buffer
    */
  def updateAndBindInstancesBuffer(
    instancesBuffer: babylonjsLib.WebGLBuffer,
    data: stdLib.Float32Array,
    offsetLocations: js.Array[scala.Double | InstancingAttributeInfo]
  ): scala.Unit = js.native
  /**
    * update the bound buffer with the given data
    * @param data defines the data to update
    */
  def updateArrayBuffer(data: stdLib.Float32Array): scala.Unit = js.native
  /**
    * Update a dynamic index buffer
    * @param indexBuffer defines the target index buffer
    * @param indices defines the data to update
    * @param offset defines the offset in the target index buffer where update should start
    */
  def updateDynamicIndexBuffer(indexBuffer: babylonjsLib.WebGLBuffer, indices: IndicesArray): scala.Unit = js.native
  def updateDynamicIndexBuffer(indexBuffer: babylonjsLib.WebGLBuffer, indices: IndicesArray, offset: scala.Double): scala.Unit = js.native
  /**
    * Update the content of a dynamic texture
    * @param texture defines the texture to update
    * @param canvas defines the canvas containing the source
    * @param invertY defines if data must be stored with Y axis inverted
    * @param premulAlpha defines if alpha is stored as premultiplied
    * @param format defines the format of the data
    */
  def updateDynamicTexture(texture: Nullable[InternalTexture], canvas: babylonjsLib.HTMLCanvasElement, invertY: scala.Boolean): scala.Unit = js.native
  def updateDynamicTexture(
    texture: Nullable[InternalTexture],
    canvas: babylonjsLib.HTMLCanvasElement,
    invertY: scala.Boolean,
    premulAlpha: scala.Boolean
  ): scala.Unit = js.native
  def updateDynamicTexture(
    texture: Nullable[InternalTexture],
    canvas: babylonjsLib.HTMLCanvasElement,
    invertY: scala.Boolean,
    premulAlpha: scala.Boolean,
    format: scala.Double
  ): scala.Unit = js.native
  /**
    * Updates a dynamic vertex buffer.
    * @param vertexBuffer the vertex buffer to update
    * @param data the data used to update the vertex buffer
    * @param byteOffset the byte offset of the data
    * @param byteLength the byte length of the data
    */
  def updateDynamicVertexBuffer(vertexBuffer: babylonjsLib.WebGLBuffer, data: DataArray): scala.Unit = js.native
  def updateDynamicVertexBuffer(vertexBuffer: babylonjsLib.WebGLBuffer, data: DataArray, byteOffset: scala.Double): scala.Unit = js.native
  def updateDynamicVertexBuffer(
    vertexBuffer: babylonjsLib.WebGLBuffer,
    data: DataArray,
    byteOffset: scala.Double,
    byteLength: scala.Double
  ): scala.Unit = js.native
  /**
    * Update the sample count for a given multiple render target texture
    * @see http://doc.babylonjs.com/features/webgl2#multisample-render-targets
    * @param textures defines the textures to update
    * @param samples defines the sample count to set
    * @returns the effective sample count (could be 0 if multisample render targets are not supported)
    */
  def updateMultipleRenderTargetTextureSampleCount(textures: Nullable[js.Array[InternalTexture]], samples: scala.Double): scala.Double = js.native
  /**
    * Update a raw cube texture
    * @param texture defines the texture to udpdate
    * @param data defines the data to store
    * @param format defines the data format
    * @param type defines the type fo the data (BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT by default)
    * @param invertY defines if data must be stored with Y axis inverted
    * @param compression defines the compression used (null by default)
    * @param level defines which level of the texture to update
    */
  def updateRawCubeTexture(
    texture: InternalTexture,
    data: js.Array[stdLib.ArrayBufferView],
    format: scala.Double,
    `type`: scala.Double,
    invertY: scala.Boolean
  ): scala.Unit = js.native
  def updateRawCubeTexture(
    texture: InternalTexture,
    data: js.Array[stdLib.ArrayBufferView],
    format: scala.Double,
    `type`: scala.Double,
    invertY: scala.Boolean,
    compression: Nullable[java.lang.String]
  ): scala.Unit = js.native
  def updateRawCubeTexture(
    texture: InternalTexture,
    data: js.Array[stdLib.ArrayBufferView],
    format: scala.Double,
    `type`: scala.Double,
    invertY: scala.Boolean,
    compression: Nullable[java.lang.String],
    level: scala.Double
  ): scala.Unit = js.native
  /**
    * Update a raw texture
    * @param texture defines the texture to update
    * @param data defines the data to store in the texture
    * @param format defines the format of the data
    * @param invertY defines if data must be stored with Y axis inverted
    * @param compression defines the compression used (null by default)
    * @param type defines the type fo the data (BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT by default)
    */
  def updateRawTexture(
    texture: Nullable[InternalTexture],
    data: Nullable[stdLib.ArrayBufferView],
    format: scala.Double,
    invertY: scala.Boolean
  ): scala.Unit = js.native
  def updateRawTexture(
    texture: Nullable[InternalTexture],
    data: Nullable[stdLib.ArrayBufferView],
    format: scala.Double,
    invertY: scala.Boolean,
    compression: Nullable[java.lang.String]
  ): scala.Unit = js.native
  def updateRawTexture(
    texture: Nullable[InternalTexture],
    data: Nullable[stdLib.ArrayBufferView],
    format: scala.Double,
    invertY: scala.Boolean,
    compression: Nullable[java.lang.String],
    `type`: scala.Double
  ): scala.Unit = js.native
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
    data: Nullable[stdLib.ArrayBufferView],
    format: scala.Double,
    invertY: scala.Boolean
  ): scala.Unit = js.native
  def updateRawTexture3D(
    texture: InternalTexture,
    data: Nullable[stdLib.ArrayBufferView],
    format: scala.Double,
    invertY: scala.Boolean,
    compression: Nullable[java.lang.String]
  ): scala.Unit = js.native
  def updateRawTexture3D(
    texture: InternalTexture,
    data: Nullable[stdLib.ArrayBufferView],
    format: scala.Double,
    invertY: scala.Boolean,
    compression: Nullable[java.lang.String],
    textureType: scala.Double
  ): scala.Unit = js.native
  /**
    * Updates the sample count of a render target texture
    * @see http://doc.babylonjs.com/features/webgl2#multisample-render-targets
    * @param texture defines the texture to update
    * @param samples defines the sample count to set
    * @returns the effective sample count (could be 0 if multisample render targets are not supported)
    */
  def updateRenderTargetTextureSampleCount(texture: Nullable[InternalTexture], samples: scala.Double): scala.Double = js.native
  /**
    * Updates a depth texture Comparison Mode and Function.
    * If the comparison Function is equal to 0, the mode will be set to none.
    * Otherwise, this only works in webgl 2 and requires a shadow sampler in the shader.
    * @param texture The texture to set the comparison function for
    * @param comparisonFunction The comparison function to set, 0 if no comparison required
    */
  def updateTextureComparisonFunction(texture: InternalTexture, comparisonFunction: scala.Double): scala.Unit = js.native
  /**
    * Update the sampling mode of a given texture
    * @param samplingMode defines the required sampling mode
    * @param texture defines the texture to update
    */
  def updateTextureSamplingMode(samplingMode: scala.Double, texture: InternalTexture): scala.Unit = js.native
  /**
    * Update an existing uniform buffer
    * @see http://doc.babylonjs.com/features/webgl2#uniform-buffer-objets
    * @param uniformBuffer defines the target uniform buffer
    * @param elements defines the content to update
    * @param offset defines the offset in the uniform buffer where update should start
    * @param count defines the size of the data to update
    */
  def updateUniformBuffer(uniformBuffer: babylonjsLib.WebGLBuffer, elements: FloatArray): scala.Unit = js.native
  def updateUniformBuffer(uniformBuffer: babylonjsLib.WebGLBuffer, elements: FloatArray, offset: scala.Double): scala.Unit = js.native
  def updateUniformBuffer(
    uniformBuffer: babylonjsLib.WebGLBuffer,
    elements: FloatArray,
    offset: scala.Double,
    count: scala.Double
  ): scala.Unit = js.native
  /**
    * Update a video texture
    * @param texture defines the texture to update
    * @param video defines the video element to use
    * @param invertY defines if data must be stored with Y axis inverted
    */
  def updateVideoTexture(texture: Nullable[InternalTexture], video: babylonjsLib.HTMLVideoElement, invertY: scala.Boolean): scala.Unit = js.native
  /**
    * Force the entire cache to be cleared
    * You should not have to use this function unless your engine needs to share the webGL context with another engine
    * @param bruteForce defines a boolean to force clearing ALL caches (including stencil, detoh and alpha states)
    */
  def wipeCaches(): scala.Unit = js.native
  def wipeCaches(bruteForce: scala.Boolean): scala.Unit = js.native
}

/**
  * The engine class is responsible for interfacing with all lower-level APIs such as WebGL and Audio
  */
@JSGlobal("BABYLON.Engine")
@js.native
object Engine extends js.Object {
  /** Defines that alpha blending to SRC ALPHA * SRC + DEST */
  val ALPHA_ADD: scala.Double = js.native
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC ALPHA) * DEST */
  val ALPHA_COMBINE: scala.Double = js.native
  /** Defines that alpha blending is disabled */
  val ALPHA_DISABLE: scala.Double = js.native
  /** Defines that alpha blending to CST * SRC + (1 - CST) * DEST */
  val ALPHA_INTERPOLATE: scala.Double = js.native
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC) * DEST */
  val ALPHA_MAXIMIZED: scala.Double = js.native
  /** Defines that alpha blending to SRC * DEST */
  val ALPHA_MULTIPLY: scala.Double = js.native
  /** Defines that alpha blending to SRC + DEST */
  val ALPHA_ONEONE: scala.Double = js.native
  /** Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST */
  val ALPHA_PREMULTIPLIED: scala.Double = js.native
  /**
    * Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST
    * Alpha will be set to (1 - SRC ALPHA) * DEST ALPHA
    */
  val ALPHA_PREMULTIPLIED_PORTERDUFF: scala.Double = js.native
  /**
    * Defines that alpha blending to SRC + (1 - SRC) * DEST
    * Alpha will be set to SRC ALPHA + (1 - SRC ALPHA) * DEST ALPHA
    */
  val ALPHA_SCREENMODE: scala.Double = js.native
  /** Defines that alpha blending to DEST - SRC * DEST */
  val ALPHA_SUBTRACT: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  val ALWAYS: scala.Double = js.native
  /**
    * Gets or sets the relative url used to load code if using the engine in non-minified mode
    */
  var CodeRepository: java.lang.String = js.native
  /**
    * Gets or sets the epsilon value used by collision engine
    */
  var CollisionsEpsilon: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be decremented */
  val DECR: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be decremented with wrapping */
  val DECR_WRAP: scala.Double = js.native
  /** Defines that the ressource was successfully delay loaded */
  val DELAYLOADSTATE_LOADED: scala.Double = js.native
  /** Defines that the ressource is currently delay loading */
  val DELAYLOADSTATE_LOADING: scala.Double = js.native
  /** Defines that the ressource is not delayed*/
  val DELAYLOADSTATE_NONE: scala.Double = js.native
  /** Defines that the ressource is delayed and has not started loading */
  val DELAYLOADSTATE_NOTLOADED: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is equals to the stored value */
  val EQUAL: scala.Double = js.native
  /** Use this array to turn off some WebGL2 features on known buggy browsers version */
  var ExceptionList: js.Array[babylonjsLib.Anon_CaptureConstraint | babylonjsLib.Anon_CaptureConstraintKey] = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value */
  val GEQUAL: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than the stored value */
  val GREATER: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be incremented */
  val INCR: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be incremented with wrapping */
  val INCR_WRAP: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be inverted */
  val INVERT: scala.Double = js.native
  /** Gets the list of created engines */
  var Instances: js.Array[babylonjsLib.BABYLONNs.Engine] = js.native
  /** Passed to stencilOperation to specify that stencil value must be kept */
  val KEEP: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value */
  val LEQUAL: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than the stored value */
  val LESS: scala.Double = js.native
  /**
    * Gets the latest created engine
    */
  val LastCreatedEngine: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Engine] = js.native
  /**
    * Gets the latest created scene
    */
  val LastCreatedScene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene] = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will never pass. i.e. Nothing will be drawn */
  val NEVER: scala.Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is not equal to the stored value */
  val NOTEQUAL: scala.Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  val REPLACE: scala.Double = js.native
  /** Defines that texture rescaling will use a ceil to find the closer power of 2 size */
  val SCALEMODE_CEILING: scala.Double = js.native
  /** Defines that texture rescaling will use a floor to find the closer power of 2 size */
  val SCALEMODE_FLOOR: scala.Double = js.native
  /** Defines that texture rescaling will look for the nearest power of 2 size */
  val SCALEMODE_NEAREST: scala.Double = js.native
  /**
    * Gets or sets the relative url used to load shaders if using the engine in non-minified mode
    */
  var ShadersRepository: java.lang.String = js.native
  /** ALPHA */
  val TEXTUREFORMAT_ALPHA: scala.Double = js.native
  /** LUMINANCE */
  val TEXTUREFORMAT_LUMINANCE: scala.Double = js.native
  /** LUMINANCE_ALPHA */
  val TEXTUREFORMAT_LUMINANCE_ALPHA: scala.Double = js.native
  /** RED (2nd reference) */
  val TEXTUREFORMAT_R: scala.Double = js.native
  /** RED */
  val TEXTUREFORMAT_RED: scala.Double = js.native
  /** RED_INTEGER */
  val TEXTUREFORMAT_RED_INTEGER: scala.Double = js.native
  /** RG */
  val TEXTUREFORMAT_RG: scala.Double = js.native
  /** RGB */
  val TEXTUREFORMAT_RGB: scala.Double = js.native
  /** RGBA */
  val TEXTUREFORMAT_RGBA: scala.Double = js.native
  /** RGBA_INTEGER */
  val TEXTUREFORMAT_RGBA_INTEGER: scala.Double = js.native
  /** RGB_INTEGER */
  val TEXTUREFORMAT_RGB_INTEGER: scala.Double = js.native
  /** RG_INTEGER */
  val TEXTUREFORMAT_RG_INTEGER: scala.Double = js.native
  /** RED_INTEGER (2nd reference) */
  val TEXTUREFORMAT_R_INTEGER: scala.Double = js.native
  /** BYTE */
  val TEXTURETYPE_BYTE: scala.Double = js.native
  /** FLOAT */
  val TEXTURETYPE_FLOAT: scala.Double = js.native
  /** FLOAT_32_UNSIGNED_INT_24_8_REV */
  val TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: scala.Double = js.native
  /** HALF_FLOAT */
  val TEXTURETYPE_HALF_FLOAT: scala.Double = js.native
  /** INT */
  val TEXTURETYPE_INT: scala.Double = js.native
  /** SHORT */
  val TEXTURETYPE_SHORT: scala.Double = js.native
  /** UNSIGNED_BYTE */
  val TEXTURETYPE_UNSIGNED_BYTE: scala.Double = js.native
  /** UNSIGNED_BYTE (2nd reference) */
  val TEXTURETYPE_UNSIGNED_INT: scala.Double = js.native
  /** UNSIGNED_INT */
  val TEXTURETYPE_UNSIGNED_INTEGER: scala.Double = js.native
  /** UNSIGNED_INT_10F_11F_11F_REV */
  val TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: scala.Double = js.native
  /** UNSIGNED_INT_24_8 */
  val TEXTURETYPE_UNSIGNED_INT_24_8: scala.Double = js.native
  /** UNSIGNED_INT_2_10_10_10_REV */
  val TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: scala.Double = js.native
  /** UNSIGNED_INT_5_9_9_9_REV */
  val TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: scala.Double = js.native
  /** UNSIGNED_SHORT */
  val TEXTURETYPE_UNSIGNED_SHORT: scala.Double = js.native
  /** UNSIGNED_SHORT_4_4_4_4 */
  val TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: scala.Double = js.native
  /** UNSIGNED_SHORT_5_5_5_1 */
  val TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: scala.Double = js.native
  /** UNSIGNED_SHORT_5_6_5 */
  val TEXTURETYPE_UNSIGNED_SHORT_5_6_5: scala.Double = js.native
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val TEXTURE_BILINEAR_SAMPLINGMODE: scala.Double = js.native
  /** Texture is not repeating outside of 0..1 UVs */
  val TEXTURE_CLAMP_ADDRESSMODE: scala.Double = js.native
  /** Cubic coordinates mode */
  val TEXTURE_CUBIC_MODE: scala.Double = js.native
  /** Equirectangular coordinates mode */
  val TEXTURE_EQUIRECTANGULAR_MODE: scala.Double = js.native
  /** Explicit coordinates mode */
  val TEXTURE_EXPLICIT_MODE: scala.Double = js.native
  /** Equirectangular Fixed Mirrored coordinates mode */
  val TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: scala.Double = js.native
  /** Equirectangular Fixed coordinates mode */
  val TEXTURE_FIXED_EQUIRECTANGULAR_MODE: scala.Double = js.native
  /** Inverse Cubic coordinates mode */
  val TEXTURE_INVCUBIC_MODE: scala.Double = js.native
  /** mag = linear and min = linear and mip = none */
  val TEXTURE_LINEAR_LINEAR: scala.Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TEXTURE_LINEAR_LINEAR_MIPLINEAR: scala.Double = js.native
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val TEXTURE_LINEAR_LINEAR_MIPNEAREST: scala.Double = js.native
  /** mag = linear and min = nearest and mip = none */
  val TEXTURE_LINEAR_NEAREST: scala.Double = js.native
  /** mag = linear and min = nearest and mip = linear */
  val TEXTURE_LINEAR_NEAREST_MIPLINEAR: scala.Double = js.native
  /** mag = linear and min = nearest and mip = nearest */
  val TEXTURE_LINEAR_NEAREST_MIPNEAREST: scala.Double = js.native
  /** Texture is repeating and mirrored */
  val TEXTURE_MIRROR_ADDRESSMODE: scala.Double = js.native
  /** mag = nearest and min = linear and mip = none */
  val TEXTURE_NEAREST_LINEAR: scala.Double = js.native
  /** mag = nearest and min = linear and mip = linear */
  val TEXTURE_NEAREST_LINEAR_MIPLINEAR: scala.Double = js.native
  /** mag = nearest and min = linear and mip = nearest */
  val TEXTURE_NEAREST_LINEAR_MIPNEAREST: scala.Double = js.native
  /** mag = nearest and min = nearest and mip = none */
  val TEXTURE_NEAREST_NEAREST: scala.Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val TEXTURE_NEAREST_NEAREST_MIPLINEAR: scala.Double = js.native
  /** mag = nearest and min = nearest and mip = nearest */
  val TEXTURE_NEAREST_NEAREST_MIPNEAREST: scala.Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val TEXTURE_NEAREST_SAMPLINGMODE: scala.Double = js.native
  /** Planar coordinates mode */
  val TEXTURE_PLANAR_MODE: scala.Double = js.native
  /** Projection coordinates mode */
  val TEXTURE_PROJECTION_MODE: scala.Double = js.native
  /** Skybox coordinates mode */
  val TEXTURE_SKYBOX_MODE: scala.Double = js.native
  /** Spherical coordinates mode */
  val TEXTURE_SPHERICAL_MODE: scala.Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TEXTURE_TRILINEAR_SAMPLINGMODE: scala.Double = js.native
  /** Texture is repeating outside of 0..1 UVs */
  val TEXTURE_WRAP_ADDRESSMODE: scala.Double = js.native
  /**
    * Returns the current version of the framework
    */
  val Version: java.lang.String = js.native
  /**
    * Hidden
    */
  var _TextureLoaders: js.Array[babylonjsLib.BABYLONNs.IInternalTextureLoader] = js.native
  /**
    * Gets the audio engine
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    * @ignorenaming
    */
  var audioEngine: babylonjsLib.BABYLONNs.IAudioEngine = js.native
  /**
    * Default AudioEngine Factory responsible of creating the Audio Engine.
    * By default, this will create a BabylonJS Audio Engine if the workload
    * has been embedded.
    */
  def AudioEngineFactory(hostElement: babylonjsLib.BABYLONNs.Nullable[stdLib.HTMLElement]): babylonjsLib.BABYLONNs.IAudioEngine = js.native
  /**
    * Will flag all materials in all scenes in all engines as dirty to trigger new shader compilation
    * @param flag defines which part of the materials must be marked as dirty
    * @param predicate defines a predicate used to filter which materials should be affected
    */
  def MarkAllMaterialsAsDirty(flag: scala.Double): scala.Unit = js.native
  def MarkAllMaterialsAsDirty(
    flag: scala.Double,
    predicate: js.Function1[/* mat */ babylonjsLib.BABYLONNs.Material, scala.Boolean]
  ): scala.Unit = js.native
  /**
    * Gets a boolean indicating if the engine can be instanciated (ie. if a webGL context can be found)
    * @returns true if the engine can be created
    * @ignorenaming
    */
  def isSupported(): scala.Boolean = js.native
}

