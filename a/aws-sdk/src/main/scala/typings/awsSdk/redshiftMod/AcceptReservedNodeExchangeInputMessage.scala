package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptReservedNodeExchangeInputMessage extends js.Object {
  /**
    * A string representing the node identifier of the DC1 Reserved Node to be exchanged.
    */
  var ReservedNodeId: String = js.native
  /**
    * The unique identifier of the DC2 Reserved Node offering to be used for the exchange. You can obtain the value for the parameter by calling GetReservedNodeExchangeOfferings 
    */
  var TargetReservedNodeOfferingId: String = js.native
}

object AcceptReservedNodeExchangeInputMessage {
  @scala.inline
  def apply(ReservedNodeId: String, TargetReservedNodeOfferingId: String): AcceptReservedNodeExchangeInputMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeId = ReservedNodeId.asInstanceOf[js.Any], TargetReservedNodeOfferingId = TargetReservedNodeOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptReservedNodeExchangeInputMessage]
  }
  @scala.inline
  implicit class AcceptReservedNodeExchangeInputMessageOps[Self <: AcceptReservedNodeExchangeInputMessage] (val x: Self) extends AnyVal {
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
    def setReservedNodeId(value: String): Self = this.set("ReservedNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetReservedNodeOfferingId(value: String): Self = this.set("TargetReservedNodeOfferingId", value.asInstanceOf[js.Any])
  }
  
}

