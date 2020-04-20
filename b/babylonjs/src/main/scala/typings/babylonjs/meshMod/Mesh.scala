package typings.babylonjs.meshMod

import typings.babylonjs.AnonData
import typings.babylonjs.AnonFaceColors
import typings.babylonjs.AnonH
import typings.babylonjs.AnonMax
import typings.babylonjs.AnonReport
import typings.babylonjs.AnonUpdatable
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.boundingSphereMod.BoundingSphere
import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.geometryMod.Geometry
import typings.babylonjs.groundMeshMod.GroundMesh
import typings.babylonjs.instancedMeshMod.InstancedMesh
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.linesMeshMod.LinesMesh
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.meshLODLevelMod.MeshLODLevel
import typings.babylonjs.meshSimplificationMod.ISimplificationSettings
import typings.babylonjs.meshSimplificationMod.SimplificationType
import typings.babylonjs.morphTargetManagerMod.MorphTargetManager
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.physicsImpostorMod.IPhysicsEnabledObject
import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.skeletonMod.Skeleton
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import typings.std.Float32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/mesh", "Mesh")
@js.native
class Mesh protected () extends AbstractMesh {
  /**
    * @constructor
    * @param name The value used by scene.getMeshByName() to do a lookup.
    * @param scene The scene to add this mesh to.
    * @param parent The parent of this mesh, if it has one
    * @param source An optional Mesh from which geometry is shared, cloned.
    * @param doNotCloneChildren When cloning, skip cloning child meshes of source, default False.
    *                  When false, achieved by calling a clone(), also passing False.
    *                  This will make creation of children, recursive.
    * @param clonePhysicsImpostor When cloning, include cloning mesh physics impostor, default True.
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[Scene]) = this()
  def this(name: String, scene: Nullable[Scene], parent: Nullable[Node]) = this()
  def this(name: String, scene: Nullable[Scene], parent: Nullable[Node], source: Nullable[Mesh]) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Nullable[Node],
    source: Nullable[Mesh],
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: Nullable[Scene],
    parent: Nullable[Node],
    source: Nullable[Mesh],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
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
  var _userInstancedBuffersStorage: AnonData = js.native
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
  def simplify(settings: js.Array[ISimplificationSettings]): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
  def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
  def simplify(
    settings: js.Array[ISimplificationSettings],
    parallelProcessing: Boolean,
    simplificationType: SimplificationType
  ): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
  def simplify(
    settings: js.Array[ISimplificationSettings],
    parallelProcessing: Boolean,
    simplificationType: SimplificationType,
    successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
  ): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
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
  def validateSkinning(): AnonReport = js.native
  /** Gets the array buffer used to store the instanced buffer used for instances' world matrices */
  def worldMatrixInstancedBuffer: Float32Array = js.native
}

/* static members */
@JSImport("babylonjs/Meshes/mesh", "Mesh")
@js.native
object Mesh extends js.Object {
  /**
    * Mesh side orientation : usually the internal or back surface
    */
  val BACKSIDE: Double = js.native
  /**
    * Mesh tile positioning : part tiles on bottom
    */
  val BOTTOM: Double = js.native
  /**
    * Mesh cap setting : two caps, one at the beginning  and one at the end of the mesh
    */
  val CAP_ALL: Double = js.native
  /**
    * Mesh cap setting : one cap at the end of the mesh
    */
  val CAP_END: Double = js.native
  /**
    * Mesh cap setting : one cap at the beginning of the mesh
    */
  val CAP_START: Double = js.native
  /**
    * Mesh tile positioning : part tiles same on left/right or top/bottom
    */
  val CENTER: Double = js.native
  /**
    * Mesh side orientation : by default, `FRONTSIDE`
    */
  val DEFAULTSIDE: Double = js.native
  /**
    * Mesh side orientation : both internal and external or front and back surfaces
    */
  val DOUBLESIDE: Double = js.native
  /**
    * Mesh pattern setting : rotate pattern and rotate
    */
  val FLIP_N_ROTATE_ROW: Double = js.native
  /**
    * Mesh pattern setting : flip and rotate alternate tiles on each row or column
    */
  val FLIP_N_ROTATE_TILE: Double = js.native
  /**
    * Mesh pattern setting : flip (reflect in y axis) all tiles on alternate rows
    */
  val FLIP_ROW: Double = js.native
  /**
    * Mesh pattern setting : flip (reflect in y axis) alternate tiles on each row or column
    */
  val FLIP_TILE: Double = js.native
  /**
    * Mesh side orientation : usually the external or front surface
    */
  val FRONTSIDE: Double = js.native
  /**
    * Mesh tile positioning : part tiles on left
    */
  val LEFT: Double = js.native
  /**
    * Mesh cap setting : no cap
    */
  val NO_CAP: Double = js.native
  /**
    * Mesh pattern setting : no flip or rotate
    */
  val NO_FLIP: Double = js.native
  /**
    * Mesh tile positioning : part tiles on right
    */
  val RIGHT: Double = js.native
  /**
    * Mesh pattern setting : rotate (180degs) all tiles on alternate rows
    */
  val ROTATE_ROW: Double = js.native
  /**
    * Mesh pattern setting : rotate (180degs) alternate tiles on each row or column
    */
  val ROTATE_TILE: Double = js.native
  /**
    * Mesh tile positioning : part tiles on top
    */
  val TOP: Double = js.native
  def Center(meshesOrMinMaxVector: js.Array[AbstractMesh]): Vector3 = js.native
  /**
    * Returns the center of the `{min:` Vector3`, max:` Vector3`}` or the center of MinMax vector3 computed from a mesh array
    * @param meshesOrMinMaxVector could be an array of meshes or a `{min:` Vector3`, max:` Vector3`}` object
    * @returns a vector3
    */
  def Center(meshesOrMinMaxVector: AnonMax): Vector3 = js.native
  /**
    * Creates a box mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param size sets the size (float) of each box side (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateBox(name: String, size: Double): Mesh = js.native
  def CreateBox(name: String, size: Double, scene: Nullable[Scene]): Mesh = js.native
  def CreateBox(name: String, size: Double, scene: Nullable[Scene], updatable: Boolean): Mesh = js.native
  def CreateBox(name: String, size: Double, scene: Nullable[Scene], updatable: Boolean, sideOrientation: Double): Mesh = js.native
  /**
    * Creates a cylinder or a cone mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param height sets the height size (float) of the cylinder/cone (float, default 2)
    * @param diameterTop set the top cap diameter (floats, default 1)
    * @param diameterBottom set the bottom cap diameter (floats, default 1). This value can't be zero
    * @param tessellation sets the number of cylinder sides (positive integer, default 24). Set it to 3 to get a prism for instance
    * @param subdivisions sets the number of rings along the cylinder height (positive integer, default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any
  ): Mesh = js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: Scene
  ): Mesh = js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: Scene,
    updatable: js.Any
  ): Mesh = js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: Scene,
    updatable: js.Any,
    sideOrientation: Double
  ): Mesh = js.native
  /**
    * Creates a dashed line mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param points is an array successive Vector3
    * @param dashSize is the size of the dashes relatively the dash number (positive float, default 3)
    * @param gapSize is the size of the gap between two successive dashes relatively the dash number (positive float, default 1)
    * @param dashNb is the intended total number of dashes (positive integer, default 200)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (http://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines)
    * @returns a new Mesh
    */
  def CreateDashedLines(name: String, points: js.Array[Vector3], dashSize: Double, gapSize: Double, dashNb: Double): LinesMesh = js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: Nullable[Scene]
  ): LinesMesh = js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: Nullable[Scene],
    updatable: Boolean
  ): LinesMesh = js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: Nullable[Scene],
    updatable: Boolean,
    instance: LinesMesh
  ): LinesMesh = js.native
  /**
    * Creates a decal mesh.
    * Please consider using the same method from the MeshBuilder class instead.
    * A decal is a mesh usually applied as a model onto the surface of another mesh
    * @param name  defines the name of the mesh
    * @param sourceMesh defines the mesh receiving the decal
    * @param position sets the position of the decal in world coordinates
    * @param normal sets the normal of the mesh where the decal is applied onto in world coordinates
    * @param size sets the decal scaling
    * @param angle sets the angle to rotate the decal
    * @returns a new Mesh
    */
  def CreateDecal(
    name: String,
    sourceMesh: AbstractMesh,
    position: Vector3,
    normal: Vector3,
    size: Vector3,
    angle: Double
  ): Mesh = js.native
  /**
    * Creates a plane polygonal mesh.  By default, this is a disc. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param radius sets the radius size (float) of the polygon (default 0.5)
    * @param tessellation sets the number of polygon sides (positive integer, default 64). So a tessellation valued to 3 will build a triangle, to 4 a square, etc
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateDisc(name: String, radius: Double, tessellation: Double): Mesh = js.native
  def CreateDisc(name: String, radius: Double, tessellation: Double, scene: Nullable[Scene]): Mesh = js.native
  def CreateDisc(name: String, radius: Double, tessellation: Double, scene: Nullable[Scene], updatable: Boolean): Mesh = js.native
  def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: Nullable[Scene],
    updatable: Boolean,
    sideOrientation: Double
  ): Mesh = js.native
  /**
    * Creates a ground mesh.
    * Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param width set the width of the ground
    * @param height set the height of the ground
    * @param subdivisions sets the number of subdivisions per side
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @returns a new Mesh
    */
  def CreateGround(name: String, width: Double, height: Double, subdivisions: Double): Mesh = js.native
  def CreateGround(name: String, width: Double, height: Double, subdivisions: Double, scene: Scene): Mesh = js.native
  def CreateGround(
    name: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    scene: Scene,
    updatable: Boolean
  ): Mesh = js.native
  /**
    * Creates a ground mesh from a height map.
    * Please consider using the same method from the MeshBuilder class instead
    * @see http://doc.babylonjs.com/babylon101/height_map
    * @param name defines the name of the mesh to create
    * @param url sets the URL of the height map image resource
    * @param width set the ground width size
    * @param height set the ground height size
    * @param subdivisions sets the number of subdivision per side
    * @param minHeight is the minimum altitude on the ground
    * @param maxHeight is the maximum altitude on the ground
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param onReady  is a callback function that will be called  once the mesh is built (the height map download can last some time)
    * @param alphaFilter will filter any data where the alpha channel is below this value, defaults 0 (all data visible)
    * @returns a new Mesh
    */
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: Scene
  ): GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: Scene,
    updatable: Boolean
  ): GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: Scene,
    updatable: Boolean,
    onReady: js.Function1[/* mesh */ GroundMesh, Unit]
  ): GroundMesh = js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: Scene,
    updatable: Boolean,
    onReady: js.Function1[/* mesh */ GroundMesh, Unit],
    alphaFilter: Double
  ): GroundMesh = js.native
  /**
    * Creates a hemisphere mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param segments sets the sphere number of horizontal stripes (positive integer, default 32)
    * @param diameter sets the diameter size (float) of the sphere (default 1)
    * @param scene defines the hosting scene
    * @returns a new Mesh
    */
  def CreateHemisphere(name: String, segments: Double, diameter: Double): Mesh = js.native
  def CreateHemisphere(name: String, segments: Double, diameter: Double, scene: Scene): Mesh = js.native
  /**
    * Creates a sphere based upon an icosahedron with 20 triangular faces which can be subdivided
    * * The parameter `radius` sets the radius size (float) of the icosphere (default 1)
    * * You can set some different icosphere dimensions, for instance to build an ellipsoid, by using the parameters `radiusX`, `radiusY` and `radiusZ` (all by default have the same value than `radius`)
    * * The parameter `subdivisions` sets the number of subdivisions (postive integer, default 4). The more subdivisions, the more faces on the icosphere whatever its size
    * * The parameter `flat` (boolean, default true) gives each side its own normals. Set it to false to get a smooth continuous light reflection on the surface
    * * You can also set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns a new Mesh
    * @see http://doc.babylonjs.com/how_to/polyhedra_shapes#icosphere
    */
  def CreateIcoSphere(name: String, options: AnonUpdatable, scene: Scene): Mesh = js.native
  /**
    * Creates lathe mesh.
    * The lathe is a shape with a symetry axis : a 2D model shape is rotated around this axis to design the lathe.
    * Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be rotated in its local space : the shape must be designed in the xOy plane and will be rotated around the Y axis. It's usually a 2D shape, so the Vector3 z coordinates are often set to zero
    * @param radius is the radius value of the lathe
    * @param tessellation is the side number of the lathe.
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateLathe(name: String, shape: js.Array[Vector3], radius: Double, tessellation: Double, scene: Scene): Mesh = js.native
  def CreateLathe(
    name: String,
    shape: js.Array[Vector3],
    radius: Double,
    tessellation: Double,
    scene: Scene,
    updatable: Boolean
  ): Mesh = js.native
  def CreateLathe(
    name: String,
    shape: js.Array[Vector3],
    radius: Double,
    tessellation: Double,
    scene: Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): Mesh = js.native
  /**
    * Creates a line mesh. Please consider using the same method from the MeshBuilder class instead.
    * @param name defines the name of the mesh to create
    * @param points is an array successive Vector3
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (http://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines).
    * @returns a new Mesh
    */
  def CreateLines(name: String, points: js.Array[Vector3]): LinesMesh = js.native
  def CreateLines(name: String, points: js.Array[Vector3], scene: Nullable[Scene]): LinesMesh = js.native
  def CreateLines(name: String, points: js.Array[Vector3], scene: Nullable[Scene], updatable: Boolean): LinesMesh = js.native
  def CreateLines(
    name: String,
    points: js.Array[Vector3],
    scene: Nullable[Scene],
    updatable: Boolean,
    instance: Nullable[LinesMesh]
  ): LinesMesh = js.native
  /**
    * Creates a plane mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param size sets the size (float) of both sides of the plane at once (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreatePlane(name: String, size: Double, scene: Scene): Mesh = js.native
  def CreatePlane(name: String, size: Double, scene: Scene, updatable: Boolean): Mesh = js.native
  def CreatePlane(name: String, size: Double, scene: Scene, updatable: Boolean, sideOrientation: Double): Mesh = js.native
  /**
    * Creates a polygon mesh.Please consider using the same method from the MeshBuilder class instead
    * The polygon's shape will depend on the input parameters and is constructed parallel to a ground mesh.
    * The parameter `shape` is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors.
    * You can set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created.
    * Remember you can only change the shape positions, not their number when updating a polygon.
    * @see http://doc.babylonjs.com/how_to/parametric_shapes#non-regular-polygon
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
    * @param scene defines the hosting scene
    * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param earcutInjection can be used to inject your own earcut reference
    * @returns a new Mesh
    */
  def CreatePolygon(name: String, shape: js.Array[Vector3], scene: Scene): Mesh = js.native
  def CreatePolygon(name: String, shape: js.Array[Vector3], scene: Scene, holes: js.Array[js.Array[Vector3]]): Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[Vector3],
    scene: Scene,
    holes: js.Array[js.Array[Vector3]],
    updatable: Boolean
  ): Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[Vector3],
    scene: Scene,
    holes: js.Array[js.Array[Vector3]],
    updatable: Boolean,
    sideOrientation: Double
  ): Mesh = js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[Vector3],
    scene: Scene,
    holes: js.Array[js.Array[Vector3]],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: js.Any
  ): Mesh = js.native
  /**
    * Creates a polyhedron mesh.
    * Please consider using the same method from the MeshBuilder class instead.
    * * The parameter `type` (positive integer, max 14, default 0) sets the polyhedron type to build among the 15 embbeded types. Please refer to the type sheet in the tutorial to choose the wanted type
    * * The parameter `size` (positive float, default 1) sets the polygon size
    * * You can overwrite the `size` on each dimension bu using the parameters `sizeX`, `sizeY` or `sizeZ` (positive floats, default to `size` value)
    * * You can build other polyhedron types than the 15 embbeded ones by setting the parameter `custom` (`polyhedronObject`, default null). If you set the parameter `custom`, this overwrittes the parameter `type`
    * * A `polyhedronObject` is a formatted javascript object. You'll find a full file with pre-set polyhedra here : https://github.com/BabylonJS/Extensions/tree/master/Polyhedron
    * * You can set the color and the UV of each side of the polyhedron with the parameters `faceColors` (Color4, default `(1, 1, 1, 1)`) and faceUV (Vector4, default `(0, 0, 1, 1)`)
    * * To understand how to set `faceUV` or `faceColors`, please read this by considering the right number of faces of your polyhedron, instead of only 6 for the box : https://doc.babylonjs.com/how_to/createbox_per_face_textures_and_colors
    * * The parameter `flat` (boolean, default true). If set to false, it gives the polyhedron a single global face, so less vertices and shared normals. In this case, `faceColors` and `faceUV` are ignored
    * * You can also set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh to create
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns a new Mesh
    */
  def CreatePolyhedron(name: String, options: AnonFaceColors, scene: Scene): Mesh = js.native
  /**
    * Creates a ribbon mesh. Please consider using the same method from the MeshBuilder class instead
    * @see http://doc.babylonjs.com/how_to/parametric_shapes
    * @param name defines the name of the mesh to create
    * @param pathArray is a required array of paths, what are each an array of successive Vector3. The pathArray parameter depicts the ribbon geometry.
    * @param closeArray creates a seam between the first and the last paths of the path array (default is false)
    * @param closePath creates a seam between the first and the last points of each path of the path array
    * @param offset is taken in account only if the `pathArray` is containing a single path
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance defines an instance of an existing Ribbon object to be updated with the passed `pathArray` parameter (http://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#ribbon)
    * @returns a new Mesh
    */
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double
  ): Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: Scene
  ): Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: Scene,
    updatable: Boolean
  ): Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): Mesh = js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: Scene,
    updatable: Boolean,
    sideOrientation: Double,
    instance: Mesh
  ): Mesh = js.native
  /**
    * Creates a sphere mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param segments sets the sphere number of horizontal stripes (positive integer, default 32)
    * @param diameter sets the diameter size (float) of the sphere (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateSphere(name: String, segments: Double, diameter: Double): Mesh = js.native
  def CreateSphere(name: String, segments: Double, diameter: Double, scene: Scene): Mesh = js.native
  def CreateSphere(name: String, segments: Double, diameter: Double, scene: Scene, updatable: Boolean): Mesh = js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): Mesh = js.native
  /**
    * Creates a tiled ground mesh.
    * Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param xmin set the ground minimum X coordinate
    * @param zmin set the ground minimum Y coordinate
    * @param xmax set the ground maximum X coordinate
    * @param zmax set the ground maximum Z coordinate
    * @param subdivisions is an object `{w: positive integer, h: positive integer}` (default `{w: 6, h: 6}`). `w` and `h` are the numbers of subdivisions on the ground width and height. Each subdivision is called a tile
    * @param precision is an object `{w: positive integer, h: positive integer}` (default `{w: 2, h: 2}`). `w` and `h` are the numbers of subdivisions on the ground width and height of each tile
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @returns a new Mesh
    */
  def CreateTiledGround(
    name: String,
    xmin: Double,
    zmin: Double,
    xmax: Double,
    zmax: Double,
    subdivisions: AnonH,
    precision: AnonH,
    scene: Scene
  ): Mesh = js.native
  def CreateTiledGround(
    name: String,
    xmin: Double,
    zmin: Double,
    xmax: Double,
    zmax: Double,
    subdivisions: AnonH,
    precision: AnonH,
    scene: Scene,
    updatable: Boolean
  ): Mesh = js.native
  /**
    * Creates a torus mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param diameter sets the diameter size (float) of the torus (default 1)
    * @param thickness sets the diameter size of the tube of the torus (float, default 0.5)
    * @param tessellation sets the number of torus sides (postive integer, default 16)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateTorus(name: String, diameter: Double, thickness: Double, tessellation: Double): Mesh = js.native
  def CreateTorus(name: String, diameter: Double, thickness: Double, tessellation: Double, scene: Scene): Mesh = js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: Scene,
    updatable: Boolean
  ): Mesh = js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): Mesh = js.native
  /**
    * Creates a torus knot mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param radius sets the global radius size (float) of the torus knot (default 2)
    * @param tube sets the diameter size of the tube of the torus (float, default 0.5)
    * @param radialSegments sets the number of sides on each tube segments (positive integer, default 32)
    * @param tubularSegments sets the number of tubes to decompose the knot into (positive integer, default 32)
    * @param p the number of windings on X axis (positive integers, default 2)
    * @param q the number of windings on Y axis (positive integers, default 3)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double
  ): Mesh = js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: Scene
  ): Mesh = js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: Scene,
    updatable: Boolean
  ): Mesh = js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): Mesh = js.native
  /**
    * Creates a tube mesh.
    * The tube is a parametric shape.
    * It has no predefined shape. Its final shape will depend on the input parameters.
    * Please consider using the same method from the MeshBuilder class instead
    * @see http://doc.babylonjs.com/how_to/parametric_shapes
    * @param name defines the name of the mesh to create
    * @param path is a required array of successive Vector3. It is the curve used as the axis of the tube
    * @param radius sets the tube radius size
    * @param tessellation is the number of sides on the tubular surface
    * @param radiusFunction is a custom function. If it is not null, it overwrittes the parameter `radius`. This function is called on each point of the tube path and is passed the index `i` of the i-th point and the distance of this point from the first point of the path
    * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing Tube object to be updated with the passed `pathArray` parameter (http://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#tube)
    * @returns a new Mesh
    */
  def CreateTube(
    name: String,
    path: js.Array[Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: Scene
  ): Mesh = js.native
  def CreateTube(
    name: String,
    path: js.Array[Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: Scene,
    updatable: Boolean
  ): Mesh = js.native
  def CreateTube(
    name: String,
    path: js.Array[Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): Mesh = js.native
  def CreateTube(
    name: String,
    path: js.Array[Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: Scene,
    updatable: Boolean,
    sideOrientation: Double,
    instance: Mesh
  ): Mesh = js.native
  /**
    * Creates an extruded polygon mesh, with depth in the Y direction. Please consider using the same method from the MeshBuilder class instead.
    * @see http://doc.babylonjs.com/how_to/parametric_shapes#extruded-non-regular-polygon
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
    * @param depth defines the height of extrusion
    * @param scene defines the hosting scene
    * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param earcutInjection can be used to inject your own earcut reference
    * @returns a new Mesh
    */
  def ExtrudePolygon(name: String, shape: js.Array[Vector3], depth: Double, scene: Scene): Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[Vector3],
    depth: Double,
    scene: Scene,
    holes: js.Array[js.Array[Vector3]]
  ): Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[Vector3],
    depth: Double,
    scene: Scene,
    holes: js.Array[js.Array[Vector3]],
    updatable: Boolean
  ): Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[Vector3],
    depth: Double,
    scene: Scene,
    holes: js.Array[js.Array[Vector3]],
    updatable: Boolean,
    sideOrientation: Double
  ): Mesh = js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[Vector3],
    depth: Double,
    scene: Scene,
    holes: js.Array[js.Array[Vector3]],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: js.Any
  ): Mesh = js.native
  /**
    * Creates an extruded shape mesh.
    * The extrusion is a parametric shape. It has no predefined shape. Its final shape will depend on the input parameters. Please consider using the same method from the MeshBuilder class instead
    * @see http://doc.babylonjs.com/how_to/parametric_shapes
    * @see http://doc.babylonjs.com/how_to/parametric_shapes#extruded-shapes
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be extruded in its local space : the shape must be designed in the xOy plane and will be extruded along the Z axis
    * @param path is a required array of successive Vector3. This is the axis curve the shape is extruded along
    * @param scale is the value to scale the shape
    * @param rotation is the angle value to rotate the shape each step (each path point), from the former step (so rotation added each step) along the curve
    * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (http://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#extruded-shape)
    * @returns a new Mesh
    */
  def ExtrudeShape(
    name: String,
    shape: js.Array[Vector3],
    path: js.Array[Vector3],
    scale: Double,
    rotation: Double,
    cap: Double
  ): Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[Vector3],
    path: js.Array[Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[Scene]
  ): Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[Vector3],
    path: js.Array[Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[Scene],
    updatable: Boolean
  ): Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[Vector3],
    path: js.Array[Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[Scene],
    updatable: Boolean,
    sideOrientation: Double
  ): Mesh = js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[Vector3],
    path: js.Array[Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[Scene],
    updatable: Boolean,
    sideOrientation: Double,
    instance: Mesh
  ): Mesh = js.native
  /**
    * Creates an custom extruded shape mesh.
    * The custom extrusion is a parametric shape.
    * It has no predefined shape. Its final shape will depend on the input parameters.
    * Please consider using the same method from the MeshBuilder class instead
    * @see http://doc.babylonjs.com/how_to/parametric_shapes#extruded-shapes
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be extruded in its local space : the shape must be designed in the xOy plane and will be extruded along the Z axis
    * @param path is a required array of successive Vector3. This is the axis curve the shape is extruded along
    * @param scaleFunction is a custom Javascript function called on each path point
    * @param rotationFunction is a custom Javascript function called on each path point
    * @param ribbonCloseArray forces the extrusion underlying ribbon to close all the paths in its `pathArray`
    * @param ribbonClosePath forces the extrusion underlying ribbon to close its `pathArray`
    * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (http://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (http://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh#extruded-shape)
    * @returns a new Mesh
    */
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[Vector3],
    path: js.Array[Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: Scene
  ): Mesh = js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[Vector3],
    path: js.Array[Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: Scene,
    updatable: Boolean
  ): Mesh = js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[Vector3],
    path: js.Array[Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): Mesh = js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[Vector3],
    path: js.Array[Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: Scene,
    updatable: Boolean,
    sideOrientation: Double,
    instance: Mesh
  ): Mesh = js.native
  /**
    * Merge the array of meshes into a single mesh for performance reasons.
    * @param meshes defines he vertices source.  They should all be of the same material.  Entries can empty
    * @param disposeSource when true (default), dispose of the vertices from the source meshes
    * @param allow32BitsIndices when the sum of the vertices > 64k, this must be set to true
    * @param meshSubclass when set, vertices inserted into this Mesh.  Meshes can then be merged into a Mesh sub-class.
    * @param subdivideWithSubMeshes when true (false default), subdivide mesh to his subMesh array with meshes source.
    * @param multiMultiMaterials when true (false default), subdivide mesh and accept multiple multi materials, ignores subdivideWithSubMeshes.
    * @returns a new mesh
    */
  def MergeMeshes(meshes: js.Array[Mesh]): Nullable[Mesh] = js.native
  def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean): Nullable[Mesh] = js.native
  def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean, allow32BitsIndices: Boolean): Nullable[Mesh] = js.native
  def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean, allow32BitsIndices: Boolean, meshSubclass: Mesh): Nullable[Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[Mesh] = js.native
  def MergeMeshes(
    meshes: js.Array[Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[Mesh] = js.native
  /**
    * Returns an object containing a min and max Vector3 which are the minimum and maximum vectors of each mesh bounding box from the passed array, in the world coordinates
    * @param meshes defines the list of meshes to scan
    * @returns an object `{min:` Vector3`, max:` Vector3`}`
    */
  def MinMax(meshes: js.Array[AbstractMesh]): AnonMax = js.native
  /**
    * Returns a new Mesh object parsed from the source provided.
    * @param parsedMesh is the source
    * @param scene defines the hosting scene
    * @param rootUrl is the root URL to prefix the `delayLoadingFile` property with
    * @returns a new Mesh
    */
  def Parse(parsedMesh: js.Any, scene: Scene, rootUrl: String): Mesh = js.native
  /**
    * Gets the default side orientation.
    * @param orientation the orientation to value to attempt to get
    * @returns the default orientation
    * @hidden
    */
  def _GetDefaultSideOrientation(): Double = js.native
  def _GetDefaultSideOrientation(orientation: Double): Double = js.native
  /** @hidden */
  def _GroundMeshParser(parsedMesh: js.Any, scene: Scene): Mesh = js.native
  /** @hidden */
  def _PhysicsImpostorParser(scene: Scene, physicObject: IPhysicsEnabledObject, jsonObject: js.Any): PhysicsImpostor = js.native
  /** @hidden */
  def _instancedMeshFactory(name: String, mesh: Mesh): InstancedMesh = js.native
}

