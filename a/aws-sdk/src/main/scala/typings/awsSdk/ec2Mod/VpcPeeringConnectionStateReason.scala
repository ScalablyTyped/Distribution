package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionStateReason extends js.Object {
  /**
    * The status of the VPC peering connection.
    */
  var Code: js.UndefOr[VpcPeeringConnectionStateReasonCode] = js.native
  /**
    * A message that provides more information about the status, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}

object VpcPeeringConnectionStateReason {
  @scala.inline
  def apply(): VpcPeeringConnectionStateReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionStateReason]
  }
  @scala.inline
  implicit class VpcPeeringConnectionStateReasonOps[Self <: VpcPeeringConnectionStateReason] (val x: Self) extends AnyVal {
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
    def setCode(value: VpcPeeringConnectionStateReasonCode): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

