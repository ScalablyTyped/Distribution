package typings
package ckeditorLib.CKEDITORNs.dialogNs.definitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait html extends uiElement {
  var html: js.UndefOr[java.lang.String] = js.undefined
}

object html {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    className: java.lang.String = null,
    commit: /* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget => scala.Unit = null,
    html: java.lang.String = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    onHide: /* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement => scala.Unit = null,
    onLoad: /* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement => scala.Unit = null,
    onShow: /* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement => scala.Unit = null,
    requiredContent: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | ckeditorLib.CKEDITORNs.style = null,
    setup: /* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget => scala.Unit = null,
    style: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): html = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (className != null) __obj.updateDynamic("className")(className)
    if (commit != null) __obj.updateDynamic("commit")(js.Any.fromFunction1(commit))
    if (html != null) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1(setup))
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[html]
  }
}

