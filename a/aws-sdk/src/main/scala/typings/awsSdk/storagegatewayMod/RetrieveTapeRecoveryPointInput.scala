package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveTapeRecoveryPointInput extends js.Object {
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which you want to retrieve the recovery point.
    */
  var TapeARN: typings.awsSdk.storagegatewayMod.TapeARN = js.native
}

object RetrieveTapeRecoveryPointInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): RetrieveTapeRecoveryPointInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveTapeRecoveryPointInput]
  }
  @scala.inline
  implicit class RetrieveTapeRecoveryPointInputOps[Self <: RetrieveTapeRecoveryPointInput] (val x: Self) extends AnyVal {
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

