package typings.babylonjs

import typings.babylonjs.collisionsColliderMod.Collider
import typings.babylonjs.cullingOctreesOctreeMod.Octree
import typings.babylonjs.cullingRayMod.Ray
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.miscSmartArrayMod.ISmartArrayLike
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cullingOctreesOctreeSceneComponentMod {
  
  @JSImport("babylonjs/Culling/Octrees/octreeSceneComponent", "OctreeSceneComponent")
  @js.native
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  open class OctreeSceneComponent () extends StObject {
    def this(scene: Scene) = this()
    
    /* private */ var _tempRay: Any = js.native
    
    /**
      * Indicates if the meshes have been checked to make sure they are isEnabled()
      */
    val checksIsEnabled: Boolean = js.native
    
    /**
      * Disposes the component and the associated resources.
      */
    def dispose(): Unit = js.native
    
    /**
      * Return the list of active meshes
      * @returns the list of active meshes
      */
    def getActiveMeshCandidates(): ISmartArrayLike[AbstractMesh] = js.native
    
    /**
      * Return the list of active sub meshes
      * @param mesh The mesh to get the candidates sub meshes from
      * @returns the list of active sub meshes
      */
    def getActiveSubMeshCandidates(mesh: AbstractMesh): ISmartArrayLike[SubMesh] = js.native
    
    /**
      * Return the list of sub meshes colliding with a collider
      * @param mesh defines the mesh to find the submesh for
      * @param collider defines the collider to evaluate the collision against
      * @returns the list of colliding sub meshes
      */
    def getCollidingSubMeshCandidates(mesh: AbstractMesh, collider: Collider): ISmartArrayLike[SubMesh] = js.native
    
    /**
      * Return the list of sub meshes intersecting with a given local ray
      * @param mesh defines the mesh to find the submesh for
      * @param localRay defines the ray in local space
      * @returns the list of intersecting sub meshes
      */
    def getIntersectingSubMeshCandidates(mesh: AbstractMesh, localRay: Ray): ISmartArrayLike[SubMesh] = js.native
    
    /**
      * The component name help to identify the component in the list of scene components.
      */
    val name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    def rebuild(): Unit = js.native
    
    /**
      * Registers the component in a given scene
      */
    def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    var scene: Scene = js.native
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /**
        * @internal
        * Backing Field
        */
      var _submeshesOctree: Octree[SubMesh] = js.native
      
      /**
        * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
        * Please note that you must have a decent number of submeshes to get performance improvements when using an octree
        * @param maxCapacity defines the maximum size of each block (64 by default)
        * @param maxDepth defines the maximum depth to use (no more than 2 levels by default)
        * @returns the new octree
        * @see https://www.babylonjs-playground.com/#NA4OQ#12
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        */
      def createOrUpdateSubmeshesOctree(): Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: Double): Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: Double, maxDepth: Double): Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: Unit, maxDepth: Double): Octree[SubMesh] = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /**
        * @internal
        * Backing Filed
        */
      var _selectionOctree: Octree[AbstractMesh] = js.native
      
      /**
        * Creates or updates the octree used to boost selection (picking)
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        * @param maxCapacity defines the maximum capacity per leaf
        * @param maxDepth defines the maximum depth of the octree
        * @returns an octree of AbstractMesh
        */
      def createOrUpdateSelectionOctree(): Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: Double): Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: Double, maxDepth: Double): Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: Unit, maxDepth: Double): Octree[AbstractMesh] = js.native
      
      /**
        * Gets the octree used to boost mesh selection (picking)
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        */
      var selectionOctree: Octree[AbstractMesh] = js.native
    }
  }
}
