package typings.cliDashSpinners.cliDashSpinnersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spinner extends js.Object {
  var frames: js.Array[String]
  var interval: Double
}

object Spinner {
  @scala.inline
  def apply(frames: js.Array[String], interval: Double): Spinner = {
    val __obj = js.Dynamic.literal(frames = frames, interval = interval)
  
    __obj.asInstanceOf[Spinner]
  }
}

