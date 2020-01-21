package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionReport extends js.Object {
  /**
    * Set Enabled to True to generate a CompletionReport when the task completes. If set to true, then you need to provide a report Scope, Path, and Format. Set Enabled to False if you do not want a CompletionReport generated when the task completes.
    */
  var Enabled: Flag = js.native
  /**
    * Required if Enabled is set to true. Specifies the format of the CompletionReport. REPORT_CSV_20191124 is the only format currently supported. When Format is set to REPORT_CSV_20191124, the CompletionReport is provided in CSV format, and is delivered to {path}/task-{id}/failures.csv. 
    */
  var Format: js.UndefOr[ReportFormat] = js.native
  /**
    * Required if Enabled is set to true. Specifies the location of the report on the file system's linked S3 data repository. An absolute path that defines where the completion report will be stored in the destination location. The Path you provide must be located within the file system’s ExportPath. An example Path value is "s3://myBucket/myExportPath/optionalPrefix". The report provides the following information for each file in the report: FilePath, FileStatus, and ErrorCode. To learn more about a file system's ExportPath, see . 
    */
  var Path: js.UndefOr[ArchivePath] = js.native
  /**
    * Required if Enabled is set to true. Specifies the scope of the CompletionReport; FAILED_FILES_ONLY is the only scope currently supported. When Scope is set to FAILED_FILES_ONLY, the CompletionReport only contains information about files that the data repository task failed to process.
    */
  var Scope: js.UndefOr[ReportScope] = js.native
}

object CompletionReport {
  @scala.inline
  def apply(Enabled: Flag, Format: ReportFormat = null, Path: ArchivePath = null, Scope: ReportScope = null): CompletionReport = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionReport]
  }
}

