package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Report extends StObject {
  
  /**
    *  The ARN of the report run. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A CodeCoverageReportSummary object that contains a code coverage summary for this report.
    */
  var codeCoverageSummary: js.UndefOr[CodeCoverageReportSummary] = js.native
  
  /**
    *  The date and time this report run occurred. 
    */
  var created: js.UndefOr[Timestamp] = js.native
  
  /**
    *  The ARN of the build run that generated this report. 
    */
  var executionId: js.UndefOr[String] = js.native
  
  /**
    *  The date and time a report expires. A report expires 30 days after it is created. An expired report is not available to view in CodeBuild. 
    */
  var expired: js.UndefOr[Timestamp] = js.native
  
  /**
    *  Information about where the raw data used to generate this report was exported. 
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.native
  
  /**
    *  The name of the report that was run. 
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *  The ARN of the report group associated with this report. 
    */
  var reportGroupArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The status of this report. 
    */
  var status: js.UndefOr[ReportStatusType] = js.native
  
  /**
    *  A TestReportSummary object that contains information about this test report. 
    */
  var testSummary: js.UndefOr[TestReportSummary] = js.native
  
  /**
    *  A boolean that specifies if this report run is truncated. The list of test cases is truncated after the maximum number of test cases is reached. 
    */
  var truncated: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    * The type of the report that was run.  CODE_COVERAGE  A code coverage report.  TEST  A test report.  
    */
  var `type`: js.UndefOr[ReportType] = js.native
}
object Report {
  
  @scala.inline
  def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  
  @scala.inline
  implicit class ReportMutableBuilder[Self <: Report] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCodeCoverageSummary(value: CodeCoverageReportSummary): Self = StObject.set(x, "codeCoverageSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeCoverageSummaryUndefined: Self = StObject.set(x, "codeCoverageSummary", js.undefined)
    
    @scala.inline
    def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    @scala.inline
    def setExpired(value: Timestamp): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
    
    @scala.inline
    def setExportConfig(value: ReportExportConfig): Self = StObject.set(x, "exportConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportConfigUndefined: Self = StObject.set(x, "exportConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReportGroupArn(value: NonEmptyString): Self = StObject.set(x, "reportGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportGroupArnUndefined: Self = StObject.set(x, "reportGroupArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ReportStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTestSummary(value: TestReportSummary): Self = StObject.set(x, "testSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSummaryUndefined: Self = StObject.set(x, "testSummary", js.undefined)
    
    @scala.inline
    def setTruncated(value: WrapperBoolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
    
    @scala.inline
    def setType(value: ReportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
