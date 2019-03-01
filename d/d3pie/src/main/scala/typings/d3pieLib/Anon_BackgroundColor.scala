package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var backgroundOpacity: js.UndefOr[scala.Double] = js.undefined
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fadeInSpeed: js.UndefOr[scala.Double] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    backgroundOpacity: scala.Int | scala.Double = null,
    borderRadius: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    fadeInSpeed: scala.Int | scala.Double = null,
    font: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null
  ): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (backgroundOpacity != null) __obj.updateDynamic("backgroundOpacity")(backgroundOpacity.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (fadeInSpeed != null) __obj.updateDynamic("fadeInSpeed")(fadeInSpeed.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

