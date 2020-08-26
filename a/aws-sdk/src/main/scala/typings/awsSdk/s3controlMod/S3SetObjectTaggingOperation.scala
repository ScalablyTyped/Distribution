package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SetObjectTaggingOperation extends js.Object {
  /**
    * 
    */
  var TagSet: js.UndefOr[S3TagSet] = js.native
}

object S3SetObjectTaggingOperation {
  @scala.inline
  def apply(): S3SetObjectTaggingOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SetObjectTaggingOperation]
  }
  @scala.inline
  implicit class S3SetObjectTaggingOperationOps[Self <: S3SetObjectTaggingOperation] (val x: Self) extends AnyVal {
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
    def setTagSetVarargs(value: S3Tag*): Self = this.set("TagSet", js.Array(value :_*))
    @scala.inline
    def setTagSet(value: S3TagSet): Self = this.set("TagSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSet: Self = this.set("TagSet", js.undefined)
  }
  
}

