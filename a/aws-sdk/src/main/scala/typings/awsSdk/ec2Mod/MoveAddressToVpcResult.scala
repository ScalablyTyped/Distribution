package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveAddressToVpcResult extends js.Object {
  /**
    * The allocation ID for the Elastic IP address.
    */
  var AllocationId: js.UndefOr[String] = js.native
  /**
    * The status of the move of the IP address.
    */
  var Status: js.UndefOr[typings.awsSdk.ec2Mod.Status] = js.native
}

object MoveAddressToVpcResult {
  @scala.inline
  def apply(): MoveAddressToVpcResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveAddressToVpcResult]
  }
  @scala.inline
  implicit class MoveAddressToVpcResultOps[Self <: MoveAddressToVpcResult] (val x: Self) extends AnyVal {
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
    def setAllocationId(value: String): Self = this.set("AllocationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationId: Self = this.set("AllocationId", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

