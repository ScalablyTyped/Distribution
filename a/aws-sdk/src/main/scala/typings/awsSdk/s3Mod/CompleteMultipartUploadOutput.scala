package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteMultipartUploadOutput extends js.Object {
  /**
    * The name of the bucket that contains the newly created object.
    */
  var Bucket: js.UndefOr[BucketName] = js.native
  /**
    * Entity tag that identifies the newly created object's data. Objects with different object data will have different entity tags. The entity tag is an opaque string. The entity tag may or may not be an MD5 digest of the object data. If the entity tag is not an MD5 digest of the object data, it will contain one or more nonhexadecimal characters and/or will consist of less than 32 or more than 32 hexadecimal digits.
    */
  var ETag: js.UndefOr[typings.awsSdk.s3Mod.ETag] = js.native
  /**
    * If the object expiration is configured, this will contain the expiration date (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.
    */
  var Expiration: js.UndefOr[typings.awsSdk.s3Mod.Expiration] = js.native
  /**
    * The object key of the newly created object.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  /**
    * The URI that identifies the newly created object.
    */
  var Location: js.UndefOr[typings.awsSdk.s3Mod.Location] = js.native
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
  /**
    * If present, specifies the ID of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK) that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsSdk.s3Mod.SSEKMSKeyId] = js.native
  /**
    * If you specified server-side encryption either with an Amazon S3-managed encryption key or an AWS KMS customer master key (CMK) in your initiate multipart upload request, the response includes this header. It confirms the encryption algorithm that Amazon S3 used to encrypt the object.
    */
  var ServerSideEncryption: js.UndefOr[typings.awsSdk.s3Mod.ServerSideEncryption] = js.native
  /**
    * Version ID of the newly created object, in case the bucket has versioning turned on.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object CompleteMultipartUploadOutput {
  @scala.inline
  def apply(): CompleteMultipartUploadOutput = {
    val __obj = js.Dynamic.literal()
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    @scala.inline
    def setETag(value: ETag): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setExpiration(value: Expiration): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    @scala.inline
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
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

