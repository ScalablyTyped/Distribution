package typings.babylonjs.BABYLON

import typings.babylonjs.AnonDiameterSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PhysicsRadialExplosionEventOptions")
@js.native
class PhysicsRadialExplosionEventOptions () extends js.Object {
  /**
    * The strenght of the force in correspondence to the distance of the affected object
    */
  var falloff: PhysicsRadialImpulseFalloff = js.native
  /**
    * The radius of the sphere for the radial explosion.
    */
  var radius: Double = js.native
  /**
    * Sphere options for the radial explosion.
    */
  var sphere: AnonDiameterSegments = js.native
  /**
    * The strenth of the explosion.
    */
  var strength: Double = js.native
  /**
    * Sphere options for the radial explosion.
    */
  def affectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
}

