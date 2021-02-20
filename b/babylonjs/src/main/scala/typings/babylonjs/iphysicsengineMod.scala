package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.physicsImpostorMod.IPhysicsEnabledObject
import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import typings.babylonjs.physicsJointMod.IMotorEnabledJoint
import typings.babylonjs.physicsJointMod.PhysicsJoint
import typings.babylonjs.physicsRaycastResultMod.PhysicsRaycastResult
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iphysicsengineMod {
  
  @js.native
  trait IPhysicsEngine extends StObject {
    
    /**
      * Called by the scene. No need to call it.
      * @param delta defines the timespam between frames
      */
    def _step(delta: Double): Unit = js.native
    
    /**
      * Adding a new impostor for the impostor tracking.
      * This will be done by the impostor itself.
      * @param impostor the impostor to add
      */
    def addImpostor(impostor: PhysicsImpostor): Unit = js.native
    
    /**
      * Add a joint to the physics engine
      * @param mainImpostor defines the main impostor to which the joint is added.
      * @param connectedImpostor defines the impostor that is connected to the main impostor using this joint
      * @param joint defines the joint that will connect both impostors.
      */
    def addJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = js.native
    
    /**
      * Release all resources
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets the impostor for a physics enabled object
      * @param object defines the object impersonated by the impostor
      * @returns the PhysicsImpostor or null if not found
      */
    def getImpostorForPhysicsObject(`object`: IPhysicsEnabledObject): Nullable[PhysicsImpostor] = js.native
    
    /**
      * Gets the impostor for a physics body object
      * @param body defines physics body used by the impostor
      * @returns the PhysicsImpostor or null if not found
      */
    def getImpostorWithPhysicsBody(body: js.Any): Nullable[PhysicsImpostor] = js.native
    
    /**
      * Gets the list of physic impostors
      * @returns an array of PhysicsImpostor
      */
    def getImpostors(): js.Array[PhysicsImpostor] = js.native
    
    /**
      * Gets the current plugin used to run the simulation
      * @returns current plugin
      */
    def getPhysicsPlugin(): IPhysicsEnginePlugin = js.native
    
    /**
      * Gets the name of the current physics plugin
      * @returns the name of the plugin
      */
    def getPhysicsPluginName(): String = js.native
    
    /**
      * Get the sub time step of the physics engine.
      * @returns the current sub time step
      */
    def getSubTimeStep(): Double = js.native
    
    /**
      * Get the time step of the physics engine.
      * @returns the current time step
      */
    def getTimeStep(): Double = js.native
    
    /**
      * Gets the gravity vector used by the simulation
      */
    var gravity: Vector3 = js.native
    
    /**
      * Does a raycast in the physics world
      * @param from when should the ray start?
      * @param to when should the ray end?
      * @returns PhysicsRaycastResult
      */
    def raycast(from: Vector3, to: Vector3): PhysicsRaycastResult = js.native
    
    /**
      * Remove an impostor from the engine.
      * This impostor and its mesh will not longer be updated by the physics engine.
      * @param impostor the impostor to remove
      */
    def removeImpostor(impostor: PhysicsImpostor): Unit = js.native
    
    /**
      * Removes a joint from the simulation
      * @param mainImpostor defines the impostor used with the joint
      * @param connectedImpostor defines the other impostor connected to the main one by the joint
      * @param joint defines the joint to remove
      */
    def removeJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = js.native
    
    /**
      * Sets the gravity vector used by the simulation
      * @param gravity defines the gravity vector to use
      */
    def setGravity(gravity: Vector3): Unit = js.native
    
    /**
      * Set the sub time step of the physics engine.
      * Default is 0 meaning there is no sub steps
      * To increase physics resolution precision, set a small value (like 1 ms)
      * @param subTimeStep defines the new sub timestep used for physics resolution.
      */
    def setSubTimeStep(subTimeStep: Double): Unit = js.native
    
    /**
      * Set the time step of the physics engine.
      * Default is 1/60.
      * To slow it down, enter 1/600 for example.
      * To speed it up, 1/30
      * @param newTimeStep the new timestep to apply to this world.
      */
    def setTimeStep(newTimeStep: Double): Unit = js.native
  }
  object IPhysicsEngine {
    
    @scala.inline
    def apply(
      _step: Double => Unit,
      addImpostor: PhysicsImpostor => Unit,
      addJoint: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Unit,
      dispose: () => Unit,
      getImpostorForPhysicsObject: IPhysicsEnabledObject => Nullable[PhysicsImpostor],
      getImpostorWithPhysicsBody: js.Any => Nullable[PhysicsImpostor],
      getImpostors: () => js.Array[PhysicsImpostor],
      getPhysicsPlugin: () => IPhysicsEnginePlugin,
      getPhysicsPluginName: () => String,
      getSubTimeStep: () => Double,
      getTimeStep: () => Double,
      gravity: Vector3,
      raycast: (Vector3, Vector3) => PhysicsRaycastResult,
      removeImpostor: PhysicsImpostor => Unit,
      removeJoint: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Unit,
      setGravity: Vector3 => Unit,
      setSubTimeStep: Double => Unit,
      setTimeStep: Double => Unit
    ): IPhysicsEngine = {
      val __obj = js.Dynamic.literal(_step = js.Any.fromFunction1(_step), addImpostor = js.Any.fromFunction1(addImpostor), addJoint = js.Any.fromFunction3(addJoint), dispose = js.Any.fromFunction0(dispose), getImpostorForPhysicsObject = js.Any.fromFunction1(getImpostorForPhysicsObject), getImpostorWithPhysicsBody = js.Any.fromFunction1(getImpostorWithPhysicsBody), getImpostors = js.Any.fromFunction0(getImpostors), getPhysicsPlugin = js.Any.fromFunction0(getPhysicsPlugin), getPhysicsPluginName = js.Any.fromFunction0(getPhysicsPluginName), getSubTimeStep = js.Any.fromFunction0(getSubTimeStep), getTimeStep = js.Any.fromFunction0(getTimeStep), gravity = gravity.asInstanceOf[js.Any], raycast = js.Any.fromFunction2(raycast), removeImpostor = js.Any.fromFunction1(removeImpostor), removeJoint = js.Any.fromFunction3(removeJoint), setGravity = js.Any.fromFunction1(setGravity), setSubTimeStep = js.Any.fromFunction1(setSubTimeStep), setTimeStep = js.Any.fromFunction1(setTimeStep))
      __obj.asInstanceOf[IPhysicsEngine]
    }
    
    @scala.inline
    implicit class IPhysicsEngineMutableBuilder[Self <: IPhysicsEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddImpostor(value: PhysicsImpostor => Unit): Self = StObject.set(x, "addImpostor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddJoint(value: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Unit): Self = StObject.set(x, "addJoint", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetImpostorForPhysicsObject(value: IPhysicsEnabledObject => Nullable[PhysicsImpostor]): Self = StObject.set(x, "getImpostorForPhysicsObject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetImpostorWithPhysicsBody(value: js.Any => Nullable[PhysicsImpostor]): Self = StObject.set(x, "getImpostorWithPhysicsBody", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetImpostors(value: () => js.Array[PhysicsImpostor]): Self = StObject.set(x, "getImpostors", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPhysicsPlugin(value: () => IPhysicsEnginePlugin): Self = StObject.set(x, "getPhysicsPlugin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPhysicsPluginName(value: () => String): Self = StObject.set(x, "getPhysicsPluginName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSubTimeStep(value: () => Double): Self = StObject.set(x, "getSubTimeStep", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTimeStep(value: () => Double): Self = StObject.set(x, "getTimeStep", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGravity(value: Vector3): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaycast(value: (Vector3, Vector3) => PhysicsRaycastResult): Self = StObject.set(x, "raycast", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveImpostor(value: PhysicsImpostor => Unit): Self = StObject.set(x, "removeImpostor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveJoint(value: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => Unit): Self = StObject.set(x, "removeJoint", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetGravity(value: Vector3 => Unit): Self = StObject.set(x, "setGravity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSubTimeStep(value: Double => Unit): Self = StObject.set(x, "setSubTimeStep", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTimeStep(value: Double => Unit): Self = StObject.set(x, "setTimeStep", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_step(value: Double => Unit): Self = StObject.set(x, "_step", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IPhysicsEnginePlugin extends StObject {
    
    var appendAnchor: js.UndefOr[
        js.Function6[
          /* impostor */ PhysicsImpostor, 
          /* otherImpostor */ PhysicsImpostor, 
          /* width */ Double, 
          /* height */ Double, 
          /* influence */ Double, 
          /* noCollisionBetweenLinkedBodies */ Boolean, 
          Unit
        ]
      ] = js.native
    
    var appendHook: js.UndefOr[
        js.Function5[
          /* impostor */ PhysicsImpostor, 
          /* otherImpostor */ PhysicsImpostor, 
          /* length */ Double, 
          /* influence */ Double, 
          /* noCollisionBetweenLinkedBodies */ Boolean, 
          Unit
        ]
      ] = js.native
    
    def applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Unit = js.native
    
    def applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def executeStep(delta: Double, impostors: js.Array[PhysicsImpostor]): Unit = js.native
    
    def generateJoint(joint: PhysicsImpostorJoint): Unit = js.native
    
    def generatePhysicsBody(impostor: PhysicsImpostor): Unit = js.native
    
    def getAngularVelocity(impostor: PhysicsImpostor): Nullable[Vector3] = js.native
    
    def getBodyFriction(impostor: PhysicsImpostor): Double = js.native
    
    def getBodyMass(impostor: PhysicsImpostor): Double = js.native
    
    var getBodyPositionIterations: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
    
    var getBodyPressure: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
    
    def getBodyRestitution(impostor: PhysicsImpostor): Double = js.native
    
    var getBodyStiffness: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
    
    var getBodyVelocityIterations: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
    
    def getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3): Unit = js.native
    
    def getLinearVelocity(impostor: PhysicsImpostor): Nullable[Vector3] = js.native
    
    def getRadius(impostor: PhysicsImpostor): Double = js.native
    
    def getTimeStep(): Double = js.native
    
    def isSupported(): Boolean = js.native
    
    var name: String = js.native
    
    def raycast(from: Vector3, to: Vector3): PhysicsRaycastResult = js.native
    
    def removeJoint(joint: PhysicsImpostorJoint): Unit = js.native
    
    def removePhysicsBody(impostor: PhysicsImpostor): Unit = js.native
    
    def setAngularVelocity(impostor: PhysicsImpostor, velocity: Nullable[Vector3]): Unit = js.native
    
    def setBodyFriction(impostor: PhysicsImpostor, friction: Double): Unit = js.native
    
    def setBodyMass(impostor: PhysicsImpostor, mass: Double): Unit = js.native
    
    var setBodyPositionIterations: js.UndefOr[
        js.Function2[/* impostor */ PhysicsImpostor, /* positionIterations */ Double, Unit]
      ] = js.native
    
    var setBodyPressure: js.UndefOr[js.Function2[/* impostor */ PhysicsImpostor, /* pressure */ Double, Unit]] = js.native
    
    def setBodyRestitution(impostor: PhysicsImpostor, restitution: Double): Unit = js.native
    
    var setBodyStiffness: js.UndefOr[js.Function2[/* impostor */ PhysicsImpostor, /* stiffness */ Double, Unit]] = js.native
    
    var setBodyVelocityIterations: js.UndefOr[
        js.Function2[/* impostor */ PhysicsImpostor, /* velocityIterations */ Double, Unit]
      ] = js.native
    
    def setGravity(gravity: Vector3): Unit = js.native
    
    def setLimit(joint: IMotorEnabledJoint, upperLimit: Double): Unit = js.native
    def setLimit(
      joint: IMotorEnabledJoint,
      upperLimit: Double,
      lowerLimit: js.UndefOr[scala.Nothing],
      motorIndex: Double
    ): Unit = js.native
    def setLimit(joint: IMotorEnabledJoint, upperLimit: Double, lowerLimit: Double): Unit = js.native
    def setLimit(joint: IMotorEnabledJoint, upperLimit: Double, lowerLimit: Double, motorIndex: Double): Unit = js.native
    
    def setLinearVelocity(impostor: PhysicsImpostor, velocity: Nullable[Vector3]): Unit = js.native
    
    def setMotor(joint: IMotorEnabledJoint, speed: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: js.UndefOr[scala.Nothing], motorIndex: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: Double, motorIndex: Double): Unit = js.native
    
    def setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion): Unit = js.native
    
    def setTimeStep(timeStep: Double): Unit = js.native
    
    def setTransformationFromPhysicsBody(impostor: PhysicsImpostor): Unit = js.native
    
    def sleepBody(impostor: PhysicsImpostor): Unit = js.native
    
    def syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor): Unit = js.native
    
    def updateDistanceJoint(joint: PhysicsJoint, maxDistance: Double): Unit = js.native
    def updateDistanceJoint(joint: PhysicsJoint, maxDistance: Double, minDistance: Double): Unit = js.native
    
    def wakeUpBody(impostor: PhysicsImpostor): Unit = js.native
    
    var world: js.Any = js.native
  }
  
  @js.native
  trait PhysicsImpostorJoint extends StObject {
    
    /** Defines the impostor that is connected to the main impostor using this joint */
    var connectedImpostor: PhysicsImpostor = js.native
    
    /** Defines the joint itself */
    var joint: PhysicsJoint = js.native
    
    /** Defines the main impostor to which the joint is linked */
    var mainImpostor: PhysicsImpostor = js.native
  }
  object PhysicsImpostorJoint {
    
    @scala.inline
    def apply(connectedImpostor: PhysicsImpostor, joint: PhysicsJoint, mainImpostor: PhysicsImpostor): PhysicsImpostorJoint = {
      val __obj = js.Dynamic.literal(connectedImpostor = connectedImpostor.asInstanceOf[js.Any], joint = joint.asInstanceOf[js.Any], mainImpostor = mainImpostor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsImpostorJoint]
    }
    
    @scala.inline
    implicit class PhysicsImpostorJointMutableBuilder[Self <: PhysicsImpostorJoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectedImpostor(value: PhysicsImpostor): Self = StObject.set(x, "connectedImpostor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoint(value: PhysicsJoint): Self = StObject.set(x, "joint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainImpostor(value: PhysicsImpostor): Self = StObject.set(x, "mainImpostor", value.asInstanceOf[js.Any])
    }
  }
}
