package typings.ckeditor.CKEDITORNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sharedSpace extends js.Object {
  var bottom: js.UndefOr[String | HTMLElement] = js.undefined
  var top: js.UndefOr[String | HTMLElement] = js.undefined
}

object sharedSpace {
  @scala.inline
  def apply(bottom: String | HTMLElement = null, top: String | HTMLElement = null): sharedSpace = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[sharedSpace]
  }
}

