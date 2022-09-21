package typings.babylonjs.BABYLON

import typings.babylonjs.XRFrame
import typings.babylonjs.XRReferenceSpace
import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRRenderState
import typings.babylonjs.XRRenderStateInit
import typings.babylonjs.XRSession
import typings.babylonjs.XRSessionInit
import typings.babylonjs.XRSessionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRSessionManager
  extends StObject
     with IWebXRRenderTargetTextureProvider {
  
  /* private */ var _baseLayerRTTProvider: Any = js.native
  
  /* private */ var _baseLayerWrapper: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _onEngineDisposedObserver: Any = js.native
  
  /* private */ var _referenceSpace: Any = js.native
  
  /* private */ var _sessionMode: Any = js.native
  
  /**
    * @param baseLayerWrapper
    * @hidden
    */
  def _setBaseLayerWrapper(baseLayerWrapper: Nullable[WebXRLayerWrapper]): Unit = js.native
  
  /* private */ var _xrNavigator: Any = js.native
  
  /**
    * The base reference space from which the session started. good if you want to reset your
    * reference space
    */
  var baseReferenceSpace: XRReferenceSpace = js.native
  
  /**
    * Current XR frame
    */
  var currentFrame: Nullable[XRFrame] = js.native
  
  /**
    * The current frame rate as reported by the device
    */
  def currentFrameRate: js.UndefOr[Double] = js.native
  
  /** WebXR timestamp updated every frame */
  var currentTimestamp: Double = js.native
  
  /**
    * Used just in case of a failure to initialize an immersive session.
    * The viewer reference space is compensated using this height, creating a kind of "viewer-floor" reference space
    */
  var defaultHeightCompensation: Double = js.native
  
  /**
    * Stops the xrSession and restores the render loop
    * @returns Promise which resolves after it exits XR
    */
  def exitXRAsync(): js.Promise[Unit] = js.native
  
  /**
    * Get the fixed foveation currently set, as specified by the webxr specs
    * If this returns null, then fixed foveation is not supported
    */
  def fixedFoveation: Nullable[Double] = js.native
  /**
    * Set the fixed foveation to the specified value, as specified by the webxr specs
    * This value will be normalized to be between 0 and 1, 1 being max foveation, 0 being no foveation
    */
  def fixedFoveation_=(value: Nullable[Double]): Unit = js.native
  
  /**
    * Creates a WebXRRenderTarget object for the XR session
    * @param options optional options to provide when creating a new render target
    * @returns a WebXR render target to which the session can render
    */
  def getWebXRRenderTarget(): WebXRRenderTarget = js.native
  def getWebXRRenderTarget(options: WebXRManagedOutputCanvasOptions): WebXRRenderTarget = js.native
  
  /**
    * Are we currently in the XR loop?
    */
  var inXRFrameLoop: Boolean = js.native
  
  /**
    * Are we in an XR session?
    */
  var inXRSession: Boolean = js.native
  
  /**
    * Initializes the manager
    * After initialization enterXR can be called to start an XR session
    * @returns Promise which resolves after it is initialized
    */
  def initializeAsync(): js.Promise[Unit] = js.native
  
  /**
    * Initializes an xr session
    * @param xrSessionMode mode to initialize
    * @param xrSessionInit defines optional and required values to pass to the session builder
    * @returns a promise which will resolve once the session has been initialized
    */
  def initializeSessionAsync(): js.Promise[XRSession] = js.native
  def initializeSessionAsync(xrSessionMode: Unit, xrSessionInit: XRSessionInit): js.Promise[XRSession] = js.native
  def initializeSessionAsync(xrSessionMode: XRSessionMode): js.Promise[XRSession] = js.native
  def initializeSessionAsync(xrSessionMode: XRSessionMode, xrSessionInit: XRSessionInit): js.Promise[XRSession] = js.native
  
  /**
    * Check if fixed foveation is supported on this device
    */
  def isFixedFoveationSupported: Boolean = js.native
  
  /**
    * Returns true if Babylon.js is using the BabylonNative backend, otherwise false
    */
  def isNative: Boolean = js.native
  
  /**
    * Checks if a session would be supported for the creation options specified
    * @param sessionMode session mode to check if supported eg. immersive-vr
    * @returns A Promise that resolves to true if supported and false if not
    */
  def isSessionSupportedAsync(sessionMode: XRSessionMode): js.Promise[Boolean] = js.native
  
  /**
    * Fires every time a new xrFrame arrives which can be used to update the camera
    */
  var onXRFrameObservable: Observable[XRFrame] = js.native
  
  /**
    * Fires when the reference space changed
    */
  var onXRReferenceSpaceChanged: Observable[XRReferenceSpace] = js.native
  
  /**
    * Fires when the xr session is ended either by the device or manually done
    */
  var onXRSessionEnded: Observable[Any] = js.native
  
  /**
    * Fires when the xr session is initialized: right after requestSession was called and returned with a successful result
    */
  var onXRSessionInit: Observable[XRSession] = js.native
  
  /**
    * The current reference space used in this session. This reference space can constantly change!
    * It is mainly used to offset the camera's position.
    */
  def referenceSpace: XRReferenceSpace = js.native
  /**
    * Set a new reference space and triggers the observable
    */
  def referenceSpace_=(newReferenceSpace: XRReferenceSpace): Unit = js.native
  
  /**
    * Resets the reference space to the one started the session
    */
  def resetReferenceSpace(): Unit = js.native
  
  /**
    * Run a callback in the xr render loop
    * @param callback the callback to call when in XR Frame
    * @param ignoreIfNotInSession if no session is currently running, run it first thing on the next session
    */
  def runInXRFrame(callback: js.Function0[Unit]): Unit = js.native
  def runInXRFrame(callback: js.Function0[Unit], ignoreIfNotInSession: Boolean): Unit = js.native
  
  /**
    * Starts rendering to the xr layer
    */
  def runXRRenderLoop(): Unit = js.native
  
  /** The scene which the session should be created for */
  var scene: Scene = js.native
  
  /**
    * Underlying xr session
    */
  var session: XRSession = js.native
  
  /**
    * The mode for the managed XR session
    */
  def sessionMode: XRSessionMode = js.native
  
  /**
    * Sets the reference space on the xr session
    * @param referenceSpaceType space to set
    * @returns a promise that will resolve once the reference space has been set
    */
  def setReferenceSpaceTypeAsync(): js.Promise[XRReferenceSpace] = js.native
  def setReferenceSpaceTypeAsync(referenceSpaceType: XRReferenceSpaceType): js.Promise[XRReferenceSpace] = js.native
  
  /**
    * A list of supported frame rates (only available in-session!
    */
  def supportedFrameRates: js.UndefOr[js.typedarray.Float32Array] = js.native
  
  /**
    * Updates the render state of the session
    * @param state state to set
    */
  def updateRenderState(state: XRRenderStateInit): Unit = js.native
  
  /**
    * Updates the render state of the session.
    * Note that this is deprecated in favor of WebXRSessionManager.updateRenderState().
    * @param state state to set
    * @returns a promise that resolves once the render state has been updated
    * @deprecated
    */
  def updateRenderStateAsync(state: XRRenderState): js.Promise[Unit] = js.native
  
  /**
    * Set the framerate of the session.
    * @param rate the new framerate. This value needs to be in the supportedFrameRates array
    * @returns a promise that resolves once the framerate has been set
    */
  def updateTargetFrameRate(rate: Double): js.Promise[Unit] = js.native
  
  /**
    * The viewer (head position) reference space. This can be used to get the XR world coordinates
    * or get the offset the player is currently at.
    */
  var viewerReferenceSpace: XRReferenceSpace = js.native
}
