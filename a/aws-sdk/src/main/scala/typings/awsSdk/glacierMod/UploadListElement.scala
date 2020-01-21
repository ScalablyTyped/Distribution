package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadListElement extends js.Object {
  /**
    * The description of the archive that was specified in the Initiate Multipart Upload request.
    */
  var ArchiveDescription: js.UndefOr[String] = js.native
  /**
    * The UTC time at which the multipart upload was initiated.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The ID of a multipart upload.
    */
  var MultipartUploadId: js.UndefOr[String] = js.native
  /**
    * The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in the upload except the last part, which may be smaller than this size.
    */
  var PartSizeInBytes: js.UndefOr[long] = js.native
  /**
    * The Amazon Resource Name (ARN) of the vault that contains the archive.
    */
  var VaultARN: js.UndefOr[String] = js.native
}

object UploadListElement {
  @scala.inline
  def apply(
    ArchiveDescription: String = null,
    CreationDate: String = null,
    MultipartUploadId: String = null,
    PartSizeInBytes: Int | Double = null,
    VaultARN: String = null
  ): UploadListElement = {
    val __obj = js.Dynamic.literal()
    if (ArchiveDescription != null) __obj.updateDynamic("ArchiveDescription")(ArchiveDescription.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (MultipartUploadId != null) __obj.updateDynamic("MultipartUploadId")(MultipartUploadId.asInstanceOf[js.Any])
    if (PartSizeInBytes != null) __obj.updateDynamic("PartSizeInBytes")(PartSizeInBytes.asInstanceOf[js.Any])
    if (VaultARN != null) __obj.updateDynamic("VaultARN")(VaultARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadListElement]
  }
}

