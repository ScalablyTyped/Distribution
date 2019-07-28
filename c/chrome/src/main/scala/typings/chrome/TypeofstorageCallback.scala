package typings.chrome

import typings.chrome.chromeNs.systemNs.storageNs.StorageCapacityInfo
import typings.chrome.chromeNs.systemNs.storageNs.StorageUnitInfo
import typings.chrome.chromeNs.systemNs.storageNs.SystemStorageAttachedEvent
import typings.chrome.chromeNs.systemNs.storageNs.SystemStorageDetachedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofstorageCallback extends js.Object {
  var onAttached: SystemStorageAttachedEvent
  var onDetached: SystemStorageDetachedEvent
  def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit
  def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit
}

object TypeofstorageCallback {
  @scala.inline
  def apply(
    ejectDevice: (String, js.Function1[/* result */ String, Unit]) => Unit,
    getAvailableCapacity: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Unit,
    getInfo: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Unit,
    onAttached: SystemStorageAttachedEvent,
    onDetached: SystemStorageDetachedEvent
  ): TypeofstorageCallback = {
    val __obj = js.Dynamic.literal(ejectDevice = js.Any.fromFunction2(ejectDevice), getAvailableCapacity = js.Any.fromFunction2(getAvailableCapacity), getInfo = js.Any.fromFunction1(getInfo), onAttached = onAttached, onDetached = onDetached)
  
    __obj.asInstanceOf[TypeofstorageCallback]
  }
}

