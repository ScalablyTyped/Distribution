package typings.awsSdkClientKinesisBrowser.typesUpdateShardCountOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    CurrentShardCount: js.UndefOr[Double] = js.undefined,
    StreamName: String = null,
    TargetShardCount: js.UndefOr[Double] = js.undefined
  ): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(CurrentShardCount)) __obj.updateDynamic("CurrentShardCount")(CurrentShardCount.get.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    if (!js.isUndefined(TargetShardCount)) __obj.updateDynamic("TargetShardCount")(TargetShardCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
}

