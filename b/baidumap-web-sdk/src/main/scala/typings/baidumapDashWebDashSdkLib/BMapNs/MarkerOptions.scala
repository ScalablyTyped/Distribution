package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var draggingCursor: js.UndefOr[java.lang.String] = js.undefined
  var enableClicking: js.UndefOr[scala.Boolean] = js.undefined
  var enableDragging: js.UndefOr[scala.Boolean] = js.undefined
  var enableMassClear: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[Icon] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
  var raiseOnDrag: js.UndefOr[scala.Boolean] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var shadow: js.UndefOr[Icon] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    draggingCursor: java.lang.String = null,
    enableClicking: js.UndefOr[scala.Boolean] = js.undefined,
    enableDragging: js.UndefOr[scala.Boolean] = js.undefined,
    enableMassClear: js.UndefOr[scala.Boolean] = js.undefined,
    icon: Icon = null,
    offset: Size = null,
    raiseOnDrag: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: scala.Int | scala.Double = null,
    shadow: Icon = null,
    title: java.lang.String = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (draggingCursor != null) __obj.updateDynamic("draggingCursor")(draggingCursor)
    if (!js.isUndefined(enableClicking)) __obj.updateDynamic("enableClicking")(enableClicking)
    if (!js.isUndefined(enableDragging)) __obj.updateDynamic("enableDragging")(enableDragging)
    if (!js.isUndefined(enableMassClear)) __obj.updateDynamic("enableMassClear")(enableMassClear)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (!js.isUndefined(raiseOnDrag)) __obj.updateDynamic("raiseOnDrag")(raiseOnDrag)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MarkerOptions]
  }
}

