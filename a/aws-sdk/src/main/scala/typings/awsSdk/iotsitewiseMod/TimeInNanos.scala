package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeInNanos extends js.Object {
  /**
    * The nanosecond offset from timeInSeconds.
    */
  var offsetInNanos: js.UndefOr[OffsetInNanos] = js.native
  /**
    * The timestamp date, in seconds, in the Unix epoch format. Fractional nanosecond data is provided by offsetInNanos.
    */
  var timeInSeconds: TimeInSeconds = js.native
}

object TimeInNanos {
  @scala.inline
  def apply(timeInSeconds: TimeInSeconds, offsetInNanos: js.UndefOr[OffsetInNanos] = js.undefined): TimeInNanos = {
    val __obj = js.Dynamic.literal(timeInSeconds = timeInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetInNanos)) __obj.updateDynamic("offsetInNanos")(offsetInNanos.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInNanos]
  }
}

