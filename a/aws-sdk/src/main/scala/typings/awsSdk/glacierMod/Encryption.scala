package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encryption extends js.Object {
  
  /**
    * The server-side encryption algorithm used when storing job results in Amazon S3, for example AES256 or aws:kms.
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.glacierMod.EncryptionType] = js.native
  
  /**
    * Optional. If the encryption type is aws:kms, you can use this value to specify the encryption context for the job results.
    */
  var KMSContext: js.UndefOr[String] = js.native
  
  /**
    * The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS fail if not made by using Secure Sockets Layer (SSL) or Signature Version 4. 
    */
  var KMSKeyId: js.UndefOr[String] = js.native
}
object Encryption {
  
  @scala.inline
  def apply(): Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encryption]
  }
  
  @scala.inline
  implicit class EncryptionOps[Self <: Encryption] (val x: Self) extends AnyVal {
    
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
    def setEncryptionType(value: EncryptionType): Self = this.set("EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionType: Self = this.set("EncryptionType", js.undefined)
    
    @scala.inline
    def setKMSContext(value: String): Self = this.set("KMSContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMSContext: Self = this.set("KMSContext", js.undefined)
    
    @scala.inline
    def setKMSKeyId(value: String): Self = this.set("KMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMSKeyId: Self = this.set("KMSKeyId", js.undefined)
  }
}
