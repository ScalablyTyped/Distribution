package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesUploadListElementMod.UnmarshalledUploadListElement
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/ListMultipartUploadsOutput", JSImport.Namespace)
@js.native
object typesListMultipartUploadsOutputMod extends js.Object {
  @js.native
  trait ListMultipartUploadsOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>An opaque string that represents where to continue pagination of the results. You use the marker in a new List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is <code>null</code>.</p>
      */
    var Marker: js.UndefOr[String] = js.native
    /**
      * <p>A list of in-progress multipart uploads.</p>
      */
    var UploadsList: js.UndefOr[js.Array[UnmarshalledUploadListElement]] = js.native
  }
  
}

