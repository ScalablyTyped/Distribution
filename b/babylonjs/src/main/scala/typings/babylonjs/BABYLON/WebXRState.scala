package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebXRState extends StObject
@JSGlobal("BABYLON.WebXRState")
@js.native
object WebXRState extends StObject {
  
  /**
    * Transitioning to being in XR mode
    */
  @js.native
  sealed trait ENTERING_XR extends WebXRState
  
  /**
    * Transitioning to non XR mode
    */
  @js.native
  sealed trait EXITING_XR extends WebXRState
  
  /**
    * In XR mode and presenting
    */
  @js.native
  sealed trait IN_XR extends WebXRState
  
  /**
    * Not entered XR mode
    */
  @js.native
  sealed trait NOT_IN_XR extends WebXRState
}
