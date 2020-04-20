package typings.cliBox.mod

import typings.cliBox.AnonFullscreen
import typings.cliBox.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  var options: AnonFullscreen
  var settings: AnonHeight
  def stringify(): String
}

object Box {
  @scala.inline
  def apply(options: AnonFullscreen, settings: AnonHeight, stringify: () => String): Box = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stringify = js.Any.fromFunction0(stringify))
    __obj.asInstanceOf[Box]
  }
}

