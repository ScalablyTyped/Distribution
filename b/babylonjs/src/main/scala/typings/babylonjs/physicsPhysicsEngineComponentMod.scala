package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.physicsIphysicsengineMod.IPhysicsEngine
import typings.babylonjs.physicsIphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.physicsPhysicsImpostorMod.PhysicsImpostor
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsPhysicsEngineComponentMod {
  
  @JSImport("babylonjs/Physics/physicsEngineComponent", "PhysicsEngineSceneComponent")
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
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /** @internal */
      var _disposePhysicsObserver: Nullable[Observer[Node]] = js.native
      
      /** @internal */
      var _physicsImpostor: Nullable[PhysicsImpostor] = js.native
      
      /** Apply a physic impulse to the mesh
        * @param force defines the force to apply
        * @param contactPoint defines where to apply the force
        * @returns the current mesh
        * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
        */
      def applyImpulse(force: Vector3, contactPoint: Vector3): AbstractMesh = js.native
      
      /**
        * Gets the current physics impostor
        * @see https://doc.babylonjs.com/features/physics_engine
        * @returns a physics impostor or null
        */
      def getPhysicsImpostor(): Nullable[PhysicsImpostor] = js.native
      
      /**
        * Gets or sets impostor used for physic simulation
        * @see https://doc.babylonjs.com/features/physics_engine
        */
      var physicsImpostor: Nullable[PhysicsImpostor] = js.native
      
      /**
        * Creates a physic joint between two meshes
        * @param otherMesh defines the other mesh to use
        * @param pivot1 defines the pivot to use on this mesh
        * @param pivot2 defines the pivot to use on the other mesh
        * @param options defines additional options (can be plugin dependent)
        * @returns the current mesh
        * @see https://www.babylonjs-playground.com/#0BS5U0#0
        */
      def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3): AbstractMesh = js.native
      def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: Any): AbstractMesh = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
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
      var onAfterPhysicsObservable: Observable[
            typings.babylonjs.physicsPhysicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene
          ] = js.native
      
      /**
        * An event triggered when physic simulation is about to be run
        */
      var onBeforePhysicsObservable: Observable[
            typings.babylonjs.physicsPhysicsEngineComponentMod.babylonjsSceneAugmentingMod.Scene
          ] = js.native
    }
  }
}
