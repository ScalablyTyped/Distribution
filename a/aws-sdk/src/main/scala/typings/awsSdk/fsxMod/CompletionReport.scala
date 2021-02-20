package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionReport extends StObject {
  
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
  def apply(Enabled: Flag): CompletionReport = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionReport]
  }
  
  @scala.inline
  implicit class CompletionReportMutableBuilder[Self <: CompletionReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Flag): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ReportFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setPath(value: ArchivePath): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setScope(value: ReportScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
  }
}
