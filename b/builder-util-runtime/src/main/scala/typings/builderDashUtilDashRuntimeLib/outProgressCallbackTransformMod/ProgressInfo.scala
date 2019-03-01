package typings
package builderDashUtilDashRuntimeLib.outProgressCallbackTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressInfo extends js.Object {
  var bytesPerSecond: scala.Double
  var delta: scala.Double
  var percent: scala.Double
  var total: scala.Double
  var transferred: scala.Double
}

object ProgressInfo {
  @scala.inline
  def apply(
    bytesPerSecond: scala.Double,
    delta: scala.Double,
    percent: scala.Double,
    total: scala.Double,
    transferred: scala.Double
  ): ProgressInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytesPerSecond")(bytesPerSecond)
    __obj.updateDynamic("delta")(delta)
    __obj.updateDynamic("percent")(percent)
    __obj.updateDynamic("total")(total)
    __obj.updateDynamic("transferred")(transferred)
    __obj.asInstanceOf[ProgressInfo]
  }
}

