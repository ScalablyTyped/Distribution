package typings
package chromeDashAppsLib.chromeNs.systemNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageCapacityInfo extends js.Object {
  /** The available capacity of the storage device, in bytes. */
  var availableCapacity: chromeDashAppsLib.chromeNs.integer
  /** A copied **id** of getAvailableCapacity function parameter **id**. */
  var id: java.lang.String
}

object StorageCapacityInfo {
  @scala.inline
  def apply(availableCapacity: chromeDashAppsLib.chromeNs.integer, id: java.lang.String): StorageCapacityInfo = {
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity, id = id)
  
    __obj.asInstanceOf[StorageCapacityInfo]
  }
}

