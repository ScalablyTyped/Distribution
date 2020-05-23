package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var backgroundOpacity: js.UndefOr[Double] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fadeInSpeed: js.UndefOr[Double] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
}

object BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    backgroundOpacity: js.UndefOr[Double] = js.undefined,
    borderRadius: js.UndefOr[Double] = js.undefined,
    color: String = null,
    fadeInSpeed: js.UndefOr[Double] = js.undefined,
    font: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundOpacity)) __obj.updateDynamic("backgroundOpacity")(backgroundOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeInSpeed)) __obj.updateDynamic("fadeInSpeed")(fadeInSpeed.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
}

