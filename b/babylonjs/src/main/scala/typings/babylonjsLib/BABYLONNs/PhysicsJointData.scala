package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface for Physics-Joint data
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */

trait PhysicsJointData extends js.Object {
  /**
           * The collision of the joint
           */
  var collision: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The connected axis of the joint
           */
  var connectedAxis: js.UndefOr[Vector3] = js.undefined
  /**
           * The connected pivot of the joint
           */
  var connectedPivot: js.UndefOr[Vector3] = js.undefined
  /**
           * The main axis of the joint
           */
  var mainAxis: js.UndefOr[Vector3] = js.undefined
  /**
           * The main pivot of the joint
           */
  var mainPivot: js.UndefOr[Vector3] = js.undefined
  /**
           * Native Oimo/Cannon/Energy data
           */
  var nativeParams: js.UndefOr[js.Any] = js.undefined
}

