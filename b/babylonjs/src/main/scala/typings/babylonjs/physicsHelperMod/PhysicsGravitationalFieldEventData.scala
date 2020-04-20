package typings.babylonjs.physicsHelperMod

import typings.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsGravitationalFieldEventData extends js.Object {
  /**
    * A sphere mesh used for the gravitational field event
    */
  var sphere: Mesh
}

object PhysicsGravitationalFieldEventData {
  @scala.inline
  def apply(sphere: Mesh): PhysicsGravitationalFieldEventData = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsGravitationalFieldEventData]
  }
}

