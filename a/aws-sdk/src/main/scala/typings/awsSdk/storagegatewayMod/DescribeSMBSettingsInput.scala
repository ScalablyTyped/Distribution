package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSMBSettingsInput extends js.Object {
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object DescribeSMBSettingsInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeSMBSettingsInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSMBSettingsInput]
  }
  @scala.inline
  implicit class DescribeSMBSettingsInputOps[Self <: DescribeSMBSettingsInput] (val x: Self) extends AnyVal {
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
  }
  
}

