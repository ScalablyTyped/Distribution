package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetReportsOutput extends StObject {
  
  /**
    *  The array of Report objects returned by BatchGetReports. 
    */
  var reports: js.UndefOr[Reports] = js.native
  
  /**
    *  An array of ARNs passed to BatchGetReportGroups that are not associated with a Report. 
    */
  var reportsNotFound: js.UndefOr[ReportArns] = js.native
}
object BatchGetReportsOutput {
  
  @scala.inline
  def apply(): BatchGetReportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetReportsOutput]
  }
  
  @scala.inline
  implicit class BatchGetReportsOutputMutableBuilder[Self <: BatchGetReportsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReports(value: Reports): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsNotFound(value: ReportArns): Self = StObject.set(x, "reportsNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsNotFoundUndefined: Self = StObject.set(x, "reportsNotFound", js.undefined)
    
    @scala.inline
    def setReportsNotFoundVarargs(value: NonEmptyString*): Self = StObject.set(x, "reportsNotFound", js.Array(value :_*))
    
    @scala.inline
    def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    @scala.inline
    def setReportsVarargs(value: Report*): Self = StObject.set(x, "reports", js.Array(value :_*))
  }
}
