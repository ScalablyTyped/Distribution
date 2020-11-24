package typings.babylonjs.physicsIndexMod

import typings.babylonjs.iphysicsengineMod.IPhysicsEngine
import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Physics/index", "babylonjs/scene")
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  
  @js.native
  trait Scene extends js.Object {
    
    /** @hidden (Backing field) */
    var _physicsEngine: Nullable[IPhysicsEngine] = js.native
    
    /** @hidden */
    var _physicsTimeAccumulator: Double = js.native
    
    /**
      * Deletes a physics compound impostor
      * @param compound defines the compound to delete
      */
    def deleteCompoundImpostor(compound: js.Any): Unit = js.native
    
    /**
      * Disables and disposes the physics engine associated with the scene
      */
    def disablePhysicsEngine(): Unit = js.native
    
    /**
      * Enables physics to the current scene
      * @param gravity defines the scene's gravity for the physics engine
      * @param plugin defines the physics engine to be used. defaults to OimoJS.
      * @return a boolean indicating if the physics engine was initialized
      */
    def enablePhysics(gravity: Nullable[Vector3]): Boolean = js.native
    def enablePhysics(gravity: Nullable[Vector3], plugin: IPhysicsEnginePlugin): Boolean = js.native
    
    /**
      * Gets the current physics engine
      * @returns a IPhysicsEngine or null if none attached
      */
    def getPhysicsEngine(): Nullable[IPhysicsEngine] = js.native
    
    /**
      * Gets a boolean indicating if there is an active physics engine
      * @returns a boolean indicating if there is an active physics engine
      */
    def isPhysicsEnabled(): Boolean = js.native
    
    /**
      * An event triggered when physic simulation has been done
      */
    var onAfterPhysicsObservable: Observable[typings.babylonjs.physicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene] = js.native
    
    /**
      * An event triggered when physic simulation is about to be run
      */
    var onBeforePhysicsObservable: Observable[typings.babylonjs.physicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene] = js.native
  }
}
