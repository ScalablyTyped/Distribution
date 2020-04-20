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
}

