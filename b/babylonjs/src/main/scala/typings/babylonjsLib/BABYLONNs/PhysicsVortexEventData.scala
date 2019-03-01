package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for vortex event data
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
trait PhysicsVortexEventData extends js.Object {
  /**
    * A cylinder used for the vortex event
    */
  var cylinder: Mesh
}

object PhysicsVortexEventData {
  @scala.inline
  def apply(cylinder: Mesh): PhysicsVortexEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cylinder")(cylinder)
    __obj.asInstanceOf[PhysicsVortexEventData]
  }
}

