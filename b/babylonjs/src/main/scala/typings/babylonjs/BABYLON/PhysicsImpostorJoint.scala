package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsImpostorJoint extends js.Object {
  /** Defines the impostor that is connected to the main impostor using this joint */
  var connectedImpostor: PhysicsImpostor
  /** Defines the joint itself */
  var joint: PhysicsJoint
  /** Defines the main impostor to which the joint is linked */
  var mainImpostor: PhysicsImpostor
}

object PhysicsImpostorJoint {
  @scala.inline
  def apply(connectedImpostor: PhysicsImpostor, joint: PhysicsJoint, mainImpostor: PhysicsImpostor): PhysicsImpostorJoint = {
    val __obj = js.Dynamic.literal(connectedImpostor = connectedImpostor.asInstanceOf[js.Any], joint = joint.asInstanceOf[js.Any], mainImpostor = mainImpostor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhysicsImpostorJoint]
  }
}

