package typings.chromeDashApps.chrome.system.memory

import typings.chromeDashApps.chrome.double
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  /** The amount of available capacity, in bytes. */
  var availableCapacity: double
  /** The total amount of physical memory capacity, in bytes. */
  var capacity: double
}

object MemoryInfo {
  @scala.inline
  def apply(availableCapacity: double, capacity: double): MemoryInfo = {
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity, capacity = capacity)
  
    __obj.asInstanceOf[MemoryInfo]
  }
}

