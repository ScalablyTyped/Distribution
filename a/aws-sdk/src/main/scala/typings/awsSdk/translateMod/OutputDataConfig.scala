package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDataConfig extends js.Object {
  /**
    * The URI of the S3 folder that contains a translation job's output file. The folder must be in the same Region as the API endpoint that you are calling.
    */
  var S3Uri: typings.awsSdk.translateMod.S3Uri = js.native
}

object OutputDataConfig {
  @scala.inline
  def apply(S3Uri: S3Uri): OutputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
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
    def setS3Uri(value: S3Uri): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
  }
  
}

