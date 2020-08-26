package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * The Amazon S3 bucket where the data is located.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.S3Bucket] = js.native
  /**
    * The Amazon S3 key where the data is located.
    */
  var S3Key: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.S3Key] = js.native
}

object S3Location {
  @scala.inline
  def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  @scala.inline
  implicit class S3LocationOps[Self <: S3Location] (val x: Self) extends AnyVal {
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
    def setS3Bucket(value: S3Bucket): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Bucket: Self = this.set("S3Bucket", js.undefined)
    @scala.inline
    def setS3Key(value: S3Key): Self = this.set("S3Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Key: Self = this.set("S3Key", js.undefined)
  }
  
}

