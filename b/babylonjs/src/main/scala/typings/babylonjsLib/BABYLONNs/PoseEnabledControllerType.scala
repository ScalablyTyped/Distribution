package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PoseEnabledControllerType extends js.Object

/**
    * Defines the types of pose enabled controllers that are supported
    */
@JSGlobal("BABYLON.PoseEnabledControllerType")
@js.native
object PoseEnabledControllerType extends js.Object {
  /**
           * Google Daydream
           */
  @js.native
  sealed trait DAYDREAM
    extends babylonjsLib.BABYLONNs.PoseEnabledControllerType
  
  /**
           * Samsung gear VR
           */
  @js.native
  sealed trait GEAR_VR
    extends babylonjsLib.BABYLONNs.PoseEnabledControllerType
  
  /**
           * Generic
           */
  @js.native
  sealed trait GENERIC
    extends babylonjsLib.BABYLONNs.PoseEnabledControllerType
  
  /**
           * Oculus Rift
           */
  @js.native
  sealed trait OCULUS
    extends babylonjsLib.BABYLONNs.PoseEnabledControllerType
  
  /**
           * HTC Vive
           */
  @js.native
  sealed trait VIVE
    extends babylonjsLib.BABYLONNs.PoseEnabledControllerType
  
  /**
           * Windows mixed reality
           */
  @js.native
  sealed trait WINDOWS
    extends babylonjsLib.BABYLONNs.PoseEnabledControllerType
  
  /* 4 */ val DAYDREAM: DAYDREAM with scala.Double = js.native
  /* 3 */ val GEAR_VR: GEAR_VR with scala.Double = js.native
  /* 5 */ val GENERIC: GENERIC with scala.Double = js.native
  /* 1 */ val OCULUS: OCULUS with scala.Double = js.native
  /* 0 */ val VIVE: VIVE with scala.Double = js.native
  /* 2 */ val WINDOWS: WINDOWS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.PoseEnabledControllerType with scala.Double] = js.native
}

