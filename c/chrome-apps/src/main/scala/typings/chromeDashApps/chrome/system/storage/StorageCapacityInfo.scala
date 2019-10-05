package typings.chromeDashApps.chrome.system.storage

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageCapacityInfo extends js.Object {
  /** The available capacity of the storage device, in bytes. */
  var availableCapacity: integer
  /** A copied **id** of getAvailableCapacity function parameter **id**. */
  var id: String
}

object StorageCapacityInfo {
  @scala.inline
  def apply(availableCapacity: integer, id: String): StorageCapacityInfo = {
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity, id = id)
  
    __obj.asInstanceOf[StorageCapacityInfo]
  }
}

