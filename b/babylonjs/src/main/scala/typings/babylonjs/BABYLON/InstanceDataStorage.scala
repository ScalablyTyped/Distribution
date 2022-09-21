package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
