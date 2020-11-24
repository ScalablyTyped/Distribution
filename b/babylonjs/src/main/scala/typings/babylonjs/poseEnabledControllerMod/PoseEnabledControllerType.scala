package typings.babylonjs.poseEnabledControllerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PoseEnabledControllerType extends js.Object
@JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledControllerType")
@js.native
object PoseEnabledControllerType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PoseEnabledControllerType with Double] = js.native
  
  /**
    * Google Daydream
    */
  @js.native
  sealed trait DAYDREAM extends PoseEnabledControllerType
  /* 4 */ @js.native
  object DAYDREAM extends TopLevel[DAYDREAM with Double]
  
  /**
    * Samsung gear VR
    */
  @js.native
  sealed trait GEAR_VR extends PoseEnabledControllerType
  /* 3 */ @js.native
  object GEAR_VR extends TopLevel[GEAR_VR with Double]
  
  /**
    * Generic
    */
  @js.native
  sealed trait GENERIC extends PoseEnabledControllerType
  /* 5 */ @js.native
  object GENERIC extends TopLevel[GENERIC with Double]
  
  /**
    * Oculus Rift
    */
  @js.native
  sealed trait OCULUS extends PoseEnabledControllerType
  /* 1 */ @js.native
  object OCULUS extends TopLevel[OCULUS with Double]
  
  /**
    * HTC Vive
    */
  @js.native
  sealed trait VIVE extends PoseEnabledControllerType
  /* 0 */ @js.native
  object VIVE extends TopLevel[VIVE with Double]
  
  /**
    * Windows mixed reality
    */
  @js.native
  sealed trait WINDOWS extends PoseEnabledControllerType
  /* 2 */ @js.native
  object WINDOWS extends TopLevel[WINDOWS with Double]
}
