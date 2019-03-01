package typings
package chokidarLib.chokidarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwaitWriteFinishOptions extends js.Object {
  /**
    * File size polling interval.
    */
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Amount of time in milliseconds for a file size to remain constant before emitting its event.
    */
  var stabilityThreshold: js.UndefOr[scala.Double] = js.undefined
}

object AwaitWriteFinishOptions {
  @scala.inline
  def apply(pollInterval: scala.Int | scala.Double = null, stabilityThreshold: scala.Int | scala.Double = null): AwaitWriteFinishOptions = {
    val __obj = js.Dynamic.literal()
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (stabilityThreshold != null) __obj.updateDynamic("stabilityThreshold")(stabilityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitWriteFinishOptions]
  }
}

