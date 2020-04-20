package typings.cliSpinners.mod

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
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spinner]
  }
}

