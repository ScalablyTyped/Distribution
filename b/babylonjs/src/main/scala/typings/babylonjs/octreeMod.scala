package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.octreeBlockMod.OctreeBlock
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.smartArrayMod.SmartArray
import typings.babylonjs.subMeshMod.SubMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Culling/Octrees/octree", JSImport.Namespace)
@js.native
object octreeMod extends js.Object {
  @js.native
  class Octree[T] protected () extends js.Object {
    /**
      * Creates a octree
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      * @param creationFunc function to be used to instatiate the octree
      * @param maxBlockCapacity defines the maximum number of meshes you want on your octree's leaves (default: 64)
      * @param maxDepth defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.)
      */
    def this(creationFunc: js.Function2[/* entry */ T, /* block */ OctreeBlock[T], Unit]) = this()
    def this(
      creationFunc: js.Function2[/* entry */ T, /* block */ OctreeBlock[T], Unit],
      maxBlockCapacity: Double
    ) = this()
    def this(
      creationFunc: js.Function2[/* entry */ T, /* block */ OctreeBlock[T], Unit],
      maxBlockCapacity: Double,
      /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
    maxDepth: Double
    ) = this()
    var _creationFunc: js.Any = js.native
    var _maxBlockCapacity: js.Any = js.native
    var _selectionContent: js.Any = js.native
    /**
      * Blocks within the octree containing objects
      */
    var blocks: js.Array[OctreeBlock[T]] = js.native
    /**
      * Content stored in the octree
      */
    var dynamicContent: js.Array[T] = js.native
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
    var maxDepth: Double = js.native
    /**
      * Adds a mesh to the octree
      * @param entry Mesh to add to the octree
      */
    def addMesh(entry: T): Unit = js.native
    /**
      * Test if the octree intersect with the given bounding sphere and if yes, then add its content to the selection array
      * @param sphereCenter defines the bounding sphere center
      * @param sphereRadius defines the bounding sphere radius
      * @param allowDuplicate defines if the selection array can contains duplicated entries
      * @returns an array of objects that intersect the sphere
      */
    def intersects(sphereCenter: Vector3, sphereRadius: Double): SmartArray[T] = js.native
    def intersects(sphereCenter: Vector3, sphereRadius: Double, allowDuplicate: Boolean): SmartArray[T] = js.native
    /**
      * Test if the octree intersect with the given ray and if yes, then add its content to resulting array
      * @param ray defines the ray to test with
      * @returns array of intersected objects
      */
    def intersectsRay(ray: Ray): SmartArray[T] = js.native
    /**
      * Remove an element from the octree
      * @param entry defines the element to remove
      */
    def removeMesh(entry: T): Unit = js.native
    /**
      * Selects an array of meshes within the frustum
      * @param frustumPlanes The frustum planes to use which will select all meshes within it
      * @param allowDuplicate If duplicate objects are allowed in the resulting object array
      * @returns array of meshes within the frustum
      */
    def select(frustumPlanes: js.Array[Plane]): SmartArray[T] = js.native
    def select(frustumPlanes: js.Array[Plane], allowDuplicate: Boolean): SmartArray[T] = js.native
    /**
      * Updates the octree by adding blocks for the passed in meshes within the min and max world parameters
      * @param worldMin worldMin for the octree blocks var blockSize = new Vector3((worldMax.x - worldMin.x) / 2, (worldMax.y - worldMin.y) / 2, (worldMax.z - worldMin.z) / 2);
      * @param worldMax worldMax for the octree blocks var blockSize = new Vector3((worldMax.x - worldMin.x) / 2, (worldMax.y - worldMin.y) / 2, (worldMax.z - worldMin.z) / 2);
      * @param entries meshes to be added to the octree blocks
      */
    def update(worldMin: Vector3, worldMax: Vector3, entries: js.Array[T]): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Octree extends js.Object {
    /**
      * Adds a mesh into the octree block if it intersects the block
      */
    def CreationFuncForMeshes(entry: AbstractMesh, block: OctreeBlock[AbstractMesh]): Unit = js.native
    /**
      * Adds a submesh into the octree block if it intersects the block
      */
    def CreationFuncForSubMeshes(entry: SubMesh, block: OctreeBlock[SubMesh]): Unit = js.native
  }
  
}

