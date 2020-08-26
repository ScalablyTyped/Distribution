package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Report extends js.Object {
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
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCodeCoverageSummary(value: CodeCoverageReportSummary): Self = this.set("codeCoverageSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeCoverageSummary: Self = this.set("codeCoverageSummary", js.undefined)
    @scala.inline
    def setCreated(value: Timestamp): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setExecutionId(value: String): Self = this.set("executionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    @scala.inline
    def setExpired(value: Timestamp): Self = this.set("expired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpired: Self = this.set("expired", js.undefined)
    @scala.inline
    def setExportConfig(value: ReportExportConfig): Self = this.set("exportConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportConfig: Self = this.set("exportConfig", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReportGroupArn(value: NonEmptyString): Self = this.set("reportGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportGroupArn: Self = this.set("reportGroupArn", js.undefined)
    @scala.inline
    def setStatus(value: ReportStatusType): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTestSummary(value: TestReportSummary): Self = this.set("testSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestSummary: Self = this.set("testSummary", js.undefined)
    @scala.inline
    def setTruncated(value: WrapperBoolean): Self = this.set("truncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncated: Self = this.set("truncated", js.undefined)
    @scala.inline
    def setType(value: ReportType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

