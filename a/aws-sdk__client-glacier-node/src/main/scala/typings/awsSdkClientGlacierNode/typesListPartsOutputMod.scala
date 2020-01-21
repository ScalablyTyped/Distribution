package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesPartListElementMod.UnmarshalledPartListElement
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/ListPartsOutput", JSImport.Namespace)
@js.native
object typesListPartsOutputMod extends js.Object {
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
  
}

