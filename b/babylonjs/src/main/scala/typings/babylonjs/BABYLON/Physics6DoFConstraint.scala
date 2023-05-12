package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Physics6DoFConstraint
  extends StObject
     with PhysicsConstraint {
  
  /**
    * Gets the friction of the given axis of the physics engine.
    * @param axis - The axis of the physics engine.
    * @returns The friction of the given axis.
    *
    */
  def getAxisFriction(axis: PhysicsConstraintAxis): Double = js.native
  
  /**
    * Gets the maximum limit of the given axis of the physics engine.
    * @param axis - The axis of the physics engine.
    * @returns The maximum limit of the given axis.
    *
    */
  def getAxisMaxLimit(axis: PhysicsConstraintAxis): Double = js.native
  
  /**
    * Gets the minimum limit of the given axis of the physics engine.
    * @param axis - The axis of the physics engine.
    * @returns The minimum limit of the given axis.
    *
    */
  def getAxisMinLimit(axis: PhysicsConstraintAxis): Double = js.native
  
  /**
    * Gets the limit mode of the given axis of the constraint.
    *
    * @param axis - The axis of the constraint.
    * @returns The limit mode of the given axis.
    *
    */
  def getAxisMode(axis: PhysicsConstraintAxis): PhysicsConstraintAxisLimitMode = js.native
  
  /**
    * Gets the maximum force of the motor of the given axis of the constraint.
    * @param axis - The axis of the constraint.
    * @returns The maximum force of the motor.
    *
    */
  def getAxisMotorMaxForce(axis: PhysicsConstraintAxis): Double = js.native
  
  /**
    * Gets the target velocity of the motor associated to the given constraint axis.
    * @param axis - The constraint axis associated to the motor.
    * @returns The target velocity of the motor.
    *
    */
  def getAxisMotorTarget(axis: PhysicsConstraintAxis): Double = js.native
  
  /**
    * Gets the motor type of the specified axis of the constraint.
    *
    * @param axis - The axis of the constraint.
    * @returns The motor type of the specified axis.
    *
    */
  def getAxisMotorType(axis: PhysicsConstraintAxis): PhysicsConstraintMotorType = js.native
  
  /**
    * The collection of limits which this constraint will apply
    */
  var limits: js.Array[Physics6DoFLimit] = js.native
  
  /**
    * Sets the friction of the given axis of the physics engine.
    * @param axis - The axis of the physics engine to set the friction for.
    * @param friction - The friction to set for the given axis.
    *
    */
  def setAxisFriction(axis: PhysicsConstraintAxis, friction: Double): Unit = js.native
  
  /**
    * Sets the maximum limit of the given axis for the physics engine.
    * @param axis - The axis to set the limit for.
    * @param limit - The maximum limit of the axis.
    *
    * This method is useful for setting the maximum limit of the given axis for the physics engine,
    * which can be used to control the movement of the physics object. This helps to ensure that the
    * physics object does not move beyond the given limit.
    */
  def setAxisMaxLimit(axis: PhysicsConstraintAxis, limit: Double): Unit = js.native
  
  /**
    * Sets the minimum limit of a given axis of a constraint.
    * @param axis - The axis of the constraint.
    * @param minLimit - The minimum limit of the axis.
    *
    */
  def setAxisMinLimit(axis: PhysicsConstraintAxis, minLimit: Double): Unit = js.native
  
  /**
    * Sets the limit mode for the given axis of the constraint.
    * @param axis The axis to set the limit mode for.
    * @param limitMode The limit mode to set.
    *
    * This method is useful for setting the limit mode for a given axis of the constraint. This is important for
    * controlling the behavior of the physics engine when the constraint is reached. By setting the limit mode,
    * the engine can be configured to either stop the motion of the objects, or to allow them to continue
    * moving beyond the constraint.
    */
  def setAxisMode(axis: PhysicsConstraintAxis, limitMode: PhysicsConstraintAxisLimitMode): Unit = js.native
  
  /**
    * Sets the maximum force of the motor of the given axis of the constraint.
    * @param axis - The axis of the constraint.
    * @param maxForce - The maximum force of the motor.
    *
    */
  def setAxisMotorMaxForce(axis: PhysicsConstraintAxis, maxForce: Double): Unit = js.native
  
  /**
    * Sets the target velocity of the motor associated with the given axis of the constraint.
    * @param axis - The axis of the constraint.
    * @param target - The target velocity of the motor.
    *
    * This method is useful for setting the target velocity of the motor associated with the given axis of the constraint.
    */
  def setAxisMotorTarget(axis: PhysicsConstraintAxis, target: Double): Unit = js.native
  
  /**
    * Sets the motor type of the given axis of the constraint.
    * @param axis - The axis of the constraint.
    * @param motorType - The type of motor to use.
    * @returns void
    *
    */
  def setAxisMotorType(axis: PhysicsConstraintAxis, motorType: PhysicsConstraintMotorType): Unit = js.native
}
