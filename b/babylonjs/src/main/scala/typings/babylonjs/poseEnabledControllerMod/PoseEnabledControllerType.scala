package typings.babylonjs.poseEnabledControllerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PoseEnabledControllerType extends js.Object

@JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledControllerType")
@js.native
object PoseEnabledControllerType extends js.Object {
  /**
    * Google Daydream
    */
  @js.native
  sealed trait DAYDREAM extends PoseEnabledControllerType
  
  /**
    * Samsung gear VR
    */
  @js.native
  sealed trait GEAR_VR extends PoseEnabledControllerType
  
  /**
    * Generic
    */
  @js.native
  sealed trait GENERIC extends PoseEnabledControllerType
  
  /**
    * Oculus Rift
    */
  @js.native
  sealed trait OCULUS extends PoseEnabledControllerType
  
  /**
    * HTC Vive
    */
  @js.native
  sealed trait VIVE extends PoseEnabledControllerType
  
  /**
    * Windows mixed reality
    */
  @js.native
  sealed trait WINDOWS extends PoseEnabledControllerType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PoseEnabledControllerType with Double] = js.native
  /* 4 */ @js.native
  object DAYDREAM extends TopLevel[DAYDREAM with Double]
  
  /* 3 */ @js.native
  object GEAR_VR extends TopLevel[GEAR_VR with Double]
  
  /* 5 */ @js.native
  object GENERIC extends TopLevel[GENERIC with Double]
  
  /* 1 */ @js.native
  object OCULUS extends TopLevel[OCULUS with Double]
  
  /* 0 */ @js.native
  object VIVE extends TopLevel[VIVE with Double]
  
  /* 2 */ @js.native
  object WINDOWS extends TopLevel[WINDOWS with Double]
  
}

