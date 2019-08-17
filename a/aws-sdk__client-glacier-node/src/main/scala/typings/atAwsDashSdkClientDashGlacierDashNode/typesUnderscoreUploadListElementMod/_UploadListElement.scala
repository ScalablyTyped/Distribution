package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreUploadListElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UploadListElement extends js.Object {
  /**
    * <p>The description of the archive that was specified in the Initiate Multipart Upload request.</p>
    */
  var ArchiveDescription: js.UndefOr[String] = js.undefined
  /**
    * <p>The UTC time at which the multipart upload was initiated.</p>
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * <p>The ID of a multipart upload.</p>
    */
  var MultipartUploadId: js.UndefOr[String] = js.undefined
  /**
    * <p>The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in the upload except the last part, which may be smaller than this size.</p>
    */
  var PartSizeInBytes: js.UndefOr[Double] = js.undefined
  /**
    * <p>The Amazon Resource Name (ARN) of the vault that contains the archive.</p>
    */
  var VaultARN: js.UndefOr[String] = js.undefined
}

object _UploadListElement {
  @scala.inline
  def apply(
    ArchiveDescription: String = null,
    CreationDate: String = null,
    MultipartUploadId: String = null,
    PartSizeInBytes: Int | Double = null,
    VaultARN: String = null
  ): _UploadListElement = {
    val __obj = js.Dynamic.literal()
    if (ArchiveDescription != null) __obj.updateDynamic("ArchiveDescription")(ArchiveDescription)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (MultipartUploadId != null) __obj.updateDynamic("MultipartUploadId")(MultipartUploadId)
    if (PartSizeInBytes != null) __obj.updateDynamic("PartSizeInBytes")(PartSizeInBytes.asInstanceOf[js.Any])
    if (VaultARN != null) __obj.updateDynamic("VaultARN")(VaultARN)
    __obj.asInstanceOf[_UploadListElement]
  }
}

