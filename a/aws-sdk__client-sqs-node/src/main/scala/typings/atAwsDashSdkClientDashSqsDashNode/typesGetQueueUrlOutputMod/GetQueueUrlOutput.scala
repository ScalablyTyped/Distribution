package typings.atAwsDashSdkClientDashSqsDashNode.typesGetQueueUrlOutputMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueUrlOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The URL of the queue.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}

object GetQueueUrlOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, QueueUrl: String = null): GetQueueUrlOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (QueueUrl != null) __obj.updateDynamic("QueueUrl")(QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueUrlOutput]
  }
}

