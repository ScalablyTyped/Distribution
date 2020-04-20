package typings.chromeApps.chrome.system.memory

import typings.chromeApps.chrome.double
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
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
}

