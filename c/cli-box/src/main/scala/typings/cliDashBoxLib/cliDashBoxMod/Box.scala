package typings
package cliDashBoxLib.cliDashBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  var options: cliDashBoxLib.Anon_Fullscreen
  var settings: cliDashBoxLib.Anon_Height
  def stringify(): java.lang.String
}

object Box {
  @scala.inline
  def apply(
    options: cliDashBoxLib.Anon_Fullscreen,
    settings: cliDashBoxLib.Anon_Height,
    stringify: js.Function0[java.lang.String]
  ): Box = {
    val __obj = js.Dynamic.literal(options = options, settings = settings, stringify = stringify)
  
    __obj.asInstanceOf[Box]
  }
}

