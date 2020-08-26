package typings.awsSdkClientGlacierNode.typesListPartsOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesPartListElementMod.UnmarshalledPartListElement
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartsOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The description of the archive that was specified in the Initiate Multipart Upload request.</p>
    */
  var ArchiveDescription: js.UndefOr[String] = js.native
  /**
    * <p>The UTC time at which the multipart upload was initiated.</p>
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * <p>An opaque string that represents where to continue pagination of the results. You use the marker in a new List Parts request to obtain more jobs in the list. If there are no more parts, this value is <code>null</code>.</p>
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * <p>The ID of the upload to which the parts are associated.</p>
    */
  var MultipartUploadId: js.UndefOr[String] = js.native
  /**
    * <p>The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.</p>
    */
  var PartSizeInBytes: js.UndefOr[Double] = js.native
  /**
    * <p>A list of the part sizes of the multipart upload. Each object in the array contains a <code>RangeBytes</code> and <code>sha256-tree-hash</code> name/value pair.</p>
    */
  var Parts: js.UndefOr[js.Array[UnmarshalledPartListElement]] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.</p>
    */
  var VaultARN: js.UndefOr[String] = js.native
}

object ListPartsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListPartsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsOutput]
  }
  @scala.inline
  implicit class ListPartsOutputOps[Self <: ListPartsOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setArchiveDescription(value: String): Self = this.set("ArchiveDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchiveDescription: Self = this.set("ArchiveDescription", js.undefined)
    @scala.inline
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMultipartUploadId(value: String): Self = this.set("MultipartUploadId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipartUploadId: Self = this.set("MultipartUploadId", js.undefined)
    @scala.inline
    def setPartSizeInBytes(value: Double): Self = this.set("PartSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartSizeInBytes: Self = this.set("PartSizeInBytes", js.undefined)
    @scala.inline
    def setPartsVarargs(value: UnmarshalledPartListElement*): Self = this.set("Parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: js.Array[UnmarshalledPartListElement]): Self = this.set("Parts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParts: Self = this.set("Parts", js.undefined)
    @scala.inline
    def setVaultARN(value: String): Self = this.set("VaultARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVaultARN: Self = this.set("VaultARN", js.undefined)
  }
  
}

