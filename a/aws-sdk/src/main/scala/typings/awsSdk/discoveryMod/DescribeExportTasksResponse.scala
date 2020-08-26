package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportTasksResponse extends js.Object {
  /**
    * Contains one or more sets of export request details. When the status of a request is SUCCEEDED, the response includes a URL for an Amazon S3 bucket where you can view the data in a CSV file.
    */
  var exportsInfo: js.UndefOr[ExportsInfo] = js.native
  /**
    * The nextToken value to include in a future DescribeExportTasks request. When the results of a DescribeExportTasks request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeExportTasksResponse {
  @scala.inline
  def apply(): DescribeExportTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksResponse]
  }
  @scala.inline
  implicit class DescribeExportTasksResponseOps[Self <: DescribeExportTasksResponse] (val x: Self) extends AnyVal {
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
    def setExportsInfoVarargs(value: ExportInfo*): Self = this.set("exportsInfo", js.Array(value :_*))
    @scala.inline
    def setExportsInfo(value: ExportsInfo): Self = this.set("exportsInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportsInfo: Self = this.set("exportsInfo", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

