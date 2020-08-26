package typings.awsSdkClientS3Node.typesPutObjectOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.AES256
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.awsColonkms
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Entity tag for the uploaded object.</p>
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * <p>If the object expiration is configured, this will contain the expiration date (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.</p>
    */
  var Expiration: js.UndefOr[String] = js.native
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.native
  /**
    * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.</p>
    */
  var SSECustomerAlgorithm: js.UndefOr[String] = js.native
  /**
    * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.</p>
    */
  var SSECustomerKeyMD5: js.UndefOr[String] = js.native
  /**
    * <p>If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.</p>
    */
  var SSEKMSKeyId: js.UndefOr[String] = js.native
  /**
    * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
    */
  var ServerSideEncryption: js.UndefOr[AES256 | awsColonkms | String] = js.native
  /**
    * <p>Version of the object.</p>
    */
  var VersionId: js.UndefOr[String] = js.native
}

object PutObjectOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectOutput]
  }
  @scala.inline
  implicit class PutObjectOutputOps[Self <: PutObjectOutput] (val x: Self) extends AnyVal {
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setExpiration(value: String): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    @scala.inline
    def setRequestCharged(value: requester_ | String): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
    @scala.inline
    def setSSECustomerAlgorithm(value: String): Self = this.set("SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSECustomerAlgorithm: Self = this.set("SSECustomerAlgorithm", js.undefined)
    @scala.inline
    def setSSECustomerKeyMD5(value: String): Self = this.set("SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSECustomerKeyMD5: Self = this.set("SSECustomerKeyMD5", js.undefined)
    @scala.inline
    def setSSEKMSKeyId(value: String): Self = this.set("SSEKMSKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEKMSKeyId: Self = this.set("SSEKMSKeyId", js.undefined)
    @scala.inline
    def setServerSideEncryption(value: AES256 | awsColonkms | String): Self = this.set("ServerSideEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("ServerSideEncryption", js.undefined)
    @scala.inline
    def setVersionId(value: String): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

