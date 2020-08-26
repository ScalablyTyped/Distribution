package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReportGroupsOutput extends js.Object {
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    *  The list of ARNs for the report groups in the current AWS account. 
    */
  var reportGroups: js.UndefOr[ReportGroupArns] = js.native
}

object ListReportGroupsOutput {
  @scala.inline
  def apply(): ListReportGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportGroupsOutput]
  }
  @scala.inline
  implicit class ListReportGroupsOutputOps[Self <: ListReportGroupsOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setReportGroupsVarargs(value: NonEmptyString*): Self = this.set("reportGroups", js.Array(value :_*))
    @scala.inline
    def setReportGroups(value: ReportGroupArns): Self = this.set("reportGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportGroups: Self = this.set("reportGroups", js.undefined)
  }
  
}

