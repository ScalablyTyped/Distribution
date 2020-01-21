package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesTraceMod.UnmarshalledTrace
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/BatchGetTracesOutput", JSImport.Namespace)
@js.native
object typesBatchGetTracesOutputMod extends js.Object {
  @js.native
  trait BatchGetTracesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Pagination token. Not used.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    /**
      * <p>Full traces for the specified requests.</p>
      */
    var Traces: js.UndefOr[js.Array[UnmarshalledTrace]] = js.native
    /**
      * <p>Trace IDs of requests that haven't been processed.</p>
      */
    var UnprocessedTraceIds: js.UndefOr[js.Array[String]] = js.native
  }
  
}

