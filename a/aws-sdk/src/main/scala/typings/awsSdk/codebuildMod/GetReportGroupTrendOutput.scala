package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReportGroupTrendOutput extends StObject {
  
  /**
    * An array that contains the raw data for each report.
    */
  var rawData: js.UndefOr[ReportGroupTrendRawDataList] = js.undefined
  
  /**
    * Contains the accumulated trend data.
    */
  var stats: js.UndefOr[ReportGroupTrendStats] = js.undefined
}
object GetReportGroupTrendOutput {
  
  inline def apply(): GetReportGroupTrendOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReportGroupTrendOutput]
  }
  
  extension [Self <: GetReportGroupTrendOutput](x: Self) {
    
    inline def setRawData(value: ReportGroupTrendRawDataList): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    inline def setRawDataUndefined: Self = StObject.set(x, "rawData", js.undefined)
    
    inline def setRawDataVarargs(value: ReportWithRawData*): Self = StObject.set(x, "rawData", js.Array(value*))
    
    inline def setStats(value: ReportGroupTrendStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
  }
}
