package typings.bip38.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressStatus extends js.Object {
  var current: Double
  var percent: Double
  var total: Double
}

object ProgressStatus {
  @scala.inline
  def apply(current: Double, percent: Double, total: Double): ProgressStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProgressStatus]
  }
}

