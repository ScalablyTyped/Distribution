package typings.atAwsDashSdkClientDashSqsDashNode.typesCreateQueueOutputMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQueueOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The URL of the created Amazon SQS queue.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}

object CreateQueueOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, QueueUrl: String = null): CreateQueueOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (QueueUrl != null) __obj.updateDynamic("QueueUrl")(QueueUrl)
    __obj.asInstanceOf[CreateQueueOutput]
  }
}

