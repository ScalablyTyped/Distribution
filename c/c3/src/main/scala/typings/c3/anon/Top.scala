package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Top extends js.Object {
  /** Defaults to `"50px"`. */
  var left: js.UndefOr[String] = js.undefined
  /** Defaults to `"0px"`. */
  var top: js.UndefOr[String] = js.undefined
}

object Top {
  @scala.inline
  def apply(left: String = null, top: String = null): Top = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top]
  }
}

