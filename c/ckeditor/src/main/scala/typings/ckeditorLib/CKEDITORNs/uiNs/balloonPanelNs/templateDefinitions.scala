package typings
package ckeditorLib.CKEDITORNs.uiNs.balloonPanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait templateDefinitions extends js.Object {
  var close: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var panel: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var triangle: js.UndefOr[java.lang.String] = js.undefined
  var triangleInner: js.UndefOr[java.lang.String] = js.undefined
  var triangleOuter: js.UndefOr[java.lang.String] = js.undefined
}

object templateDefinitions {
  @scala.inline
  def apply(
    close: java.lang.String = null,
    content: java.lang.String = null,
    panel: java.lang.String = null,
    title: java.lang.String = null,
    triangle: java.lang.String = null,
    triangleInner: java.lang.String = null,
    triangleOuter: java.lang.String = null
  ): templateDefinitions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (content != null) __obj.updateDynamic("content")(content)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (title != null) __obj.updateDynamic("title")(title)
    if (triangle != null) __obj.updateDynamic("triangle")(triangle)
    if (triangleInner != null) __obj.updateDynamic("triangleInner")(triangleInner)
    if (triangleOuter != null) __obj.updateDynamic("triangleOuter")(triangleOuter)
    __obj.asInstanceOf[templateDefinitions]
  }
}

