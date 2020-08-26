package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsS3ObjectDetails extends js.Object {
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[NonEmptyString] = js.native
  /**
    * The opaque identifier assigned by a web server to a specific version of a resource found at a URL.
    */
  var ETag: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time when the object was last modified.
    */
  var LastModified: js.UndefOr[NonEmptyString] = js.native
  /**
    * The identifier of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK) that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * If the object is stored using server-side encryption, the value of the server-side encryption algorithm used when storing this object in Amazon S3.
    */
  var ServerSideEncryption: js.UndefOr[NonEmptyString] = js.native
  /**
    * The version of the object.
    */
  var VersionId: js.UndefOr[NonEmptyString] = js.native
}

object AwsS3ObjectDetails {
  @scala.inline
  def apply(): AwsS3ObjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3ObjectDetails]
  }
  @scala.inline
  implicit class AwsS3ObjectDetailsOps[Self <: AwsS3ObjectDetails] (val x: Self) extends AnyVal {
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
    def setContentType(value: NonEmptyString): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    @scala.inline
    def setETag(value: NonEmptyString): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setLastModified(value: NonEmptyString): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setSSEKMSKeyId(value: NonEmptyString): Self = this.set("SSEKMSKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEKMSKeyId: Self = this.set("SSEKMSKeyId", js.undefined)
    @scala.inline
    def setServerSideEncryption(value: NonEmptyString): Self = this.set("ServerSideEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("ServerSideEncryption", js.undefined)
    @scala.inline
    def setVersionId(value: NonEmptyString): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

