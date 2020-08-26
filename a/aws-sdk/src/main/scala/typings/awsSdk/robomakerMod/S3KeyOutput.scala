package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3KeyOutput extends js.Object {
  /**
    * The etag for the object.
    */
  var etag: js.UndefOr[S3Etag] = js.native
  /**
    * The S3 key.
    */
  var s3Key: js.UndefOr[S3Key] = js.native
}

object S3KeyOutput {
  @scala.inline
  def apply(): S3KeyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3KeyOutput]
  }
  @scala.inline
  implicit class S3KeyOutputOps[Self <: S3KeyOutput] (val x: Self) extends AnyVal {
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
    def setEtag(value: S3Etag): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setS3Key(value: S3Key): Self = this.set("s3Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Key: Self = this.set("s3Key", js.undefined)
  }
  
}

