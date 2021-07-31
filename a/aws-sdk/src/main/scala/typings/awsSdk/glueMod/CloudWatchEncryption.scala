package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchEncryption extends StObject {
  
  /**
    * The encryption mode to use for CloudWatch data.
    */
  var CloudWatchEncryptionMode: js.UndefOr[typings.awsSdk.glueMod.CloudWatchEncryptionMode] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.glueMod.KmsKeyArn] = js.undefined
}
object CloudWatchEncryption {
  
  @scala.inline
  def apply(): CloudWatchEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchEncryption]
  }
  
  @scala.inline
  implicit class CloudWatchEncryptionMutableBuilder[Self <: CloudWatchEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchEncryptionMode(value: CloudWatchEncryptionMode): Self = StObject.set(x, "CloudWatchEncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchEncryptionModeUndefined: Self = StObject.set(x, "CloudWatchEncryptionMode", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
  }
}
