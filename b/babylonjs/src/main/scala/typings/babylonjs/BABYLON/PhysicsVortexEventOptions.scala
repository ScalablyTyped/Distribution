package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsVortexEventOptions extends StObject {
  
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
  
  @scala.inline
  implicit class PhysicsVortexEventOptionsMutableBuilder[Self <: PhysicsVortexEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCentrifugalForceMultiplier(value: Double): Self = StObject.set(x, "centrifugalForceMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCentripetalForceMultiplier(value: Double): Self = StObject.set(x, "centripetalForceMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCentripetalForceThreshold(value: Double): Self = StObject.set(x, "centripetalForceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdraftForceMultiplier(value: Double): Self = StObject.set(x, "updraftForceMultiplier", value.asInstanceOf[js.Any])
  }
}
