package typings.ckeditor.CKEDITOR.dialog.definition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait content extends js.Object {
  var accessKey: js.UndefOr[String] = js.undefined
  var elements: js.UndefOr[js.Array[uiElement]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object content {
  @scala.inline
  def apply(
    accessKey: String = null,
    elements: js.Array[uiElement] = null,
    id: String = null,
    label: String = null,
    title: String = null
  ): content = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[content]
  }
}

