package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolchainSource extends js.Object {
  /**
    * The Amazon S3 bucket where the toolchain template file provided with the project request is stored.
    */
  var s3: S3Location = js.native
}

object ToolchainSource {
  @scala.inline
  def apply(s3: S3Location): ToolchainSource = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolchainSource]
  }
  @scala.inline
  implicit class ToolchainSourceOps[Self <: ToolchainSource] (val x: Self) extends AnyVal {
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
    def setS3(value: S3Location): Self = this.set("s3", value.asInstanceOf[js.Any])
  }
  
}

