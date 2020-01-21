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
  def apply(
    Filters: FilterList = null,
    InstallationMediaId: String = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null
  ): DescribeInstallationMediaMessage = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (InstallationMediaId != null) __obj.updateDynamic("InstallationMediaId")(InstallationMediaId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstallationMediaMessage]
  }
}

