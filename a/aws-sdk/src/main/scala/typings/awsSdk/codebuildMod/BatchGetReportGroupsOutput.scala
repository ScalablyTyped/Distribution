package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetReportGroupsOutput extends js.Object {
  /**
    *  The array of report groups returned by BatchGetReportGroups. 
    */
  var reportGroups: js.UndefOr[ReportGroups] = js.native
  /**
    *  An array of ARNs passed to BatchGetReportGroups that are not associated with a ReportGroup. 
    */
  var reportGroupsNotFound: js.UndefOr[ReportGroupArns] = js.native
}

object BatchGetReportGroupsOutput {
  @scala.inline
  def apply(): BatchGetReportGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetReportGroupsOutput]
  }
  @scala.inline
  implicit class BatchGetReportGroupsOutputOps[Self <: BatchGetReportGroupsOutput] (val x: Self) extends AnyVal {
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
    def setReportGroupsVarargs(value: ReportGroup*): Self = this.set("reportGroups", js.Array(value :_*))
    @scala.inline
    def setReportGroups(value: ReportGroups): Self = this.set("reportGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportGroups: Self = this.set("reportGroups", js.undefined)
    @scala.inline
    def setReportGroupsNotFoundVarargs(value: NonEmptyString*): Self = this.set("reportGroupsNotFound", js.Array(value :_*))
    @scala.inline
    def setReportGroupsNotFound(value: ReportGroupArns): Self = this.set("reportGroupsNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportGroupsNotFound: Self = this.set("reportGroupsNotFound", js.undefined)
  }
  
}

