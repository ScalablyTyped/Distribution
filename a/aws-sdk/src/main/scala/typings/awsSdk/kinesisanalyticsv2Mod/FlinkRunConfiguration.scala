package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlinkRunConfiguration extends js.Object {
  /**
    * When restoring from a savepoint, specifies whether the runtime is allowed to skip a state that cannot be mapped to the new program. This will happen if the program is updated between savepoints to remove stateful parameters, and state data in the savepoint no longer corresponds to valid application data. For more information, see  Allowing Non-Restored State in the Apache Flink documentation.
    */
  var AllowNonRestoredState: js.UndefOr[BooleanObject] = js.native
}

object FlinkRunConfiguration {
  @scala.inline
  def apply(AllowNonRestoredState: js.UndefOr[Boolean] = js.undefined): FlinkRunConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowNonRestoredState)) __obj.updateDynamic("AllowNonRestoredState")(AllowNonRestoredState.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlinkRunConfiguration]
  }
}

