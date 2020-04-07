package typings.awsSdkClientXrayNode.typesGetTraceGraphOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesServiceMod.UnmarshalledService
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTraceGraphOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Pagination token. Not used.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The services that have processed one of the specified requests.</p>
    */
  var Services: js.UndefOr[js.Array[UnmarshalledService]] = js.undefined
}

object GetTraceGraphOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    NextToken: String = null,
    Services: js.Array[UnmarshalledService] = null
  ): GetTraceGraphOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Services != null) __obj.updateDynamic("Services")(Services.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTraceGraphOutput]
  }
}

