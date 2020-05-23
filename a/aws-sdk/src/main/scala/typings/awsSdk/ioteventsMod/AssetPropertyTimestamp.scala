package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetPropertyTimestamp extends js.Object {
  /**
    * The nanosecond offset converted from timeInSeconds. The valid range is between 0-999999999. You can also specify an expression.
    */
  var offsetInNanos: js.UndefOr[AssetPropertyOffsetInNanos] = js.native
  /**
    * The timestamp, in seconds, in the Unix epoch format. The valid range is between 1-31556889864403199. You can also specify an expression.
    */
  var timeInSeconds: AssetPropertyTimeInSeconds = js.native
}

object AssetPropertyTimestamp {
  @scala.inline
  def apply(timeInSeconds: AssetPropertyTimeInSeconds, offsetInNanos: AssetPropertyOffsetInNanos = null): AssetPropertyTimestamp = {
    val __obj = js.Dynamic.literal(timeInSeconds = timeInSeconds.asInstanceOf[js.Any])
    if (offsetInNanos != null) __obj.updateDynamic("offsetInNanos")(offsetInNanos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyTimestamp]
  }
}

