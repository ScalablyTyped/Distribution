package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservedNodeExchangeOfferingsInputMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of ReservedNodeOfferings.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * An integer setting the maximum number of ReservedNodeOfferings to retrieve.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * A string representing the node identifier for the DC1 Reserved Node to be exchanged.
    */
  var ReservedNodeId: String = js.native
}

object GetReservedNodeExchangeOfferingsInputMessage {
  @scala.inline
  def apply(ReservedNodeId: String): GetReservedNodeExchangeOfferingsInputMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeId = ReservedNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservedNodeExchangeOfferingsInputMessage]
  }
  @scala.inline
  implicit class GetReservedNodeExchangeOfferingsInputMessageOps[Self <: GetReservedNodeExchangeOfferingsInputMessage] (val x: Self) extends AnyVal {
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
  }
  
}

