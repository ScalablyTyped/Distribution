package typings.awsSdkClientGlacierNode.typesUploadListElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadListElement extends js.Object {
  /**
    * <p>The description of the archive that was specified in the Initiate Multipart Upload request.</p>
    */
  var ArchiveDescription: js.UndefOr[String] = js.native
  /**
    * <p>The UTC time at which the multipart upload was initiated.</p>
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * <p>The ID of a multipart upload.</p>
    */
  var MultipartUploadId: js.UndefOr[String] = js.native
  /**
    * <p>The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in the upload except the last part, which may be smaller than this size.</p>
    */
  var PartSizeInBytes: js.UndefOr[Double] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) of the vault that contains the archive.</p>
    */
  var VaultARN: js.UndefOr[String] = js.native
}

object UploadListElement {
  @scala.inline
  def apply(): UploadListElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadListElement]
  }
  @scala.inline
  implicit class UploadListElementOps[Self <: UploadListElement] (val x: Self) extends AnyVal {
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
    def setArchiveDescription(value: String): Self = this.set("ArchiveDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchiveDescription: Self = this.set("ArchiveDescription", js.undefined)
    @scala.inline
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setMultipartUploadId(value: String): Self = this.set("MultipartUploadId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipartUploadId: Self = this.set("MultipartUploadId", js.undefined)
    @scala.inline
    def setPartSizeInBytes(value: Double): Self = this.set("PartSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartSizeInBytes: Self = this.set("PartSizeInBytes", js.undefined)
    @scala.inline
    def setVaultARN(value: String): Self = this.set("VaultARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVaultARN: Self = this.set("VaultARN", js.undefined)
  }
  
}

