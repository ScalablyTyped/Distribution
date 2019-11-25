package typings.atAwsDashSdkClientDashGlacierDashNode.typesListPartsOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscorePartListElementMod._UnmarshalledPartListElement
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartsOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The description of the archive that was specified in the Initiate Multipart Upload request.</p>
    */
  var ArchiveDescription: js.UndefOr[String] = js.undefined
  /**
    * <p>The UTC time at which the multipart upload was initiated.</p>
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * <p>An opaque string that represents where to continue pagination of the results. You use the marker in a new List Parts request to obtain more jobs in the list. If there are no more parts, this value is <code>null</code>.</p>
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * <p>The ID of the upload to which the parts are associated.</p>
    */
  var MultipartUploadId: js.UndefOr[String] = js.undefined
  /**
    * <p>The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.</p>
    */
  var PartSizeInBytes: js.UndefOr[Double] = js.undefined
  /**
    * <p>A list of the part sizes of the multipart upload. Each object in the array contains a <code>RangeBytes</code> and <code>sha256-tree-hash</code> name/value pair.</p>
    */
  var Parts: js.UndefOr[js.Array[_UnmarshalledPartListElement]] = js.undefined
  /**
    * <p>The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.</p>
    */
  var VaultARN: js.UndefOr[String] = js.undefined
}

object ListPartsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ArchiveDescription: String = null,
    CreationDate: String = null,
    Marker: String = null,
    MultipartUploadId: String = null,
    PartSizeInBytes: Int | Double = null,
    Parts: js.Array[_UnmarshalledPartListElement] = null,
    VaultARN: String = null
  ): ListPartsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ArchiveDescription != null) __obj.updateDynamic("ArchiveDescription")(ArchiveDescription.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MultipartUploadId != null) __obj.updateDynamic("MultipartUploadId")(MultipartUploadId.asInstanceOf[js.Any])
    if (PartSizeInBytes != null) __obj.updateDynamic("PartSizeInBytes")(PartSizeInBytes.asInstanceOf[js.Any])
    if (Parts != null) __obj.updateDynamic("Parts")(Parts.asInstanceOf[js.Any])
    if (VaultARN != null) __obj.updateDynamic("VaultARN")(VaultARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsOutput]
  }
}

