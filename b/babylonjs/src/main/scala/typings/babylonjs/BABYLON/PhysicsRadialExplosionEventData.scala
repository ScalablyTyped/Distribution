package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsRadialExplosionEventData extends js.Object {
  /**
    * A sphere used for the radial explosion event
    */
  var sphere: Mesh
}

object PhysicsRadialExplosionEventData {
  @scala.inline
  def apply(sphere: Mesh): PhysicsRadialExplosionEventData = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhysicsRadialExplosionEventData]
  }
}

