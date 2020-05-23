package typings.chokidar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwaitWriteFinishOptions extends js.Object {
  /**
    * File size polling interval.
    */
  var pollInterval: js.UndefOr[Double] = js.undefined
  /**
    * Amount of time in milliseconds for a file size to remain constant before emitting its event.
    */
  var stabilityThreshold: js.UndefOr[Double] = js.undefined
}

object AwaitWriteFinishOptions {
  @scala.inline
  def apply(
    pollInterval: js.UndefOr[Double] = js.undefined,
    stabilityThreshold: js.UndefOr[Double] = js.undefined
  ): AwaitWriteFinishOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pollInterval)) __obj.updateDynamic("pollInterval")(pollInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stabilityThreshold)) __obj.updateDynamic("stabilityThreshold")(stabilityThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitWriteFinishOptions]
  }
}

