package typings.chrome.chrome.system.memory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryInfo extends js.Object {
  /** The amount of available capacity, in bytes. */
  var availableCapacity: Double = js.native
  /** The total amount of physical memory capacity, in bytes. */
  var capacity: Double = js.native
}

object MemoryInfo {
  @scala.inline
  def apply(availableCapacity: Double, capacity: Double): MemoryInfo = {
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
  @scala.inline
  implicit class MemoryInfoOps[Self <: MemoryInfo] (val x: Self) extends AnyVal {
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
    def setAvailableCapacity(value: Double): Self = this.set("availableCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
  }
  
}

