package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/UploadMultipartPartOutput", JSImport.Namespace)
@js.native
object typesUploadMultipartPartOutputMod extends js.Object {
  @js.native
  trait UploadMultipartPartOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The SHA256 tree hash that Amazon Glacier computed for the uploaded part.</p>
      */
    var checksum: js.UndefOr[String] = js.native
  }
  
}

