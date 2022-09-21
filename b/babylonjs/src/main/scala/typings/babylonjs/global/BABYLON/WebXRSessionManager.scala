package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.XREye
import typings.babylonjs.XRSessionMode
import typings.babylonjs.XRView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRSessionManager")
@js.native
open class WebXRSessionManager protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRSessionManager {
  /**
    * Constructs a WebXRSessionManager, this must be initialized within a user action before usage
    * @param scene The scene which the session should be created for
    */
  def this(/** The scene which the session should be created for */
  scene: typings.babylonjs.BABYLON.Scene) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Gets the correct render target texture to be rendered this frame for this eye
    * @param eye the eye for which to get the render target
    * @returns the render target for the specified eye or null if not available
    */
  /* CompleteClass */
  override def getRenderTargetTextureForEye(eye: XREye): Nullable[typings.babylonjs.BABYLON.RenderTargetTexture] = js.native
  
  /**
    * Gets the correct render target texture to be rendered this frame for this view
    * @param view the view for which to get the render target
    * @returns the render target for the specified view or null if not available
    */
  /* CompleteClass */
  override def getRenderTargetTextureForView(view: XRView): Nullable[typings.babylonjs.BABYLON.RenderTargetTexture] = js.native
  
  /**
    * Attempts to set the framebuffer-size-normalized viewport to be rendered this frame for this view.
    * In the event of a failure, the supplied viewport is not updated.
    * @param viewport the viewport to which the view will be rendered
    * @param view the view for which to set the viewport
    * @returns whether the operation was successful
    */
  /* CompleteClass */
  override def trySetViewportForView(viewport: typings.babylonjs.BABYLON.Viewport, view: XRView): Boolean = js.native
}
/* static members */
object WebXRSessionManager {
  
  @JSGlobal("BABYLON.WebXRSessionManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a promise that resolves with a boolean indicating if the provided session mode is supported by this browser
    * @param sessionMode defines the session to test
    * @returns a promise with boolean as final value
    */
  inline def IsSessionSupportedAsync(sessionMode: XRSessionMode): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSessionSupportedAsync")(sessionMode.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
