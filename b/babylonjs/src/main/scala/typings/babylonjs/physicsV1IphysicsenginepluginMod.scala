package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.physicsPhysicsRaycastResultMod.PhysicsRaycastResult
import typings.babylonjs.physicsV1PhysicsImpostorMod.PhysicsImpostor
import typings.babylonjs.physicsV1PhysicsJointMod.IMotorEnabledJoint
import typings.babylonjs.physicsV1PhysicsJointMod.PhysicsJoint
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsV1IphysicsenginepluginMod {
  
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
    
    def getPluginVersion(): Double = js.native
    
    def getRadius(impostor: PhysicsImpostor): Double = js.native
    
    def getTimeStep(): Double = js.native
    
    def isSupported(): Boolean = js.native
    
    /**
      *
      */
    var name: String = js.native
    
    def raycast(from: Vector3, to: Vector3): PhysicsRaycastResult = js.native
    
    def raycastToRef(from: Vector3, to: Vector3, result: PhysicsRaycastResult): Unit = js.native
    
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
    def setLimit(joint: IMotorEnabledJoint, upperLimit: Double, lowerLimit: Double): Unit = js.native
    def setLimit(joint: IMotorEnabledJoint, upperLimit: Double, lowerLimit: Double, motorIndex: Double): Unit = js.native
    def setLimit(joint: IMotorEnabledJoint, upperLimit: Double, lowerLimit: Unit, motorIndex: Double): Unit = js.native
    
    def setLinearVelocity(impostor: PhysicsImpostor, velocity: Nullable[Vector3]): Unit = js.native
    
    def setMotor(joint: IMotorEnabledJoint, speed: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: Double, motorIndex: Double): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: Unit, motorIndex: Double): Unit = js.native
    
    def setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion): Unit = js.native
    
    def setTimeStep(timeStep: Double): Unit = js.native
    
    def setTransformationFromPhysicsBody(impostor: PhysicsImpostor): Unit = js.native
    
    def sleepBody(impostor: PhysicsImpostor): Unit = js.native
    
    def syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor): Unit = js.native
    
    def updateDistanceJoint(joint: PhysicsJoint, maxDistance: Double): Unit = js.native
    def updateDistanceJoint(joint: PhysicsJoint, maxDistance: Double, minDistance: Double): Unit = js.native
    
    def wakeUpBody(impostor: PhysicsImpostor): Unit = js.native
    
    /**
      *
      */
    var world: Any = js.native
  }
  
  trait PhysicsImpostorJoint extends StObject {
    
    /** Defines the impostor that is connected to the main impostor using this joint */
    var connectedImpostor: PhysicsImpostor
    
    /** Defines the joint itself */
    var joint: PhysicsJoint
    
    /** Defines the main impostor to which the joint is linked */
    var mainImpostor: PhysicsImpostor
  }
  object PhysicsImpostorJoint {
    
    inline def apply(connectedImpostor: PhysicsImpostor, joint: PhysicsJoint, mainImpostor: PhysicsImpostor): PhysicsImpostorJoint = {
      val __obj = js.Dynamic.literal(connectedImpostor = connectedImpostor.asInstanceOf[js.Any], joint = joint.asInstanceOf[js.Any], mainImpostor = mainImpostor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicsImpostorJoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhysicsImpostorJoint] (val x: Self) extends AnyVal {
      
      inline def setConnectedImpostor(value: PhysicsImpostor): Self = StObject.set(x, "connectedImpostor", value.asInstanceOf[js.Any])
      
      inline def setJoint(value: PhysicsJoint): Self = StObject.set(x, "joint", value.asInstanceOf[js.Any])
      
      inline def setMainImpostor(value: PhysicsImpostor): Self = StObject.set(x, "mainImpostor", value.asInstanceOf[js.Any])
    }
  }
}
