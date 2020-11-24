package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultServerSideEncryption extends js.Object {
  
  /**
    * The type of encryption used for objects within the S3 bucket.
    */
  var EncryptionType: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the KMS encryption key. Only available if the bucket EncryptionType is aws:kms.
    */
  var KmsMasterKeyArn: js.UndefOr[String] = js.native
}
object DefaultServerSideEncryption {
  
  @scala.inline
  def apply(): DefaultServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultServerSideEncryption]
  }
  
  @scala.inline
  implicit class DefaultServerSideEncryptionOps[Self <: DefaultServerSideEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncryptionType(value: String): Self = this.set("EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionType: Self = this.set("EncryptionType", js.undefined)
    
    @scala.inline
    def setKmsMasterKeyArn(value: String): Self = this.set("KmsMasterKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsMasterKeyArn: Self = this.set("KmsMasterKeyArn", js.undefined)
  }
}
