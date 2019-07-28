package typings.cliDashProgress.cliDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Preset extends js.Object {
  var barCompleteChar: String
  var barIncompleteChar: String
  var format: String
}

object Preset {
  @scala.inline
  def apply(barCompleteChar: String, barIncompleteChar: String, format: String): Preset = {
    val __obj = js.Dynamic.literal(barCompleteChar = barCompleteChar, barIncompleteChar = barIncompleteChar, format = format)
  
    __obj.asInstanceOf[Preset]
  }
}

