package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class BatchGetReportsInputOps[Self <: BatchGetReportsInput] (val x: Self) extends AnyVal {
    
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
    def setReportArnsVarargs(value: NonEmptyString*): Self = this.set("reportArns", js.Array(value :_*))
    
    @scala.inline
    def setReportArns(value: ReportArns): Self = this.set("reportArns", value.asInstanceOf[js.Any])
  }
}
