package typings
package bip38Lib.bip38Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressStatus extends js.Object {
  var current: scala.Double
  var percent: scala.Double
  var total: scala.Double
}

object ProgressStatus {
  @scala.inline
  def apply(current: scala.Double, percent: scala.Double, total: scala.Double): ProgressStatus = {
    val __obj = js.Dynamic.literal(current = current, percent = percent, total = total)
  
    __obj.asInstanceOf[ProgressStatus]
  }
}

