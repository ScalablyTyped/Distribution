package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBLogFilesResponse extends js.Object {
  /**
    * The DB log files returned.
    */
  var DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList] = js.native
  /**
    * A pagination token that can be used in a later DescribeDBLogFiles request.
    */
  var Marker: js.UndefOr[String] = js.native
}

object DescribeDBLogFilesResponse {
  @scala.inline
  def apply(DescribeDBLogFiles: DescribeDBLogFilesList = null, Marker: String = null): DescribeDBLogFilesResponse = {
    val __obj = js.Dynamic.literal()
    if (DescribeDBLogFiles != null) __obj.updateDynamic("DescribeDBLogFiles")(DescribeDBLogFiles.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBLogFilesResponse]
  }
}

