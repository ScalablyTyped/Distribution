package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.physicsIphysicsengineMod.IPhysicsEngine
import typings.babylonjs.physicsV1IphysicsenginepluginMod.IPhysicsEnginePlugin
import typings.babylonjs.physicsV2IphysicsenginepluginMod.IPhysicsEnginePluginV2
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsJoinedPhysicsEngineComponentMod {
  
  @JSImport("babylonjs/Physics/joinedPhysicsEngineComponent", "PhysicsEngineSceneComponent")
  @js.native
  open class PhysicsEngineSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    /* CompleteClass */
    override def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    /**
      *
      */
    @js.native
    trait Scene extends StObject {
      
      /** @internal (Backing field) */
      var _physicsEngine: Nullable[IPhysicsEngine] = js.native
      
      /** @internal */
      var _physicsTimeAccumulator: Double = js.native
      
      /**
        * Deletes a physics compound impostor
        * @param compound defines the compound to delete
        */
      def deleteCompoundImpostor(compound: Any): Unit = js.native
      
      /**
        * Disables and disposes the physics engine associated with the scene
        */
      def disablePhysicsEngine(): Unit = js.native
      
      /**
        * Enables physics to the current scene
        * @param gravity defines the scene's gravity for the physics engine. defaults to real earth gravity : (0, -9.81, 0)
        * @param plugin defines the physics engine to be used. defaults to CannonJS.
        * @returns a boolean indicating if the physics engine was initialized
        */
      def enablePhysics(): Boolean = js.native
      def enablePhysics(gravity: Unit, plugin: IPhysicsEnginePlugin): Boolean = js.native
      def enablePhysics(gravity: Unit, plugin: IPhysicsEnginePluginV2): Boolean = js.native
      def enablePhysics(gravity: Nullable[Vector3]): Boolean = js.native
      def enablePhysics(gravity: Nullable[Vector3], plugin: IPhysicsEnginePlugin): Boolean = js.native
      def enablePhysics(gravity: Nullable[Vector3], plugin: IPhysicsEnginePluginV2): Boolean = js.native
      
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
      var onAfterPhysicsObservable: Observable[
            typings.babylonjs.physicsJoinedPhysicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene
          ] = js.native
      
      /**
        * An event triggered when physic simulation is about to be run
        */
      var onBeforePhysicsObservable: Observable[
            typings.babylonjs.physicsJoinedPhysicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene
          ] = js.native
    }
  }
}
