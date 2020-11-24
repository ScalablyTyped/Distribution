package typings.babylonjs.webXRTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebXRState extends js.Object
@JSImport("babylonjs/XR/webXRTypes", "WebXRState")
@js.native
object WebXRState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebXRState with Double] = js.native
  
  /**
    * Transitioning to being in XR mode
    */
  @js.native
  sealed trait ENTERING_XR extends WebXRState
  /* 0 */ @js.native
  object ENTERING_XR extends TopLevel[ENTERING_XR with Double]
  
  /**
    * Transitioning to non XR mode
    */
  @js.native
  sealed trait EXITING_XR extends WebXRState
  /* 1 */ @js.native
  object EXITING_XR extends TopLevel[EXITING_XR with Double]
  
  /**
    * In XR mode and presenting
    */
  @js.native
  sealed trait IN_XR extends WebXRState
  /* 2 */ @js.native
  object IN_XR extends TopLevel[IN_XR with Double]
  
  /**
    * Not entered XR mode
    */
  @js.native
  sealed trait NOT_IN_XR extends WebXRState
  /* 3 */ @js.native
  object NOT_IN_XR extends TopLevel[NOT_IN_XR with Double]
}
