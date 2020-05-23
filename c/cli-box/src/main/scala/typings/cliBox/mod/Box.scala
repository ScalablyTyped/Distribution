package typings.cliBox.mod

import typings.cliBox.anon.Fullscreen
import typings.cliBox.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  var options: Fullscreen
  var settings: Height
  def stringify(): String
}

object Box {
  @scala.inline
  def apply(options: Fullscreen, settings: Height, stringify: () => String): Box = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stringify = js.Any.fromFunction0(stringify))
    __obj.asInstanceOf[Box]
  }
}

