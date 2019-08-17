package typings.atAwsDashSdkClientDashSqsDashNode.typesReceiveMessageOutputMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreMessageMod._UnmarshalledMessage
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveMessageOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of messages.</p>
    */
  var Messages: js.UndefOr[js.Array[_UnmarshalledMessage]] = js.undefined
}

object ReceiveMessageOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Messages: js.Array[_UnmarshalledMessage] = null): ReceiveMessageOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Messages != null) __obj.updateDynamic("Messages")(Messages)
    __obj.asInstanceOf[ReceiveMessageOutput]
  }
}

