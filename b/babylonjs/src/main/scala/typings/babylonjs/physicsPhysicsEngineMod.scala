package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.physicsIphysicsengineMod.IPhysicsEngine
import typings.babylonjs.physicsIphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.physicsPhysicsImpostorMod.IPhysicsEnabledObject
import typings.babylonjs.physicsPhysicsImpostorMod.PhysicsImpostor
import typings.babylonjs.physicsPhysicsJointMod.PhysicsJoint
import typings.babylonjs.physicsPhysicsRaycastResultMod.PhysicsRaycastResult
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsPhysicsEngineMod {
  
  @JSImport("babylonjs/Physics/physicsEngine", "PhysicsEngine")
  @js.native
  open class PhysicsEngine protected ()
    extends StObject
       with IPhysicsEngine {
    /**
      * Creates a new Physics Engine
      * @param gravity defines the gravity vector used by the simulation
      * @param _physicsPlugin defines the plugin to use (CannonJS by default)
      */
    def this(gravity: Nullable[Vector3]) = this()
    def this(gravity: Nullable[Vector3], _physicsPlugin: IPhysicsEnginePlugin) = this()
    
    /* private */ var _impostors: Any = js.native
    
    /* private */ var _joints: Any = js.native
    
    /* private */ var _physicsPlugin: Any = js.native
    
    /**
      * Called by the scene. No need to call it.
      * @param delta defines the timespan between frames
      */
    /* CompleteClass */
    override def _step(delta: Double): Unit = js.native
    
    /* private */ var _subTimeStep: Any = js.native
    
    /* private */ var _uniqueIdCounter: Any = js.native
    
    /**
      * Adding a new impostor for the impostor tracking.
      * This will be done by the impostor itself.
      * @param impostor the impostor to add
      */
    /* CompleteClass */
    override def addImpostor(impostor: PhysicsImpostor): Unit = js.native
    
    /**
      * Add a joint to the physics engine
      * @param mainImpostor defines the main impostor to which the joint is added.
      * @param connectedImpostor defines the impostor that is connected to the main impostor using this joint
      * @param joint defines the joint that will connect both impostors.
      */
    /* CompleteClass */
    override def addJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = js.native
    
    /**
      * Release all resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Gets the impostor for a physics enabled object
      * @param object defines the object impersonated by the impostor
      * @returns the PhysicsImpostor or null if not found
      */
    /* CompleteClass */
    override def getImpostorForPhysicsObject(`object`: IPhysicsEnabledObject): Nullable[PhysicsImpostor] = js.native
    
    /**
      * Gets the impostor for a physics body object
      * @param body defines physics body used by the impostor
      * @returns the PhysicsImpostor or null if not found
      */
    /* CompleteClass */
    override def getImpostorWithPhysicsBody(body: Any): Nullable[PhysicsImpostor] = js.native
    
    /**
      * Gets the list of physic impostors
      * @returns an array of PhysicsImpostor
      */
    /* CompleteClass */
    override def getImpostors(): js.Array[PhysicsImpostor] = js.native
    
    /**
      * Gets the current plugin used to run the simulation
      * @returns current plugin
      */
    /* CompleteClass */
    override def getPhysicsPlugin(): IPhysicsEnginePlugin = js.native
    
    /**
      * Gets the name of the current physics plugin
      * @returns the name of the plugin
      */
    /* CompleteClass */
    override def getPhysicsPluginName(): String = js.native
    
    /**
      * Get the sub time step of the physics engine.
      * @returns the current sub time step
      */
    /* CompleteClass */
    override def getSubTimeStep(): Double = js.native
    
    /**
      * Get the time step of the physics engine.
      * @returns the current time step
      */
    /* CompleteClass */
    override def getTimeStep(): Double = js.native
    
    /**
      * Gets the gravity vector used by the simulation
      */
    /* CompleteClass */
    var gravity: Vector3 = js.native
    
    /**
      * Does a raycast in the physics world
      * @param from when should the ray start?
      * @param to when should the ray end?
      * @returns PhysicsRaycastResult
      */
    /* CompleteClass */
    override def raycast(from: Vector3, to: Vector3): PhysicsRaycastResult = js.native
    
    /**
      * Remove an impostor from the engine.
      * This impostor and its mesh will not longer be updated by the physics engine.
      * @param impostor the impostor to remove
      */
    /* CompleteClass */
    override def removeImpostor(impostor: PhysicsImpostor): Unit = js.native
    
    /**
      * Removes a joint from the simulation
      * @param mainImpostor defines the impostor used with the joint
      * @param connectedImpostor defines the other impostor connected to the main one by the joint
      * @param joint defines the joint to remove
      */
    /* CompleteClass */
    override def removeJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = js.native
    
    /**
      * Sets the gravity vector used by the simulation
      * @param gravity defines the gravity vector to use
      */
    /* CompleteClass */
    override def setGravity(gravity: Vector3): Unit = js.native
    
    /**
      * Set the sub time step of the physics engine.
      * Default is 0 meaning there is no sub steps
      * To increase physics resolution precision, set a small value (like 1 ms)
      * @param subTimeStep defines the new sub timestep used for physics resolution.
      */
    def setSubTimeStep(): Unit = js.native
    /**
      * Set the sub time step of the physics engine.
      * Default is 0 meaning there is no sub steps
      * To increase physics resolution precision, set a small value (like 1 ms)
      * @param subTimeStep defines the new sub timestep used for physics resolution.
      */
    /* CompleteClass */
    override def setSubTimeStep(subTimeStep: Double): Unit = js.native
    
    /**
      * Set the time step of the physics engine.
      * Default is 1/60.
      * To slow it down, enter 1/600 for example.
      * To speed it up, 1/30
      * @param newTimeStep defines the new timestep to apply to this world.
      */
    def setTimeStep(): Unit = js.native
    /**
      * Set the time step of the physics engine.
      * Default is 1/60.
      * To slow it down, enter 1/600 for example.
      * To speed it up, 1/30
      * @param newTimeStep the new timestep to apply to this world.
      */
    /* CompleteClass */
    override def setTimeStep(newTimeStep: Double): Unit = js.native
  }
  /* static members */
  object PhysicsEngine {
    
    @JSImport("babylonjs/Physics/physicsEngine", "PhysicsEngine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Factory used to create the default physics plugin.
      * @returns The default physics plugin
      */
    inline def DefaultPluginFactory(): IPhysicsEnginePlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultPluginFactory")().asInstanceOf[IPhysicsEnginePlugin]
    
    /**
      * Global value used to control the smallest number supported by the simulation
      */
    @JSImport("babylonjs/Physics/physicsEngine", "PhysicsEngine.Epsilon")
    @js.native
    def Epsilon: Double = js.native
    inline def Epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Epsilon")(x.asInstanceOf[js.Any])
  }
}
