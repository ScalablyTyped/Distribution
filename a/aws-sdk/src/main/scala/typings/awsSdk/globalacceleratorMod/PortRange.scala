package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortRange extends js.Object {
  /**
    * The first port in the range of ports, inclusive.
    */
  var FromPort: js.UndefOr[PortNumber] = js.native
  /**
    * The last port in the range of ports, inclusive.
    */
  var ToPort: js.UndefOr[PortNumber] = js.native
}

object PortRange {
  @scala.inline
  def apply(): PortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortRange]
  }
  @scala.inline
  implicit class PortRangeOps[Self <: PortRange] (val x: Self) extends AnyVal {
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
    def setFromPort(value: PortNumber): Self = this.set("FromPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromPort: Self = this.set("FromPort", js.undefined)
    @scala.inline
    def setToPort(value: PortNumber): Self = this.set("ToPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToPort: Self = this.set("ToPort", js.undefined)
  }
  
}

