package typings.atBlueprintjsCore.libEsmCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionProps extends IProps {
  /** Whether this option is non-interactive. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Label text for this option. If omitted, `value` is used as the label. */
  var label: js.UndefOr[String] = js.undefined
  /** Value of this option. */
  var value: String | Double
}

object IOptionProps {
  @scala.inline
  def apply(
    value: String | Double,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null
  ): IOptionProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptionProps]
  }
}

