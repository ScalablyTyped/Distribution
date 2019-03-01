package typings
package atBlueprintjsCoreLib.libEsmCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionProps extends IProps {
  /** Whether this option is non-interactive. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Label text for this option. If omitted, `value` is used as the label. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** Value of this option. */
  var value: java.lang.String | scala.Double
}

object IOptionProps {
  @scala.inline
  def apply(
    value: java.lang.String | scala.Double,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null
  ): IOptionProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[IOptionProps]
  }
}

