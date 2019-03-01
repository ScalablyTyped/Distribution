package typings
package ckeditorLib.CKEDITORNs.dialogNs.definitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait content extends js.Object {
  var accessKey: js.UndefOr[java.lang.String] = js.undefined
  var elements: js.UndefOr[js.Array[uiElement]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object content {
  @scala.inline
  def apply(
    accessKey: java.lang.String = null,
    elements: js.Array[uiElement] = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    title: java.lang.String = null
  ): content = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[content]
  }
}

