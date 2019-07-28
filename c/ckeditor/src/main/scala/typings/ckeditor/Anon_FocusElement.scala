package typings.ckeditor

import typings.ckeditor.CKEDITORNs.domNs.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FocusElement extends js.Object {
  var focusElement: js.UndefOr[element | Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_FocusElement {
  @scala.inline
  def apply(focusElement: element | Boolean = null, show: js.UndefOr[Boolean] = js.undefined): Anon_FocusElement = {
    val __obj = js.Dynamic.literal()
    if (focusElement != null) __obj.updateDynamic("focusElement")(focusElement.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_FocusElement]
  }
}

