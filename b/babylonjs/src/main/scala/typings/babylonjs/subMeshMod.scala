package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.boundingInfoMod.BoundingInfo
import typings.babylonjs.boundingInfoMod.ICullable
import typings.babylonjs.colliderMod.Collider
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.drawWrapperMod.DrawWrapper
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.imaterialcontextMod.IMaterialContext
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
  open class SubMesh protected ()
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
    
    /** @hidden */
    var _alphaIndex: Double = js.native
    
    /* private */ var _boundingInfo: Any = js.native
    
    /**
      * @param collider
      * @hidden
      */
    def _checkCollision(collider: Collider): Boolean = js.native
    
    /* private */ var _currentMaterial: Any = js.native
    
    /** @hidden */
    var _distanceToCamera: Double = js.native
    
    /** @hidden */
    def _drawWrapper: DrawWrapper = js.native
    
    /** @hidden */
    def _drawWrapperOverride: Nullable[DrawWrapper] = js.native
    
    /** @hidden */
    var _drawWrappers: js.Array[DrawWrapper] = js.native
    
    /* private */ var _engine: Any = js.native
    
    /**
      * @param passId
      * @param createIfNotExisting
      * @hidden
      */
    def _getDrawWrapper(): js.UndefOr[DrawWrapper] = js.native
    def _getDrawWrapper(passId: Double): js.UndefOr[DrawWrapper] = js.native
    def _getDrawWrapper(passId: Double, createIfNotExisting: Boolean): js.UndefOr[DrawWrapper] = js.native
    def _getDrawWrapper(passId: Unit, createIfNotExisting: Boolean): js.UndefOr[DrawWrapper] = js.native
    
    /**
      * @param indices
      * @param engine
      * @hidden
      */
    def _getLinesIndexBuffer(indices: IndicesArray, engine: Engine): DataBuffer = js.native
    
    /** @hidden */
    var _id: Double = js.native
    
    /**
      * @param ray
      * @param positions
      * @param indices
      * @param intersectionThreshold
      * @param fastCheck
      * @hidden
      */
    /* private */ var _intersectLines: Any = js.native
    
    /**
      * @param ray
      * @param positions
      * @param indices
      * @param step
      * @param checkStopper
      * @param fastCheck
      * @param trianglePredicate
      * @hidden
      */
    /* private */ var _intersectTriangles: Any = js.native
    
    /**
      * @param ray
      * @param positions
      * @param indices
      * @param intersectionThreshold
      * @param fastCheck
      * @hidden
      */
    /* private */ var _intersectUnIndexedLines: Any = js.native
    
    /**
      * @param ray
      * @param positions
      * @param indices
      * @param fastCheck
      * @param trianglePredicate
      * @hidden
      */
    /* private */ var _intersectUnIndexedTriangles: Any = js.native
    
    /* private */ var _isMultiMaterial: Any = js.native
    
    /** @hidden */
    var _lastColliderTransformMatrix: Nullable[Matrix] = js.native
    
    /** @hidden */
    var _lastColliderWorldVertices: Nullable[js.Array[Vector3]] = js.native
    
    /* private */ var _linesIndexBuffer: Any = js.native
    
    /** @hidden */
    var _linesIndexCount: Double = js.native
    
    /* private */ var _mainDrawWrapperOverride: Any = js.native
    
    /* private */ var _mesh: Any = js.native
    
    /** @hidden */
    def _projectOnTrianglesToRef(
      vector: Vector3,
      positions: js.Array[Vector3],
      indices: IndicesArray,
      step: Double,
      checkStopper: Boolean,
      ref: Vector3
    ): Double = js.native
    
    /** @hidden */
    def _projectOnUnIndexedTrianglesToRef(vector: Vector3, positions: js.Array[Vector3], indices: IndicesArray, ref: Vector3): Double = js.native
    
    /** @hidden */
    def _rebuild(): Unit = js.native
    
    /**
      * @param passId
      * @param disposeWrapper
      * @hidden
      */
    def _removeDrawWrapper(passId: Double): Unit = js.native
    def _removeDrawWrapper(passId: Double, disposeWrapper: Boolean): Unit = js.native
    
    /** @hidden */
    var _renderId: Double = js.native
    
    /* private */ var _renderingMesh: Any = js.native
    
    /**
      * @param wrapper
      * @hidden
      */
    def _setMainDrawWrapperOverride(wrapper: Nullable[DrawWrapper]): Unit = js.native
    
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
      * Gets associated (main) effect (possibly the effect override if defined)
      */
    def effect: Nullable[Effect] = js.native
    
    /**
      * Returns the submesh BoundingInfo object
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
      * @param getDefaultMaterial Defines whether or not to get the default material if nothing has been defined.
      * @returns null or the current material
      */
    def getMaterial(): Nullable[Material] = js.native
    def getMaterial(getDefaultMaterial: Boolean): Nullable[Material] = js.native
    
    /**
      * Returns the mesh of the current submesh
      * @returns the parent mesh
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
      * Unlike isInFrustum this checks the full bounding box
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
      * Projects a point on this submesh and stores the result in "ref"
      *
      * @param vector point to project
      * @param positions defines mesh's positions array
      * @param indices defines mesh's indices array
      * @param ref vector that will store the result
      * @returns distance from the point and the submesh, or -1 if the mesh rendering mode doesn't support projections
      */
    def projectToRef(vector: Vector3, positions: js.Array[Vector3], indices: IndicesArray, ref: Vector3): Double = js.native
    
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
      * Resets the draw wrappers cache
      * @param passId If provided, releases only the draw wrapper corresponding to this render pass id
      */
    def resetDrawCache(): Unit = js.native
    def resetDrawCache(passId: Double): Unit = js.native
    
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
      * @param materialContext material context associated to the effect
      * @param resetContext true to reset the draw context
      */
    def setEffect(effect: Nullable[Effect]): Unit = js.native
    def setEffect(effect: Nullable[Effect], defines: Unit, materialContext: Unit, resetContext: Boolean): Unit = js.native
    def setEffect(effect: Nullable[Effect], defines: Unit, materialContext: IMaterialContext): Unit = js.native
    def setEffect(effect: Nullable[Effect], defines: Unit, materialContext: IMaterialContext, resetContext: Boolean): Unit = js.native
    def setEffect(effect: Nullable[Effect], defines: Nullable[String | MaterialDefines]): Unit = js.native
    def setEffect(
      effect: Nullable[Effect],
      defines: Nullable[String | MaterialDefines],
      materialContext: Unit,
      resetContext: Boolean
    ): Unit = js.native
    def setEffect(
      effect: Nullable[Effect],
      defines: Nullable[String | MaterialDefines],
      materialContext: IMaterialContext
    ): Unit = js.native
    def setEffect(
      effect: Nullable[Effect],
      defines: Nullable[String | MaterialDefines],
      materialContext: IMaterialContext,
      resetContext: Boolean
    ): Unit = js.native
    
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
      * @param createBoundingBox defines if bounding box should be created for this submesh
      * @returns a new submesh
      */
    inline def CreateFromIndices(materialIndex: Double, startIndex: Double, indexCount: Double, mesh: AbstractMesh): SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[SubMesh]
    inline def CreateFromIndices(
      materialIndex: Double,
      startIndex: Double,
      indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Unit,
      createBoundingBox: Boolean
    ): SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[SubMesh]
    inline def CreateFromIndices(
      materialIndex: Double,
      startIndex: Double,
      indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Mesh
    ): SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any])).asInstanceOf[SubMesh]
    inline def CreateFromIndices(
      materialIndex: Double,
      startIndex: Double,
      indexCount: Double,
      mesh: AbstractMesh,
      renderingMesh: Mesh,
      createBoundingBox: Boolean
    ): SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[SubMesh]
  }
}
