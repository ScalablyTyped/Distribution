package typings.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.awsColonkms
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteMultipartUploadOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _BucketName shape
    */
  var Bucket: js.UndefOr[String] = js.native
  /**
    * <p>Entity tag of the object.</p>
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * <p>If the object expiration is configured, this will contain the expiration date (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.</p>
    */
  var Expiration: js.UndefOr[String] = js.native
  /**
    * _ObjectKey shape
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * _Location shape
    */
  var Location: js.UndefOr[String] = js.native
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.native
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

object CompleteMultipartUploadOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): CompleteMultipartUploadOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartUploadOutput]
  }
  @scala.inline
  implicit class CompleteMultipartUploadOutputOps[Self <: CompleteMultipartUploadOutput] (val x: Self) extends AnyVal {
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
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    @scala.inline
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setExpiration(value: String): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    @scala.inline
    def setRequestCharged(value: requester_ | String): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
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

