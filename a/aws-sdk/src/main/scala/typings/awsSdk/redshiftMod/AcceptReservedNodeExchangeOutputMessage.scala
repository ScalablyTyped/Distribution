package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptReservedNodeExchangeOutputMessage extends js.Object {
  /**
    * 
    */
  var ExchangedReservedNode: js.UndefOr[ReservedNode] = js.native
}

object AcceptReservedNodeExchangeOutputMessage {
  @scala.inline
  def apply(ExchangedReservedNode: ReservedNode = null): AcceptReservedNodeExchangeOutputMessage = {
    val __obj = js.Dynamic.literal()
    if (ExchangedReservedNode != null) __obj.updateDynamic("ExchangedReservedNode")(ExchangedReservedNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptReservedNodeExchangeOutputMessage]
  }
}

