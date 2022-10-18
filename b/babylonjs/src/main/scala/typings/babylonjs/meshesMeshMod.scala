package typings.babylonjs

import typings.babylonjs.anon.Data
import typings.babylonjs.anon.DeepImmutableObjectMatrix
import typings.babylonjs.anon.Sizes
import typings.babylonjs.buffersBufferMod.Buffer
import typings.babylonjs.mathsMathDotpathMod.Path3D
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesInstancedMeshMod.InstancedMesh
import typings.babylonjs.meshesMeshSimplificationMod.ISimplificationSettings
import typings.babylonjs.meshesMeshSimplificationMod.SimplificationType
import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesMeshMod {
  
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
  
  /**
    * @internal
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
  
  @js.native
  trait Mesh extends StObject {
    
    /**
      * Invalidate VertexArrayObjects belonging to the mesh (but not to the Geometry of the mesh).
      */
    def _invalidateInstanceVertexArrayObject(): Unit = js.native
    
    /** @internal */
    def _thinInstanceCreateMatrixBuffer(kind: String, buffer: Nullable[js.typedarray.Float32Array], staticBuffer: Boolean): Buffer = js.native
    
    /** @internal */
    def _thinInstanceInitializeUserStorage(): Unit = js.native
    
    /** @internal */
    def _thinInstanceUpdateBufferSize(kind: String): Unit = js.native
    def _thinInstanceUpdateBufferSize(kind: String, numInstances: Double): Unit = js.native
    
    /** @internal */
    var _userInstancedBuffersStorage: Data = js.native
    
    /** @internal */
    var _userThinInstanceBuffersStorage: Sizes = js.native
    
    /**
      * true to use the edge renderer for all instances of this mesh
      */
    var edgesShareWithInstances: Boolean = js.native
    
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
    
    /**
      * Register a custom buffer that will be instanced
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
      * @param kind defines the buffer kind
      * @param stride defines the stride in floats
      */
    def registerInstancedBuffer(kind: String, stride: Double): Unit = js.native
    
    /**
      * Sets the mesh material by the material or multiMaterial `id` property
      * @param id is a string identifying the material or the multiMaterial
      * @returns the current mesh
      * @deprecated Please use MeshBuilder instead Please use setMaterialById instead
      */
    def setMaterialByID(id: String): typings.babylonjs.meshesMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    
    /**
      * Simplify the mesh according to the given array of settings.
      * Function will return immediately and will simplify async
      * @param settings a collection of simplification settings
      * @param parallelProcessing should all levels calculate parallel or one after the other
      * @param simplificationType the type of simplification to run
      * @param successCallback optional success callback to be called after the simplification finished processing all settings
      * @returns the current mesh
      */
    def simplify(settings: js.Array[ISimplificationSettings]): typings.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean): typings.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: Unit,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typings.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: SimplificationType
    ): typings.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Boolean,
      simplificationType: SimplificationType,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typings.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Unit,
      simplificationType: Unit,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typings.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Unit,
      simplificationType: SimplificationType
    ): typings.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    def simplify(
      settings: js.Array[ISimplificationSettings],
      parallelProcessing: Unit,
      simplificationType: SimplificationType,
      successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
    ): typings.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsMeshesMeshAugmentingMod.Mesh = js.native
    
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
  }
  
  /**
    * @internal
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
      def setMaterialByID(id: String): typings.babylonjs.meshesMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh
    }
    object Mesh {
      
      inline def apply(setMaterialByID: String => typings.babylonjs.meshesMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh): typings.babylonjs.meshesMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh = {
        val __obj = js.Dynamic.literal(setMaterialByID = js.Any.fromFunction1(setMaterialByID))
        __obj.asInstanceOf[typings.babylonjs.meshesMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh]
      }
      
      extension [Self <: typings.babylonjs.meshesMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh](x: Self) {
        
        inline def setSetMaterialByID(value: String => typings.babylonjs.meshesMeshMod.babylonjsMeshesMeshAugmentingMod.Mesh): Self = StObject.set(x, "setMaterialByID", js.Any.fromFunction1(value))
      }
    }
  }
}
