package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelRetrievalInput extends js.Object {
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * The Amazon Resource Name (ARN) of the virtual tape you want to cancel retrieval for.
    */
  var TapeARN: typings.awsSdk.storagegatewayMod.TapeARN = js.native
}

object CancelRetrievalInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): CancelRetrievalInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelRetrievalInput]
  }
}

