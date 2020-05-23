package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var draggingCursor: js.UndefOr[String] = js.undefined
  var enableClicking: js.UndefOr[Boolean] = js.undefined
  var enableDragging: js.UndefOr[Boolean] = js.undefined
  var enableMassClear: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[Icon] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
  var raiseOnDrag: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var shadow: js.UndefOr[Icon] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    draggingCursor: String = null,
    enableClicking: js.UndefOr[Boolean] = js.undefined,
    enableDragging: js.UndefOr[Boolean] = js.undefined,
    enableMassClear: js.UndefOr[Boolean] = js.undefined,
    icon: Icon = null,
    offset: Size = null,
    raiseOnDrag: js.UndefOr[Boolean] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    shadow: Icon = null,
    title: String = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (draggingCursor != null) __obj.updateDynamic("draggingCursor")(draggingCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(enableClicking)) __obj.updateDynamic("enableClicking")(enableClicking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDragging)) __obj.updateDynamic("enableDragging")(enableDragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMassClear)) __obj.updateDynamic("enableMassClear")(enableMassClear.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(raiseOnDrag)) __obj.updateDynamic("raiseOnDrag")(raiseOnDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

