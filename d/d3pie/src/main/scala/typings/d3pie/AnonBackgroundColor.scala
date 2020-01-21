package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var backgroundOpacity: js.UndefOr[Double] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fadeInSpeed: js.UndefOr[Double] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
}

object AnonBackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    backgroundOpacity: Int | Double = null,
    borderRadius: Int | Double = null,
    color: String = null,
    fadeInSpeed: Int | Double = null,
    font: String = null,
    fontSize: Int | Double = null,
    padding: Int | Double = null
  ): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundOpacity != null) __obj.updateDynamic("backgroundOpacity")(backgroundOpacity.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fadeInSpeed != null) __obj.updateDynamic("fadeInSpeed")(fadeInSpeed.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColor]
  }
}

