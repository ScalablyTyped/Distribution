package typings
package cliDashSpinnersLib.cliDashSpinnersMod.cliSpinnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spinner extends js.Object {
  var frames: js.Array[java.lang.String]
  var interval: scala.Double
}

object Spinner {
  @scala.inline
  def apply(frames: js.Array[java.lang.String], interval: scala.Double): Spinner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frames")(frames)
    __obj.updateDynamic("interval")(interval)
    __obj.asInstanceOf[Spinner]
  }
}

