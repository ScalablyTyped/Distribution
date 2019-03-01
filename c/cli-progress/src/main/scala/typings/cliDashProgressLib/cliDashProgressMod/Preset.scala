package typings
package cliDashProgressLib.cliDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Preset extends js.Object {
  var barCompleteChar: java.lang.String
  var barIncompleteChar: java.lang.String
  var format: java.lang.String
}

object Preset {
  @scala.inline
  def apply(barCompleteChar: java.lang.String, barIncompleteChar: java.lang.String, format: java.lang.String): Preset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("barCompleteChar")(barCompleteChar)
    __obj.updateDynamic("barIncompleteChar")(barIncompleteChar)
    __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[Preset]
  }
}

