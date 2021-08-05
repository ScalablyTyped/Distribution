package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfiguration extends StObject {
  
  /**
    * The encryption configuration for Amazon CloudWatch.
    */
  var CloudWatchEncryption: js.UndefOr[typings.awsSdk.glueMod.CloudWatchEncryption] = js.undefined
  
  /**
    * The encryption configuration for job bookmarks.
    */
  var JobBookmarksEncryption: js.UndefOr[typings.awsSdk.glueMod.JobBookmarksEncryption] = js.undefined
  
  /**
    * The encryption configuration for Amazon Simple Storage Service (Amazon S3) data.
    */
  var S3Encryption: js.UndefOr[S3EncryptionList] = js.undefined
}
object EncryptionConfiguration {
  
  inline def apply(): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  
  extension [Self <: EncryptionConfiguration](x: Self) {
    
    inline def setCloudWatchEncryption(value: CloudWatchEncryption): Self = StObject.set(x, "CloudWatchEncryption", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchEncryptionUndefined: Self = StObject.set(x, "CloudWatchEncryption", js.undefined)
    
    inline def setJobBookmarksEncryption(value: JobBookmarksEncryption): Self = StObject.set(x, "JobBookmarksEncryption", value.asInstanceOf[js.Any])
    
    inline def setJobBookmarksEncryptionUndefined: Self = StObject.set(x, "JobBookmarksEncryption", js.undefined)
    
    inline def setS3Encryption(value: S3EncryptionList): Self = StObject.set(x, "S3Encryption", value.asInstanceOf[js.Any])
    
    inline def setS3EncryptionUndefined: Self = StObject.set(x, "S3Encryption", js.undefined)
    
    inline def setS3EncryptionVarargs(value: S3Encryption*): Self = StObject.set(x, "S3Encryption", js.Array(value :_*))
  }
}
