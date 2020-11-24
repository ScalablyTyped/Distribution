package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ReportExportConfig extends js.Object {
  
  /**
    *  The name of the S3 bucket where the raw data of a report are exported. 
    */
  var bucket: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  A boolean value that specifies if the results of a report are encrypted. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    *  The encryption key for the report's encrypted raw data. 
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The type of build output artifact to create. Valid values include:     NONE: AWS CodeBuild creates the raw data in the output bucket. This is the default if packaging is not specified.     ZIP: AWS CodeBuild creates a ZIP file with the raw data in the output bucket.   
    */
  var packaging: js.UndefOr[ReportPackagingType] = js.native
  
  /**
    *  The path to the exported report's raw data results. 
    */
  var path: js.UndefOr[String] = js.native
}
object S3ReportExportConfig {
  
  @scala.inline
  def apply(): S3ReportExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ReportExportConfig]
  }
  
  @scala.inline
  implicit class S3ReportExportConfigOps[Self <: S3ReportExportConfig] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: NonEmptyString): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setEncryptionDisabled(value: WrapperBoolean): Self = this.set("encryptionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionDisabled: Self = this.set("encryptionDisabled", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: NonEmptyString): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    
    @scala.inline
    def setPackaging(value: ReportPackagingType): Self = this.set("packaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackaging: Self = this.set("packaging", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
