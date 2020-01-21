package typings.ckeditor

import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocusElement extends js.Object {
  var focusElement: js.UndefOr[element | Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object AnonFocusElement {
  @scala.inline
  def apply(focusElement: element | Boolean = null, show: js.UndefOr[Boolean] = js.undefined): AnonFocusElement = {
    val __obj = js.Dynamic.literal()
    if (focusElement != null) __obj.updateDynamic("focusElement")(focusElement.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocusElement]
  }
}

