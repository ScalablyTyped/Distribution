package typings.atAwsDashSdkClientDashSqsDashNode.typesListQueuesOutputMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueuesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of queue URLs, up to 1,000 entries.</p>
    */
  var QueueUrls: js.UndefOr[js.Array[String]] = js.undefined
}

object ListQueuesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, QueueUrls: js.Array[String] = null): ListQueuesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (QueueUrls != null) __obj.updateDynamic("QueueUrls")(QueueUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesOutput]
  }
}

