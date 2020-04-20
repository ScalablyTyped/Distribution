package typings.carbonIconHelpers.mod

import typings.carbonIconHelpers.AnonHeight
import typings.carbonIconHelpers.carbonIconHelpersStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  var attrs: AnonHeight
  var elem: rect
}

object Rect {
  @scala.inline
  def apply(attrs: AnonHeight, elem: rect): Rect = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], elem = elem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
}

