package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.boundingInfoMod.BoundingInfo
import typings.babylonjs.boundingInfoMod.ICullable
import typings.babylonjs.colliderMod.Collider
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.intersectionInfoMod.IntersectionInfo
import typings.babylonjs.materialDefinesMod.MaterialDefines
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.rayMod.TrianglePickingPredicate
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subMeshMod {
  
  @JSImport("babylonjs/Meshes/subMesh", "SubMesh")
  @js.native
  class SubMesh protected ()
    extends StObject
       with ICullable {
    /**
      * Creates a new submesh
      * @param materialIndex defines the material index to use
      * @param verticesStart defines vertex index start
      * @param verticesCount defines vertices count
      * @param indexStart defines index start
      * @param indexCount defines indices count
      * @param mesh defines the parent mesh
      * @param renderingMesh defines an optional rendering mesh
      * @param createBoundingBox defines if bounding box should be created for this submesh
      * @param addToMesh defines a boolean indicating that the submesh must be added to the mesh.subMeshes array (true by default)
      */
    def this(
      /** the material index to use */
    materialIndex: Double,
      /** vertex index start */
    verticesStart: Double,
      /** vertices count */
    verticesCount: Double,
      /** index start */
    indexStart: Double,
      /** indices count */
    indexCount: Double,
      mesh: AbstractMesh
    ) = this()
    def this(
      /** the material index to use */
    materialIndex: Double,
      /** vertex index start */
    verticesStart: Double,
      /** vertices count */
    verticesCount: Double,
      /** index start */
    indexStart: Double,
      /** indices count */
    indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Mesh
    ) = this()
    def this(
      /** the material index to use */
    materialIndex: Double,
      /** vertex index start */
    verticesStart: Double,
      /** vertices count */
    verticesCount: Double,
      /** index start */
    indexStart: Double,
      /** indices count */
    indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Unit,
      createBoundingBox: Boolean
    ) = this()
    def this(
      /** the material index to use */
    materialIndex: Double,
      /** vertex index start */
    verticesStart: Double,
      /** vertices count */
    verticesCount: Double,
      /** index start */
    indexStart: Double,
      /** indices count */
    indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Mesh,
      createBoundingBox: Boolean
    ) = this()
    def this(
      /** the material index to use */
    materialIndex: Double,
      /** vertex index start */
    verticesStart: Double,
      /** vertices count */
    verticesCount: Double,
      /** index start */
    indexStart: Double,
      /** indices count */
    indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Unit,
      createBoundingBox: Boolean,
      addToMesh: Boolean
    ) = this()
    def this(
      /** the material index to use */
    materialIndex: Double,
      /** vertex index start */
    verticesStart: Double,
      /** vertices count */
    verticesCount: Double,
      /** index start */
    indexStart: Double,
      /** indices count */
    indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Unit,
      createBoundingBox: Unit,
      addToMesh: Boolean
    ) = this()
    def this(
      /** the material index to use */
    materialIndex: Double,
      /** vertex index start */
    verticesStart: Double,
      /** vertices count */
    verticesCount: Double,
      /** index start */
    indexStart: Double,
      /** indices count */
    indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Mesh,
      createBoundingBox: Boolean,
      addToMesh: Boolean
    ) = this()
    def this(
      /** the material index to use */
    materialIndex: Double,
      /** vertex index start */
    verticesStart: Double,
      /** vertices count */
    verticesCount: Double,
      /** index start */
    indexStart: Double,
      /** indices count */
    indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Mesh,
      createBoundingBox: Unit,
      addToMesh: Boolean
    ) = this()
    
    /**
      * Returns true if this submesh covers the entire parent mesh
      * @ignorenaming
      */
    def IsGlobal: Boolean = js.native
    
    /* private */ var _IsMultiMaterial: js.Any = js.native
    
    /** @hidden */
    var _alphaIndex: Double = js.native
    
    /* private */ var _boundingInfo: js.Any = js.native
    
    /** @hidden */
    def _checkCollision(collider: Collider): Boolean = js.native
    
    /* private */ var _currentMaterial: js.Any = js.native
    
    /** @hidden */
    var _distanceToCamera: Double = js.native
    
    /** @hidden */
    var _effectOverride: Nullable[Effect] = js.native
    
    /**
      * @hidden
      */
    def _getLinesIndexBuffer(indices: IndicesArray, engine: Engine): DataBuffer = js.native
    
    /** @hidden */
    var _id: Double = js.native
    
    /** @hidden */
    /* private */ var _intersectLines: js.Any = js.native
    
    /** @hidden */
    /* private */ var _intersectTriangles: js.Any = js.native
    
    /** @hidden */
    /* private */ var _intersectUnIndexedLines: js.Any = js.native
    
    /** @hidden */
    /* private */ var _intersectUnIndexedTriangles: js.Any = js.native
    
    /** @hidden */
    var _lastColliderTransformMatrix: Nullable[Matrix] = js.native
    
    /** @hidden */
    var _lastColliderWorldVertices: Nullable[js.Array[Vector3]] = js.native
    
    /* private */ var _linesIndexBuffer: js.Any = js.native
    
    /** @hidden */
    var _linesIndexCount: Double = js.native
    
    /** @hidden */
    var _materialDefines: Nullable[MaterialDefines] = js.native
    
    /** @hidden */
    var _materialEffect: Nullable[Effect] = js.native
    
    /* private */ var _mesh: js.Any = js.native
    
    /** @hidden */
    def _rebuild(): Unit = js.native
    
    /** @hidden */
    var _renderId: Double = js.native
    
    /* private */ var _renderingMesh: js.Any = js.native
    
    /** @hidden */
    var _trianglePlanes: js.Array[Plane] = js.native
    
    /**
      * Checks if the submesh intersects with a ray
      * @param ray defines the ray to test
      * @returns true is the passed ray intersects the submesh bounding box
      */
    def canIntersects(ray: Ray): Boolean = js.native
    
    /**
      * Creates a new submesh from the passed mesh
      * @param newMesh defines the new hosting mesh
      * @param newRenderingMesh defines an optional rendering mesh
      * @returns the new submesh
      */
    def clone(newMesh: AbstractMesh): SubMesh = js.native
    def clone(newMesh: AbstractMesh, newRenderingMesh: Mesh): SubMesh = js.native
    
    /**
      * Release associated resources
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets associated effect
      */
    def effect: Nullable[Effect] = js.native
    
    /**
      * Returns the submesh BoudingInfo object
      * @returns current bounding info (or mesh's one if the submesh is global)
      */
    def getBoundingInfo(): BoundingInfo = js.native
    
    /**
      * Gets the class name
      * @returns the string "SubMesh".
      */
    def getClassName(): String = js.native
    
    /**
      * Returns the effective mesh of the submesh
      * @returns the effective mesh (could be different from parent mesh)
      */
    def getEffectiveMesh(): AbstractMesh = js.native
    
    /**
      * Returns the submesh material
      * @returns null or the current material
      */
    def getMaterial(): Nullable[Material] = js.native
    
    /**
      * Returns the mesh of the current submesh
      * @return the parent mesh
      */
    def getMesh(): AbstractMesh = js.native
    
    /**
      * Returns the rendering mesh of the submesh
      * @returns the rendering mesh (could be different from parent mesh)
      */
    def getRenderingMesh(): Mesh = js.native
    
    /**
      * Returns the replacement mesh of the submesh
      * @returns the replacement mesh (could be different from parent mesh)
      */
    def getReplacementMesh(): Nullable[AbstractMesh] = js.native
    
    /** indices count */
    var indexCount: Double = js.native
    
    /** index start */
    var indexStart: Double = js.native
    
    /**
      * Intersects current submesh with a ray
      * @param ray defines the ray to test
      * @param positions defines mesh's positions array
      * @param indices defines mesh's indices array
      * @param fastCheck defines if the first intersection will be used (and not the closest)
      * @param trianglePredicate defines an optional predicate used to select faces when a mesh intersection is detected
      * @returns intersection info or null if no intersection
      */
    def intersects(ray: Ray, positions: js.Array[Vector3], indices: IndicesArray): Nullable[IntersectionInfo] = js.native
    def intersects(ray: Ray, positions: js.Array[Vector3], indices: IndicesArray, fastCheck: Boolean): Nullable[IntersectionInfo] = js.native
    def intersects(
      ray: Ray,
      positions: js.Array[Vector3],
      indices: IndicesArray,
      fastCheck: Boolean,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[IntersectionInfo] = js.native
    def intersects(
      ray: Ray,
      positions: js.Array[Vector3],
      indices: IndicesArray,
      fastCheck: Unit,
      trianglePredicate: TrianglePickingPredicate
    ): Nullable[IntersectionInfo] = js.native
    
    /**
      * Checks if a cullable object (mesh...) is in the camera frustum
      * Unlike isInFrustum this cheks the full bounding box
      * @param frustumPlanes Camera near/planes
      * @returns true if the object is in frustum otherwise false
      */
    /* CompleteClass */
    override def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
    
    /**
      * Checks if the object or part of the object is in the frustum
      * @param frustumPlanes Camera near/planes
      * @returns true if the object is in frustum otherwise false
      */
    /* CompleteClass */
    override def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
    
    /**
      * Gets material defines used by the effect associated to the sub mesh
      */
    def materialDefines: Nullable[MaterialDefines] = js.native
    /**
      * Sets material defines used by the effect associated to the sub mesh
      */
    def materialDefines_=(defines: Nullable[MaterialDefines]): Unit = js.native
    
    /** the material index to use */
    var materialIndex: Double = js.native
    
    /**
      * Sets a new updated BoundingInfo object to the submesh
      * @param data defines an optional position array to use to determine the bounding info
      * @returns the SubMesh
      */
    def refreshBoundingInfo(): SubMesh = js.native
    def refreshBoundingInfo(data: Nullable[FloatArray]): SubMesh = js.native
    
    /**
      * Renders the submesh
      * @param enableAlphaMode defines if alpha needs to be used
      * @returns the submesh
      */
    def render(enableAlphaMode: Boolean): SubMesh = js.native
    
    /**
      * Sets the submesh BoundingInfo
      * @param boundingInfo defines the new bounding info to use
      * @returns the SubMesh
      */
    def setBoundingInfo(boundingInfo: BoundingInfo): SubMesh = js.native
    
    /**
      * Sets associated effect (effect used to render this submesh)
      * @param effect defines the effect to associate with
      * @param defines defines the set of defines used to compile this effect
      */
    def setEffect(effect: Nullable[Effect]): Unit = js.native
    def setEffect(effect: Nullable[Effect], defines: Nullable[MaterialDefines]): Unit = js.native
    
    /**
      * Updates the submesh BoundingInfo
      * @param world defines the world matrix to use to update the bounding info
      * @returns the submesh
      */
    def updateBoundingInfo(world: DeepImmutable[Matrix]): SubMesh = js.native
    
    /** vertices count */
    var verticesCount: Double = js.native
    
    /** vertex index start */
    var verticesStart: Double = js.native
  }
  /* static members */
  object SubMesh {
    
    @JSImport("babylonjs/Meshes/subMesh", "SubMesh")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add a new submesh to a mesh
      * @param materialIndex defines the material index to use
      * @param verticesStart defines vertex index start
      * @param verticesCount defines vertices count
      * @param indexStart defines index start
      * @param indexCount defines indices count
      * @param mesh defines the parent mesh
      * @param renderingMesh defines an optional rendering mesh
      * @param createBoundingBox defines if bounding box should be created for this submesh
      * @returns the new submesh
      */
    inline def AddToMesh(
      materialIndex: Double,
      verticesStart: Double,
      verticesCount: Double,
      indexStart: Double,
      indexCount: Double,
      mesh: AbstractMesh
    ): SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[SubMesh]
    inline def AddToMesh(
      materialIndex: Double,
      verticesStart: Double,
      verticesCount: Double,
      indexStart: Double,
      indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Unit,
      createBoundingBox: Boolean
    ): SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[SubMesh]
    inline def AddToMesh(
      materialIndex: Double,
      verticesStart: Double,
      verticesCount: Double,
      indexStart: Double,
      indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Mesh
    ): SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any])).asInstanceOf[SubMesh]
    inline def AddToMesh(
      materialIndex: Double,
      verticesStart: Double,
      verticesCount: Double,
      indexStart: Double,
      indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Mesh,
      createBoundingBox: Boolean
    ): SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[SubMesh]
    
    /**
      * Creates a new submesh from indices data
      * @param materialIndex the index of the main mesh material
      * @param startIndex the index where to start the copy in the mesh indices array
      * @param indexCount the number of indices to copy then from the startIndex
      * @param mesh the main mesh to create the submesh from
      * @param renderingMesh the optional rendering mesh
      * @returns a new submesh
      */
    inline def CreateFromIndices(materialIndex: Double, startIndex: Double, indexCount: Double, mesh: AbstractMesh): SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[SubMesh]
    inline def CreateFromIndices(
      materialIndex: Double,
      startIndex: Double,
      indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Mesh
    ): SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any])).asInstanceOf[SubMesh]
  }
}
