package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uiElement extends js.Object {
  var accessKey: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: String
  var style: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: Double
}

object uiElement {
  @scala.inline
  def apply(
    id: String,
    `type`: Double,
    accessKey: String = null,
    className: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    title: String = null
  ): uiElement = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[uiElement]
  }
}

