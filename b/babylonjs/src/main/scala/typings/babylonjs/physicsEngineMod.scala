package typings.babylonjs

import typings.babylonjs.iphysicsengineMod.IPhysicsEngine
import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsEngineMod {
  
  @JSImport("babylonjs/Physics/physicsEngine", "PhysicsEngine")
  @js.native
  class PhysicsEngine protected () extends IPhysicsEngine {
    /**
      * Creates a new Physics Engine
      * @param gravity defines the gravity vector used by the simulation
      * @param _physicsPlugin defines the plugin to use (CannonJS by default)
      */
    def this(gravity: Nullable[Vector3]) = this()
    def this(gravity: Nullable[Vector3], _physicsPlugin: IPhysicsEnginePlugin) = this()
    
    var _impostors: js.Any = js.native
    
    var _joints: js.Any = js.native
    
    var _physicsPlugin: js.Any = js.native
    
    var _subTimeStep: js.Any = js.native
    
    /**
      * Set the sub time step of the physics engine.
      * Default is 0 meaning there is no sub steps
      * To increase physics resolution precision, set a small value (like 1 ms)
      * @param subTimeStep defines the new sub timestep used for physics resolution.
      */
    def setSubTimeStep(): Unit = js.native
    
    /**
      * Set the time step of the physics engine.
      * Default is 1/60.
      * To slow it down, enter 1/600 for example.
      * To speed it up, 1/30
      * @param newTimeStep defines the new timestep to apply to this world.
      */
    def setTimeStep(): Unit = js.native
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
    @JSImport("babylonjs/Physics/physicsEngine", "PhysicsEngine.DefaultPluginFactory")
    @js.native
    def DefaultPluginFactory(): IPhysicsEnginePlugin = js.native
    
    /**
      * Global value used to control the smallest number supported by the simulation
      */
    @JSImport("babylonjs/Physics/physicsEngine", "PhysicsEngine.Epsilon")
    @js.native
    def Epsilon: Double = js.native
    @scala.inline
    def Epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Epsilon")(x.asInstanceOf[js.Any])
  }
}
