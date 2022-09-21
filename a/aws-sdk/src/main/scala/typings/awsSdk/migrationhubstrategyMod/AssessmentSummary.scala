package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentSummary extends StObject {
  
  /**
    *  The Amazon S3 object containing the anti-pattern report. 
    */
  var antipatternReportS3Object: js.UndefOr[S3Object] = js.undefined
  
  /**
    *  The status of the anti-pattern report. 
    */
  var antipatternReportStatus: js.UndefOr[AntipatternReportStatus] = js.undefined
  
  /**
    *  The status message of the anti-pattern report. 
    */
  var antipatternReportStatusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    *  The time the assessment was performed. 
    */
  var lastAnalyzedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  List of AntipatternSeveritySummary. 
    */
  var listAntipatternSeveritySummary: js.UndefOr[ListAntipatternSeveritySummary] = js.undefined
  
  /**
    *  List of ApplicationComponentStrategySummary. 
    */
  var listApplicationComponentStrategySummary: js.UndefOr[ListStrategySummary] = js.undefined
  
  /**
    *  List of ApplicationComponentSummary. 
    */
  var listApplicationComponentSummary: js.UndefOr[ListApplicationComponentSummary] = js.undefined
  
  /**
    *  List of ServerStrategySummary. 
    */
  var listServerStrategySummary: js.UndefOr[ListStrategySummary] = js.undefined
  
  /**
    *  List of ServerSummary. 
    */
  var listServerSummary: js.UndefOr[ListServerSummary] = js.undefined
}
object AssessmentSummary {
  
  inline def apply(): AssessmentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentSummary]
  }
  
  extension [Self <: AssessmentSummary](x: Self) {
    
    inline def setAntipatternReportS3Object(value: S3Object): Self = StObject.set(x, "antipatternReportS3Object", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportS3ObjectUndefined: Self = StObject.set(x, "antipatternReportS3Object", js.undefined)
    
    inline def setAntipatternReportStatus(value: AntipatternReportStatus): Self = StObject.set(x, "antipatternReportStatus", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportStatusMessage(value: StatusMessage): Self = StObject.set(x, "antipatternReportStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportStatusMessageUndefined: Self = StObject.set(x, "antipatternReportStatusMessage", js.undefined)
    
    inline def setAntipatternReportStatusUndefined: Self = StObject.set(x, "antipatternReportStatus", js.undefined)
    
    inline def setLastAnalyzedTimestamp(value: js.Date): Self = StObject.set(x, "lastAnalyzedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastAnalyzedTimestampUndefined: Self = StObject.set(x, "lastAnalyzedTimestamp", js.undefined)
    
    inline def setListAntipatternSeveritySummary(value: ListAntipatternSeveritySummary): Self = StObject.set(x, "listAntipatternSeveritySummary", value.asInstanceOf[js.Any])
    
    inline def setListAntipatternSeveritySummaryUndefined: Self = StObject.set(x, "listAntipatternSeveritySummary", js.undefined)
    
    inline def setListAntipatternSeveritySummaryVarargs(value: AntipatternSeveritySummary*): Self = StObject.set(x, "listAntipatternSeveritySummary", js.Array(value*))
    
    inline def setListApplicationComponentStrategySummary(value: ListStrategySummary): Self = StObject.set(x, "listApplicationComponentStrategySummary", value.asInstanceOf[js.Any])
    
    inline def setListApplicationComponentStrategySummaryUndefined: Self = StObject.set(x, "listApplicationComponentStrategySummary", js.undefined)
    
    inline def setListApplicationComponentStrategySummaryVarargs(value: StrategySummary*): Self = StObject.set(x, "listApplicationComponentStrategySummary", js.Array(value*))
    
    inline def setListApplicationComponentSummary(value: ListApplicationComponentSummary): Self = StObject.set(x, "listApplicationComponentSummary", value.asInstanceOf[js.Any])
    
    inline def setListApplicationComponentSummaryUndefined: Self = StObject.set(x, "listApplicationComponentSummary", js.undefined)
    
    inline def setListApplicationComponentSummaryVarargs(value: ApplicationComponentSummary*): Self = StObject.set(x, "listApplicationComponentSummary", js.Array(value*))
    
    inline def setListServerStrategySummary(value: ListStrategySummary): Self = StObject.set(x, "listServerStrategySummary", value.asInstanceOf[js.Any])
    
    inline def setListServerStrategySummaryUndefined: Self = StObject.set(x, "listServerStrategySummary", js.undefined)
    
    inline def setListServerStrategySummaryVarargs(value: StrategySummary*): Self = StObject.set(x, "listServerStrategySummary", js.Array(value*))
    
    inline def setListServerSummary(value: ListServerSummary): Self = StObject.set(x, "listServerSummary", value.asInstanceOf[js.Any])
    
    inline def setListServerSummaryUndefined: Self = StObject.set(x, "listServerSummary", js.undefined)
    
    inline def setListServerSummaryVarargs(value: ServerSummary*): Self = StObject.set(x, "listServerSummary", js.Array(value*))
  }
}
