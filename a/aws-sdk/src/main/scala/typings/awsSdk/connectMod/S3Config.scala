package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Config extends StObject {
  
  /**
    * The S3 bucket name.
    */
  var BucketName: typings.awsSdk.connectMod.BucketName
  
  /**
    * The S3 bucket prefix.
    */
  var BucketPrefix: Prefix
  
  /**
    * The S3 encryption configuration.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.connectMod.EncryptionConfig] = js.undefined
}
object S3Config {
  
  @scala.inline
  def apply(BucketName: BucketName, BucketPrefix: Prefix): S3Config = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], BucketPrefix = BucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Config]
  }
  
  @scala.inline
  implicit class S3ConfigMutableBuilder[Self <: S3Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefix(value: Prefix): Self = StObject.set(x, "BucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
  }
}
