package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsS3BucketServerSideEncryptionByDefault extends js.Object {
  
  /**
    * AWS KMS customer master key (CMK) ID to use for the default encryption.
    */
  var KMSMasterKeyID: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Server-side encryption algorithm to use for the default encryption.
    */
  var SSEAlgorithm: js.UndefOr[NonEmptyString] = js.native
}
object AwsS3BucketServerSideEncryptionByDefault {
  
  @scala.inline
  def apply(): AwsS3BucketServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionByDefault]
  }
  
  @scala.inline
  implicit class AwsS3BucketServerSideEncryptionByDefaultOps[Self <: AwsS3BucketServerSideEncryptionByDefault] (val x: Self) extends AnyVal {
    
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
    def setKMSMasterKeyID(value: NonEmptyString): Self = this.set("KMSMasterKeyID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMSMasterKeyID: Self = this.set("KMSMasterKeyID", js.undefined)
    
    @scala.inline
    def setSSEAlgorithm(value: NonEmptyString): Self = this.set("SSEAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSEAlgorithm: Self = this.set("SSEAlgorithm", js.undefined)
  }
}
