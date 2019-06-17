package typings
package baseuiLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  val clearableValue: js.UndefOr[scala.Boolean] = js.undefined
  val disabled: js.UndefOr[scala.Boolean] = js.undefined
  val id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  val isCreatable: js.UndefOr[scala.Boolean] = js.undefined
  val label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    clearableValue: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String | scala.Double = null,
    isCreatable: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNode = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearableValue)) __obj.updateDynamic("clearableValue")(clearableValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isCreatable)) __obj.updateDynamic("isCreatable")(isCreatable)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

