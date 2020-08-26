package typings.awsSdkBucketEndpointMiddleware.bucketEndpointMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketEndpointAwareInput extends js.Object {
  @JSName("$bucketEndpoint")
  var $bucketEndpoint: js.UndefOr[Boolean] = js.native
  @JSName("$forcePathStyle")
  var $forcePathStyle: js.UndefOr[Boolean] = js.native
  @JSName("$useAccelerateEndpoint")
  var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  @JSName("$useDualstackEndpoint")
  var $useDualstackEndpoint: js.UndefOr[Boolean] = js.native
  var Bucket: String = js.native
}

object BucketEndpointAwareInput {
  @scala.inline
  def apply(Bucket: String): BucketEndpointAwareInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketEndpointAwareInput]
  }
  @scala.inline
  implicit class BucketEndpointAwareInputOps[Self <: BucketEndpointAwareInput] (val x: Self) extends AnyVal {
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
    def set$bucketEndpoint(value: Boolean): Self = this.set("$bucketEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$bucketEndpoint: Self = this.set("$bucketEndpoint", js.undefined)
    @scala.inline
    def set$forcePathStyle(value: Boolean): Self = this.set("$forcePathStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$forcePathStyle: Self = this.set("$forcePathStyle", js.undefined)
    @scala.inline
    def set$useAccelerateEndpoint(value: Boolean): Self = this.set("$useAccelerateEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$useAccelerateEndpoint: Self = this.set("$useAccelerateEndpoint", js.undefined)
    @scala.inline
    def set$useDualstackEndpoint(value: Boolean): Self = this.set("$useDualstackEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$useDualstackEndpoint: Self = this.set("$useDualstackEndpoint", js.undefined)
  }
  
}

