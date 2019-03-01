package typings
package ckeditorLib.CKEDITORNs.uiNs.balloonPanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait templates extends js.Object {
  var close: js.UndefOr[ckeditorLib.CKEDITORNs.template] = js.undefined
  var content: js.UndefOr[ckeditorLib.CKEDITORNs.template] = js.undefined
  var panel: js.UndefOr[ckeditorLib.CKEDITORNs.template] = js.undefined
  var title: js.UndefOr[ckeditorLib.CKEDITORNs.template] = js.undefined
  var triangle: js.UndefOr[ckeditorLib.CKEDITORNs.template] = js.undefined
  var triangleInner: js.UndefOr[ckeditorLib.CKEDITORNs.template] = js.undefined
  var triangleOuter: js.UndefOr[ckeditorLib.CKEDITORNs.template] = js.undefined
}

object templates {
  @scala.inline
  def apply(
    close: ckeditorLib.CKEDITORNs.template = null,
    content: ckeditorLib.CKEDITORNs.template = null,
    panel: ckeditorLib.CKEDITORNs.template = null,
    title: ckeditorLib.CKEDITORNs.template = null,
    triangle: ckeditorLib.CKEDITORNs.template = null,
    triangleInner: ckeditorLib.CKEDITORNs.template = null,
    triangleOuter: ckeditorLib.CKEDITORNs.template = null
  ): templates = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (content != null) __obj.updateDynamic("content")(content)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (title != null) __obj.updateDynamic("title")(title)
    if (triangle != null) __obj.updateDynamic("triangle")(triangle)
    if (triangleInner != null) __obj.updateDynamic("triangleInner")(triangleInner)
    if (triangleOuter != null) __obj.updateDynamic("triangleOuter")(triangleOuter)
    __obj.asInstanceOf[templates]
  }
}

