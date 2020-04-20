package typings.babylonjs.engineMod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.ImageBitmap
import typings.babylonjs.WebGLProgram
import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.WebGLUniformLocation
import typings.babylonjs.audioEngineMod.IAudioEngine
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.customAnimationFrameRequesterMod.ICustomAnimationFrameRequester
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.effectFallbacksMod.EffectFallbacks
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.engineViewsMod.EngineView
import typings.babylonjs.engineWebVRMod.IVRPresentationAttributes
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import typings.babylonjs.loadingScreenMod.ILoadingScreen
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathLikeMod.IColor4Like
import typings.babylonjs.mathLikeMod.IViewportLike
import typings.babylonjs.mathSizeMod.Size
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.perfCounterMod.PerfCounter
import typings.babylonjs.performanceMonitorMod.PerformanceMonitor
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.EngineOptions
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.timeTokenMod.TimeToken
import typings.babylonjs.typesMod.DataArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.int
import typings.babylonjs.webVRCameraMod.WebVROptions
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.ClientRect
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.PointerEvent
import typings.std.WebGLBuffer
import typings.std.WebGLQuery
import typings.std.WebGLTransformFeedback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Engines/engine", "Engine")
@js.native
class Engine protected () extends ThinEngine {
  /**
    * Creates a new engine
    * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which alreay used the WebGL context
    * @param antialias defines enable antialiasing (default: false)
    * @param options defines further options to be sent to the getContext() function
    * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
    */
  def this(canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext]) = this()
  def this(canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext], antialias: Boolean) = this()
  def this(
    canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext],
    antialias: Boolean,
    options: EngineOptions
  ) = this()
  def this(
    canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext],
    antialias: Boolean,
    options: EngineOptions,
    adaptToDeviceRatio: Boolean
  ) = this()
  var _cachedStencilBuffer: js.Any = js.native
  var _cachedStencilFunction: js.Any = js.native
  var _cachedStencilMask: js.Any = js.native
  var _cachedStencilOperationDepthFail: js.Any = js.native
  var _cachedStencilOperationFail: js.Any = js.native
  var _cachedStencilOperationPass: js.Any = js.native
  var _cachedStencilReference: js.Any = js.native
  var _clientWaitAsync: js.Any = js.native
  /** @hidden */
  var _currentNonTimestampToken: Nullable[TimeToken] = js.native
  var _deltaTime: js.Any = js.native
  var _deterministicLockstep: js.Any = js.native
  var _disableTouchAction: js.Any = js.native
  /** @hidden */
  var _drawCalls: PerfCounter = js.native
  var _dummyFramebuffer: js.Any = js.native
  var _fps: js.Any = js.native
  var _loadingScreen: js.Any = js.native
  var _lockstepMaxSteps: js.Any = js.native
  var _measureFps: js.Any = js.native
  /** @hidden */
  var _oldHardwareScaleFactor: Double = js.native
  /** @hidden */
  var _oldSize: Size = js.native
  var _onBlur: js.Any = js.native
  var _onCanvasBlur: js.Any = js.native
  var _onCanvasFocus: js.Any = js.native
  var _onCanvasPointerOut: js.Any = js.native
  var _onFocus: js.Any = js.native
  var _onFullscreenChange: js.Any = js.native
  var _onPointerLockChange: js.Any = js.native
  /** @hidden */
  var _onVrDisplayConnect: Nullable[js.Function1[/* display */ _, Unit]] = js.native
  /** @hidden */
  var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]] = js.native
  /** @hidden */
  var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]] = js.native
  var _performanceMonitor: js.Any = js.native
  var _pointerLockRequested: js.Any = js.native
  var _rescalePostProcess: js.Any = js.native
  var _timeStep: js.Any = js.native
  /** @hidden */
  var _vrDisplay: js.Any = js.native
  /** @hidden */
  var _vrExclusivePointerMode: Boolean = js.native
  /** @hidden */
  var _vrSupported: Boolean = js.native
  /** @hidden */
  var _webVRInitPromise: js.Promise[IDisplayChangedEventArgs] = js.native
  /**
    * Gets the current engine view
    * @see https://doc.babylonjs.com/how_to/multi_canvases
    */
  var activeView: Nullable[EngineView] = js.native
  /** Gets or sets the tab index to set to the rendering canvas. 1 is the minimum value to set to be able to capture keyboard events */
  var canvasTabIndex: Double = js.native
  /**
    * If set, will be used to request the next animation frame for the render loop
    */
  var customAnimationFrameRequester: Nullable[ICustomAnimationFrameRequester] = js.native
  /**
    * Gets or sets a boolean to enable/disable checking manifest if IndexedDB support is enabled (js will always consider the database is up to date)
    **/
  var disableManifestCheck: Boolean = js.native
  /**
    * Turn this value on if you want to pause FPS computation when in background
    */
  var disablePerformanceMonitorInBackground: Boolean = js.native
  /**
    * Gets or sets a boolean to enable/disable IndexedDB support and avoid XHR on .manifest
    **/
  var enableOfflineSupport: Boolean = js.native
  /**
    * Gets or sets the  HTML element to use for attaching events
    */
  var inputElement: Nullable[HTMLElement] = js.native
  /**
    * Gets a boolean indicating that the engine is currently in VR exclusive mode for the pointers
    * @see https://docs.microsoft.com/en-us/microsoft-edge/webvr/essentials#mouse-input
    */
  var isInVRExclusivePointerMode: Boolean = js.native
  /**
    * Gets a boolean indicating if the pointer is currently locked
    */
  var isPointerLock: Boolean = js.native
  /**
    * Observable raised when the engine has jsut compiled a shader
    */
  var onAfterShaderCompilationObservable: Observable[Engine] = js.native
  /**
    * Observable raised when the engine is about to compile a shader
    */
  var onBeforeShaderCompilationObservable: Observable[Engine] = js.native
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
  var onCanvasPointerOutObservable: Observable[PointerEvent] = js.native
  /**
    * Observable raised when the engine ends the current frame
    */
  var onEndFrameObservable: Observable[Engine] = js.native
  /**
    * Event raised when a new scene is created
    */
  var onNewSceneAddedObservable: Observable[Scene] = js.native
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
  var onVRRequestPresentComplete: Observable[Boolean] = js.native
  /**
    * Observable signaled when VR request present starts
    */
  var onVRRequestPresentStart: Observable[typings.babylonjs.engineWebVRMod.babylonjsEnginesEngineAugmentingMod.Engine] = js.native
  /**
    * Gets the list of created postprocesses
    */
  var postProcesses: js.Array[PostProcess] = js.native
  /**
    * Gets the list of created scenes
    */
  var scenes: js.Array[Scene] = js.native
  /** Gets or sets the list of views */
  var views: js.Array[EngineView] = js.native
  /**
    * Gets or sets the presentation attributes used to configure VR rendering
    */
  var vrPresentationAttributes: js.UndefOr[IVRPresentationAttributes] = js.native
  /** @hidden */
  def _connectVREvents(): Unit = js.native
  def _connectVREvents(canvas: HTMLCanvasElement): Unit = js.native
  def _connectVREvents(canvas: HTMLCanvasElement, document: js.Any): Unit = js.native
  /** @hidden */
  def _convertRGBtoRGBATextureData(rgbData: js.Any, width: Double, height: Double, textureType: Double): ArrayBufferView = js.native
  /** @hidden */
  def _createTimeQuery(): WebGLQuery = js.native
  /** @hidden */
  def _deleteTimeQuery(query: WebGLQuery): Unit = js.native
  /** @hidden */
  def _getGlAlgorithmType(algorithmType: Double): Double = js.native
  /** @hidden */
  def _getTimeQueryAvailability(query: WebGLQuery): js.Any = js.native
  /** @hidden */
  def _getTimeQueryResult(query: WebGLQuery): js.Any = js.native
  /** @hidden */
  def _getVRDisplaysAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
  /** @hidden */
  def _loadFileAsync(url: String): js.Promise[String | ArrayBuffer] = js.native
  def _loadFileAsync(url: String, offlineProvider: IOfflineProvider): js.Promise[String | ArrayBuffer] = js.native
  def _loadFileAsync(url: String, offlineProvider: IOfflineProvider, useArrayBuffer: Boolean): js.Promise[String | ArrayBuffer] = js.native
  /** @hidden */
  def _onVRDisplayPointerRestricted(): Unit = js.native
  /** @hidden */
  def _onVRDisplayPointerUnrestricted(): Unit = js.native
  /** @hidden */
  def _onVRFullScreenTriggered(): Unit = js.native
  /** @hidden */
  def _prepareVRComponent(): Unit = js.native
  /** @hidden */
  def _readPixelsAsync(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    format: Double,
    `type`: Double,
    outputBuffer: ArrayBufferView
  ): js.Promise[ArrayBufferView] | Null = js.native
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
  /** @hidden */
  def _renderFrame(): Unit = js.native
  /** @hidden */
  def _renderViews(): Boolean = js.native
  /** @hidden */
  def _requestVRFrame(): Unit = js.native
  /** @hidden */
  def _submitVRFrame(): Unit = js.native
  def _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap): Unit = js.native
  def _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap, faceIndex: Double): Unit = js.native
  def _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap, faceIndex: Double, lod: Double): Unit = js.native
  /** @hidden */
  def _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement): Unit = js.native
  def _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement, faceIndex: Double): Unit = js.native
  def _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement, faceIndex: Double, lod: Double): Unit = js.native
  /**
    * Initiates an occlusion query
    * @param algorithmType defines the algorithm to use
    * @param query defines the query to use
    * @returns the current engine
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  def beginOcclusionQuery(algorithmType: Double, query: WebGLQuery): typings.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
  /**
    * Begins a transform feedback operation
    * @param usePoints defines if points or triangles must be used
    */
  def beginTransformFeedback(usePoints: Boolean): Unit = js.native
  /**
    * Binds a multiview framebuffer to be drawn to
    * @param multiviewTexture texture to bind
    */
  def bindMultiviewFramebuffer(multiviewTexture: InternalTexture): Unit = js.native
  /**
    * Bind a webGL transform feedback object to the webgl context
    * @param value defines the webGL transform feedback object to bind
    */
  def bindTransformFeedback(value: Nullable[WebGLTransformFeedback]): Unit = js.native
  /**
    * Bind a webGL buffer for a transform feedback operation
    * @param value defines the webGL buffer to bind
    */
  def bindTransformFeedbackBuffer(value: Nullable[DataBuffer]): Unit = js.native
  /**
    * Caches the the state of the stencil buffer
    */
  def cacheStencilState(): Unit = js.native
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
  def createEffectForParticles(fragmentName: String, uniformsNames: js.Array[String], samplers: js.Array[String], defines: String): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: EffectFallbacks
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: EffectFallbacks,
    onCompiled: js.Function1[/* effect */ Effect, Unit]
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: EffectFallbacks,
    onCompiled: js.Function1[/* effect */ Effect, Unit],
    onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
  ): Effect = js.native
  /**
    * Creates a webGL buffer to use with instanciation
    * @param capacity defines the size of the buffer
    * @returns the webGL buffer
    */
  def createInstancesBuffer(capacity: Double): DataBuffer = js.native
  /**
    * Creates a new multiview render target
    * @param width defines the width of the texture
    * @param height defines the height of the texture
    * @returns the created multiview texture
    */
  def createMultiviewRenderTargetTexture(width: Double, height: Double): InternalTexture = js.native
  /**
    * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
    * @return the new query
    */
  def createQuery(): WebGLQuery = js.native
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
    scene: Scene,
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
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
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
    scene: Scene,
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
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
    ],
    samplingMode: Double,
    invertY: Boolean
  ): InternalTexture = js.native
  /**
    * Creates a webGL transform feedback object
    * Please makes sure to check webGLVersion property to check if you are running webGL 2+
    * @returns the webGL transform feedback object
    */
  def createTransformFeedback(): WebGLTransformFeedback = js.native
  /**
    * Delete a webGL buffer used with instanciation
    * @param buffer defines the webGL buffer to delete
    */
  def deleteInstancesBuffer(buffer: WebGLBuffer): Unit = js.native
  /**
    * Delete and release a webGL query
    * @param query defines the query to delete
    * @return the current engine
    */
  def deleteQuery(query: WebGLQuery): typings.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
  /**
    * Delete a webGL transform feedback object
    * @param value defines the webGL transform feedback object to delete
    */
  def deleteTransformFeedback(value: WebGLTransformFeedback): Unit = js.native
  /**
    * Disable previously set scissor test rectangle
    */
  def disableScissor(): Unit = js.native
  /**
    * Call this function to leave webVR mode
    * Will do nothing if webVR is not supported or if there is no webVR device
    * @see http://doc.babylonjs.com/how_to/webvr_camera
    */
  def disableVR(): Unit = js.native
  /**
    * Display the loading screen
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def displayLoadingUI(): Unit = js.native
  /**
    * Enable scissor test on a specific rectangle (ie. render will only be executed on a specific portion of the screen)
    * @param x defines the x-coordinate of the top left corner of the clear rectangle
    * @param y defines the y-coordinate of the corner of the clear rectangle
    * @param width defines the width of the clear rectangle
    * @param height defines the height of the clear rectangle
    */
  def enableScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
    * Call this function to switch to webVR mode
    * Will do nothing if webVR is not supported or if there is no webVR device
    * @param options the webvr options provided to the camera. mainly used for multiview
    * @see http://doc.babylonjs.com/how_to/webvr_camera
    */
  def enableVR(options: WebVROptions): Unit = js.native
  /**
    * Ends an occlusion query
    * @see http://doc.babylonjs.com/features/occlusionquery
    * @param algorithmType defines the algorithm to use
    * @returns the current engine
    */
  def endOcclusionQuery(algorithmType: Double): typings.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
  /**
    * Ends a time query
    * @param token defines the token used to measure the time span
    * @returns the time spent (in ns)
    */
  def endTimeQuery(token: TimeToken): int = js.native
  /**
    * Ends a transform feedback operation
    */
  def endTransformFeedback(): Unit = js.native
  /**
    * Enters full screen mode
    * @param requestPointerLock defines if a pointer lock should be requested from the user
    */
  def enterFullscreen(requestPointerLock: Boolean): Unit = js.native
  /**
    * Enters Pointerlock mode
    */
  def enterPointerlock(): Unit = js.native
  /**
    * Exits full screen mode
    */
  def exitFullscreen(): Unit = js.native
  /**
    * Exits Pointerlock mode
    */
  def exitPointerlock(): Unit = js.native
  /**
    * Force the mipmap generation for the given render target texture
    * @param texture defines the render target texture to use
    * @param unbind defines whether or not to unbind the texture after generation. Defaults to true.
    */
  def generateMipMapsForCubemap(texture: InternalTexture): Unit = js.native
  def generateMipMapsForCubemap(texture: InternalTexture, unbind: Boolean): Unit = js.native
  /**
    * Gets current aspect ratio
    * @param viewportOwner defines the camera to use to get the aspect ratio
    * @param useScreen defines if screen size must be used (or the current render target if any)
    * @returns a number defining the aspect ratio
    */
  def getAspectRatio(viewportOwner: IViewportOwnerLike): Double = js.native
  def getAspectRatio(viewportOwner: IViewportOwnerLike, useScreen: Boolean): Double = js.native
  /**
    * Gets the time spent between current and previous frame
    * @returns a number representing the delta time in ms
    */
  def getDeltaTime(): Double = js.native
  /**
    * Gets the current depth function
    * @returns a number defining the depth function
    */
  def getDepthFunction(): Nullable[Double] = js.native
  /**
    * Gets a boolean indicating if depth writing is enabled
    * @returns the current depth writing state
    */
  def getDepthWrite(): Boolean = js.native
  /**
    * Gets the current framerate
    * @returns a number representing the framerate
    */
  def getFps(): Double = js.native
  /**
    * Gets the source code of the fragment shader associated with a specific webGL program
    * @param program defines the program to use
    * @returns a string containing the source code of the fragment shader associated with the program
    */
  def getFragmentShaderSource(program: WebGLProgram): Nullable[String] = js.native
  /**
    * Gets the HTML element used to attach event listeners
    * @returns a HTML element
    */
  def getInputElement(): Nullable[HTMLElement] = js.native
  /**
    * Gets the client rect of the HTML element used for events
    * @returns a client rectanglee
    */
  def getInputElementClientRect(): Nullable[ClientRect] = js.native
  /**
    * Gets the max steps when engine is running in deterministic lock step
    * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    * @returns the max steps
    */
  def getLockstepMaxSteps(): Double = js.native
  /**
    * Gets the value of a given query
    * @param query defines the query to check
    * @returns the value of the query
    */
  def getQueryResult(query: WebGLQuery): Double = js.native
  /**
    * Gets the client rect of the HTML canvas attached with the current webGL context
    * @returns a client rectanglee
    */
  def getRenderingCanvasClientRect(): Nullable[ClientRect] = js.native
  /**
    * Gets current screen aspect ratio
    * @returns a number defining the aspect ratio
    */
  def getScreenAspectRatio(): Double = js.native
  /**
    * Gets a boolean indicating if stencil buffer is enabled
    * @returns the current stencil buffer state
    */
  def getStencilBuffer(): Boolean = js.native
  /**
    * Gets the current stencil function
    * @returns a number defining the stencil function to use
    */
  def getStencilFunction(): Double = js.native
  /**
    * Gets the current stencil mask
    * @returns a number defining the stencil mask to use
    */
  def getStencilFunctionMask(): Double = js.native
  /**
    * Gets the current stencil reference value
    * @returns a number defining the stencil reference value to use
    */
  def getStencilFunctionReference(): Double = js.native
  /**
    * Gets the current stencil mask
    * @returns a number defining the new stencil mask to use
    */
  def getStencilMask(): Double = js.native
  /**
    * Gets the current stencil operation when depth fails
    * @returns a number defining stencil operation to use when depth fails
    */
  def getStencilOperationDepthFail(): Double = js.native
  /**
    * Gets the current stencil operation when stencil fails
    * @returns a number defining stencil operation to use when stencil fails
    */
  def getStencilOperationFail(): Double = js.native
  /**
    * Gets the current stencil operation when stencil passes
    * @returns a number defining stencil operation to use when stencil passes
    */
  def getStencilOperationPass(): Double = js.native
  /**
    * Returns the time in ms between steps when using deterministic lock step.
    * @returns time step in (ms)
    */
  def getTimeStep(): Double = js.native
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
  def getVertexShaderSource(program: WebGLProgram): Nullable[String] = js.native
  /**
    * Gets the current value of the zOffset
    * @returns the current zOffset state
    */
  def getZOffset(): Double = js.native
  /**
    * Hide the loading screen
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def hideLoadingUI(): Unit = js.native
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
  def isDeterministicLockStep(): Boolean = js.native
  /**
    * Check if a given query has resolved and got its value
    * @param query defines the query to check
    * @returns true if the query got its value
    */
  def isQueryResultAvailable(query: WebGLQuery): Boolean = js.native
  /**
    * Gets a boolean indicating if a webVR device was detected
    * @returns true if a webVR device was detected
    */
  def isVRDevicePresent(): Boolean = js.native
  /**
    * Gets a boolean indicating that the system is in VR mode and is presenting
    * @returns true if VR mode is engaged
    */
  def isVRPresenting(): Boolean = js.native
  /**
    * Gets the current loading screen object
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def loadingScreen: ILoadingScreen = js.native
  /**
    * Sets the current loading screen object
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def loadingScreen(loadingScreen: ILoadingScreen): js.Any = js.native
  /**
    * Sets the current loading screen background color
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def loadingUIBackgroundColor(color: String): js.Any = js.native
  /**
    * Sets the current loading screen text
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def loadingUIText(text: String): js.Any = js.native
  /**
    * Gets the performance monitor attached to this engine
    * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
    */
  def performanceMonitor: PerformanceMonitor = js.native
  /**
    * Register a new child canvas
    * @param canvas defines the canvas to register
    * @param camera defines an optional camera to use with this canvas (it will overwrite the scene.camera for this view)
    * @returns the associated view
    */
  def registerView(canvas: HTMLCanvasElement): EngineView = js.native
  def registerView(canvas: HTMLCanvasElement, camera: Camera): EngineView = js.native
  /**
    * Restores the state of the stencil buffer
    */
  def restoreStencilState(): Unit = js.native
  /**
    * Executes a scissor clear (ie. a clear on a specific portion of the screen)
    * @param x defines the x-coordinate of the top left corner of the clear rectangle
    * @param y defines the y-coordinate of the corner of the clear rectangle
    * @param width defines the width of the clear rectangle
    * @param height defines the height of the clear rectangle
    * @param clearColor defines the clear color
    */
  def scissorClear(x: Double, y: Double, width: Double, height: Double, clearColor: IColor4Like): Unit = js.native
  /**
    * Enable or disable depth buffering
    * @param enable defines the state to set
    */
  def setDepthBuffer(enable: Boolean): Unit = js.native
  /**
    * Sets the current depth function
    * @param depthFunc defines the function to use
    */
  def setDepthFunction(depthFunc: Double): Unit = js.native
  /**
    * Sets the current depth function to GREATER
    */
  def setDepthFunctionToGreater(): Unit = js.native
  /**
    * Sets the current depth function to GEQUAL
    */
  def setDepthFunctionToGreaterOrEqual(): Unit = js.native
  /**
    * Sets the current depth function to LESS
    */
  def setDepthFunctionToLess(): Unit = js.native
  /**
    * Sets the current depth function to LEQUAL
    */
  def setDepthFunctionToLessOrEqual(): Unit = js.native
  /**
    * Sets a depth stencil texture from a render target to the according uniform.
    * @param channel The texture channel
    * @param uniform The uniform to set
    * @param texture The render target texture containing the depth stencil texture to apply
    */
  def setDepthStencilTexture(channel: Double, uniform: Nullable[WebGLUniformLocation], texture: Nullable[RenderTargetTexture]): Unit = js.native
  /**
    * Enable or disable depth writing
    * @param enable defines the state to set
    */
  def setDepthWrite(enable: Boolean): Unit = js.native
  /**
    * Directly set the WebGL Viewport
    * @param x defines the x coordinate of the viewport (in screen space)
    * @param y defines the y coordinate of the viewport (in screen space)
    * @param width defines the width of the viewport (in screen space)
    * @param height defines the height of the viewport (in screen space)
    * @return the current viewport Object (if any) that is being replaced by this call. You can restore this viewport later on to go back to the original state
    */
  def setDirectViewport(x: Double, y: Double, width: Double, height: Double): Nullable[IViewportLike] = js.native
  /**
    * Sets a boolean indicating if the dithering state is enabled or disabled
    * @param value defines the dithering state
    */
  def setDitheringState(value: Boolean): Unit = js.native
  /**
    * Sets a boolean indicating if the rasterizer state is enabled or disabled
    * @param value defines the rasterizer state
    */
  def setRasterizerState(value: Boolean): Unit = js.native
  /** States */
  /**
    * Set various states to the webGL context
    * @param culling defines backface culling state
    * @param zOffset defines the value to apply to zOffset (0 by default)
    * @param force defines if states must be applied even if cache is up to date
    * @param reverseSide defines if culling must be reversed (CCW instead of CW and CW instead of CCW)
    */
  def setState(culling: Boolean): Unit = js.native
  def setState(culling: Boolean, zOffset: Double): Unit = js.native
  def setState(culling: Boolean, zOffset: Double, force: Boolean): Unit = js.native
  def setState(culling: Boolean, zOffset: Double, force: Boolean, reverseSide: Boolean): Unit = js.native
  /**
    * Enable or disable the stencil buffer
    * @param enable defines if the stencil buffer must be enabled or disabled
    */
  def setStencilBuffer(enable: Boolean): Unit = js.native
  /**
    * Sets the current stencil function
    * @param stencilFunc defines the new stencil function to use
    */
  def setStencilFunction(stencilFunc: Double): Unit = js.native
  /**
    * Sets the current stencil mask
    * @param mask defines the new stencil mask to use
    */
  def setStencilFunctionMask(mask: Double): Unit = js.native
  /**
    * Sets the current stencil reference
    * @param reference defines the new stencil reference to use
    */
  def setStencilFunctionReference(reference: Double): Unit = js.native
  /**
    * Sets the current stencil mask
    * @param mask defines the new stencil mask to use
    */
  def setStencilMask(mask: Double): Unit = js.native
  /**
    * Sets the stencil operation to use when depth fails
    * @param operation defines the stencil operation to use when depth fails
    */
  def setStencilOperationDepthFail(operation: Double): Unit = js.native
  /**
    * Sets the stencil operation to use when stencil fails
    * @param operation defines the stencil operation to use when stencil fails
    */
  def setStencilOperationFail(operation: Double): Unit = js.native
  /**
    * Sets the stencil operation to use when stencil passes
    * @param operation defines the stencil operation to use when stencil passes
    */
  def setStencilOperationPass(operation: Double): Unit = js.native
  /**
    * Sets a texture to the webGL context from a postprocess
    * @param channel defines the channel to use
    * @param postProcess defines the source postprocess
    */
  def setTextureFromPostProcess(channel: Double, postProcess: Nullable[PostProcess]): Unit = js.native
  /**
    * Binds the output of the passed in post process to the texture channel specified
    * @param channel The channel the texture should be bound to
    * @param postProcess The post process which's output should be bound
    */
  def setTextureFromPostProcessOutput(channel: Double, postProcess: Nullable[PostProcess]): Unit = js.native
  /**
    * Specify the varyings to use with transform feedback
    * @param program defines the associated webGL program
    * @param value defines the list of strings representing the varying names
    */
  def setTranformFeedbackVaryings(program: WebGLProgram, value: js.Array[String]): Unit = js.native
  /**
    * Set the z offset to apply to current rendering
    * @param value defines the offset to apply
    */
  def setZOffset(value: Double): Unit = js.native
  /**
    * Starts a time query (used to measure time spent by the GPU on a specific frame)
    * Please note that only one query can be issued at a time
    * @returns a time token used to track the time span
    */
  def startTimeQuery(): Nullable[TimeToken] = js.native
  /**
    * Toggle full screen mode
    * @param requestPointerLock defines if a pointer lock should be requested from the user
    */
  def switchFullscreen(requestPointerLock: Boolean): Unit = js.native
  /**
    * Remove a registered child canvas
    * @param canvas defines the canvas to remove
    * @returns the current engine
    */
  def unRegisterView(canvas: HTMLCanvasElement): typings.babylonjs.engineViewsMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
  /**
    * Update a dynamic index buffer
    * @param indexBuffer defines the target index buffer
    * @param indices defines the data to update
    * @param offset defines the offset in the target index buffer where update should start
    */
  def updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: IndicesArray): Unit = js.native
  def updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: IndicesArray, offset: Double): Unit = js.native
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
    * Updates the sample count of a render target texture
    * @see http://doc.babylonjs.com/features/webgl2#multisample-render-targets
    * @param texture defines the texture to update
    * @param samples defines the sample count to set
    * @returns the effective sample count (could be 0 if multisample render targets are not supported)
    */
  def updateRenderTargetTextureSampleCount(texture: Nullable[InternalTexture], samples: Double): Double = js.native
  /**
    * Updates a depth texture Comparison Mode and Function.
    * If the comparison Function is equal to 0, the mode will be set to none.
    * Otherwise, this only works in webgl 2 and requires a shadow sampler in the shader.
    * @param texture The texture to set the comparison function for
    * @param comparisonFunction The comparison function to set, 0 if no comparison required
    */
  def updateTextureComparisonFunction(texture: InternalTexture, comparisonFunction: Double): Unit = js.native
}

/* static members */
@JSImport("babylonjs/Engines/engine", "Engine")
@js.native
object Engine extends js.Object {
  /** Defines that alpha blending to SRC ALPHA * SRC + DEST */
  val ALPHA_ADD: Double = js.native
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC ALPHA) * DEST */
  val ALPHA_COMBINE: Double = js.native
  /** Defines that alpha blending is disabled */
  val ALPHA_DISABLE: Double = js.native
  /** Defines that alpha blending to CST * SRC + (1 - CST) * DEST */
  val ALPHA_INTERPOLATE: Double = js.native
  /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC) * DEST */
  val ALPHA_MAXIMIZED: Double = js.native
  /** Defines that alpha blending to SRC * DEST */
  val ALPHA_MULTIPLY: Double = js.native
  /** Defines that alpha blending to SRC + DEST */
  val ALPHA_ONEONE: Double = js.native
  /** Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST */
  val ALPHA_PREMULTIPLIED: Double = js.native
  /**
    * Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST
    * Alpha will be set to (1 - SRC ALPHA) * DEST ALPHA
    */
  val ALPHA_PREMULTIPLIED_PORTERDUFF: Double = js.native
  /**
    * Defines that alpha blending to SRC + (1 - SRC) * DEST
    * Alpha will be set to SRC ALPHA + (1 - SRC ALPHA) * DEST ALPHA
    */
  val ALPHA_SCREENMODE: Double = js.native
  /** Defines that alpha blending to DEST - SRC * DEST */
  val ALPHA_SUBTRACT: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  val ALWAYS: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be decremented */
  val DECR: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be decremented with wrapping */
  val DECR_WRAP: Double = js.native
  /** Defines that the ressource was successfully delay loaded */
  val DELAYLOADSTATE_LOADED: Double = js.native
  /** Defines that the ressource is currently delay loading */
  val DELAYLOADSTATE_LOADING: Double = js.native
  /** Defines that the ressource is not delayed*/
  val DELAYLOADSTATE_NONE: Double = js.native
  /** Defines that the ressource is delayed and has not started loading */
  val DELAYLOADSTATE_NOTLOADED: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is equals to the stored value */
  val EQUAL: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value */
  val GEQUAL: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than the stored value */
  val GREATER: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be incremented */
  val INCR: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be incremented with wrapping */
  val INCR_WRAP: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be inverted */
  val INVERT: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be kept */
  val KEEP: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value */
  val LEQUAL: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than the stored value */
  val LESS: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will never pass. i.e. Nothing will be drawn */
  val NEVER: Double = js.native
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is not equal to the stored value */
  val NOTEQUAL: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  val REPLACE: Double = js.native
  /** Defines that texture rescaling will use a ceil to find the closer power of 2 size */
  val SCALEMODE_CEILING: Double = js.native
  /** Defines that texture rescaling will use a floor to find the closer power of 2 size */
  val SCALEMODE_FLOOR: Double = js.native
  /** Defines that texture rescaling will look for the nearest power of 2 size */
  val SCALEMODE_NEAREST: Double = js.native
  /** ALPHA */
  val TEXTUREFORMAT_ALPHA: Double = js.native
  /** LUMINANCE */
  val TEXTUREFORMAT_LUMINANCE: Double = js.native
  /** LUMINANCE_ALPHA */
  val TEXTUREFORMAT_LUMINANCE_ALPHA: Double = js.native
  /** RED (2nd reference) */
  val TEXTUREFORMAT_R: Double = js.native
  /** RED */
  val TEXTUREFORMAT_RED: Double = js.native
  /** RED_INTEGER */
  val TEXTUREFORMAT_RED_INTEGER: Double = js.native
  /** RG */
  val TEXTUREFORMAT_RG: Double = js.native
  /** RGB */
  val TEXTUREFORMAT_RGB: Double = js.native
  /** RGBA */
  val TEXTUREFORMAT_RGBA: Double = js.native
  /** RGBA_INTEGER */
  val TEXTUREFORMAT_RGBA_INTEGER: Double = js.native
  /** RGB_INTEGER */
  val TEXTUREFORMAT_RGB_INTEGER: Double = js.native
  /** RG_INTEGER */
  val TEXTUREFORMAT_RG_INTEGER: Double = js.native
  /** RED_INTEGER (2nd reference) */
  val TEXTUREFORMAT_R_INTEGER: Double = js.native
  /** BYTE */
  val TEXTURETYPE_BYTE: Double = js.native
  /** FLOAT */
  val TEXTURETYPE_FLOAT: Double = js.native
  /** FLOAT_32_UNSIGNED_INT_24_8_REV */
  val TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: Double = js.native
  /** HALF_FLOAT */
  val TEXTURETYPE_HALF_FLOAT: Double = js.native
  /** INT */
  val TEXTURETYPE_INT: Double = js.native
  /** SHORT */
  val TEXTURETYPE_SHORT: Double = js.native
  /** UNSIGNED_BYTE */
  val TEXTURETYPE_UNSIGNED_BYTE: Double = js.native
  /** UNSIGNED_BYTE (2nd reference) */
  val TEXTURETYPE_UNSIGNED_INT: Double = js.native
  /** UNSIGNED_INT */
  val TEXTURETYPE_UNSIGNED_INTEGER: Double = js.native
  /** UNSIGNED_INT_10F_11F_11F_REV */
  val TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: Double = js.native
  /** UNSIGNED_INT_24_8 */
  val TEXTURETYPE_UNSIGNED_INT_24_8: Double = js.native
  /** UNSIGNED_INT_2_10_10_10_REV */
  val TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: Double = js.native
  /** UNSIGNED_INT_5_9_9_9_REV */
  val TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: Double = js.native
  /** UNSIGNED_SHORT */
  val TEXTURETYPE_UNSIGNED_SHORT: Double = js.native
  /** UNSIGNED_SHORT_4_4_4_4 */
  val TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: Double = js.native
  /** UNSIGNED_SHORT_5_5_5_1 */
  val TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: Double = js.native
  /** UNSIGNED_SHORT_5_6_5 */
  val TEXTURETYPE_UNSIGNED_SHORT_5_6_5: Double = js.native
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val TEXTURE_BILINEAR_SAMPLINGMODE: Double = js.native
  /** Texture is not repeating outside of 0..1 UVs */
  val TEXTURE_CLAMP_ADDRESSMODE: Double = js.native
  /** Cubic coordinates mode */
  val TEXTURE_CUBIC_MODE: Double = js.native
  /** Equirectangular coordinates mode */
  val TEXTURE_EQUIRECTANGULAR_MODE: Double = js.native
  /** Explicit coordinates mode */
  val TEXTURE_EXPLICIT_MODE: Double = js.native
  /** Equirectangular Fixed Mirrored coordinates mode */
  val TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
  /** Equirectangular Fixed coordinates mode */
  val TEXTURE_FIXED_EQUIRECTANGULAR_MODE: Double = js.native
  /** Inverse Cubic coordinates mode */
  val TEXTURE_INVCUBIC_MODE: Double = js.native
  /** mag = linear and min = linear and mip = none */
  val TEXTURE_LINEAR_LINEAR: Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TEXTURE_LINEAR_LINEAR_MIPLINEAR: Double = js.native
  /** Bilinear is mag = linear and min = linear and mip = nearest */
  val TEXTURE_LINEAR_LINEAR_MIPNEAREST: Double = js.native
  /** mag = linear and min = nearest and mip = none */
  val TEXTURE_LINEAR_NEAREST: Double = js.native
  /** mag = linear and min = nearest and mip = linear */
  val TEXTURE_LINEAR_NEAREST_MIPLINEAR: Double = js.native
  /** mag = linear and min = nearest and mip = nearest */
  val TEXTURE_LINEAR_NEAREST_MIPNEAREST: Double = js.native
  /** Texture is repeating and mirrored */
  val TEXTURE_MIRROR_ADDRESSMODE: Double = js.native
  /** mag = nearest and min = linear and mip = none */
  val TEXTURE_NEAREST_LINEAR: Double = js.native
  /** mag = nearest and min = linear and mip = linear */
  val TEXTURE_NEAREST_LINEAR_MIPLINEAR: Double = js.native
  /** mag = nearest and min = linear and mip = nearest */
  val TEXTURE_NEAREST_LINEAR_MIPNEAREST: Double = js.native
  /** mag = nearest and min = nearest and mip = none */
  val TEXTURE_NEAREST_NEAREST: Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val TEXTURE_NEAREST_NEAREST_MIPLINEAR: Double = js.native
  /** mag = nearest and min = nearest and mip = nearest */
  val TEXTURE_NEAREST_NEAREST_MIPNEAREST: Double = js.native
  /** nearest is mag = nearest and min = nearest and mip = linear */
  val TEXTURE_NEAREST_SAMPLINGMODE: Double = js.native
  /** Planar coordinates mode */
  val TEXTURE_PLANAR_MODE: Double = js.native
  /** Projection coordinates mode */
  val TEXTURE_PROJECTION_MODE: Double = js.native
  /** Skybox coordinates mode */
  val TEXTURE_SKYBOX_MODE: Double = js.native
  /** Spherical coordinates mode */
  val TEXTURE_SPHERICAL_MODE: Double = js.native
  /** Trilinear is mag = linear and min = linear and mip = linear */
  val TEXTURE_TRILINEAR_SAMPLINGMODE: Double = js.native
  /** Texture is repeating outside of 0..1 UVs */
  val TEXTURE_WRAP_ADDRESSMODE: Double = js.native
  /**
    * Method called to create the default rescale post process on each engine.
    */
  var _RescalePostProcessFactory: Nullable[js.Function1[/* engine */ this.type, PostProcess]] = js.native
  /**
    * Gets the audio engine
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    * @ignorenaming
    */
  var audioEngine: IAudioEngine = js.native
  /**
    * Default AudioEngine factory responsible of creating the Audio Engine.
    * By default, this will create a BabylonJS Audio Engine if the workload has been embedded.
    */
  def AudioEngineFactory(hostElement: Nullable[HTMLElement]): IAudioEngine = js.native
  /**
    * Method called to create the default loading screen.
    * This can be overriden in your own app.
    * @param canvas The rendering canvas element
    * @returns The loading screen
    */
  def DefaultLoadingScreenFactory(canvas: HTMLCanvasElement): ILoadingScreen = js.native
  /** Gets the list of created engines */
  def Instances: js.Array[Engine] = js.native
  /**
    * Gets the latest created engine
    */
  def LastCreatedEngine: Nullable[Engine] = js.native
  /**
    * Gets the latest created scene
    */
  def LastCreatedScene: Nullable[Scene] = js.native
  /**
    * Will flag all materials in all scenes in all engines as dirty to trigger new shader compilation
    * @param flag defines which part of the materials must be marked as dirty
    * @param predicate defines a predicate used to filter which materials should be affected
    */
  def MarkAllMaterialsAsDirty(flag: Double): Unit = js.native
  def MarkAllMaterialsAsDirty(flag: Double, predicate: js.Function1[/* mat */ Material, Boolean]): Unit = js.native
  /**
    * Returns the current npm package of the sdk
    */
  def NpmPackage: String = js.native
  /**
    * Default offline support factory responsible of creating a tool used to store data locally.
    * By default, this will create a Database object if the workload has been embedded.
    */
  def OfflineProviderFactory(
    urlToScene: String,
    callbackManifestChecked: js.Function1[/* checked */ Boolean, _],
    disableManifestCheck: Boolean
  ): IOfflineProvider = js.native
  /**
    * Returns the current version of the framework
    */
  def Version: String = js.native
  /**
    * Asks the browser to exit fullscreen mode
    */
  def _ExitFullscreen(): Unit = js.native
  /**
    * Asks the browser to exit pointerlock mode
    */
  def _ExitPointerlock(): Unit = js.native
  /**
    * Ask the browser to promote the current element to fullscreen rendering mode
    * @param element defines the DOM element to promote
    */
  def _RequestFullscreen(element: HTMLElement): Unit = js.native
  /** Pointerlock and fullscreen */
  /**
    * Ask the browser to promote the current element to pointerlock mode
    * @param element defines the DOM element to promote
    */
  def _RequestPointerlock(element: HTMLElement): Unit = js.native
}

