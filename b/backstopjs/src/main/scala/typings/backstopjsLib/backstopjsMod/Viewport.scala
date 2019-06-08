package typings
package backstopjsLib.backstopjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var height: scala.Double
  var name: backstopjsLib.backstopjsLibStrings.phone | backstopjsLib.backstopjsLibStrings.tablet | backstopjsLib.backstopjsLibStrings.desktop
  var width: scala.Double
}

object Viewport {
  @scala.inline
  def apply(
    height: scala.Double,
    name: backstopjsLib.backstopjsLibStrings.phone | backstopjsLib.backstopjsLibStrings.tablet | backstopjsLib.backstopjsLibStrings.desktop,
    width: scala.Double
  ): Viewport = {
    val __obj = js.Dynamic.literal(height = height, name = name.asInstanceOf[js.Any], width = width)
  
    __obj.asInstanceOf[Viewport]
  }
}

