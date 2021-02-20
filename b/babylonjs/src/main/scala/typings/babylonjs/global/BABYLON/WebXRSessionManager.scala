package typings.babylonjs.global.BABYLON

import typings.babylonjs.XRSessionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRSessionManager")
@js.native
class WebXRSessionManager protected ()
  extends typings.babylonjs.BABYLON.WebXRSessionManager {
  /**
    * Constructs a WebXRSessionManager, this must be initialized within a user action before usage
    * @param scene The scene which the session should be created for
    */
  def this(/** The scene which the session should be created for */
  scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object WebXRSessionManager {
  
  /**
    * Returns a promise that resolves with a boolean indicating if the provided session mode is supported by this browser
    * @param sessionMode defines the session to test
    * @returns a promise with boolean as final value
    */
  @JSGlobal("BABYLON.WebXRSessionManager.IsSessionSupportedAsync")
  @js.native
  def IsSessionSupportedAsync(sessionMode: XRSessionMode): js.Promise[Boolean] = js.native
}
