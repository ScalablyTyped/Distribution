package typings.cliProgress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Preset extends js.Object {
  var barCompleteChar: String = js.native
  var barIncompleteChar: String = js.native
  /**
    *   Example: 'progress [{bar}] {percentage}% | ETA: {eta}s | {value}/{total}'
    *
    * {bar} - the progress bar, customizable by the options barsize, barCompleteString and barIncompleteString
    *
    * {percentage} - the current progress in percent (0-100)
    *
    * {total} - the end value
    *
    * {value} - the current value set by last update() call
    *
    * {eta} - expected time of accomplishment in seconds
    *
    * {duration} - elapsed time in seconds
    *
    * {eta_formatted} - expected time of accomplishment formatted into appropriate units
    *
    * {duration_formatted} - elapsed time formatted into appropriate units
    *
    */
  var format: String = js.native
}

object Preset {
  @scala.inline
  def apply(barCompleteChar: String, barIncompleteChar: String, format: String): Preset = {
    val __obj = js.Dynamic.literal(barCompleteChar = barCompleteChar.asInstanceOf[js.Any], barIncompleteChar = barIncompleteChar.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preset]
  }
  @scala.inline
  implicit class PresetOps[Self <: Preset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBarCompleteChar(value: String): Self = this.set("barCompleteChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarIncompleteChar(value: String): Self = this.set("barIncompleteChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
  }
  
}

