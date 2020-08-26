package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBandwidthRateLimitOutput extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object DeleteBandwidthRateLimitOutput {
  @scala.inline
  def apply(): DeleteBandwidthRateLimitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBandwidthRateLimitOutput]
  }
  @scala.inline
  implicit class DeleteBandwidthRateLimitOutputOps[Self <: DeleteBandwidthRateLimitOutput] (val x: Self) extends AnyVal {
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
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
  }
  
}

