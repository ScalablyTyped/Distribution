package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeSource extends js.Object {
  /**
    * Information about the Amazon S3 location where the source code files provided with the project request are stored. 
    */
  var s3: S3Location = js.native
}

object CodeSource {
  @scala.inline
  def apply(s3: S3Location): CodeSource = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSource]
  }
  @scala.inline
  implicit class CodeSourceOps[Self <: CodeSource] (val x: Self) extends AnyVal {
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

