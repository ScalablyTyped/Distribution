package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportExportConfig extends StObject {
  
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
  implicit class ReportExportConfigMutableBuilder[Self <: ReportExportConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportConfigType(value: ReportExportConfigType): Self = StObject.set(x, "exportConfigType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportConfigTypeUndefined: Self = StObject.set(x, "exportConfigType", js.undefined)
    
    @scala.inline
    def setS3Destination(value: S3ReportExportConfig): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
  }
}
