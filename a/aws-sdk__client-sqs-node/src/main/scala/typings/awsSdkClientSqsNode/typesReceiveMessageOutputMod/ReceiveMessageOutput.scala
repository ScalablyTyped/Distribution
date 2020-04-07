package typings.awsSdkClientSqsNode.typesReceiveMessageOutputMod

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.typesMessageMod.UnmarshalledMessage
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var Messages: js.UndefOr[js.Array[UnmarshalledMessage]] = js.undefined
}

object ReceiveMessageOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Messages: js.Array[UnmarshalledMessage] = null): ReceiveMessageOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Messages != null) __obj.updateDynamic("Messages")(Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveMessageOutput]
  }
}

