package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetReportGroupsInput extends js.Object {
  /**
    *  An array of report group ARNs that identify the report groups to return. 
    */
  var reportGroupArns: ReportGroupArns = js.native
}

object BatchGetReportGroupsInput {
  @scala.inline
  def apply(reportGroupArns: ReportGroupArns): BatchGetReportGroupsInput = {
    val __obj = js.Dynamic.literal(reportGroupArns = reportGroupArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetReportGroupsInput]
  }
  @scala.inline
  implicit class BatchGetReportGroupsInputOps[Self <: BatchGetReportGroupsInput] (val x: Self) extends AnyVal {
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
    def setReportGroupArnsVarargs(value: NonEmptyString*): Self = this.set("reportGroupArns", js.Array(value :_*))
    @scala.inline
    def setReportGroupArns(value: ReportGroupArns): Self = this.set("reportGroupArns", value.asInstanceOf[js.Any])
  }
  
}

