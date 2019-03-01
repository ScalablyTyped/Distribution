package typings
package ckeditorLib.CKEDITORNs.uiNs.balloonPanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait parts extends js.Object {
  var close: js.UndefOr[ckeditorLib.CKEDITORNs.domNs.element] = js.undefined
  var content: js.UndefOr[ckeditorLib.CKEDITORNs.domNs.element] = js.undefined
  var panel: js.UndefOr[ckeditorLib.CKEDITORNs.domNs.element] = js.undefined
  var title: js.UndefOr[ckeditorLib.CKEDITORNs.domNs.element] = js.undefined
  var triangle: js.UndefOr[ckeditorLib.CKEDITORNs.domNs.element] = js.undefined
  var triangleInner: js.UndefOr[ckeditorLib.CKEDITORNs.domNs.element] = js.undefined
  var triangleOuter: js.UndefOr[ckeditorLib.CKEDITORNs.domNs.element] = js.undefined
}

object parts {
  @scala.inline
  def apply(
    close: ckeditorLib.CKEDITORNs.domNs.element = null,
    content: ckeditorLib.CKEDITORNs.domNs.element = null,
    panel: ckeditorLib.CKEDITORNs.domNs.element = null,
    title: ckeditorLib.CKEDITORNs.domNs.element = null,
    triangle: ckeditorLib.CKEDITORNs.domNs.element = null,
    triangleInner: ckeditorLib.CKEDITORNs.domNs.element = null,
    triangleOuter: ckeditorLib.CKEDITORNs.domNs.element = null
  ): parts = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (content != null) __obj.updateDynamic("content")(content)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (title != null) __obj.updateDynamic("title")(title)
    if (triangle != null) __obj.updateDynamic("triangle")(triangle)
    if (triangleInner != null) __obj.updateDynamic("triangleInner")(triangleInner)
    if (triangleOuter != null) __obj.updateDynamic("triangleOuter")(triangleOuter)
    __obj.asInstanceOf[parts]
  }
}

