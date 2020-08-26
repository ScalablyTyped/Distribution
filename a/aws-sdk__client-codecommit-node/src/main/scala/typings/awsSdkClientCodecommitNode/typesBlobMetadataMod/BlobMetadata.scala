package typings.awsSdkClientCodecommitNode.typesBlobMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobMetadata extends js.Object {
  /**
    * <p>The full ID of the blob.</p>
    */
  var blobId: js.UndefOr[String] = js.native
  /**
    * <p>The file mode permissions of the blob. File mode permission codes include:</p> <ul> <li> <p> <code>100644</code> indicates read/write</p> </li> <li> <p> <code>100755</code> indicates read/write/execute</p> </li> <li> <p> <code>160000</code> indicates a submodule</p> </li> <li> <p> <code>120000</code> indicates a symlink</p> </li> </ul>
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * <p>The path to the blob and any associated file name, if any.</p>
    */
  var path: js.UndefOr[String] = js.native
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
    def setBlobId(value: String): Self = this.set("blobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlobId: Self = this.set("blobId", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

