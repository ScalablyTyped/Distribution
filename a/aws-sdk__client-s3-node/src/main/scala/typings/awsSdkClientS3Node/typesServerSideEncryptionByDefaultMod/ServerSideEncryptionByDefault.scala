package typings.awsSdkClientS3Node.typesServerSideEncryptionByDefaultMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.AES256
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.awsColonkms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerSideEncryptionByDefault extends js.Object {
  
  /**
    * <p>KMS master key ID to use for the default encryption. This parameter is allowed if SSEAlgorithm is aws:kms.</p>
    */
  var KMSMasterKeyID: js.UndefOr[String] = js.native
  
  /**
    * <p>Server-side encryption algorithm to use for the default encryption.</p>
    */
  var SSEAlgorithm: AES256 | awsColonkms | String = js.native
}
object ServerSideEncryptionByDefault {
  
  @scala.inline
  def apply(SSEAlgorithm: AES256 | awsColonkms | String): ServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionByDefault]
  }
  
  @scala.inline
  implicit class ServerSideEncryptionByDefaultOps[Self <: ServerSideEncryptionByDefault] (val x: Self) extends AnyVal {
    
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
    def setSSEAlgorithm(value: AES256 | awsColonkms | String): Self = this.set("SSEAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSMasterKeyID(value: String): Self = this.set("KMSMasterKeyID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMSMasterKeyID: Self = this.set("KMSMasterKeyID", js.undefined)
  }
}
