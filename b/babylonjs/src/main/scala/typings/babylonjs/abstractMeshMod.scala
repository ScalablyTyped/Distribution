package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractActionManagerMod.AbstractActionManager
import typings.babylonjs.anon.Actions
import typings.babylonjs.anon.Ind
import typings.babylonjs.anon.X
import typings.babylonjs.boundingInfoMod.BoundingInfo
import typings.babylonjs.boundingInfoMod.ICullable
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.colliderMod.Collider
import typings.babylonjs.edgesRendererMod.EdgesRenderer
import typings.babylonjs.edgesRendererMod.IEdgesRenderer
import typings.babylonjs.edgesRendererMod.IEdgesRendererOptions
import typings.babylonjs.engineOcclusionQueryMod.OcclusionDataStorage
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.lightMod.Light
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.meshVertexDataMod.IGetSetVerticesData
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.observableMod.Observer
import typings.babylonjs.octreeMod.Octree
import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.rawTextureMod.RawTexture
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.rayMod.TrianglePickingPredicate
import typings.babylonjs.renderingGroupMod.RenderingGroup
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.skeletonMod.Skeleton
import typings.babylonjs.solidParticleMod.SolidParticle
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import typings.std.Float32Array
import typings.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractMeshMod {
  
  @JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh")
  @js.native
  class AbstractMesh protected ()
    extends TransformNode
       with IDisposable
       with ICullable
       with IGetSetVerticesData {
    /**
      * Creates a new AbstractMesh
      * @param name defines the name of the mesh
      * @param scene defines the hosting scene
      */
    def this(name: String) = this()
    def this(name: String, scene: Nullable[Scene]) = this()
    
    /**
      * Backing filed
      * @hidden
      */
    var __occlusionDataStorage: OcclusionDataStorage = js.native
    
    /** @hidden */
    def _activate(renderId: Double, intermediateRendering: Boolean): Boolean = js.native
    
    /** @hidden */
    var _bonesTransformMatrices: Nullable[Float32Array] = js.native
    
    /** @hidden */
    var _boundingInfo: Nullable[BoundingInfo] = js.native
    
    /** @hidden */
    def _checkCollision(collider: Collider): AbstractMesh = js.native
    
    /** @hidden */
    def _checkOcclusionQuery(): Boolean = js.native
    
    /** @hidden */
    def _collideForSubMesh(subMesh: SubMesh, transformMatrix: Matrix, collider: Collider): AbstractMesh = js.native
    
    /** @hidden */
    var _disposePhysicsObserver: Nullable[Observer[Node]] = js.native
    
    /** @hidden */
    var _edgesRenderer: Nullable[IEdgesRenderer] = js.native
    
    /** @hidden */
    def _effectiveMesh: AbstractMesh = js.native
    
    /** @hidden */
    def _freeze(): Unit = js.native
    
    /** @hidden */
    def _generatePointsArray(): Boolean = js.native
    
    /** @hidden */
    def _getPositionData(applySkeleton: Boolean): Nullable[FloatArray] = js.native
    
    /** @hidden */
    /* private */ var _initFacetData: js.Any = js.native
    
    /** @hidden */
    var _internalAbstractMeshDataInfo: InternalAbstractMeshDataInfo = js.native
    
    /** @hidden */
    var _intersectionsInProgress: js.Array[AbstractMesh] = js.native
    
    /** @hidden */
    var _lightSources: js.Array[Light] = js.native
    
    /** @hidden */
    def _markSubMeshesAsAttributesDirty(): Unit = js.native
    
    /* private */ var _markSubMeshesAsDirty: js.Any = js.native
    
    /** @hidden */
    def _markSubMeshesAsLightDirty(): Unit = js.native
    def _markSubMeshesAsLightDirty(dispose: Boolean): Unit = js.native
    
    /** @hidden */
    def _markSubMeshesAsMiscDirty(): Unit = js.native
    
    /** @hidden */
    var _masterMesh: Nullable[AbstractMesh] = js.native
    
    /* private */ var _material: js.Any = js.native
    
    /* private */ var _meshCollisionData: js.Any = js.native
    
    /**
      * Access property
      * @hidden
      */
    var _occlusionDataStorage: OcclusionDataStorage = js.native
    
    /** @hidden */
    var _occlusionQuery: Nullable[WebGLQuery] = js.native
    
    /* private */ var _onCollisionPositionChange: js.Any = js.native
    
    /** @hidden */
    var _physicsImpostor: Nullable[PhysicsImpostor] = js.native
    
    /** @hidden */
    def _positions: Nullable[js.Array[Vector3]] = js.native
    
    /** @hidden */
    def _postActivate(): Unit = js.native
    
    /** @hidden */
    def _preActivate(): Unit = js.native
    
    /** @hidden */
    def _preActivateForIntermediateRendering(renderId: Double): Unit = js.native
    
    /** @hidden */
    def _processCollisionsForSubMeshes(collider: Collider, transformMatrix: Matrix): AbstractMesh = js.native
    
    /** @hidden */
    def _rebuild(): Unit = js.native
    
    /** @hidden */
    def _refreshBoundingInfo(data: Nullable[FloatArray], bias: Nullable[Vector2]): Unit = js.native
    
    /** @hidden */
    def _removeLightSource(light: Light, dispose: Boolean): Unit = js.native
    
    /** @hidden */
    var _renderId: Double = js.native
    
    /** @hidden (Backing field) */
    var _renderOutline: Boolean = js.native
    
    /** @hidden (Backing field) */
    var _renderOverlay: Boolean = js.native
    
    /** @hidden */
    var _renderingGroup: Nullable[RenderingGroup] = js.native
    
    /* private */ var _renderingGroupId: js.Any = js.native
    
    /** @hidden */
    def _resyncLightSource(light: Light): Unit = js.native
    
    /** @hidden */
    def _resyncLightSources(): Unit = js.native
    
    /** @hidden (Backing field) */
    var _showBoundingBox: Boolean = js.native
    
    /**
      * @hidden
      * Backing Field
      */
    var _submeshesOctree: Octree[SubMesh] = js.native
    
    /** @hidden */
    var _transformMatrixTexture: Nullable[RawTexture] = js.native
    
    /** @hidden */
    def _unBindEffect(): Unit = js.native
    
    /** @hidden */
    def _unFreeze(): Unit = js.native
    
    /** @hidden */
    var _unIndexed: Boolean = js.native
    
    /** @hidden */
    def _updateBoundingInfo(): AbstractMesh = js.native
    
    /** @hidden */
    def _updateSubMeshesBoundingInfo(matrix: DeepImmutable[Matrix]): AbstractMesh = js.native
    
    /** @hidden */
    var _waitingData: Actions = js.native
    
    /**
      * Gets or sets the current action manager
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions
      */
    var actionManager: Nullable[AbstractActionManager] = js.native
    
    /**
      * Adds the passed mesh as a child to the current mesh
      * @param mesh defines the child mesh
      * @returns the current mesh
      */
    def addChild(mesh: AbstractMesh): AbstractMesh = js.native
    
    /**
      * Align the mesh with a normal
      * @param normal defines the normal to use
      * @param upDirection can be used to redefined the up vector to use (will use the (0, 1, 0) by default)
      * @returns the current mesh
      */
    def alignWithNormal(normal: Vector3): AbstractMesh = js.native
    def alignWithNormal(normal: Vector3, upDirection: Vector3): AbstractMesh = js.native
    
    /** Gets or sets the alpha index used to sort transparent meshes
      * @see https://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered#alpha-index
      */
    var alphaIndex: Double = js.native
    
    /**
      * True if the mesh must be rendered in any case (this will shortcut the frustum clipping phase)
      */
    var alwaysSelectAsActiveMesh: Boolean = js.native
    
    /** Gets or sets a boolean indicating that this mesh will allow fog to be rendered on it (true by default) */
    def applyFog: Boolean = js.native
    def applyFog_=(value: Boolean): Unit = js.native
    
    /** Apply a physic impulse to the mesh
      * @param force defines the force to apply
      * @param contactPoint defines where to apply the force
      * @returns the current mesh
      * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
      */
    def applyImpulse(force: Vector3, contactPoint: Vector3): typings.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
    
    /**
      * Calculate relative position change from the point of view of behind the front of the mesh.
      * This is performed taking into account the meshes current rotation, so you do not have to care.
      * Supports definition of mesh facing forward or backward
      * @param amountRight defines the distance on the right axis
      * @param amountUp defines the distance on the up axis
      * @param amountForward defines the distance on the forward axis
      * @returns the new displacement vector
      */
    def calcMovePOV(amountRight: Double, amountUp: Double, amountForward: Double): Vector3 = js.native
    
    /**
      * Calculate relative rotation change from the point of view of behind the front of the mesh.
      * Supports definition of mesh facing forward or backward.
      * @param flipBack defines the flip
      * @param twirlClockwise defines the twirl
      * @param tiltRight defines the tilt
      * @returns the new rotation vector
      */
    def calcRotatePOV(flipBack: Double, twirlClockwise: Double, tiltRight: Double): Vector3 = js.native
    
    /**
      * Gets or sets a boolean indicating that this mesh can be used in the collision engine
      * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
      */
    def checkCollisions: Boolean = js.native
    def checkCollisions_=(collisionEnabled: Boolean): Unit = js.native
    
    /**
      * Gets Collider object used to compute collisions (not physics)
      * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
      */
    def collider: Nullable[Collider] = js.native
    
    /**
      * Gets or sets the current collision group mask (-1 by default).
      * A collision between A and B will happen if A.collisionGroup & b.collisionMask !== 0
      */
    def collisionGroup: Double = js.native
    def collisionGroup_=(mask: Double): Unit = js.native
    
    /**
      * Gets or sets a collision mask used to mask collisions (default is -1).
      * A collision between A and B will happen if A.collisionGroup & b.collisionMask !== 0
      */
    def collisionMask: Double = js.native
    def collisionMask_=(mask: Double): Unit = js.native
    
    /**
      * Gets or sets a collision response flag (default is true).
      * when collisionResponse is false, events are still triggered but colliding entity has no response
      * This helps creating trigger volume when user wants collision feedback events but not position/velocity
      * to respond to the collision.
      */
    def collisionResponse: Boolean = js.native
    def collisionResponse_=(response: Boolean): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating that bone animations must be computed by the CPU (false by default)
      */
    def computeBonesUsingShaders: Boolean = js.native
    def computeBonesUsingShaders_=(value: Boolean): Unit = js.native
    
    /**
      * Creates new normals data for the mesh
      * @param updatable defines if the normal vertex buffer must be flagged as updatable
      * @returns the current mesh
      */
    def createNormals(updatable: Boolean): AbstractMesh = js.native
    
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
    
    /**
      * The culling strategy to use to check whether the mesh must be rendered or not.
      * This value can be changed at any time and will be used on the next render mesh selection.
      * The possible values are :
      * - AbstractMesh.CULLINGSTRATEGY_STANDARD
      * - AbstractMesh.CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY
      * - AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION
      * - AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY
      * Please read each static variable documentation to get details about the culling process.
      * */
    var cullingStrategy: Double = js.native
    
    /**
      * Gets or sets the orientation for POV movement & rotation
      */
    var definedFacingForward: Boolean = js.native
    
    /**
      * Disables the mesh edge rendering mode
      * @returns the currentAbstractMesh
      */
    def disableEdgesRendering(): AbstractMesh = js.native
    
    /**
      * Disables the feature FacetData and frees the related memory
      * @returns the current mesh
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def disableFacetData(): AbstractMesh = js.native
    
    /**
      * Releases resources associated with this node.
      * @param doNotRecurse Set to true to not recurse into each children (recurse into each children by default)
      * @param disposeMaterialAndTextures Set to true to also dispose referenced materials and textures (false by default)
      */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating that the bounding info does not need to be kept in sync (for performance reason)
      */
    var doNotSyncBoundingInfo: Boolean = js.native
    
    /**
      * Defines edge color used when edgesRenderer is enabled
      * @see https://www.babylonjs-playground.com/#10OJSG#13
      */
    var edgesColor: Color4 = js.native
    
    /**
      * Gets the edgesRenderer associated with the mesh
      */
    var edgesRenderer: Nullable[EdgesRenderer] = js.native
    
    /**
      * Defines edge width used when edgesRenderer is enabled
      * @see https://www.babylonjs-playground.com/#10OJSG#13
      */
    var edgesWidth: Double = js.native
    
    /**
      * Gets or sets the ellipsoid used to impersonate this mesh when using collision engine (default is (0.5, 1, 0.5))
      * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
      */
    var ellipsoid: Vector3 = js.native
    
    /**
      * Gets or sets the ellipsoid offset used to impersonate this mesh when using collision engine (default is (0, 0, 0))
      * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
      */
    var ellipsoidOffset: Vector3 = js.native
    
    /**
      * Enables the edge rendering mode on the mesh.
      * This mode makes the mesh edges visible
      * @param epsilon defines the maximal distance between two angles to detect a face
      * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
      * @param options options to the edge renderer
      * @returns the currentAbstractMesh
      * @see https://www.babylonjs-playground.com/#19O9TU#0
      */
    def enableEdgesRendering(): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Double): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean, options: IEdgesRendererOptions): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Unit, options: IEdgesRendererOptions): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Unit, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Unit, checkVerticesInsteadOfIndices: Boolean, options: IEdgesRendererOptions): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Unit, checkVerticesInsteadOfIndices: Unit, options: IEdgesRendererOptions): AbstractMesh = js.native
    
    /**
      * Gets or sets a boolean indicating that pointer move events must be supported on this mesh (false by default)
      */
    var enablePointerMoveEvents: Boolean = js.native
    
    /**
      * The location (Vector3) where the facet depth sort must be computed from.
      * By default, the active camera position.
      * Used only when facet depth sort is enabled
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#facet-depth-sort
      */
    def facetDepthSortFrom: Vector3 = js.native
    def facetDepthSortFrom_=(location: Vector3): Unit = js.native
    
    /**
      * Gets the number of facets in the mesh
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#what-is-a-mesh-facet
      */
    def facetNb: Double = js.native
    
    /**
      * Returns the mesh BoundingInfo object or creates a new one and returns if it was undefined.
      * Note that it returns a shallow bounding of the mesh (i.e. it does not include children).
      * To get the full bounding of all children, call `getHierarchyBoundingVectors` instead.
      * @returns a BoundingInfo
      */
    def getBoundingInfo(): BoundingInfo = js.native
    
    /**
      * Returns the closest mesh facet index at (x,y,z) World coordinates, null if not found
      * @param projected sets as the (x,y,z) world projection on the facet
      * @param checkFace if true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned
      * @param facing if facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position. If facing si false and checkFace is true, only the facet "turning their backs" to (x, y, z) are returned : negative dot (x, y, z) * facet position
      * @param x defines x coordinate
      * @param y defines y coordinate
      * @param z defines z coordinate
      * @returns the face index if found (or null instead)
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double): Nullable[Double] = js.native
    def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Boolean): Nullable[Double] = js.native
    def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Boolean, facing: Boolean): Nullable[Double] = js.native
    def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Unit, facing: Boolean): Nullable[Double] = js.native
    def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3): Nullable[Double] = js.native
    def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean): Nullable[Double] = js.native
    def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean, facing: Boolean): Nullable[Double] = js.native
    def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Unit, facing: Boolean): Nullable[Double] = js.native
    
    /**
      * Returns the closest mesh facet index at (x,y,z) local coordinates, null if not found
      * @param projected sets as the (x,y,z) local projection on the facet
      * @param checkFace if true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned
      * @param facing if facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position. If facing si false and checkFace is true, only the facet "turning their backs" to (x, y, z) are returned : negative dot (x, y, z) * facet position
      * @param x defines x coordinate
      * @param y defines y coordinate
      * @param z defines z coordinate
      * @returns the face index if found (or null instead)
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double): Nullable[Double] = js.native
    def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Boolean): Nullable[Double] = js.native
    def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Boolean, facing: Boolean): Nullable[Double] = js.native
    def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Unit, checkFace: Unit, facing: Boolean): Nullable[Double] = js.native
    def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3): Nullable[Double] = js.native
    def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean): Nullable[Double] = js.native
    def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean, facing: Boolean): Nullable[Double] = js.native
    def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Unit, facing: Boolean): Nullable[Double] = js.native
    
    /**
      * This function returns all of the particle systems in the scene that use the mesh as an emitter.
      * @returns an array of particle systems in the scene that use the mesh as an emitter
      */
    def getConnectedParticleSystems(): js.Array[IParticleSystem] = js.native
    
    /**
      * Returns the object "parameter" set with all the expected parameters for facetData computation by ComputeNormals()
      * @returns the parameters
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def getFacetDataParameters(): js.Any = js.native
    
    /**
      * Returns the facetLocalNormals array.
      * The normals are expressed in the mesh local spac
      * @returns an array of Vector3
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def getFacetLocalNormals(): js.Array[Vector3] = js.native
    
    /**
      * Returns the facetLocalPartioning array
      * @returns an array of array of numbers
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def getFacetLocalPartitioning(): js.Array[js.Array[Double]] = js.native
    
    /**
      * Returns the facetLocalPositions array.
      * The facet positions are expressed in the mesh local space
      * @returns an array of Vector3
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def getFacetLocalPositions(): js.Array[Vector3] = js.native
    
    /**
      * Returns the i-th facet normal in the world system.
      * This method allocates a new Vector3 per call
      * @param i defines the facet index
      * @returns a new Vector3
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def getFacetNormal(i: Double): Vector3 = js.native
    
    /**
      * Sets the reference Vector3 with the i-th facet normal in the world system
      * @param i defines the facet index
      * @param ref defines the target vector
      * @returns the current mesh
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def getFacetNormalToRef(i: Double, ref: Vector3): this.type = js.native
    
    /**
      * Returns the i-th facet position in the world system.
      * This method allocates a new Vector3 per call
      * @param i defines the facet index
      * @returns a new Vector3
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def getFacetPosition(i: Double): Vector3 = js.native
    
    /**
      * Sets the reference Vector3 with the i-th facet position in the world system
      * @param i defines the facet index
      * @param ref defines the target vector
      * @returns the current mesh
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def getFacetPositionToRef(i: Double, ref: Vector3): AbstractMesh = js.native
    
    /**
      * Returns the facets (in an array) in the same partitioning block than the one the passed coordinates are located (expressed in the mesh local system)
      * @param x defines x coordinate
      * @param y defines y coordinate
      * @param z defines z coordinate
      * @returns the array of facet indexes
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def getFacetsAtLocalCoordinates(x: Double, y: Double, z: Double): Nullable[js.Array[Double]] = js.native
    
    /**
      * Returns the mesh itself by default. Implemented by child classes
      * @param camera defines the camera to use to pick the right LOD level
      * @returns the currentAbstractMesh
      */
    def getLOD(camera: Camera): Nullable[AbstractMesh] = js.native
    
    /**
      * Gets the current physics impostor
      * @see https://doc.babylonjs.com/features/physics_engine
      * @returns a physics impostor or null
      */
    def getPhysicsImpostor(): Nullable[PhysicsImpostor] = js.native
    
    /**
      * Returns a positive integer : the total number of indices in this mesh geometry.
      * @returns the numner of indices or zero if the mesh has no geometry.
      */
    def getTotalIndices(): Double = js.native
    
    /**
      * Returns 0 by default. Implemented by child classes
      * @returns an integer
      */
    def getTotalVertices(): Double = js.native
    
    /**
      * Gets a boolean indicating if this mesh has instances
      */
    def hasInstances: Boolean = js.native
    
    /**
      * Gets a boolean indicating if this mesh has thin instances
      */
    def hasThinInstances: Boolean = js.native
    
    /** Gets or sets a boolean indicating that this mesh contains vertex color data with alpha values */
    def hasVertexAlpha: Boolean = js.native
    def hasVertexAlpha_=(value: Boolean): Unit = js.native
    
    /**
      * Object used to store instanced buffers defined by user
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
      */
    var instancedBuffers: StringDictionary[js.Any] = js.native
    
    /**
      * Checks if the passed Ray intersects with the mesh
      * @param ray defines the ray to use
      * @param fastCheck defines if fast mode (but less precise) must be used (false by default)
      * @param trianglePredicate defines an optional predicate used to select faces when a mesh intersection is detected
      * @param onlyBoundingInfo defines a boolean indicating if picking should only happen using bounding info (false by default)
      * @param worldToUse defines the world matrix to use to get the world coordinate of the intersection point
      * @param skipBoundingInfo a boolean indicating if we should skip the bounding info check
      * @returns the picking info
      * @see https://doc.babylonjs.com/babylon101/intersect_collisions_-_mesh
      */
    def intersects(ray: Ray): PickingInfo = js.native
    def intersects(ray: Ray, fastCheck: Boolean): PickingInfo = js.native
    def intersects(ray: Ray, fastCheck: Boolean, trianglePredicate: Unit, onlyBoundingInfo: Boolean): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: Unit,
      onlyBoundingInfo: Boolean,
      worldToUse: Unit,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: Unit,
      onlyBoundingInfo: Boolean,
      worldToUse: Matrix
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: Unit,
      onlyBoundingInfo: Boolean,
      worldToUse: Matrix,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: Unit,
      onlyBoundingInfo: Unit,
      worldToUse: Unit,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(ray: Ray, fastCheck: Boolean, trianglePredicate: Unit, onlyBoundingInfo: Unit, worldToUse: Matrix): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: Unit,
      onlyBoundingInfo: Unit,
      worldToUse: Matrix,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(ray: Ray, fastCheck: Boolean, trianglePredicate: TrianglePickingPredicate): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Boolean,
      worldToUse: Unit,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Boolean,
      worldToUse: Matrix
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Boolean,
      worldToUse: Matrix,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Unit,
      worldToUse: Unit,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Unit,
      worldToUse: Matrix
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Boolean,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Unit,
      worldToUse: Matrix,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(ray: Ray, fastCheck: Unit, trianglePredicate: Unit, onlyBoundingInfo: Boolean): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Unit,
      trianglePredicate: Unit,
      onlyBoundingInfo: Boolean,
      worldToUse: Unit,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(ray: Ray, fastCheck: Unit, trianglePredicate: Unit, onlyBoundingInfo: Boolean, worldToUse: Matrix): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Unit,
      trianglePredicate: Unit,
      onlyBoundingInfo: Boolean,
      worldToUse: Matrix,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Unit,
      trianglePredicate: Unit,
      onlyBoundingInfo: Unit,
      worldToUse: Unit,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(ray: Ray, fastCheck: Unit, trianglePredicate: Unit, onlyBoundingInfo: Unit, worldToUse: Matrix): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Unit,
      trianglePredicate: Unit,
      onlyBoundingInfo: Unit,
      worldToUse: Matrix,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(ray: Ray, fastCheck: Unit, trianglePredicate: TrianglePickingPredicate): PickingInfo = js.native
    def intersects(ray: Ray, fastCheck: Unit, trianglePredicate: TrianglePickingPredicate, onlyBoundingInfo: Boolean): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Unit,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Boolean,
      worldToUse: Unit,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Unit,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Boolean,
      worldToUse: Matrix
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Unit,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Boolean,
      worldToUse: Matrix,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Unit,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Unit,
      worldToUse: Unit,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Unit,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Unit,
      worldToUse: Matrix
    ): PickingInfo = js.native
    def intersects(
      ray: Ray,
      fastCheck: Unit,
      trianglePredicate: TrianglePickingPredicate,
      onlyBoundingInfo: Unit,
      worldToUse: Matrix,
      skipBoundingInfo: Boolean
    ): PickingInfo = js.native
    
    /**
      * True if the mesh intersects another mesh or a SolidParticle object
      * @param mesh defines a target mesh or SolidParticle to test
      * @param precise Unless the parameter `precise` is set to `true` the intersection is computed according to Axis Aligned Bounding Boxes (AABB), else according to OBB (Oriented BBoxes)
      * @param includeDescendants Can be set to true to test if the mesh defined in parameters intersects with the current mesh or any child meshes
      * @returns true if there is an intersection
      */
    def intersectsMesh(mesh: AbstractMesh): Boolean = js.native
    def intersectsMesh(mesh: AbstractMesh, precise: Boolean): Boolean = js.native
    def intersectsMesh(mesh: AbstractMesh, precise: Boolean, includeDescendants: Boolean): Boolean = js.native
    def intersectsMesh(mesh: AbstractMesh, precise: Unit, includeDescendants: Boolean): Boolean = js.native
    def intersectsMesh(mesh: SolidParticle): Boolean = js.native
    def intersectsMesh(mesh: SolidParticle, precise: Boolean): Boolean = js.native
    def intersectsMesh(mesh: SolidParticle, precise: Boolean, includeDescendants: Boolean): Boolean = js.native
    def intersectsMesh(mesh: SolidParticle, precise: Unit, includeDescendants: Boolean): Boolean = js.native
    
    /**
      * Returns true if the passed point (Vector3) is inside the mesh bounding box
      * @param point defines the point to test
      * @returns true if there is an intersection
      */
    def intersectsPoint(point: Vector3): Boolean = js.native
    
    /**
      * Gets a boolean indicating if this mesh is an instance or a regular mesh
      */
    def isAnInstance: Boolean = js.native
    
    /**
      * Returns true if the mesh is blocked. Implemented by child classes
      */
    def isBlocked: Boolean = js.native
    
    /** Gets or sets a boolean indicating if the mesh must be considered as a ray blocker for lens flares (false by default)
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      */
    var isBlocker: Boolean = js.native
    
    /**
      * Checks if a cullable object (mesh...) is in the camera frustum
      * Unlike isInFrustum this cheks the full bounding box
      * @param frustumPlanes Camera near/planes
      * @returns true if the object is in frustum otherwise false
      */
    /* CompleteClass */
    override def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
    
    /**
      * gets a boolean indicating if facetData is enabled
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#what-is-a-mesh-facet
      */
    def isFacetDataEnabled: Boolean = js.native
    
    /**
      * Checks if the object or part of the object is in the frustum
      * @param frustumPlanes Camera near/planes
      * @returns true if the object is in frustum otherwise false
      */
    /* CompleteClass */
    override def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
    
    /**
      * Gets or sets whether the mesh is occluded or not, it is used also to set the intial state of the mesh to be occluded or not
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var isOccluded: Boolean = js.native
    
    /**
      * Flag to check the progress status of the query
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var isOcclusionQueryInProgress: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if the mesh can be picked (by scene.pick for instance or through actions). Default is true
      */
    var isPickable: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if the mesh is visible (renderable). Default is true
      */
    var isVisible: Boolean = js.native
    
    /**
      * Gets or sets the current layer mask (default is 0x0FFFFFFF)
      * @see https://doc.babylonjs.com/how_to/layermasks_and_multi-cam_textures
      */
    def layerMask: Double = js.native
    def layerMask_=(value: Double): Unit = js.native
    
    /** Gets the list of lights affecting that mesh */
    def lightSources: js.Array[Light] = js.native
    
    /** Gets or sets current material */
    def material: Nullable[Material] = js.native
    def material_=(value: Nullable[Material]): Unit = js.native
    
    /**
      * Perform relative position change from the point of view of behind the front of the mesh.
      * This is performed taking into account the meshes current rotation, so you do not have to care.
      * Supports definition of mesh facing forward or backward
      * @param amountRight defines the distance on the right axis
      * @param amountUp defines the distance on the up axis
      * @param amountForward defines the distance on the forward axis
      * @returns the current mesh
      */
    def movePOV(amountRight: Double, amountUp: Double, amountForward: Double): AbstractMesh = js.native
    
    /**
      * Move the mesh using collision engine
      * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
      * @param displacement defines the requested displacement vector
      * @returns the current mesh
      */
    def moveWithCollisions(displacement: Vector3): AbstractMesh = js.native
    
    /**
      * Gets or sets a boolean indicating that the facets must be depth sorted on next call to `updateFacetData()`.
      * Works only for updatable meshes.
      * Doesn't work with multi-materials
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#facet-depth-sort
      */
    def mustDepthSortFacets: Boolean = js.native
    def mustDepthSortFacets_=(sort: Boolean): Unit = js.native
    
    /** Gets or sets the number of allowed bone influences per vertex (4 by default) */
    def numBoneInfluencers: Double = js.native
    def numBoneInfluencers_=(value: Double): Unit = js.native
    
    /**
      * This property determines the type of occlusion query algorithm to run in WebGl, you can use:
      * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE which is mapped to GL_ANY_SAMPLES_PASSED.
      * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE (Default Value) which is mapped to GL_ANY_SAMPLES_PASSED_CONSERVATIVE which is a false positive algorithm that is faster than GL_ANY_SAMPLES_PASSED but less accurate.
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var occlusionQueryAlgorithmType: Double = js.native
    
    /**
      * This number indicates the number of allowed retries before stop the occlusion query, this is useful if the occlusion query is taking long time before to the query result is retireved, the query result indicates if the object is visible within the scene or not and based on that Babylon.Js engine decideds to show or hide the object.
      * The default value is -1 which means don't break the query and wait till the result
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var occlusionRetryCount: Double = js.native
    
    /**
      * This property is responsible for starting the occlusion query within the Mesh or not, this property is also used to determine what should happen when the occlusionRetryCount is reached. It has supports 3 values:
      * * OCCLUSION_TYPE_NONE (Default Value): this option means no occlusion query whith the Mesh.
      * * OCCLUSION_TYPE_OPTIMISTIC: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken show the mesh.
      * * OCCLUSION_TYPE_STRICT: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken restore the last state of the mesh occlusion if the mesh was visible then show the mesh if was hidden then hide don't show.
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var occlusionType: Double = js.native
    
    /**
      * An event triggered when this mesh collides with another one
      */
    var onCollideObservable: Observable[AbstractMesh] = js.native
    
    /** Set a function to call when this mesh collides with another one */
    def onCollide_=(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * An event triggered when the collision's position changes
      */
    var onCollisionPositionChangeObservable: Observable[Vector3] = js.native
    
    /** Set a function to call when the collision's position changes */
    def onCollisionPositionChange_=(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * An event triggered when material is changed
      */
    var onMaterialChangedObservable: Observable[AbstractMesh] = js.native
    
    /**
      * An event triggered when the mesh is rebuilt.
      */
    var onRebuildObservable: Observable[AbstractMesh] = js.native
    
    /** Defines color to use when rendering outline */
    var outlineColor: Color3 = js.native
    
    /** Define width to use when rendering outline */
    var outlineWidth: Double = js.native
    
    /** Defines alpha to use when rendering overlay */
    var overlayAlpha: Double = js.native
    
    /** Defines color to use when rendering overlay */
    var overlayColor: Color3 = js.native
    
    /**
      * The ratio (float) to apply to the bouding box size to set to the partioning space.
      * Ex : 1.01 (default) the partioning space is 1% bigger than the bounding box
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#tweaking-the-partitioning
      */
    def partitioningBBoxRatio: Double = js.native
    def partitioningBBoxRatio_=(ratio: Double): Unit = js.native
    
    /**
      * Gets or set the number (integer) of subdivisions per axis in the partioning space
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#tweaking-the-partitioning
      */
    def partitioningSubdivisions: Double = js.native
    def partitioningSubdivisions_=(nb: Double): Unit = js.native
    
    /**
      * Gets or sets impostor used for physic simulation
      * @see https://doc.babylonjs.com/features/physics_engine
      */
    var physicsImpostor: Nullable[PhysicsImpostor] = js.native
    
    /**
      * Gets or sets a boolean indicating that this mesh can receive realtime shadows
      * @see https://doc.babylonjs.com/babylon101/shadows
      */
    def receiveShadows: Boolean = js.native
    def receiveShadows_=(value: Boolean): Unit = js.native
    
    /**
      * This method recomputes and sets a new BoundingInfo to the mesh unless it is locked.
      * This means the mesh underlying bounding box and sphere are recomputed.
      * @param applySkeleton defines whether to apply the skeleton before computing the bounding info
      * @returns the current mesh
      */
    def refreshBoundingInfo(): AbstractMesh = js.native
    def refreshBoundingInfo(applySkeleton: Boolean): AbstractMesh = js.native
    
    /**
      * Disposes all the submeshes of the current meshnp
      * @returns the current mesh
      */
    def releaseSubMeshes(): AbstractMesh = js.native
    
    /**
      * Removes the passed mesh from the current mesh children list
      * @param mesh defines the child mesh
      * @returns the current mesh
      */
    def removeChild(mesh: AbstractMesh): AbstractMesh = js.native
    
    /**
      * Gets or sets a boolean indicating if the outline must be rendered as well
      * @see https://www.babylonjs-playground.com/#10WJ5S#3
      */
    var renderOutline: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if the overlay must be rendered as well
      * @see https://www.babylonjs-playground.com/#10WJ5S#2
      */
    var renderOverlay: Boolean = js.native
    
    /**
      * Specifies the rendering group id for this mesh (0 by default)
      * @see https://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered#rendering-groups
      */
    def renderingGroupId: Double = js.native
    def renderingGroupId_=(value: Double): Unit = js.native
    
    /**
      * Perform relative rotation change from the point of view of behind the front of the mesh.
      * Supports definition of mesh facing forward or backward
      * @param flipBack defines the flip
      * @param twirlClockwise defines the twirl
      * @param tiltRight defines the tilt
      * @returns the current mesh
      */
    def rotatePOV(flipBack: Double, twirlClockwise: Double, tiltRight: Double): AbstractMesh = js.native
    
    /**
      * Overwrite the current bounding info
      * @param boundingInfo defines the new bounding info
      * @returns the current mesh
      */
    def setBoundingInfo(boundingInfo: BoundingInfo): AbstractMesh = js.native
    
    /**
      * Creates a physic joint between two meshes
      * @param otherMesh defines the other mesh to use
      * @param pivot1 defines the pivot to use on this mesh
      * @param pivot2 defines the pivot to use on the other mesh
      * @param options defines additional options (can be plugin dependent)
      * @returns the current mesh
      * @see https://www.babylonjs-playground.com/#0BS5U0#0
      */
    def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3): typings.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
    def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: js.Any): typings.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
    
    /**
      * Sets the vertex data of the mesh geometry for the requested `kind`.
      * If the mesh has no geometry, a new Geometry object is set to the mesh and then passed this vertex data.
      * Note that a new underlying VertexBuffer object is created each call.
      * If the `kind` is the `PositionKind`, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
      * @param kind defines vertex data kind:
      * * VertexBuffer.PositionKind
      * * VertexBuffer.UVKind
      * * VertexBuffer.UV2Kind
      * * VertexBuffer.UV3Kind
      * * VertexBuffer.UV4Kind
      * * VertexBuffer.UV5Kind
      * * VertexBuffer.UV6Kind
      * * VertexBuffer.ColorKind
      * * VertexBuffer.MatricesIndicesKind
      * * VertexBuffer.MatricesIndicesExtraKind
      * * VertexBuffer.MatricesWeightsKind
      * * VertexBuffer.MatricesWeightsExtraKind
      * @param data defines the data source
      * @param updatable defines if the data must be flagged as updatable (or static)
      * @param stride defines the vertex stride (size of an entire vertex). Can be null and in this case will be deduced from vertex data kind
      * @returns the current mesh
      */
    def setVerticesData(kind: String, data: FloatArray): AbstractMesh = js.native
    def setVerticesData(kind: String, data: FloatArray, updatable: Boolean, stride: Double): AbstractMesh = js.native
    def setVerticesData(kind: String, data: FloatArray, updatable: Unit, stride: Double): AbstractMesh = js.native
    
    /**
      * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
      */
    var showBoundingBox: Boolean = js.native
    
    /** Gets or sets a boolean indicating that bounding boxes of subMeshes must be rendered as well (false by default) */
    var showSubMeshesBoundingBox: Boolean = js.native
    
    def skeleton: Nullable[Skeleton] = js.native
    /**
      * Gets or sets a skeleton to apply skining transformations
      * @see https://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
      */
    def skeleton_=(value: Nullable[Skeleton]): Unit = js.native
    
    /**
      * Gets or sets the list of subMeshes
      * @see https://doc.babylonjs.com/how_to/multi_materials
      */
    var subMeshes: js.Array[SubMesh] = js.native
    
    /**
      * Gets or sets current surrounding meshes (null by default).
      *
      * By default collision detection is tested against every mesh in the scene.
      * It is possible to set surroundingMeshes to a defined list of meshes and then only these specified
      * meshes will be tested for the collision.
      *
      * Note: if set to an empty array no collision will happen when this mesh is moved.
      */
    def surroundingMeshes: Nullable[js.Array[AbstractMesh]] = js.native
    def surroundingMeshes_=(meshes: Nullable[js.Array[AbstractMesh]]): Unit = js.native
    
    def toString(fullDetails: Boolean): String = js.native
    
    /**
      * Updates the mesh facetData arrays and the internal partitioning when the mesh is morphed or updated.
      * This method can be called within the render loop.
      * You don't need to call this method by yourself in the render loop when you update/morph a mesh with the methods CreateXXX() as they automatically manage this computation
      * @returns the current mesh
      * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
      */
    def updateFacetData(): AbstractMesh = js.native
    
    /**
      * Updates the AbstractMesh indices array
      * @param indices defines the data source
      * @param offset defines the offset in the index buffer where to store the new data (can be null)
      * @param gpuMemoryOnly defines a boolean indicating that only the GPU memory must be updated leaving the CPU version of the indices unchanged (false by default)
      * @returns the current mesh
      */
    def updateIndices(indices: IndicesArray): AbstractMesh = js.native
    def updateIndices(indices: IndicesArray, offset: Double): AbstractMesh = js.native
    def updateIndices(indices: IndicesArray, offset: Double, gpuMemoryOnly: Boolean): AbstractMesh = js.native
    def updateIndices(indices: IndicesArray, offset: Unit, gpuMemoryOnly: Boolean): AbstractMesh = js.native
    
    /** Gets a boolean indicating if this mesh has skinning data and an attached skeleton */
    def useBones: Boolean = js.native
    
    /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes collision (true by default) */
    var useOctreeForCollisions: Boolean = js.native
    
    /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes picking (true by default) */
    var useOctreeForPicking: Boolean = js.native
    
    /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes selection (true by default) */
    var useOctreeForRenderingSelection: Boolean = js.native
    
    /** Gets or sets a boolean indicating that this mesh needs to use vertex color data to render (if this kind of vertex data is available in the geometry) */
    def useVertexColors: Boolean = js.native
    def useVertexColors_=(value: Boolean): Unit = js.native
    
    /**
      * Gets or sets mesh visibility between 0 and 1 (default is 1)
      */
    def visibility: Double = js.native
    /**
      * Gets or sets mesh visibility between 0 and 1 (default is 1)
      */
    def visibility_=(value: Double): Unit = js.native
  }
  /* static members */
  object AbstractMesh {
    
    @JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh")
    @js.native
    val ^ : js.Any = js.native
    
    /** Culling strategy : Bounding Sphere Only.
      *  This is an exclusion test. It's faster than the standard strategy because the bounding box is not tested.
      *  It's also less accurate than the standard because some not visible objects can still be selected.
      *  Test : is the bounding sphere outside the frustum ?
      *  If not, then the cullable object is in the frustum.
      */
    @JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh.CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY")
    @js.native
    val CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY: Double = js.native
    
    /** Culling strategy : Optimistic Inclusion.
      *  This in an inclusion test first, then the standard exclusion test.
      *  This can be faster when a cullable object is expected to be almost always in the camera frustum.
      *  This could also be a little slower than the standard test when the tested object center is not the frustum but one of its bounding box vertex is still inside.
      *  Anyway, it's as accurate as the standard strategy.
      *  Test :
      *  Is the cullable object bounding sphere center in the frustum ?
      *  If not, apply the default culling strategy.
      */
    @JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION")
    @js.native
    val CULLINGSTRATEGY_OPTIMISTIC_INCLUSION: Double = js.native
    
    /** Culling strategy : Optimistic Inclusion then Bounding Sphere Only.
      *  This in an inclusion test first, then the bounding sphere only exclusion test.
      *  This can be the fastest test when a cullable object is expected to be almost always in the camera frustum.
      *  This could also be a little slower than the BoundingSphereOnly strategy when the tested object center is not in the frustum but its bounding sphere still intersects it.
      *  It's less accurate than the standard strategy and as accurate as the BoundingSphereOnly strategy.
      *  Test :
      *  Is the cullable object bounding sphere center in the frustum ?
      *  If not, apply the Bounding Sphere Only strategy. No Bounding Box is tested here.
      */
    @JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY")
    @js.native
    val CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY: Double = js.native
    
    /** Default culling strategy : this is an exclusion test and it's the more accurate.
      *  Test order :
      *  Is the bounding sphere outside the frustum ?
      *  If not, are the bounding box vertices outside the frustum ?
      *  It not, then the cullable object is in the frustum.
      */
    @JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh.CULLINGSTRATEGY_STANDARD")
    @js.native
    val CULLINGSTRATEGY_STANDARD: Double = js.native
    
    /** Use an accurante occlusion algorithm */
    @JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE")
    @js.native
    def OCCLUSION_ALGORITHM_TYPE_ACCURATE: Double = js.native
    inline def OCCLUSION_ALGORITHM_TYPE_ACCURATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_ALGORITHM_TYPE_ACCURATE")(x.asInstanceOf[js.Any])
    
    /** Use a conservative occlusion algorithm */
    @JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE")
    @js.native
    def OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE: Double = js.native
    inline def OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE")(x.asInstanceOf[js.Any])
    
    /** No occlusion */
    @JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh.OCCLUSION_TYPE_NONE")
    @js.native
    def OCCLUSION_TYPE_NONE: Double = js.native
    inline def OCCLUSION_TYPE_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_TYPE_NONE")(x.asInstanceOf[js.Any])
    
    /** Occlusion set to optimisitic */
    @JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh.OCCLUSION_TYPE_OPTIMISTIC")
    @js.native
    def OCCLUSION_TYPE_OPTIMISTIC: Double = js.native
    inline def OCCLUSION_TYPE_OPTIMISTIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_TYPE_OPTIMISTIC")(x.asInstanceOf[js.Any])
    
    /** Occlusion set to strict */
    @JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh.OCCLUSION_TYPE_STRICT")
    @js.native
    def OCCLUSION_TYPE_STRICT: Double = js.native
    inline def OCCLUSION_TYPE_STRICT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCCLUSION_TYPE_STRICT")(x.asInstanceOf[js.Any])
  }
  
  /** @hidden */
  trait FacetDataStorage extends StObject {
    
    var bbSize: Vector3
    
    var depthSortedFacets: js.Array[Ind]
    
    var depthSortedIndices: IndicesArray
    
    var facetDataEnabled: Boolean
    
    var facetDepthSort: Boolean
    
    var facetDepthSortEnabled: Boolean
    
    var facetDepthSortFrom: Vector3
    
    def facetDepthSortFunction(f1: Ind, f2: Ind): Double
    
    var facetDepthSortOrigin: Vector3
    
    var facetNb: Double
    
    var facetNormals: js.Array[Vector3]
    
    var facetParameters: js.Any
    
    var facetPartitioning: js.Array[js.Array[Double]]
    
    var facetPositions: js.Array[Vector3]
    
    var invertedMatrix: Matrix
    
    var partitioningBBoxRatio: Double
    
    var partitioningSubdivisions: Double
    
    var subDiv: X
  }
  object FacetDataStorage {
    
    inline def apply(
      bbSize: Vector3,
      depthSortedFacets: js.Array[Ind],
      depthSortedIndices: IndicesArray,
      facetDataEnabled: Boolean,
      facetDepthSort: Boolean,
      facetDepthSortEnabled: Boolean,
      facetDepthSortFrom: Vector3,
      facetDepthSortFunction: (Ind, Ind) => Double,
      facetDepthSortOrigin: Vector3,
      facetNb: Double,
      facetNormals: js.Array[Vector3],
      facetParameters: js.Any,
      facetPartitioning: js.Array[js.Array[Double]],
      facetPositions: js.Array[Vector3],
      invertedMatrix: Matrix,
      partitioningBBoxRatio: Double,
      partitioningSubdivisions: Double,
      subDiv: X
    ): FacetDataStorage = {
      val __obj = js.Dynamic.literal(bbSize = bbSize.asInstanceOf[js.Any], depthSortedFacets = depthSortedFacets.asInstanceOf[js.Any], depthSortedIndices = depthSortedIndices.asInstanceOf[js.Any], facetDataEnabled = facetDataEnabled.asInstanceOf[js.Any], facetDepthSort = facetDepthSort.asInstanceOf[js.Any], facetDepthSortEnabled = facetDepthSortEnabled.asInstanceOf[js.Any], facetDepthSortFrom = facetDepthSortFrom.asInstanceOf[js.Any], facetDepthSortFunction = js.Any.fromFunction2(facetDepthSortFunction), facetDepthSortOrigin = facetDepthSortOrigin.asInstanceOf[js.Any], facetNb = facetNb.asInstanceOf[js.Any], facetNormals = facetNormals.asInstanceOf[js.Any], facetParameters = facetParameters.asInstanceOf[js.Any], facetPartitioning = facetPartitioning.asInstanceOf[js.Any], facetPositions = facetPositions.asInstanceOf[js.Any], invertedMatrix = invertedMatrix.asInstanceOf[js.Any], partitioningBBoxRatio = partitioningBBoxRatio.asInstanceOf[js.Any], partitioningSubdivisions = partitioningSubdivisions.asInstanceOf[js.Any], subDiv = subDiv.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacetDataStorage]
    }
    
    extension [Self <: FacetDataStorage](x: Self) {
      
      inline def setBbSize(value: Vector3): Self = StObject.set(x, "bbSize", value.asInstanceOf[js.Any])
      
      inline def setDepthSortedFacets(value: js.Array[Ind]): Self = StObject.set(x, "depthSortedFacets", value.asInstanceOf[js.Any])
      
      inline def setDepthSortedFacetsVarargs(value: Ind*): Self = StObject.set(x, "depthSortedFacets", js.Array(value :_*))
      
      inline def setDepthSortedIndices(value: IndicesArray): Self = StObject.set(x, "depthSortedIndices", value.asInstanceOf[js.Any])
      
      inline def setDepthSortedIndicesVarargs(value: Double*): Self = StObject.set(x, "depthSortedIndices", js.Array(value :_*))
      
      inline def setFacetDataEnabled(value: Boolean): Self = StObject.set(x, "facetDataEnabled", value.asInstanceOf[js.Any])
      
      inline def setFacetDepthSort(value: Boolean): Self = StObject.set(x, "facetDepthSort", value.asInstanceOf[js.Any])
      
      inline def setFacetDepthSortEnabled(value: Boolean): Self = StObject.set(x, "facetDepthSortEnabled", value.asInstanceOf[js.Any])
      
      inline def setFacetDepthSortFrom(value: Vector3): Self = StObject.set(x, "facetDepthSortFrom", value.asInstanceOf[js.Any])
      
      inline def setFacetDepthSortFunction(value: (Ind, Ind) => Double): Self = StObject.set(x, "facetDepthSortFunction", js.Any.fromFunction2(value))
      
      inline def setFacetDepthSortOrigin(value: Vector3): Self = StObject.set(x, "facetDepthSortOrigin", value.asInstanceOf[js.Any])
      
      inline def setFacetNb(value: Double): Self = StObject.set(x, "facetNb", value.asInstanceOf[js.Any])
      
      inline def setFacetNormals(value: js.Array[Vector3]): Self = StObject.set(x, "facetNormals", value.asInstanceOf[js.Any])
      
      inline def setFacetNormalsVarargs(value: Vector3*): Self = StObject.set(x, "facetNormals", js.Array(value :_*))
      
      inline def setFacetParameters(value: js.Any): Self = StObject.set(x, "facetParameters", value.asInstanceOf[js.Any])
      
      inline def setFacetPartitioning(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "facetPartitioning", value.asInstanceOf[js.Any])
      
      inline def setFacetPartitioningVarargs(value: js.Array[Double]*): Self = StObject.set(x, "facetPartitioning", js.Array(value :_*))
      
      inline def setFacetPositions(value: js.Array[Vector3]): Self = StObject.set(x, "facetPositions", value.asInstanceOf[js.Any])
      
      inline def setFacetPositionsVarargs(value: Vector3*): Self = StObject.set(x, "facetPositions", js.Array(value :_*))
      
      inline def setInvertedMatrix(value: Matrix): Self = StObject.set(x, "invertedMatrix", value.asInstanceOf[js.Any])
      
      inline def setPartitioningBBoxRatio(value: Double): Self = StObject.set(x, "partitioningBBoxRatio", value.asInstanceOf[js.Any])
      
      inline def setPartitioningSubdivisions(value: Double): Self = StObject.set(x, "partitioningSubdivisions", value.asInstanceOf[js.Any])
      
      inline def setSubDiv(value: X): Self = StObject.set(x, "subDiv", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @hidden
    **/
  trait InternalAbstractMeshDataInfo extends StObject {
    
    var _actAsRegularMesh: Boolean
    
    var _applyFog: Boolean
    
    var _computeBonesUsingShaders: Boolean
    
    var _currentLOD: Nullable[AbstractMesh]
    
    var _currentLODIsUpToDate: Boolean
    
    var _facetData: FacetDataStorage
    
    var _hasVertexAlpha: Boolean
    
    var _isActive: Boolean
    
    var _isActiveIntermediate: Boolean
    
    var _layerMask: Double
    
    var _numBoneInfluencers: Double
    
    var _onlyForInstances: Boolean
    
    var _onlyForInstancesIntermediate: Boolean
    
    var _receiveShadows: Boolean
    
    var _skeleton: Nullable[Skeleton]
    
    var _useVertexColors: Boolean
    
    var _visibility: Double
  }
  object InternalAbstractMeshDataInfo {
    
    inline def apply(
      _actAsRegularMesh: Boolean,
      _applyFog: Boolean,
      _computeBonesUsingShaders: Boolean,
      _currentLODIsUpToDate: Boolean,
      _facetData: FacetDataStorage,
      _hasVertexAlpha: Boolean,
      _isActive: Boolean,
      _isActiveIntermediate: Boolean,
      _layerMask: Double,
      _numBoneInfluencers: Double,
      _onlyForInstances: Boolean,
      _onlyForInstancesIntermediate: Boolean,
      _receiveShadows: Boolean,
      _useVertexColors: Boolean,
      _visibility: Double
    ): InternalAbstractMeshDataInfo = {
      val __obj = js.Dynamic.literal(_actAsRegularMesh = _actAsRegularMesh.asInstanceOf[js.Any], _applyFog = _applyFog.asInstanceOf[js.Any], _computeBonesUsingShaders = _computeBonesUsingShaders.asInstanceOf[js.Any], _currentLODIsUpToDate = _currentLODIsUpToDate.asInstanceOf[js.Any], _facetData = _facetData.asInstanceOf[js.Any], _hasVertexAlpha = _hasVertexAlpha.asInstanceOf[js.Any], _isActive = _isActive.asInstanceOf[js.Any], _isActiveIntermediate = _isActiveIntermediate.asInstanceOf[js.Any], _layerMask = _layerMask.asInstanceOf[js.Any], _numBoneInfluencers = _numBoneInfluencers.asInstanceOf[js.Any], _onlyForInstances = _onlyForInstances.asInstanceOf[js.Any], _onlyForInstancesIntermediate = _onlyForInstancesIntermediate.asInstanceOf[js.Any], _receiveShadows = _receiveShadows.asInstanceOf[js.Any], _useVertexColors = _useVertexColors.asInstanceOf[js.Any], _visibility = _visibility.asInstanceOf[js.Any], _currentLOD = null, _skeleton = null)
      __obj.asInstanceOf[InternalAbstractMeshDataInfo]
    }
    
    extension [Self <: InternalAbstractMeshDataInfo](x: Self) {
      
      inline def set_actAsRegularMesh(value: Boolean): Self = StObject.set(x, "_actAsRegularMesh", value.asInstanceOf[js.Any])
      
      inline def set_applyFog(value: Boolean): Self = StObject.set(x, "_applyFog", value.asInstanceOf[js.Any])
      
      inline def set_computeBonesUsingShaders(value: Boolean): Self = StObject.set(x, "_computeBonesUsingShaders", value.asInstanceOf[js.Any])
      
      inline def set_currentLOD(value: Nullable[AbstractMesh]): Self = StObject.set(x, "_currentLOD", value.asInstanceOf[js.Any])
      
      inline def set_currentLODIsUpToDate(value: Boolean): Self = StObject.set(x, "_currentLODIsUpToDate", value.asInstanceOf[js.Any])
      
      inline def set_currentLODNull: Self = StObject.set(x, "_currentLOD", null)
      
      inline def set_facetData(value: FacetDataStorage): Self = StObject.set(x, "_facetData", value.asInstanceOf[js.Any])
      
      inline def set_hasVertexAlpha(value: Boolean): Self = StObject.set(x, "_hasVertexAlpha", value.asInstanceOf[js.Any])
      
      inline def set_isActive(value: Boolean): Self = StObject.set(x, "_isActive", value.asInstanceOf[js.Any])
      
      inline def set_isActiveIntermediate(value: Boolean): Self = StObject.set(x, "_isActiveIntermediate", value.asInstanceOf[js.Any])
      
      inline def set_layerMask(value: Double): Self = StObject.set(x, "_layerMask", value.asInstanceOf[js.Any])
      
      inline def set_numBoneInfluencers(value: Double): Self = StObject.set(x, "_numBoneInfluencers", value.asInstanceOf[js.Any])
      
      inline def set_onlyForInstances(value: Boolean): Self = StObject.set(x, "_onlyForInstances", value.asInstanceOf[js.Any])
      
      inline def set_onlyForInstancesIntermediate(value: Boolean): Self = StObject.set(x, "_onlyForInstancesIntermediate", value.asInstanceOf[js.Any])
      
      inline def set_receiveShadows(value: Boolean): Self = StObject.set(x, "_receiveShadows", value.asInstanceOf[js.Any])
      
      inline def set_skeleton(value: Nullable[Skeleton]): Self = StObject.set(x, "_skeleton", value.asInstanceOf[js.Any])
      
      inline def set_skeletonNull: Self = StObject.set(x, "_skeleton", null)
      
      inline def set_useVertexColors(value: Boolean): Self = StObject.set(x, "_useVertexColors", value.asInstanceOf[js.Any])
      
      inline def set_visibility(value: Double): Self = StObject.set(x, "_visibility", value.asInstanceOf[js.Any])
    }
  }
}
