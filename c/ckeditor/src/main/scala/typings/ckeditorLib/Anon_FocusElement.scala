package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FocusElement extends js.Object {
  var focusElement: js.UndefOr[ckeditorLib.CKEDITORNs.domNs.element | scala.Boolean] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FocusElement {
  @scala.inline
  def apply(
    focusElement: ckeditorLib.CKEDITORNs.domNs.element | scala.Boolean = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FocusElement = {
    val __obj = js.Dynamic.literal()
    if (focusElement != null) __obj.updateDynamic("focusElement")(focusElement.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_FocusElement]
  }
}

