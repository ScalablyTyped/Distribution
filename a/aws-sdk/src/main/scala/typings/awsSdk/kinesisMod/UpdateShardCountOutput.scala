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
    CurrentShardCount: Int | Double = null,
    StreamName: StreamName = null,
    TargetShardCount: Int | Double = null
  ): UpdateShardCountOutput = {
    val __obj = js.Dynamic.literal()
    if (CurrentShardCount != null) __obj.updateDynamic("CurrentShardCount")(CurrentShardCount.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    if (TargetShardCount != null) __obj.updateDynamic("TargetShardCount")(TargetShardCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShardCountOutput]
  }
}

