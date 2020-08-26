package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTableRestoreStatusMessage extends js.Object {
  /**
    * The Amazon Redshift cluster that the table is being restored to.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * An optional pagination token provided by a previous DescribeTableRestoreStatus request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The identifier of the table restore request to return status for. If you don't specify a TableRestoreRequestId value, then DescribeTableRestoreStatus returns the status of all in-progress table restore requests.
    */
  var TableRestoreRequestId: js.UndefOr[String] = js.native
}

object DescribeTableRestoreStatusMessage {
  @scala.inline
  def apply(): DescribeTableRestoreStatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableRestoreStatusMessage]
  }
  @scala.inline
  implicit class DescribeTableRestoreStatusMessageOps[Self <: DescribeTableRestoreStatusMessage] (val x: Self) extends AnyVal {
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    @scala.inline
    def setTableRestoreRequestId(value: String): Self = this.set("TableRestoreRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRestoreRequestId: Self = this.set("TableRestoreRequestId", js.undefined)
  }
  
}

