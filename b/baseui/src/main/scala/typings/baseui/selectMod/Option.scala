package typings.baseui.selectMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option
  extends /* others */ StringDictionary[js.Any] {
  val __optgroup: js.UndefOr[String] = js.undefined
  val clearableValue: js.UndefOr[Boolean] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val id: js.UndefOr[String | Double] = js.undefined
  val isCreatable: js.UndefOr[Boolean] = js.undefined
  val label: js.UndefOr[ReactNode] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    StringDictionary: /* others */ StringDictionary[js.Any] = null,
    __optgroup: String = null,
    clearableValue: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    isCreatable: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (__optgroup != null) __obj.updateDynamic("__optgroup")(__optgroup.asInstanceOf[js.Any])
    if (!js.isUndefined(clearableValue)) __obj.updateDynamic("clearableValue")(clearableValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isCreatable)) __obj.updateDynamic("isCreatable")(isCreatable.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

