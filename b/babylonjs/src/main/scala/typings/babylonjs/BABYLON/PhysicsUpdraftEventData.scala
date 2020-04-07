package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsUpdraftEventData extends js.Object {
  /**
    * A cylinder used for the updraft event
    */
  var cylinder: Mesh
}

object PhysicsUpdraftEventData {
  @scala.inline
  def apply(cylinder: Mesh): PhysicsUpdraftEventData = {
    val __obj = js.Dynamic.literal(cylinder = cylinder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhysicsUpdraftEventData]
  }
}

