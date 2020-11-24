package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportExportConfig extends js.Object {
  
  /**
    *  The export configuration type. Valid values are:     S3: The report results are exported to an S3 bucket.     NO_EXPORT: The report results are not exported.   
    */
  var exportConfigType: js.UndefOr[ReportExportConfigType] = js.native
  
  /**
    *  A S3ReportExportConfig object that contains information about the S3 bucket where the run of a report is exported. 
    */
  var s3Destination: js.UndefOr[S3ReportExportConfig] = js.native
}
object ReportExportConfig {
  
  @scala.inline
  def apply(): ReportExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportExportConfig]
  }
  
  @scala.inline
  implicit class ReportExportConfigOps[Self <: ReportExportConfig] (val x: Self) extends AnyVal {
    
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
    def setExportConfigType(value: ReportExportConfigType): Self = this.set("exportConfigType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportConfigType: Self = this.set("exportConfigType", js.undefined)
    
    @scala.inline
    def setS3Destination(value: S3ReportExportConfig): Self = this.set("s3Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Destination: Self = this.set("s3Destination", js.undefined)
  }
}
