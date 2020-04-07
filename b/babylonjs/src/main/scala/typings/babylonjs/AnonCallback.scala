package typings.babylonjs

import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var otherImpostors: js.Array[PhysicsImpostor]
  def callback(collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor): Unit
}

object AnonCallback {
  @scala.inline
  def apply(callback: (PhysicsImpostor, PhysicsImpostor) => Unit, otherImpostors: js.Array[PhysicsImpostor]): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), otherImpostors = otherImpostors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCallback]
  }
}

