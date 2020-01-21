package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetReportsInput extends js.Object {
  /**
    *  An array of ARNs that identify the Report objects to return. 
    */
  var reportArns: ReportArns = js.native
}

object BatchGetReportsInput {
  @scala.inline
  def apply(reportArns: ReportArns): BatchGetReportsInput = {
    val __obj = js.Dynamic.literal(reportArns = reportArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetReportsInput]
  }
}

