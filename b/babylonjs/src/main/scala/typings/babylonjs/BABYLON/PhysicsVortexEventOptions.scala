package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsVortexEventOptions extends js.Object {
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when above the treshold.
    */
  var centrifugalForceMultiplier: Double
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when below the treshold.
    */
  var centripetalForceMultiplier: Double
  /**
    * At which distance, relative to the radius the centripetal forces should kick in? Range: 0-1
    */
  var centripetalForceThreshold: Double
  /**
    * The height of the cylinder for the vortex.
    */
  var height: Double
  /**
    * The radius of the cylinder for the vortex
    */
  var radius: Double
  /**
    * The strenth of the vortex.
    */
  var strength: Double
  /**
    * This multiplier determines with how much force the objects will be pushed upwards, when in the vortex.
    */
  var updraftForceMultiplier: Double
}

object PhysicsVortexEventOptions {
  @scala.inline
  def apply(
    centrifugalForceMultiplier: Double,
    centripetalForceMultiplier: Double,
    centripetalForceThreshold: Double,
    height: Double,
    radius: Double,
    strength: Double,
    updraftForceMultiplier: Double
  ): PhysicsVortexEventOptions = {
    val __obj = js.Dynamic.literal(centrifugalForceMultiplier = centrifugalForceMultiplier.asInstanceOf[js.Any], centripetalForceMultiplier = centripetalForceMultiplier.asInstanceOf[js.Any], centripetalForceThreshold = centripetalForceThreshold.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any], updraftForceMultiplier = updraftForceMultiplier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsVortexEventOptions]
  }
}

