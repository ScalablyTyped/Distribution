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
  def apply(
    ReservedNodeId: String,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  ): GetReservedNodeExchangeOfferingsInputMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeId = ReservedNodeId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservedNodeExchangeOfferingsInputMessage]
  }
}

