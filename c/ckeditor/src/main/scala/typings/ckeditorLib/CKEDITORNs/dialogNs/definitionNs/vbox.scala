package typings
package ckeditorLib.CKEDITORNs.dialogNs.definitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait vbox extends uiElement {
  var children: js.UndefOr[js.Array[ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement]] = js.undefined
  var expand: js.UndefOr[scala.Boolean] = js.undefined
  var heights: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var styles: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object vbox {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    children: js.Array[ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement] = null,
    className: java.lang.String = null,
    commit: js.Function1[/* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget, scala.Unit] = null,
    expand: js.UndefOr[scala.Boolean] = js.undefined,
    heights: js.Array[scala.Double] = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    onHide: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    onLoad: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    onShow: js.Function1[/* elem */ ckeditorLib.CKEDITORNs.uiNs.dialogNs.uiElement, scala.Unit] = null,
    padding: scala.Int | scala.Double = null,
    requiredContent: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | ckeditorLib.CKEDITORNs.style = null,
    setup: js.Function1[/* widget */ ckeditorLib.CKEDITORNs.pluginsNs.widget, scala.Unit] = null,
    style: java.lang.String = null,
    styles: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    width: js.Array[scala.Double] = null
  ): vbox = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (commit != null) __obj.updateDynamic("commit")(commit)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (heights != null) __obj.updateDynamic("heights")(heights)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[vbox]
  }
}

