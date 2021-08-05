package typings.chrome.anon

import typings.chrome.chrome.system.storage.StorageCapacityInfo
import typings.chrome.chrome.system.storage.StorageUnitInfo
import typings.chrome.chrome.system.storage.SystemStorageAttachedEvent
import typings.chrome.chrome.system.storage.SystemStorageDetachedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofstorageEjectDevice extends StObject {
  
  def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit
  
  def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit
  
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit
  
  var onAttached: SystemStorageAttachedEvent
  
  var onDetached: SystemStorageDetachedEvent
}
object TypeofstorageEjectDevice {
  
  inline def apply(
    ejectDevice: (String, js.Function1[/* result */ String, Unit]) => Unit,
    getAvailableCapacity: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Unit,
    getInfo: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Unit,
    onAttached: SystemStorageAttachedEvent,
    onDetached: SystemStorageDetachedEvent
  ): TypeofstorageEjectDevice = {
    val __obj = js.Dynamic.literal(ejectDevice = js.Any.fromFunction2(ejectDevice), getAvailableCapacity = js.Any.fromFunction2(getAvailableCapacity), getInfo = js.Any.fromFunction1(getInfo), onAttached = onAttached.asInstanceOf[js.Any], onDetached = onDetached.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofstorageEjectDevice]
  }
  
  extension [Self <: TypeofstorageEjectDevice](x: Self) {
    
    inline def setEjectDevice(value: (String, js.Function1[/* result */ String, Unit]) => Unit): Self = StObject.set(x, "ejectDevice", js.Any.fromFunction2(value))
    
    inline def setGetAvailableCapacity(value: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Unit): Self = StObject.set(x, "getAvailableCapacity", js.Any.fromFunction2(value))
    
    inline def setGetInfo(value: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Unit): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    inline def setOnAttached(value: SystemStorageAttachedEvent): Self = StObject.set(x, "onAttached", value.asInstanceOf[js.Any])
    
    inline def setOnDetached(value: SystemStorageDetachedEvent): Self = StObject.set(x, "onDetached", value.asInstanceOf[js.Any])
  }
}
