package typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeadLetterSourceQueuesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of source queue URLs that have the <code>RedrivePolicy</code> queue attribute configured with a dead-letter queue.</p>
    */
  var queueUrls: js.Array[String]
}

object ListDeadLetterSourceQueuesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, queueUrls: js.Array[String]): ListDeadLetterSourceQueuesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], queueUrls = queueUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeadLetterSourceQueuesOutput]
  }
}

