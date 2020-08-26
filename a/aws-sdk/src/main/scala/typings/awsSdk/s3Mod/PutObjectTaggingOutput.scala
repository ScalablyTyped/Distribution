package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectTaggingOutput extends js.Object {
  /**
    * The versionId of the object the tag-set was added to.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object PutObjectTaggingOutput {
  @scala.inline
  def apply(): PutObjectTaggingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectTaggingOutput]
  }
  @scala.inline
  implicit class PutObjectTaggingOutputOps[Self <: PutObjectTaggingOutput] (val x: Self) extends AnyVal {
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
    def setVersionId(value: ObjectVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

