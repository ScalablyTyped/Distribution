package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.octreeBlockMod.IOctreeContainer
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.rayMod.TrianglePickingPredicate
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cullingIndexMod {
  
  @JSImport("babylonjs/Culling/index", "BoundingBox")
  @js.native
  open class BoundingBox protected ()
    extends typings.babylonjs.boundingBoxMod.BoundingBox {
    /**
      * Creates a new bounding box
      * @param min defines the minimum vector (in local space)
      * @param max defines the maximum vector (in local space)
      * @param worldMatrix defines the new world matrix
      */
    def this(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]) = this()
    def this(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3], worldMatrix: DeepImmutable[Matrix]) = this()
  }
  /* static members */
  object BoundingBox {
    
    @JSImport("babylonjs/Culling/index", "BoundingBox")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Tests if two bounding boxes are intersections
      * @param box0 defines the first box to test
      * @param box1 defines the second box to test
      * @returns true if there is an intersection
      */
    inline def Intersects(
      box0: DeepImmutable[typings.babylonjs.boundingBoxMod.BoundingBox],
      box1: DeepImmutable[typings.babylonjs.boundingBoxMod.BoundingBox]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Intersects")(box0.asInstanceOf[js.Any], box1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Tests if a bounding box defines by a min/max vectors intersects a sphere
      * @param minPoint defines the minimum vector of the bounding box
      * @param maxPoint defines the maximum vector of the bounding box
      * @param sphereCenter defines the sphere center
      * @param sphereRadius defines the sphere radius
      * @returns true if there is an intersection
      */
    inline def IntersectsSphere(
      minPoint: DeepImmutable[Vector3],
      maxPoint: DeepImmutable[Vector3],
      sphereCenter: DeepImmutable[Vector3],
      sphereRadius: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IntersectsSphere")(minPoint.asInstanceOf[js.Any], maxPoint.asInstanceOf[js.Any], sphereCenter.asInstanceOf[js.Any], sphereRadius.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Tests if a bounding box defined with 8 vectors is entirely inside frustum planes
      * @param boundingVectors defines an array of 8 vectors representing a bounding box
      * @param frustumPlanes defines the frustum planes to test
      * @returns true if there is an inclusion
      */
    inline def IsCompletelyInFrustum(boundingVectors: js.Array[DeepImmutable[Vector3]], frustumPlanes: js.Array[DeepImmutable[Plane]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsCompletelyInFrustum")(boundingVectors.asInstanceOf[js.Any], frustumPlanes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Tests if a bounding box defined with 8 vectors intersects frustum planes
      * @param boundingVectors defines an array of 8 vectors representing a bounding box
      * @param frustumPlanes defines the frustum planes to test
      * @returns true if there is an intersection
      */
    inline def IsInFrustum(boundingVectors: js.Array[DeepImmutable[Vector3]], frustumPlanes: js.Array[DeepImmutable[Plane]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsInFrustum")(boundingVectors.asInstanceOf[js.Any], frustumPlanes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("babylonjs/Culling/index", "BoundingBox._TmpVector3")
    @js.native
    val _TmpVector3: Any = js.native
  }
  
  @JSImport("babylonjs/Culling/index", "BoundingInfo")
  @js.native
  open class BoundingInfo protected ()
    extends typings.babylonjs.boundingInfoMod.BoundingInfo {
    /**
      * Constructs bounding info
      * @param minimum min vector of the bounding box/sphere
      * @param maximum max vector of the bounding box/sphere
      * @param worldMatrix defines the new world matrix
      */
    def this(minimum: DeepImmutable[Vector3], maximum: DeepImmutable[Vector3]) = this()
    def this(
      minimum: DeepImmutable[Vector3],
      maximum: DeepImmutable[Vector3],
      worldMatrix: DeepImmutable[Matrix]
    ) = this()
  }
  /* static members */
  object BoundingInfo {
    
    @JSImport("babylonjs/Culling/index", "BoundingInfo._TmpVector3")
    @js.native
    val _TmpVector3: Any = js.native
  }
  
  @JSImport("babylonjs/Culling/index", "BoundingSphere")
  @js.native
  open class BoundingSphere protected ()
    extends typings.babylonjs.boundingSphereMod.BoundingSphere {
    /**
      * Creates a new bounding sphere
      * @param min defines the minimum vector (in local space)
      * @param max defines the maximum vector (in local space)
      * @param worldMatrix defines the new world matrix
      */
    def this(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]) = this()
    def this(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3], worldMatrix: DeepImmutable[Matrix]) = this()
  }
  /* static members */
  object BoundingSphere {
    
    @JSImport("babylonjs/Culling/index", "BoundingSphere")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a sphere from a center and a radius
      * @param center The center
      * @param radius radius
      * @param matrix Optional worldMatrix
      * @returns The sphere
      */
    inline def CreateFromCenterAndRadius(center: DeepImmutable[Vector3], radius: Double): typings.babylonjs.boundingSphereMod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromCenterAndRadius")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.boundingSphereMod.BoundingSphere]
    inline def CreateFromCenterAndRadius(center: DeepImmutable[Vector3], radius: Double, matrix: DeepImmutable[Matrix]): typings.babylonjs.boundingSphereMod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromCenterAndRadius")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.boundingSphereMod.BoundingSphere]
    
    /**
      * Checks if two sphere intersect
      * @param sphere0 sphere 0
      * @param sphere1 sphere 1
      * @returns true if the spheres intersect
      */
    inline def Intersects(
      sphere0: DeepImmutable[typings.babylonjs.boundingSphereMod.BoundingSphere],
      sphere1: DeepImmutable[typings.babylonjs.boundingSphereMod.BoundingSphere]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Intersects")(sphere0.asInstanceOf[js.Any], sphere1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("babylonjs/Culling/index", "BoundingSphere._TmpVector3")
    @js.native
    val _TmpVector3: Any = js.native
  }
  
  @JSImport("babylonjs/Culling/index", "Octree")
  @js.native
  open class Octree[T] protected ()
    extends typings.babylonjs.octreesIndexMod.Octree[T] {
    /**
      * Creates a octree
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
      * @param creationFunc function to be used to instantiate the octree
      * @param maxBlockCapacity defines the maximum number of meshes you want on your octree's leaves (default: 64)
      * @param maxDepth defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.)
      */
    def this(creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit]) = this()
    def this(
      creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit],
      maxBlockCapacity: Double
    ) = this()
    def this(
      creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit],
      maxBlockCapacity: Double,
      /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
    maxDepth: Double
    ) = this()
    def this(
      creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit],
      maxBlockCapacity: Unit,
      /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
    maxDepth: Double
    ) = this()
  }
  /* static members */
  object Octree {
    
    @JSImport("babylonjs/Culling/index", "Octree")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds a mesh into the octree block if it intersects the block
      * @param entry
      * @param block
      */
    inline def CreationFuncForMeshes(entry: AbstractMesh, block: typings.babylonjs.octreeBlockMod.OctreeBlock[AbstractMesh]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreationFuncForMeshes")(entry.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Adds a submesh into the octree block if it intersects the block
      * @param entry
      * @param block
      */
    inline def CreationFuncForSubMeshes(entry: SubMesh, block: typings.babylonjs.octreeBlockMod.OctreeBlock[SubMesh]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreationFuncForSubMeshes")(entry.asInstanceOf[js.Any], block.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Culling/index", "OctreeBlock")
  @js.native
  open class OctreeBlock[T] protected ()
    extends typings.babylonjs.octreesIndexMod.OctreeBlock[T] {
    /**
      * Creates a new block
      * @param minPoint defines the minimum vector (in world space) of the block's bounding box
      * @param maxPoint defines the maximum vector (in world space) of the block's bounding box
      * @param capacity defines the maximum capacity of this block (if capacity is reached the block will be split into sub blocks)
      * @param depth defines the current depth of this block in the octree
      * @param maxDepth defines the maximal depth allowed (beyond this value, the capacity is ignored)
      * @param creationFunc defines a callback to call when an element is added to the block
      */
    def this(
      minPoint: Vector3,
      maxPoint: Vector3,
      capacity: Double,
      depth: Double,
      maxDepth: Double,
      creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit]
    ) = this()
  }
  /* static members */
  object OctreeBlock {
    
    @JSImport("babylonjs/Culling/index", "OctreeBlock")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _CreateBlocks[T](
      worldMin: Vector3,
      worldMax: Vector3,
      entries: js.Array[T],
      maxBlockCapacity: Double,
      currentDepth: Double,
      maxDepth: Double,
      target: IOctreeContainer[T],
      creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateBlocks")(worldMin.asInstanceOf[js.Any], worldMax.asInstanceOf[js.Any], entries.asInstanceOf[js.Any], maxBlockCapacity.asInstanceOf[js.Any], currentDepth.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any], target.asInstanceOf[js.Any], creationFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Culling/index", "OctreeSceneComponent")
  @js.native
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  open class OctreeSceneComponent ()
    extends typings.babylonjs.octreesIndexMod.OctreeSceneComponent {
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Culling/index", "Ray")
  @js.native
  open class Ray protected ()
    extends typings.babylonjs.rayMod.Ray {
    /**
      * Creates a new ray
      * @param origin origin point
      * @param direction direction
      * @param length length of the ray
      */
    def this(/** origin point */
    origin: Vector3, /** direction */
    direction: Vector3) = this()
    def this(
      /** origin point */
    origin: Vector3,
      /** direction */
    direction: Vector3,
      /** length of the ray */
    length: Double
    ) = this()
  }
  /* static members */
  object Ray {
    
    @JSImport("babylonjs/Culling/index", "Ray")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ray from screen space and viewport
      * @param x position
      * @param y y position
      * @param viewportWidth viewport width
      * @param viewportHeight viewport height
      * @param world world matrix
      * @param view view matrix
      * @param projection projection matrix
      * @returns new ray
      */
    inline def CreateNew(
      x: Double,
      y: Double,
      viewportWidth: Double,
      viewportHeight: Double,
      world: DeepImmutable[Matrix],
      view: DeepImmutable[Matrix],
      projection: DeepImmutable[Matrix]
    ): typings.babylonjs.rayMod.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], viewportWidth.asInstanceOf[js.Any], viewportHeight.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.rayMod.Ray]
    
    /**
      * Function will create a new transformed ray starting from origin and ending at the end point. Ray's length will be set, and ray will be
      * transformed to the given world matrix.
      * @param origin The origin point
      * @param end The end point
      * @param world a matrix to transform the ray to. Default is the identity matrix.
      * @returns the new ray
      */
    inline def CreateNewFromTo(origin: Vector3, end: Vector3): typings.babylonjs.rayMod.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromTo")(origin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.rayMod.Ray]
    inline def CreateNewFromTo(origin: Vector3, end: Vector3, world: DeepImmutable[Matrix]): typings.babylonjs.rayMod.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromTo")(origin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], world.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.rayMod.Ray]
    
    /**
      * Transforms a ray by a matrix
      * @param ray ray to transform
      * @param matrix matrix to apply
      * @returns the resulting new ray
      */
    inline def Transform(ray: DeepImmutable[typings.babylonjs.rayMod.Ray], matrix: DeepImmutable[Matrix]): typings.babylonjs.rayMod.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(ray.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.rayMod.Ray]
    
    /**
      * Transforms a ray by a matrix
      * @param ray ray to transform
      * @param matrix matrix to apply
      * @param result ray to store result in
      */
    inline def TransformToRef(
      ray: DeepImmutable[typings.babylonjs.rayMod.Ray],
      matrix: DeepImmutable[Matrix],
      result: typings.babylonjs.rayMod.Ray
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformToRef")(ray.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a ray with origin and direction of 0,0,0
      * @returns the new ray
      */
    inline def Zero(): typings.babylonjs.rayMod.Ray = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.rayMod.Ray]
    
    @JSImport("babylonjs/Culling/index", "Ray._RayDistant")
    @js.native
    def _RayDistant: Any = js.native
    inline def _RayDistant_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RayDistant")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Culling/index", "Ray._Rayl")
    @js.native
    def _Rayl: Any = js.native
    inline def _Rayl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Rayl")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Culling/index", "Ray._Smallnum")
    @js.native
    def _Smallnum: Any = js.native
    inline def _Smallnum_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Smallnum")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Culling/index", "Ray._TmpVector3")
    @js.native
    val _TmpVector3: Any = js.native
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /**
        * @internal
        * Backing Field
        */
      var _submeshesOctree: typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
      
      /**
        * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
        * Please note that you must have a decent number of submeshes to get performance improvements when using an octree
        * @param maxCapacity defines the maximum size of each block (64 by default)
        * @param maxDepth defines the maximum depth to use (no more than 2 levels by default)
        * @returns the new octree
        * @see https://www.babylonjs-playground.com/#NA4OQ#12
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        */
      def createOrUpdateSubmeshesOctree(): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: Double): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: Double, maxDepth: Double): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: Unit, maxDepth: Double): typings.babylonjs.octreeMod.Octree[SubMesh] = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @internal */
      var _cachedRayForTransform: typings.babylonjs.rayMod.Ray = js.native
      
      /** @internal */
      def _internalMultiPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray]
      ): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]
      ): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: Unit,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[js.Array[PickingInfo]] = js.native
      
      /** @internal */
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray]
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: js.Function1[/* mesh */ AbstractMesh, Boolean]
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
        fastCheck: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
        fastCheck: Boolean,
        onlyBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
        fastCheck: Boolean,
        onlyBoundingInfo: Boolean,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
        fastCheck: Boolean,
        onlyBoundingInfo: Unit,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
        fastCheck: Unit,
        onlyBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
        fastCheck: Unit,
        onlyBoundingInfo: Boolean,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: js.Function1[/* mesh */ AbstractMesh, Boolean],
        fastCheck: Unit,
        onlyBoundingInfo: Unit,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: Unit,
        fastCheck: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: Unit,
        fastCheck: Boolean,
        onlyBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: Unit,
        fastCheck: Boolean,
        onlyBoundingInfo: Boolean,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: Unit,
        fastCheck: Boolean,
        onlyBoundingInfo: Unit,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: Unit,
        fastCheck: Unit,
        onlyBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: Unit,
        fastCheck: Unit,
        onlyBoundingInfo: Boolean,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      def _internalPick(
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        predicate: Unit,
        fastCheck: Unit,
        onlyBoundingInfo: Unit,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      
      /** @internal */
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Boolean,
        onlyBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Boolean,
        onlyBoundingInfo: Boolean,
        trianglePredicate: Unit,
        skipBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Boolean,
        onlyBoundingInfo: Boolean,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Boolean,
        onlyBoundingInfo: Boolean,
        trianglePredicate: TrianglePickingPredicate,
        skipBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Boolean,
        onlyBoundingInfo: Unit,
        trianglePredicate: Unit,
        skipBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Boolean,
        onlyBoundingInfo: Unit,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Boolean,
        onlyBoundingInfo: Unit,
        trianglePredicate: TrianglePickingPredicate,
        skipBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Unit,
        onlyBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Unit,
        onlyBoundingInfo: Boolean,
        trianglePredicate: Unit,
        skipBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Unit,
        onlyBoundingInfo: Boolean,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Unit,
        onlyBoundingInfo: Boolean,
        trianglePredicate: TrianglePickingPredicate,
        skipBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Unit,
        onlyBoundingInfo: Unit,
        trianglePredicate: Unit,
        skipBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Unit,
        onlyBoundingInfo: Unit,
        trianglePredicate: TrianglePickingPredicate
      ): Nullable[PickingInfo] = js.native
      def _internalPickForMesh(
        pickingInfo: Nullable[PickingInfo],
        rayFunction: js.Function2[/* world */ Matrix, /* enableDistantPicking */ Boolean, typings.babylonjs.rayMod.Ray],
        mesh: AbstractMesh,
        world: Matrix,
        fastCheck: Unit,
        onlyBoundingInfo: Unit,
        trianglePredicate: TrianglePickingPredicate,
        skipBoundingInfo: Boolean
      ): Nullable[PickingInfo] = js.native
      
      /** @internal */
      var _pickWithRayInverseMatrix: Matrix = js.native
      
      /**
        * @internal
        * Backing Filed
        */
      var _selectionOctree: typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
      
      /** @internal */
      var _tempPickingRay: Nullable[typings.babylonjs.rayMod.Ray] = js.native
      
      /**
        * Creates or updates the octree used to boost selection (picking)
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        * @param maxCapacity defines the maximum capacity per leaf
        * @param maxDepth defines the maximum depth of the octree
        * @returns an octree of AbstractMesh
        */
      def createOrUpdateSelectionOctree(): typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: Double): typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: Double, maxDepth: Double): typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: Unit, maxDepth: Double): typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
      
      /**
        * Gets the octree used to boost mesh selection (picking)
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        */
      var selectionOctree: typings.babylonjs.octreeMod.Octree[AbstractMesh] = js.native
    }
  }
}
