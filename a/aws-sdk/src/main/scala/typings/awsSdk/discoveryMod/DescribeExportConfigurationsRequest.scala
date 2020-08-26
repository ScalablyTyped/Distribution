package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportConfigurationsRequest extends js.Object {
  /**
    * A list of continuous export IDs to search for.
    */
  var exportIds: js.UndefOr[ExportIds] = js.native
  /**
    * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * The token from the previous call to describe-export-tasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeExportConfigurationsRequest {
  @scala.inline
  def apply(): DescribeExportConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportConfigurationsRequest]
  }
  @scala.inline
  implicit class DescribeExportConfigurationsRequestOps[Self <: DescribeExportConfigurationsRequest] (val x: Self) extends AnyVal {
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
    def setExportIdsVarargs(value: ConfigurationsExportId*): Self = this.set("exportIds", js.Array(value :_*))
    @scala.inline
    def setExportIds(value: ExportIds): Self = this.set("exportIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportIds: Self = this.set("exportIds", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

