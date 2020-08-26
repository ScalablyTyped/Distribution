package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGatewayInformationInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that you want to use to monitor and log events in the gateway. For more information, see What is Amazon CloudWatch logs?.
    */
  var CloudWatchLogGroupARN: js.UndefOr[typings.awsSdk.storagegatewayMod.CloudWatchLogGroupARN] = js.native
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  var GatewayName: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayName] = js.native
  /**
    * A value that indicates the time zone of the gateway.
    */
  var GatewayTimezone: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayTimezone] = js.native
}

object UpdateGatewayInformationInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): UpdateGatewayInformationInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayInformationInput]
  }
  @scala.inline
  implicit class UpdateGatewayInformationInputOps[Self <: UpdateGatewayInformationInput] (val x: Self) extends AnyVal {
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
    def setCloudWatchLogGroupARN(value: CloudWatchLogGroupARN): Self = this.set("CloudWatchLogGroupARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLogGroupARN: Self = this.set("CloudWatchLogGroupARN", js.undefined)
    @scala.inline
    def setGatewayName(value: GatewayName): Self = this.set("GatewayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayName: Self = this.set("GatewayName", js.undefined)
    @scala.inline
    def setGatewayTimezone(value: GatewayTimezone): Self = this.set("GatewayTimezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayTimezone: Self = this.set("GatewayTimezone", js.undefined)
  }
  
}

