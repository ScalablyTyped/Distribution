package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebXRTrackingState extends js.Object
@JSGlobal("BABYLON.WebXRTrackingState")
@js.native
object WebXRTrackingState extends js.Object {
  
  /**
    * No transformation received, device is not being tracked
    */
  @js.native
  sealed trait NOT_TRACKING extends WebXRTrackingState
  
  /**
    * Transformation tracking works normally
    */
  @js.native
  sealed trait TRACKING extends WebXRTrackingState
  
  /**
    * Tracking lost - using emulated position
    */
  @js.native
  sealed trait TRACKING_LOST extends WebXRTrackingState
}
