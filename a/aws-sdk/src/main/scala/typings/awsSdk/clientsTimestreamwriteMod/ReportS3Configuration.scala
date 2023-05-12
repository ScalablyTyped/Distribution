package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportS3Configuration extends StObject {
  
  /**
    * 
    */
  var BucketName: S3BucketName
  
  /**
    * 
    */
  var EncryptionOption: js.UndefOr[S3EncryptionOption] = js.undefined
  
  /**
    * 
    */
  var KmsKeyId: js.UndefOr[StringValue2048] = js.undefined
  
  /**
    * 
    */
  var ObjectKeyPrefix: js.UndefOr[S3ObjectKeyPrefix] = js.undefined
}
object ReportS3Configuration {
  
  inline def apply(BucketName: S3BucketName): ReportS3Configuration = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportS3Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportS3Configuration] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOption(value: S3EncryptionOption): Self = StObject.set(x, "EncryptionOption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOptionUndefined: Self = StObject.set(x, "EncryptionOption", js.undefined)
    
    inline def setKmsKeyId(value: StringValue2048): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setObjectKeyPrefix(value: S3ObjectKeyPrefix): Self = StObject.set(x, "ObjectKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setObjectKeyPrefixUndefined: Self = StObject.set(x, "ObjectKeyPrefix", js.undefined)
  }
}
