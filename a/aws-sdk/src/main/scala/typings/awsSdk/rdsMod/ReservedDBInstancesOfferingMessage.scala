package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedDBInstancesOfferingMessage extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of reserved DB instance offerings.
    */
  var ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList] = js.native
}

object ReservedDBInstancesOfferingMessage {
  @scala.inline
  def apply(): ReservedDBInstancesOfferingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedDBInstancesOfferingMessage]
  }
  @scala.inline
  implicit class ReservedDBInstancesOfferingMessageOps[Self <: ReservedDBInstancesOfferingMessage] (val x: Self) extends AnyVal {
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setReservedDBInstancesOfferingsVarargs(value: ReservedDBInstancesOffering*): Self = this.set("ReservedDBInstancesOfferings", js.Array(value :_*))
    @scala.inline
    def setReservedDBInstancesOfferings(value: ReservedDBInstancesOfferingList): Self = this.set("ReservedDBInstancesOfferings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedDBInstancesOfferings: Self = this.set("ReservedDBInstancesOfferings", js.undefined)
  }
  
}

