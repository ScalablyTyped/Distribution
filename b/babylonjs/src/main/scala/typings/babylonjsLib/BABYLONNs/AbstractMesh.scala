package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store all common mesh properties
  */
@JSGlobal("BABYLON.AbstractMesh")
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
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, scene: Nullable[Scene]) = this()
  /**
    * Backing filed
    * @hidden
    */
  var __occlusionDataStorage: _OcclusionDataStorage = js.native
  var _applyFog: js.Any = js.native
  /** @hidden */
  var _bonesTransformMatrices: Nullable[stdLib.Float32Array] = js.native
  /** @hidden */
  var _boundingInfo: Nullable[BoundingInfo] = js.native
  var _checkCollisions: js.Any = js.native
  var _collider: js.Any = js.native
  var _collisionGroup: js.Any = js.native
  var _collisionMask: js.Any = js.native
  var _computeBonesUsingShaders: js.Any = js.native
  var _diffPositionForCollisions: js.Any = js.native
  /** @hidden */
  var _disposePhysicsObserver: Nullable[Observer[Node]] = js.native
  /** @hidden */
  var _edgesRenderer: Nullable[IEdgesRenderer] = js.native
  var _facetData: js.Any = js.native
  var _hasVertexAlpha: js.Any = js.native
  /** @hidden */
  var _initFacetData: js.Any = js.native
  /** @hidden */
  var _intersectionsInProgress: js.Array[AbstractMesh] = js.native
  var _layerMask: js.Any = js.native
  /** @hidden */
  var _lightSources: js.Array[Light] = js.native
  var _markSubMeshesAsDirty: js.Any = js.native
  /** @hidden */
  var _masterMesh: Nullable[AbstractMesh] = js.native
  var _material: js.Any = js.native
  var _numBoneInfluencers: js.Any = js.native
  /**
    * Access property
    * @hidden
    */
  var _occlusionDataStorage: _OcclusionDataStorage = js.native
  /** @hidden */
  var _occlusionQuery: Nullable[babylonjsLib.WebGLQuery] = js.native
  var _oldPositionForCollisions: js.Any = js.native
  var _onCollideObserver: js.Any = js.native
  var _onCollisionPositionChange: js.Any = js.native
  var _onCollisionPositionChangeObserver: js.Any = js.native
  /** @hidden */
  var _physicsImpostor: Nullable[PhysicsImpostor] = js.native
  /** @hidden */
  val _positions: Nullable[js.Array[Vector3]] = js.native
  var _receiveShadows: js.Any = js.native
  /** @hidden */
  var _renderId: scala.Double = js.native
  /** @hidden (Backing field) */
  var _renderOutline: scala.Boolean = js.native
  /** @hidden (Backing field) */
  var _renderOverlay: scala.Boolean = js.native
  /** @hidden (Backing field) */
  var _showBoundingBox: scala.Boolean = js.native
  var _skeleton: js.Any = js.native
  /**
    * @hidden
    * Backing Field
    */
  var _submeshesOctree: Octree[SubMesh] = js.native
  /** @hidden */
  var _unIndexed: scala.Boolean = js.native
  var _useVertexColors: js.Any = js.native
  var _visibility: js.Any = js.native
  /** @hidden */
  var _waitingActions: js.Any = js.native
  /** @hidden */
  var _waitingFreezeWorldMatrix: Nullable[scala.Boolean] = js.native
  /**
    * Gets or sets the current action manager
    * @see http://doc.babylonjs.com/how_to/how_to_use_actions
    */
  var actionManager: Nullable[ActionManager] = js.native
  /** Gets or sets the alpha index used to sort transparent meshes
    * @see http://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered#alpha-index
    */
  var alphaIndex: scala.Double = js.native
  /**
    * True if the mesh must be rendered in any case (this will shortcut the frustum clipping phase)
    */
  var alwaysSelectAsActiveMesh: scala.Boolean = js.native
  /** Gets or sets a boolean indicating that this mesh will allow fog to be rendered on it (true by default) */
  var applyFog: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating that this mesh can be used in the collision engine
    * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  var checkCollisions: scala.Boolean = js.native
  /**
    * Gets Collider object used to compute collisions (not physics)
    * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  val collider: Collider = js.native
  /**
    * Gets or sets the current collision group mask (-1 by default).
    * A collision between A and B will happen if A.collisionGroup & b.collisionMask !== 0
    */
  var collisionGroup: scala.Double = js.native
  /**
    * Gets or sets a collision mask used to mask collisions (default is -1).
    * A collision between A and B will happen if A.collisionGroup & b.collisionMask !== 0
    */
  var collisionMask: scala.Double = js.native
  /**
    * Gets or sets a boolean indicating that bone animations must be computed by the CPU (false by default)
    */
  var computeBonesUsingShaders: scala.Boolean = js.native
  /** Gets ot sets the culling strategy to use to find visible meshes */
  var cullingStrategy: scala.Double = js.native
  /**
    * Gets or sets the orientation for POV movement & rotation
    */
  var definedFacingForward: scala.Boolean = js.native
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
  var edgesWidth: scala.Double = js.native
  /**
    * Gets or sets the ellipsoid used to impersonate this mesh when using collision engine (default is (0.5, 1, 0.5))
    * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  var ellipsoid: Vector3 = js.native
  /**
    * Gets or sets the ellipsoid offset used to impersonate this mesh when using collision engine (default is (0, 0, 0))
    * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  var ellipsoidOffset: Vector3 = js.native
  /**
    * Gets or sets a boolean indicating that pointer move events must be supported on this mesh (false by default)
    */
  var enablePointerMoveEvents: scala.Boolean = js.native
  /**
    * The location (Vector3) where the facet depth sort must be computed from.
    * By default, the active camera position.
    * Used only when facet depth sort is enabled
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata#facet-depth-sort
    */
  var facetDepthSortFrom: Vector3 = js.native
  /**
    * Gets the number of facets in the mesh
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata#what-is-a-mesh-facet
    */
  val facetNb: scala.Double = js.native
  /** Gets or sets a boolean indicating that this mesh contains vertex color data with alpha values */
  var hasVertexAlpha: scala.Boolean = js.native
  /**
    * Returns true if the mesh is blocked. Implemented by child classes
    */
  val isBlocked: scala.Boolean = js.native
  /** Gets or sets a boolean indicating if the mesh must be considered as a ray blocker for lens flares (false by default)
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    */
  var isBlocker: scala.Boolean = js.native
  /**
    * gets a boolean indicating if facetData is enabled
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata#what-is-a-mesh-facet
    */
  val isFacetDataEnabled: scala.Boolean = js.native
  /**
    * Gets or sets whether the mesh is occluded or not, it is used also to set the intial state of the mesh to be occluded or not
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  var isOccluded: scala.Boolean = js.native
  /**
    * Flag to check the progress status of the query
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  var isOcclusionQueryInProgress: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating if the mesh can be picked (by scene.pick for instance or through actions). Default is true
    */
  var isPickable: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating if the mesh is visible (renderable). Default is true
    */
  var isVisible: scala.Boolean = js.native
  /**
    * Gets or sets the current layer mask (default is 0x0FFFFFFF)
    * @see http://doc.babylonjs.com/how_to/layermasks_and_multi-cam_textures
    */
  var layerMask: scala.Double = js.native
  /** Gets or sets current material */
  var material: Nullable[Material] = js.native
  /**
    * Gets or sets a boolean indicating that the facets must be depth sorted on next call to `updateFacetData()`.
    * Works only for updatable meshes.
    * Doesn't work with multi-materials
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata#facet-depth-sort
    */
  var mustDepthSortFacets: scala.Boolean = js.native
  /** Gets or sets the number of allowed bone influences per vertex (4 by default) */
  var numBoneInfluencers: scala.Double = js.native
  /**
    * This property determines the type of occlusion query algorithm to run in WebGl, you can use:
    * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE which is mapped to GL_ANY_SAMPLES_PASSED.
    * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE (Default Value) which is mapped to GL_ANY_SAMPLES_PASSED_CONSERVATIVE which is a false positive algorithm that is faster than GL_ANY_SAMPLES_PASSED but less accurate.
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  var occlusionQueryAlgorithmType: scala.Double = js.native
  /**
    * This number indicates the number of allowed retries before stop the occlusion query, this is useful if the occlusion query is taking long time before to the query result is retireved, the query result indicates if the object is visible within the scene or not and based on that Babylon.Js engine decideds to show or hide the object.
    * The default value is -1 which means don't break the query and wait till the result
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  var occlusionRetryCount: scala.Double = js.native
  /**
    * This property is responsible for starting the occlusion query within the Mesh or not, this property is also used to determine what should happen when the occlusionRetryCount is reached. It has supports 3 values:
    * * OCCLUSION_TYPE_NONE (Default Value): this option means no occlusion query whith the Mesh.
    * * OCCLUSION_TYPE_OPTIMISTIC: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken show the mesh.
    * * OCCLUSION_TYPE_STRICT: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken restore the last state of the mesh occlusion if the mesh was visible then show the mesh if was hidden then hide don't show.
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  var occlusionType: scala.Double = js.native
  /**
    * An event triggered when this mesh collides with another one
    */
  var onCollideObservable: Observable[AbstractMesh] = js.native
  /**
    * An event triggered when the collision's position changes
    */
  var onCollisionPositionChangeObservable: Observable[Vector3] = js.native
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
  var outlineWidth: scala.Double = js.native
  /** Defines alpha to use when rendering overlay */
  var overlayAlpha: scala.Double = js.native
  /** Defines color to use when rendering overlay */
  var overlayColor: Color3 = js.native
  /**
    * The ratio (float) to apply to the bouding box size to set to the partioning space.
    * Ex : 1.01 (default) the partioning space is 1% bigger than the bounding box
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata#tweaking-the-partitioning
    */
  var partitioningBBoxRatio: scala.Double = js.native
  /**
    * Gets or set the number (integer) of subdivisions per axis in the partioning space
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata#tweaking-the-partitioning
    */
  var partitioningSubdivisions: scala.Double = js.native
  /**
    * Gets or sets impostor used for physic simulation
    * @see http://doc.babylonjs.com/features/physics_engine
    */
  var physicsImpostor: Nullable[PhysicsImpostor] = js.native
  /**
    * Gets or sets a boolean indicating that this mesh can receive realtime shadows
    * @see http://doc.babylonjs.com/babylon101/shadows
    */
  var receiveShadows: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating if the outline must be rendered as well
    * @see https://www.babylonjs-playground.com/#10WJ5S#3
    */
  var renderOutline: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating if the overlay must be rendered as well
    * @see https://www.babylonjs-playground.com/#10WJ5S#2
    */
  var renderOverlay: scala.Boolean = js.native
  /**
    * Specifies the rendering group id for this mesh (0 by default)
    * @see http://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered#rendering-groups
    */
  var renderingGroupId: scala.Double = js.native
  /**
    * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
    */
  var showBoundingBox: scala.Boolean = js.native
  /** Gets or sets a boolean indicating that bounding boxes of subMeshes must be rendered as well (false by default) */
  var showSubMeshesBoundingBox: scala.Boolean = js.native
  /**
    * Gets or sets a skeleton to apply skining transformations
    * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
    */
  var skeleton: Nullable[Skeleton] = js.native
  /**
    * Gets or sets the list of subMeshes
    * @see http://doc.babylonjs.com/how_to/multi_materials
    */
  var subMeshes: js.Array[SubMesh] = js.native
  /** Gets a boolean indicating if this mesh has skinning data and an attached skeleton */
  val useBones: scala.Boolean = js.native
  /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes collision (true by default) */
  var useOctreeForCollisions: scala.Boolean = js.native
  /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes picking (true by default) */
  var useOctreeForPicking: scala.Boolean = js.native
  /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes selection (true by default) */
  var useOctreeForRenderingSelection: scala.Boolean = js.native
  /** Gets or sets a boolean indicating that this mesh needs to use vertex color data to render (if this kind of vertex data is available in the geometry) */
  var useVertexColors: scala.Boolean = js.native
  /**
    * Gets or sets mesh visibility between 0 and 1 (default is 1)
    */
  /**
    * Gets or sets mesh visibility between 0 and 1 (default is 1)
    */
  var visibility: scala.Double = js.native
  /** @hidden */
  def _activate(renderId: scala.Double): scala.Unit = js.native
  /** @hidden */
  def _checkCollision(collider: Collider): AbstractMesh = js.native
  /** @hidden */
  def _checkOcclusionQuery(): scala.Boolean = js.native
  /** @hidden */
  def _collideForSubMesh(subMesh: SubMesh, transformMatrix: Matrix, collider: Collider): AbstractMesh = js.native
  /** @hidden */
  def _generatePointsArray(): scala.Boolean = js.native
  /** @hidden */
  def _markSubMeshesAsAttributesDirty(): scala.Unit = js.native
  /** @hidden */
  def _markSubMeshesAsLightDirty(): scala.Unit = js.native
  /** @hidden */
  def _markSubMeshesAsMiscDirty(): scala.Unit = js.native
  /** @hidden */
  def _preActivate(): scala.Unit = js.native
  /** @hidden */
  def _preActivateForIntermediateRendering(renderId: scala.Double): scala.Unit = js.native
  /** @hidden */
  def _processCollisionsForSubMeshes(collider: Collider, transformMatrix: Matrix): AbstractMesh = js.native
  /** @hidden */
  def _rebuild(): scala.Unit = js.native
  /** @hidden */
  def _removeLightSource(light: Light): scala.Unit = js.native
  /** @hidden */
  def _resyncLighSource(light: Light): scala.Unit = js.native
  /** @hidden */
  def _resyncLightSources(): scala.Unit = js.native
  /** @hidden */
  def _unBindEffect(): scala.Unit = js.native
  /** @hidden */
  def _updateBoundingInfo(): AbstractMesh = js.native
  /** @hidden */
  def _updateSubMeshesBoundingInfo(matrix: Matrix): AbstractMesh = js.native
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
  /** Apply a physic impulse to the mesh
    * @param force defines the force to apply
    * @param contactPoint defines where to apply the force
    * @returns the current mesh
    * @see http://doc.babylonjs.com/how_to/using_the_physics_engine
    */
  def applyImpulse(force: Vector3, contactPoint: Vector3): AbstractMesh = js.native
  /**
    * Calculate relative position change from the point of view of behind the front of the mesh.
    * This is performed taking into account the meshes current rotation, so you do not have to care.
    * Supports definition of mesh facing forward or backward
    * @param amountRight defines the distance on the right axis
    * @param amountUp defines the distance on the up axis
    * @param amountForward defines the distance on the forward axis
    * @returns the new displacement vector
    */
  def calcMovePOV(amountRight: scala.Double, amountUp: scala.Double, amountForward: scala.Double): Vector3 = js.native
  /**
    * Calculate relative rotation change from the point of view of behind the front of the mesh.
    * Supports definition of mesh facing forward or backward.
    * @param flipBack defines the flip
    * @param twirlClockwise defines the twirl
    * @param tiltRight defines the tilt
    * @returns the new rotation vector
    */
  def calcRotatePOV(flipBack: scala.Double, twirlClockwise: scala.Double, tiltRight: scala.Double): Vector3 = js.native
  /**
    * Creates new normals data for the mesh
    * @param updatable defines if the normal vertex buffer must be flagged as updatable
    * @returns the current mesh
    */
  def createNormals(updatable: scala.Boolean): AbstractMesh = js.native
  /**
    * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
    * Please note that you must have a decent number of submeshes to get performance improvements when using an octree
    * @param maxCapacity defines the maximum size of each block (64 by default)
    * @param maxDepth defines the maximum depth to use (no more than 2 levels by default)
    * @returns the new octree
    * @see https://www.babylonjs-playground.com/#NA4OQ#12
    * @see http://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
    */
  def createOrUpdateSubmeshesOctree(): Octree[SubMesh] = js.native
  def createOrUpdateSubmeshesOctree(maxCapacity: scala.Double): Octree[SubMesh] = js.native
  def createOrUpdateSubmeshesOctree(maxCapacity: scala.Double, maxDepth: scala.Double): Octree[SubMesh] = js.native
  /**
    * Disables the mesh edge rendering mode
    * @returns the currentAbstractMesh
    */
  def disableEdgesRendering(): AbstractMesh = js.native
  /**
    * Disables the feature FacetData and frees the related memory
    * @returns the current mesh
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def disableFacetData(): AbstractMesh = js.native
  /**
    * Releases all held resources
    */
  /* InferMemberOverrides */
  override def dispose(): scala.Unit = js.native
  /**
    * Enables the edge rendering mode on the mesh.
    * This mode makes the mesh edges visible
    * @param epsilon defines the maximal distance between two angles to detect a face
    * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
    * @returns the currentAbstractMesh
    * @see https://www.babylonjs-playground.com/#19O9TU#0
    */
  def enableEdgesRendering(): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: scala.Double): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: scala.Double, checkVerticesInsteadOfIndices: scala.Boolean): AbstractMesh = js.native
  /**
    * Returns the mesh BoundingInfo object or creates a new one and returns if it was undefined
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
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getClosestFacetAtCoordinates(x: scala.Double, y: scala.Double, z: scala.Double): Nullable[scala.Double] = js.native
  def getClosestFacetAtCoordinates(x: scala.Double, y: scala.Double, z: scala.Double, projected: Vector3): Nullable[scala.Double] = js.native
  def getClosestFacetAtCoordinates(x: scala.Double, y: scala.Double, z: scala.Double, projected: Vector3, checkFace: scala.Boolean): Nullable[scala.Double] = js.native
  def getClosestFacetAtCoordinates(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    projected: Vector3,
    checkFace: scala.Boolean,
    facing: scala.Boolean
  ): Nullable[scala.Double] = js.native
  /**
    * Returns the closest mesh facet index at (x,y,z) local coordinates, null if not found
    * @param projected sets as the (x,y,z) local projection on the facet
    * @param checkFace if true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned
    * @param facing if facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position. If facing si false and checkFace is true, only the facet "turning their backs" to (x, y, z) are returned : negative dot (x, y, z) * facet position
    * @param x defines x coordinate
    * @param y defines y coordinate
    * @param z defines z coordinate
    * @returns the face index if found (or null instead)
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getClosestFacetAtLocalCoordinates(x: scala.Double, y: scala.Double, z: scala.Double): Nullable[scala.Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: scala.Double, y: scala.Double, z: scala.Double, projected: Vector3): Nullable[scala.Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: scala.Double, y: scala.Double, z: scala.Double, projected: Vector3, checkFace: scala.Boolean): Nullable[scala.Double] = js.native
  def getClosestFacetAtLocalCoordinates(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    projected: Vector3,
    checkFace: scala.Boolean,
    facing: scala.Boolean
  ): Nullable[scala.Double] = js.native
  /**
    * Returns the distance from the mesh to the active camera
    * @param camera defines the camera to use
    * @returns the distance
    */
  def getDistanceToCamera(): scala.Double = js.native
  def getDistanceToCamera(camera: Nullable[Camera]): scala.Double = js.native
  /**
    * Returns the object "parameter" set with all the expected parameters for facetData computation by ComputeNormals()
    * @returns the parameters
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetDataParameters(): js.Any = js.native
  /**
    * Returns the facetLocalNormals array.
    * The normals are expressed in the mesh local spac
    * @returns an array of Vector3
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetLocalNormals(): js.Array[Vector3] = js.native
  /**
    * Returns the facetLocalPartioning array
    * @returns an array of array of numbers
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetLocalPartitioning(): js.Array[js.Array[scala.Double]] = js.native
  /**
    * Returns the facetLocalPositions array.
    * The facet positions are expressed in the mesh local space
    * @returns an array of Vector3
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetLocalPositions(): js.Array[Vector3] = js.native
  /**
    * Returns the i-th facet normal in the world system.
    * This method allocates a new Vector3 per call
    * @param i defines the facet index
    * @returns a new Vector3
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetNormal(i: scala.Double): Vector3 = js.native
  /**
    * Sets the reference Vector3 with the i-th facet normal in the world system
    * @param i defines the facet index
    * @param ref defines the target vector
    * @returns the current mesh
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetNormalToRef(i: scala.Double, ref: Vector3): this.type = js.native
  /**
    * Returns the i-th facet position in the world system.
    * This method allocates a new Vector3 per call
    * @param i defines the facet index
    * @returns a new Vector3
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetPosition(i: scala.Double): Vector3 = js.native
  /**
    * Sets the reference Vector3 with the i-th facet position in the world system
    * @param i defines the facet index
    * @param ref defines the target vector
    * @returns the current mesh
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetPositionToRef(i: scala.Double, ref: Vector3): AbstractMesh = js.native
  /**
    * Returns the facets (in an array) in the same partitioning block than the one the passed coordinates are located (expressed in the mesh local system)
    * @param x defines x coordinate
    * @param y defines y coordinate
    * @param z defines z coordinate
    * @returns the array of facet indexes
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetsAtLocalCoordinates(x: scala.Double, y: scala.Double, z: scala.Double): Nullable[js.Array[scala.Double]] = js.native
  /**
    * Return the minimum and maximum world vectors of the entire hierarchy under current mesh
    * @param includeDescendants Include bounding info from descendants as well (true by default)
    * @param predicate defines a callback function that can be customize to filter what meshes should be included in the list used to compute the bounding vectors
    * @returns the new bounding vectors
    */
  def getHierarchyBoundingVectors(): babylonjsLib.Anon_Max = js.native
  def getHierarchyBoundingVectors(includeDescendants: scala.Boolean): babylonjsLib.Anon_Max = js.native
  def getHierarchyBoundingVectors(
    includeDescendants: scala.Boolean,
    predicate: Nullable[js.Function1[/* abstractMesh */ this.type, scala.Boolean]]
  ): babylonjsLib.Anon_Max = js.native
  /**
    * Returns the mesh itself by default. Implemented by child classes
    * @param camera defines the camera to use to pick the right LOD level
    * @returns the currentAbstractMesh
    */
  def getLOD(camera: Camera): Nullable[AbstractMesh] = js.native
  /**
    * Gets the current physics impostor
    * @see http://doc.babylonjs.com/features/physics_engine
    * @returns a physics impostor or null
    */
  def getPhysicsImpostor(): Nullable[PhysicsImpostor] = js.native
  /**
    * Gets the position of the current mesh in camera space
    * @param camera defines the camera to use
    * @returns a position
    */
  def getPositionInCameraSpace(): Vector3 = js.native
  def getPositionInCameraSpace(camera: Nullable[Camera]): Vector3 = js.native
  /**
    * Returns 0 by default. Implemented by child classes
    * @returns an integer
    */
  def getTotalVertices(): scala.Double = js.native
  /**
    * Checks if the passed Ray intersects with the mesh
    * @param ray defines the ray to use
    * @param fastCheck defines if fast mode (but less precise) must be used (false by default)
    * @returns the picking info
    * @see http://doc.babylonjs.com/babylon101/intersect_collisions_-_mesh
    */
  def intersects(ray: Ray): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: scala.Boolean): PickingInfo = js.native
  /**
    * True if the mesh intersects another mesh or a SolidParticle object
    * @param mesh defines a target mesh or SolidParticle to test
    * @param precise Unless the parameter `precise` is set to `true` the intersection is computed according to Axis Aligned Bounding Boxes (AABB), else according to OBB (Oriented BBoxes)
    * @param includeDescendants Can be set to true to test if the mesh defined in parameters intersects with the current mesh or any child meshes
    * @returns true if there is an intersection
    */
  def intersectsMesh(mesh: AbstractMesh): scala.Boolean = js.native
  def intersectsMesh(mesh: AbstractMesh, precise: scala.Boolean): scala.Boolean = js.native
  def intersectsMesh(mesh: AbstractMesh, precise: scala.Boolean, includeDescendants: scala.Boolean): scala.Boolean = js.native
  def intersectsMesh(mesh: SolidParticle): scala.Boolean = js.native
  def intersectsMesh(mesh: SolidParticle, precise: scala.Boolean): scala.Boolean = js.native
  def intersectsMesh(mesh: SolidParticle, precise: scala.Boolean, includeDescendants: scala.Boolean): scala.Boolean = js.native
  /**
    * Returns true if the passed point (Vector3) is inside the mesh bounding box
    * @param point defines the point to test
    * @returns true if there is an intersection
    */
  def intersectsPoint(point: Vector3): scala.Boolean = js.native
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this cheks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): scala.Boolean = js.native
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isInFrustum(frustumPlanes: js.Array[Plane]): scala.Boolean = js.native
  /**
    * Perform relative position change from the point of view of behind the front of the mesh.
    * This is performed taking into account the meshes current rotation, so you do not have to care.
    * Supports definition of mesh facing forward or backward
    * @param amountRight defines the distance on the right axis
    * @param amountUp defines the distance on the up axis
    * @param amountForward defines the distance on the forward axis
    * @returns the current mesh
    */
  def movePOV(amountRight: scala.Double, amountUp: scala.Double, amountForward: scala.Double): AbstractMesh = js.native
  /**
    * Move the mesh using collision engine
    * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    * @param displacement defines the requested displacement vector
    * @returns the current mesh
    */
  def moveWithCollisions(displacement: Vector3): AbstractMesh = js.native
  /**
    * Uniformly scales the mesh to fit inside of a unit cube (1 X 1 X 1 units)
    * @param includeDescendants Use the hierarchy's bounding box instead of the mesh's bounding box
    * @returns the current mesh
    */
  def normalizeToUnitCube(): AbstractMesh = js.native
  def normalizeToUnitCube(includeDescendants: scala.Boolean): AbstractMesh = js.native
  /** Set a function to call when this mesh collides with another one */
  def onCollide(): scala.Unit = js.native
  /** Set a function to call when the collision's position changes */
  def onCollisionPositionChange(): scala.Unit = js.native
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
    * Perform relative rotation change from the point of view of behind the front of the mesh.
    * Supports definition of mesh facing forward or backward
    * @param flipBack defines the flip
    * @param twirlClockwise defines the twirl
    * @param tiltRight defines the tilt
    * @returns the current mesh
    */
  def rotatePOV(flipBack: scala.Double, twirlClockwise: scala.Double, tiltRight: scala.Double): AbstractMesh = js.native
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
  def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3): AbstractMesh = js.native
  def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: js.Any): AbstractMesh = js.native
  /**
    * Sets the vertex data of the mesh geometry for the requested `kind`.
    * If the mesh has no geometry, a new Geometry object is set to the mesh and then passed this vertex data.
    * Note that a new underlying VertexBuffer object is created each call.
    * If the `kind` is the `PositionKind`, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
    * @param kind defines vertex data kind:
    * * BABYLON.VertexBuffer.PositionKind
    * * BABYLON.VertexBuffer.UVKind
    * * BABYLON.VertexBuffer.UV2Kind
    * * BABYLON.VertexBuffer.UV3Kind
    * * BABYLON.VertexBuffer.UV4Kind
    * * BABYLON.VertexBuffer.UV5Kind
    * * BABYLON.VertexBuffer.UV6Kind
    * * BABYLON.VertexBuffer.ColorKind
    * * BABYLON.VertexBuffer.MatricesIndicesKind
    * * BABYLON.VertexBuffer.MatricesIndicesExtraKind
    * * BABYLON.VertexBuffer.MatricesWeightsKind
    * * BABYLON.VertexBuffer.MatricesWeightsExtraKind
    * @param data defines the data source
    * @param updatable defines if the data must be flagged as updatable (or static)
    * @param stride defines the vertex stride (size of an entire vertex). Can be null and in this case will be deduced from vertex data kind
    * @returns the current mesh
    */
  def setVerticesData(kind: java.lang.String, data: FloatArray): AbstractMesh = js.native
  def setVerticesData(kind: java.lang.String, data: FloatArray, updatable: scala.Boolean, stride: scala.Double): AbstractMesh = js.native
  def toString(fullDetails: scala.Boolean): java.lang.String = js.native
  /**
    * Updates the mesh facetData arrays and the internal partitioning when the mesh is morphed or updated.
    * This method can be called within the render loop.
    * You don't need to call this method by yourself in the render loop when you update/morph a mesh with the methods CreateXXX() as they automatically manage this computation
    * @returns the current mesh
    * @see http://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def updateFacetData(): AbstractMesh = js.native
  /**
    * Updates the AbstractMesh indices array
    * @param indices defines the data source
    * @returns the current mesh
    */
  def updateIndices(indices: IndicesArray): AbstractMesh = js.native
}

/* static members */
@JSGlobal("BABYLON.AbstractMesh")
@js.native
object AbstractMesh extends js.Object {
  /** Billboard on all axes */
  val BILLBOARDMODE_ALL: scala.Double = js.native
  /**
    * No billboard
    */
  val BILLBOARDMODE_NONE: scala.Double = js.native
  /** Billboard on X axis */
  val BILLBOARDMODE_X: scala.Double = js.native
  /** Billboard on Y axis */
  val BILLBOARDMODE_Y: scala.Double = js.native
  /** Billboard on Z axis */
  val BILLBOARDMODE_Z: scala.Double = js.native
  /** Culling strategy with bounding sphere only and then frustum culling */
  val CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY: scala.Double = js.native
  /** Default culling strategy with bounding box and bounding sphere and then frustum culling */
  val CULLINGSTRATEGY_STANDARD: scala.Double = js.native
  /** Use an accurante occlusion algorithm */
  var OCCLUSION_ALGORITHM_TYPE_ACCURATE: scala.Double = js.native
  /** Use a conservative occlusion algorithm */
  var OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE: scala.Double = js.native
  /** No occlusion */
  var OCCLUSION_TYPE_NONE: scala.Double = js.native
  /** Occlusion set to optimisitic */
  var OCCLUSION_TYPE_OPTIMISTIC: scala.Double = js.native
  /** Occlusion set to strict */
  var OCCLUSION_TYPE_STRICT: scala.Double = js.native
}

