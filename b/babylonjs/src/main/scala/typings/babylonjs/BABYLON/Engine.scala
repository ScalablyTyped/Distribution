package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.ImageBitmap
import typings.babylonjs.WebGLProgram
import typings.babylonjs.WebGLUniformLocation
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.ClientRect
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.PointerEvent
import typings.std.WebGLBuffer
import typings.std.WebGLQuery
import typings.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Engine extends ThinEngine {
  
  var _cachedStencilBuffer: js.Any = js.native
  
  var _cachedStencilFunction: js.Any = js.native
  
  var _cachedStencilMask: js.Any = js.native
  
  var _cachedStencilOperationDepthFail: js.Any = js.native
  
  var _cachedStencilOperationFail: js.Any = js.native
  
  var _cachedStencilOperationPass: js.Any = js.native
  
  var _cachedStencilReference: js.Any = js.native
  
  var _clientWaitAsync: js.Any = js.native
  
  /** @hidden */
  def _connectVREvents(): Unit = js.native
  def _connectVREvents(canvas: js.UndefOr[scala.Nothing], document: js.Any): Unit = js.native
  def _connectVREvents(canvas: HTMLCanvasElement): Unit = js.native
  def _connectVREvents(canvas: HTMLCanvasElement, document: js.Any): Unit = js.native
  
  /** @hidden */
  def _createTimeQuery(): WebGLQuery = js.native
  
  /** @hidden */
  var _currentNonTimestampToken: Nullable[TimeToken] = js.native
  
  /** @hidden */
  def _deleteTimeQuery(query: WebGLQuery): Unit = js.native
  
  var _deltaTime: js.Any = js.native
  
  var _deterministicLockstep: js.Any = js.native
  
  var _disableTouchAction: js.Any = js.native
  
  /** @hidden */
  var _drawCalls: PerfCounter = js.native
  
  /** @hidden */
  var _excludedCompressedTextures: js.Array[String] = js.native
  
  var _fps: js.Any = js.native
  
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
  def _loadFileAsync(url: String, offlineProvider: js.UndefOr[scala.Nothing], useArrayBuffer: Boolean): js.Promise[String | ArrayBuffer] = js.native
  def _loadFileAsync(url: String, offlineProvider: IOfflineProvider): js.Promise[String | ArrayBuffer] = js.native
  def _loadFileAsync(url: String, offlineProvider: IOfflineProvider, useArrayBuffer: Boolean): js.Promise[String | ArrayBuffer] = js.native
  
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
  def _onVRDisplayPointerRestricted(): Unit = js.native
  
  /** @hidden */
  def _onVRDisplayPointerUnrestricted(): Unit = js.native
  
  /** @hidden */
  def _onVRFullScreenTriggered(): Unit = js.native
  
  /** @hidden */
  var _onVrDisplayConnect: Nullable[js.Function1[/* display */ _, Unit]] = js.native
  
  /** @hidden */
  var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]] = js.native
  
  /** @hidden */
  var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]] = js.native
  
  var _performanceMonitor: js.Any = js.native
  
  var _pointerLockRequested: js.Any = js.native
  
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
  def _renderFrame(): Unit = js.native
  
  /** @hidden */
  def _renderViews(): Boolean = js.native
  
  /** @hidden */
  def _requestVRFrame(): Unit = js.native
  
  var _rescalePostProcess: js.Any = js.native
  
  /** @hidden */
  def _submitVRFrame(): Unit = js.native
  
  /** @hidden */
  var _textureFormatInUse: String = js.native
  
  var _timeStep: js.Any = js.native
  
  def _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap): Unit = js.native
  def _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap, faceIndex: js.UndefOr[scala.Nothing], lod: Double): Unit = js.native
  def _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap, faceIndex: Double): Unit = js.native
  def _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap, faceIndex: Double, lod: Double): Unit = js.native
  /** @hidden */
  def _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement): Unit = js.native
  def _uploadImageToTexture(
    texture: InternalTexture,
    image: HTMLImageElement,
    faceIndex: js.UndefOr[scala.Nothing],
    lod: Double
  ): Unit = js.native
  def _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement, faceIndex: Double): Unit = js.native
  def _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement, faceIndex: Double, lod: Double): Unit = js.native
  
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
  
  /**
    * Initiates an occlusion query
    * @param algorithmType defines the algorithm to use
    * @param query defines the query to use
    * @returns the current engine
    * @see https://doc.babylonjs.com/features/occlusionquery
    */
  def beginOcclusionQuery(algorithmType: Double, query: WebGLQuery): Engine = js.native
  
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
  
  /** Gets or sets the tab index to set to the rendering canvas. 1 is the minimum value to set to be able to capture keyboard events */
  var canvasTabIndex: Double = js.native
  
  /**
    * Create an effect to use with particle systems.
    * Please note that some parameters like animation sheets or not being billboard are not supported in this configuration, except if you pass
    * the particle system for which you want to create a custom effect in the last parameter
    * @param fragmentName defines the base name of the effect (The name of file without .fragment.fx)
    * @param uniformsNames defines a list of attribute names
    * @param samplers defines an array of string used to represent textures
    * @param defines defines the string containing the defines to use to compile the shaders
    * @param fallbacks defines the list of potential fallbacks to use if shader conmpilation fails
    * @param onCompiled defines a function to call when the effect creation is successful
    * @param onError defines a function to call when the effect creation has failed
    * @param particleSystem the particle system you want to create the effect for
    * @returns the new Effect
    */
  def createEffectForParticles(fragmentName: String, uniformsNames: js.Array[String], samplers: js.Array[String], defines: String): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: js.UndefOr[scala.Nothing],
    onCompiled: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    particleSystem: IParticleSystem
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: js.UndefOr[scala.Nothing],
    onCompiled: js.UndefOr[scala.Nothing],
    onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: js.UndefOr[scala.Nothing],
    onCompiled: js.UndefOr[scala.Nothing],
    onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
    particleSystem: IParticleSystem
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: js.UndefOr[scala.Nothing],
    onCompiled: js.Function1[/* effect */ Effect, Unit]
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: js.UndefOr[scala.Nothing],
    onCompiled: js.Function1[/* effect */ Effect, Unit],
    onError: js.UndefOr[scala.Nothing],
    particleSystem: IParticleSystem
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: js.UndefOr[scala.Nothing],
    onCompiled: js.Function1[/* effect */ Effect, Unit],
    onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: js.UndefOr[scala.Nothing],
    onCompiled: js.Function1[/* effect */ Effect, Unit],
    onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
    particleSystem: IParticleSystem
  ): Effect = js.native
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
    onCompiled: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    particleSystem: IParticleSystem
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: EffectFallbacks,
    onCompiled: js.UndefOr[scala.Nothing],
    onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
  ): Effect = js.native
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: EffectFallbacks,
    onCompiled: js.UndefOr[scala.Nothing],
    onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
    particleSystem: IParticleSystem
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
    onError: js.UndefOr[scala.Nothing],
    particleSystem: IParticleSystem
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
  def createEffectForParticles(
    fragmentName: String,
    uniformsNames: js.Array[String],
    samplers: js.Array[String],
    defines: String,
    fallbacks: EffectFallbacks,
    onCompiled: js.Function1[/* effect */ Effect, Unit],
    onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
    particleSystem: IParticleSystem
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
    * Creates a webGL transform feedback object
    * Please makes sure to check webGLVersion property to check if you are running webGL 2+
    * @returns the webGL transform feedback object
    */
  def createTransformFeedback(): WebGLTransformFeedback = js.native
  
  /**
    * If set, will be used to request the next animation frame for the render loop
    */
  var customAnimationFrameRequester: Nullable[ICustomAnimationFrameRequester] = js.native
  
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
  def deleteQuery(query: WebGLQuery): Engine = js.native
  
  /**
    * Delete a webGL transform feedback object
    * @param value defines the webGL transform feedback object to delete
    */
  def deleteTransformFeedback(value: WebGLTransformFeedback): Unit = js.native
  
  /**
    * Gets or sets a boolean to enable/disable checking manifest if IndexedDB support is enabled (js will always consider the database is up to date)
    **/
  var disableManifestCheck: Boolean = js.native
  
  /**
    * Turn this value on if you want to pause FPS computation when in background
    */
  var disablePerformanceMonitorInBackground: Boolean = js.native
  
  /**
    * Disable previously set scissor test rectangle
    */
  def disableScissor(): Unit = js.native
  
  /**
    * Call this function to leave webVR mode
    * Will do nothing if webVR is not supported or if there is no webVR device
    * @see https://doc.babylonjs.com/how_to/webvr_camera
    */
  def disableVR(): Unit = js.native
  
  /**
    * Display the loading screen
    * @see https://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def displayLoadingUI(): Unit = js.native
  
  /**
    * Gets or sets a boolean to enable/disable IndexedDB support and avoid XHR on .manifest
    **/
  var enableOfflineSupport: Boolean = js.native
  
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
    * @see https://doc.babylonjs.com/how_to/webvr_camera
    */
  def enableVR(options: WebVROptions): Unit = js.native
  
  /**
    * Ends an occlusion query
    * @see https://doc.babylonjs.com/features/occlusionquery
    * @param algorithmType defines the algorithm to use
    * @returns the current engine
    */
  def endOcclusionQuery(algorithmType: Double): Engine = js.native
  
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
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
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
    * @see https://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
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
    * Gets or sets the  HTML element to use for attaching events
    */
  var inputElement: Nullable[HTMLElement] = js.native
  
  /**
    * Gets a boolean indicating that the engine is running in deterministic lock step mode
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    * @returns true if engine is in deterministic lock step mode
    */
  def isDeterministicLockStep(): Boolean = js.native
  
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
    * @see https://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def loadingScreen: ILoadingScreen = js.native
  /**
    * Sets the current loading screen object
    * @see https://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def loadingScreen_=(loadingScreen: ILoadingScreen): Unit = js.native
  
  /**
    * Sets the current loading screen background color
    * @see https://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def loadingUIBackgroundColor_=(color: String): Unit = js.native
  
  /**
    * Sets the current loading screen text
    * @see https://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  def loadingUIText_=(text: String): Unit = js.native
  
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
  var onVRRequestPresentStart: Observable[Engine] = js.native
  
  /**
    * Gets the performance monitor attached to this engine
    * @see https://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
    */
  def performanceMonitor: PerformanceMonitor = js.native
  
  /**
    * Gets the list of created postprocesses
    */
  var postProcesses: js.Array[PostProcess] = js.native
  
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
    * Gets the list of created scenes
    */
  var scenes: js.Array[Scene] = js.native
  
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
    * Set the compressed texture extensions or file names to skip.
    *
    * @param skippedFiles defines the list of those texture files you want to skip
    * Example: [".dds", ".env", "myfile.png"]
    */
  def setCompressedTextureExclusions(skippedFiles: js.Array[String]): Unit = js.native
  
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
  def setState(
    culling: Boolean,
    zOffset: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    reverseSide: Boolean
  ): Unit = js.native
  def setState(culling: Boolean, zOffset: js.UndefOr[scala.Nothing], force: Boolean): Unit = js.native
  def setState(culling: Boolean, zOffset: js.UndefOr[scala.Nothing], force: Boolean, reverseSide: Boolean): Unit = js.native
  def setState(culling: Boolean, zOffset: Double): Unit = js.native
  def setState(culling: Boolean, zOffset: Double, force: js.UndefOr[scala.Nothing], reverseSide: Boolean): Unit = js.native
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
  def setTextureFormatToUse(formatsAvailable: js.Array[String]): Nullable[String] = js.native
  
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
    * Gets the texture format in use
    */
  val textureFormatInUse: Nullable[String] = js.native
  
  /**
    * Gets the list of texture formats supported
    */
  val texturesSupported: js.Array[String] = js.native
  
  /**
    * Remove a registered child canvas
    * @param canvas defines the canvas to remove
    * @returns the current engine
    */
  def unRegisterView(canvas: HTMLCanvasElement): Engine = js.native
  
  /**
    * Updates the sample count of a render target texture
    * @see https://doc.babylonjs.com/features/webgl2#multisample-render-targets
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
  
  /** Gets or sets the list of views */
  var views: js.Array[EngineView] = js.native
  
  /**
    * Gets or sets the presentation attributes used to configure VR rendering
    */
  var vrPresentationAttributes: js.UndefOr[IVRPresentationAttributes] = js.native
}
