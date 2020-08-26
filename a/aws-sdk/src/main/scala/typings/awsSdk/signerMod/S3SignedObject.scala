package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SignedObject extends js.Object {
  /**
    * Name of the S3 bucket.
    */
  var bucketName: js.UndefOr[BucketName] = js.native
  /**
    * Key name that uniquely identifies a signed code image in your bucket.
    */
  var key: js.UndefOr[typings.awsSdk.signerMod.key] = js.native
}

object S3SignedObject {
  @scala.inline
  def apply(): S3SignedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SignedObject]
  }
  @scala.inline
  implicit class S3SignedObjectOps[Self <: S3SignedObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketName(value: BucketName): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
    @scala.inline
    def setKey(value: key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

