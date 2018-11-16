package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This is a copy of VRPose. See https://developer.mozilla.org/en-US/docs/Web/API/VRPose
     * IMPORTANT!! The data is right-hand data.
     * @export
     * @interface DevicePose
     */

trait DevicePose extends js.Object {
  /**
           * The angularAcceleration of the device, values in array are [x,y,z].
           */
  val angularAcceleration: Nullable[stdLib.Float32Array]
  /**
           * The angularVelocity of the device, values in array are [x,y,z].
           */
  val angularVelocity: Nullable[stdLib.Float32Array]
  /**
           * The linearAcceleration of the device, values in array are [x,y,z].
           */
  val linearAcceleration: Nullable[stdLib.Float32Array]
  /**
           * The linearVelocity of the device, values in array are [x,y,z].
           */
  val linearVelocity: Nullable[stdLib.Float32Array]
  /**
           * The orientation of the device in a quaternion array, values in array are [x,y,z,w].
           */
  val orientation: Nullable[stdLib.Float32Array]
  /**
           * The position of the device, values in array are [x,y,z].
           */
  val position: Nullable[stdLib.Float32Array]
}

