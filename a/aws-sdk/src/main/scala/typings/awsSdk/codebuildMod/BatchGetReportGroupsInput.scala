package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetReportGroupsInput extends StObject {
  
  /**
    *  An array of report group ARNs that identify the report groups to return. 
    */
  var reportGroupArns: ReportGroupArns
}
object BatchGetReportGroupsInput {
  
  @scala.inline
  def apply(reportGroupArns: ReportGroupArns): BatchGetReportGroupsInput = {
    val __obj = js.Dynamic.literal(reportGroupArns = reportGroupArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetReportGroupsInput]
  }
  
  @scala.inline
  implicit class BatchGetReportGroupsInputMutableBuilder[Self <: BatchGetReportGroupsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportGroupArns(value: ReportGroupArns): Self = StObject.set(x, "reportGroupArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportGroupArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "reportGroupArns", js.Array(value :_*))
  }
}
