package typings
package badgenLib.badgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeCreationParams extends js.Object {
  /**
    * Color RGB or Color Name, optional.
    */
  var color: js.UndefOr[ColorPresets | java.lang.String] = js.undefined
  /**
    * Use icon, optional.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use this if icon is not square.
    * @default 13
    */
  var iconWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Text representing the status.
    */
  var status: java.lang.String
  /**
    * 'flat' or undefined, optional.
    */
  var style: js.UndefOr[badgenLib.badgenLibStrings.flat] = js.undefined
  /**
    * Text representing the subject.
    */
  var subject: java.lang.String
}

object BadgeCreationParams {
  @scala.inline
  def apply(
    status: java.lang.String,
    subject: java.lang.String,
    color: ColorPresets | java.lang.String = null,
    icon: java.lang.String = null,
    iconWidth: scala.Int | scala.Double = null,
    style: badgenLib.badgenLibStrings.flat = null
  ): BadgeCreationParams = {
    val __obj = js.Dynamic.literal(status = status, subject = subject)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BadgeCreationParams]
  }
}

