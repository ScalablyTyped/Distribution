package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelArchivalInput extends js.Object {
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * The Amazon Resource Name (ARN) of the virtual tape you want to cancel archiving for.
    */
  var TapeARN: typings.awsSdk.storagegatewayMod.TapeARN = js.native
}

object CancelArchivalInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): CancelArchivalInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelArchivalInput]
  }
}

