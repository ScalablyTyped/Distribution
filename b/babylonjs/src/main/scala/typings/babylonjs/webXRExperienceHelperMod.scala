package typings.babylonjs

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRCameraMod.WebXRCamera
import typings.babylonjs.webXRFeaturesManagerMod.WebXRFeaturesManager
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import typings.babylonjs.webXRTypesMod.WebXRRenderTarget
import typings.babylonjs.webXRTypesMod.WebXRState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRExperienceHelperMod {
  
  @JSImport("babylonjs/XR/webXRExperienceHelper", "WebXRExperienceHelper")
  @js.native
  /**
    * Creates a WebXRExperienceHelper
    * @param scene The scene the helper should be created in
    */
  class WebXRExperienceHelper protected () extends IDisposable {
    
    var _nonVRCamera: js.Any = js.native
    
    var _nonXRToXRCamera: js.Any = js.native
    
    var _originalSceneAutoClear: js.Any = js.native
    
    var _setState: js.Any = js.native
    
    var _supported: js.Any = js.native
    
    /**
      * Camera used to render xr content
      */
    var camera: WebXRCamera = js.native
    
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
      renderTarget: js.UndefOr[scala.Nothing],
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
    
    var scene: js.Any = js.native
    
    /** Session manager used to keep track of xr session */
    var sessionManager: WebXRSessionManager = js.native
    
    /**
      * The current state of the XR experience (eg. transitioning, in XR or not in XR)
      */
    var state: WebXRState = js.native
  }
  /* static members */
  object WebXRExperienceHelper {
    
    /**
      * Creates the experience helper
      * @param scene the scene to attach the experience helper to
      * @returns a promise for the experience helper
      */
    @JSImport("babylonjs/XR/webXRExperienceHelper", "WebXRExperienceHelper.CreateAsync")
    @js.native
    def CreateAsync(scene: Scene): js.Promise[WebXRExperienceHelper] = js.native
  }
}
