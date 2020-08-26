package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDataConfig extends js.Object {
  /**
    * The URI of the S3 bucket that contains the input data. The bucket must be in the same region as the API endpoint that you are calling. Each file in the document collection must be less than 40 KB. You can store a maximum of 30 GB in the bucket.
    */
  var S3Bucket: typings.awsSdk.comprehendmedicalMod.S3Bucket = js.native
  /**
    * The path to the input data files in the S3 bucket.
    */
  var S3Key: js.UndefOr[typings.awsSdk.comprehendmedicalMod.S3Key] = js.native
}

object InputDataConfig {
  @scala.inline
  def apply(S3Bucket: S3Bucket): InputDataConfig = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
  @scala.inline
  implicit class InputDataConfigOps[Self <: InputDataConfig] (val x: Self) extends AnyVal {
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
    def setS3Key(value: S3Key): Self = this.set("S3Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Key: Self = this.set("S3Key", js.undefined)
  }
  
}

