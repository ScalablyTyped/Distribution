package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyObjectOutput extends js.Object {
  /**
    * Container for all response elements.
    */
  var CopyObjectResult: js.UndefOr[typings.awsSdk.s3Mod.CopyObjectResult] = js.native
  /**
    * Version of the copied object in the destination bucket.
    */
  var CopySourceVersionId: js.UndefOr[typings.awsSdk.s3Mod.CopySourceVersionId] = js.native
  /**
    * If the object expiration is configured, the response includes this header.
    */
  var Expiration: js.UndefOr[typings.awsSdk.s3Mod.Expiration] = js.native
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round-trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  /**
    * If present, specifies the AWS KMS Encryption Context to use for object encryption. The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
    */
  var SSEKMSEncryptionContext: js.UndefOr[typings.awsSdk.s3Mod.SSEKMSEncryptionContext] = js.native
  /**
    * If present, specifies the ID of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK) that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsSdk.s3Mod.SSEKMSKeyId] = js.native
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsSdk.s3Mod.ServerSideEncryption] = js.native
  /**
    * Version ID of the newly created copy.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object CopyObjectOutput {
  @scala.inline
  def apply(): CopyObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyObjectOutput]
  }
  @scala.inline
  implicit class CopyObjectOutputOps[Self <: CopyObjectOutput] (val x: Self) extends AnyVal {
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
    def setCopyObjectResult(value: CopyObjectResult): Self = this.set("CopyObjectResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyObjectResult: Self = this.set("CopyObjectResult", js.undefined)
    @scala.inline
    def setCopySourceVersionId(value: CopySourceVersionId): Self = this.set("CopySourceVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopySourceVersionId: Self = this.set("CopySourceVersionId", js.undefined)
    @scala.inline
    def setExpiration(value: Expiration): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
    @scala.inline
    def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = this.set("SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSECustomerAlgorithm: Self = this.set("SSECustomerAlgorithm", js.undefined)
    @scala.inline
    def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = this.set("SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSECustomerKeyMD5: Self = this.set("SSECustomerKeyMD5", js.undefined)
    @scala.inline
    def setSSEKMSEncryptionContext(value: SSEKMSEncryptionContext): Self = this.set("SSEKMSEncryptionContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEKMSEncryptionContext: Self = this.set("SSEKMSEncryptionContext", js.undefined)
    @scala.inline
    def setSSEKMSKeyId(value: SSEKMSKeyId): Self = this.set("SSEKMSKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEKMSKeyId: Self = this.set("SSEKMSKeyId", js.undefined)
    @scala.inline
    def setServerSideEncryption(value: ServerSideEncryption): Self = this.set("ServerSideEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("ServerSideEncryption", js.undefined)
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

