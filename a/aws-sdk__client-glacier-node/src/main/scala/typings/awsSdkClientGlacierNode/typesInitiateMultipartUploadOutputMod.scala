package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/InitiateMultipartUploadOutput", JSImport.Namespace)
@js.native
object typesInitiateMultipartUploadOutputMod extends js.Object {
  @js.native
  trait InitiateMultipartUploadOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The relative URI path of the multipart upload ID Amazon Glacier created.</p>
      */
    var location: js.UndefOr[String] = js.native
    /**
      * <p>The ID of the multipart upload. This value is also included as part of the location.</p>
      */
    var uploadId: js.UndefOr[String] = js.native
  }
  
}

