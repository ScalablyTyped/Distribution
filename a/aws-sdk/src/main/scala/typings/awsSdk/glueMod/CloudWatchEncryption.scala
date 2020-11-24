package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchEncryption extends js.Object {
  
  /**
    * The encryption mode to use for CloudWatch data.
    */
  var CloudWatchEncryptionMode: js.UndefOr[typings.awsSdk.glueMod.CloudWatchEncryptionMode] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.glueMod.KmsKeyArn] = js.native
}
object CloudWatchEncryption {
  
  @scala.inline
  def apply(): CloudWatchEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchEncryption]
  }
  
  @scala.inline
  implicit class CloudWatchEncryptionOps[Self <: CloudWatchEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudWatchEncryptionMode(value: CloudWatchEncryptionMode): Self = this.set("CloudWatchEncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchEncryptionMode: Self = this.set("CloudWatchEncryptionMode", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = this.set("KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("KmsKeyArn", js.undefined)
  }
}
