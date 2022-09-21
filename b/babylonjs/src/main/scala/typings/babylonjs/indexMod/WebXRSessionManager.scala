package typings.babylonjs.indexMod

import typings.babylonjs.XRSessionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRSessionManager")
@js.native
open class WebXRSessionManager protected ()
  extends typings.babylonjs.xRIndexMod.WebXRSessionManager {
  /**
    * Constructs a WebXRSessionManager, this must be initialized within a user action before usage
    * @param scene The scene which the session should be created for
    */
  def this(/** The scene which the session should be created for */
  scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object WebXRSessionManager {
  
  @JSImport("babylonjs/index", "WebXRSessionManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a promise that resolves with a boolean indicating if the provided session mode is supported by this browser
    * @param sessionMode defines the session to test
    * @returns a promise with boolean as final value
    */
  inline def IsSessionSupportedAsync(sessionMode: XRSessionMode): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSessionSupportedAsync")(sessionMode.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
