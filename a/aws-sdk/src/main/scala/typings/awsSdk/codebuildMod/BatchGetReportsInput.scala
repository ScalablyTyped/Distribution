package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetReportsInput extends StObject {
  
  /**
    *  An array of ARNs that identify the Report objects to return. 
    */
  var reportArns: ReportArns
}
object BatchGetReportsInput {
  
  inline def apply(reportArns: ReportArns): BatchGetReportsInput = {
    val __obj = js.Dynamic.literal(reportArns = reportArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetReportsInput]
  }
  
  extension [Self <: BatchGetReportsInput](x: Self) {
    
    inline def setReportArns(value: ReportArns): Self = StObject.set(x, "reportArns", value.asInstanceOf[js.Any])
    
    inline def setReportArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "reportArns", js.Array(value*))
  }
}
