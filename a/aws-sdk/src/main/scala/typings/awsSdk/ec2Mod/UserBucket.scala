package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserBucket extends js.Object {
  /**
    * The name of the Amazon S3 bucket where the disk image is located.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  /**
    * The file name of the disk image.
    */
  var S3Key: js.UndefOr[String] = js.native
}

object UserBucket {
  @scala.inline
  def apply(): UserBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserBucket]
  }
  @scala.inline
  implicit class UserBucketOps[Self <: UserBucket] (val x: Self) extends AnyVal {
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
    def setS3Bucket(value: String): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Bucket: Self = this.set("S3Bucket", js.undefined)
    @scala.inline
    def setS3Key(value: String): Self = this.set("S3Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Key: Self = this.set("S3Key", js.undefined)
  }
  
}

