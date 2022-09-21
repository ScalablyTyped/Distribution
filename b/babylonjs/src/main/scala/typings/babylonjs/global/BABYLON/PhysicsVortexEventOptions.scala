package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PhysicsVortexEventOptions")
@js.native
open class PhysicsVortexEventOptions ()
  extends StObject
     with typings.babylonjs.BABYLON.PhysicsVortexEventOptions {
  
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when above the threshold.
    */
  /* CompleteClass */
  var centrifugalForceMultiplier: Double = js.native
  
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when below the threshold.
    */
  /* CompleteClass */
  var centripetalForceMultiplier: Double = js.native
  
  /**
    * At which distance, relative to the radius the centripetal forces should kick in? Range: 0-1
    */
  /* CompleteClass */
  var centripetalForceThreshold: Double = js.native
  
  /**
    * The height of the cylinder for the vortex.
    */
  /* CompleteClass */
  var height: Double = js.native
  
  /**
    * The radius of the cylinder for the vortex
    */
  /* CompleteClass */
  var radius: Double = js.native
  
  /**
    * The strength of the vortex.
    */
  /* CompleteClass */
  var strength: Double = js.native
  
  /**
    * This multiplier determines with how much force the objects will be pushed upwards, when in the vortex.
    */
  /* CompleteClass */
  var updraftForceMultiplier: Double = js.native
}
