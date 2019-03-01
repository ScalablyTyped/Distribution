package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uiElement extends js.Object {
  var accessKey: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var style: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: scala.Double
}

object uiElement {
  @scala.inline
  def apply(
    id: java.lang.String,
    `type`: scala.Double,
    accessKey: java.lang.String = null,
    className: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    style: java.lang.String = null,
    title: java.lang.String = null
  ): uiElement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[uiElement]
  }
}

