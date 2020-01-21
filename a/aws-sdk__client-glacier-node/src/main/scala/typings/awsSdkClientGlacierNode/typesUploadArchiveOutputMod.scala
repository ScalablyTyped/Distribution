package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/UploadArchiveOutput", JSImport.Namespace)
@js.native
object typesUploadArchiveOutputMod extends js.Object {
  @js.native
  trait UploadArchiveOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The ID of the archive. This value is also included as part of the location.</p>
      */
    var archiveId: js.UndefOr[String] = js.native
    /**
      * <p>The checksum of the archive computed by Amazon Glacier.</p>
      */
    var checksum: js.UndefOr[String] = js.native
    /**
      * <p>The relative URI path of the newly added archive resource.</p>
      */
    var location: js.UndefOr[String] = js.native
  }
  
}

