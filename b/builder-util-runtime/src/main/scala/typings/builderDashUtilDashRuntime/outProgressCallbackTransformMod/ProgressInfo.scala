package typings.builderDashUtilDashRuntime.outProgressCallbackTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressInfo extends js.Object {
  var bytesPerSecond: Double
  var delta: Double
  var percent: Double
  var total: Double
  var transferred: Double
}

object ProgressInfo {
  @scala.inline
  def apply(bytesPerSecond: Double, delta: Double, percent: Double, total: Double, transferred: Double): ProgressInfo = {
    val __obj = js.Dynamic.literal(bytesPerSecond = bytesPerSecond, delta = delta, percent = percent, total = total, transferred = transferred)
  
    __obj.asInstanceOf[ProgressInfo]
  }
}

