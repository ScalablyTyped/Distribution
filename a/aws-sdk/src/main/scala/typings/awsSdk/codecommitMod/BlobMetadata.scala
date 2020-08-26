package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobMetadata extends js.Object {
  /**
    * The full ID of the blob.
    */
  var blobId: js.UndefOr[ObjectId] = js.native
  /**
    * The file mode permissions of the blob. File mode permission codes include:    100644 indicates read/write    100755 indicates read/write/execute    160000 indicates a submodule    120000 indicates a symlink  
    */
  var mode: js.UndefOr[Mode] = js.native
  /**
    * The path to the blob and associated file name, if any.
    */
  var path: js.UndefOr[Path] = js.native
}

object BlobMetadata {
  @scala.inline
  def apply(): BlobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobMetadata]
  }
  @scala.inline
  implicit class BlobMetadataOps[Self <: BlobMetadata] (val x: Self) extends AnyVal {
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
    def setBlobId(value: ObjectId): Self = this.set("blobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlobId: Self = this.set("blobId", js.undefined)
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPath(value: Path): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

