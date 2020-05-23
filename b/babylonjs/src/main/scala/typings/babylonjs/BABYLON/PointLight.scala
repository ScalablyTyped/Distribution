package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointLight extends ShadowLight {
  var _shadowAngle: js.Any = js.native
  /**
    * Gets the direction if it has been set.
    * In case of direction provided, the shadow will not use a cube texture but simulate a spot shadow as a fallback
    */
  @JSName("direction")
  def direction_MPointLight: Vector3 = js.native
  /**
    * In case of direction provided, the shadow will not use a cube texture but simulate a spot shadow as a fallback
    */
  @JSName("direction")
  def direction_MPointLight(value: Vector3): js.Any = js.native
  /**
    * Getter: In case of direction provided, the shadow will not use a cube texture but simulate a spot shadow as a fallback
    * This specifies what angle the shadow will use to be created.
    *
    * It default to 90 degrees to work nicely with the cube texture generation for point lights shadow maps.
    */
  def shadowAngle: Double = js.native
  /**
    * Setter: In case of direction provided, the shadow will not use a cube texture but simulate a spot shadow as a fallback
    * This specifies what angle the shadow will use to be created.
    *
    * It default to 90 degrees to work nicely with the cube texture generation for point lights shadow maps.
    */
  def shadowAngle(value: Double): js.Any = js.native
}

