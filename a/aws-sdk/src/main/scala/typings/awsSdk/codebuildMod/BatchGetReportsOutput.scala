package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetReportsOutput extends StObject {
  
  /**
    *  The array of Report objects returned by BatchGetReports. 
    */
  var reports: js.UndefOr[Reports] = js.undefined
  
  /**
    *  An array of ARNs passed to BatchGetReportGroups that are not associated with a Report. 
    */
  var reportsNotFound: js.UndefOr[ReportArns] = js.undefined
}
object BatchGetReportsOutput {
  
  inline def apply(): BatchGetReportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetReportsOutput]
  }
  
  extension [Self <: BatchGetReportsOutput](x: Self) {
    
    inline def setReports(value: Reports): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsNotFound(value: ReportArns): Self = StObject.set(x, "reportsNotFound", value.asInstanceOf[js.Any])
    
    inline def setReportsNotFoundUndefined: Self = StObject.set(x, "reportsNotFound", js.undefined)
    
    inline def setReportsNotFoundVarargs(value: NonEmptyString*): Self = StObject.set(x, "reportsNotFound", js.Array(value :_*))
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: Report*): Self = StObject.set(x, "reports", js.Array(value :_*))
  }
}
