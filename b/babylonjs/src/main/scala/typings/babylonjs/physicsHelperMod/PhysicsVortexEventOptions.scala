package typings.babylonjs.physicsHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Physics/physicsHelper", "PhysicsVortexEventOptions")
@js.native
class PhysicsVortexEventOptions () extends js.Object {
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when above the treshold.
    */
  var centrifugalForceMultiplier: Double = js.native
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when below the treshold.
    */
  var centripetalForceMultiplier: Double = js.native
  /**
    * At which distance, relative to the radius the centripetal forces should kick in? Range: 0-1
    */
  var centripetalForceThreshold: Double = js.native
  /**
    * The height of the cylinder for the vortex.
    */
  var height: Double = js.native
  /**
    * The radius of the cylinder for the vortex
    */
  var radius: Double = js.native
  /**
    * The strenth of the vortex.
    */
  var strength: Double = js.native
  /**
    * This multiplier determines with how much force the objects will be pushed upwards, when in the vortex.
    */
  var updraftForceMultiplier: Double = js.native
}

