package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNatGatewayResult extends js.Object {
  /**
    * The ID of the NAT gateway.
    */
  var NatGatewayId: js.UndefOr[String] = js.native
}

object DeleteNatGatewayResult {
  @scala.inline
  def apply(): DeleteNatGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNatGatewayResult]
  }
  @scala.inline
  implicit class DeleteNatGatewayResultOps[Self <: DeleteNatGatewayResult] (val x: Self) extends AnyVal {
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
    def setNatGatewayId(value: String): Self = this.set("NatGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatGatewayId: Self = this.set("NatGatewayId", js.undefined)
  }
  
}

