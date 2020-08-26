package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNetworking extends js.Object {
  /**
    * The amount of data in GB allocated for monthly data transfers.
    */
  var monthlyTransfer: js.UndefOr[MonthlyTransfer] = js.native
  /**
    * An array of key-value pairs containing information about the ports on the instance.
    */
  var ports: js.UndefOr[InstancePortInfoList] = js.native
}

object InstanceNetworking {
  @scala.inline
  def apply(): InstanceNetworking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworking]
  }
  @scala.inline
  implicit class InstanceNetworkingOps[Self <: InstanceNetworking] (val x: Self) extends AnyVal {
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
    def setMonthlyTransfer(value: MonthlyTransfer): Self = this.set("monthlyTransfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthlyTransfer: Self = this.set("monthlyTransfer", js.undefined)
    @scala.inline
    def setPortsVarargs(value: InstancePortInfo*): Self = this.set("ports", js.Array(value :_*))
    @scala.inline
    def setPorts(value: InstancePortInfoList): Self = this.set("ports", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
  }
  
}

