package typings.awsSdkClientXrayNode.typesGetServiceGraphOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesServiceMod.UnmarshalledService
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceGraphOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The end of the time frame for which the graph was generated.</p>
    */
  var EndTime: js.UndefOr[Date] = js.undefined
  /**
    * <p>Pagination token. Not used.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The services that have processed a traced request during the specified time frame.</p>
    */
  var Services: js.UndefOr[js.Array[UnmarshalledService]] = js.undefined
  /**
    * <p>The start of the time frame for which the graph was generated.</p>
    */
  var StartTime: js.UndefOr[Date] = js.undefined
}

object GetServiceGraphOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    EndTime: Date = null,
    NextToken: String = null,
    Services: js.Array[UnmarshalledService] = null,
    StartTime: Date = null
  ): GetServiceGraphOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Services != null) __obj.updateDynamic("Services")(Services.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceGraphOutput]
  }
}

