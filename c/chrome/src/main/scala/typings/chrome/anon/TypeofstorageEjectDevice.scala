package typings.chrome.anon

import typings.chrome.chrome.system.storage.StorageCapacityInfo
import typings.chrome.chrome.system.storage.StorageUnitInfo
import typings.chrome.chrome.system.storage.SystemStorageAttachedEvent
import typings.chrome.chrome.system.storage.SystemStorageDetachedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofstorageEjectDevice extends StObject {
  
  def ejectDevice(id: String): js.Promise[String] = js.native
  def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def getAvailableCapacity(id: String): js.Promise[StorageCapacityInfo] = js.native
  def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = js.native
  
  def getInfo(): js.Promise[js.Array[StorageUnitInfo]] = js.native
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = js.native
  
  var onAttached: SystemStorageAttachedEvent = js.native
  
  var onDetached: SystemStorageDetachedEvent = js.native
}
