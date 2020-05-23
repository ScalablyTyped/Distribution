package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PhysicsVortexEventOptions")
@js.native
class PhysicsVortexEventOptions ()
  extends typings.babylonjs.BABYLON.PhysicsVortexEventOptions {
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when above the treshold.
    */
  /* CompleteClass */
  override var centrifugalForceMultiplier: Double = js.native
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when below the treshold.
    */
  /* CompleteClass */
  override var centripetalForceMultiplier: Double = js.native
  /**
    * At which distance, relative to the radius the centripetal forces should kick in? Range: 0-1
    */
  /* CompleteClass */
  override var centripetalForceThreshold: Double = js.native
  /**
    * The height of the cylinder for the vortex.
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * The radius of the cylinder for the vortex
    */
  /* CompleteClass */
  override var radius: Double = js.native
  /**
    * The strenth of the vortex.
    */
  /* CompleteClass */
  override var strength: Double = js.native
  /**
    * This multiplier determines with how much force the objects will be pushed upwards, when in the vortex.
    */
  /* CompleteClass */
  override var updraftForceMultiplier: Double = js.native
}

