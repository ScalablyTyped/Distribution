package typings.babylonjs.BABYLON

import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionInit
import typings.babylonjs.XRSessionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRExperienceHelper
  extends StObject
     with IDisposable {
  
  /* private */ var _attachedToElement: Any = js.native
  
  /* private */ var _lastTimestamp: Any = js.native
  
  /* private */ var _nonVRCamera: Any = js.native
  
  /* private */ var _nonXRToXRCamera: Any = js.native
  
  /* private */ var _originalSceneAutoClear: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _setState: Any = js.native
  
  /* private */ var _spectatorCamera: Any = js.native
  
  /* private */ var _spectatorMode: Any = js.native
  
  /* private */ var _supported: Any = js.native
  
  /* private */ var _switchSpectatorMode: Any = js.native
  
  /**
    * Camera used to render xr content
    */
  var camera: WebXRCamera = js.native
  
  /**
    * Disable spectator mode for desktop VR experiences.
    */
  def disableSpecatatorMode(): Unit = js.native
  
  /**
    * Enable spectator mode for desktop VR experiences.
    * When spectator mode is enabled a camera will be attached to the desktop canvas and will
    * display the first rig camera's view on the desktop canvas.
    * Please note that this will degrade performance, as it requires another camera render.
    * It is also not recommended to enable this in devices like the quest, as it brings no benefit there.
    * @param options giving WebXRSpectatorModeOption for specutator camera to setup when the spectator mode is enabled.
    */
  def enableSpectatorMode(): Unit = js.native
  def enableSpectatorMode(options: WebXRSpectatorModeOption): Unit = js.native
  
  /**
    * Enters XR mode (This must be done within a user interaction in most browsers eg. button click)
    * @param sessionMode options for the XR session
    * @param referenceSpaceType frame of reference of the XR session
    * @param renderTarget the output canvas that will be used to enter XR mode
    * @param sessionCreationOptions optional XRSessionInit object to init the session with
    * @returns promise that resolves after xr mode has entered
    */
  def enterXRAsync(sessionMode: XRSessionMode, referenceSpaceType: XRReferenceSpaceType): js.Promise[WebXRSessionManager] = js.native
  def enterXRAsync(
    sessionMode: XRSessionMode,
    referenceSpaceType: XRReferenceSpaceType,
    renderTarget: Unit,
    sessionCreationOptions: XRSessionInit
  ): js.Promise[WebXRSessionManager] = js.native
  def enterXRAsync(
    sessionMode: XRSessionMode,
    referenceSpaceType: XRReferenceSpaceType,
    renderTarget: WebXRRenderTarget
  ): js.Promise[WebXRSessionManager] = js.native
  def enterXRAsync(
    sessionMode: XRSessionMode,
    referenceSpaceType: XRReferenceSpaceType,
    renderTarget: WebXRRenderTarget,
    sessionCreationOptions: XRSessionInit
  ): js.Promise[WebXRSessionManager] = js.native
  
  /**
    * Exits XR mode and returns the scene to its original state
    * @returns promise that resolves after xr mode has exited
    */
  def exitXRAsync(): js.Promise[Unit] = js.native
  
  /** A features manager for this xr session */
  var featuresManager: WebXRFeaturesManager = js.native
  
  /**
    * Observers registered here will be triggered after the camera's initial transformation is set
    * This can be used to set a different ground level or an extra rotation.
    *
    * Note that ground level is considered to be at 0. The height defined by the XR camera will be added
    * to the position set after this observable is done executing.
    */
  var onInitialXRPoseSetObservable: Observable[WebXRCamera] = js.native
  
  /**
    * Fires when the state of the experience helper has changed
    */
  var onStateChangedObservable: Observable[WebXRState] = js.native
  
  /** Session manager used to keep track of xr session */
  var sessionManager: WebXRSessionManager = js.native
  
  /**
    * The current state of the XR experience (eg. transitioning, in XR or not in XR)
    */
  var state: WebXRState = js.native
}
