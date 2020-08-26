package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketLifecycleRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName = js.native
  /**
    * 
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * 
    */
  var LifecycleConfiguration: js.UndefOr[typings.awsSdk.s3Mod.LifecycleConfiguration] = js.native
}

object PutBucketLifecycleRequest {
  @scala.inline
  def apply(Bucket: BucketName): PutBucketLifecycleRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLifecycleRequest]
  }
  @scala.inline
  implicit class PutBucketLifecycleRequestOps[Self <: PutBucketLifecycleRequest] (val x: Self) extends AnyVal {
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
    def setContentMD5(value: ContentMD5): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
    @scala.inline
    def setLifecycleConfiguration(value: LifecycleConfiguration): Self = this.set("LifecycleConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleConfiguration: Self = this.set("LifecycleConfiguration", js.undefined)
  }
  
}

