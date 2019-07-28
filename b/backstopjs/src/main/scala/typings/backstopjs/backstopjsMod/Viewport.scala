package typings.backstopjs.backstopjsMod

import typings.backstopjs.backstopjsStrings.desktop
import typings.backstopjs.backstopjsStrings.phone
import typings.backstopjs.backstopjsStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var height: Double
  var name: phone | tablet | desktop
  var width: Double
}

object Viewport {
  @scala.inline
  def apply(height: Double, name: phone | tablet | desktop, width: Double): Viewport = {
    val __obj = js.Dynamic.literal(height = height, name = name.asInstanceOf[js.Any], width = width)
  
    __obj.asInstanceOf[Viewport]
  }
}

