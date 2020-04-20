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
}

