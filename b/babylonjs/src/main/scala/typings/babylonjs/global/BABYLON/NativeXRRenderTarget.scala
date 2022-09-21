package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayer
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NativeXRRenderTarget")
@js.native
open class NativeXRRenderTarget protected ()
  extends StObject
     with typings.babylonjs.BABYLON.NativeXRRenderTarget {
  def this(_xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager) = this()
  
  /* private */ /* CompleteClass */
  var _nativeRenderTarget: Any = js.native
  
  /**
    * xrpresent context of the canvas which can be used to display/mirror xr content
    */
  /* CompleteClass */
  var canvasContext: WebGLRenderingContext = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Initializes a XRWebGLLayer to be used as the session's baseLayer.
    * @param xrSession xr session
    * @returns a promise that will resolve once the XR Layer has been created
    */
  /* CompleteClass */
  override def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer] = js.native
  
  /**
    * xr layer for the canvas
    */
  /* CompleteClass */
  var xrLayer: Nullable[XRWebGLLayer] = js.native
}
