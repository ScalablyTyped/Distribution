package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackEjectDevice extends js.Object {
  var onAttached: chromeLib.chromeNs.systemNs.storageNs.SystemStorageAttachedEvent
  var onDetached: chromeLib.chromeNs.systemNs.storageNs.SystemStorageDetachedEvent
  def ejectDevice(id: java.lang.String, callback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit
  def getAvailableCapacity(
    id: java.lang.String,
    callback: js.Function1[/* info */ chromeLib.chromeNs.systemNs.storageNs.StorageCapacityInfo, scala.Unit]
  ): scala.Unit
  def getInfo(
    callback: js.Function1[
      /* info */ js.Array[chromeLib.chromeNs.systemNs.storageNs.StorageUnitInfo], 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_CallbackEjectDevice {
  @scala.inline
  def apply(
    ejectDevice: js.Function2[
      java.lang.String, 
      js.Function1[/* result */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    getAvailableCapacity: js.Function2[
      java.lang.String, 
      js.Function1[/* info */ chromeLib.chromeNs.systemNs.storageNs.StorageCapacityInfo, scala.Unit], 
      scala.Unit
    ],
    getInfo: js.Function1[
      js.Function1[
        /* info */ js.Array[chromeLib.chromeNs.systemNs.storageNs.StorageUnitInfo], 
        scala.Unit
      ], 
      scala.Unit
    ],
    onAttached: chromeLib.chromeNs.systemNs.storageNs.SystemStorageAttachedEvent,
    onDetached: chromeLib.chromeNs.systemNs.storageNs.SystemStorageDetachedEvent
  ): Anon_CallbackEjectDevice = {
    val __obj = js.Dynamic.literal(ejectDevice = ejectDevice, getAvailableCapacity = getAvailableCapacity, getInfo = getInfo, onAttached = onAttached, onDetached = onDetached)
  
    __obj.asInstanceOf[Anon_CallbackEjectDevice]
  }
}

