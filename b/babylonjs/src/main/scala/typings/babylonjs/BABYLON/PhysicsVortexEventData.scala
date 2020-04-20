package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsVortexEventData extends js.Object {
  /**
    * A cylinder used for the vortex event
    */
  var cylinder: Mesh
}

object PhysicsVortexEventData {
  @scala.inline
  def apply(cylinder: Mesh): PhysicsVortexEventData = {
    val __obj = js.Dynamic.literal(cylinder = cylinder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsVortexEventData]
  }
}

