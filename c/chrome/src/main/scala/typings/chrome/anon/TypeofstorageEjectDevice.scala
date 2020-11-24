package typings.chrome.anon

import typings.chrome.chrome.system.storage.StorageCapacityInfo
import typings.chrome.chrome.system.storage.StorageUnitInfo
import typings.chrome.chrome.system.storage.SystemStorageAttachedEvent
import typings.chrome.chrome.system.storage.SystemStorageDetachedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofstorageEjectDevice extends js.Object {
  
  def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = js.native
  
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = js.native
  
  var onAttached: SystemStorageAttachedEvent = js.native
  
  var onDetached: SystemStorageDetachedEvent = js.native
}
object TypeofstorageEjectDevice {
  
  @scala.inline
  def apply(
    ejectDevice: (String, js.Function1[/* result */ String, Unit]) => Unit,
    getAvailableCapacity: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Unit,
    getInfo: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Unit,
    onAttached: SystemStorageAttachedEvent,
    onDetached: SystemStorageDetachedEvent
  ): TypeofstorageEjectDevice = {
    val __obj = js.Dynamic.literal(ejectDevice = js.Any.fromFunction2(ejectDevice), getAvailableCapacity = js.Any.fromFunction2(getAvailableCapacity), getInfo = js.Any.fromFunction1(getInfo), onAttached = onAttached.asInstanceOf[js.Any], onDetached = onDetached.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofstorageEjectDevice]
  }
  
  @scala.inline
  implicit class TypeofstorageEjectDeviceOps[Self <: TypeofstorageEjectDevice] (val x: Self) extends AnyVal {
    
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
    def setEjectDevice(value: (String, js.Function1[/* result */ String, Unit]) => Unit): Self = this.set("ejectDevice", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAvailableCapacity(value: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Unit): Self = this.set("getAvailableCapacity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetInfo(value: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Unit): Self = this.set("getInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAttached(value: SystemStorageAttachedEvent): Self = this.set("onAttached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDetached(value: SystemStorageDetachedEvent): Self = this.set("onDetached", value.asInstanceOf[js.Any])
  }
}
