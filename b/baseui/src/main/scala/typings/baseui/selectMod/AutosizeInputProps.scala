package typings.baseui.selectMod

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosizeInputProps extends js.Object {
  @JSName("$size")
  var $size: js.UndefOr[default_ | compact | large_] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var inputRef: js.UndefOr[Ref[_]] = js.undefined
  var overrides: js.UndefOr[AutosizeInputOverrides] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object AutosizeInputProps {
  @scala.inline
  def apply(
    $size: default_ | compact | large_ = null,
    defaultValue: String = null,
    inputRef: Ref[_] = null,
    overrides: AutosizeInputOverrides = null,
    value: String = null
  ): AutosizeInputProps = {
    val __obj = js.Dynamic.literal()
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosizeInputProps]
  }
}

