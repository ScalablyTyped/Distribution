package typings.babylonjs

import typings.babylonjs.anon.Ascent
import typings.babylonjs.audioInterfacesIaudioengineMod.IAudioEngine
import typings.babylonjs.buffersDataBufferMod.DataBuffer
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.camerasVRWebVRCameraMod.WebVROptions
import typings.babylonjs.deviceInputInternalDeviceSourceManagerMod.InternalDeviceSourceManager
import typings.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionQuery
import typings.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView
import typings.babylonjs.enginesExtensionsEngineDotwebVRMod.IVRPresentationAttributes
import typings.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.enginesThinEngineMod.EngineOptions
import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.instrumentationTimeTokenMod.TimeToken
import typings.babylonjs.loadingLoadingScreenMod.ILoadingScreen
import typings.babylonjs.materialsEffectFallbacksMod.EffectFallbacks
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.mathsMathDotlikeMod.IColor4Like
import typings.babylonjs.mathsMathDotlikeMod.IViewportLike
import typings.babylonjs.mathsMathDotsizeMod.Size
import typings.babylonjs.miscCustomAnimationFrameRequesterMod.ICustomAnimationFrameRequester
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.miscPerfCounterMod.PerfCounter
import typings.babylonjs.miscPerformanceMonitorMod.PerformanceMonitor
import typings.babylonjs.offlineIofflineproviderMod.IOfflineProvider
import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.int
import typings.std.AudioContext
import typings.std.AudioDestinationNode
import typings.std.ClientRect
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.ImageBitmapOptions
import typings.std.ImageBitmapSource
import typings.std.MediaStreamAudioDestinationNode
import typings.std.MediaTrackConstraints
import typings.std.PointerEvent
import typings.std.WebGLBuffer
import typings.std.WebGLQuery
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import typings.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesEngineMod {
  
  @JSImport("babylonjs/Engines/engine", "Engine")
  @js.native
  open class Engine protected () extends ThinEngine {
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
    
    /* private */ var _cachedStencilBuffer: Any = js.native
    
    /* private */ var _cachedStencilFunction: Any = js.native
    
    /* private */ var _cachedStencilMask: Any = js.native
    
    /* private */ var _cachedStencilOperationDepthFail: Any = js.native
    
    /* private */ var _cachedStencilOperationFail: Any = js.native
    
    /* private */ var _cachedStencilOperationPass: Any = js.native
    
    /* private */ var _cachedStencilReference: Any = js.native
    
    /** @internal */
    var _captureGPUFrameTime: Boolean = js.native
    
    /* private */ var _clientWaitAsync: Any = js.native
    
    /* protected */ var _compatibilityMode: Boolean = js.native
    
    /**
      * @internal
      */
    def _connectVREvents(): Unit = js.native
    def _connectVREvents(canvas: Unit, document: Any): Unit = js.native
    def _connectVREvents(canvas: HTMLCanvasElement): Unit = js.native
    def _connectVREvents(canvas: HTMLCanvasElement, document: Any): Unit = js.native
    
    /** @internal */
    /**
      * Engine abstraction for loading and creating an image bitmap from a given source string.
      * @param imageSource source to load the image from.
      * @param options An object that sets options for the image's extraction.
      * @returns ImageBitmap.
      */
    def _createImageBitmapFromSource(imageSource: String): js.Promise[ImageBitmap] = js.native
    def _createImageBitmapFromSource(imageSource: String, options: ImageBitmapOptions): js.Promise[ImageBitmap] = js.native
    
    /** @internal */
    def _createTimeQuery(): WebGLQuery = js.native
    
    /** @internal */
    var _currentNonTimestampToken: Nullable[TimeToken] = js.native
    
    /** @internal */
    def _deleteTimeQuery(query: WebGLQuery): Unit = js.native
    
    /* private */ var _deltaTime: Any = js.native
    
    /* protected */ var _deterministicLockstep: Boolean = js.native
    
    /** @internal */
    var _deviceSourceManager: js.UndefOr[InternalDeviceSourceManager] = js.native
    
    /* private */ var _disableTouchAction: Any = js.native
    
    /** @internal */
    var _drawCalls: PerfCounter = js.native
    
    /** @internal */
    var _excludedCompressedTextures: js.Array[String] = js.native
    
    /* private */ var _fps: Any = js.native
    
    /** @internal */
    def _getGlAlgorithmType(algorithmType: Double): Double = js.native
    
    /** @internal */
    def _getTimeQueryAvailability(query: WebGLQuery): Any = js.native
    
    /** @internal */
    def _getTimeQueryResult(query: WebGLQuery): Any = js.native
    
    /** @internal */
    def _getVRDisplaysAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
    
    /** @internal */
    var _gpuFrameTime: PerfCounter = js.native
    
    /** @internal */
    var _gpuFrameTimeToken: Nullable[TimeToken] = js.native
    
    /** @internal */
    var _inputElement: Nullable[HTMLElement] = js.native
    
    /**
      * @internal
      */
    def _loadFileAsync(url: String): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(url: String, offlineProvider: Unit, useArrayBuffer: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(url: String, offlineProvider: IOfflineProvider): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    def _loadFileAsync(url: String, offlineProvider: IOfflineProvider, useArrayBuffer: Boolean): js.Promise[String | js.typedarray.ArrayBuffer] = js.native
    
    /* private */ var _loadingScreen: Any = js.native
    
    /* protected */ var _lockstepMaxSteps: Double = js.native
    
    /* private */ var _measureFps: Any = js.native
    
    /** @internal */
    var _oldHardwareScaleFactor: Double = js.native
    
    /** @internal */
    var _oldSize: Size = js.native
    
    /** @internal */
    var _onBeginFrameObserver: Nullable[
        Observer[
          typings.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine
        ]
      ] = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onCanvasBlur: Any = js.native
    
    /* private */ var _onCanvasContextMenu: Any = js.native
    
    /* private */ var _onCanvasFocus: Any = js.native
    
    /* private */ var _onCanvasPointerOut: Any = js.native
    
    /** @internal */
    var _onEndFrameObserver: Nullable[
        Observer[
          typings.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine
        ]
      ] = js.native
    
    /**
      * Observable to handle when a change to inputElement occurs
      * @internal
      */
    var _onEngineViewChanged: js.UndefOr[js.Function0[Unit]] = js.native
    
    /* private */ var _onFocus: Any = js.native
    
    /* private */ var _onFullscreenChange: Any = js.native
    
    /* private */ var _onPointerLockChange: Any = js.native
    
    /** @internal */
    def _onVRDisplayPointerRestricted(): Unit = js.native
    
    /** @internal */
    def _onVRDisplayPointerUnrestricted(): Unit = js.native
    
    /** @internal */
    def _onVRFullScreenTriggered(): Unit = js.native
    
    /** @internal */
    var _onVrDisplayConnect: Nullable[js.Function1[/* display */ Any, Unit]] = js.native
    
    /** @internal */
    var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]] = js.native
    
    /** @internal */
    var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]] = js.native
    
    /* private */ var _performanceMonitor: Any = js.native
    
    /* private */ var _pointerLockRequested: Any = js.native
    
    /** @internal */
    def _prepareVRComponent(): Unit = js.native
    
    /**
      * @internal
      */
    def _readPixelsAsync(
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      format: Double,
      `type`: Double,
      outputBuffer: js.typedarray.ArrayBufferView
    ): js.Promise[js.typedarray.ArrayBufferView] | Null = js.native
    
    /** @internal */
    def _renderFrame(): Unit = js.native
    
    /* private */ var _renderPassNames: Any = js.native
    
    /**
      * @internal
      */
    def _renderViewStep(view: EngineView): Boolean = js.native
    
    /** @internal */
    def _renderViews(): Boolean = js.native
    
    def _reportDrawCall(numDrawCalls: Double): Unit = js.native
    
    /** @internal */
    def _requestVRFrame(): Unit = js.native
    
    /* private */ var _rescalePostProcess: Any = js.native
    
    /** @internal */
    def _submitVRFrame(): Unit = js.native
    
    /** @internal */
    var _textureFormatInUse: String = js.native
    
    /* protected */ var _timeStep: Double = js.native
    
    /**
      * @internal
      */
    def _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement): Unit = js.native
    def _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement, faceIndex: Double): Unit = js.native
    def _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement, faceIndex: Double, lod: Double): Unit = js.native
    def _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement, faceIndex: Unit, lod: Double): Unit = js.native
    def _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap): Unit = js.native
    def _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap, faceIndex: Double): Unit = js.native
    def _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap, faceIndex: Double, lod: Double): Unit = js.native
    def _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap, faceIndex: Unit, lod: Double): Unit = js.native
    
    /** @internal */
    def _verifyPointerLock(): Unit = js.native
    
    /** @internal */
    var _virtualScenes: js.Array[Scene] = js.native
    
    /** @internal */
    var _vrDisplay: Any = js.native
    
    /** @internal */
    var _vrExclusivePointerMode: Boolean = js.native
    
    /** @internal */
    var _vrSupported: Boolean = js.native
    
    /** @internal */
    var _webVRInitPromise: js.Promise[IDisplayChangedEventArgs] = js.native
    
    /**
      * Gets the current engine view
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/multiCanvas
      */
    var activeView: Nullable[EngineView] = js.native
    
    /**
      * Initiates an occlusion query
      * @param algorithmType defines the algorithm to use
      * @param query defines the query to use
      * @returns the current engine
      * @see https://doc.babylonjs.com/features/featuresDeepDive/occlusionQueries
      */
    def beginOcclusionQuery(algorithmType: Double, query: OcclusionQuery): Boolean = js.native
    
    /**
      * Begins a transform feedback operation
      * @param usePoints defines if points or triangles must be used
      */
    def beginTransformFeedback(usePoints: Boolean): Unit = js.native
    
    /**
      * Binds a multiview render target wrapper to be drawn to
      * @param multiviewTexture render target wrapper to bind
      */
    def bindMultiviewFramebuffer(multiviewTexture: RenderTargetWrapper): Unit = js.native
    
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
      * Enable or disable the GPU frame time capture
      * @param value True to enable, false to disable
      */
    def captureGPUFrameTime(value: Boolean): Unit = js.native
    
    /**
      * (WebGPU only) True (default) to be in compatibility mode, meaning rendering all existing scenes without artifacts (same rendering than WebGL).
      * Setting the property to false will improve performances but may not work in some scenes if some precautions are not taken.
      * See https://doc.babylonjs.com/setup/support/webGPU/webGPUOptimization/webGPUNonCompatibilityMode for more details
      */
    def compatibilityMode: Boolean = js.native
    def compatibilityMode_=(mode: Boolean): Unit = js.native
    
    /**
      * Create an effect to use with particle systems.
      * Please note that some parameters like animation sheets or not being billboard are not supported in this configuration, except if you pass
      * the particle system for which you want to create a custom effect in the last parameter
      * @param fragmentName defines the base name of the effect (The name of file without .fragment.fx)
      * @param uniformsNames defines a list of attribute names
      * @param samplers defines an array of string used to represent textures
      * @param defines defines the string containing the defines to use to compile the shaders
      * @param fallbacks defines the list of potential fallbacks to use if shader compilation fails
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
      fallbacks: Unit,
      onCompiled: js.Function1[/* effect */ Effect, Unit]
    ): Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: js.Function1[/* effect */ Effect, Unit],
      onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
    ): Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: js.Function1[/* effect */ Effect, Unit],
      onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
      particleSystem: IParticleSystem
    ): Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: js.Function1[/* effect */ Effect, Unit],
      onError: Unit,
      particleSystem: IParticleSystem
    ): Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: Unit,
      onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
    ): Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: Unit,
      onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
      particleSystem: IParticleSystem
    ): Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: Unit,
      onError: Unit,
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
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: EffectFallbacks,
      onCompiled: js.Function1[/* effect */ Effect, Unit],
      onError: Unit,
      particleSystem: IParticleSystem
    ): Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: EffectFallbacks,
      onCompiled: Unit,
      onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
    ): Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: EffectFallbacks,
      onCompiled: Unit,
      onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
      particleSystem: IParticleSystem
    ): Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: EffectFallbacks,
      onCompiled: Unit,
      onError: Unit,
      particleSystem: IParticleSystem
    ): Effect = js.native
    
    /**
      * Engine abstraction for createImageBitmap
      * @param image source for image
      * @param options An object that sets options for the image's extraction.
      * @returns ImageBitmap
      */
    def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
    def createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): js.Promise[ImageBitmap] = js.native
    
    /**
      * Creates a webGL buffer to use with instantiation
      * @param capacity defines the size of the buffer
      * @returns the webGL buffer
      */
    def createInstancesBuffer(capacity: Double): DataBuffer = js.native
    
    /**
      * Creates a new multiview render target
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @returns the created multiview render target wrapper
      */
    def createMultiviewRenderTargetTexture(width: Double, height: Double): RenderTargetWrapper = js.native
    
    /**
      * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
      * @returns the new query
      */
    def createQuery(): OcclusionQuery = js.native
    
    /**
      * Creates a render pass id
      * @param name Name of the render pass (for debug purpose only)
      * @returns the id of the new render pass
      */
    def createRenderPassId(): Double = js.native
    def createRenderPassId(name: String): Double = js.native
    
    /**
      * Creates a webGL transform feedback object
      * Please makes sure to check webGLVersion property to check if you are running webGL 2+
      * @returns the webGL transform feedback object
      */
    def createTransformFeedback(): WebGLTransformFeedback = js.native
    
    /**
      * creates and returns a new video element
      * @param constraints video constraints
      * @returns video element
      */
    def createVideoElement(constraints: MediaTrackConstraints): Any = js.native
    
    /**
      * Gets or sets the current render pass id
      */
    var currentRenderPassId: Double = js.native
    
    /**
      * If set, will be used to request the next animation frame for the render loop
      */
    var customAnimationFrameRequester: Nullable[ICustomAnimationFrameRequester] = js.native
    
    /**
      * Delete a webGL buffer used with instantiation
      * @param buffer defines the webGL buffer to delete
      */
    def deleteInstancesBuffer(buffer: WebGLBuffer): Unit = js.native
    
    /**
      * Delete and release a webGL query
      * @param query defines the query to delete
      * @returns the current engine
      */
    def deleteQuery(query: OcclusionQuery): typings.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
    /**
      * Delete a webGL transform feedback object
      * @param value defines the webGL transform feedback object to delete
      */
    def deleteTransformFeedback(value: WebGLTransformFeedback): Unit = js.native
    
    /**
      * Gets or sets a boolean to enable/disable the context menu (right-click) from appearing on the main canvas
      */
    var disableContextMenu: Boolean = js.native
    
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
      * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/webVRCamera
      */
    def disableVR(): Unit = js.native
    
    /**
      * Display the loading screen
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/customLoadingScreen
      */
    def displayLoadingUI(): Unit = js.native
    
    /**
      * Gets or sets a boolean to enable/disable IndexedDB support and avoid XHR on .manifest
      **/
    var enableOfflineSupport: Boolean = js.native
    
    /**
      * Enable scissor test on a specific rectangle (ie. render will only be executed on a specific portion of the screen)
      * @param x defines the x-coordinate of the bottom left corner of the clear rectangle
      * @param y defines the y-coordinate of the corner of the clear rectangle
      * @param width defines the width of the clear rectangle
      * @param height defines the height of the clear rectangle
      */
    def enableScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /**
      * Call this function to switch to webVR mode
      * Will do nothing if webVR is not supported or if there is no webVR device
      * @param options the webvr options provided to the camera. mainly used for multiview
      * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/webVRCamera
      */
    def enableVR(options: WebVROptions): Unit = js.native
    
    /**
      * Ends an occlusion query
      * @see https://doc.babylonjs.com/features/featuresDeepDive/occlusionQueries
      * @param algorithmType defines the algorithm to use
      * @returns the current engine
      */
    def endOcclusionQuery(algorithmType: Double): typings.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
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
      * Gets the name of the current render pass
      * @returns name of the current render pass
      */
    def getCurrentRenderPassName(): String = js.native
    
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
    
    /** States */
    /**
      * Gets a boolean indicating if depth writing is enabled
      * @returns the current depth writing state
      */
    def getDepthWrite(): Boolean = js.native
    
    /**
      * Get Font size information
      * @param font font name
      * @returns an object containing ascent, height and descent
      */
    def getFontOffset(font: String): Ascent = js.native
    
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
      * Get the performance counter associated with the frame time computation
      * @returns the perf counter
      */
    def getGPUFrameTimeCounter(): PerfCounter = js.native
    
    /**
      * Gets the HTML element used to attach event listeners
      * @returns a HTML element
      */
    def getInputElement(): Nullable[HTMLElement] = js.native
    
    /**
      * Gets the client rect of the HTML element used for events
      * @returns a client rectangle
      */
    def getInputElementClientRect(): Nullable[ClientRect] = js.native
    
    /**
      * Gets the max steps when engine is running in deterministic lock step
      * @see https://doc.babylonjs.com/features/featuresDeepDive/animation/advanced_animations#deterministic-lockstep
      * @returns the max steps
      */
    def getLockstepMaxSteps(): Double = js.native
    
    /**
      * Gets the value of a given query
      * @param query defines the query to check
      * @returns the value of the query
      */
    def getQueryResult(query: OcclusionQuery): Double = js.native
    
    /**
      * Gets the names of the render passes that are currently created
      * @returns list of the render pass names
      */
    def getRenderPassNames(): js.Array[String] = js.native
    
    /**
      * Gets the client rect of the HTML canvas attached with the current webGL context
      * @returns a client rectangle
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
    def getVRDevice(): Any = js.native
    
    /**
      * Gets the source code of the vertex shader associated with a specific webGL program
      * @param program defines the program to use
      * @returns a string containing the source code of the vertex shader associated with the program
      */
    def getVertexShaderSource(program: WebGLProgram): Nullable[String] = js.native
    
    /**
      * Hide the loading screen
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/customLoadingScreen
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
      * @see https://doc.babylonjs.com/features/featuresDeepDive/animation/advanced_animations#deterministic-lockstep
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
    def isQueryResultAvailable(query: OcclusionQuery): Boolean = js.native
    
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
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/customLoadingScreen
      */
    def loadingScreen: ILoadingScreen = js.native
    /**
      * Sets the current loading screen object
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/customLoadingScreen
      */
    def loadingScreen_=(loadingScreen: ILoadingScreen): Unit = js.native
    
    /**
      * Sets the current loading screen background color
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/customLoadingScreen
      */
    def loadingUIBackgroundColor_=(color: String): Unit = js.native
    
    /**
      * Sets the current loading screen text
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/customLoadingScreen
      */
    def loadingUIText_=(text: String): Unit = js.native
    
    /**
      * Observable raised when the engine has just compiled a shader
      */
    var onAfterShaderCompilationObservable: Observable[Engine] = js.native
    
    /**
      * Will be triggered after the view rendered
      */
    val onAfterViewRenderObservable: Observable[EngineView] = js.native
    
    /**
      * Observable raised when the engine is about to compile a shader
      */
    var onBeforeShaderCompilationObservable: Observable[Engine] = js.native
    
    /**
      * Will be triggered before the view renders
      */
    val onBeforeViewRenderObservable: Observable[EngineView] = js.native
    
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
    var onVRRequestPresentStart: Observable[
        typings.babylonjs.enginesExtensionsEngineDotwebVRMod.babylonjsEnginesEngineAugmentingMod.Engine
      ] = js.native
    
    /**
      * Gets the performance monitor attached to this engine
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/optimize_your_scene#engineinstrumentation
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
      * @param clearBeforeCopy Indicates if the destination view canvas should be cleared before copying the parent canvas. Can help if the scene clear color has alpha < 1
      * @returns the associated view
      */
    def registerView(canvas: HTMLCanvasElement): EngineView = js.native
    def registerView(canvas: HTMLCanvasElement, camera: Unit, clearBeforeCopy: Boolean): EngineView = js.native
    def registerView(canvas: HTMLCanvasElement, camera: Camera): EngineView = js.native
    def registerView(canvas: HTMLCanvasElement, camera: Camera, clearBeforeCopy: Boolean): EngineView = js.native
    
    /**
      * Releases a render pass id
      * @param id id of the render pass to release
      */
    def releaseRenderPassId(id: Double): Unit = js.native
    
    /**
      * Resize an image and returns the image data as an uint8array
      * @param image image to resize
      * @param bufferWidth destination buffer width
      * @param bufferHeight destination buffer height
      * @returns an uint8array containing RGBA values of bufferWidth * bufferHeight size
      */
    def resizeImageBitmap(image: HTMLImageElement, bufferWidth: Double, bufferHeight: Double): js.typedarray.Uint8Array = js.native
    def resizeImageBitmap(image: ImageBitmap, bufferWidth: Double, bufferHeight: Double): js.typedarray.Uint8Array = js.native
    
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
      * @param x defines the x-coordinate of the bottom left corner of the clear rectangle
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
      * @param name The texture name
      */
    def setDepthStencilTexture(channel: Double, uniform: Nullable[WebGLUniformLocation], texture: Nullable[RenderTargetTexture]): Unit = js.native
    def setDepthStencilTexture(
      channel: Double,
      uniform: Nullable[WebGLUniformLocation],
      texture: Nullable[RenderTargetTexture],
      name: String
    ): Unit = js.native
    
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
      * @returns the current viewport Object (if any) that is being replaced by this call. You can restore this viewport later on to go back to the original state
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
      * @param name name of the channel
      */
    def setTextureFromPostProcess(channel: Double, postProcess: Nullable[PostProcess], name: String): Unit = js.native
    
    /**
      * Binds the output of the passed in post process to the texture channel specified
      * @param channel The channel the texture should be bound to
      * @param postProcess The post process which's output should be bound
      * @param name name of the channel
      */
    def setTextureFromPostProcessOutput(channel: Double, postProcess: Nullable[PostProcess], name: String): Unit = js.native
    
    /**
      * Specify the varyings to use with transform feedback
      * @param program defines the associated webGL program
      * @param value defines the list of strings representing the varying names
      */
    def setTranformFeedbackVaryings(program: WebGLProgram, value: js.Array[String]): Unit = js.native
    
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
    def unRegisterView(canvas: HTMLCanvasElement): typings.babylonjs.enginesExtensionsEngineDotviewsMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
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
    
    /**
      * Wraps an external web gl texture in a Babylon texture.
      * @param texture defines the external texture
      * @param hasMipMaps defines whether the external texture has mip maps (default: false)
      * @param samplingMode defines the sampling mode for the external texture (default: Constants.TEXTURE_TRILINEAR_SAMPLINGMODE)
      * @returns the babylon internal texture
      */
    def wrapWebGLTexture(texture: WebGLTexture): InternalTexture = js.native
    def wrapWebGLTexture(texture: WebGLTexture, hasMipMaps: Boolean): InternalTexture = js.native
    def wrapWebGLTexture(texture: WebGLTexture, hasMipMaps: Boolean, samplingMode: Double): InternalTexture = js.native
    def wrapWebGLTexture(texture: WebGLTexture, hasMipMaps: Unit, samplingMode: Double): InternalTexture = js.native
  }
  /* static members */
  object Engine {
    
    @JSImport("babylonjs/Engines/engine", "Engine")
    @js.native
    val ^ : js.Any = js.native
    
    /** Defines that alpha blending to SRC ALPHA * SRC + DEST */
    @JSImport("babylonjs/Engines/engine", "Engine.ALPHA_ADD")
    @js.native
    val ALPHA_ADD: Double = js.native
    
    /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC ALPHA) * DEST */
    @JSImport("babylonjs/Engines/engine", "Engine.ALPHA_COMBINE")
    @js.native
    val ALPHA_COMBINE: Double = js.native
    
    /** Defines that alpha blending is disabled */
    @JSImport("babylonjs/Engines/engine", "Engine.ALPHA_DISABLE")
    @js.native
    val ALPHA_DISABLE: Double = js.native
    
    /** Defines that alpha blending to CST * SRC + (1 - CST) * DEST */
    @JSImport("babylonjs/Engines/engine", "Engine.ALPHA_INTERPOLATE")
    @js.native
    val ALPHA_INTERPOLATE: Double = js.native
    
    /** Defines that alpha blending to SRC ALPHA * SRC + (1 - SRC) * DEST */
    @JSImport("babylonjs/Engines/engine", "Engine.ALPHA_MAXIMIZED")
    @js.native
    val ALPHA_MAXIMIZED: Double = js.native
    
    /** Defines that alpha blending to SRC * DEST */
    @JSImport("babylonjs/Engines/engine", "Engine.ALPHA_MULTIPLY")
    @js.native
    val ALPHA_MULTIPLY: Double = js.native
    
    /** Defines that alpha blending to SRC + DEST */
    @JSImport("babylonjs/Engines/engine", "Engine.ALPHA_ONEONE")
    @js.native
    val ALPHA_ONEONE: Double = js.native
    
    /** Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST */
    @JSImport("babylonjs/Engines/engine", "Engine.ALPHA_PREMULTIPLIED")
    @js.native
    val ALPHA_PREMULTIPLIED: Double = js.native
    
    /**
      * Defines that alpha blending to SRC + (1 - SRC ALPHA) * DEST
      * Alpha will be set to (1 - SRC ALPHA) * DEST ALPHA
      */
    @JSImport("babylonjs/Engines/engine", "Engine.ALPHA_PREMULTIPLIED_PORTERDUFF")
    @js.native
    val ALPHA_PREMULTIPLIED_PORTERDUFF: Double = js.native
    
    /**
      * Defines that alpha blending to SRC + (1 - SRC) * DEST
      * Alpha will be set to SRC ALPHA + (1 - SRC ALPHA) * DEST ALPHA
      */
    @JSImport("babylonjs/Engines/engine", "Engine.ALPHA_SCREENMODE")
    @js.native
    val ALPHA_SCREENMODE: Double = js.native
    
    /** Defines that alpha blending to DEST - SRC * DEST */
    @JSImport("babylonjs/Engines/engine", "Engine.ALPHA_SUBTRACT")
    @js.native
    val ALPHA_SUBTRACT: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
    @JSImport("babylonjs/Engines/engine", "Engine.ALWAYS")
    @js.native
    val ALWAYS: Double = js.native
    
    /**
      * Default AudioEngine factory responsible of creating the Audio Engine.
      * By default, this will create a BabylonJS Audio Engine if the workload has been embedded.
      */
    inline def AudioEngineFactory(
      hostElement: Nullable[HTMLElement],
      audioContext: Nullable[AudioContext],
      audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode]
    ): IAudioEngine = (^.asInstanceOf[js.Dynamic].applyDynamic("AudioEngineFactory")(hostElement.asInstanceOf[js.Any], audioContext.asInstanceOf[js.Any], audioDestination.asInstanceOf[js.Any])).asInstanceOf[IAudioEngine]
    
    /** Passed to stencilOperation to specify that stencil value must be decremented */
    @JSImport("babylonjs/Engines/engine", "Engine.DECR")
    @js.native
    val DECR: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be decremented with wrapping */
    @JSImport("babylonjs/Engines/engine", "Engine.DECR_WRAP")
    @js.native
    val DECR_WRAP: Double = js.native
    
    /** Defines that the resource was successfully delay loaded */
    @JSImport("babylonjs/Engines/engine", "Engine.DELAYLOADSTATE_LOADED")
    @js.native
    val DELAYLOADSTATE_LOADED: Double = js.native
    
    /** Defines that the resource is currently delay loading */
    @JSImport("babylonjs/Engines/engine", "Engine.DELAYLOADSTATE_LOADING")
    @js.native
    val DELAYLOADSTATE_LOADING: Double = js.native
    
    /** Defines that the resource is not delayed*/
    @JSImport("babylonjs/Engines/engine", "Engine.DELAYLOADSTATE_NONE")
    @js.native
    val DELAYLOADSTATE_NONE: Double = js.native
    
    /** Defines that the resource is delayed and has not started loading */
    @JSImport("babylonjs/Engines/engine", "Engine.DELAYLOADSTATE_NOTLOADED")
    @js.native
    val DELAYLOADSTATE_NOTLOADED: Double = js.native
    
    /**
      * Method called to create the default loading screen.
      * This can be overridden in your own app.
      * @param canvas The rendering canvas element
      * @returns The loading screen
      */
    inline def DefaultLoadingScreenFactory(canvas: HTMLCanvasElement): ILoadingScreen = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultLoadingScreenFactory")(canvas.asInstanceOf[js.Any]).asInstanceOf[ILoadingScreen]
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is equals to the stored value */
    @JSImport("babylonjs/Engines/engine", "Engine.EQUAL")
    @js.native
    val EQUAL: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than or equal to the stored value */
    @JSImport("babylonjs/Engines/engine", "Engine.GEQUAL")
    @js.native
    val GEQUAL: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is greater than the stored value */
    @JSImport("babylonjs/Engines/engine", "Engine.GREATER")
    @js.native
    val GREATER: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be incremented */
    @JSImport("babylonjs/Engines/engine", "Engine.INCR")
    @js.native
    val INCR: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be incremented with wrapping */
    @JSImport("babylonjs/Engines/engine", "Engine.INCR_WRAP")
    @js.native
    val INCR_WRAP: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be inverted */
    @JSImport("babylonjs/Engines/engine", "Engine.INVERT")
    @js.native
    val INVERT: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be kept */
    @JSImport("babylonjs/Engines/engine", "Engine.KEEP")
    @js.native
    val KEEP: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than or equal to the stored value */
    @JSImport("babylonjs/Engines/engine", "Engine.LEQUAL")
    @js.native
    val LEQUAL: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is less than the stored value */
    @JSImport("babylonjs/Engines/engine", "Engine.LESS")
    @js.native
    val LESS: Double = js.native
    
    /**
      * Will flag all materials in all scenes in all engines as dirty to trigger new shader compilation
      * @param flag defines which part of the materials must be marked as dirty
      * @param predicate defines a predicate used to filter which materials should be affected
      */
    inline def MarkAllMaterialsAsDirty(flag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("MarkAllMaterialsAsDirty")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def MarkAllMaterialsAsDirty(flag: Double, predicate: js.Function1[/* mat */ Material, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("MarkAllMaterialsAsDirty")(flag.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will never pass. i.e. Nothing will be drawn */
    @JSImport("babylonjs/Engines/engine", "Engine.NEVER")
    @js.native
    val NEVER: Double = js.native
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will pass if the new depth value is not equal to the stored value */
    @JSImport("babylonjs/Engines/engine", "Engine.NOTEQUAL")
    @js.native
    val NOTEQUAL: Double = js.native
    
    /**
      * Default offline support factory responsible of creating a tool used to store data locally.
      * By default, this will create a Database object if the workload has been embedded.
      */
    inline def OfflineProviderFactory(
      urlToScene: String,
      callbackManifestChecked: js.Function1[/* checked */ Boolean, Any],
      disableManifestCheck: Boolean
    ): IOfflineProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("OfflineProviderFactory")(urlToScene.asInstanceOf[js.Any], callbackManifestChecked.asInstanceOf[js.Any], disableManifestCheck.asInstanceOf[js.Any])).asInstanceOf[IOfflineProvider]
    
    /** Passed to stencilOperation to specify that stencil value must be replaced */
    @JSImport("babylonjs/Engines/engine", "Engine.REPLACE")
    @js.native
    val REPLACE: Double = js.native
    
    /** Defines that texture rescaling will use a ceil to find the closer power of 2 size */
    @JSImport("babylonjs/Engines/engine", "Engine.SCALEMODE_CEILING")
    @js.native
    val SCALEMODE_CEILING: Double = js.native
    
    /** Defines that texture rescaling will use a floor to find the closer power of 2 size */
    @JSImport("babylonjs/Engines/engine", "Engine.SCALEMODE_FLOOR")
    @js.native
    val SCALEMODE_FLOOR: Double = js.native
    
    /** Defines that texture rescaling will look for the nearest power of 2 size */
    @JSImport("babylonjs/Engines/engine", "Engine.SCALEMODE_NEAREST")
    @js.native
    val SCALEMODE_NEAREST: Double = js.native
    
    /** ALPHA */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_ALPHA")
    @js.native
    val TEXTUREFORMAT_ALPHA: Double = js.native
    
    /** LUMINANCE */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_LUMINANCE")
    @js.native
    val TEXTUREFORMAT_LUMINANCE: Double = js.native
    
    /** LUMINANCE_ALPHA */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_LUMINANCE_ALPHA")
    @js.native
    val TEXTUREFORMAT_LUMINANCE_ALPHA: Double = js.native
    
    /** RED (2nd reference) */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_R")
    @js.native
    val TEXTUREFORMAT_R: Double = js.native
    
    /** RED */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_RED")
    @js.native
    val TEXTUREFORMAT_RED: Double = js.native
    
    /** RED_INTEGER */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_RED_INTEGER")
    @js.native
    val TEXTUREFORMAT_RED_INTEGER: Double = js.native
    
    /** RG */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_RG")
    @js.native
    val TEXTUREFORMAT_RG: Double = js.native
    
    /** RGB */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_RGB")
    @js.native
    val TEXTUREFORMAT_RGB: Double = js.native
    
    /** RGBA */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_RGBA")
    @js.native
    val TEXTUREFORMAT_RGBA: Double = js.native
    
    /** RGBA_INTEGER */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_RGBA_INTEGER")
    @js.native
    val TEXTUREFORMAT_RGBA_INTEGER: Double = js.native
    
    /** RGB_INTEGER */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_RGB_INTEGER")
    @js.native
    val TEXTUREFORMAT_RGB_INTEGER: Double = js.native
    
    /** RG_INTEGER */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_RG_INTEGER")
    @js.native
    val TEXTUREFORMAT_RG_INTEGER: Double = js.native
    
    /** RED_INTEGER (2nd reference) */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTUREFORMAT_R_INTEGER")
    @js.native
    val TEXTUREFORMAT_R_INTEGER: Double = js.native
    
    /** BYTE */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_BYTE")
    @js.native
    val TEXTURETYPE_BYTE: Double = js.native
    
    /** FLOAT */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_FLOAT")
    @js.native
    val TEXTURETYPE_FLOAT: Double = js.native
    
    /** FLOAT_32_UNSIGNED_INT_24_8_REV */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV")
    @js.native
    val TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: Double = js.native
    
    /** HALF_FLOAT */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_HALF_FLOAT")
    @js.native
    val TEXTURETYPE_HALF_FLOAT: Double = js.native
    
    /** INT */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_INT")
    @js.native
    val TEXTURETYPE_INT: Double = js.native
    
    /** SHORT */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_SHORT")
    @js.native
    val TEXTURETYPE_SHORT: Double = js.native
    
    /** UNSIGNED_BYTE */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_UNSIGNED_BYTE")
    @js.native
    val TEXTURETYPE_UNSIGNED_BYTE: Double = js.native
    
    /** UNSIGNED_BYTE (2nd reference) */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_UNSIGNED_INT")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT: Double = js.native
    
    /** UNSIGNED_INT */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_UNSIGNED_INTEGER")
    @js.native
    val TEXTURETYPE_UNSIGNED_INTEGER: Double = js.native
    
    /** UNSIGNED_INT_10F_11F_11F_REV */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: Double = js.native
    
    /** UNSIGNED_INT_24_8 */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_UNSIGNED_INT_24_8")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_24_8: Double = js.native
    
    /** UNSIGNED_INT_2_10_10_10_REV */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: Double = js.native
    
    /** UNSIGNED_INT_5_9_9_9_REV */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV")
    @js.native
    val TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: Double = js.native
    
    /** UNSIGNED_SHORT */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_UNSIGNED_SHORT")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT: Double = js.native
    
    /** UNSIGNED_SHORT_4_4_4_4 */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: Double = js.native
    
    /** UNSIGNED_SHORT_5_5_5_1 */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: Double = js.native
    
    /** UNSIGNED_SHORT_5_6_5 */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURETYPE_UNSIGNED_SHORT_5_6_5")
    @js.native
    val TEXTURETYPE_UNSIGNED_SHORT_5_6_5: Double = js.native
    
    /** Bilinear is mag = linear and min = linear and mip = nearest */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_BILINEAR_SAMPLINGMODE")
    @js.native
    val TEXTURE_BILINEAR_SAMPLINGMODE: Double = js.native
    
    /** Texture is not repeating outside of 0..1 UVs */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_CLAMP_ADDRESSMODE")
    @js.native
    val TEXTURE_CLAMP_ADDRESSMODE: Double = js.native
    
    /** Cubic coordinates mode */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_CUBIC_MODE")
    @js.native
    val TEXTURE_CUBIC_MODE: Double = js.native
    
    /** Equirectangular coordinates mode */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_EQUIRECTANGULAR_MODE")
    @js.native
    val TEXTURE_EQUIRECTANGULAR_MODE: Double = js.native
    
    /** Explicit coordinates mode */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_EXPLICIT_MODE")
    @js.native
    val TEXTURE_EXPLICIT_MODE: Double = js.native
    
    /** Equirectangular Fixed Mirrored coordinates mode */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE")
    @js.native
    val TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
    
    /** Equirectangular Fixed coordinates mode */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_FIXED_EQUIRECTANGULAR_MODE")
    @js.native
    val TEXTURE_FIXED_EQUIRECTANGULAR_MODE: Double = js.native
    
    /** Inverse Cubic coordinates mode */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_INVCUBIC_MODE")
    @js.native
    val TEXTURE_INVCUBIC_MODE: Double = js.native
    
    /** mag = linear and min = linear and mip = none */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_LINEAR_LINEAR")
    @js.native
    val TEXTURE_LINEAR_LINEAR: Double = js.native
    
    /** Trilinear is mag = linear and min = linear and mip = linear */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_LINEAR_LINEAR_MIPLINEAR")
    @js.native
    val TEXTURE_LINEAR_LINEAR_MIPLINEAR: Double = js.native
    
    /** Bilinear is mag = linear and min = linear and mip = nearest */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_LINEAR_LINEAR_MIPNEAREST")
    @js.native
    val TEXTURE_LINEAR_LINEAR_MIPNEAREST: Double = js.native
    
    /** mag = linear and min = nearest and mip = none */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_LINEAR_NEAREST")
    @js.native
    val TEXTURE_LINEAR_NEAREST: Double = js.native
    
    /** mag = linear and min = nearest and mip = linear */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_LINEAR_NEAREST_MIPLINEAR")
    @js.native
    val TEXTURE_LINEAR_NEAREST_MIPLINEAR: Double = js.native
    
    /** mag = linear and min = nearest and mip = nearest */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_LINEAR_NEAREST_MIPNEAREST")
    @js.native
    val TEXTURE_LINEAR_NEAREST_MIPNEAREST: Double = js.native
    
    /** Texture is repeating and mirrored */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_MIRROR_ADDRESSMODE")
    @js.native
    val TEXTURE_MIRROR_ADDRESSMODE: Double = js.native
    
    /** mag = nearest and min = linear and mip = none */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_NEAREST_LINEAR")
    @js.native
    val TEXTURE_NEAREST_LINEAR: Double = js.native
    
    /** mag = nearest and min = linear and mip = linear */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_NEAREST_LINEAR_MIPLINEAR")
    @js.native
    val TEXTURE_NEAREST_LINEAR_MIPLINEAR: Double = js.native
    
    /** mag = nearest and min = linear and mip = nearest */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_NEAREST_LINEAR_MIPNEAREST")
    @js.native
    val TEXTURE_NEAREST_LINEAR_MIPNEAREST: Double = js.native
    
    /** mag = nearest and min = nearest and mip = none */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_NEAREST_NEAREST")
    @js.native
    val TEXTURE_NEAREST_NEAREST: Double = js.native
    
    /** nearest is mag = nearest and min = nearest and mip = linear */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_NEAREST_NEAREST_MIPLINEAR")
    @js.native
    val TEXTURE_NEAREST_NEAREST_MIPLINEAR: Double = js.native
    
    /** mag = nearest and min = nearest and mip = nearest */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_NEAREST_NEAREST_MIPNEAREST")
    @js.native
    val TEXTURE_NEAREST_NEAREST_MIPNEAREST: Double = js.native
    
    /** nearest is mag = nearest and min = nearest and mip = none */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_NEAREST_SAMPLINGMODE")
    @js.native
    val TEXTURE_NEAREST_SAMPLINGMODE: Double = js.native
    
    /** Planar coordinates mode */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_PLANAR_MODE")
    @js.native
    val TEXTURE_PLANAR_MODE: Double = js.native
    
    /** Projection coordinates mode */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_PROJECTION_MODE")
    @js.native
    val TEXTURE_PROJECTION_MODE: Double = js.native
    
    /** Skybox coordinates mode */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_SKYBOX_MODE")
    @js.native
    val TEXTURE_SKYBOX_MODE: Double = js.native
    
    /** Spherical coordinates mode */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_SPHERICAL_MODE")
    @js.native
    val TEXTURE_SPHERICAL_MODE: Double = js.native
    
    /** Trilinear is mag = linear and min = linear and mip = linear */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_TRILINEAR_SAMPLINGMODE")
    @js.native
    val TEXTURE_TRILINEAR_SAMPLINGMODE: Double = js.native
    
    /** Texture is repeating outside of 0..1 UVs */
    @JSImport("babylonjs/Engines/engine", "Engine.TEXTURE_WRAP_ADDRESSMODE")
    @js.native
    val TEXTURE_WRAP_ADDRESSMODE: Double = js.native
    
    /**
      * Asks the browser to exit fullscreen mode
      */
    inline def _ExitFullscreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_ExitFullscreen")().asInstanceOf[Unit]
    
    /**
      * Asks the browser to exit pointerlock mode
      */
    inline def _ExitPointerlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_ExitPointerlock")().asInstanceOf[Unit]
    
    @JSImport("babylonjs/Engines/engine", "Engine._RenderPassIdCounter")
    @js.native
    def _RenderPassIdCounter: Double = js.native
    inline def _RenderPassIdCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RenderPassIdCounter")(x.asInstanceOf[js.Any])
    
    /**
      * Ask the browser to promote the current element to fullscreen rendering mode
      * @param element defines the DOM element to promote
      */
    inline def _RequestFullscreen(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RequestFullscreen")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Pointerlock and fullscreen */
    /**
      * Ask the browser to promote the current element to pointerlock mode
      * @param element defines the DOM element to promote
      */
    inline def _RequestPointerlock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_RequestPointerlock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Method called to create the default rescale post process on each engine.
      */
    @JSImport("babylonjs/Engines/engine", "Engine._RescalePostProcessFactory")
    @js.native
    def _RescalePostProcessFactory: Nullable[js.Function1[/* engine */ this.type, PostProcess]] = js.native
    inline def _RescalePostProcessFactory_=(x: Nullable[js.Function1[/* engine */ this.type, PostProcess]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RescalePostProcessFactory")(x.asInstanceOf[js.Any])
    
    /**
      * Gets the audio engine
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
      * @ignorenaming
      */
    @JSImport("babylonjs/Engines/engine", "Engine.audioEngine")
    @js.native
    def audioEngine: Nullable[IAudioEngine] = js.native
    inline def audioEngine_=(x: Nullable[IAudioEngine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audioEngine")(x.asInstanceOf[js.Any])
  }
  
  trait IDisplayChangedEventArgs extends StObject {
    
    /** Gets the vrDisplay object (if any) */
    var vrDisplay: Nullable[Any]
    
    /** Gets a boolean indicating if webVR is supported */
    var vrSupported: Boolean
  }
  object IDisplayChangedEventArgs {
    
    inline def apply(vrSupported: Boolean): IDisplayChangedEventArgs = {
      val __obj = js.Dynamic.literal(vrSupported = vrSupported.asInstanceOf[js.Any], vrDisplay = null)
      __obj.asInstanceOf[IDisplayChangedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDisplayChangedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setVrDisplay(value: Nullable[Any]): Self = StObject.set(x, "vrDisplay", value.asInstanceOf[js.Any])
      
      inline def setVrDisplayNull: Self = StObject.set(x, "vrDisplay", null)
      
      inline def setVrSupported(value: Boolean): Self = StObject.set(x, "vrSupported", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Defines the interface used by objects containing a viewport (like a camera)
    */
  trait IViewportOwnerLike extends StObject {
    
    /**
      * Gets or sets the viewport
      */
    var viewport: IViewportLike
  }
  object IViewportOwnerLike {
    
    inline def apply(viewport: IViewportLike): IViewportOwnerLike = {
      val __obj = js.Dynamic.literal(viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[IViewportOwnerLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IViewportOwnerLike] (val x: Self) extends AnyVal {
      
      inline def setViewport(value: IViewportLike): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
}
