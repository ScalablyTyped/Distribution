package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.anon.Custom
import typings.babylonjs.anon.Data
import typings.babylonjs.anon.DeepImmutableObjectMatrix
import typings.babylonjs.anon.Flat
import typings.babylonjs.anon.H
import typings.babylonjs.anon.Max
import typings.babylonjs.anon.Report
import typings.babylonjs.boundingSphereMod.BoundingSphere
import typings.babylonjs.bufferMod.Buffer
import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.capsuleBuilderMod.ICreateCapsuleOptions
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.geometryMod.Geometry
import typings.babylonjs.groundMeshMod.GroundMesh
import typings.babylonjs.instancedMeshMod.InstancedMesh
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.linesMeshMod.LinesMesh
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathPathMod.Path3D
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshMod {
  
  @JSImport("babylonjs/Meshes/mesh", "_CreationDataStorage")
  @js.native
  class CreationDataStorage () extends StObject {
    
    var arc: Double = js.native
    
    var cap: Double = js.native
    
    var closeArray: js.UndefOr[Boolean] = js.native
    
    var closePath: js.UndefOr[Boolean] = js.native
    
    var dashSize: Double = js.native
    
    var gapSize: Double = js.native
    
    var idx: js.Array[Double] = js.native
    
    var path3D: Path3D = js.native
    
    var pathArray: js.Array[js.Array[Vector3]] = js.native
    
    var radius: Double = js.native
    
    var tessellation: Double = js.native
  }
  
  @JSImport("babylonjs/Meshes/mesh", "_InstancesBatch")
  @js.native
  class InstancesBatch () extends StObject {
    
    var hardwareInstancedRendering: js.Array[Boolean] = js.native
    
    var mustReturn: Boolean = js.native
    
    var renderSelf: js.Array[Boolean] = js.native
    
    var visibleInstances: js.Array[Nullable[js.Array[InstancedMesh]]] = js.native
  }
  
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
    def this(name: String, scene: js.UndefOr[Nullable[Scene]], parent: Nullable[Node]) = this()
    def this(
      name: String,
      scene: js.UndefOr[Nullable[Scene]],
      parent: js.UndefOr[Nullable[Node]],
      source: Nullable[Mesh]
    ) = this()
    def this(
      name: String,
      scene: js.UndefOr[Nullable[Scene]],
      parent: js.UndefOr[Nullable[Node]],
      source: js.UndefOr[Nullable[Mesh]],
      doNotCloneChildren: Boolean
    ) = this()
    def this(
      name: String,
      scene: js.UndefOr[Nullable[Scene]],
      parent: js.UndefOr[Nullable[Node]],
      source: js.UndefOr[Nullable[Mesh]],
      doNotCloneChildren: js.UndefOr[scala.Nothing],
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: js.UndefOr[Nullable[Scene]],
      parent: js.UndefOr[Nullable[Node]],
      source: js.UndefOr[Nullable[Mesh]],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    
    /** @hidden */
    var _binaryInfo: js.Any = js.native
    
    /** @hidden */
    def _bind(subMesh: SubMesh, effect: Effect, fillMode: Double): Mesh = js.native
    
    /** @hidden */
    def _checkDelayState(): Mesh = js.native
    
    /** @hidden */
    def _createGlobalSubMesh(force: Boolean): Nullable[SubMesh] = js.native
    
    /** @hidden */
    var _creationDataStorage: Nullable[CreationDataStorage] = js.native
    
    /** @hidden */
    var _delayInfo: js.Array[String] = js.native
    
    /** @hidden */
    def _delayLoadingFunction(any: js.Any, mesh: Mesh): Unit = js.native
    
    /** @hidden */
    def _disposeInstanceSpecificData(): Unit = js.native
    
    /** @hidden */
    def _disposeThinInstanceSpecificData(): Unit = js.native
    
    /** @hidden */
    def _draw(subMesh: SubMesh, fillMode: Double): Mesh = js.native
    def _draw(subMesh: SubMesh, fillMode: Double, instancesCount: Double): Mesh = js.native
    
    var _effectiveMaterial: js.Any = js.native
    
    /** @hidden */
    var _geometry: Nullable[Geometry] = js.native
    
    /** @hidden */
    def _getInstancesRenderList(subMeshId: Double): InstancesBatch = js.native
    def _getInstancesRenderList(subMeshId: Double, isReplacementMode: Boolean): InstancesBatch = js.native
    
    /** @hidden */
    var _instanceDataStorage: InstanceDataStorage = js.native
    
    var _internalMeshDataInfo: js.Any = js.native
    
    /** @hidden */
    def _isMesh: Boolean = js.native
    
    var _onBeforeDraw: js.Any = js.native
    
    var _onBeforeDrawObserver: js.Any = js.native
    
    /** @hidden */
    var _originalBuilderSideOrientation: Double = js.native
    
    /** @hidden */
    def _processInstancedBuffers(visibleInstances: js.Array[InstancedMesh], renderSelf: Boolean): Unit = js.native
    
    /** @hidden */
    def _processRendering(
      renderingMesh: AbstractMesh,
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
      renderingMesh: AbstractMesh,
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
    
    var _queueLoad: js.Any = js.native
    
    /** @hidden */
    def _registerInstanceForRenderId(instance: InstancedMesh, renderId: Double): Mesh = js.native
    
    /** @hidden */
    def _renderWithInstances(subMesh: SubMesh, fillMode: Double, batch: InstancesBatch, effect: Effect, engine: Engine): Mesh = js.native
    
    /** @hidden */
    def _renderWithThinInstances(subMesh: SubMesh, fillMode: Double, effect: Effect, engine: Engine): Unit = js.native
    
    /** @hidden */
    def _resetPointsArrayCache(): Mesh = js.native
    
    /** @hidden */
    var _shouldGenerateFlatShading: Boolean = js.native
    
    var _sortLODLevels: js.Any = js.native
    
    /** @hidden */
    def _syncGeometryWithMorphTargetManager(): Unit = js.native
    
    /** @hidden */
    var _thinInstanceDataStorage: ThinInstanceDataStorage = js.native
    
    /** @hidden */
    def _thinInstanceInitializeUserStorage(): Unit = js.native
    
    /** @hidden */
    def _thinInstanceUpdateBufferSize(kind: String, numInstances: Double): Unit = js.native
    
    /** @hidden */
    var _userInstancedBuffersStorage: Data = js.native
    
    /** @hidden */
    var _userThinInstanceBuffersStorage: Data = js.native
    
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
      onSuccess: js.UndefOr[scala.Nothing],
      uvOffset: js.UndefOr[scala.Nothing],
      uvScale: js.UndefOr[scala.Nothing],
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: js.UndefOr[scala.Nothing],
      uvOffset: js.UndefOr[scala.Nothing],
      uvScale: Vector2
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: js.UndefOr[scala.Nothing],
      uvOffset: js.UndefOr[scala.Nothing],
      uvScale: Vector2,
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: js.UndefOr[scala.Nothing],
      uvOffset: Vector2
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: js.UndefOr[scala.Nothing],
      uvOffset: Vector2,
      uvScale: js.UndefOr[scala.Nothing],
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: js.UndefOr[scala.Nothing],
      uvOffset: Vector2,
      uvScale: Vector2
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: js.UndefOr[scala.Nothing],
      uvOffset: Vector2,
      uvScale: Vector2,
      forceUpdate: Boolean
    ): Mesh = js.native
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
      uvOffset: js.UndefOr[scala.Nothing],
      uvScale: js.UndefOr[scala.Nothing],
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: js.Function1[/* mesh */ this.type, Unit],
      uvOffset: js.UndefOr[scala.Nothing],
      uvScale: Vector2
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: js.Function1[/* mesh */ this.type, Unit],
      uvOffset: js.UndefOr[scala.Nothing],
      uvScale: Vector2,
      forceUpdate: Boolean
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
      uvScale: js.UndefOr[scala.Nothing],
      forceUpdate: Boolean
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
      uvOffset: js.UndefOr[scala.Nothing],
      uvScale: js.UndefOr[scala.Nothing],
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMapFromBuffer(
      buffer: Uint8Array,
      heightMapWidth: Double,
      heightMapHeight: Double,
      minHeight: Double,
      maxHeight: Double,
      uvOffset: js.UndefOr[scala.Nothing],
      uvScale: Vector2
    ): Mesh = js.native
    def applyDisplacementMapFromBuffer(
      buffer: Uint8Array,
      heightMapWidth: Double,
      heightMapHeight: Double,
      minHeight: Double,
      maxHeight: Double,
      uvOffset: js.UndefOr[scala.Nothing],
      uvScale: Vector2,
      forceUpdate: Boolean
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
      uvScale: js.UndefOr[scala.Nothing],
      forceUpdate: Boolean
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
      * @see https://doc.babylonjs.com/resources/baking_transformations
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
      * @see https://doc.babylonjs.com/resources/baking_transformations
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
    
    def clone(
      name: js.UndefOr[scala.Nothing],
      newParent: js.UndefOr[Nullable[Node]],
      doNotCloneChildren: js.UndefOr[scala.Nothing],
      clonePhysicsImpostor: Boolean
    ): Mesh = js.native
    def clone(
      name: js.UndefOr[scala.Nothing],
      newParent: js.UndefOr[Nullable[Node]],
      doNotCloneChildren: Boolean
    ): Mesh = js.native
    def clone(
      name: js.UndefOr[scala.Nothing],
      newParent: js.UndefOr[Nullable[Node]],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ): Mesh = js.native
    def clone(name: js.UndefOr[scala.Nothing], newParent: Nullable[Node]): Mesh = js.native
    def clone(name: String): Mesh = js.native
    def clone(
      name: String,
      newParent: js.UndefOr[Nullable[Node]],
      doNotCloneChildren: js.UndefOr[scala.Nothing],
      clonePhysicsImpostor: Boolean
    ): Mesh = js.native
    def clone(
      name: String,
      newParent: js.UndefOr[Nullable[Node]],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ): Mesh = js.native
    
    /**
      * Gets the list of clones of this mesh
      * The scene must have been constructed with useClonedMeshMap=true for this to work!
      * Note that useClonedMeshMap=true is the default setting
      */
    def cloneMeshMap: Nullable[StringDictionary[js.UndefOr[Mesh]]] = js.native
    
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
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances
      * @param name defines the name of the new instance
      * @returns a new InstancedMesh
      */
    def createInstance(name: String): InstancedMesh = js.native
    
    /**
      * Gets the delay loading state of the mesh (when delay loading is turned on)
      * @see https://doc.babylonjs.com/how_to/using_the_incremental_loading_system
      */
    var delayLoadState: Double = js.native
    
    /**
      * Gets the file containing delay loading data for this mesh
      */
    var delayLoadingFile: String = js.native
    
    /**
      * true to use the edge renderer for all instances of this mesh
      */
    var edgesShareWithInstances: Boolean = js.native
    
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
    
    /**
      * Gets the list of instances created from this mesh
      * it is not supposed to be modified manually.
      * Note also that the order of the InstancedMesh wihin the array is not significant and might change.
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances
      */
    var instances: js.Array[InstancedMesh] = js.native
    
    def isReady(completeCheck: js.UndefOr[scala.Nothing], forceInstanceSupport: Boolean): Boolean = js.native
    def isReady(completeCheck: Boolean, forceInstanceSupport: Boolean): Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating that this mesh does not use index buffer
      */
    def isUnIndexed: Boolean = js.native
    def isUnIndexed_=(value: Boolean): Unit = js.native
    
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
    def manualUpdateOfWorldMatrixInstancedBuffer_=(value: Boolean): Unit = js.native
    
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
      * @see https://doc.babylonjs.com/how_to/how_to_use_morphtargets
      */
    def morphTargetManager: Nullable[MorphTargetManager] = js.native
    def morphTargetManager_=(value: Nullable[MorphTargetManager]): Unit = js.native
    
    var normalizeSkinFourWeights: js.Any = js.native
    
    var normalizeSkinWeightsAndExtra: js.Any = js.native
    
    /**
      * An event triggered after rendering the mesh
      */
    def onAfterRenderObservable: Observable[Mesh] = js.native
    
    /**
      * An event triggered before binding the mesh
      */
    def onBeforeBindObservable: Observable[Mesh] = js.native
    
    /**
      * An event triggered before drawing the mesh
      */
    def onBeforeDrawObservable: Observable[Mesh] = js.native
    
    /**
      * Sets a callback to call before drawing the mesh. It is recommended to use onBeforeDrawObservable instead
      */
    def onBeforeDraw_=(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * An event triggered before rendering the mesh
      */
    def onBeforeRenderObservable: Observable[Mesh] = js.native
    
    /**
      * User defined function used to change how LOD level selection is done
      * @see https://doc.babylonjs.com/how_to/how_to_use_lod
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
      * Use this property to change the original side orientation defined at construction time
      */
    var overrideMaterialSideOrientation: Nullable[Double] = js.native
    
    /**
      * Sets a value overriding the instance count. Only applicable when custom instanced InterleavedVertexBuffer are used rather than InstancedMeshs
      */
    def overridenInstanceCount_=(count: Double): Unit = js.native
    
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
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: js.UndefOr[scala.Nothing],
      simplificationType: js.UndefOr[scala.Nothing],
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: js.UndefOr[scala.Nothing],
      simplificationType: SimplificationType
    ): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: js.UndefOr[scala.Nothing],
      simplificationType: SimplificationType,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: js.UndefOr[scala.Nothing],
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
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
    
    def thinInstanceAdd(matrix: js.Array[DeepImmutableObjectMatrix], refresh: Boolean): Double = js.native
    /**
      * Creates a new thin instance
      * @param matrix the matrix or array of matrices (position, rotation, scale) of the thin instance(s) to create
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      * @returns the thin instance index number. If you pass an array of matrices, other instance indexes are index+1, index+2, etc
      */
    def thinInstanceAdd(matrix: DeepImmutableObjectMatrix, refresh: Boolean): Double = js.native
    
    /**
      * Adds the transformation (matrix) of the current mesh as a thin instance
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      * @returns the thin instance index number
      */
    def thinInstanceAddSelf(refresh: Boolean): Double = js.native
    
    /**
      * Synchronize the gpu buffers with a thin instance buffer. Call this method if you update later on the buffers passed to thinInstanceSetBuffer
      * @param kind name of the attribute to update. Use "matrix" to update the buffer of matrices
      */
    def thinInstanceBufferUpdated(kind: String): Unit = js.native
    
    /**
      * Gets / sets the number of thin instances to display. Note that you can't set a number higher than what the underlying buffer can handle.
      */
    var thinInstanceCount: Double = js.native
    
    /**
      * Gets or sets a boolean defining if we want picking to pick thin instances as well
      */
    var thinInstanceEnablePicking: Boolean = js.native
    
    /**
      * Gets the list of world matrices
      * @return an array containing all the world matrices from the thin instances
      */
    def thinInstanceGetWorldMatrices(): js.Array[Matrix] = js.native
    
    /**
      * Applies a partial update to a buffer directly on the GPU
      * Note that the buffer located on the CPU is NOT updated! It's up to you to update it (or not) with the same data you pass to this method
      * @param kind name of the attribute to update. Use "matrix" to update the buffer of matrices
      * @param data the data to set in the GPU buffer
      * @param offset the offset in the GPU buffer where to update the data
      */
    def thinInstancePartialBufferUpdate(kind: String, data: Float32Array, offset: Double): Unit = js.native
    
    /**
      * Refreshes the bounding info, taking into account all the thin instances defined
      * @param forceRefreshParentInfo true to force recomputing the mesh bounding info and use it to compute the aggregated bounding info
      */
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Boolean): Unit = js.native
    
    /**
      * Registers a custom attribute to be used with thin instances
      * @param kind name of the attribute
      * @param stride size in floats of the attribute
      */
    def thinInstanceRegisterAttribute(kind: String, stride: Double): Unit = js.native
    
    /**
      * Sets the value of a custom attribute for a thin instance
      * @param kind name of the attribute
      * @param index index of the thin instance
      * @param value value to set
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      */
    def thinInstanceSetAttributeAt(kind: String, index: Double, value: js.Array[Double], refresh: Boolean): Unit = js.native
    
    /**
      * Sets a buffer to be used with thin instances. This method is a faster way to setup multiple instances than calling thinInstanceAdd repeatedly
      * @param kind name of the attribute. Use "matrix" to setup the buffer of matrices
      * @param buffer buffer to set
      * @param stride size in floats of each value of the buffer
      * @param staticBuffer indicates that the buffer is static, so that you won't change it after it is set (better performances - false by default)
      */
    def thinInstanceSetBuffer(kind: String, buffer: Nullable[Float32Array], stride: Double, staticBuffer: Boolean): Unit = js.native
    
    /**
      * Sets the matrix of a thin instance
      * @param index index of the thin instance
      * @param matrix matrix to set
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      */
    def thinInstanceSetMatrixAt(index: Double, matrix: DeepImmutableObjectMatrix, refresh: Boolean): Unit = js.native
    
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
      * @see https://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh#other-shapes-updatemeshpositions
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
  /* static members */
  object Mesh {
    
    /**
      * Mesh side orientation : usually the internal or back surface
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.BACKSIDE")
    @js.native
    val BACKSIDE: Double = js.native
    
    /**
      * Mesh tile positioning : part tiles on bottom
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.BOTTOM")
    @js.native
    val BOTTOM: Double = js.native
    
    /**
      * Mesh cap setting : two caps, one at the beginning  and one at the end of the mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CAP_ALL")
    @js.native
    val CAP_ALL: Double = js.native
    
    /**
      * Mesh cap setting : one cap at the end of the mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CAP_END")
    @js.native
    val CAP_END: Double = js.native
    
    /**
      * Mesh cap setting : one cap at the beginning of the mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CAP_START")
    @js.native
    val CAP_START: Double = js.native
    
    /**
      * Mesh tile positioning : part tiles same on left/right or top/bottom
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CENTER")
    @js.native
    val CENTER: Double = js.native
    
    @JSImport("babylonjs/Meshes/mesh", "Mesh.Center")
    @js.native
    def Center(meshesOrMinMaxVector: js.Array[AbstractMesh]): Vector3 = js.native
    /**
      * Returns the center of the `{min:` Vector3`, max:` Vector3`}` or the center of MinMax vector3 computed from a mesh array
      * @param meshesOrMinMaxVector could be an array of meshes or a `{min:` Vector3`, max:` Vector3`}` object
      * @returns a vector3
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.Center")
    @js.native
    def Center(meshesOrMinMaxVector: Max): Vector3 = js.native
    
    /**
      * Creates a box mesh. Please consider using the same method from the MeshBuilder class instead
      * @param name defines the name of the mesh to create
      * @param size sets the size (float) of each box side (default 1)
      * @param scene defines the hosting scene
      * @param updatable defines if the mesh must be flagged as updatable
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateBox")
    @js.native
    def CreateBox(name: String, size: Double): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateBox")
    @js.native
    def CreateBox(
      name: String,
      size: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateBox")
    @js.native
    def CreateBox(name: String, size: Double, scene: js.UndefOr[Nullable[Scene]], updatable: Boolean): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateBox")
    @js.native
    def CreateBox(
      name: String,
      size: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: Boolean,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateBox")
    @js.native
    def CreateBox(name: String, size: Double, scene: Nullable[Scene]): Mesh = js.native
    
    /** Creates a Capsule Mesh
      * @param name defines the name of the mesh.
      * @param options the constructors options used to shape the mesh.
      * @param scene defines the scene the mesh is scoped to.
      * @returns the capsule mesh
      * @see https://doc.babylonjs.com/how_to/capsule_shape
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateCapsule")
    @js.native
    def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: Scene): Mesh = js.native
    
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
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateCylinder")
    @js.native
    def CreateCylinder(
      name: String,
      height: Double,
      diameterTop: Double,
      diameterBottom: Double,
      tessellation: Double,
      subdivisions: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateCylinder")
    @js.native
    def CreateCylinder(
      name: String,
      height: Double,
      diameterTop: Double,
      diameterBottom: Double,
      tessellation: Double,
      subdivisions: js.Any,
      scene: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateCylinder")
    @js.native
    def CreateCylinder(
      name: String,
      height: Double,
      diameterTop: Double,
      diameterBottom: Double,
      tessellation: Double,
      subdivisions: js.Any,
      scene: js.UndefOr[scala.Nothing],
      updatable: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateCylinder")
    @js.native
    def CreateCylinder(
      name: String,
      height: Double,
      diameterTop: Double,
      diameterBottom: Double,
      tessellation: Double,
      subdivisions: js.Any,
      scene: js.UndefOr[scala.Nothing],
      updatable: js.Any,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateCylinder")
    @js.native
    def CreateCylinder(
      name: String,
      height: Double,
      diameterTop: Double,
      diameterBottom: Double,
      tessellation: Double,
      subdivisions: js.Any,
      scene: Scene
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateCylinder")
    @js.native
    def CreateCylinder(
      name: String,
      height: Double,
      diameterTop: Double,
      diameterBottom: Double,
      tessellation: Double,
      subdivisions: js.Any,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateCylinder")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateCylinder")
    @js.native
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
      * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateDashedLines")
    @js.native
    def CreateDashedLines(name: String, points: js.Array[Vector3], dashSize: Double, gapSize: Double, dashNb: Double): LinesMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateDashedLines")
    @js.native
    def CreateDashedLines(
      name: String,
      points: js.Array[Vector3],
      dashSize: Double,
      gapSize: Double,
      dashNb: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: js.UndefOr[scala.Nothing],
      instance: LinesMesh
    ): LinesMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateDashedLines")
    @js.native
    def CreateDashedLines(
      name: String,
      points: js.Array[Vector3],
      dashSize: Double,
      gapSize: Double,
      dashNb: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: Boolean
    ): LinesMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateDashedLines")
    @js.native
    def CreateDashedLines(
      name: String,
      points: js.Array[Vector3],
      dashSize: Double,
      gapSize: Double,
      dashNb: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: Boolean,
      instance: LinesMesh
    ): LinesMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateDashedLines")
    @js.native
    def CreateDashedLines(
      name: String,
      points: js.Array[Vector3],
      dashSize: Double,
      gapSize: Double,
      dashNb: Double,
      scene: Nullable[Scene]
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateDecal")
    @js.native
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
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateDisc")
    @js.native
    def CreateDisc(name: String, radius: Double, tessellation: Double): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateDisc")
    @js.native
    def CreateDisc(
      name: String,
      radius: Double,
      tessellation: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateDisc")
    @js.native
    def CreateDisc(
      name: String,
      radius: Double,
      tessellation: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateDisc")
    @js.native
    def CreateDisc(
      name: String,
      radius: Double,
      tessellation: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: Boolean,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateDisc")
    @js.native
    def CreateDisc(name: String, radius: Double, tessellation: Double, scene: Nullable[Scene]): Mesh = js.native
    
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGround")
    @js.native
    def CreateGround(name: String, width: Double, height: Double, subdivisions: Double): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGround")
    @js.native
    def CreateGround(
      name: String,
      width: Double,
      height: Double,
      subdivisions: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGround")
    @js.native
    def CreateGround(name: String, width: Double, height: Double, subdivisions: Double, scene: Scene): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGround")
    @js.native
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
      * @see https://doc.babylonjs.com/babylon101/height_map
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGroundFromHeightMap")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGroundFromHeightMap")
    @js.native
    def CreateGroundFromHeightMap(
      name: String,
      url: String,
      width: Double,
      height: Double,
      subdivisions: Double,
      minHeight: Double,
      maxHeight: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      onReady: js.UndefOr[scala.Nothing],
      alphaFilter: Double
    ): GroundMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGroundFromHeightMap")
    @js.native
    def CreateGroundFromHeightMap(
      name: String,
      url: String,
      width: Double,
      height: Double,
      subdivisions: Double,
      minHeight: Double,
      maxHeight: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      onReady: js.Function1[/* mesh */ GroundMesh, Unit]
    ): GroundMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGroundFromHeightMap")
    @js.native
    def CreateGroundFromHeightMap(
      name: String,
      url: String,
      width: Double,
      height: Double,
      subdivisions: Double,
      minHeight: Double,
      maxHeight: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      onReady: js.Function1[/* mesh */ GroundMesh, Unit],
      alphaFilter: Double
    ): GroundMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGroundFromHeightMap")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGroundFromHeightMap")
    @js.native
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
      onReady: js.UndefOr[scala.Nothing],
      alphaFilter: Double
    ): GroundMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGroundFromHeightMap")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateGroundFromHeightMap")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateHemisphere")
    @js.native
    def CreateHemisphere(name: String, segments: Double, diameter: Double): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateHemisphere")
    @js.native
    def CreateHemisphere(name: String, segments: Double, diameter: Double, scene: Scene): Mesh = js.native
    
    /**
      * Creates a sphere based upon an icosahedron with 20 triangular faces which can be subdivided
      * * The parameter `radius` sets the radius size (float) of the icosphere (default 1)
      * * You can set some different icosphere dimensions, for instance to build an ellipsoid, by using the parameters `radiusX`, `radiusY` and `radiusZ` (all by default have the same value than `radius`)
      * * The parameter `subdivisions` sets the number of subdivisions (postive integer, default 4). The more subdivisions, the more faces on the icosphere whatever its size
      * * The parameter `flat` (boolean, default true) gives each side its own normals. Set it to false to get a smooth continuous light reflection on the surface
      * * You can also set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
      * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
      * @param name defines the name of the mesh
      * @param options defines the options used to create the mesh
      * @param scene defines the hosting scene
      * @returns a new Mesh
      * @see https://doc.babylonjs.com/how_to/polyhedra_shapes#icosphere
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateIcoSphere")
    @js.native
    def CreateIcoSphere(name: String, options: Flat, scene: Scene): Mesh = js.native
    
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
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateLathe")
    @js.native
    def CreateLathe(name: String, shape: js.Array[Vector3], radius: Double, tessellation: Double, scene: Scene): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateLathe")
    @js.native
    def CreateLathe(
      name: String,
      shape: js.Array[Vector3],
      radius: Double,
      tessellation: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateLathe")
    @js.native
    def CreateLathe(
      name: String,
      shape: js.Array[Vector3],
      radius: Double,
      tessellation: Double,
      scene: Scene,
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateLathe")
    @js.native
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
      * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines).
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateLines")
    @js.native
    def CreateLines(name: String, points: js.Array[Vector3]): LinesMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateLines")
    @js.native
    def CreateLines(
      name: String,
      points: js.Array[Vector3],
      scene: js.UndefOr[Nullable[Scene]],
      updatable: js.UndefOr[scala.Nothing],
      instance: Nullable[LinesMesh]
    ): LinesMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateLines")
    @js.native
    def CreateLines(name: String, points: js.Array[Vector3], scene: js.UndefOr[Nullable[Scene]], updatable: Boolean): LinesMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateLines")
    @js.native
    def CreateLines(
      name: String,
      points: js.Array[Vector3],
      scene: js.UndefOr[Nullable[Scene]],
      updatable: Boolean,
      instance: Nullable[LinesMesh]
    ): LinesMesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateLines")
    @js.native
    def CreateLines(name: String, points: js.Array[Vector3], scene: Nullable[Scene]): LinesMesh = js.native
    
    /**
      * Creates a plane mesh. Please consider using the same method from the MeshBuilder class instead
      * @param name defines the name of the mesh to create
      * @param size sets the size (float) of both sides of the plane at once (default 1)
      * @param scene defines the hosting scene
      * @param updatable defines if the mesh must be flagged as updatable
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePlane")
    @js.native
    def CreatePlane(name: String, size: Double, scene: Scene): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePlane")
    @js.native
    def CreatePlane(
      name: String,
      size: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePlane")
    @js.native
    def CreatePlane(name: String, size: Double, scene: Scene, updatable: Boolean): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePlane")
    @js.native
    def CreatePlane(name: String, size: Double, scene: Scene, updatable: Boolean, sideOrientation: Double): Mesh = js.native
    
    /**
      * Creates a polygon mesh.Please consider using the same method from the MeshBuilder class instead
      * The polygon's shape will depend on the input parameters and is constructed parallel to a ground mesh.
      * The parameter `shape` is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors.
      * You can set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created.
      * Remember you can only change the shape positions, not their number when updating a polygon.
      * @see https://doc.babylonjs.com/how_to/parametric_shapes#non-regular-polygon
      * @param name defines the name of the mesh to create
      * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
      * @param scene defines the hosting scene
      * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
      * @param updatable defines if the mesh must be flagged as updatable
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @param earcutInjection can be used to inject your own earcut reference
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(name: String, shape: js.Array[Vector3], scene: Scene): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: js.UndefOr[scala.Nothing],
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double,
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: js.UndefOr[scala.Nothing],
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: Double,
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(name: String, shape: js.Array[Vector3], scene: Scene, holes: js.Array[js.Array[Vector3]]): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: js.UndefOr[scala.Nothing],
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double,
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: Boolean,
      sideOrientation: js.UndefOr[scala.Nothing],
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
    def CreatePolygon(
      name: String,
      shape: js.Array[Vector3],
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: Boolean,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolygon")
    @js.native
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
      * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
      * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
      * @param name defines the name of the mesh to create
      * @param options defines the options used to create the mesh
      * @param scene defines the hosting scene
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreatePolyhedron")
    @js.native
    def CreatePolyhedron(name: String, options: Custom, scene: Scene): Mesh = js.native
    
    /**
      * Creates a ribbon mesh. Please consider using the same method from the MeshBuilder class instead
      * @see https://doc.babylonjs.com/how_to/parametric_shapes
      * @param name defines the name of the mesh to create
      * @param pathArray is a required array of paths, what are each an array of successive Vector3. The pathArray parameter depicts the ribbon geometry.
      * @param closeArray creates a seam between the first and the last paths of the path array (default is false)
      * @param closePath creates a seam between the first and the last points of each path of the path array
      * @param offset is taken in account only if the `pathArray` is containing a single path
      * @param scene defines the hosting scene
      * @param updatable defines if the mesh must be flagged as updatable
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @param instance defines an instance of an existing Ribbon object to be updated with the passed `pathArray` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#ribbon)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: js.UndefOr[scala.Nothing],
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double,
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: js.UndefOr[scala.Nothing],
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: Double,
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: Scene
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: js.UndefOr[scala.Nothing],
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double,
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: Scene,
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
    def CreateRibbon(
      name: String,
      pathArray: js.Array[js.Array[Vector3]],
      closeArray: Boolean,
      closePath: Boolean,
      offset: Double,
      scene: Scene,
      updatable: Boolean,
      sideOrientation: js.UndefOr[scala.Nothing],
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateRibbon")
    @js.native
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
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateSphere")
    @js.native
    def CreateSphere(name: String, segments: Double, diameter: Double): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateSphere")
    @js.native
    def CreateSphere(
      name: String,
      segments: Double,
      diameter: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateSphere")
    @js.native
    def CreateSphere(
      name: String,
      segments: Double,
      diameter: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateSphere")
    @js.native
    def CreateSphere(
      name: String,
      segments: Double,
      diameter: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateSphere")
    @js.native
    def CreateSphere(name: String, segments: Double, diameter: Double, scene: Scene): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateSphere")
    @js.native
    def CreateSphere(
      name: String,
      segments: Double,
      diameter: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateSphere")
    @js.native
    def CreateSphere(name: String, segments: Double, diameter: Double, scene: Scene, updatable: Boolean): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateSphere")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTiledGround")
    @js.native
    def CreateTiledGround(
      name: String,
      xmin: Double,
      zmin: Double,
      xmax: Double,
      zmax: Double,
      subdivisions: H,
      precision: H,
      scene: Scene
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTiledGround")
    @js.native
    def CreateTiledGround(
      name: String,
      xmin: Double,
      zmin: Double,
      xmax: Double,
      zmax: Double,
      subdivisions: H,
      precision: H,
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
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorus")
    @js.native
    def CreateTorus(name: String, diameter: Double, thickness: Double, tessellation: Double): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorus")
    @js.native
    def CreateTorus(
      name: String,
      diameter: Double,
      thickness: Double,
      tessellation: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorus")
    @js.native
    def CreateTorus(
      name: String,
      diameter: Double,
      thickness: Double,
      tessellation: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorus")
    @js.native
    def CreateTorus(
      name: String,
      diameter: Double,
      thickness: Double,
      tessellation: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorus")
    @js.native
    def CreateTorus(name: String, diameter: Double, thickness: Double, tessellation: Double, scene: Scene): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorus")
    @js.native
    def CreateTorus(
      name: String,
      diameter: Double,
      thickness: Double,
      tessellation: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorus")
    @js.native
    def CreateTorus(
      name: String,
      diameter: Double,
      thickness: Double,
      tessellation: Double,
      scene: Scene,
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorus")
    @js.native
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
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorusKnot")
    @js.native
    def CreateTorusKnot(
      name: String,
      radius: Double,
      tube: Double,
      radialSegments: Double,
      tubularSegments: Double,
      p: Double,
      q: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorusKnot")
    @js.native
    def CreateTorusKnot(
      name: String,
      radius: Double,
      tube: Double,
      radialSegments: Double,
      tubularSegments: Double,
      p: Double,
      q: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorusKnot")
    @js.native
    def CreateTorusKnot(
      name: String,
      radius: Double,
      tube: Double,
      radialSegments: Double,
      tubularSegments: Double,
      p: Double,
      q: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorusKnot")
    @js.native
    def CreateTorusKnot(
      name: String,
      radius: Double,
      tube: Double,
      radialSegments: Double,
      tubularSegments: Double,
      p: Double,
      q: Double,
      scene: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorusKnot")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorusKnot")
    @js.native
    def CreateTorusKnot(
      name: String,
      radius: Double,
      tube: Double,
      radialSegments: Double,
      tubularSegments: Double,
      p: Double,
      q: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorusKnot")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTorusKnot")
    @js.native
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
      * @see https://doc.babylonjs.com/how_to/parametric_shapes
      * @param name defines the name of the mesh to create
      * @param path is a required array of successive Vector3. It is the curve used as the axis of the tube
      * @param radius sets the tube radius size
      * @param tessellation is the number of sides on the tubular surface
      * @param radiusFunction is a custom function. If it is not null, it overwrittes the parameter `radius`. This function is called on each point of the tube path and is passed the index `i` of the i-th point and the distance of this point from the first point of the path
      * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
      * @param scene defines the hosting scene
      * @param updatable defines if the mesh must be flagged as updatable
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @param instance is an instance of an existing Tube object to be updated with the passed `pathArray` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#tube)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTube")
    @js.native
    def CreateTube(
      name: String,
      path: js.Array[Vector3],
      radius: Double,
      tessellation: Double,
      radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
      cap: Double,
      scene: Scene
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTube")
    @js.native
    def CreateTube(
      name: String,
      path: js.Array[Vector3],
      radius: Double,
      tessellation: Double,
      radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
      cap: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: js.UndefOr[scala.Nothing],
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTube")
    @js.native
    def CreateTube(
      name: String,
      path: js.Array[Vector3],
      radius: Double,
      tessellation: Double,
      radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
      cap: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTube")
    @js.native
    def CreateTube(
      name: String,
      path: js.Array[Vector3],
      radius: Double,
      tessellation: Double,
      radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
      cap: Double,
      scene: Scene,
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double,
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTube")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTube")
    @js.native
    def CreateTube(
      name: String,
      path: js.Array[Vector3],
      radius: Double,
      tessellation: Double,
      radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
      cap: Double,
      scene: Scene,
      updatable: Boolean,
      sideOrientation: js.UndefOr[scala.Nothing],
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTube")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.CreateTube")
    @js.native
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
      * Mesh side orientation : by default, `FRONTSIDE`
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.DEFAULTSIDE")
    @js.native
    val DEFAULTSIDE: Double = js.native
    
    /**
      * Mesh side orientation : both internal and external or front and back surfaces
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.DOUBLESIDE")
    @js.native
    val DOUBLESIDE: Double = js.native
    
    /**
      * Creates an extruded polygon mesh, with depth in the Y direction. Please consider using the same method from the MeshBuilder class instead.
      * @see https://doc.babylonjs.com/how_to/parametric_shapes#extruded-non-regular-polygon
      * @param name defines the name of the mesh to create
      * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
      * @param depth defines the height of extrusion
      * @param scene defines the hosting scene
      * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
      * @param updatable defines if the mesh must be flagged as updatable
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @param earcutInjection can be used to inject your own earcut reference
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(name: String, shape: js.Array[Vector3], depth: Double, scene: Scene): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: js.UndefOr[scala.Nothing],
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double,
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: js.UndefOr[scala.Nothing],
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.UndefOr[scala.Nothing],
      updatable: Boolean,
      sideOrientation: Double,
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.Array[js.Array[Vector3]]
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: js.UndefOr[scala.Nothing],
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double,
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: Boolean,
      sideOrientation: js.UndefOr[scala.Nothing],
      earcutInjection: js.Any
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
    def ExtrudePolygon(
      name: String,
      shape: js.Array[Vector3],
      depth: Double,
      scene: Scene,
      holes: js.Array[js.Array[Vector3]],
      updatable: Boolean,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudePolygon")
    @js.native
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
      * @see https://doc.babylonjs.com/how_to/parametric_shapes
      * @see https://doc.babylonjs.com/how_to/parametric_shapes#extruded-shapes
      * @param name defines the name of the mesh to create
      * @param shape is a required array of successive Vector3. This array depicts the shape to be extruded in its local space : the shape must be designed in the xOy plane and will be extruded along the Z axis
      * @param path is a required array of successive Vector3. This is the axis curve the shape is extruded along
      * @param scale is the value to scale the shape
      * @param rotation is the angle value to rotate the shape each step (each path point), from the former step (so rotation added each step) along the curve
      * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
      * @param scene defines the hosting scene
      * @param updatable defines if the mesh must be flagged as updatable
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#extruded-shape)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShape")
    @js.native
    def ExtrudeShape(
      name: String,
      shape: js.Array[Vector3],
      path: js.Array[Vector3],
      scale: Double,
      rotation: Double,
      cap: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShape")
    @js.native
    def ExtrudeShape(
      name: String,
      shape: js.Array[Vector3],
      path: js.Array[Vector3],
      scale: Double,
      rotation: Double,
      cap: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: js.UndefOr[scala.Nothing],
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShape")
    @js.native
    def ExtrudeShape(
      name: String,
      shape: js.Array[Vector3],
      path: js.Array[Vector3],
      scale: Double,
      rotation: Double,
      cap: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShape")
    @js.native
    def ExtrudeShape(
      name: String,
      shape: js.Array[Vector3],
      path: js.Array[Vector3],
      scale: Double,
      rotation: Double,
      cap: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double,
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShape")
    @js.native
    def ExtrudeShape(
      name: String,
      shape: js.Array[Vector3],
      path: js.Array[Vector3],
      scale: Double,
      rotation: Double,
      cap: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: Boolean
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShape")
    @js.native
    def ExtrudeShape(
      name: String,
      shape: js.Array[Vector3],
      path: js.Array[Vector3],
      scale: Double,
      rotation: Double,
      cap: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: Boolean,
      sideOrientation: js.UndefOr[scala.Nothing],
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShape")
    @js.native
    def ExtrudeShape(
      name: String,
      shape: js.Array[Vector3],
      path: js.Array[Vector3],
      scale: Double,
      rotation: Double,
      cap: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: Boolean,
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShape")
    @js.native
    def ExtrudeShape(
      name: String,
      shape: js.Array[Vector3],
      path: js.Array[Vector3],
      scale: Double,
      rotation: Double,
      cap: Double,
      scene: js.UndefOr[Nullable[Scene]],
      updatable: Boolean,
      sideOrientation: Double,
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShape")
    @js.native
    def ExtrudeShape(
      name: String,
      shape: js.Array[Vector3],
      path: js.Array[Vector3],
      scale: Double,
      rotation: Double,
      cap: Double,
      scene: Nullable[Scene]
    ): Mesh = js.native
    
    /**
      * Creates an custom extruded shape mesh.
      * The custom extrusion is a parametric shape.
      * It has no predefined shape. Its final shape will depend on the input parameters.
      * Please consider using the same method from the MeshBuilder class instead
      * @see https://doc.babylonjs.com/how_to/parametric_shapes#extruded-shapes
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
      * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
      * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (https://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh#extruded-shape)
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShapeCustom")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShapeCustom")
    @js.native
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
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: js.UndefOr[scala.Nothing],
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShapeCustom")
    @js.native
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
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShapeCustom")
    @js.native
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
      updatable: js.UndefOr[scala.Nothing],
      sideOrientation: Double,
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShapeCustom")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShapeCustom")
    @js.native
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
      sideOrientation: js.UndefOr[scala.Nothing],
      instance: Mesh
    ): Mesh = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShapeCustom")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ExtrudeShapeCustom")
    @js.native
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
      * Mesh pattern setting : rotate pattern and rotate
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.FLIP_N_ROTATE_ROW")
    @js.native
    val FLIP_N_ROTATE_ROW: Double = js.native
    
    /**
      * Mesh pattern setting : flip and rotate alternate tiles on each row or column
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.FLIP_N_ROTATE_TILE")
    @js.native
    val FLIP_N_ROTATE_TILE: Double = js.native
    
    /**
      * Mesh pattern setting : flip (reflect in y axis) all tiles on alternate rows
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.FLIP_ROW")
    @js.native
    val FLIP_ROW: Double = js.native
    
    /**
      * Mesh pattern setting : flip (reflect in y axis) alternate tiles on each row or column
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.FLIP_TILE")
    @js.native
    val FLIP_TILE: Double = js.native
    
    /**
      * Mesh side orientation : usually the external or front surface
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.FRONTSIDE")
    @js.native
    val FRONTSIDE: Double = js.native
    
    /**
      * Mesh tile positioning : part tiles on left
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.LEFT")
    @js.native
    val LEFT: Double = js.native
    
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(meshes: js.Array[Mesh]): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: Mesh
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: Mesh,
      subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(meshes: js.Array[Mesh], disposeSource: js.UndefOr[scala.Nothing], allow32BitsIndices: Boolean): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: Boolean,
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: Boolean,
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: Boolean,
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: js.UndefOr[scala.Nothing],
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: Mesh
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: Mesh,
      subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: js.UndefOr[scala.Nothing],
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean, allow32BitsIndices: Boolean): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: js.UndefOr[scala.Nothing],
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean, allow32BitsIndices: Boolean, meshSubclass: Mesh): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
    def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MergeMeshes")
    @js.native
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
    @JSImport("babylonjs/Meshes/mesh", "Mesh.MinMax")
    @js.native
    def MinMax(meshes: js.Array[AbstractMesh]): Max = js.native
    
    /**
      * Mesh cap setting : no cap
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.NO_CAP")
    @js.native
    val NO_CAP: Double = js.native
    
    /**
      * Mesh pattern setting : no flip or rotate
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.NO_FLIP")
    @js.native
    val NO_FLIP: Double = js.native
    
    /**
      * Returns a new Mesh object parsed from the source provided.
      * @param parsedMesh is the source
      * @param scene defines the hosting scene
      * @param rootUrl is the root URL to prefix the `delayLoadingFile` property with
      * @returns a new Mesh
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.Parse")
    @js.native
    def Parse(parsedMesh: js.Any, scene: Scene, rootUrl: String): Mesh = js.native
    
    /**
      * Mesh tile positioning : part tiles on right
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.RIGHT")
    @js.native
    val RIGHT: Double = js.native
    
    /**
      * Mesh pattern setting : rotate (180degs) all tiles on alternate rows
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ROTATE_ROW")
    @js.native
    val ROTATE_ROW: Double = js.native
    
    /**
      * Mesh pattern setting : rotate (180degs) alternate tiles on each row or column
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.ROTATE_TILE")
    @js.native
    val ROTATE_TILE: Double = js.native
    
    /**
      * Mesh tile positioning : part tiles on top
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.TOP")
    @js.native
    val TOP: Double = js.native
    
    /**
      * Gets the default side orientation.
      * @param orientation the orientation to value to attempt to get
      * @returns the default orientation
      * @hidden
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh._GetDefaultSideOrientation")
    @js.native
    def _GetDefaultSideOrientation(): Double = js.native
    @JSImport("babylonjs/Meshes/mesh", "Mesh._GetDefaultSideOrientation")
    @js.native
    def _GetDefaultSideOrientation(orientation: Double): Double = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Meshes/mesh", "Mesh._GroundMeshParser")
    @js.native
    def _GroundMeshParser(parsedMesh: js.Any, scene: Scene): Mesh = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Meshes/mesh", "Mesh._PhysicsImpostorParser")
    @js.native
    def _PhysicsImpostorParser(scene: Scene, physicObject: IPhysicsEnabledObject, jsonObject: js.Any): PhysicsImpostor = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Meshes/mesh", "Mesh._instancedMeshFactory")
    @js.native
    def _instancedMeshFactory(name: String, mesh: Mesh): InstancedMesh = js.native
  }
  
  /**
    * @hidden
    **/
  @js.native
  trait InstanceDataStorage extends StObject {
    
    var batchCache: InstancesBatch = js.native
    
    var hardwareInstancedRendering: Boolean = js.native
    
    var instancesBuffer: Nullable[Buffer] = js.native
    
    var instancesBufferSize: Double = js.native
    
    var instancesData: Float32Array = js.native
    
    var isFrozen: Boolean = js.native
    
    var manualUpdate: Boolean = js.native
    
    var overridenInstanceCount: Double = js.native
    
    var previousBatch: Nullable[InstancesBatch] = js.native
    
    var previousRenderId: Double = js.native
    
    var sideOrientation: Double = js.native
    
    var visibleInstances: js.Any = js.native
  }
  object InstanceDataStorage {
    
    @scala.inline
    def apply(
      batchCache: InstancesBatch,
      hardwareInstancedRendering: Boolean,
      instancesBufferSize: Double,
      instancesData: Float32Array,
      isFrozen: Boolean,
      manualUpdate: Boolean,
      overridenInstanceCount: Double,
      previousRenderId: Double,
      sideOrientation: Double,
      visibleInstances: js.Any
    ): InstanceDataStorage = {
      val __obj = js.Dynamic.literal(batchCache = batchCache.asInstanceOf[js.Any], hardwareInstancedRendering = hardwareInstancedRendering.asInstanceOf[js.Any], instancesBufferSize = instancesBufferSize.asInstanceOf[js.Any], instancesData = instancesData.asInstanceOf[js.Any], isFrozen = isFrozen.asInstanceOf[js.Any], manualUpdate = manualUpdate.asInstanceOf[js.Any], overridenInstanceCount = overridenInstanceCount.asInstanceOf[js.Any], previousRenderId = previousRenderId.asInstanceOf[js.Any], sideOrientation = sideOrientation.asInstanceOf[js.Any], visibleInstances = visibleInstances.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceDataStorage]
    }
    
    @scala.inline
    implicit class InstanceDataStorageMutableBuilder[Self <: InstanceDataStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchCache(value: InstancesBatch): Self = StObject.set(x, "batchCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardwareInstancedRendering(value: Boolean): Self = StObject.set(x, "hardwareInstancedRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancesBuffer(value: Nullable[Buffer]): Self = StObject.set(x, "instancesBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancesBufferNull: Self = StObject.set(x, "instancesBuffer", null)
      
      @scala.inline
      def setInstancesBufferSize(value: Double): Self = StObject.set(x, "instancesBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancesData(value: Float32Array): Self = StObject.set(x, "instancesData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFrozen(value: Boolean): Self = StObject.set(x, "isFrozen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManualUpdate(value: Boolean): Self = StObject.set(x, "manualUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridenInstanceCount(value: Double): Self = StObject.set(x, "overridenInstanceCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousBatch(value: Nullable[InstancesBatch]): Self = StObject.set(x, "previousBatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousBatchNull: Self = StObject.set(x, "previousBatch", null)
      
      @scala.inline
      def setPreviousRenderId(value: Double): Self = StObject.set(x, "previousRenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleInstances(value: js.Any): Self = StObject.set(x, "visibleInstances", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @hidden
    **/
  @js.native
  trait ThinInstanceDataStorage extends StObject {
    
    var boundingVectors: js.Array[Vector3] = js.native
    
    var instancesCount: Double = js.native
    
    var matrixBuffer: Nullable[Buffer] = js.native
    
    var matrixBufferSize: Double = js.native
    
    var matrixData: Nullable[Float32Array] = js.native
    
    var worldMatrices: Nullable[js.Array[Matrix]] = js.native
  }
  object ThinInstanceDataStorage {
    
    @scala.inline
    def apply(boundingVectors: js.Array[Vector3], instancesCount: Double, matrixBufferSize: Double): ThinInstanceDataStorage = {
      val __obj = js.Dynamic.literal(boundingVectors = boundingVectors.asInstanceOf[js.Any], instancesCount = instancesCount.asInstanceOf[js.Any], matrixBufferSize = matrixBufferSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThinInstanceDataStorage]
    }
    
    @scala.inline
    implicit class ThinInstanceDataStorageMutableBuilder[Self <: ThinInstanceDataStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundingVectors(value: js.Array[Vector3]): Self = StObject.set(x, "boundingVectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundingVectorsVarargs(value: Vector3*): Self = StObject.set(x, "boundingVectors", js.Array(value :_*))
      
      @scala.inline
      def setInstancesCount(value: Double): Self = StObject.set(x, "instancesCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixBuffer(value: Nullable[Buffer]): Self = StObject.set(x, "matrixBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixBufferNull: Self = StObject.set(x, "matrixBuffer", null)
      
      @scala.inline
      def setMatrixBufferSize(value: Double): Self = StObject.set(x, "matrixBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixData(value: Nullable[Float32Array]): Self = StObject.set(x, "matrixData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixDataNull: Self = StObject.set(x, "matrixData", null)
      
      @scala.inline
      def setWorldMatrices(value: Nullable[js.Array[Matrix]]): Self = StObject.set(x, "worldMatrices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorldMatricesNull: Self = StObject.set(x, "worldMatrices", null)
      
      @scala.inline
      def setWorldMatricesVarargs(value: Matrix*): Self = StObject.set(x, "worldMatrices", js.Array(value :_*))
    }
  }
}
