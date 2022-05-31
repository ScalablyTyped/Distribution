package typings.babylonjs.BABYLON

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  **/
trait InstanceDataStorage extends StObject {
  
  var batchCache: InstancesBatch
  
  var hardwareInstancedRendering: Boolean
  
  var instancesBuffer: Nullable[Buffer]
  
  var instancesBufferSize: Double
  
  var instancesData: Float32Array
  
  var isFrozen: Boolean
  
  var manualUpdate: Boolean
  
  var overridenInstanceCount: Double
  
  var previousBatch: Nullable[InstancesBatch]
  
  var previousRenderId: Double
  
  var sideOrientation: Double
  
  var visibleInstances: js.Any
}
object InstanceDataStorage {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(batchCache = batchCache.asInstanceOf[js.Any], hardwareInstancedRendering = hardwareInstancedRendering.asInstanceOf[js.Any], instancesBufferSize = instancesBufferSize.asInstanceOf[js.Any], instancesData = instancesData.asInstanceOf[js.Any], isFrozen = isFrozen.asInstanceOf[js.Any], manualUpdate = manualUpdate.asInstanceOf[js.Any], overridenInstanceCount = overridenInstanceCount.asInstanceOf[js.Any], previousRenderId = previousRenderId.asInstanceOf[js.Any], sideOrientation = sideOrientation.asInstanceOf[js.Any], visibleInstances = visibleInstances.asInstanceOf[js.Any], instancesBuffer = null, previousBatch = null)
    __obj.asInstanceOf[InstanceDataStorage]
  }
  
  extension [Self <: InstanceDataStorage](x: Self) {
    
    inline def setBatchCache(value: InstancesBatch): Self = StObject.set(x, "batchCache", value.asInstanceOf[js.Any])
    
    inline def setHardwareInstancedRendering(value: Boolean): Self = StObject.set(x, "hardwareInstancedRendering", value.asInstanceOf[js.Any])
    
    inline def setInstancesBuffer(value: Nullable[Buffer]): Self = StObject.set(x, "instancesBuffer", value.asInstanceOf[js.Any])
    
    inline def setInstancesBufferNull: Self = StObject.set(x, "instancesBuffer", null)
    
    inline def setInstancesBufferSize(value: Double): Self = StObject.set(x, "instancesBufferSize", value.asInstanceOf[js.Any])
    
    inline def setInstancesData(value: Float32Array): Self = StObject.set(x, "instancesData", value.asInstanceOf[js.Any])
    
    inline def setIsFrozen(value: Boolean): Self = StObject.set(x, "isFrozen", value.asInstanceOf[js.Any])
    
    inline def setManualUpdate(value: Boolean): Self = StObject.set(x, "manualUpdate", value.asInstanceOf[js.Any])
    
    inline def setOverridenInstanceCount(value: Double): Self = StObject.set(x, "overridenInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setPreviousBatch(value: Nullable[InstancesBatch]): Self = StObject.set(x, "previousBatch", value.asInstanceOf[js.Any])
    
    inline def setPreviousBatchNull: Self = StObject.set(x, "previousBatch", null)
    
    inline def setPreviousRenderId(value: Double): Self = StObject.set(x, "previousRenderId", value.asInstanceOf[js.Any])
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setVisibleInstances(value: js.Any): Self = StObject.set(x, "visibleInstances", value.asInstanceOf[js.Any])
  }
}
