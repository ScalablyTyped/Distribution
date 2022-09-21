package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ReportExportConfig extends StObject {
  
  /**
    *  The name of the S3 bucket where the raw data of a report are exported. 
    */
  var bucket: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Web Services account identifier of the owner of the Amazon S3 bucket. This allows report data to be exported to an Amazon S3 bucket that is owned by an account other than the account running the build.
    */
  var bucketOwner: js.UndefOr[String] = js.undefined
  
  /**
    *  A boolean value that specifies if the results of a report are encrypted. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    *  The encryption key for the report's encrypted raw data. 
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The type of build output artifact to create. Valid values include:     NONE: CodeBuild creates the raw data in the output bucket. This is the default if packaging is not specified.     ZIP: CodeBuild creates a ZIP file with the raw data in the output bucket.   
    */
  var packaging: js.UndefOr[ReportPackagingType] = js.undefined
  
  /**
    *  The path to the exported report's raw data results. 
    */
  var path: js.UndefOr[String] = js.undefined
}
object S3ReportExportConfig {
  
  inline def apply(): S3ReportExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ReportExportConfig]
  }
  
  extension [Self <: S3ReportExportConfig](x: Self) {
    
    inline def setBucket(value: NonEmptyString): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketOwner(value: String): Self = StObject.set(x, "bucketOwner", value.asInstanceOf[js.Any])
    
    inline def setBucketOwnerUndefined: Self = StObject.set(x, "bucketOwner", js.undefined)
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setEncryptionDisabled(value: WrapperBoolean): Self = StObject.set(x, "encryptionDisabled", value.asInstanceOf[js.Any])
    
    inline def setEncryptionDisabledUndefined: Self = StObject.set(x, "encryptionDisabled", js.undefined)
    
    inline def setEncryptionKey(value: NonEmptyString): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setPackaging(value: ReportPackagingType): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    inline def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
