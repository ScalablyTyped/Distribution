package typings
package baseuiLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosizeInputProps extends js.Object {
  @JSName("$size")
  var $size: js.UndefOr[
    baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large
  ] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.Ref[_]] = js.undefined
  var overrides: js.UndefOr[AutosizeInputOverrides] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object AutosizeInputProps {
  @scala.inline
  def apply(
    $size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large = null,
    defaultValue: java.lang.String = null,
    inputRef: reactLib.reactMod.Ref[_] = null,
    overrides: AutosizeInputOverrides = null,
    value: java.lang.String = null
  ): AutosizeInputProps = {
    val __obj = js.Dynamic.literal()
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AutosizeInputProps]
  }
}

