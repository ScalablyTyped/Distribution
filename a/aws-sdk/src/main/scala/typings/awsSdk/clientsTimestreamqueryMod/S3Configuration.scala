package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Configuration extends StObject {
  
  /**
    *  Name of the S3 bucket under which error reports will be created.
    */
  var BucketName: S3BucketName
  
  /**
    *  Encryption at rest options for the error reports. If no encryption option is specified, Timestream will choose SSE_S3 as default. 
    */
  var EncryptionOption: js.UndefOr[S3EncryptionOption] = js.undefined
  
  /**
    *  Prefix for the error report key. Timestream by default adds the following prefix to the error report path. 
    */
  var ObjectKeyPrefix: js.UndefOr[S3ObjectKeyPrefix] = js.undefined
}
object S3Configuration {
  
  inline def apply(BucketName: S3BucketName): S3Configuration = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Configuration] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOption(value: S3EncryptionOption): Self = StObject.set(x, "EncryptionOption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOptionUndefined: Self = StObject.set(x, "EncryptionOption", js.undefined)
    
    inline def setObjectKeyPrefix(value: S3ObjectKeyPrefix): Self = StObject.set(x, "ObjectKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setObjectKeyPrefixUndefined: Self = StObject.set(x, "ObjectKeyPrefix", js.undefined)
  }
}
