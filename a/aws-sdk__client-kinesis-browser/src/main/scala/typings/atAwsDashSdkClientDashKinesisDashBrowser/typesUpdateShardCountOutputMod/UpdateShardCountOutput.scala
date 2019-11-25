package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUpdateShardCountOutputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateShardCountOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The current number of shards.</p>
    */
  var CurrentShardCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The name of the stream.</p>
    */
  var StreamName: js.UndefOr[String] = js.undefined
  /**
    * <p>The updated number of shards.</p>
    */
  var TargetShardCount: js.UndefOr[Double] = js.undefined
}

object UpdateShardCountOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CurrentShardCount: Int | Double = null,
    StreamName: String = null,
    TargetShardCount: Int | Double = null
  ): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CurrentShardCount != null) __obj.updateDynamic("CurrentShardCount")(CurrentShardCount.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    if (TargetShardCount != null) __obj.updateDynamic("TargetShardCount")(TargetShardCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
}

