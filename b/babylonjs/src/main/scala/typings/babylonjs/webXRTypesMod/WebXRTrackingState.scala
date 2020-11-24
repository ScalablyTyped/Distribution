package typings.babylonjs.webXRTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebXRTrackingState extends js.Object
@JSImport("babylonjs/XR/webXRTypes", "WebXRTrackingState")
@js.native
object WebXRTrackingState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebXRTrackingState with Double] = js.native
  
  /**
    * No transformation received, device is not being tracked
    */
  @js.native
  sealed trait NOT_TRACKING extends WebXRTrackingState
  /* 0 */ @js.native
  object NOT_TRACKING extends TopLevel[NOT_TRACKING with Double]
  
  /**
    * Transformation tracking works normally
    */
  @js.native
  sealed trait TRACKING extends WebXRTrackingState
  /* 2 */ @js.native
  object TRACKING extends TopLevel[TRACKING with Double]
  
  /**
    * Tracking lost - using emulated position
    */
  @js.native
  sealed trait TRACKING_LOST extends WebXRTrackingState
  /* 1 */ @js.native
  object TRACKING_LOST extends TopLevel[TRACKING_LOST with Double]
}
