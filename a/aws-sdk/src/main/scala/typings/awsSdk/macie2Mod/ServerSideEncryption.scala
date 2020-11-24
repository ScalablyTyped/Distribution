package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerSideEncryption extends js.Object {
  
  /**
    * The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption is disabled for the bucket or object, this value is NONE.
    */
  var encryptionType: js.UndefOr[EncryptionType] = js.native
  
  /**
    * The unique identifier for the AWS Key Management Service (AWS KMS) master key that's used to encrypt the bucket or object. This value is null if AWS KMS isn't used to encrypt the bucket or object.
    */
  var kmsMasterKeyId: js.UndefOr[string] = js.native
}
object ServerSideEncryption {
  
  @scala.inline
  def apply(): ServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSideEncryption]
  }
  
  @scala.inline
  implicit class ServerSideEncryptionOps[Self <: ServerSideEncryption] (val x: Self) extends AnyVal {
    
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
    def setEncryptionType(value: EncryptionType): Self = this.set("encryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionType: Self = this.set("encryptionType", js.undefined)
    
    @scala.inline
    def setKmsMasterKeyId(value: string): Self = this.set("kmsMasterKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsMasterKeyId: Self = this.set("kmsMasterKeyId", js.undefined)
  }
}
