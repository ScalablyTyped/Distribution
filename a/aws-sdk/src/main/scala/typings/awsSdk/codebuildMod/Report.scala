package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Report extends StObject {
  
  /**
    *  The ARN of the report run. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A CodeCoverageReportSummary object that contains a code coverage summary for this report.
    */
  var codeCoverageSummary: js.UndefOr[CodeCoverageReportSummary] = js.undefined
  
  /**
    *  The date and time this report run occurred. 
    */
  var created: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  The ARN of the build run that generated this report. 
    */
  var executionId: js.UndefOr[String] = js.undefined
  
  /**
    *  The date and time a report expires. A report expires 30 days after it is created. An expired report is not available to view in CodeBuild. 
    */
  var expired: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  Information about where the raw data used to generate this report was exported. 
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.undefined
  
  /**
    *  The name of the report that was run. 
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *  The ARN of the report group associated with this report. 
    */
  var reportGroupArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The status of this report. 
    */
  var status: js.UndefOr[ReportStatusType] = js.undefined
  
  /**
    *  A TestReportSummary object that contains information about this test report. 
    */
  var testSummary: js.UndefOr[TestReportSummary] = js.undefined
  
  /**
    *  A boolean that specifies if this report run is truncated. The list of test cases is truncated after the maximum number of test cases is reached. 
    */
  var truncated: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * The type of the report that was run.  CODE_COVERAGE  A code coverage report.  TEST  A test report.  
    */
  var `type`: js.UndefOr[ReportType] = js.undefined
}
object Report {
  
  inline def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  
  extension [Self <: Report](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCodeCoverageSummary(value: CodeCoverageReportSummary): Self = StObject.set(x, "codeCoverageSummary", value.asInstanceOf[js.Any])
    
    inline def setCodeCoverageSummaryUndefined: Self = StObject.set(x, "codeCoverageSummary", js.undefined)
    
    inline def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setExpired(value: Timestamp): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
    
    inline def setExportConfig(value: ReportExportConfig): Self = StObject.set(x, "exportConfig", value.asInstanceOf[js.Any])
    
    inline def setExportConfigUndefined: Self = StObject.set(x, "exportConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportGroupArn(value: NonEmptyString): Self = StObject.set(x, "reportGroupArn", value.asInstanceOf[js.Any])
    
    inline def setReportGroupArnUndefined: Self = StObject.set(x, "reportGroupArn", js.undefined)
    
    inline def setStatus(value: ReportStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTestSummary(value: TestReportSummary): Self = StObject.set(x, "testSummary", value.asInstanceOf[js.Any])
    
    inline def setTestSummaryUndefined: Self = StObject.set(x, "testSummary", js.undefined)
    
    inline def setTruncated(value: WrapperBoolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
    
    inline def setType(value: ReportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
