package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesServiceMod.UnmarshalledService
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/GetTraceGraphOutput", JSImport.Namespace)
@js.native
object typesGetTraceGraphOutputMod extends js.Object {
  @js.native
  trait GetTraceGraphOutput extends OutputTypesUnion {
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
      * <p>The services that have processed one of the specified requests.</p>
      */
    var Services: js.UndefOr[js.Array[UnmarshalledService]] = js.native
  }
  
}

