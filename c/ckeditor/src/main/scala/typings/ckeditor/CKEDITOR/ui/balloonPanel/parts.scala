package typings.ckeditor.CKEDITOR.ui.balloonPanel

import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait parts extends js.Object {
  var close: js.UndefOr[element] = js.undefined
  var content: js.UndefOr[element] = js.undefined
  var panel: js.UndefOr[element] = js.undefined
  var title: js.UndefOr[element] = js.undefined
  var triangle: js.UndefOr[element] = js.undefined
  var triangleInner: js.UndefOr[element] = js.undefined
  var triangleOuter: js.UndefOr[element] = js.undefined
}

object parts {
  @scala.inline
  def apply(
    close: element = null,
    content: element = null,
    panel: element = null,
    title: element = null,
    triangle: element = null,
    triangleInner: element = null,
    triangleOuter: element = null
  ): parts = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    if (triangleInner != null) __obj.updateDynamic("triangleInner")(triangleInner.asInstanceOf[js.Any])
    if (triangleOuter != null) __obj.updateDynamic("triangleOuter")(triangleOuter.asInstanceOf[js.Any])
    __obj.asInstanceOf[parts]
  }
}

