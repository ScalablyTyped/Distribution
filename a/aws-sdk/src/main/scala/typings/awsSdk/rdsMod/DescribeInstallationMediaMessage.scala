package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstallationMediaMessage extends js.Object {
  /**
    * A filter that specifies one or more installation media to describe. Supported filters include the following:    custom-availability-zone-id - Accepts custom Availability Zone (AZ) identifiers. The results list includes information about only the custom AZs identified by these identifiers.    engine - Accepts database engines. The results list includes information about only the database engines identified by these identifiers. For more information about the valid engines for installation media, see ImportInstallationMedia.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The installation medium ID.
    */
  var InstallationMediaId: js.UndefOr[String] = js.native
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * An optional pagination token provided by a previous DescribeInstallationMedia request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}

object DescribeInstallationMediaMessage {
  @scala.inline
  def apply(): DescribeInstallationMediaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstallationMediaMessage]
  }
  @scala.inline
  implicit class DescribeInstallationMediaMessageOps[Self <: DescribeInstallationMediaMessage] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setInstallationMediaId(value: String): Self = this.set("InstallationMediaId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallationMediaId: Self = this.set("InstallationMediaId", js.undefined)
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

