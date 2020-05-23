package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Report
import typings.babylonjs.anon.Sizes
import typings.std.Float32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mesh extends AbstractMesh {
  /** @hidden */
  var _binaryInfo: js.Any = js.native
  /** @hidden */
  var _creationDataStorage: Nullable[CreationDataStorage] = js.native
  /** @hidden */
  var _delayInfo: js.Array[String] = js.native
  var _effectiveMaterial: js.Any = js.native
  /** @hidden */
  var _geometry: Nullable[Geometry] = js.native
  /** @hidden */
  var _instanceDataStorage: InstanceDataStorage = js.native
  var _internalMeshDataInfo: js.Any = js.native
  var _onBeforeDraw: js.Any = js.native
  var _onBeforeDrawObserver: js.Any = js.native
  /** @hidden */
  var _originalBuilderSideOrientation: Double = js.native
  var _queueLoad: js.Any = js.native
  /** @hidden */
  var _shouldGenerateFlatShading: Boolean = js.native
  var _sortLODLevels: js.Any = js.native
  /** @hidden */
  var _userInstancedBuffersStorage: Sizes = js.native
  /**
    * Gets the delay loading state of the mesh (when delay loading is turned on)
    * @see http://doc.babylonjs.com/how_to/using_the_incremental_loading_system
    */
  var delayLoadState: Double = js.native
  /**
    * Gets the file containing delay loading data for this mesh
    */
  var delayLoadingFile: String = js.native
  /**
    * Gets the list of instances created from this mesh
    * it is not supposed to be modified manually.
    * Note also that the order of the InstancedMesh wihin the array is not significant and might change.
    * @see http://doc.babylonjs.com/how_to/how_to_use_instances
    */
  var instances: js.Array[InstancedMesh] = js.native
  var normalizeSkinFourWeights: js.Any = js.native
  var normalizeSkinWeightsAndExtra: js.Any = js.native
  /**
    * Use this property to change the original side orientation defined at construction time
    */
  var overrideMaterialSideOrientation: Nullable[Double] = js.native
  /** @hidden */
  def _bind(subMesh: SubMesh, effect: Effect, fillMode: Double): Mesh = js.native
  /** @hidden */
  def _checkDelayState(): Mesh = js.native
  /** @hidden */
  def _createGlobalSubMesh(force: Boolean): Nullable[SubMesh] = js.native
  /** @hidden */
  def _delayLoadingFunction(any: js.Any, mesh: Mesh): Unit = js.native
  /** @hidden */
  def _disposeInstanceSpecificData(): Unit = js.native
  /** @hidden */
  def _draw(subMesh: SubMesh, fillMode: Double): Mesh = js.native
  def _draw(subMesh: SubMesh, fillMode: Double, instancesCount: Double): Mesh = js.native
  /** @hidden */
  def _getInstancesRenderList(subMeshId: Double): InstancesBatch = js.native
  def _getInstancesRenderList(subMeshId: Double, isReplacementMode: Boolean): InstancesBatch = js.native
  /** @hidden */
  def _isMesh: Boolean = js.native
  /** @hidden */
  def _processInstancedBuffers(visibleInstances: js.Array[InstancedMesh], renderSelf: Boolean): Unit = js.native
  /** @hidden */
  def _processRendering(
    subMesh: SubMesh,
    effect: Effect,
    fillMode: Double,
    batch: InstancesBatch,
    hardwareInstancedRendering: Boolean,
    onBeforeDraw: js.Function3[
      /* isInstance */ Boolean, 
      /* world */ Matrix, 
      /* effectiveMaterial */ js.UndefOr[Material], 
      Unit
    ]
  ): Mesh = js.native
  def _processRendering(
    subMesh: SubMesh,
    effect: Effect,
    fillMode: Double,
    batch: InstancesBatch,
    hardwareInstancedRendering: Boolean,
    onBeforeDraw: js.Function3[
      /* isInstance */ Boolean, 
      /* world */ Matrix, 
      /* effectiveMaterial */ js.UndefOr[Material], 
      Unit
    ],
    effectiveMaterial: Material
  ): Mesh = js.native
  /** @hidden */
  def _registerInstanceForRenderId(instance: InstancedMesh, renderId: Double): Mesh = js.native
  /** @hidden */
  def _renderWithInstances(subMesh: SubMesh, fillMode: Double, batch: InstancesBatch, effect: Effect, engine: Engine): Mesh = js.native
  /** @hidden */
  def _resetPointsArrayCache(): Mesh = js.native
  /** @hidden */
  def _syncGeometryWithMorphTargetManager(): Unit = js.native
  /** @hidden */
  def addInstance(instance: InstancedMesh): Unit = js.native
  /**
    * Add a mesh as LOD level triggered at the given distance.
    * @see https://doc.babylonjs.com/how_to/how_to_use_lod
    * @param distance The distance from the center of the object to show this level
    * @param mesh The mesh to be added as LOD level (can be null)
    * @return This mesh (for chaining)
    */
  def addLODLevel(distance: Double, mesh: Nullable[Mesh]): Mesh = js.native
  /**
    * Modifies the mesh geometry according to a displacement map.
    * A displacement map is a colored image. Each pixel color value (actually a gradient computed from red, green, blue values) will give the displacement to apply to each mesh vertex.
    * The mesh must be set as updatable. Its internal geometry is directly modified, no new buffer are allocated.
    * @param url is a string, the URL from the image file is to be downloaded.
    * @param minHeight is the lower limit of the displacement.
    * @param maxHeight is the upper limit of the displacement.
    * @param onSuccess is an optional Javascript function to be called just after the mesh is modified. It is passed the modified mesh and must return nothing.
    * @param uvOffset is an optional vector2 used to offset UV.
    * @param uvScale is an optional vector2 used to scale UV.
    * @param forceUpdate defines whether or not to force an update of the generated buffers. This is useful to apply on a deserialized model for instance.
    * @returns the Mesh.
    */
  def applyDisplacementMap(url: String, minHeight: Double, maxHeight: Double): Mesh = js.native
  def applyDisplacementMap(
    url: String,
    minHeight: Double,
    maxHeight: Double,
    onSuccess: js.Function1[/* mesh */ this.type, Unit]
  ): Mesh = js.native
  def applyDisplacementMap(
    url: String,
    minHeight: Double,
    maxHeight: Double,
    onSuccess: js.Function1[/* mesh */ this.type, Unit],
    uvOffset: Vector2
  ): Mesh = js.native
  def applyDisplacementMap(
    url: String,
    minHeight: Double,
    maxHeight: Double,
    onSuccess: js.Function1[/* mesh */ this.type, Unit],
    uvOffset: Vector2,
    uvScale: Vector2
  ): Mesh = js.native
  def applyDisplacementMap(
    url: String,
    minHeight: Double,
    maxHeight: Double,
    onSuccess: js.Function1[/* mesh */ this.type, Unit],
    uvOffset: Vector2,
    uvScale: Vector2,
    forceUpdate: Boolean
  ): Mesh = js.native
  /**
    * Modifies the mesh geometry according to a displacementMap buffer.
    * A displacement map is a colored image. Each pixel color value (actually a gradient computed from red, green, blue values) will give the displacement to apply to each mesh vertex.
    * The mesh must be set as updatable. Its internal geometry is directly modified, no new buffer are allocated.
    * @param buffer is a `Uint8Array` buffer containing series of `Uint8` lower than 255, the red, green, blue and alpha values of each successive pixel.
    * @param heightMapWidth is the width of the buffer image.
    * @param heightMapHeight is the height of the buffer image.
    * @param minHeight is the lower limit of the displacement.
    * @param maxHeight is the upper limit of the displacement.
    * @param onSuccess is an optional Javascript function to be called just after the mesh is modified. It is passed the modified mesh and must return nothing.
    * @param uvOffset is an optional vector2 used to offset UV.
    * @param uvScale is an optional vector2 used to scale UV.
    * @param forceUpdate defines whether or not to force an update of the generated buffers. This is useful to apply on a deserialized model for instance.
    * @returns the Mesh.
    */
  def applyDisplacementMapFromBuffer(
    buffer: Uint8Array,
    heightMapWidth: Double,
    heightMapHeight: Double,
    minHeight: Double,
    maxHeight: Double
  ): Mesh = js.native
  def applyDisplacementMapFromBuffer(
    buffer: Uint8Array,
    heightMapWidth: Double,
    heightMapHeight: Double,
    minHeight: Double,
    maxHeight: Double,
    uvOffset: Vector2
  ): Mesh = js.native
  def applyDisplacementMapFromBuffer(
    buffer: Uint8Array,
    heightMapWidth: Double,
    heightMapHeight: Double,
    minHeight: Double,
    maxHeight: Double,
    uvOffset: Vector2,
    uvScale: Vector2
  ): Mesh = js.native
  def applyDisplacementMapFromBuffer(
    buffer: Uint8Array,
    heightMapWidth: Double,
    heightMapHeight: Double,
    minHeight: Double,
    maxHeight: Double,
    uvOffset: Vector2,
    uvScale: Vector2,
    forceUpdate: Boolean
  ): Mesh = js.native
  /**
    * Updates the vertex buffer by applying transformation from the bones
    * @param skeleton defines the skeleton to apply to current mesh
    * @returns the current mesh
    */
  def applySkeleton(skeleton: Skeleton): Mesh = js.native
  /**
    * Gets a boolean indicating if the normals aren't to be recomputed on next mesh `positions` array update. This property is pertinent only for updatable parametric shapes.
    */
  def areNormalsFrozen: Boolean = js.native
  /**
    * Modifies the mesh geometry according to its own current World Matrix.
    * The mesh World Matrix is then reset.
    * This method returns nothing but really modifies the mesh even if it's originally not set as updatable.
    * Note that, under the hood, this method sets a new VertexBuffer each call.
    * @see http://doc.babylonjs.com/resources/baking_transformations
    * @param bakeIndependenlyOfChildren indicates whether to preserve all child nodes' World Matrix during baking
    * @returns the current mesh
    */
  def bakeCurrentTransformIntoVertices(): Mesh = js.native
  def bakeCurrentTransformIntoVertices(bakeIndependenlyOfChildren: Boolean): Mesh = js.native
  /**
    * Modifies the mesh geometry according to the passed transformation matrix.
    * This method returns nothing but it really modifies the mesh even if it's originally not set as updatable.
    * The mesh normals are modified using the same transformation.
    * Note that, under the hood, this method sets a new VertexBuffer each call.
    * @param transform defines the transform matrix to use
    * @see http://doc.babylonjs.com/resources/baking_transformations
    * @returns the current mesh
    */
  def bakeTransformIntoVertices(transform: Matrix): Mesh = js.native
  /**
    *   Renormalize the mesh and patch it up if there are no weights
    *   Similar to normalization by adding the weights compute the reciprocal and multiply all elements, this wil ensure that everything adds to 1.
    *   However in the case of zero weights then we set just a single influence to 1.
    *   We check in the function for extra's present and if so we use the normalizeSkinWeightsWithExtras rather than the FourWeights version.
    */
  def cleanMatrixWeights(): Unit = js.native
  def clone(name: String): Mesh = js.native
  def clone(
    name: String,
    newParent: Nullable[Node],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ): Mesh = js.native
  /**
    * Modify the mesh to get a flat shading rendering.
    * This means each mesh facet will then have its own normals. Usually new vertices are added in the mesh geometry to get this result.
    * Warning : the mesh is really modified even if not set originally as updatable and, under the hood, a new VertexBuffer is allocated.
    * @returns current mesh
    */
  def convertToFlatShadedMesh(): Mesh = js.native
  /**
    * This method removes all the mesh indices and add new vertices (duplication) in order to unfold facets into buffers.
    * In other words, more vertices, no more indices and a single bigger VBO.
    * The mesh is really modified even if not set originally as updatable. Under the hood, a new VertexBuffer is allocated.
    * @returns current mesh
    */
  def convertToUnIndexedMesh(): Mesh = js.native
  /**
    * Creates a new InstancedMesh object from the mesh model.
    * @see http://doc.babylonjs.com/how_to/how_to_use_instances
    * @param name defines the name of the new instance
    * @returns a new InstancedMesh
    */
  def createInstance(name: String): InstancedMesh = js.native
  /**
    * Inverses facet orientations.
    * Warning : the mesh is really modified even if not set originally as updatable. A new VertexBuffer is created under the hood each call.
    * @param flipNormals will also inverts the normals
    * @returns current mesh
    */
  def flipFaces(): Mesh = js.native
  def flipFaces(flipNormals: Boolean): Mesh = js.native
  /**
    * Force adjacent facets to share vertices and remove any facets that have all vertices in a line
    * This will undo any application of covertToFlatShadedMesh
    * Warning : the mesh is really modified even if not set originally as updatable. A new VertexBuffer is created under the hood each call.
    */
  def forceSharedVertices(): Unit = js.native
  /**
    * This function affects parametric shapes on vertex position update only : ribbons, tubes, etc. It has no effect at all on other shapes. It prevents the mesh normals from being recomputed on next `positions` array update.
    * @returns the current mesh
    */
  def freezeNormals(): Mesh = js.native
  /**
    * Gets the mesh internal Geometry object
    */
  def geometry: Nullable[Geometry] = js.native
  /**
    * Returns as a new array populated with the mesh material and/or skeleton, if any.
    * @returns an array of IAnimatable
    */
  def getAnimatables(): js.Array[IAnimatable] = js.native
  /**
    * Returns an array populated with IParticleSystem objects whose the mesh is the emitter
    * @returns an array of IParticleSystem
    */
  def getEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
  /**
    * Returns an array populated with IParticleSystem objects whose the mesh or its children are the emitter
    * @returns an array of IParticleSystem
    */
  def getHierarchyEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
  def getLOD(camera: Camera, boundingSphere: BoundingSphere): Nullable[AbstractMesh] = js.native
  /**
    * Returns the LOD level mesh at the passed distance or null if not found.
    * @see https://doc.babylonjs.com/how_to/how_to_use_lod
    * @param distance The distance from the center of the object to show this level
    * @returns a Mesh or `null`
    */
  def getLODLevelAtDistance(distance: Double): Nullable[Mesh] = js.native
  /**
    * Gets the list of MeshLODLevel associated with the current mesh
    * @returns an array of MeshLODLevel
    */
  def getLODLevels(): js.Array[MeshLODLevel] = js.native
  /**
    * Returns the mesh VertexBuffer object from the requested `kind`
    * @param kind defines which buffer to read from (positions, indices, normals, etc). Possible `kind` values :
    * - VertexBuffer.PositionKind
    * - VertexBuffer.NormalKind
    * - VertexBuffer.UVKind
    * - VertexBuffer.UV2Kind
    * - VertexBuffer.UV3Kind
    * - VertexBuffer.UV4Kind
    * - VertexBuffer.UV5Kind
    * - VertexBuffer.UV6Kind
    * - VertexBuffer.ColorKind
    * - VertexBuffer.MatricesIndicesKind
    * - VertexBuffer.MatricesIndicesExtraKind
    * - VertexBuffer.MatricesWeightsKind
    * - VertexBuffer.MatricesWeightsExtraKind
    * @returns a FloatArray or null if the mesh has no vertex buffer for this kind.
    */
  def getVertexBuffer(kind: String): Nullable[VertexBuffer] = js.native
  /**
    * Returns a string which contains the list of existing `kinds` of Vertex Data associated with this mesh.
    * @param kind defines which buffer to read from (positions, indices, normals, etc). Possible `kind` values :
    * - VertexBuffer.PositionKind
    * - VertexBuffer.NormalKind
    * - VertexBuffer.UVKind
    * - VertexBuffer.UV2Kind
    * - VertexBuffer.UV3Kind
    * - VertexBuffer.UV4Kind
    * - VertexBuffer.UV5Kind
    * - VertexBuffer.UV6Kind
    * - VertexBuffer.ColorKind
    * - VertexBuffer.MatricesIndicesKind
    * - VertexBuffer.MatricesIndicesExtraKind
    * - VertexBuffer.MatricesWeightsKind
    * - VertexBuffer.MatricesWeightsExtraKind
    * @returns an array of strings
    */
  def getVerticesDataKinds(): js.Array[String] = js.native
  /**
    * Gets a boolean indicating if this mesh has LOD
    */
  def hasLODLevels: Boolean = js.native
  /**
    * Increase the number of facets and hence vertices in a mesh
    * Vertex normals are interpolated from existing vertex normals
    * Warning : the mesh is really modified even if not set originally as updatable. A new VertexBuffer is created under the hood each call.
    * @param numberPerEdge the number of new vertices to add to each edge of a facet, optional default 1
    */
  def increaseVertices(numberPerEdge: Double): Unit = js.native
  def isReady(completeCheck: Boolean, forceInstanceSupport: Boolean): Boolean = js.native
  /**
    * Gets or sets a boolean indicating that this mesh does not use index buffer
    */
  def isUnIndexed: Boolean = js.native
  def isUnIndexed(value: Boolean): js.Any = js.native
  /**
    * Returns a boolean defining if the vertex data for the requested `kind` is updatable.
    * @param kind defines which buffer to check (positions, indices, normals, etc). Possible `kind` values :
    * - VertexBuffer.PositionKind
    * - VertexBuffer.UVKind
    * - VertexBuffer.UV2Kind
    * - VertexBuffer.UV3Kind
    * - VertexBuffer.UV4Kind
    * - VertexBuffer.UV5Kind
    * - VertexBuffer.UV6Kind
    * - VertexBuffer.ColorKind
    * - VertexBuffer.MatricesIndicesKind
    * - VertexBuffer.MatricesIndicesExtraKind
    * - VertexBuffer.MatricesWeightsKind
    * - VertexBuffer.MatricesWeightsExtraKind
    * @returns a boolean
    */
  def isVertexBufferUpdatable(kind: String): Boolean = js.native
  /**
    * Creates a un-shared specific occurence of the geometry for the mesh.
    * @returns the current mesh
    */
  def makeGeometryUnique(): Mesh = js.native
  /** Gets or sets a boolean indicating that the update of the instance buffer of the world matrices is manual */
  def manualUpdateOfWorldMatrixInstancedBuffer: Boolean = js.native
  def manualUpdateOfWorldMatrixInstancedBuffer(value: Boolean): js.Any = js.native
  /**
    * Flags an associated vertex buffer as updatable
    * @param kind defines which buffer to use (positions, indices, normals, etc). Possible `kind` values :
    * - VertexBuffer.PositionKind
    * - VertexBuffer.UVKind
    * - VertexBuffer.UV2Kind
    * - VertexBuffer.UV3Kind
    * - VertexBuffer.UV4Kind
    * - VertexBuffer.UV5Kind
    * - VertexBuffer.UV6Kind
    * - VertexBuffer.ColorKind
    * - VertexBuffer.MatricesIndicesKind
    * - VertexBuffer.MatricesIndicesExtraKind
    * - VertexBuffer.MatricesWeightsKind
    * - VertexBuffer.MatricesWeightsExtraKind
    * @param updatable defines if the updated vertex buffer must be flagged as updatable
    */
  def markVerticesDataAsUpdatable(kind: String): Unit = js.native
  def markVerticesDataAsUpdatable(kind: String, updatable: Boolean): Unit = js.native
  /**
    * Gets or sets the morph target manager
    * @see http://doc.babylonjs.com/how_to/how_to_use_morphtargets
    */
  def morphTargetManager: Nullable[MorphTargetManager] = js.native
  def morphTargetManager(value: Nullable[MorphTargetManager]): js.Any = js.native
  /**
    * An event triggered after rendering the mesh
    */
  def onAfterRenderObservable: Observable[Mesh] = js.native
  /**
    * An event triggered before binding the mesh
    */
  def onBeforeBindObservable: Observable[Mesh] = js.native
  /**
    * Sets a callback to call before drawing the mesh. It is recommended to use onBeforeDrawObservable instead
    */
  def onBeforeDraw(callback: js.Function0[Unit]): js.Any = js.native
  /**
    * An event triggered before drawing the mesh
    */
  def onBeforeDrawObservable: Observable[Mesh] = js.native
  /**
    * An event triggered before rendering the mesh
    */
  def onBeforeRenderObservable: Observable[Mesh] = js.native
  /**
    * User defined function used to change how LOD level selection is done
    * @see http://doc.babylonjs.com/how_to/how_to_use_lod
    */
  def onLODLevelSelection(distance: Double, mesh: Mesh, selectedLevel: Nullable[Mesh]): Unit = js.native
  /**
    * Optimization of the mesh's indices, in case a mesh has duplicated vertices.
    * The function will only reorder the indices and will not remove unused vertices to avoid problems with submeshes.
    * This should be used together with the simplification to avoid disappearing triangles.
    * @param successCallback an optional success callback to be called after the optimization finished.
    * @returns the current mesh
    */
  def optimizeIndices(): Mesh = js.native
  def optimizeIndices(successCallback: js.Function1[/* mesh */ js.UndefOr[this.type], Unit]): Mesh = js.native
  /**
    * Sets a value overriding the instance count. Only applicable when custom instanced InterleavedVertexBuffer are used rather than InstancedMeshs
    */
  def overridenInstanceCount(count: Double): js.Any = js.native
  /**
    * Registers for this mesh a javascript function called just after the rendering is complete
    * @param func defines the function to call after rendering this mesh
    * @returns the current mesh
    */
  def registerAfterRender(func: js.Function1[/* mesh */ AbstractMesh, Unit]): Mesh = js.native
  /**
    * Registers for this mesh a javascript function called just before the rendering process
    * @param func defines the function to call before rendering this mesh
    * @returns the current mesh
    */
  def registerBeforeRender(func: js.Function1[/* mesh */ AbstractMesh, Unit]): Mesh = js.native
  /**
    * Register a custom buffer that will be instanced
    * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
    * @param kind defines the buffer kind
    * @param stride defines the stride in floats
    */
  def registerInstancedBuffer(kind: String, stride: Double): Unit = js.native
  /** @hidden */
  def removeInstance(instance: InstancedMesh): Unit = js.native
  /**
    * Remove a mesh from the LOD array
    * @see https://doc.babylonjs.com/how_to/how_to_use_lod
    * @param mesh defines the mesh to be removed
    * @return This mesh (for chaining)
    */
  def removeLODLevel(mesh: Mesh): Mesh = js.native
  /**
    * Delete a vertex buffer associated with this mesh
    * @param kind defines which buffer to delete (positions, indices, normals, etc). Possible `kind` values :
    * - VertexBuffer.PositionKind
    * - VertexBuffer.UVKind
    * - VertexBuffer.UV2Kind
    * - VertexBuffer.UV3Kind
    * - VertexBuffer.UV4Kind
    * - VertexBuffer.UV5Kind
    * - VertexBuffer.UV6Kind
    * - VertexBuffer.ColorKind
    * - VertexBuffer.MatricesIndicesKind
    * - VertexBuffer.MatricesIndicesExtraKind
    * - VertexBuffer.MatricesWeightsKind
    * - VertexBuffer.MatricesWeightsExtraKind
    */
  def removeVerticesData(kind: String): Unit = js.native
  /**
    * Triggers the draw call for the mesh. Usually, you don't need to call this method by your own because the mesh rendering is handled by the scene rendering manager
    * @param subMesh defines the subMesh to render
    * @param enableAlphaMode defines if alpha mode can be changed
    * @param effectiveMeshReplacement defines an optional mesh used to provide info for the rendering
    * @returns the current mesh
    */
  def render(subMesh: SubMesh, enableAlphaMode: Boolean): Mesh = js.native
  def render(subMesh: SubMesh, enableAlphaMode: Boolean, effectiveMeshReplacement: AbstractMesh): Mesh = js.native
  /**
    * Set the index buffer of this mesh
    * @param indices defines the source data
    * @param totalVertices defines the total number of vertices referenced by this index data (can be null)
    * @param updatable defines if the updated index buffer must be flagged as updatable (default is false)
    * @returns the current mesh
    */
  def setIndices(indices: IndicesArray): AbstractMesh = js.native
  /**
    * Sets the mesh material by the material or multiMaterial `id` property
    * @param id is a string identifying the material or the multiMaterial
    * @returns the current mesh
    */
  def setMaterialByID(id: String): Mesh = js.native
  /**
    * Prepare internal normal array for software CPU skinning
    * @returns original normals used for CPU skinning. Useful for integrating Morphing with skeletons in same mesh.
    */
  def setNormalsForCPUSkinning(): Float32Array = js.native
  /**
    * Prepare internal position array for software CPU skinning
    * @returns original positions used for CPU skinning. Useful for integrating Morphing with skeletons in same mesh
    */
  def setPositionsForCPUSkinning(): Float32Array = js.native
  /**
    * Sets the mesh global Vertex Buffer
    * @param buffer defines the buffer to use
    * @returns the current mesh
    */
  def setVerticesBuffer(buffer: VertexBuffer): Mesh = js.native
  /**
    * Simplify the mesh according to the given array of settings.
    * Function will return immediately and will simplify async
    * @param settings a collection of simplification settings
    * @param parallelProcessing should all levels calculate parallel or one after the other
    * @param simplificationType the type of simplification to run
    * @param successCallback optional success callback to be called after the simplification finished processing all settings
    * @returns the current mesh
    */
  def simplify(settings: js.Array[ISimplificationSettings]): Mesh = js.native
  def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean): Mesh = js.native
  def simplify(
    settings: js.Array[ISimplificationSettings],
    parallelProcessing: Boolean,
    simplificationType: SimplificationType
  ): Mesh = js.native
  def simplify(
    settings: js.Array[ISimplificationSettings],
    parallelProcessing: Boolean,
    simplificationType: SimplificationType,
    successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
  ): Mesh = js.native
  /**
    * Gets the source mesh (the one used to clone this one from)
    */
  def source: Nullable[Mesh] = js.native
  /**
    * This function will subdivide the mesh into multiple submeshes
    * @param count defines the expected number of submeshes
    */
  def subdivide(count: Double): Unit = js.native
  /**
    * Synchronises all the mesh instance submeshes to the current mesh submeshes, if any.
    * After this call, all the mesh instances have the same submeshes than the current mesh.
    * @returns the current mesh
    */
  def synchronizeInstances(): Mesh = js.native
  /**
    * Invert the geometry to move from a right handed system to a left handed one.
    * @returns the current mesh
    */
  def toLeftHanded(): Mesh = js.native
  /**
    * This function affects parametric shapes on vertex position update only : ribbons, tubes, etc. It has no effect at all on other shapes. It reactivates the mesh normals computation if it was previously frozen
    * @returns the current mesh
    */
  def unfreezeNormals(): Mesh = js.native
  /**
    * Disposes a previously registered javascript function called after the rendering.
    * @param func defines the function to remove
    * @returns the current mesh
    */
  def unregisterAfterRender(func: js.Function1[/* mesh */ AbstractMesh, Unit]): Mesh = js.native
  /**
    * Disposes a previously registered javascript function called before the rendering
    * @param func defines the function to remove
    * @returns the current mesh
    */
  def unregisterBeforeRender(func: js.Function1[/* mesh */ AbstractMesh, Unit]): Mesh = js.native
  /**
    * This method updates the vertex positions of an updatable mesh according to the `positionFunction` returned values.
    * @see http://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh#other-shapes-updatemeshpositions
    * @param positionFunction is a simple JS function what is passed the mesh `positions` array. It doesn't need to return anything
    * @param computeNormals is a boolean (default true) to enable/disable the mesh normal recomputation after the vertex position update
    * @returns the current mesh
    */
  def updateMeshPositions(positionFunction: js.Function1[/* data */ FloatArray, Unit]): Mesh = js.native
  def updateMeshPositions(positionFunction: js.Function1[/* data */ FloatArray, Unit], computeNormals: Boolean): Mesh = js.native
  /**
    * ValidateSkinning is used to determine that a mesh has valid skinning data along with skin metrics, if missing weights,
    * or not normalized it is returned as invalid mesh the string can be used for console logs, or on screen messages to let
    * the user know there was an issue with importing the mesh
    * @returns a validation object with skinned, valid and report string
    */
  def validateSkinning(): Report = js.native
  /** Gets the array buffer used to store the instanced buffer used for instances' world matrices */
  def worldMatrixInstancedBuffer: Float32Array = js.native
}

