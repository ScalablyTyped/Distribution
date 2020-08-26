package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortRange extends js.Object {
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MaxRange: js.UndefOr[Port] = js.native
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MinRange: Port = js.native
}

object PortRange {
  @scala.inline
  def apply(MinRange: Port): PortRange = {
    val __obj = js.Dynamic.literal(MinRange = MinRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
  @scala.inline
  implicit class PortRangeOps[Self <: PortRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMinRange(value: Port): Self = this.set("MinRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxRange(value: Port): Self = this.set("MaxRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRange: Self = this.set("MaxRange", js.undefined)
  }
  
}

