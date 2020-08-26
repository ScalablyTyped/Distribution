package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketAnalyticsConfigurationsRequest extends js.Object {
  /**
    * The name of the bucket from which analytics configurations are retrieved.
    */
  var Bucket: BucketName = js.native
  /**
    * The ContinuationToken that represents a placeholder from where this request should begin.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
}

object ListBucketAnalyticsConfigurationsRequest {
  @scala.inline
  def apply(Bucket: BucketName): ListBucketAnalyticsConfigurationsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsRequest]
  }
  @scala.inline
  implicit class ListBucketAnalyticsConfigurationsRequestOps[Self <: ListBucketAnalyticsConfigurationsRequest] (val x: Self) extends AnyVal {
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
    def setContinuationToken(value: Token): Self = this.set("ContinuationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuationToken: Self = this.set("ContinuationToken", js.undefined)
  }
  
}

