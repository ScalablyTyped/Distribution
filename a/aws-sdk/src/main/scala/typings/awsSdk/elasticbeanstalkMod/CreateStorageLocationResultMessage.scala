package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStorageLocationResultMessage extends js.Object {
  /**
    * The name of the Amazon S3 bucket created.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.S3Bucket] = js.native
}

object CreateStorageLocationResultMessage {
  @scala.inline
  def apply(): CreateStorageLocationResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorageLocationResultMessage]
  }
  @scala.inline
  implicit class CreateStorageLocationResultMessageOps[Self <: CreateStorageLocationResultMessage] (val x: Self) extends AnyVal {
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
  }
  
}

