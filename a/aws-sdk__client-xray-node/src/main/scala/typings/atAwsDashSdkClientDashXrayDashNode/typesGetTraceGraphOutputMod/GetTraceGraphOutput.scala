package typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceGraphOutputMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceMod._UnmarshalledService
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var Services: js.UndefOr[js.Array[_UnmarshalledService]] = js.undefined
}

object GetTraceGraphOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    NextToken: String = null,
    Services: js.Array[_UnmarshalledService] = null
  ): GetTraceGraphOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Services != null) __obj.updateDynamic("Services")(Services)
    __obj.asInstanceOf[GetTraceGraphOutput]
  }
}

