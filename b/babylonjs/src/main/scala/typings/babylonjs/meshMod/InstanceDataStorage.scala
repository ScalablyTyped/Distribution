package typings.babylonjs.meshMod

import typings.babylonjs.bufferMod.Buffer
import typings.babylonjs.typesMod.Nullable
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  **/
@js.native
trait InstanceDataStorage extends js.Object {
  
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
  implicit class InstanceDataStorageOps[Self <: InstanceDataStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatchCache(value: InstancesBatch): Self = this.set("batchCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareInstancedRendering(value: Boolean): Self = this.set("hardwareInstancedRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesBufferSize(value: Double): Self = this.set("instancesBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesData(value: Float32Array): Self = this.set("instancesData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFrozen(value: Boolean): Self = this.set("isFrozen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualUpdate(value: Boolean): Self = this.set("manualUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridenInstanceCount(value: Double): Self = this.set("overridenInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRenderId(value: Double): Self = this.set("previousRenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientation(value: Double): Self = this.set("sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleInstances(value: js.Any): Self = this.set("visibleInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesBuffer(value: Nullable[Buffer]): Self = this.set("instancesBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesBufferNull: Self = this.set("instancesBuffer", null)
    
    @scala.inline
    def setPreviousBatch(value: Nullable[InstancesBatch]): Self = this.set("previousBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousBatchNull: Self = this.set("previousBatch", null)
  }
}
