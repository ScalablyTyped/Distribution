package typings
package ckeditorLib.CKEDITORNs.dialogNs.definitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uiElement extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var commit: js.UndefOr[js.Function1[/* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget, scala.Unit]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var onHide: js.UndefOr[
    js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit]
  ] = js.undefined
  var onLoad: js.UndefOr[
    js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit]
  ] = js.undefined
  var onShow: js.UndefOr[
    js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit]
  ] = js.undefined
  var requiredContent: js.UndefOr[
    java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | ckeditorLib.CKEDITORNs.style
  ] = js.undefined
  var setup: js.UndefOr[js.Function1[/* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget, scala.Unit]] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object uiElement {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    className: java.lang.String = null,
    commit: js.Function1[/* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget, scala.Unit] = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    onHide: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    onLoad: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    onShow: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    requiredContent: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | ckeditorLib.CKEDITORNs.style = null,
    setup: js.Function1[/* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget, scala.Unit] = null,
    style: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): uiElement = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (className != null) __obj.updateDynamic("className")(className)
    if (commit != null) __obj.updateDynamic("commit")(commit)
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
    __obj.asInstanceOf[uiElement]
  }
}

