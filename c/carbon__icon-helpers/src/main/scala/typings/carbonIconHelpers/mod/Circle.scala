package typings.carbonIconHelpers.mod

import typings.carbonIconHelpers.anon.Cx
import typings.carbonIconHelpers.carbonIconHelpersStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Circle extends js.Object {
  var attrs: Cx
  var elem: circle
}

object Circle {
  @scala.inline
  def apply(attrs: Cx, elem: circle): Circle = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], elem = elem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
}

