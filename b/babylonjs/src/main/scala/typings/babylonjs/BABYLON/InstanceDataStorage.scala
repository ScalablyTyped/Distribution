package typings.babylonjs.BABYLON

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
