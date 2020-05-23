package typings.babylonjs.anon

import typings.babylonjs.BABYLON.PhysicsImpostor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherImpostors extends js.Object {
  var otherImpostors: js.Array[PhysicsImpostor]
  def callback(collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor): Unit
}

object OtherImpostors {
  @scala.inline
  def apply(callback: (PhysicsImpostor, PhysicsImpostor) => Unit, otherImpostors: js.Array[PhysicsImpostor]): OtherImpostors = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), otherImpostors = otherImpostors.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherImpostors]
  }
}

