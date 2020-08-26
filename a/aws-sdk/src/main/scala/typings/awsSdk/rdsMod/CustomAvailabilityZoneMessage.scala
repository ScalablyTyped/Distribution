package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAvailabilityZoneMessage extends js.Object {
  /**
    * The list of CustomAvailabilityZone objects for the AWS account.
    */
  var CustomAvailabilityZones: js.UndefOr[CustomAvailabilityZoneList] = js.native
  /**
    * An optional pagination token provided by a previous DescribeCustomAvailabilityZones request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CustomAvailabilityZoneMessage {
  @scala.inline
  def apply(): CustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAvailabilityZoneMessage]
  }
  @scala.inline
  implicit class CustomAvailabilityZoneMessageOps[Self <: CustomAvailabilityZoneMessage] (val x: Self) extends AnyVal {
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
    def setCustomAvailabilityZonesVarargs(value: CustomAvailabilityZone*): Self = this.set("CustomAvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setCustomAvailabilityZones(value: CustomAvailabilityZoneList): Self = this.set("CustomAvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAvailabilityZones: Self = this.set("CustomAvailabilityZones", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

