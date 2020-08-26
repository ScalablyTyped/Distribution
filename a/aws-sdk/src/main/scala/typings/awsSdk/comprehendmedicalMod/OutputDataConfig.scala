package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDataConfig extends js.Object {
  /**
    * When you use the OutputDataConfig object with asynchronous operations, you specify the Amazon S3 location where you want to write the output data. The URI must be in the same region as the API endpoint that you are calling. The location is used as the prefix for the actual location of the output.
    */
  var S3Bucket: typings.awsSdk.comprehendmedicalMod.S3Bucket = js.native
  /**
    * The path to the output data files in the S3 bucket. Amazon Comprehend Medical creates an output directory using the job ID so that the output from one job does not overwrite the output of another.
    */
  var S3Key: js.UndefOr[typings.awsSdk.comprehendmedicalMod.S3Key] = js.native
}

object OutputDataConfig {
  @scala.inline
  def apply(S3Bucket: S3Bucket): OutputDataConfig = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDataConfig]
  }
  @scala.inline
  implicit class OutputDataConfigOps[Self <: OutputDataConfig] (val x: Self) extends AnyVal {
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

