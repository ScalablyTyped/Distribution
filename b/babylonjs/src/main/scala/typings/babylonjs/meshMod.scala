package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.anon.Data
import typings.babylonjs.anon.DeepImmutableObjectMatrix
import typings.babylonjs.anon.Max
import typings.babylonjs.anon.Report
import typings.babylonjs.anon.Sizes
import typings.babylonjs.anon.`1`
import typings.babylonjs.boundingSphereMod.BoundingSphere
import typings.babylonjs.bufferMod.Buffer
import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.geometryMod.Geometry
import typings.babylonjs.goldbergMeshMod.GoldbergMesh
import typings.babylonjs.instancedMeshMod.InstancedMesh
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathPathMod.Path3D
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.meshLODLevelMod.MeshLODLevel
import typings.babylonjs.meshSimplificationMod.ISimplificationSettings
import typings.babylonjs.meshSimplificationMod.SimplificationType
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.physicsImpostorMod.IPhysicsEnabledObject
import typings.babylonjs.physicsImpostorMod.PhysicsImpostor
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.skeletonMod.Skeleton
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshMod {
  
  @JSImport("babylonjs/Meshes/mesh", "_CreationDataStorage")
  @js.native
  open class CreationDataStorage () extends StObject {
    
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
  open class InstancesBatch () extends StObject {
    
    var hardwareInstancedRendering: js.Array[Boolean] = js.native
    
    var mustReturn: Boolean = js.native
    
    var renderSelf: js.Array[Boolean] = js.native
    
    var visibleInstances: js.Array[Nullable[js.Array[InstancedMesh]]] = js.native
  }
  
  @JSImport("babylonjs/Meshes/mesh", "Mesh")
  @js.native
  open class Mesh protected () extends AbstractMesh {
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
    def this(name: String, scene: Unit, parent: Nullable[Node]) = this()
    def this(name: String, scene: Nullable[Scene], parent: Nullable[Node]) = this()
    def this(name: String, scene: Unit, parent: Unit, source: Nullable[Mesh]) = this()
    def this(name: String, scene: Unit, parent: Nullable[Node], source: Nullable[Mesh]) = this()
    def this(name: String, scene: Nullable[Scene], parent: Unit, source: Nullable[Mesh]) = this()
    def this(name: String, scene: Nullable[Scene], parent: Nullable[Node], source: Nullable[Mesh]) = this()
    def this(name: String, scene: Unit, parent: Unit, source: Unit, doNotCloneChildren: Boolean) = this()
    def this(name: String, scene: Unit, parent: Unit, source: Nullable[Mesh], doNotCloneChildren: Boolean) = this()
    def this(name: String, scene: Unit, parent: Nullable[Node], source: Unit, doNotCloneChildren: Boolean) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean
    ) = this()
    def this(name: String, scene: Nullable[Scene], parent: Unit, source: Unit, doNotCloneChildren: Boolean) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Unit,
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Unit,
      doNotCloneChildren: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Unit,
      source: Unit,
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Unit,
      source: Unit,
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Unit,
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Unit,
      source: Nullable[Mesh],
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Nullable[Node],
      source: Unit,
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Nullable[Node],
      source: Unit,
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Unit,
      source: Unit,
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Unit,
      source: Unit,
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Unit,
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Unit,
      source: Nullable[Mesh],
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Unit,
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Unit,
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    
    /** @hidden */
    var _binaryInfo: Any = js.native
    
    /**
      * @param subMesh
      * @param effect
      * @param fillMode
      * @hidden
      */
    def _bind(subMesh: SubMesh, effect: Effect, fillMode: Double): Mesh = js.native
    
    /** @hidden */
    def _checkDelayState(): Mesh = js.native
    
    /**
      * @param force
      * @hidden
      */
    def _createGlobalSubMesh(force: Boolean): Nullable[SubMesh] = js.native
    
    /** @hidden */
    var _creationDataStorage: Nullable[CreationDataStorage] = js.native
    
    /** @hidden */
    var _delayInfo: js.Array[String] = js.native
    
    /** @hidden */
    def _delayLoadingFunction(any: Any, mesh: Mesh): Unit = js.native
    
    /** @hidden */
    def _disposeInstanceSpecificData(): Unit = js.native
    
    /** @hidden */
    def _disposeThinInstanceSpecificData(): Unit = js.native
    
    /**
      * @param subMesh
      * @param fillMode
      * @param instancesCount
      * @hidden
      */
    def _draw(subMesh: SubMesh, fillMode: Double): Mesh = js.native
    def _draw(subMesh: SubMesh, fillMode: Double, instancesCount: Double): Mesh = js.native
    
    /** @hidden */
    var _geometry: Nullable[Geometry] = js.native
    
    /**
      * @param subMeshId
      * @param isReplacementMode
      * @hidden
      */
    def _getInstancesRenderList(subMeshId: Double): InstancesBatch = js.native
    def _getInstancesRenderList(subMeshId: Double, isReplacementMode: Boolean): InstancesBatch = js.native
    
    /** @hidden */
    var _instanceDataStorage: InstanceDataStorage = js.native
    
    /* private */ var _internalMeshDataInfo: Any = js.native
    
    /**
      * Invalidate VertexArrayObjects belonging to the mesh (but not to the Geometry of the mesh).
      */
    def _invalidateInstanceVertexArrayObject(): Unit = js.native
    
    /** @hidden */
    def _isMesh: Boolean = js.native
    
    /* private */ var _normalizeSkinFourWeights: Any = js.native
    
    /* private */ var _normalizeSkinWeightsAndExtra: Any = js.native
    
    /* private */ var _onBeforeDraw: Any = js.native
    
    /* private */ var _onBeforeDrawObserver: Any = js.native
    
    /** @hidden */
    var _originalBuilderSideOrientation: Double = js.native
    
    /**
      * @param visibleInstances
      * @param renderSelf
      * @hidden
      */
    def _processInstancedBuffers(visibleInstances: js.Array[InstancedMesh], renderSelf: Boolean): Unit = js.native
    
    /**
      * @param renderingMesh
      * @param subMesh
      * @param effect
      * @param fillMode
      * @param batch
      * @param hardwareInstancedRendering
      * @param onBeforeDraw
      * @param effectiveMaterial
      * @hidden
      */
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
    
    /* private */ var _queueLoad: Any = js.native
    
    /**
      * @param instance
      * @param renderId
      * @hidden
      */
    def _registerInstanceForRenderId(instance: InstancedMesh, renderId: Double): Mesh = js.native
    
    /**
      * @param subMesh
      * @param fillMode
      * @param batch
      * @param effect
      * @param engine
      * @hidden
      */
    def _renderWithInstances(subMesh: SubMesh, fillMode: Double, batch: InstancesBatch, effect: Effect, engine: Engine): Mesh = js.native
    
    /**
      * @param subMesh
      * @param fillMode
      * @param effect
      * @param engine
      * @hidden
      */
    def _renderWithThinInstances(subMesh: SubMesh, fillMode: Double, effect: Effect, engine: Engine): Unit = js.native
    
    /** @hidden */
    def _resetPointsArrayCache(): Mesh = js.native
    
    /** @hidden */
    var _shouldGenerateFlatShading: Boolean = js.native
    
    /* private */ var _sortLODLevels: Any = js.native
    
    /** @hidden */
    def _thinInstanceCreateMatrixBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array], staticBuffer: Boolean): Buffer = js.native
    
    /** @hidden */
    var _thinInstanceDataStorage: ThinInstanceDataStorage = js.native
    
    /** @hidden */
    def _thinInstanceInitializeUserStorage(): Unit = js.native
    
    /** @hidden */
    def _thinInstanceUpdateBufferSize(kind: String): Unit = js.native
    def _thinInstanceUpdateBufferSize(kind: String, numInstances: Double): Unit = js.native
    
    /** @hidden */
    var _userInstancedBuffersStorage: Data = js.native
    
    /** @hidden */
    var _userThinInstanceBuffersStorage: Sizes = js.native
    
    /**
      * @param instance
      * @hidden
      */
    def addInstance(instance: InstancedMesh): Unit = js.native
    
    /**
      * Add a mesh as LOD level triggered at the given distance.
      * @see https://doc.babylonjs.com/how_to/how_to_use_lod
      * @param distanceOrScreenCoverage Either distance from the center of the object to show this level or the screen coverage if `useScreenCoverage` is set to `true`.
      * If screen coverage, value is a fraction of the screen's total surface, between 0 and 1.
      * @param mesh The mesh to be added as LOD level (can be null)
      * @returns This mesh (for chaining)
      */
    def addLODLevel(distanceOrScreenCoverage: Double, mesh: Nullable[Mesh]): Mesh = js.native
    
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
      uvOffset: Unit,
      uvScale: Unit,
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: js.Function1[/* mesh */ this.type, Unit],
      uvOffset: Unit,
      uvScale: Vector2
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: js.Function1[/* mesh */ this.type, Unit],
      uvOffset: Unit,
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
      uvScale: Unit,
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
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: Unit,
      uvOffset: Unit,
      uvScale: Unit,
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: Unit,
      uvOffset: Unit,
      uvScale: Vector2
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: Unit,
      uvOffset: Unit,
      uvScale: Vector2,
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMap(url: String, minHeight: Double, maxHeight: Double, onSuccess: Unit, uvOffset: Vector2): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: Unit,
      uvOffset: Vector2,
      uvScale: Unit,
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: Unit,
      uvOffset: Vector2,
      uvScale: Vector2
    ): Mesh = js.native
    def applyDisplacementMap(
      url: String,
      minHeight: Double,
      maxHeight: Double,
      onSuccess: Unit,
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
      * @param uvOffset is an optional vector2 used to offset UV.
      * @param uvScale is an optional vector2 used to scale UV.
      * @param forceUpdate defines whether or not to force an update of the generated buffers. This is useful to apply on a deserialized model for instance.
      * @returns the Mesh.
      */
    def applyDisplacementMapFromBuffer(
      buffer: js.typedarray.Uint8Array,
      heightMapWidth: Double,
      heightMapHeight: Double,
      minHeight: Double,
      maxHeight: Double
    ): Mesh = js.native
    def applyDisplacementMapFromBuffer(
      buffer: js.typedarray.Uint8Array,
      heightMapWidth: Double,
      heightMapHeight: Double,
      minHeight: Double,
      maxHeight: Double,
      uvOffset: Unit,
      uvScale: Unit,
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMapFromBuffer(
      buffer: js.typedarray.Uint8Array,
      heightMapWidth: Double,
      heightMapHeight: Double,
      minHeight: Double,
      maxHeight: Double,
      uvOffset: Unit,
      uvScale: Vector2
    ): Mesh = js.native
    def applyDisplacementMapFromBuffer(
      buffer: js.typedarray.Uint8Array,
      heightMapWidth: Double,
      heightMapHeight: Double,
      minHeight: Double,
      maxHeight: Double,
      uvOffset: Unit,
      uvScale: Vector2,
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMapFromBuffer(
      buffer: js.typedarray.Uint8Array,
      heightMapWidth: Double,
      heightMapHeight: Double,
      minHeight: Double,
      maxHeight: Double,
      uvOffset: Vector2
    ): Mesh = js.native
    def applyDisplacementMapFromBuffer(
      buffer: js.typedarray.Uint8Array,
      heightMapWidth: Double,
      heightMapHeight: Double,
      minHeight: Double,
      maxHeight: Double,
      uvOffset: Vector2,
      uvScale: Unit,
      forceUpdate: Boolean
    ): Mesh = js.native
    def applyDisplacementMapFromBuffer(
      buffer: js.typedarray.Uint8Array,
      heightMapWidth: Double,
      heightMapHeight: Double,
      minHeight: Double,
      maxHeight: Double,
      uvOffset: Vector2,
      uvScale: Vector2
    ): Mesh = js.native
    def applyDisplacementMapFromBuffer(
      buffer: js.typedarray.Uint8Array,
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
    
    def clone(name: String): Mesh = js.native
    def clone(name: String, newParent: Unit, doNotCloneChildren: Boolean): Mesh = js.native
    def clone(name: String, newParent: Unit, doNotCloneChildren: Boolean, clonePhysicsImpostor: Boolean): Mesh = js.native
    def clone(name: String, newParent: Unit, doNotCloneChildren: Unit, clonePhysicsImpostor: Boolean): Mesh = js.native
    def clone(
      name: String,
      newParent: Nullable[Node],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ): Mesh = js.native
    def clone(name: String, newParent: Nullable[Node], doNotCloneChildren: Unit, clonePhysicsImpostor: Boolean): Mesh = js.native
    def clone(name: Unit, newParent: Unit, doNotCloneChildren: Boolean): Mesh = js.native
    def clone(name: Unit, newParent: Unit, doNotCloneChildren: Boolean, clonePhysicsImpostor: Boolean): Mesh = js.native
    def clone(name: Unit, newParent: Unit, doNotCloneChildren: Unit, clonePhysicsImpostor: Boolean): Mesh = js.native
    def clone(name: Unit, newParent: Nullable[Node]): Mesh = js.native
    def clone(name: Unit, newParent: Nullable[Node], doNotCloneChildren: Boolean): Mesh = js.native
    def clone(name: Unit, newParent: Nullable[Node], doNotCloneChildren: Boolean, clonePhysicsImpostor: Boolean): Mesh = js.native
    def clone(name: Unit, newParent: Nullable[Node], doNotCloneChildren: Unit, clonePhysicsImpostor: Boolean): Mesh = js.native
    
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
      * Gets or sets the forced number of instances to display.
      * If 0 (default value), the number of instances is not forced and depends on the draw type
      * (regular / instance / thin instances mesh)
      */
    def forcedInstanceCount: Double = js.native
    def forcedInstanceCount_=(count: Double): Unit = js.native
    
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
      * @returns an array of strings
      */
    def getVerticesDataKinds(): js.Array[String] = js.native
    
    /**
      * Gets a boolean indicating if this mesh has LOD
      */
    def hasLODLevels: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating whether to render ignoring the active camera's max z setting. (false by default)
      * Note this will reduce performance when set to true.
      */
    var ignoreCameraMaxZ: Boolean = js.native
    
    /**
      * Increase the number of facets and hence vertices in a mesh
      * Vertex normals are interpolated from existing vertex normals
      * Warning : the mesh is really modified even if not set originally as updatable. A new VertexBuffer is created under the hood each call.
      * @param numberPerEdge the number of new vertices to add to each edge of a facet, optional default 1
      */
    def increaseVertices(): Unit = js.native
    def increaseVertices(numberPerEdge: Double): Unit = js.native
    
    /**
      * Gets the list of instances created from this mesh
      * it is not supposed to be modified manually.
      * Note also that the order of the InstancedMesh wihin the array is not significant and might change.
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances
      */
    var instances: js.Array[InstancedMesh] = js.native
    
    def instantiateHierarchy(newParent: Unit, options: `1`): Nullable[TransformNode] = js.native
    def instantiateHierarchy(
      newParent: Unit,
      options: `1`,
      onNewNodeCreated: js.Function2[/* source */ TransformNode, /* clone */ TransformNode, Unit]
    ): Nullable[TransformNode] = js.native
    def instantiateHierarchy(newParent: Nullable[TransformNode], options: `1`): Nullable[TransformNode] = js.native
    def instantiateHierarchy(
      newParent: Nullable[TransformNode],
      options: `1`,
      onNewNodeCreated: js.Function2[/* source */ TransformNode, /* clone */ TransformNode, Unit]
    ): Nullable[TransformNode] = js.native
    
    def isReady(completeCheck: Boolean, forceInstanceSupport: Boolean): Boolean = js.native
    def isReady(completeCheck: Unit, forceInstanceSupport: Boolean): Boolean = js.native
    
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
    def manualUpdateOfPreviousWorldMatrixInstancedBuffer: Boolean = js.native
    def manualUpdateOfPreviousWorldMatrixInstancedBuffer_=(value: Boolean): Unit = js.native
    
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
      * An event triggeredbetween rendering pass when using separateCullingPass = true
      */
    def onBetweenPassObservable: Observable[SubMesh] = js.native
    
    /**
      * User defined function used to change how LOD level selection is done
      * @see https://doc.babylonjs.com/how_to/how_to_use_lod
      */
    def onLODLevelSelection(distance: Double, mesh: Mesh, selectedLevel: Nullable[Mesh]): Unit = js.native
    
    /**
      * Will notify when the mesh is completely ready, including materials.
      * Observers added to this observable will be removed once triggered
      */
    var onMeshReadyObservable: Observable[Mesh] = js.native
    
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
    
    /** Gets the array buffer used to store the instanced buffer used for instances' previous world matrices */
    def previousWorldMatrixInstancedBuffer: js.typedarray.Float32Array = js.native
    
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
    
    /**
      * @param instance
      * @hidden
      */
    def removeInstance(instance: InstancedMesh): Unit = js.native
    
    /**
      * Remove a mesh from the LOD array
      * @see https://doc.babylonjs.com/how_to/how_to_use_lod
      * @param mesh defines the mesh to be removed
      * @returns This mesh (for chaining)
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
    def setIndices(indices: IndicesArray, totalVertices: Unit, updatable: Boolean): AbstractMesh = js.native
    
    /**
      * Sets the mesh material by the material or multiMaterial `id` property
      * @param id is a string identifying the material or the multiMaterial
      * @returns the current mesh
      * @deprecated Please use MeshBuilder instead Please use setMaterialById instead
      */
    def setMaterialByID(id: String): typings.babylonjs.meshMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    
    /**
      * Sets the mesh material by the material or multiMaterial `id` property
      * @param id is a string identifying the material or the multiMaterial
      * @returns the current mesh
      */
    def setMaterialById(id: String): Mesh = js.native
    
    /**
      * Prepare internal normal array for software CPU skinning
      * @returns original normals used for CPU skinning. Useful for integrating Morphing with skeletons in same mesh.
      */
    def setNormalsForCPUSkinning(): Nullable[js.typedarray.Float32Array] = js.native
    
    /**
      * Prepare internal position array for software CPU skinning
      * @returns original positions used for CPU skinning. Useful for integrating Morphing with skeletons in same mesh
      */
    def setPositionsForCPUSkinning(): Nullable[js.typedarray.Float32Array] = js.native
    
    /**
      * Sets the mesh global Vertex Buffer
      * @param buffer defines the buffer to use
      * @param disposeExistingBuffer disposes the existing buffer, if any (default: true)
      * @returns the current mesh
      */
    def setVerticesBuffer(buffer: VertexBuffer): Mesh = js.native
    def setVerticesBuffer(buffer: VertexBuffer, disposeExistingBuffer: Boolean): Mesh = js.native
    
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
      simplificationType: Unit,
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
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Unit,
      simplificationType: Unit,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Unit,
      simplificationType: SimplificationType
    ): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Unit,
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
    
    def thinInstanceAdd(matrix: js.Array[DeepImmutableObjectMatrix]): Double = js.native
    def thinInstanceAdd(matrix: js.Array[DeepImmutableObjectMatrix], refresh: Boolean): Double = js.native
    /**
      * Creates a new thin instance
      * @param matrix the matrix or array of matrices (position, rotation, scale) of the thin instance(s) to create
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      * @returns the thin instance index number. If you pass an array of matrices, other instance indexes are index+1, index+2, etc
      */
    def thinInstanceAdd(matrix: DeepImmutableObjectMatrix): Double = js.native
    def thinInstanceAdd(matrix: DeepImmutableObjectMatrix, refresh: Boolean): Double = js.native
    
    /**
      * Adds the transformation (matrix) of the current mesh as a thin instance
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      * @returns the thin instance index number
      */
    def thinInstanceAddSelf(): Double = js.native
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
      * @returns an array containing all the world matrices from the thin instances
      */
    def thinInstanceGetWorldMatrices(): js.Array[Matrix] = js.native
    
    /**
      * Applies a partial update to a buffer directly on the GPU
      * Note that the buffer located on the CPU is NOT updated! It's up to you to update it (or not) with the same data you pass to this method
      * @param kind name of the attribute to update. Use "matrix" to update the buffer of matrices
      * @param data the data to set in the GPU buffer
      * @param offset the offset in the GPU buffer where to update the data
      */
    def thinInstancePartialBufferUpdate(kind: String, data: js.typedarray.Float32Array, offset: Double): Unit = js.native
    
    /**
      * Refreshes the bounding info, taking into account all the thin instances defined
      * @param forceRefreshParentInfo true to force recomputing the mesh bounding info and use it to compute the aggregated bounding info
      * @param applySkeleton defines whether to apply the skeleton before computing the bounding info
      * @param applyMorph  defines whether to apply the morph target before computing the bounding info
      */
    def thinInstanceRefreshBoundingInfo(): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Boolean, applySkeleton: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Boolean, applySkeleton: Boolean, applyMorph: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Boolean, applySkeleton: Unit, applyMorph: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Unit, applySkeleton: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Unit, applySkeleton: Boolean, applyMorph: Boolean): Unit = js.native
    def thinInstanceRefreshBoundingInfo(forceRefreshParentInfo: Unit, applySkeleton: Unit, applyMorph: Boolean): Unit = js.native
    
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
    def thinInstanceSetAttributeAt(kind: String, index: Double, value: js.Array[Double]): Unit = js.native
    def thinInstanceSetAttributeAt(kind: String, index: Double, value: js.Array[Double], refresh: Boolean): Unit = js.native
    
    /**
      * Sets a buffer to be used with thin instances. This method is a faster way to setup multiple instances than calling thinInstanceAdd repeatedly
      * @param kind name of the attribute. Use "matrix" to setup the buffer of matrices
      * @param buffer buffer to set
      * @param stride size in floats of each value of the buffer
      * @param staticBuffer indicates that the buffer is static, so that you won't change it after it is set (better performances - false by default)
      */
    def thinInstanceSetBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array]): Unit = js.native
    def thinInstanceSetBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array], stride: Double): Unit = js.native
    def thinInstanceSetBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array], stride: Double, staticBuffer: Boolean): Unit = js.native
    def thinInstanceSetBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array], stride: Unit, staticBuffer: Boolean): Unit = js.native
    
    /**
      * Sets the matrix of a thin instance
      * @param index index of the thin instance
      * @param matrix matrix to set
      * @param refresh true to refresh the underlying gpu buffer (default: true). If you do multiple calls to this method in a row, set refresh to true only for the last call to save performance
      */
    def thinInstanceSetMatrixAt(index: Double, matrix: DeepImmutableObjectMatrix): Unit = js.native
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
      * Determines if the LOD levels are intended to be calculated using screen coverage (surface area ratio) instead of distance
      */
    def useLODScreenCoverage: Boolean = js.native
    def useLODScreenCoverage_=(value: Boolean): Unit = js.native
    
    /**
      * ValidateSkinning is used to determine that a mesh has valid skinning data along with skin metrics, if missing weights,
      * or not normalized it is returned as invalid mesh the string can be used for console logs, or on screen messages to let
      * the user know there was an issue with importing the mesh
      * @returns a validation object with skinned, valid and report string
      */
    def validateSkinning(): Report = js.native
    
    /** Gets the array buffer used to store the instanced buffer used for instances' world matrices */
    def worldMatrixInstancedBuffer: js.typedarray.Float32Array = js.native
  }
  /* static members */
  object Mesh {
    
    @JSImport("babylonjs/Meshes/mesh", "Mesh")
    @js.native
    val ^ : js.Any = js.native
    
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
    
    inline def Center(meshesOrMinMaxVector: js.Array[AbstractMesh]): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Center")(meshesOrMinMaxVector.asInstanceOf[js.Any]).asInstanceOf[Vector3]
    /**
      * Returns the center of the `{min:` Vector3`, max:` Vector3`}` or the center of MinMax vector3 computed from a mesh array
      * @param meshesOrMinMaxVector could be an array of meshes or a `{min:` Vector3`, max:` Vector3`}` object
      * @returns a vector3
      */
    inline def Center(meshesOrMinMaxVector: Max): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Center")(meshesOrMinMaxVector.asInstanceOf[js.Any]).asInstanceOf[Vector3]
    
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
      * Indicates that the instanced meshes should be sorted from back to front before rendering if their material is transparent
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.INSTANCEDMESH_SORT_TRANSPARENT")
    @js.native
    def INSTANCEDMESH_SORT_TRANSPARENT: Boolean = js.native
    inline def INSTANCEDMESH_SORT_TRANSPARENT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANCEDMESH_SORT_TRANSPARENT")(x.asInstanceOf[js.Any])
    
    /**
      * Mesh tile positioning : part tiles on left
      */
    @JSImport("babylonjs/Meshes/mesh", "Mesh.LEFT")
    @js.native
    val LEFT: Double = js.native
    
    /**
      * Merge the array of meshes into a single mesh for performance reasons.
      * @param meshes array of meshes with the vertices to merge. Entries cannot be empty meshes.
      * @param disposeSource when true (default), dispose of the vertices from the source meshes.
      * @param allow32BitsIndices when the sum of the vertices > 64k, this must be set to true.
      * @param meshSubclass (optional) can be set to a Mesh where the merged vertices will be inserted.
      * @param subdivideWithSubMeshes when true (false default), subdivide mesh into subMeshes.
      * @param multiMultiMaterials when true (false default), subdivide mesh into subMeshes with multiple materials, ignores subdivideWithSubMeshes.
      * @returns a new mesh
      */
    inline def MergeMeshes(meshes: js.Array[Mesh]): Nullable[Mesh] = ^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any]).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean, allow32BitsIndices: Boolean): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean, allow32BitsIndices: Boolean, meshSubclass: Mesh): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean, allow32BitsIndices: Unit, meshSubclass: Mesh): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Unit, allow32BitsIndices: Boolean): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Unit, allow32BitsIndices: Boolean, meshSubclass: Mesh): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Unit, allow32BitsIndices: Unit, meshSubclass: Mesh): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    inline def MergeMeshes(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): Nullable[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshes")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[Nullable[Mesh]]
    
    /**
      * Merge the array of meshes into a single mesh for performance reasons.
      * @param meshes array of meshes with the vertices to merge. Entries cannot be empty meshes.
      * @param disposeSource when true (default), dispose of the vertices from the source meshes.
      * @param allow32BitsIndices when the sum of the vertices > 64k, this must be set to true.
      * @param meshSubclass (optional) can be set to a Mesh where the merged vertices will be inserted.
      * @param subdivideWithSubMeshes when true (false default), subdivide mesh into subMeshes.
      * @param multiMultiMaterials when true (false default), subdivide mesh into subMeshes with multiple materials, ignores subdivideWithSubMeshes.
      * @returns a new mesh
      */
    inline def MergeMeshesAsync(meshes: js.Array[Mesh]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(meshes: js.Array[Mesh], disposeSource: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(meshes: js.Array[Mesh], disposeSource: Boolean, allow32BitsIndices: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(meshes: js.Array[Mesh], disposeSource: Boolean, allow32BitsIndices: Boolean, meshSubclass: Mesh): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(meshes: js.Array[Mesh], disposeSource: Boolean, allow32BitsIndices: Unit, meshSubclass: Mesh): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Boolean,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(meshes: js.Array[Mesh], disposeSource: Unit, allow32BitsIndices: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(meshes: js.Array[Mesh], disposeSource: Unit, allow32BitsIndices: Boolean, meshSubclass: Mesh): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Boolean,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Unit,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(meshes: js.Array[Mesh], disposeSource: Unit, allow32BitsIndices: Unit, meshSubclass: Mesh): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Boolean,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def MergeMeshesAsync(
      meshes: js.Array[Mesh],
      disposeSource: Unit,
      allow32BitsIndices: Unit,
      meshSubclass: Mesh,
      subdivideWithSubMeshes: Unit,
      multiMultiMaterials: Boolean
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeMeshesAsync")(meshes.asInstanceOf[js.Any], disposeSource.asInstanceOf[js.Any], allow32BitsIndices.asInstanceOf[js.Any], meshSubclass.asInstanceOf[js.Any], subdivideWithSubMeshes.asInstanceOf[js.Any], multiMultiMaterials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      * Returns an object containing a min and max Vector3 which are the minimum and maximum vectors of each mesh bounding box from the passed array, in the world coordinates
      * @param meshes defines the list of meshes to scan
      * @returns an object `{min:` Vector3`, max:` Vector3`}`
      */
    inline def MinMax(meshes: js.Array[AbstractMesh]): Max = ^.asInstanceOf[js.Dynamic].applyDynamic("MinMax")(meshes.asInstanceOf[js.Any]).asInstanceOf[Max]
    
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
    inline def Parse(parsedMesh: Any, scene: Scene, rootUrl: String): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    
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
    inline def _GetDefaultSideOrientation(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetDefaultSideOrientation")().asInstanceOf[Double]
    inline def _GetDefaultSideOrientation(orientation: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetDefaultSideOrientation")(orientation.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * @param parsedMesh
      * @param scene
      * @hidden
      */
    inline def _GoldbergMeshParser(parsedMesh: Any, scene: Scene): GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_GoldbergMeshParser")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GoldbergMesh]
    
    /**
      * @param parsedMesh
      * @param scene
      * @hidden
      */
    inline def _GroundMeshParser(parsedMesh: Any, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_GroundMeshParser")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    
    /**
      * @param parsedMesh
      * @param scene
      * @hidden
      */
    inline def _LinesMeshParser(parsedMesh: Any, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_LinesMeshParser")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    
    @JSImport("babylonjs/Meshes/mesh", "Mesh._MergeMeshesCoroutine")
    @js.native
    def _MergeMeshesCoroutine: Any = js.native
    inline def _MergeMeshesCoroutine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MergeMeshesCoroutine")(x.asInstanceOf[js.Any])
    
    /**
      * @param scene
      * @param physicObject
      * @param jsonObject
      * @hidden
      */
    inline def _PhysicsImpostorParser(scene: Scene, physicObject: IPhysicsEnabledObject, jsonObject: Any): PhysicsImpostor = (^.asInstanceOf[js.Dynamic].applyDynamic("_PhysicsImpostorParser")(scene.asInstanceOf[js.Any], physicObject.asInstanceOf[js.Any], jsonObject.asInstanceOf[js.Any])).asInstanceOf[PhysicsImpostor]
    
    /**
      * @param name
      * @param mesh
      * @hidden
      */
    inline def _instancedMeshFactory(name: String, mesh: Mesh): InstancedMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("_instancedMeshFactory")(name.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[InstancedMesh]
  }
  
  /**
    * @hidden
    **/
  trait InstanceDataStorage extends StObject {
    
    var batchCache: InstancesBatch
    
    var batchCacheReplacementModeInFrozenMode: InstancesBatch
    
    var hardwareInstancedRendering: Boolean
    
    var instancesBuffer: Nullable[Buffer]
    
    var instancesBufferSize: Double
    
    var instancesData: js.typedarray.Float32Array
    
    var instancesPreviousBuffer: Nullable[Buffer]
    
    var instancesPreviousData: js.typedarray.Float32Array
    
    var isFrozen: Boolean
    
    var manualUpdate: Boolean
    
    var masterMeshPreviousWorldMatrix: Nullable[Matrix]
    
    var overridenInstanceCount: Double
    
    var previousBatch: Nullable[InstancesBatch]
    
    var previousManualUpdate: Boolean
    
    var previousRenderId: Double
    
    var sideOrientation: Double
    
    var visibleInstances: Any
  }
  object InstanceDataStorage {
    
    inline def apply(
      batchCache: InstancesBatch,
      batchCacheReplacementModeInFrozenMode: InstancesBatch,
      hardwareInstancedRendering: Boolean,
      instancesBufferSize: Double,
      instancesData: js.typedarray.Float32Array,
      instancesPreviousData: js.typedarray.Float32Array,
      isFrozen: Boolean,
      manualUpdate: Boolean,
      overridenInstanceCount: Double,
      previousManualUpdate: Boolean,
      previousRenderId: Double,
      sideOrientation: Double,
      visibleInstances: Any
    ): InstanceDataStorage = {
      val __obj = js.Dynamic.literal(batchCache = batchCache.asInstanceOf[js.Any], batchCacheReplacementModeInFrozenMode = batchCacheReplacementModeInFrozenMode.asInstanceOf[js.Any], hardwareInstancedRendering = hardwareInstancedRendering.asInstanceOf[js.Any], instancesBufferSize = instancesBufferSize.asInstanceOf[js.Any], instancesData = instancesData.asInstanceOf[js.Any], instancesPreviousData = instancesPreviousData.asInstanceOf[js.Any], isFrozen = isFrozen.asInstanceOf[js.Any], manualUpdate = manualUpdate.asInstanceOf[js.Any], overridenInstanceCount = overridenInstanceCount.asInstanceOf[js.Any], previousManualUpdate = previousManualUpdate.asInstanceOf[js.Any], previousRenderId = previousRenderId.asInstanceOf[js.Any], sideOrientation = sideOrientation.asInstanceOf[js.Any], visibleInstances = visibleInstances.asInstanceOf[js.Any], instancesBuffer = null, instancesPreviousBuffer = null, masterMeshPreviousWorldMatrix = null, previousBatch = null)
      __obj.asInstanceOf[InstanceDataStorage]
    }
    
    extension [Self <: InstanceDataStorage](x: Self) {
      
      inline def setBatchCache(value: InstancesBatch): Self = StObject.set(x, "batchCache", value.asInstanceOf[js.Any])
      
      inline def setBatchCacheReplacementModeInFrozenMode(value: InstancesBatch): Self = StObject.set(x, "batchCacheReplacementModeInFrozenMode", value.asInstanceOf[js.Any])
      
      inline def setHardwareInstancedRendering(value: Boolean): Self = StObject.set(x, "hardwareInstancedRendering", value.asInstanceOf[js.Any])
      
      inline def setInstancesBuffer(value: Nullable[Buffer]): Self = StObject.set(x, "instancesBuffer", value.asInstanceOf[js.Any])
      
      inline def setInstancesBufferNull: Self = StObject.set(x, "instancesBuffer", null)
      
      inline def setInstancesBufferSize(value: Double): Self = StObject.set(x, "instancesBufferSize", value.asInstanceOf[js.Any])
      
      inline def setInstancesData(value: js.typedarray.Float32Array): Self = StObject.set(x, "instancesData", value.asInstanceOf[js.Any])
      
      inline def setInstancesPreviousBuffer(value: Nullable[Buffer]): Self = StObject.set(x, "instancesPreviousBuffer", value.asInstanceOf[js.Any])
      
      inline def setInstancesPreviousBufferNull: Self = StObject.set(x, "instancesPreviousBuffer", null)
      
      inline def setInstancesPreviousData(value: js.typedarray.Float32Array): Self = StObject.set(x, "instancesPreviousData", value.asInstanceOf[js.Any])
      
      inline def setIsFrozen(value: Boolean): Self = StObject.set(x, "isFrozen", value.asInstanceOf[js.Any])
      
      inline def setManualUpdate(value: Boolean): Self = StObject.set(x, "manualUpdate", value.asInstanceOf[js.Any])
      
      inline def setMasterMeshPreviousWorldMatrix(value: Nullable[Matrix]): Self = StObject.set(x, "masterMeshPreviousWorldMatrix", value.asInstanceOf[js.Any])
      
      inline def setMasterMeshPreviousWorldMatrixNull: Self = StObject.set(x, "masterMeshPreviousWorldMatrix", null)
      
      inline def setOverridenInstanceCount(value: Double): Self = StObject.set(x, "overridenInstanceCount", value.asInstanceOf[js.Any])
      
      inline def setPreviousBatch(value: Nullable[InstancesBatch]): Self = StObject.set(x, "previousBatch", value.asInstanceOf[js.Any])
      
      inline def setPreviousBatchNull: Self = StObject.set(x, "previousBatch", null)
      
      inline def setPreviousManualUpdate(value: Boolean): Self = StObject.set(x, "previousManualUpdate", value.asInstanceOf[js.Any])
      
      inline def setPreviousRenderId(value: Double): Self = StObject.set(x, "previousRenderId", value.asInstanceOf[js.Any])
      
      inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
      
      inline def setVisibleInstances(value: Any): Self = StObject.set(x, "visibleInstances", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @hidden
    **/
  trait ThinInstanceDataStorage extends StObject {
    
    var boundingVectors: js.Array[Vector3]
    
    var instancesCount: Double
    
    var masterMeshPreviousWorldMatrix: Nullable[Matrix]
    
    var matrixBuffer: Nullable[Buffer]
    
    var matrixBufferSize: Double
    
    var matrixData: Nullable[js.typedarray.Float32Array]
    
    var previousMatrixBuffer: Nullable[Buffer]
    
    var previousMatrixData: Nullable[js.typedarray.Float32Array]
    
    var worldMatrices: Nullable[js.Array[Matrix]]
  }
  object ThinInstanceDataStorage {
    
    inline def apply(boundingVectors: js.Array[Vector3], instancesCount: Double, matrixBufferSize: Double): ThinInstanceDataStorage = {
      val __obj = js.Dynamic.literal(boundingVectors = boundingVectors.asInstanceOf[js.Any], instancesCount = instancesCount.asInstanceOf[js.Any], matrixBufferSize = matrixBufferSize.asInstanceOf[js.Any], masterMeshPreviousWorldMatrix = null, matrixBuffer = null, matrixData = null, previousMatrixBuffer = null, previousMatrixData = null, worldMatrices = null)
      __obj.asInstanceOf[ThinInstanceDataStorage]
    }
    
    extension [Self <: ThinInstanceDataStorage](x: Self) {
      
      inline def setBoundingVectors(value: js.Array[Vector3]): Self = StObject.set(x, "boundingVectors", value.asInstanceOf[js.Any])
      
      inline def setBoundingVectorsVarargs(value: Vector3*): Self = StObject.set(x, "boundingVectors", js.Array(value*))
      
      inline def setInstancesCount(value: Double): Self = StObject.set(x, "instancesCount", value.asInstanceOf[js.Any])
      
      inline def setMasterMeshPreviousWorldMatrix(value: Nullable[Matrix]): Self = StObject.set(x, "masterMeshPreviousWorldMatrix", value.asInstanceOf[js.Any])
      
      inline def setMasterMeshPreviousWorldMatrixNull: Self = StObject.set(x, "masterMeshPreviousWorldMatrix", null)
      
      inline def setMatrixBuffer(value: Nullable[Buffer]): Self = StObject.set(x, "matrixBuffer", value.asInstanceOf[js.Any])
      
      inline def setMatrixBufferNull: Self = StObject.set(x, "matrixBuffer", null)
      
      inline def setMatrixBufferSize(value: Double): Self = StObject.set(x, "matrixBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMatrixData(value: Nullable[js.typedarray.Float32Array]): Self = StObject.set(x, "matrixData", value.asInstanceOf[js.Any])
      
      inline def setMatrixDataNull: Self = StObject.set(x, "matrixData", null)
      
      inline def setPreviousMatrixBuffer(value: Nullable[Buffer]): Self = StObject.set(x, "previousMatrixBuffer", value.asInstanceOf[js.Any])
      
      inline def setPreviousMatrixBufferNull: Self = StObject.set(x, "previousMatrixBuffer", null)
      
      inline def setPreviousMatrixData(value: Nullable[js.typedarray.Float32Array]): Self = StObject.set(x, "previousMatrixData", value.asInstanceOf[js.Any])
      
      inline def setPreviousMatrixDataNull: Self = StObject.set(x, "previousMatrixData", null)
      
      inline def setWorldMatrices(value: Nullable[js.Array[Matrix]]): Self = StObject.set(x, "worldMatrices", value.asInstanceOf[js.Any])
      
      inline def setWorldMatricesNull: Self = StObject.set(x, "worldMatrices", null)
      
      inline def setWorldMatricesVarargs(value: Matrix*): Self = StObject.set(x, "worldMatrices", js.Array(value*))
    }
  }
  
  /* augmented module */
  object babylonjsMeshesMeshAugmentingMod {
    
    trait Mesh extends StObject {
      
      /**
        * Sets the mesh material by the material or multiMaterial `id` property
        * @param id is a string identifying the material or the multiMaterial
        * @returns the current mesh
        * @deprecated Please use MeshBuilder instead Please use setMaterialById instead
        */
      def setMaterialByID(id: String): typings.babylonjs.meshMod.babylonjsMeshesMeshAugmentingMod.Mesh
    }
    object Mesh {
      
      inline def apply(setMaterialByID: String => typings.babylonjs.meshMod.babylonjsMeshesMeshAugmentingMod.Mesh): typings.babylonjs.meshMod.babylonjsMeshesMeshAugmentingMod.Mesh = {
        val __obj = js.Dynamic.literal(setMaterialByID = js.Any.fromFunction1(setMaterialByID))
        __obj.asInstanceOf[typings.babylonjs.meshMod.babylonjsMeshesMeshAugmentingMod.Mesh]
      }
      
      extension [Self <: typings.babylonjs.meshMod.babylonjsMeshesMeshAugmentingMod.Mesh](x: Self) {
        
        inline def setSetMaterialByID(value: String => typings.babylonjs.meshMod.babylonjsMeshesMeshAugmentingMod.Mesh): Self = StObject.set(x, "setMaterialByID", js.Any.fromFunction1(value))
      }
    }
  }
}
