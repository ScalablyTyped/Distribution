package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var backgroundColorLighter: js.UndefOr[java.lang.String] = js.undefined
  var backgroundColorLighter2: js.UndefOr[java.lang.String] = js.undefined
  var backgroundColorLighter3: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var colorBot: js.UndefOr[java.lang.String] = js.undefined
  var colorTop: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    backgroundColorLighter: java.lang.String = null,
    backgroundColorLighter2: java.lang.String = null,
    backgroundColorLighter3: java.lang.String = null,
    color: java.lang.String = null,
    colorBot: java.lang.String = null,
    colorTop: java.lang.String = null
  ): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (backgroundColorLighter != null) __obj.updateDynamic("backgroundColorLighter")(backgroundColorLighter)
    if (backgroundColorLighter2 != null) __obj.updateDynamic("backgroundColorLighter2")(backgroundColorLighter2)
    if (backgroundColorLighter3 != null) __obj.updateDynamic("backgroundColorLighter3")(backgroundColorLighter3)
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorBot != null) __obj.updateDynamic("colorBot")(colorBot)
    if (colorTop != null) __obj.updateDynamic("colorTop")(colorTop)
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

