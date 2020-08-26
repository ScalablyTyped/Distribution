package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketRequestPaymentRequest extends js.Object {
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
  /**
    * &gt;The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see RFC 1864.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * Container for Payer.
    */
  var RequestPaymentConfiguration: typings.awsSdk.s3Mod.RequestPaymentConfiguration = js.native
}

object PutBucketRequestPaymentRequest {
  @scala.inline
  def apply(Bucket: BucketName, RequestPaymentConfiguration: RequestPaymentConfiguration): PutBucketRequestPaymentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RequestPaymentConfiguration = RequestPaymentConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketRequestPaymentRequest]
  }
  @scala.inline
  implicit class PutBucketRequestPaymentRequestOps[Self <: PutBucketRequestPaymentRequest] (val x: Self) extends AnyVal {
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
    def setRequestPaymentConfiguration(value: RequestPaymentConfiguration): Self = this.set("RequestPaymentConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
  }
  
}

