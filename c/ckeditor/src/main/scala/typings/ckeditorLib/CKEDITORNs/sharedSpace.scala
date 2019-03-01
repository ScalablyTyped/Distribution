package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sharedSpace extends js.Object {
  var bottom: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var top: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
}

object sharedSpace {
  @scala.inline
  def apply(
    bottom: java.lang.String | stdLib.HTMLElement = null,
    top: java.lang.String | stdLib.HTMLElement = null
  ): sharedSpace = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[sharedSpace]
  }
}

