package typings.babylonjs.physicsHelperMod

import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsAffectedImpostorWithData extends js.Object {
  /**
    * The data about the hit/horce from the explosion
    */
  var hitData: PhysicsHitData
  /**
    * The impostor affected by the effect
    */
  var impostor: PhysicsImpostor
}

object PhysicsAffectedImpostorWithData {
  @scala.inline
  def apply(hitData: PhysicsHitData, impostor: PhysicsImpostor): PhysicsAffectedImpostorWithData = {
    val __obj = js.Dynamic.literal(hitData = hitData.asInstanceOf[js.Any], impostor = impostor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsAffectedImpostorWithData]
  }
}

