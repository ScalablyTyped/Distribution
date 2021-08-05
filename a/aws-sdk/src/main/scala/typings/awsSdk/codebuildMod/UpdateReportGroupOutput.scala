package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReportGroupOutput extends StObject {
  
  /**
    *  Information about the updated report group. 
    */
  var reportGroup: js.UndefOr[ReportGroup] = js.undefined
}
object UpdateReportGroupOutput {
  
  inline def apply(): UpdateReportGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReportGroupOutput]
  }
  
  extension [Self <: UpdateReportGroupOutput](x: Self) {
    
    inline def setReportGroup(value: ReportGroup): Self = StObject.set(x, "reportGroup", value.asInstanceOf[js.Any])
    
    inline def setReportGroupUndefined: Self = StObject.set(x, "reportGroup", js.undefined)
  }
}
