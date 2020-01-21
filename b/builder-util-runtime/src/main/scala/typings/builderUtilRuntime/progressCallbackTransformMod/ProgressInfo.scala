package typings.builderUtilRuntime.progressCallbackTransformMod

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
    val __obj = js.Dynamic.literal(bytesPerSecond = bytesPerSecond.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProgressInfo]
  }
}

