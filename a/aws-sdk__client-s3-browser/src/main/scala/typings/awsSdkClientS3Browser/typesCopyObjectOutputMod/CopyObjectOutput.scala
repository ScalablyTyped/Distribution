package typings.awsSdkClientS3Browser.typesCopyObjectOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.awsColonkms
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesCopyObjectResultMod.UnmarshalledCopyObjectResult
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyObjectOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CopyObjectResult shape
    */
  var CopyObjectResult: js.UndefOr[UnmarshalledCopyObjectResult] = js.native
  /**
    * _CopySourceVersionId shape
    */
  var CopySourceVersionId: js.UndefOr[String] = js.native
  /**
    * <p>If the object expiration is configured, the response includes this header.</p>
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
    * <p>Version ID of the newly created copy.</p>
    */
  var VersionId: js.UndefOr[String] = js.native
}

object CopyObjectOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): CopyObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
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
    def setCopyObjectResult(value: UnmarshalledCopyObjectResult): Self = this.set("CopyObjectResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyObjectResult: Self = this.set("CopyObjectResult", js.undefined)
    @scala.inline
    def setCopySourceVersionId(value: String): Self = this.set("CopySourceVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopySourceVersionId: Self = this.set("CopySourceVersionId", js.undefined)
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

