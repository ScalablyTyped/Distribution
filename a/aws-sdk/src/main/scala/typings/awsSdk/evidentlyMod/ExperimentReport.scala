package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentReport extends StObject {
  
  /**
    * The content of the report.
    */
  var content: js.UndefOr[JsonValue] = js.undefined
  
  /**
    * The name of the metric that is analyzed in this experiment report.
    */
  var metricName: js.UndefOr[CwDimensionSafeName] = js.undefined
  
  /**
    * The type of analysis used for this report.
    */
  var reportName: js.UndefOr[ExperimentReportName] = js.undefined
  
  /**
    * The name of the variation that this report pertains to.
    */
  var treatmentName: js.UndefOr[TreatmentName] = js.undefined
}
object ExperimentReport {
  
  inline def apply(): ExperimentReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentReport]
  }
  
  extension [Self <: ExperimentReport](x: Self) {
    
    inline def setContent(value: JsonValue): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setMetricName(value: CwDimensionSafeName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setReportName(value: ExperimentReportName): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
    
    inline def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
    
    inline def setTreatmentName(value: TreatmentName): Self = StObject.set(x, "treatmentName", value.asInstanceOf[js.Any])
    
    inline def setTreatmentNameUndefined: Self = StObject.set(x, "treatmentName", js.undefined)
  }
}
