package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectOutput extends js.Object {
  /**
    * Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.
    */
  var DeleteMarker: js.UndefOr[typings.awsSdk.s3Mod.DeleteMarker] = js.native
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
  /**
    * Returns the version ID of the delete marker created as a result of the DELETE operation.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object DeleteObjectOutput {
  @scala.inline
  def apply(): DeleteObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteObjectOutput]
  }
  @scala.inline
  implicit class DeleteObjectOutputOps[Self <: DeleteObjectOutput] (val x: Self) extends AnyVal {
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
    def setDeleteMarker(value: DeleteMarker): Self = this.set("DeleteMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteMarker: Self = this.set("DeleteMarker", js.undefined)
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

