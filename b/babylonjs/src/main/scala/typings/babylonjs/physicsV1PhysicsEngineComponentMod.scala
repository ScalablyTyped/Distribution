package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.physicsV1PhysicsImpostorMod.PhysicsImpostor
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsV1PhysicsEngineComponentMod {
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    /**
      *
      */
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
        * @see https://doc.babylonjs.com/features/featuresDeepDive/physics/usingPhysicsEngine
        */
      def applyImpulse(force: Vector3, contactPoint: Vector3): AbstractMesh = js.native
      
      /**
        * Gets the current physics impostor
        * @see https://doc.babylonjs.com/features/featuresDeepDive/physics
        * @returns a physics impostor or null
        */
      def getPhysicsImpostor(): Nullable[PhysicsImpostor] = js.native
      
      /**
        * Gets or sets impostor used for physic simulation
        * @see https://doc.babylonjs.com/features/featuresDeepDive/physics
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
}
