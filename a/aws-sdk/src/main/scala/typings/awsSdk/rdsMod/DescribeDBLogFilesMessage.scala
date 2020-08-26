package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBLogFilesMessage extends js.Object {
  /**
    * The customer-assigned name of the DB instance that contains the log files you want to list. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String = js.native
  /**
    * Filters the available log files for files written since the specified date, in POSIX timestamp format with milliseconds.
    */
  var FileLastWritten: js.UndefOr[Long] = js.native
  /**
    * Filters the available log files for files larger than the specified size.
    */
  var FileSize: js.UndefOr[Long] = js.native
  /**
    * Filters the available log files for log file names that contain the specified string.
    */
  var FilenameContains: js.UndefOr[String] = js.native
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The pagination token provided in the previous request. If this parameter is specified the response includes only records beyond the marker, up to MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}

object DescribeDBLogFilesMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): DescribeDBLogFilesMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBLogFilesMessage]
  }
  @scala.inline
  implicit class DescribeDBLogFilesMessageOps[Self <: DescribeDBLogFilesMessage] (val x: Self) extends AnyVal {
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
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileLastWritten(value: Long): Self = this.set("FileLastWritten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileLastWritten: Self = this.set("FileLastWritten", js.undefined)
    @scala.inline
    def setFileSize(value: Long): Self = this.set("FileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSize: Self = this.set("FileSize", js.undefined)
    @scala.inline
    def setFilenameContains(value: String): Self = this.set("FilenameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilenameContains: Self = this.set("FilenameContains", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
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

