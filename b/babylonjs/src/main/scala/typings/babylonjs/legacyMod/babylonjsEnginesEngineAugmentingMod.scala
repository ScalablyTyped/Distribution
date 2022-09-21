package typings.babylonjs.legacyMod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.WebGLProgram
import typings.babylonjs.engineMod.IDisplayChangedEventArgs
import typings.babylonjs.engineQueryMod.OcclusionQuery
import typings.babylonjs.engineWebVRMod.IVRPresentationAttributes
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.int
import typings.babylonjs.webVRCameraMod.WebVROptions
import typings.std.HTMLElement
import typings.std.WebGLQuery
import typings.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsEnginesEngineAugmentingMod {
  
  @js.native
  trait Engine extends StObject {
    
    /** @hidden */
    var _captureGPUFrameTime: Boolean = js.native
    
    /** @hidden */
    def _createTimeQuery(): WebGLQuery = js.native
    
    /** @hidden */
    var _currentNonTimestampToken: Nullable[typings.babylonjs.timeTokenMod.TimeToken] = js.native
    
    /** @hidden */
    def _deleteTimeQuery(query: WebGLQuery): Unit = js.native
    
    /** @hidden */
    var _excludedCompressedTextures: js.Array[String] = js.native
    
    /** @hidden */
    def _getGlAlgorithmType(algorithmType: Double): Double = js.native
    
    /** @hidden */
    def _getTimeQueryAvailability(query: WebGLQuery): Any = js.native
    
    /** @hidden */
    def _getTimeQueryResult(query: WebGLQuery): Any = js.native
    
    /** @hidden */
    def _getVRDisplaysAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
    
    /** @hidden */
    var _gpuFrameTime: typings.babylonjs.perfCounterMod.PerfCounter = js.native
    
    /** @hidden */
    var _gpuFrameTimeToken: Nullable[typings.babylonjs.timeTokenMod.TimeToken] = js.native
    
    /** @hidden */
    var _inputElement: Nullable[HTMLElement] = js.native
    
    /** @hidden */
    var _oldHardwareScaleFactor: Double = js.native
    
    /** @hidden */
    var _oldSize: typings.babylonjs.mathSizeMod.Size = js.native
    
    /** @hidden */
    var _onBeginFrameObserver: Nullable[
        typings.babylonjs.observableMod.Observer[typings.babylonjs.engineQueryMod.babylonjsEnginesEngineAugmentingMod.Engine]
      ] = js.native
    
    /** @hidden */
    var _onEndFrameObserver: Nullable[
        typings.babylonjs.observableMod.Observer[typings.babylonjs.engineQueryMod.babylonjsEnginesEngineAugmentingMod.Engine]
      ] = js.native
    
    /**
      * Observable to handle when a change to inputElement occurs
      * @hidden
      */
    var _onEngineViewChanged: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** @hidden */
    def _onVRDisplayPointerRestricted(): Unit = js.native
    
    /** @hidden */
    def _onVRDisplayPointerUnrestricted(): Unit = js.native
    
    /** @hidden */
    def _onVRFullScreenTriggered(): Unit = js.native
    
    /** @hidden */
    var _onVrDisplayConnect: Nullable[js.Function1[/* display */ Any, Unit]] = js.native
    
    /** @hidden */
    var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]] = js.native
    
    /** @hidden */
    var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]] = js.native
    
    /** @hidden */
    var _textureFormatInUse: String = js.native
    
    /** @hidden */
    var _vrDisplay: Any = js.native
    
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
    var activeView: Nullable[typings.babylonjs.engineViewsMod.EngineView] = js.native
    
    /**
      * Initiates an occlusion query
      * @param algorithmType defines the algorithm to use
      * @param query defines the query to use
      * @returns the current engine
      * @see https://doc.babylonjs.com/features/occlusionquery
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
    def bindMultiviewFramebuffer(multiviewTexture: typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper): Unit = js.native
    
    /**
      * Bind a webGL transform feedback object to the webgl context
      * @param value defines the webGL transform feedback object to bind
      */
    def bindTransformFeedback(value: Nullable[WebGLTransformFeedback]): Unit = js.native
    
    /**
      * Bind a webGL buffer for a transform feedback operation
      * @param value defines the webGL buffer to bind
      */
    def bindTransformFeedbackBuffer(value: Nullable[typings.babylonjs.dataBufferMod.DataBuffer]): Unit = js.native
    
    /**
      * Enable or disable the GPU frame time capture
      * @param value True to enable, false to disable
      */
    def captureGPUFrameTime(value: Boolean): Unit = js.native
    
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
    def createEffectForParticles(fragmentName: String, uniformsNames: js.Array[String], samplers: js.Array[String], defines: String): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: js.Function1[/* effect */ typings.babylonjs.effectMod.Effect, Unit]
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: js.Function1[/* effect */ typings.babylonjs.effectMod.Effect, Unit],
      onError: js.Function2[/* effect */ typings.babylonjs.effectMod.Effect, /* errors */ String, Unit]
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: js.Function1[/* effect */ typings.babylonjs.effectMod.Effect, Unit],
      onError: js.Function2[/* effect */ typings.babylonjs.effectMod.Effect, /* errors */ String, Unit],
      particleSystem: IParticleSystem
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: js.Function1[/* effect */ typings.babylonjs.effectMod.Effect, Unit],
      onError: Unit,
      particleSystem: IParticleSystem
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: Unit,
      onError: js.Function2[/* effect */ typings.babylonjs.effectMod.Effect, /* errors */ String, Unit]
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: Unit,
      onError: js.Function2[/* effect */ typings.babylonjs.effectMod.Effect, /* errors */ String, Unit],
      particleSystem: IParticleSystem
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: Unit,
      onCompiled: Unit,
      onError: Unit,
      particleSystem: IParticleSystem
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks,
      onCompiled: js.Function1[/* effect */ typings.babylonjs.effectMod.Effect, Unit]
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks,
      onCompiled: js.Function1[/* effect */ typings.babylonjs.effectMod.Effect, Unit],
      onError: js.Function2[/* effect */ typings.babylonjs.effectMod.Effect, /* errors */ String, Unit]
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks,
      onCompiled: js.Function1[/* effect */ typings.babylonjs.effectMod.Effect, Unit],
      onError: js.Function2[/* effect */ typings.babylonjs.effectMod.Effect, /* errors */ String, Unit],
      particleSystem: IParticleSystem
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks,
      onCompiled: js.Function1[/* effect */ typings.babylonjs.effectMod.Effect, Unit],
      onError: Unit,
      particleSystem: IParticleSystem
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks,
      onCompiled: Unit,
      onError: js.Function2[/* effect */ typings.babylonjs.effectMod.Effect, /* errors */ String, Unit]
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks,
      onCompiled: Unit,
      onError: js.Function2[/* effect */ typings.babylonjs.effectMod.Effect, /* errors */ String, Unit],
      particleSystem: IParticleSystem
    ): typings.babylonjs.effectMod.Effect = js.native
    def createEffectForParticles(
      fragmentName: String,
      uniformsNames: js.Array[String],
      samplers: js.Array[String],
      defines: String,
      fallbacks: typings.babylonjs.effectFallbacksMod.EffectFallbacks,
      onCompiled: Unit,
      onError: Unit,
      particleSystem: IParticleSystem
    ): typings.babylonjs.effectMod.Effect = js.native
    
    /**
      * Creates a new multiview render target
      * @param width defines the width of the texture
      * @param height defines the height of the texture
      * @returns the created multiview render target wrapper
      */
    def createMultiviewRenderTargetTexture(width: Double, height: Double): typings.babylonjs.renderTargetWrapperMod.RenderTargetWrapper = js.native
    
    /**
      * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
      * @returns the new query
      */
    def createQuery(): OcclusionQuery = js.native
    
    /**
      * Creates a webGL transform feedback object
      * Please makes sure to check webGLVersion property to check if you are running webGL 2+
      * @returns the webGL transform feedback object
      */
    def createTransformFeedback(): WebGLTransformFeedback = js.native
    
    /**
      * Delete and release a webGL query
      * @param query defines the query to delete
      * @returns the current engine
      */
    def deleteQuery(query: OcclusionQuery): typings.babylonjs.engineQueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
    /**
      * Delete a webGL transform feedback object
      * @param value defines the webGL transform feedback object to delete
      */
    def deleteTransformFeedback(value: WebGLTransformFeedback): Unit = js.native
    
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
    def endOcclusionQuery(algorithmType: Double): typings.babylonjs.engineQueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
    /**
      * Ends a time query
      * @param token defines the token used to measure the time span
      * @returns the time spent (in ns)
      */
    def endTimeQuery(token: typings.babylonjs.timeTokenMod.TimeToken): int = js.native
    
    /**
      * Ends a transform feedback operation
      */
    def endTransformFeedback(): Unit = js.native
    
    /**
      * Get the performance counter associated with the frame time computation
      * @returns the perf counter
      */
    def getGPUFrameTimeCounter(): typings.babylonjs.perfCounterMod.PerfCounter = js.native
    
    /**
      * Gets the value of a given query
      * @param query defines the query to check
      * @returns the value of the query
      */
    def getQueryResult(query: OcclusionQuery): Double = js.native
    
    /**
      * Gets the current webVR device
      * @returns the current webVR device (or null)
      */
    def getVRDevice(): Any = js.native
    
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
      * Gets a boolean indicating that the engine is currently in VR exclusive mode for the pointers
      * @see https://docs.microsoft.com/en-us/microsoft-edge/webvr/essentials#mouse-input
      */
    var isInVRExclusivePointerMode: Boolean = js.native
    
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
      * Will be triggered after the view rendered
      */
    val onAfterViewRenderObservable: typings.babylonjs.observableMod.Observable[typings.babylonjs.engineViewsMod.EngineView] = js.native
    
    /**
      * Will be triggered before the view renders
      */
    val onBeforeViewRenderObservable: typings.babylonjs.observableMod.Observable[typings.babylonjs.engineViewsMod.EngineView] = js.native
    
    /**
      * Observable signaled when VR display mode changes
      */
    var onVRDisplayChangedObservable: typings.babylonjs.observableMod.Observable[IDisplayChangedEventArgs] = js.native
    
    /**
      * Observable signaled when VR request present is complete
      */
    var onVRRequestPresentComplete: typings.babylonjs.observableMod.Observable[Boolean] = js.native
    
    /**
      * Observable signaled when VR request present starts
      */
    var onVRRequestPresentStart: typings.babylonjs.observableMod.Observable[typings.babylonjs.engineWebVRMod.babylonjsEnginesEngineAugmentingMod.Engine] = js.native
    
    /**
      * Register a new child canvas
      * @param canvas defines the canvas to register
      * @param camera defines an optional camera to use with this canvas (it will overwrite the scene.camera for this view)
      * @param clearBeforeCopy Indicates if the destination view canvas should be cleared before copying the parent canvas. Can help if the scene clear color has alpha < 1
      * @returns the associated view
      */
    def registerView(canvas: HTMLCanvasElement): typings.babylonjs.engineViewsMod.EngineView = js.native
    def registerView(canvas: HTMLCanvasElement, camera: Unit, clearBeforeCopy: Boolean): typings.babylonjs.engineViewsMod.EngineView = js.native
    def registerView(canvas: HTMLCanvasElement, camera: typings.babylonjs.cameraMod.Camera): typings.babylonjs.engineViewsMod.EngineView = js.native
    def registerView(canvas: HTMLCanvasElement, camera: typings.babylonjs.cameraMod.Camera, clearBeforeCopy: Boolean): typings.babylonjs.engineViewsMod.EngineView = js.native
    
    /**
      * Set the compressed texture extensions or file names to skip.
      *
      * @param skippedFiles defines the list of those texture files you want to skip
      * Example: [".dds", ".env", "myfile.png"]
      */
    def setCompressedTextureExclusions(skippedFiles: js.Array[String]): Unit = js.native
    
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
    def startTimeQuery(): Nullable[typings.babylonjs.timeTokenMod.TimeToken] = js.native
    
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
    def unRegisterView(canvas: HTMLCanvasElement): typings.babylonjs.engineViewsMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
    
    /** Gets or sets the list of views */
    var views: js.Array[typings.babylonjs.engineViewsMod.EngineView] = js.native
    
    /**
      * Gets or sets the presentation attributes used to configure VR rendering
      */
    var vrPresentationAttributes: js.UndefOr[IVRPresentationAttributes] = js.native
  }
}
