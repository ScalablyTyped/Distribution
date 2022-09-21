package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsVortexEventOptions extends StObject {
  
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when above the threshold.
    */
  var centrifugalForceMultiplier: Double
  
  /**
    * This multiplier determines with how much force the objects will be pushed sideways/around the vortex, when below the threshold.
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
    * The strength of the vortex.
    */
  var strength: Double
  
  /**
    * This multiplier determines with how much force the objects will be pushed upwards, when in the vortex.
    */
  var updraftForceMultiplier: Double
}
object PhysicsVortexEventOptions {
  
  inline def apply(
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
  
  extension [Self <: PhysicsVortexEventOptions](x: Self) {
    
    inline def setCentrifugalForceMultiplier(value: Double): Self = StObject.set(x, "centrifugalForceMultiplier", value.asInstanceOf[js.Any])
    
    inline def setCentripetalForceMultiplier(value: Double): Self = StObject.set(x, "centripetalForceMultiplier", value.asInstanceOf[js.Any])
    
    inline def setCentripetalForceThreshold(value: Double): Self = StObject.set(x, "centripetalForceThreshold", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setUpdraftForceMultiplier(value: Double): Self = StObject.set(x, "updraftForceMultiplier", value.asInstanceOf[js.Any])
  }
}
