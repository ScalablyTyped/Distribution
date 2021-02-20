package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ReportExportConfig extends StObject {
  
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
  implicit class S3ReportExportConfigMutableBuilder[Self <: S3ReportExportConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: NonEmptyString): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setEncryptionDisabled(value: WrapperBoolean): Self = StObject.set(x, "encryptionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionDisabledUndefined: Self = StObject.set(x, "encryptionDisabled", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: NonEmptyString): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    @scala.inline
    def setPackaging(value: ReportPackagingType): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
