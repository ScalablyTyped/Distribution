package typings.ckeditor.CKEDITOR.ui.balloonPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait templateDefinitions extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var panel: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var triangle: js.UndefOr[String] = js.undefined
  var triangleInner: js.UndefOr[String] = js.undefined
  var triangleOuter: js.UndefOr[String] = js.undefined
}

object templateDefinitions {
  @scala.inline
  def apply(
    close: String = null,
    content: String = null,
    panel: String = null,
    title: String = null,
    triangle: String = null,
    triangleInner: String = null,
    triangleOuter: String = null
  ): templateDefinitions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    if (triangleInner != null) __obj.updateDynamic("triangleInner")(triangleInner.asInstanceOf[js.Any])
    if (triangleOuter != null) __obj.updateDynamic("triangleOuter")(triangleOuter.asInstanceOf[js.Any])
    __obj.asInstanceOf[templateDefinitions]
  }
}

