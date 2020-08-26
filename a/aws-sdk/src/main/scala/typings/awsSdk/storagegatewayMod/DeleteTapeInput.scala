package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTapeInput extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) of the gateway that the virtual tape to delete is associated with. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * The Amazon Resource Name (ARN) of the virtual tape to delete.
    */
  var TapeARN: typings.awsSdk.storagegatewayMod.TapeARN = js.native
}

object DeleteTapeInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): DeleteTapeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTapeInput]
  }
  @scala.inline
  implicit class DeleteTapeInputOps[Self <: DeleteTapeInput] (val x: Self) extends AnyVal {
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
    def setTapeARN(value: TapeARN): Self = this.set("TapeARN", value.asInstanceOf[js.Any])
  }
  
}

