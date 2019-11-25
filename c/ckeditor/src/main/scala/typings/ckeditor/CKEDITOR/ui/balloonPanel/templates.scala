package typings.ckeditor.CKEDITOR.ui.balloonPanel

import typings.ckeditor.CKEDITOR.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait templates extends js.Object {
  var close: js.UndefOr[template] = js.undefined
  var content: js.UndefOr[template] = js.undefined
  var panel: js.UndefOr[template] = js.undefined
  var title: js.UndefOr[template] = js.undefined
  var triangle: js.UndefOr[template] = js.undefined
  var triangleInner: js.UndefOr[template] = js.undefined
  var triangleOuter: js.UndefOr[template] = js.undefined
}

object templates {
  @scala.inline
  def apply(
    close: template = null,
    content: template = null,
    panel: template = null,
    title: template = null,
    triangle: template = null,
    triangleInner: template = null,
    triangleOuter: template = null
  ): templates = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    if (triangleInner != null) __obj.updateDynamic("triangleInner")(triangleInner.asInstanceOf[js.Any])
    if (triangleOuter != null) __obj.updateDynamic("triangleOuter")(triangleOuter.asInstanceOf[js.Any])
    __obj.asInstanceOf[templates]
  }
}

