package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAgentParameters extends StObject {
  
  /**
    * Defines how close a collision element must be before it is considered for steering behaviors. [Limits: > 0]
    */
  var collisionQueryRange: Double = js.native
  
  /**
    * Agent height. [Limit: > 0]
    */
  var height: Double = js.native
  
  /**
    *  Maximum allowed acceleration. [Limit: >= 0]
    */
  var maxAcceleration: Double = js.native
  
  /**
    * Maximum allowed speed. [Limit: >= 0]
    */
  var maxSpeed: Double = js.native
  
  /**
    * The path visibility optimization range. [Limit: > 0]
    */
  var pathOptimizationRange: Double = js.native
  
  /**
    *  Agent radius. [Limit: >= 0]
    */
  var radius: Double = js.native
  
  /**
    * How aggresive the agent manager should be at avoiding collisions with this agent. [Limit: >= 0]
    */
  var separationWeight: Double = js.native
}
object IAgentParameters {
  
  @scala.inline
  def apply(
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
  implicit class IAgentParametersMutableBuilder[Self <: IAgentParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollisionQueryRange(value: Double): Self = StObject.set(x, "collisionQueryRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAcceleration(value: Double): Self = StObject.set(x, "maxAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSpeed(value: Double): Self = StObject.set(x, "maxSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathOptimizationRange(value: Double): Self = StObject.set(x, "pathOptimizationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparationWeight(value: Double): Self = StObject.set(x, "separationWeight", value.asInstanceOf[js.Any])
  }
}
