package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovingAddressStatus extends js.Object {
  /**
    * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic platform.
    */
  var MoveStatus: js.UndefOr[typings.awsSdk.ec2Mod.MoveStatus] = js.native
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
}

object MovingAddressStatus {
  @scala.inline
  def apply(): MovingAddressStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovingAddressStatus]
  }
  @scala.inline
  implicit class MovingAddressStatusOps[Self <: MovingAddressStatus] (val x: Self) extends AnyVal {
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
    def setMoveStatus(value: MoveStatus): Self = this.set("MoveStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveStatus: Self = this.set("MoveStatus", js.undefined)
    @scala.inline
    def setPublicIp(value: String): Self = this.set("PublicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIp: Self = this.set("PublicIp", js.undefined)
  }
  
}

