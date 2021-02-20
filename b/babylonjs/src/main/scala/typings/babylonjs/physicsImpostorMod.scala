package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Body
import typings.babylonjs.anon.Callback
import typings.babylonjs.boneMod.Bone
import typings.babylonjs.boundingInfoMod.BoundingInfo
import typings.babylonjs.mathAxisMod.Space
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.physicsJointMod.PhysicsJoint
import typings.babylonjs.physicsJointMod.PhysicsJointData
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsImpostorMod {
  
  @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor")
  @js.native
  class PhysicsImpostor protected () extends StObject {
    /**
      * Initializes the physics imposter
      * @param object The physics-enabled object used as the physics imposter
      * @param type The type of the physics imposter
      * @param _options The options for the physics imposter
      * @param _scene The Babylon scene
      */
    def this(
      /**
      * The physics-enabled object used as the physics imposter
      */
    `object`: IPhysicsEnabledObject,
      /**
      * The type of the physics imposter
      */
    `type`: Double
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics imposter
      */
    `object`: IPhysicsEnabledObject,
      /**
      * The type of the physics imposter
      */
    `type`: Double,
      _options: PhysicsImpostorParameters
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics imposter
      */
    `object`: IPhysicsEnabledObject,
      /**
      * The type of the physics imposter
      */
    `type`: Double,
      _options: js.UndefOr[scala.Nothing],
      _scene: Scene
    ) = this()
    def this(
      /**
      * The physics-enabled object used as the physics imposter
      */
    `object`: IPhysicsEnabledObject,
      /**
      * The type of the physics imposter
      */
    `type`: Double,
      _options: PhysicsImpostorParameters,
      _scene: Scene
    ) = this()
    
    var _bodyUpdateRequired: js.Any = js.native
    
    var _deltaPosition: js.Any = js.native
    
    var _deltaRotation: js.Any = js.native
    
    var _deltaRotationConjugated: js.Any = js.native
    
    var _getPhysicsParent: js.Any = js.native
    
    /**
      * This function will completly initialize this impostor.
      * It will create a new body - but only if this mesh has no parent.
      * If it has, this impostor will not be used other than to define the impostor
      * of the child mesh.
      * @hidden
      */
    def _init(): Unit = js.native
    
    var _isDisposed: js.Any = js.native
    
    /** @hidden */
    var _isFromLine: Boolean = js.native
    
    var _joints: js.Any = js.native
    
    var _onAfterPhysicsStepCallbacks: js.Any = js.native
    
    var _onBeforePhysicsStepCallbacks: js.Any = js.native
    
    /** @hidden */
    var _onPhysicsCollideCallbacks: js.Array[Callback] = js.native
    
    var _options: js.Any = js.native
    
    var _parent: js.Any = js.native
    
    var _physicsBody: js.Any = js.native
    
    var _physicsEngine: js.Any = js.native
    
    /** @hidden */
    var _pluginData: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _tmpQuat: js.Any = js.native
    
    var _tmpQuat2: js.Any = js.native
    
    /**
      * Add an anchor to a cloth impostor
      * @param otherImpostor rigid impostor to anchor to
      * @param width ratio across width from 0 to 1
      * @param height ratio up height from 0 to 1
      * @param influence the elasticity between cloth impostor and anchor from 0, very stretchy to 1, little strech
      * @param noCollisionBetweenLinkedBodies when true collisions between cloth impostor and anchor are ignored; default false
      * @returns impostor the soft imposter
      */
    def addAnchor(
      otherImpostor: PhysicsImpostor,
      width: Double,
      height: Double,
      influence: Double,
      noCollisionBetweenLinkedBodies: Boolean
    ): PhysicsImpostor = js.native
    
    /**
      * Add a hook to a rope impostor
      * @param otherImpostor rigid impostor to anchor to
      * @param length ratio across rope from 0 to 1
      * @param influence the elasticity between rope impostor and anchor from 0, very stretchy to 1, little strech
      * @param noCollisionBetweenLinkedBodies when true collisions between soft impostor and anchor are ignored; default false
      * @returns impostor the rope imposter
      */
    def addHook(
      otherImpostor: PhysicsImpostor,
      length: Double,
      influence: Double,
      noCollisionBetweenLinkedBodies: Boolean
    ): PhysicsImpostor = js.native
    
    /**
      * Add a joint to this impostor with a different impostor
      * @param otherImpostor A physics imposter used to add a joint
      * @param joint The joint to add
      * @returns The physics imposter
      */
    def addJoint(otherImpostor: PhysicsImpostor, joint: PhysicsJoint): PhysicsImpostor = js.native
    
    /**
      * this function is executed by the physics engine
      */
    def afterStep(): Unit = js.native
    
    /**
      * Apply a force
      * @param force The force to apply
      * @param contactPoint The contact point for the force
      * @returns The physics imposter
      */
    def applyForce(force: Vector3, contactPoint: Vector3): PhysicsImpostor = js.native
    
    /**
      * Apply an impulse
      * @param force The impulse force
      * @param contactPoint The contact point for the impulse force
      * @returns The physics imposter
      */
    def applyImpulse(force: Vector3, contactPoint: Vector3): PhysicsImpostor = js.native
    
    /**
      * this function is executed by the physics engine.
      */
    def beforeStep(): Unit = js.native
    
    /**
      * Clones the physics imposter
      * @param newObject The physics imposter clones to this physics-enabled object
      * @returns A nullable physics imposter
      */
    def clone(newObject: IPhysicsEnabledObject): Nullable[PhysicsImpostor] = js.native
    
    /**
      * A help function to create a joint
      * @param otherImpostor A physics imposter used to create a joint
      * @param jointType The type of joint
      * @param jointData The data for the joint
      * @returns The physics imposter
      */
    def createJoint(otherImpostor: PhysicsImpostor, jointType: Double, jointData: PhysicsJointData): PhysicsImpostor = js.native
    
    /**
      * Disposes the physics imposter
      */
    def dispose(): Unit = js.native
    
    /**
      * Execute a function with the physics plugin native code
      * Provide a function the will have two variables - the world object and the physics body object
      * @param func The function to execute with the physics plugin native code
      */
    def executeNativeFunction(func: js.Function2[/* world */ js.Any, /* physicsBody */ js.Any, Unit]): Unit = js.native
    
    /**
      * Force a regeneration of this or the parent's impostor's body.
      * Use under cautious - This will remove all joints already implemented.
      */
    def forceUpdate(): Unit = js.native
    
    /**
      * Gets the coefficient of friction
      */
    def friction: Double = js.native
    /**
      * Sets the coefficient of friction
      */
    def friction_=(value: Double): Unit = js.native
    
    /**
      * Gets the angular velocity
      * @returns angular velocity or null
      */
    def getAngularVelocity(): Nullable[Vector3] = js.native
    
    /**
      * Gets the box size of the physics imposter and stores the result in the input parameter
      * @param result Stores the box size
      * @returns The physics imposter
      */
    def getBoxSizeToRef(result: Vector3): PhysicsImpostor = js.native
    
    /**
      * Gets the linear velocity
      * @returns  linear velocity or null
      */
    def getLinearVelocity(): Nullable[Vector3] = js.native
    
    /**
      * Gets the object center
      * @returns The object center
      */
    def getObjectCenter(): Vector3 = js.native
    
    /**
      * Gets the object extend size
      * @returns the object extend size
      */
    def getObjectExtendSize(): Vector3 = js.native
    
    /**
      * Get a specific parameter from the options parameters
      * @param paramName The object parameter name
      * @returns The object parameter
      */
    def getParam(paramName: String): js.Any = js.native
    
    /**
      * Get the parent rotation
      * @returns The parent rotation
      */
    def getParentsRotation(): Quaternion = js.native
    
    /**
      * Gets the radius of the physics imposter
      * @returns Radius of the physics imposter
      */
    def getRadius(): Double = js.native
    
    /**
      * Should a new body be generated.
      * @returns boolean specifying if body initialization is required
      */
    def isBodyInitRequired(): Boolean = js.native
    
    /**
      * Specifies if the physics imposter is disposed
      */
    def isDisposed: Boolean = js.native
    
    /**
      * Gets the mass of the physics imposter
      */
    def mass: Double = js.native
    def mass_=(value: Double): Unit = js.native
    
    /**
      * The physics-enabled object used as the physics imposter
      */
    var `object`: IPhysicsEnabledObject = js.native
    
    /**
      * event and body object due to cannon's event-based architecture.
      */
    def onCollide(e: Body): Unit = js.native
    
    /**
      * Legacy collision detection event support
      */
    var onCollideEvent: Nullable[js.Function2[/* collider */ this.type, /* collidedWith */ this.type, Unit]] = js.native
    
    /**
      * Get the parent of the physics imposter
      * @returns Physics imposter or null
      */
    def parent: Nullable[PhysicsImpostor] = js.native
    /**
      * Sets the parent of the physics imposter
      */
    def parent_=(value: Nullable[PhysicsImpostor]): Unit = js.native
    
    /**
      * Gets the body that holds this impostor. Either its own, or its parent.
      */
    def physicsBody: js.Any = js.native
    /**
      * Set the physics body. Used mainly by the physics engine/plugin
      */
    def physicsBody_=(physicsBody: js.Any): Unit = js.native
    
    /**
      * Gets the positionIterations of a soft body; only supported by the AmmoJSPlugin
      */
    def positionIterations: Double = js.native
    /**
      * Sets the positionIterations of a soft body; only supported by the AmmoJSPlugin
      */
    def positionIterations_=(value: Double): Unit = js.native
    
    /**
      * Gets the pressure of a soft body; only supported by the AmmoJSPlugin
      */
    def pressure: Double = js.native
    /**
      * Sets the pressure of a soft body; only supported by the AmmoJSPlugin
      */
    def pressure_=(value: Double): Unit = js.native
    
    /**
      * Register a function that will be executed after the physics step
      * @param func The function to execute after physics step
      */
    def registerAfterPhysicsStep(func: js.Function1[/* impostor */ this.type, Unit]): Unit = js.native
    
    /**
      * Register a function that will be executed before the physics world is stepping forward
      * @param func The function to execute before the physics world is stepped forward
      */
    def registerBeforePhysicsStep(func: js.Function1[/* impostor */ this.type, Unit]): Unit = js.native
    
    def registerOnPhysicsCollide(
      collideAgainst: js.Array[PhysicsImpostor],
      func: js.Function2[/* collider */ this.type, /* collidedAgainst */ this.type, Unit]
    ): Unit = js.native
    /**
      * register a function that will be executed when this impostor collides against a different body
      * @param collideAgainst Physics imposter, or array of physics imposters to collide against
      * @param func Callback that is executed on collision
      */
    def registerOnPhysicsCollide(
      collideAgainst: PhysicsImpostor,
      func: js.Function2[/* collider */ this.type, /* collidedAgainst */ this.type, Unit]
    ): Unit = js.native
    
    /**
      * Resets the update flags
      */
    def resetUpdateFlags(): Unit = js.native
    
    /**
      * Gets the coefficient of restitution
      */
    def restitution: Double = js.native
    /**
      * Sets the coefficient of restitution
      */
    def restitution_=(value: Double): Unit = js.native
    
    /**
      * @hidden
      */
    var segments: Double = js.native
    
    /**
      * Sets the angular velocity
      * @param velocity The velocity or null
      */
    def setAngularVelocity(velocity: Nullable[Vector3]): Unit = js.native
    
    /**
      * Sets the delta position
      * @param position The delta position amount
      */
    def setDeltaPosition(position: Vector3): Unit = js.native
    
    /**
      * Sets the delta rotation
      * @param rotation The delta rotation amount
      */
    def setDeltaRotation(rotation: Quaternion): Unit = js.native
    
    /**
      * Sets the linear velocity
      * @param velocity  linear velocity or null
      */
    def setLinearVelocity(velocity: Nullable[Vector3]): Unit = js.native
    
    /**
      * Specifically change the body's mass option. Won't recreate the physics body object
      * @param mass The mass of the physics imposter
      */
    def setMass(mass: Double): Unit = js.native
    
    /**
      * Sets a specific parameter in the options given to the physics plugin
      * @param paramName The parameter name
      * @param value The value of the parameter
      */
    def setParam(paramName: String, value: Double): Unit = js.native
    
    /**
      * Sets the updated scaling
      * @param updated Specifies if the scaling is updated
      */
    def setScalingUpdated(): Unit = js.native
    
    /**
      * Will keep this body still, in a sleep mode.
      * @returns the physics imposter
      */
    def sleep(): PhysicsImpostor = js.native
    
    /**
      * @hidden
      */
    var soft: Boolean = js.native
    
    /**
      * Gets the stiffness of a soft body; only supported by the AmmoJSPlugin
      */
    def stiffness: Double = js.native
    /**
      * Sets the stiffness of a soft body; only supported by the AmmoJSPlugin
      */
    def stiffness_=(value: Double): Unit = js.native
    
    /**
      * Sync a bone with this impostor
      * @param bone The bone to sync to the impostor.
      * @param boneMesh The mesh that the bone is influencing.
      * @param jointPivot The pivot of the joint / bone in local space.
      * @param distToJoint Optional distance from the impostor to the joint.
      * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
      */
    def syncBoneWithImpostor(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3): Unit = js.native
    def syncBoneWithImpostor(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: js.UndefOr[scala.Nothing],
      adjustRotation: Quaternion
    ): Unit = js.native
    def syncBoneWithImpostor(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3, distToJoint: Double): Unit = js.native
    def syncBoneWithImpostor(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: Double,
      adjustRotation: Quaternion
    ): Unit = js.native
    
    /**
      * Sync impostor to a bone
      * @param bone The bone that the impostor will be synced to.
      * @param boneMesh The mesh that the bone is influencing.
      * @param jointPivot The pivot of the joint / bone in local space.
      * @param distToJoint Optional distance from the impostor to the joint.
      * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
      * @param boneAxis Optional vector3 axis the bone is aligned with
      */
    def syncImpostorWithBone(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3): Unit = js.native
    def syncImpostorWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: js.UndefOr[scala.Nothing],
      adjustRotation: js.UndefOr[scala.Nothing],
      boneAxis: Vector3
    ): Unit = js.native
    def syncImpostorWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: js.UndefOr[scala.Nothing],
      adjustRotation: Quaternion
    ): Unit = js.native
    def syncImpostorWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: js.UndefOr[scala.Nothing],
      adjustRotation: Quaternion,
      boneAxis: Vector3
    ): Unit = js.native
    def syncImpostorWithBone(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3, distToJoint: Double): Unit = js.native
    def syncImpostorWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: Double,
      adjustRotation: js.UndefOr[scala.Nothing],
      boneAxis: Vector3
    ): Unit = js.native
    def syncImpostorWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: Double,
      adjustRotation: Quaternion
    ): Unit = js.native
    def syncImpostorWithBone(
      bone: Bone,
      boneMesh: AbstractMesh,
      jointPivot: Vector3,
      distToJoint: Double,
      adjustRotation: Quaternion,
      boneAxis: Vector3
    ): Unit = js.native
    
    /**
      * The type of the physics imposter
      */
    var `type`: Double = js.native
    
    /**
      * The unique id of the physics imposter
      * set by the physics engine when adding this impostor to the array
      */
    var uniqueId: Double = js.native
    
    /**
      * Unregisters a function that will be executed after the physics step
      * @param func The function to execute after physics step
      */
    def unregisterAfterPhysicsStep(func: js.Function1[/* impostor */ this.type, Unit]): Unit = js.native
    
    /**
      * Unregister a function that will be executed before the physics world is stepping forward
      * @param func The function to execute before the physics world is stepped forward
      */
    def unregisterBeforePhysicsStep(func: js.Function1[/* impostor */ this.type, Unit]): Unit = js.native
    
    def unregisterOnPhysicsCollide(
      collideAgainst: js.Array[PhysicsImpostor],
      func: js.Function2[
          /* collider */ this.type, 
          /* collidedAgainst */ this.type | js.Array[this.type], 
          Unit
        ]
    ): Unit = js.native
    /**
      * Unregisters the physics imposter on contact
      * @param collideAgainst The physics object to collide against
      * @param func Callback to execute on collision
      */
    def unregisterOnPhysicsCollide(
      collideAgainst: PhysicsImpostor,
      func: js.Function2[
          /* collider */ this.type, 
          /* collidedAgainst */ this.type | js.Array[this.type], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Gets the velocityIterations of a soft body; only supported by the AmmoJSPlugin
      */
    def velocityIterations: Double = js.native
    /**
      * Sets the velocityIterations of a soft body; only supported by the AmmoJSPlugin
      */
    def velocityIterations_=(value: Double): Unit = js.native
    
    /**
      * Wake the body up.
      * @returns The physics imposter
      */
    def wakeUp(): PhysicsImpostor = js.native
  }
  /* static members */
  object PhysicsImpostor {
    
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Box-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.BoxImpostor")
    @js.native
    def BoxImpostor: Double = js.native
    @scala.inline
    def BoxImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BoxImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Capsule-Impostor type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.CapsuleImpostor")
    @js.native
    def CapsuleImpostor: Double = js.native
    @scala.inline
    def CapsuleImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CapsuleImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Cloth-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.ClothImpostor")
    @js.native
    def ClothImpostor: Double = js.native
    @scala.inline
    def ClothImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClothImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * ConvexHull-Impostor type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.ConvexHullImpostor")
    @js.native
    def ConvexHullImpostor: Double = js.native
    @scala.inline
    def ConvexHullImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvexHullImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Custom-Imposter type (Ammo.js plugin only)
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.CustomImpostor")
    @js.native
    def CustomImpostor: Double = js.native
    @scala.inline
    def CustomImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Cylinder-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.CylinderImpostor")
    @js.native
    def CylinderImpostor: Double = js.native
    @scala.inline
    def CylinderImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CylinderImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * The default object size of the imposter
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.DEFAULT_OBJECT_SIZE")
    @js.native
    def DEFAULT_OBJECT_SIZE: Vector3 = js.native
    @scala.inline
    def DEFAULT_OBJECT_SIZE_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_OBJECT_SIZE")(x.asInstanceOf[js.Any])
    
    /**
      * Heightmap-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.HeightmapImpostor")
    @js.native
    def HeightmapImpostor: Double = js.native
    @scala.inline
    def HeightmapImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeightmapImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * The identity quaternion of the imposter
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.IDENTITY_QUATERNION")
    @js.native
    def IDENTITY_QUATERNION: Quaternion = js.native
    @scala.inline
    def IDENTITY_QUATERNION_=(x: Quaternion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY_QUATERNION")(x.asInstanceOf[js.Any])
    
    /**
      * Mesh-imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.MeshImpostor")
    @js.native
    def MeshImpostor: Double = js.native
    @scala.inline
    def MeshImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MeshImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * No-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.NoImpostor")
    @js.native
    def NoImpostor: Double = js.native
    @scala.inline
    def NoImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Particle-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.ParticleImpostor")
    @js.native
    def ParticleImpostor: Double = js.native
    @scala.inline
    def ParticleImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParticleImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Plane-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.PlaneImpostor")
    @js.native
    def PlaneImpostor: Double = js.native
    @scala.inline
    def PlaneImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PlaneImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Rope-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.RopeImpostor")
    @js.native
    def RopeImpostor: Double = js.native
    @scala.inline
    def RopeImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RopeImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Softbody-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.SoftbodyImpostor")
    @js.native
    def SoftbodyImpostor: Double = js.native
    @scala.inline
    def SoftbodyImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SoftbodyImpostor")(x.asInstanceOf[js.Any])
    
    /**
      * Sphere-Imposter type
      */
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor.SphereImpostor")
    @js.native
    def SphereImpostor: Double = js.native
    @scala.inline
    def SphereImpostor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SphereImpostor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor._tmpQuat")
    @js.native
    def _tmpQuat: js.Any = js.native
    @scala.inline
    def _tmpQuat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Physics/physicsImpostor", "PhysicsImpostor._tmpVecs")
    @js.native
    def _tmpVecs: js.Any = js.native
    @scala.inline
    def _tmpVecs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpVecs")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IPhysicsEnabledObject extends StObject {
    
    /**
      * Computes the world matrix
      * @param force Specifies if the world matrix should be computed by force
      * @returns A world matrix
      */
    def computeWorldMatrix(force: Boolean): Matrix = js.native
    
    /**
      * Gets the absolute pivot point from the mesh
      * @returns the absolute pivot point
      */
    def getAbsolutePivotPoint(): Vector3 = js.native
    
    /**
      * Gets the absolute position from the mesh
      * @returns the absolute position
      */
    def getAbsolutePosition(): Vector3 = js.native
    
    /**
      * The bounding info of the physics-enabled object
      * @returns The bounding info of the physics-enabled object
      */
    def getBoundingInfo(): BoundingInfo = js.native
    
    /**
      * Gets the child meshes
      * @param directDescendantsOnly Specifies if only direct-descendants should be obtained
      * @returns An array of abstract meshes
      */
    var getChildMeshes: js.UndefOr[
        js.Function1[/* directDescendantsOnly */ js.UndefOr[Boolean], js.Array[AbstractMesh]]
      ] = js.native
    
    /**
      * Gets the class name of the mesh
      * @returns The class name
      */
    def getClassName(): String = js.native
    
    /**
      * Gets the indices from the mesh
      * @returns A nullable array of index arrays
      */
    var getIndices: js.UndefOr[js.Function0[Nullable[IndicesArray]]] = js.native
    
    /**
      * Gets the scene from the mesh
      * @returns the indices array or null
      */
    var getScene: js.UndefOr[js.Function0[Scene]] = js.native
    
    /**
      * Gets the vertex data
      * @param kind The type of vertex data
      * @returns A nullable array of numbers, or a float32 array
      */
    def getVerticesData(kind: String): Nullable[js.Array[Double] | Float32Array] = js.native
    
    /**
      * Gets the world matrix
      * @returns A world matrix
      */
    var getWorldMatrix: js.UndefOr[js.Function0[Matrix]] = js.native
    
    /**
      * The parent of the physics-enabled object
      */
    var parent: js.UndefOr[js.Any] = js.native
    
    /**
      * The position of the physics-enabled object
      */
    var position: Vector3 = js.native
    
    /**
      * Rotates the mesh
      * @param axis The axis of rotation
      * @param amount The amount of rotation
      * @param space The space of the rotation
      * @returns The rotation transform node
      */
    def rotate(axis: Vector3, amount: Double): TransformNode = js.native
    def rotate(axis: Vector3, amount: Double, space: Space): TransformNode = js.native
    
    /**
      * The rotation of the physics-enabled object
      */
    var rotation: js.UndefOr[Vector3] = js.native
    
    /**
      * The rotation of the physics-enabled object
      */
    var rotationQuaternion: Nullable[Quaternion] = js.native
    
    /**
      * The scale of the physics-enabled object
      */
    var scaling: Vector3 = js.native
    
    /**
      * Sets the absolute position of the mesh
      * @param absolutePosition The absolute position of the mesh
      * @returns The transform node
      */
    def setAbsolutePosition(absolutePosition: Vector3): TransformNode = js.native
    
    /**
      * Translates the mesh
      * @param axis The axis of translation
      * @param distance The distance of translation
      * @param space The space of the translation
      * @returns The transform node
      */
    def translate(axis: Vector3, distance: Double): TransformNode = js.native
    def translate(axis: Vector3, distance: Double, space: Space): TransformNode = js.native
  }
  
  @js.native
  trait PhysicsImpostorParameters extends StObject {
    
    /**
      * The collision margin around a soft object
      */
    var damping: js.UndefOr[Double] = js.native
    
    /**
      * Specifies if bi-directional transformations should be disabled
      */
    var disableBidirectionalTransformation: js.UndefOr[Boolean] = js.native
    
    /**
      * The number used to fix points on a cloth (0, 1, 2, 4, 8) or rope (0, 1, 2) only
      * 0 None, 1, back left or top, 2, back right or bottom, 4, front left, 8, front right
      * Add to fix multiple points
      */
    var fixedPoints: js.UndefOr[Double] = js.native
    
    /**
      * The friction of the physics imposter
      */
    var friction: js.UndefOr[Double] = js.native
    
    /**
      * Specifies if the parent should be ignored
      */
    var ignoreParent: js.UndefOr[Boolean] = js.native
    
    /**
      * The collision margin around a soft object
      */
    var margin: js.UndefOr[Double] = js.native
    
    /**
      * The mass of the physics imposter
      */
    var mass: Double = js.native
    
    /**
      * The native options of the physics imposter
      */
    var nativeOptions: js.UndefOr[js.Any] = js.native
    
    /**
      * The path for a rope based on an extrusion
      */
    var path: js.UndefOr[js.Any] = js.native
    
    /**
      * The number of iterations used in maintaining consistent vertex positions, soft object only
      */
    var positionIterations: js.UndefOr[Double] = js.native
    
    /**
      * The pressure inside the physics imposter, soft object only
      */
    var pressure: js.UndefOr[Double] = js.native
    
    /**
      * The coefficient of restitution of the physics imposter
      */
    var restitution: js.UndefOr[Double] = js.native
    
    /**
      * The shape of an extrusion used for a rope based on an extrusion
      */
    var shape: js.UndefOr[js.Any] = js.native
    
    /**
      * The stiffness the physics imposter, soft object only
      */
    var stiffness: js.UndefOr[Double] = js.native
    
    /**
      * The number of iterations used in maintaining consistent vertex velocities, soft object only
      */
    var velocityIterations: js.UndefOr[Double] = js.native
  }
  object PhysicsImpostorParameters {
    
    @scala.inline
    def apply(mass: Double): PhysicsImpostorParameters = {
      val __obj = js.Dynamic.literal(mass = mass.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsImpostorParameters]
    }
    
    @scala.inline
    implicit class PhysicsImpostorParametersMutableBuilder[Self <: PhysicsImpostorParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      @scala.inline
      def setDisableBidirectionalTransformation(value: Boolean): Self = StObject.set(x, "disableBidirectionalTransformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableBidirectionalTransformationUndefined: Self = StObject.set(x, "disableBidirectionalTransformation", js.undefined)
      
      @scala.inline
      def setFixedPoints(value: Double): Self = StObject.set(x, "fixedPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedPointsUndefined: Self = StObject.set(x, "fixedPoints", js.undefined)
      
      @scala.inline
      def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      @scala.inline
      def setIgnoreParent(value: Boolean): Self = StObject.set(x, "ignoreParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreParentUndefined: Self = StObject.set(x, "ignoreParent", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeOptions(value: js.Any): Self = StObject.set(x, "nativeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeOptionsUndefined: Self = StObject.set(x, "nativeOptions", js.undefined)
      
      @scala.inline
      def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPositionIterations(value: Double): Self = StObject.set(x, "positionIterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionIterationsUndefined: Self = StObject.set(x, "positionIterations", js.undefined)
      
      @scala.inline
      def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressureUndefined: Self = StObject.set(x, "pressure", js.undefined)
      
      @scala.inline
      def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
      
      @scala.inline
      def setShape(value: js.Any): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
      
      @scala.inline
      def setVelocityIterations(value: Double): Self = StObject.set(x, "velocityIterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityIterationsUndefined: Self = StObject.set(x, "velocityIterations", js.undefined)
    }
  }
}
