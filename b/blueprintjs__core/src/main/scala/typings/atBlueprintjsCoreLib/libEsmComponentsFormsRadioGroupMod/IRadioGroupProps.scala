package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsRadioGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadioGroupProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Whether the group and _all_ its radios are disabled.
    * Individual radios can be disabled using their `disabled` prop.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the radio buttons are to be displayed inline horizontally.
    */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional label text to display above the radio buttons. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the group, used to link radio buttons together in HTML.
    * If omitted, a unique name will be generated internally.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array of options to render in the group. This prop is mutually exclusive
    * with `children`: either provide an array of `IOptionProps` objects or
    * provide `<Radio>` children elements.
    */
  var options: js.UndefOr[js.Array[atBlueprintjsCoreLib.libEsmCommonPropsMod.IOptionProps]] = js.undefined
  /** Value of the selected radio. The child with this value will be `:checked`. */
  var selectedValue: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Callback invoked when the currently selected radio changes.
    * Use `event.currentTarget.value` to read the currently selected value.
    * This prop is required because this component only supports controlled usage.
    */
  def onChange(event: reactLib.reactMod.FormEvent[stdLib.HTMLInputElement]): scala.Unit
}

object IRadioGroupProps {
  @scala.inline
  def apply(
    onChange: reactLib.reactMod.FormEvent[stdLib.HTMLInputElement] => scala.Unit,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    name: java.lang.String = null,
    options: js.Array[atBlueprintjsCoreLib.libEsmCommonPropsMod.IOptionProps] = null,
    selectedValue: java.lang.String | scala.Double = null
  ): IRadioGroupProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRadioGroupProps]
  }
}

