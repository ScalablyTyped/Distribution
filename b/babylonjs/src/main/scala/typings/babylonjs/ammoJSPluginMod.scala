package typings.babylonjs

import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import typings.babylonjs.physicsJointMod.IMotorEnabledJoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ammoJSPluginMod {
  
  @JSImport("babylonjs/Physics/Plugins/ammoJSPlugin", "AmmoJSPlugin")
  @js.native
  /**
    * Initializes the ammoJS plugin
    * @param _useDeltaForWorldStep if the time between frames should be used when calculating physics steps (Default: true)
    * @param ammoInjection can be used to inject your own ammo reference
    * @param overlappingPairCache can be used to specify your own overlapping pair cache
    */
  open class AmmoJSPlugin ()
    extends StObject
       with IPhysicsEnginePlugin {
    def this(_useDeltaForWorldStep: Boolean) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Unit, ammoInjection: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: Any, overlappingPairCache: Any) = this()
    def this(_useDeltaForWorldStep: Boolean, ammoInjection: Unit, overlappingPairCache: Any) = this()
    def this(_useDeltaForWorldStep: Unit, ammoInjection: Any, overlappingPairCache: Any) = this()
    def this(_useDeltaForWorldStep: Unit, ammoInjection: Unit, overlappingPairCache: Any) = this()
    
    /* private */ var _addHullVerts: Any = js.native
    
    /* private */ var _addMeshVerts: Any = js.native
    
    /**
      * Update babylon mesh to match physics world object
      * @param impostor imposter to match
      */
    /* private */ var _afterSoftStep: Any = js.native
    
    /* private */ var _collisionConfiguration: Any = js.native
    
    /**
      * Create cloth for an impostor
      * @param impostor to create the softbody for
      */
    /* private */ var _createCloth: Any = js.native
    
    /**
      * Create a custom physics impostor shape using the plugin's onCreateCustomShape handler
      * @param impostor to create the custom physics shape for
      */
    /* private */ var _createCustom: Any = js.native
    
    /**
      * Create rope for an impostor
      * @param impostor to create the softbody for
      */
    /* private */ var _createRope: Any = js.native
    
    /* private */ var _createShape: Any = js.native
    
    /**
      * Create an impostor's soft body
      * @param impostor to create the softbody for
      */
    /* private */ var _createSoftbody: Any = js.native
    
    /* private */ var _dispatcher: Any = js.native
    
    /* private */ var _fixedTimeStep: Any = js.native
    
    /* private */ var _isImpostorInContact: Any = js.native
    
    /* private */ var _isImpostorPairInContact: Any = js.native
    
    /* private */ var _maxSteps: Any = js.native
    
    /* private */ var _overlappingPairCache: Any = js.native
    
    /* private */ var _raycastResult: Any = js.native
    
    /**
      * Update babylon mesh vertices vertices to match physics world softbody or cloth
      * @param impostor imposter to match
      */
    /* private */ var _ropeStep: Any = js.native
    
    /* private */ var _softBodySolver: Any = js.native
    
    /**
      * Initialise the soft body vertices to match its object's (mesh) vertices
      * Softbody vertices (nodes) are in world space and to match this
      * The object's position and rotation is set to zero and so its vertices are also then set in world space
      * @param impostor to create the softbody for
      */
    /* private */ var _softVertexData: Any = js.native
    
    /**
      * Update babylon mesh vertices vertices to match physics world softbody or cloth
      * @param impostor imposter to match
      */
    /* private */ var _softbodyOrClothStep: Any = js.native
    
    /* private */ var _solver: Any = js.native
    
    /* private */ var _stepSimulation: Any = js.native
    
    /* private */ var _timeStep: Any = js.native
    
    /* private */ var _tmpAmmoConcreteContactResultCallback: Any = js.native
    
    /* private */ var _tmpAmmoQuaternion: Any = js.native
    
    /* private */ var _tmpAmmoTransform: Any = js.native
    
    /* private */ var _tmpAmmoVectorA: Any = js.native
    
    /* private */ var _tmpAmmoVectorB: Any = js.native
    
    /* private */ var _tmpAmmoVectorC: Any = js.native
    
    /* private */ var _tmpAmmoVectorD: Any = js.native
    
    /* private */ var _tmpAmmoVectorRCA: Any = js.native
    
    /* private */ var _tmpAmmoVectorRCB: Any = js.native
    
    /* private */ var _tmpContactCallbackResult: Any = js.native
    
    /* private */ var _tmpContactDistance: Any = js.native
    
    /* private */ var _tmpContactImpulse: Any = js.native
    
    /* private */ var _tmpContactNormal: Any = js.native
    
    /* private */ var _tmpContactPoint: Any = js.native
    
    /* private */ var _tmpMatrix: Any = js.native
    
    /* private */ var _tmpQuaternion: Any = js.native
    
    /* private */ var _tmpVec3: Any = js.native
    
    /* private */ var _useDeltaForWorldStep: Any = js.native
    
    /**
      * Append an anchor to a cloth object
      * @param impostor is the cloth impostor to add anchor to
      * @param otherImpostor is the rigid impostor to anchor to
      * @param width ratio across width from 0 to 1
      * @param height ratio up height from 0 to 1
      * @param influence the elasticity between cloth impostor and anchor from 0, very stretchy to 1, little stretch
      * @param noCollisionBetweenLinkedBodies when true collisions between soft impostor and anchor are ignored; default false
      */
    @JSName("appendAnchor")
    def appendAnchor_MAmmoJSPlugin(impostor: PhysicsImpostor, otherImpostor: PhysicsImpostor, width: Double, height: Double): Unit = js.native
    @JSName("appendAnchor")
    def appendAnchor_MAmmoJSPlugin(
      impostor: PhysicsImpostor,
      otherImpostor: PhysicsImpostor,
      width: Double,
      height: Double,
      influence: Double
    ): Unit = js.native
    @JSName("appendAnchor")
    def appendAnchor_MAmmoJSPlugin(
      impostor: PhysicsImpostor,
      otherImpostor: PhysicsImpostor,
      width: Double,
      height: Double,
      influence: Double,
      noCollisionBetweenLinkedBodies: Boolean
    ): Unit = js.native
    @JSName("appendAnchor")
    def appendAnchor_MAmmoJSPlugin(
      impostor: PhysicsImpostor,
      otherImpostor: PhysicsImpostor,
      width: Double,
      height: Double,
      influence: Unit,
      noCollisionBetweenLinkedBodies: Boolean
    ): Unit = js.native
    
    /**
      * Append an hook to a rope object
      * @param impostor is the rope impostor to add hook to
      * @param otherImpostor is the rigid impostor to hook to
      * @param length ratio along the rope from 0 to 1
      * @param influence the elasticity between soft impostor and anchor from 0, very stretchy to 1, little stretch
      * @param noCollisionBetweenLinkedBodies when true collisions between soft impostor and anchor are ignored; default false
      */
    @JSName("appendHook")
    def appendHook_MAmmoJSPlugin(impostor: PhysicsImpostor, otherImpostor: PhysicsImpostor, length: Double): Unit = js.native
    @JSName("appendHook")
    def appendHook_MAmmoJSPlugin(impostor: PhysicsImpostor, otherImpostor: PhysicsImpostor, length: Double, influence: Double): Unit = js.native
    @JSName("appendHook")
    def appendHook_MAmmoJSPlugin(
      impostor: PhysicsImpostor,
      otherImpostor: PhysicsImpostor,
      length: Double,
      influence: Double,
      noCollisionBetweenLinkedBodies: Boolean
    ): Unit = js.native
    @JSName("appendHook")
    def appendHook_MAmmoJSPlugin(
      impostor: PhysicsImpostor,
      otherImpostor: PhysicsImpostor,
      length: Double,
      influence: Unit,
      noCollisionBetweenLinkedBodies: Boolean
    ): Unit = js.native
    
    /**
      * Reference to the Ammo library
      */
    var bjsAMMO: Any = js.native
    
    /**
      * Gets positionIterations of the impostor
      * @param impostor impostor to get position iterations from
      * @returns positionIterations value
      */
    @JSName("getBodyPositionIterations")
    def getBodyPositionIterations_MAmmoJSPlugin(impostor: PhysicsImpostor): Double = js.native
    
    /**
      * Gets pressure inside the impostor
      * @param impostor impostor to get pressure from
      * @returns pressure value
      */
    @JSName("getBodyPressure")
    def getBodyPressure_MAmmoJSPlugin(impostor: PhysicsImpostor): Double = js.native
    
    /**
      * Gets stiffness of the impostor
      * @param impostor impostor to get stiffness from
      * @returns pressure value
      */
    @JSName("getBodyStiffness")
    def getBodyStiffness_MAmmoJSPlugin(impostor: PhysicsImpostor): Double = js.native
    
    /**
      * Gets velocityIterations of the impostor
      * @param impostor impostor to get velocity iterations from
      * @returns velocityIterations value
      */
    @JSName("getBodyVelocityIterations")
    def getBodyVelocityIterations_MAmmoJSPlugin(impostor: PhysicsImpostor): Double = js.native
    
    /**
      * The create custom convex hull impostor handler function to support building custom convex hull impostor vertex data
      */
    def onCreateCustomConvexHullImpostor(impostor: PhysicsImpostor): Any = js.native
    
    /**
      * The create custom mesh impostor handler function to support building custom mesh impostor vertex data
      */
    def onCreateCustomMeshImpostor(impostor: PhysicsImpostor): Any = js.native
    
    /**
      * The create custom shape handler function to be called when using BABYLON.PhysicsImposter.CustomImpostor
      */
    def onCreateCustomShape(impostor: PhysicsImpostor): Any = js.native
    
    /**
      * Sets positionIterations of the impostor
      * @param impostor impostor to set position on
      * @param positionIterations positionIterations value
      */
    @JSName("setBodyPositionIterations")
    def setBodyPositionIterations_MAmmoJSPlugin(impostor: PhysicsImpostor, positionIterations: Double): Unit = js.native
    
    /**
      * Sets pressure inside a soft body impostor
      * Cloth and rope must remain 0 pressure
      * @param impostor impostor to set pressure on
      * @param pressure pressure value
      */
    @JSName("setBodyPressure")
    def setBodyPressure_MAmmoJSPlugin(impostor: PhysicsImpostor, pressure: Double): Unit = js.native
    
    /**
      * Sets stiffness of the impostor
      * @param impostor impostor to set stiffness on
      * @param stiffness stiffness value from 0 to 1
      */
    @JSName("setBodyStiffness")
    def setBodyStiffness_MAmmoJSPlugin(impostor: PhysicsImpostor, stiffness: Double): Unit = js.native
    
    /**
      * Sets velocityIterations of the impostor
      * @param impostor impostor to set velocity iterations on
      * @param velocityIterations velocityIterations value
      */
    @JSName("setBodyVelocityIterations")
    def setBodyVelocityIterations_MAmmoJSPlugin(impostor: PhysicsImpostor, velocityIterations: Double): Unit = js.native
    
    /**
      * Increment to step forward in the physics engine (If timeStep is set to 1/60 and fixedTimeStep is set to 1/120 the physics engine should run 2 steps per frame) (Default: 1/60)
      * @param fixedTimeStep fixedTimeStep to use in seconds
      */
    def setFixedTimeStep(fixedTimeStep: Double): Unit = js.native
    
    /**
      * Sets the motors limit
      */
    def setLimit(): Unit = js.native
    
    /**
      * Sets the maximum number of steps by the physics engine per frame (Default: 5)
      * @param maxSteps the maximum number of steps by the physics engine per frame
      */
    def setMaxSteps(maxSteps: Double): Unit = js.native
    
    /**
      * Sets a motor on the joint
      * @param joint joint to set motor on
      * @param speed speed of the motor
      * @param maxForce maximum force of the motor
      */
    def setMotor(joint: IMotorEnabledJoint): Unit = js.native
    def setMotor(joint: IMotorEnabledJoint, speed: Unit, maxForce: Double): Unit = js.native
    
    /**
      * Updates the distance parameters of the joint
      */
    def updateDistanceJoint(): Unit = js.native
  }
  /* static members */
  object AmmoJSPlugin {
    
    @JSImport("babylonjs/Physics/Plugins/ammoJSPlugin", "AmmoJSPlugin._DISABLE_COLLISION_FLAG")
    @js.native
    val _DISABLE_COLLISION_FLAG: Any = js.native
    
    @JSImport("babylonjs/Physics/Plugins/ammoJSPlugin", "AmmoJSPlugin._DISABLE_DEACTIVATION_FLAG")
    @js.native
    val _DISABLE_DEACTIVATION_FLAG: Any = js.native
    
    @JSImport("babylonjs/Physics/Plugins/ammoJSPlugin", "AmmoJSPlugin._KINEMATIC_FLAG")
    @js.native
    val _KINEMATIC_FLAG: Any = js.native
  }
}
