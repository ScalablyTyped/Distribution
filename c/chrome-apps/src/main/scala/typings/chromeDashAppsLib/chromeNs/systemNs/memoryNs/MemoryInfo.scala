package typings
package chromeDashAppsLib.chromeNs.systemNs.memoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  /** The amount of available capacity, in bytes. */
  var availableCapacity: chromeDashAppsLib.chromeNs.double
  /** The total amount of physical memory capacity, in bytes. */
  var capacity: chromeDashAppsLib.chromeNs.double
}

object MemoryInfo {
  @scala.inline
  def apply(availableCapacity: chromeDashAppsLib.chromeNs.double, capacity: chromeDashAppsLib.chromeNs.double): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("availableCapacity")(availableCapacity)
    __obj.updateDynamic("capacity")(capacity)
    __obj.asInstanceOf[MemoryInfo]
  }
}

