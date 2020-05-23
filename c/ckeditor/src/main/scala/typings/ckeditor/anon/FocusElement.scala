package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusElement extends js.Object {
  var focusElement: js.UndefOr[element | Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object FocusElement {
  @scala.inline
  def apply(focusElement: element | Boolean = null, show: js.UndefOr[Boolean] = js.undefined): FocusElement = {
    val __obj = js.Dynamic.literal()
    if (focusElement != null) __obj.updateDynamic("focusElement")(focusElement.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusElement]
  }
}

