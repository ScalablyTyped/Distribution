package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsUpdraftEventOptions extends js.Object {
  /**
    * The height of the cylinder for the updraft.
    */
  var height: Double
  /**
    * The radius of the cylinder for the vortex
    */
  var radius: Double
  /**
    * The strenth of the updraft.
    */
  var strength: Double
  /**
    * The mode for the the updraft.
    */
  var updraftMode: PhysicsUpdraftMode
}

object PhysicsUpdraftEventOptions {
  @scala.inline
  def apply(height: Double, radius: Double, strength: Double, updraftMode: PhysicsUpdraftMode): PhysicsUpdraftEventOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any], updraftMode = updraftMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsUpdraftEventOptions]
  }
}

