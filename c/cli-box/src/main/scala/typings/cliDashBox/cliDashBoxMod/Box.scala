package typings.cliDashBox.cliDashBoxMod

import typings.cliDashBox.Anon_Fullscreen
import typings.cliDashBox.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  var options: Anon_Fullscreen
  var settings: Anon_Height
  def stringify(): String
}

object Box {
  @scala.inline
  def apply(options: Anon_Fullscreen, settings: Anon_Height, stringify: () => String): Box = {
    val __obj = js.Dynamic.literal(options = options, settings = settings, stringify = js.Any.fromFunction0(stringify))
  
    __obj.asInstanceOf[Box]
  }
}

