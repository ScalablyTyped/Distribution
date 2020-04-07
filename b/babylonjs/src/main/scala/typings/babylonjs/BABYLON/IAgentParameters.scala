package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAgentParameters extends js.Object {
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
    * How aggresive the agent manager should be at avoiding collisions with this agent. [Limit: >= 0]
    */
  var separationWeight: Double
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
}

