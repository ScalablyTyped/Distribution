package typings.babylonjs

import typings.babylonjs.BABYLON.PhysicsImpostor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOtherImpostors extends js.Object {
  var otherImpostors: js.Array[PhysicsImpostor]
  def callback(collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor): Unit
}

object AnonOtherImpostors {
  @scala.inline
  def apply(callback: (PhysicsImpostor, PhysicsImpostor) => Unit, otherImpostors: js.Array[PhysicsImpostor]): AnonOtherImpostors = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), otherImpostors = otherImpostors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOtherImpostors]
  }
}

