package typings.carbonIconHelpers.mod

import typings.carbonIconHelpers.anon.Height
import typings.carbonIconHelpers.carbonIconHelpersStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  var attrs: Height
  var elem: rect
}

object Rect {
  @scala.inline
  def apply(attrs: Height, elem: rect): Rect = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], elem = elem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
}

