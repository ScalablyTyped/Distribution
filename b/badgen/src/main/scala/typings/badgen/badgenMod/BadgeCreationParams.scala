package typings.badgen.badgenMod

import typings.badgen.badgenStrings.flat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeCreationParams extends js.Object {
  /**
    * Color RGB or Color Name, optional.
    */
  var color: js.UndefOr[ColorPresets | String] = js.undefined
  /**
    * Use icon, optional.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Use this if icon is not square.
    * @default 13
    */
  var iconWidth: js.UndefOr[Double] = js.undefined
  /**
    * Text representing the status.
    */
  var status: String
  /**
    * 'flat' or undefined, optional.
    */
  var style: js.UndefOr[flat] = js.undefined
  /**
    * Text representing the subject.
    */
  var subject: String
}

object BadgeCreationParams {
  @scala.inline
  def apply(
    status: String,
    subject: String,
    color: ColorPresets | String = null,
    icon: String = null,
    iconWidth: Int | Double = null,
    style: flat = null
  ): BadgeCreationParams = {
    val __obj = js.Dynamic.literal(status = status, subject = subject)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BadgeCreationParams]
  }
}

