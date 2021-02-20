package typings.babylonjs.BABYLON

import typings.babylonjs.XREye
import typings.babylonjs.XRFrame
import typings.babylonjs.XRReferenceSpace
import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRRenderState
import typings.babylonjs.XRSession
import typings.babylonjs.XRSessionInit
import typings.babylonjs.XRSessionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRSessionManager extends IDisposable {
  
  var _createRenderTargetTexture: js.Any = js.native
  
  var _referenceSpace: js.Any = js.native
  
  var _rttProvider: js.Any = js.native
  
  var _sessionEnded: js.Any = js.native
  
  var _xrNavigator: js.Any = js.native
  
  var baseLayer: js.Any = js.native
  
  /**
    * The base reference space from which the session started. good if you want to reset your
    * reference space
    */
  var baseReferenceSpace: XRReferenceSpace = js.native
  
  /**
    * Current XR frame
    */
  var currentFrame: Nullable[XRFrame] = js.native
  
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
    * Gets the correct render target texture to be rendered this frame for this eye
    * @param eye the eye for which to get the render target
    * @returns the render target for the specified eye
    */
  def getRenderTargetTextureForEye(eye: XREye): RenderTargetTexture = js.native
  
  /**
    * Creates a WebXRRenderTarget object for the XR session
    * @param onStateChangedObservable optional, mechanism for enabling/disabling XR rendering canvas, used only on Web
    * @param options optional options to provide when creating a new render target
    * @returns a WebXR render target to which the session can render
    */
  def getWebXRRenderTarget(): WebXRRenderTarget = js.native
  def getWebXRRenderTarget(options: WebXRManagedOutputCanvasOptions): WebXRRenderTarget = js.native
  
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
  def initializeSessionAsync(xrSessionMode: js.UndefOr[scala.Nothing], xrSessionInit: XRSessionInit): js.Promise[XRSession] = js.native
  def initializeSessionAsync(xrSessionMode: XRSessionMode): js.Promise[XRSession] = js.native
  def initializeSessionAsync(xrSessionMode: XRSessionMode, xrSessionInit: XRSessionInit): js.Promise[XRSession] = js.native
  
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
  var onXRSessionEnded: Observable[_] = js.native
  
  /**
    * Fires when the xr session is ended either by the device or manually done
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
    * Sets the reference space on the xr session
    * @param referenceSpaceType space to set
    * @returns a promise that will resolve once the reference space has been set
    */
  def setReferenceSpaceTypeAsync(): js.Promise[XRReferenceSpace] = js.native
  def setReferenceSpaceTypeAsync(referenceSpaceType: XRReferenceSpaceType): js.Promise[XRReferenceSpace] = js.native
  
  /**
    * Updates the render state of the session
    * @param state state to set
    * @returns a promise that resolves once the render state has been updated
    */
  def updateRenderStateAsync(state: XRRenderState): js.Promise[Unit] = js.native
  
  /**
    * The viewer (head position) reference space. This can be used to get the XR world coordinates
    * or get the offset the player is currently at.
    */
  var viewerReferenceSpace: XRReferenceSpace = js.native
}
