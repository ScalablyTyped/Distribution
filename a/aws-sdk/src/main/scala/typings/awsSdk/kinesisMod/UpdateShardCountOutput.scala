package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateShardCountOutput extends js.Object {
  /**
    * The current number of shards.
    */
  var CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisMod.StreamName] = js.native
  /**
    * The updated number of shards.
    */
  var TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.native
}

object UpdateShardCountOutput {
  @scala.inline
  def apply(
    CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined,
    StreamName: StreamName = null,
    TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
  ): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentShardCount)) __obj.updateDynamic("CurrentShardCount")(CurrentShardCount.get.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    if (!js.isUndefined(TargetShardCount)) __obj.updateDynamic("TargetShardCount")(TargetShardCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
}

