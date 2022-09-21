package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerDetail extends StObject {
  
  /**
    *  The S3 bucket name and Amazon S3 key name for anti-pattern report. 
    */
  var antipatternReportS3Object: js.UndefOr[S3Object] = js.undefined
  
  /**
    *  The status of the anti-pattern report generation. 
    */
  var antipatternReportStatus: js.UndefOr[AntipatternReportStatus] = js.undefined
  
  /**
    *  A message about the status of the anti-pattern report generation. 
    */
  var antipatternReportStatusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    *  A list of strategy summaries. 
    */
  var applicationComponentStrategySummary: js.UndefOr[ListStrategySummary] = js.undefined
  
  /**
    *  The status of assessment for the server. 
    */
  var dataCollectionStatus: js.UndefOr[RunTimeAssessmentStatus] = js.undefined
  
  /**
    *  The server ID. 
    */
  var id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    *  The timestamp of when the server was assessed. 
    */
  var lastAnalyzedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  A list of anti-pattern severity summaries. 
    */
  var listAntipatternSeveritySummary: js.UndefOr[ListAntipatternSeveritySummary] = js.undefined
  
  /**
    *  The name of the server. 
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    *  A set of recommendations. 
    */
  var recommendationSet: js.UndefOr[RecommendationSet] = js.undefined
  
  /**
    *  The type of server. 
    */
  var serverType: js.UndefOr[String] = js.undefined
  
  /**
    *  A message about the status of data collection, which contains detailed descriptions of any error messages. 
    */
  var statusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    *  System information about the server. 
    */
  var systemInfo: js.UndefOr[SystemInfo] = js.undefined
}
object ServerDetail {
  
  inline def apply(): ServerDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerDetail]
  }
  
  extension [Self <: ServerDetail](x: Self) {
    
    inline def setAntipatternReportS3Object(value: S3Object): Self = StObject.set(x, "antipatternReportS3Object", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportS3ObjectUndefined: Self = StObject.set(x, "antipatternReportS3Object", js.undefined)
    
    inline def setAntipatternReportStatus(value: AntipatternReportStatus): Self = StObject.set(x, "antipatternReportStatus", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportStatusMessage(value: StatusMessage): Self = StObject.set(x, "antipatternReportStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setAntipatternReportStatusMessageUndefined: Self = StObject.set(x, "antipatternReportStatusMessage", js.undefined)
    
    inline def setAntipatternReportStatusUndefined: Self = StObject.set(x, "antipatternReportStatus", js.undefined)
    
    inline def setApplicationComponentStrategySummary(value: ListStrategySummary): Self = StObject.set(x, "applicationComponentStrategySummary", value.asInstanceOf[js.Any])
    
    inline def setApplicationComponentStrategySummaryUndefined: Self = StObject.set(x, "applicationComponentStrategySummary", js.undefined)
    
    inline def setApplicationComponentStrategySummaryVarargs(value: StrategySummary*): Self = StObject.set(x, "applicationComponentStrategySummary", js.Array(value*))
    
    inline def setDataCollectionStatus(value: RunTimeAssessmentStatus): Self = StObject.set(x, "dataCollectionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataCollectionStatusUndefined: Self = StObject.set(x, "dataCollectionStatus", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastAnalyzedTimestamp(value: js.Date): Self = StObject.set(x, "lastAnalyzedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastAnalyzedTimestampUndefined: Self = StObject.set(x, "lastAnalyzedTimestamp", js.undefined)
    
    inline def setListAntipatternSeveritySummary(value: ListAntipatternSeveritySummary): Self = StObject.set(x, "listAntipatternSeveritySummary", value.asInstanceOf[js.Any])
    
    inline def setListAntipatternSeveritySummaryUndefined: Self = StObject.set(x, "listAntipatternSeveritySummary", js.undefined)
    
    inline def setListAntipatternSeveritySummaryVarargs(value: AntipatternSeveritySummary*): Self = StObject.set(x, "listAntipatternSeveritySummary", js.Array(value*))
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecommendationSet(value: RecommendationSet): Self = StObject.set(x, "recommendationSet", value.asInstanceOf[js.Any])
    
    inline def setRecommendationSetUndefined: Self = StObject.set(x, "recommendationSet", js.undefined)
    
    inline def setServerType(value: String): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
    
    inline def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setSystemInfo(value: SystemInfo): Self = StObject.set(x, "systemInfo", value.asInstanceOf[js.Any])
    
    inline def setSystemInfoUndefined: Self = StObject.set(x, "systemInfo", js.undefined)
  }
}
