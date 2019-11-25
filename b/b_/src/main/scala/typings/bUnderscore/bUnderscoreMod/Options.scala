package typings.bUnderscore.bUnderscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var classSeparator: js.UndefOr[String] = js.undefined
  var elementSeparator: js.UndefOr[String] = js.undefined
  var isFullBoolValue: js.UndefOr[Boolean] = js.undefined
  var isFullModifier: js.UndefOr[Boolean] = js.undefined
  var modSeparator: js.UndefOr[String] = js.undefined
  var modValueSeparator: js.UndefOr[String] = js.undefined
  var tailSpace: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    classSeparator: String = null,
    elementSeparator: String = null,
    isFullBoolValue: js.UndefOr[Boolean] = js.undefined,
    isFullModifier: js.UndefOr[Boolean] = js.undefined,
    modSeparator: String = null,
    modValueSeparator: String = null,
    tailSpace: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (classSeparator != null) __obj.updateDynamic("classSeparator")(classSeparator.asInstanceOf[js.Any])
    if (elementSeparator != null) __obj.updateDynamic("elementSeparator")(elementSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(isFullBoolValue)) __obj.updateDynamic("isFullBoolValue")(isFullBoolValue.asInstanceOf[js.Any])
    if (!js.isUndefined(isFullModifier)) __obj.updateDynamic("isFullModifier")(isFullModifier.asInstanceOf[js.Any])
    if (modSeparator != null) __obj.updateDynamic("modSeparator")(modSeparator.asInstanceOf[js.Any])
    if (modValueSeparator != null) __obj.updateDynamic("modValueSeparator")(modValueSeparator.asInstanceOf[js.Any])
    if (tailSpace != null) __obj.updateDynamic("tailSpace")(tailSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

