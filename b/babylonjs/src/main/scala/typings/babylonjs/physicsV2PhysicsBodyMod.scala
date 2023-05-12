package typings.babylonjs

import typings.babylonjs.bonesBoneMod.Bone
import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.physicsV2IphysicsenginepluginMod.IPhysicsCollisionEvent
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMassProperties
import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMotionType
import typings.babylonjs.physicsV2PhysicsConstraintMod.PhysicsConstraint
import typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsV2PhysicsBodyMod {
  
  @JSImport("babylonjs/Physics/v2/physicsBody", "PhysicsBody")
  @js.native
  open class PhysicsBody protected () extends StObject {
    /**
      * Constructs a new physics body for the given node.
      * @param transformNode - The Transform Node to construct the physics body for.
      * @param motionType - The motion type of the physics body. The options are:
      *  - PhysicsMotionType.STATIC - Static bodies are not moving and unaffected by forces or collisions. They are good for level boundaries or terrain.
      *  - PhysicsMotionType.DYNAMIC - Dynamic bodies are fully simulated. They can move and collide with other objects.
      *  - PhysicsMotionType.ANIMATED - They behave like dynamic bodies, but they won't be affected by other bodies, but still push other bodies out of the way.
      * @param startsAsleep - Whether the physics body should start in a sleeping state (not a guarantee). Defaults to false.
      * @param scene - The scene containing the physics engine.
      *
      * This code is useful for creating a physics body for a given Transform Node in a scene.
      * It checks the version of the physics engine and the physics plugin, and initializes the body accordingly.
      * It also sets the node's rotation quaternion if it is not already set. Finally, it adds the body to the physics engine.
      */
    def this(transformNode: TransformNode, motionType: PhysicsMotionType, startsAsleep: Boolean, scene: Scene) = this()
    
    /**
      * If the collision callback is enabled
      */
    /* private */ var _collisionCBEnabled: Any = js.native
    
    /* private */ var _nodeDisposeObserver: Any = js.native
    
    /**
      * The engine used to create and manage this Physics Body
      */
    /* private */ var _physicsEngine: Any = js.native
    
    /**
      * The V2 plugin used to create and manage this Physics Body
      */
    /* private */ var _physicsPlugin: Any = js.native
    
    /**
      * V2 Physics plugin private data for single Transform
      */
    var _pluginData: Any = js.native
    
    /**
      * V2 Physics plugin private data for instances
      */
    var _pluginDataInstances: js.Array[Any] = js.native
    
    /**
      * Adds a constraint to the physics engine.
      *
      * @param childBody - The body to which the constraint will be applied.
      * @param constraint - The constraint to be applied.
      * @param instanceIndex - If this body is instanced, the index of the instance to which the constraint will be applied. If not specified, no constraint will be applied.
      * @param childInstanceIndex - If the child body is instanced, the index of the instance to which the constraint will be applied. If not specified, no constraint will be applied.
      *
      */
    def addConstraint(childBody: PhysicsBody, constraint: PhysicsConstraint): Unit = js.native
    def addConstraint(childBody: PhysicsBody, constraint: PhysicsConstraint, instanceIndex: Double): Unit = js.native
    def addConstraint(
      childBody: PhysicsBody,
      constraint: PhysicsConstraint,
      instanceIndex: Double,
      childInstanceIndex: Double
    ): Unit = js.native
    def addConstraint(
      childBody: PhysicsBody,
      constraint: PhysicsConstraint,
      instanceIndex: Unit,
      childInstanceIndex: Double
    ): Unit = js.native
    
    /**
      * Applies a force to the physics object.
      *
      * @param force The force vector.
      * @param location The location of the force.
      * @param instanceIndex For a instanced body, the instance to where the force should be applied. If not specified, the force is applied to all instances.
      *
      * This method is useful for applying a force to a physics object, which can be used to simulate physical forces such as gravity,
      * collisions, and explosions. This can be used to create realistic physics simulations in a game or other application.
      */
    def applyForce(force: Vector3, location: Vector3): Unit = js.native
    def applyForce(force: Vector3, location: Vector3, instanceIndex: Double): Unit = js.native
    
    /**
      * Applies an impulse to the physics object.
      *
      * @param impulse The impulse vector.
      * @param location The location of the impulse.
      * @param instanceIndex For a instanced body, the instance to where the impulse should be applied. If not specified, the impulse is applied to all instances.
      *
      * This method is useful for applying an impulse to a physics object, which can be used to simulate physical forces such as gravity,
      * collisions, and explosions. This can be used to create realistic physics simulations in a game or other application.
      */
    def applyImpulse(impulse: Vector3, location: Vector3): Unit = js.native
    def applyImpulse(impulse: Vector3, location: Vector3, instanceIndex: Double): Unit = js.native
    
    /**
      * Clone the PhysicsBody to a new body and assign it to the transformNode parameter
      * @param transformNode transformNode that will be used for the cloned PhysicsBody
      * @returns the newly cloned PhysicsBody
      */
    def clone(transformNode: TransformNode): PhysicsBody = js.native
    
    /**
      * Computes the mass properties of the physics object, based on the set of physics shapes this body uses.
      * This method is useful for computing the initial mass properties of a physics object, such as its mass,
      * inertia, and center of mass; these values are important for accurately simulating the physics of the
      * object in the physics engine, and computing values based on the shape will provide you with reasonable
      * intial values, which you can then customize.
      */
    def computeMassProperties(): PhysicsMassProperties = js.native
    def computeMassProperties(instanceIndex: Double): PhysicsMassProperties = js.native
    
    /**
      * Disable pre-step that consists in updating Physics Body from Transform Node Translation/Orientation.
      * True by default for maximum performance.
      */
    var disablePreStep: Boolean = js.native
    
    /**
      * Disposes the body from the physics engine.
      *
      * This method is useful for cleaning up the physics engine when a body is no longer needed. Disposing the body will free up resources and prevent memory leaks.
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets the angular damping of the physics body.
      *
      * @returns The angular damping of the physics body.
      *
      * This method is useful for getting the angular damping of the physics body,
      * which is the rate of reduction of the angular velocity over time.
      * This is important for simulating realistic physics behavior in a game.
      */
    def getAngularDamping(): Double = js.native
    def getAngularDamping(instanceIndex: Double): Double = js.native
    
    /**
      * Gets the angular velocity of the physics body and stores it in the given vector3.
      * @param angVel - The vector3 to store the angular velocity in.
      *
      * This method is useful for getting the angular velocity of a physics body, which can be used to determine the body's
      * rotational speed. This information can be used to create realistic physics simulations.
      */
    def getAngularVelocityToRef(angVel: Vector3): Unit = js.native
    def getAngularVelocityToRef(angVel: Vector3, instanceIndex: Double): Unit = js.native
    
    /**
      * Returns the string "PhysicsBody".
      * @returns "PhysicsBody"
      */
    def getClassName(): String = js.native
    
    /**
      * Returns an observable that will be notified for all collisions happening for event-enabled bodies
      * @returns Observable
      */
    def getCollisionObservable(): Observable[IPhysicsCollisionEvent] = js.native
    
    /**
      * Gets the event mask of the physics engine.
      *
      * @returns The event mask of the physics engine.
      *
      * This method is useful for getting the event mask of the physics engine,
      * which is used to determine which events the engine will respond to.
      * This is important for ensuring that the engine is responding to the correct events and not
      * wasting resources on unnecessary events.
      */
    def getEventMask(): Double = js.native
    def getEventMask(instanceIndex: Double): Double = js.native
    
    /**
      * Retrieves the geometry of the body from the physics plugin.
      *
      * @returns The geometry of the body.
      *
      * This method is useful for retrieving the geometry of the body from the physics plugin, which can be used for various physics calculations.
      */
    def getGeometry(): js.Object = js.native
    
    /**
      * Gets the gravity factor of the physics body
      * @param instanceIndex the instance of the body to get, if undefined the value of first instance will be returned
      * @returns the gravity factor
      */
    def getGravityFactor(): Double = js.native
    def getGravityFactor(instanceIndex: Double): Double = js.native
    
    /**
      * Gets the linear damping of the physics body.
      * @returns The linear damping of the physics body.
      *
      * This method is useful for retrieving the linear damping of the physics body, which is the amount of
      * resistance the body has to linear motion. This is useful for simulating realistic physics behavior
      * in a game.
      */
    def getLinearDamping(): Double = js.native
    def getLinearDamping(instanceIndex: Double): Double = js.native
    
    /**
      * Gets the linear velocity of the physics body and stores it in the given vector3.
      * @param linVel - The vector3 to store the linear velocity in.
      *
      * This method is useful for getting the linear velocity of a physics body in a physics engine.
      * This can be used to determine the speed and direction of the body, which can be used to calculate the motion of the body.*/
    def getLinearVelocityToRef(linVel: Vector3): Unit = js.native
    def getLinearVelocityToRef(linVel: Vector3, instanceIndex: Double): Unit = js.native
    
    /**
      * Retrieves the mass properties of the object.
      *
      * @returns The mass properties of the object.
      *
      * This method is useful for physics simulations, as it allows the user to
      * retrieve the mass properties of the object, such as its mass, center of mass,
      * and moment of inertia. This information is necessary for accurate physics
      * simulations.
      */
    def getMassProperties(): PhysicsMassProperties = js.native
    def getMassProperties(instanceIndex: Double): PhysicsMassProperties = js.native
    
    /**
      * Gets the motion type of the physics body. Can be STATIC, DYNAMIC, or ANIMATED.
      */
    def getMotionType(): PhysicsMotionType = js.native
    def getMotionType(instanceIndex: Double): PhysicsMotionType = js.native
    
    def getObjectCenterWorld(): Vector3 = js.native
    def getObjectCenterWorld(instanceIndex: Double): Vector3 = js.native
    
    def getObjectCenterWorldToRef(ref: Vector3): Vector3 = js.native
    def getObjectCenterWorldToRef(ref: Vector3, instanceIndex: Double): Vector3 = js.native
    
    /**
      * Executes a callback on the body or all of the instances of a body
      * @param callback the callback to execute
      */
    def iterateOverAllInstances(callback: js.Function2[/* body */ this.type, /* instanceIndex */ js.UndefOr[Double], Unit]): Unit = js.native
    
    /**
      * This returns the number of internal instances of the physics body
      */
    def numInstances: Double = js.native
    
    /**
      * Sets the angular damping of the physics body.
      * @param damping The angular damping of the body.
      *
      * This method is useful for controlling the angular velocity of a physics body.
      * By setting the damping, the body's angular velocity will be reduced over time, simulating the effect of friction.
      * This can be used to create realistic physical behavior in a physics engine.
      */
    def setAngularDamping(damping: Double): Unit = js.native
    def setAngularDamping(damping: Double, instanceIndex: Double): Unit = js.native
    
    /**
      * Sets the angular velocity of the physics object.
      * @param angVel - The angular velocity to set.
      *
      * This method is useful for setting the angular velocity of a physics object, which is necessary for
      * simulating realistic physics behavior. The angular velocity is used to determine the rate of rotation of the object,
      * which is important for simulating realistic motion.
      */
    def setAngularVelocity(angVel: Vector3): Unit = js.native
    def setAngularVelocity(angVel: Vector3, instanceIndex: Double): Unit = js.native
    
    /**
      * Enable or disable collision callback for this PhysicsBody.
      * @param enabled true if PhysicsBody's collision will rise a collision event and notifies the observable
      */
    def setCollisionCallbackEnabled(enabled: Boolean): Unit = js.native
    
    /**
      * Sets the event mask for the physics engine.
      *
      * @param eventMask - A bitmask that determines which events will be sent to the physics engine.
      *
      * This method is useful for setting the event mask for the physics engine, which determines which events
      * will be sent to the physics engine. This allows the user to control which events the physics engine will respond to.
      */
    def setEventMask(eventMask: Double): Unit = js.native
    def setEventMask(eventMask: Double, instanceIndex: Double): Unit = js.native
    
    /**
      * Sets the gravity factor of the physics body
      * @param factor the gravity factor to set
      * @param instanceIndex the instance of the body to set, if undefined all instances will be set
      */
    def setGravityFactor(factor: Double): Unit = js.native
    def setGravityFactor(factor: Double, instanceIndex: Double): Unit = js.native
    
    /**
      * Sets the linear damping of the physics body.
      *
      * @param damping - The linear damping value.
      *
      * This method is useful for controlling the linear damping of the physics body,
      * which is the rate at which the body's velocity decreases over time. This is useful for simulating
      * the effects of air resistance or other forms of friction.
      */
    def setLinearDamping(damping: Double): Unit = js.native
    def setLinearDamping(damping: Double, instanceIndex: Double): Unit = js.native
    
    /**
      * Sets the linear velocity of the physics object.
      * @param linVel - The linear velocity to set.
      *
      * This method is useful for setting the linear velocity of a physics object,
      * which is necessary for simulating realistic physics in a game engine.
      * By setting the linear velocity, the physics object will move in the direction and speed specified by the vector.
      * This allows for realistic physics simulations, such as simulating the motion of a ball rolling down a hill.
      */
    def setLinearVelocity(linVel: Vector3): Unit = js.native
    def setLinearVelocity(linVel: Vector3, instanceIndex: Double): Unit = js.native
    
    /**
      * Sets the mass properties of the physics object.
      *
      * @param massProps - The mass properties to set.
      * @param instanceIndex - The index of the instance to set the mass properties for. If not defined, the mass properties will be set for all instances.
      *
      * This method is useful for setting the mass properties of a physics object, such as its mass,
      * inertia, and center of mass. This is important for accurately simulating the physics of the object in the physics engine.
      */
    def setMassProperties(massProps: PhysicsMassProperties): Unit = js.native
    def setMassProperties(massProps: PhysicsMassProperties, instanceIndex: Double): Unit = js.native
    
    /**
      * Sets the motion type of the physics body. Can be STATIC, DYNAMIC, or ANIMATED.
      */
    def setMotionType(motionType: PhysicsMotionType): Unit = js.native
    def setMotionType(motionType: PhysicsMotionType, instanceIndex: Double): Unit = js.native
    
    /**
      * Retrieves the physics shape associated with this object.
      *
      * @returns The physics shape associated with this object, or `undefined` if no
      * shape is associated.
      *
      * This method is useful for retrieving the physics shape associated with this object,
      * which can be used to apply physical forces to the object or to detect collisions.
      */
    def shape: Nullable[PhysicsShape] = js.native
    /**
      * Sets the shape of the physics body.
      * @param shape - The shape of the physics body.
      *
      * This method is useful for setting the shape of the physics body, which is necessary for the physics engine to accurately simulate the body's behavior.
      * The shape is used to calculate the body's mass, inertia, and other properties.
      */
    def shape_=(shape: Nullable[PhysicsShape]): Unit = js.native
    
    /**
      * Physics engine will try to make this body sleeping and not active
      */
    var startAsleep: Boolean = js.native
    
    /**
      * Sync with a bone
      * @param bone The bone that the impostor will be synced to.
      * @param boneMesh The mesh that the bone is influencing.
      * @param jointPivot The pivot of the joint / bone in local space.
      * @param distToJoint Optional distance from the impostor to the joint.
      * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
      * @param boneAxis Optional vector3 axis the bone is aligned with
      */
    def syncWithBone(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3): Unit = js.native
    def syncWithBone(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3, distToJoint: Double): Unit = js.native
    def syncWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: Double,
      adjustRotation: Unit,
      boneAxis: Vector3
    ): Unit = js.native
    def syncWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: Double,
      adjustRotation: Quaternion
    ): Unit = js.native
    def syncWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: Double,
      adjustRotation: Quaternion,
      boneAxis: Vector3
    ): Unit = js.native
    def syncWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: Unit,
      adjustRotation: Unit,
      boneAxis: Vector3
    ): Unit = js.native
    def syncWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: Unit,
      adjustRotation: Quaternion
    ): Unit = js.native
    def syncWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: Unit,
      adjustRotation: Quaternion,
      boneAxis: Vector3
    ): Unit = js.native
    
    /**
      * The transform node associated with this Physics Body
      */
    var transformNode: TransformNode = js.native
    
    /**
      * If a physics body is connected to an instanced node, update the number physic instances to match the number of node instances.
      */
    def updateBodyInstances(): Unit = js.native
  }
}
