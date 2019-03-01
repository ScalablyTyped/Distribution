package typings
package ckeditorLib.CKEDITORNs.dialogNs.definitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fileButton extends uiElement {
  var filebrowser: js.UndefOr[java.lang.String] = js.undefined
  var `for`: js.UndefOr[java.lang.String] = js.undefined
  var validate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object fileButton {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    className: java.lang.String = null,
    commit: js.Function1[/* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget, scala.Unit] = null,
    filebrowser: java.lang.String = null,
    `for`: java.lang.String = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    onHide: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    onLoad: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    onShow: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    requiredContent: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | ckeditorLib.CKEDITORNs.style = null,
    setup: js.Function1[/* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget, scala.Unit] = null,
    style: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    validate: js.Function0[scala.Boolean] = null
  ): fileButton = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (className != null) __obj.updateDynamic("className")(className)
    if (commit != null) __obj.updateDynamic("commit")(commit)
    if (filebrowser != null) __obj.updateDynamic("filebrowser")(filebrowser)
    if (`for` != null) __obj.updateDynamic("for")(`for`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[fileButton]
  }
}

