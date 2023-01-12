package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAgentParameters extends StObject {
  
  /**
    * Defines how close a collision element must be before it is considered for steering behaviors. [Limits: > 0]
    */
  var collisionQueryRange: Double
  
  /**
    * Agent height. [Limit: > 0]
    */
  var height: Double
  
  /**
    *  Maximum allowed acceleration. [Limit: >= 0]
    */
  var maxAcceleration: Double
  
  /**
    * Maximum allowed speed. [Limit: >= 0]
    */
  var maxSpeed: Double
  
  /**
    * The path visibility optimization range. [Limit: > 0]
    */
  var pathOptimizationRange: Double
  
  /**
    *  Agent radius. [Limit: >= 0]
    */
  var radius: Double
  
  /**
    * Observers will be notified when agent gets inside the virtual circle with this Radius around destination point.
    * Default is agent radius
    */
  var reachRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * How aggressive the agent manager should be at avoiding collisions with this agent. [Limit: >= 0]
    */
  var separationWeight: Double
}
object IAgentParameters {
  
  inline def apply(
    collisionQueryRange: Double,
    height: Double,
    maxAcceleration: Double,
    maxSpeed: Double,
    pathOptimizationRange: Double,
    radius: Double,
    separationWeight: Double
  ): IAgentParameters = {
    val __obj = js.Dynamic.literal(collisionQueryRange = collisionQueryRange.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxAcceleration = maxAcceleration.asInstanceOf[js.Any], maxSpeed = maxSpeed.asInstanceOf[js.Any], pathOptimizationRange = pathOptimizationRange.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], separationWeight = separationWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAgentParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAgentParameters] (val x: Self) extends AnyVal {
    
    inline def setCollisionQueryRange(value: Double): Self = StObject.set(x, "collisionQueryRange", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMaxAcceleration(value: Double): Self = StObject.set(x, "maxAcceleration", value.asInstanceOf[js.Any])
    
    inline def setMaxSpeed(value: Double): Self = StObject.set(x, "maxSpeed", value.asInstanceOf[js.Any])
    
    inline def setPathOptimizationRange(value: Double): Self = StObject.set(x, "pathOptimizationRange", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setReachRadius(value: Double): Self = StObject.set(x, "reachRadius", value.asInstanceOf[js.Any])
    
    inline def setReachRadiusUndefined: Self = StObject.set(x, "reachRadius", js.undefined)
    
    inline def setSeparationWeight(value: Double): Self = StObject.set(x, "separationWeight", value.asInstanceOf[js.Any])
  }
}
