package typings.cliProgress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Preset extends js.Object {
  var barCompleteChar: String
  var barIncompleteChar: String
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
  var format: String
}

object Preset {
  @scala.inline
  def apply(barCompleteChar: String, barIncompleteChar: String, format: String): Preset = {
    val __obj = js.Dynamic.literal(barCompleteChar = barCompleteChar.asInstanceOf[js.Any], barIncompleteChar = barIncompleteChar.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Preset]
  }
}

