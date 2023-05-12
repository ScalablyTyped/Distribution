package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.physicsV2IphysicsenginepluginMod.IPhysicsEnginePluginV2
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxis
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintAxisLimitMode
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintMotorType
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintParameters
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsV2PhysicsConstraintMod {
  
  @JSImport("babylonjs/Physics/v2/physicsConstraint", "BallAndSocketConstraint")
  @js.native
  open class BallAndSocketConstraint protected () extends PhysicsConstraint {
    def this(pivotA: Vector3, pivotB: Vector3, axisA: Vector3, axisB: Vector3, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/physicsConstraint", "DistanceConstraint")
  @js.native
  open class DistanceConstraint protected () extends PhysicsConstraint {
    def this(maxDistance: Double, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/physicsConstraint", "HingeConstraint")
  @js.native
  open class HingeConstraint protected () extends PhysicsConstraint {
    def this(pivotA: Vector3, pivotB: Vector3, axisA: Vector3, axisB: Vector3, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/physicsConstraint", "LockConstraint")
  @js.native
  open class LockConstraint protected () extends PhysicsConstraint {
    def this(pivotA: Vector3, pivotB: Vector3, axisA: Vector3, axisB: Vector3, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/physicsConstraint", "Physics6DoFConstraint")
  @js.native
  open class Physics6DoFConstraint protected () extends PhysicsConstraint {
    def this(constraintParams: PhysicsConstraintParameters, limits: js.Array[Physics6DoFLimit], scene: Scene) = this()
    
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
  
  @JSImport("babylonjs/Physics/v2/physicsConstraint", "Physics6DoFLimit")
  @js.native
  open class Physics6DoFLimit () extends StObject {
    
    /**
      * The axis ID to limit
      */
    var axis: PhysicsConstraintAxis = js.native
    
    /**
      * An optional maximum limit for the axis.
      * Corresponds to a distance in meters for linear axes, an angle in radians for angular axes.
      */
    var maxLimit: js.UndefOr[Double] = js.native
    
    /**
      * An optional minimum limit for the axis.
      * Corresponds to a distance in meters for linear axes, an angle in radians for angular axes.
      */
    var minLimit: js.UndefOr[Double] = js.native
  }
  
  @JSImport("babylonjs/Physics/v2/physicsConstraint", "PhysicsConstraint")
  @js.native
  open class PhysicsConstraint protected () extends StObject {
    /**
      * Constructs a new constraint for the physics constraint.
      * @param type The type of constraint to create.
      * @param options The options for the constraint.
      * @param scene The scene the constraint belongs to.
      *
      * This code is useful for creating a new constraint for the physics engine. It checks if the scene has a physics engine, and if the plugin version is correct.
      * If all checks pass, it initializes the constraint with the given type and options.
      */
    def this(`type`: PhysicsConstraintType, options: PhysicsConstraintParameters, scene: Scene) = this()
    
    /* protected */ var _options: PhysicsConstraintParameters = js.native
    
    /**
      * The V2 plugin used to create and manage this Physics Body
      */
    /* protected */ var _physicsPlugin: IPhysicsEnginePluginV2 = js.native
    
    /**
      * V2 Physics plugin private data for a physics material
      */
    var _pluginData: Any = js.native
    
    /* protected */ var _type: PhysicsConstraintType = js.native
    
    /**
      * Disposes the constraint from the physics engine.
      *
      * This method is useful for cleaning up the physics engine when a body is no longer needed. Disposing the body will free up resources and prevent memory leaks.
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets whether collisions are enabled for this physics object.
      *
      * @returns `true` if collisions are enabled, `false` otherwise.
      *
      */
    def isCollisionsEnabled: Boolean = js.native
    /**
      * Enables or disables collisions for the physics engine.
      *
      * @param isEnabled - A boolean value indicating whether collisions should be enabled or disabled.
      *
      */
    def isCollisionsEnabled_=(isEnabled: Boolean): Unit = js.native
    
    /**
      *
      * @returns true if constraint is enabled
      */
    def isEnabled: Boolean = js.native
    /**
      * Enable/disable the constraint
      * @param isEnabled value for the constraint
      */
    def isEnabled_=(isEnabled: Boolean): Unit = js.native
    
    /**
      * Retrieves the options of the physics constraint.
      *
      * @returns The physics constraint parameters.
      *
      */
    def options: PhysicsConstraintParameters = js.native
    
    /**
      * Gets the type of the constraint.
      *
      * @returns The type of the constraint.
      *
      */
    def `type`: PhysicsConstraintType = js.native
  }
  
  @JSImport("babylonjs/Physics/v2/physicsConstraint", "PrismaticConstraint")
  @js.native
  open class PrismaticConstraint protected () extends PhysicsConstraint {
    def this(pivotA: Vector3, pivotB: Vector3, axisA: Vector3, axisB: Vector3, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Physics/v2/physicsConstraint", "SliderConstraint")
  @js.native
  open class SliderConstraint protected () extends PhysicsConstraint {
    def this(pivotA: Vector3, pivotB: Vector3, axisA: Vector3, axisB: Vector3, scene: Scene) = this()
  }
}
