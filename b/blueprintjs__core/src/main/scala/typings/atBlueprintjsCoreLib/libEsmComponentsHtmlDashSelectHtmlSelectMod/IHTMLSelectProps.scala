package typings
package atBlueprintjsCoreLib.libEsmComponentsHtmlDashSelectHtmlSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLSelectProps
  extends reactLib.reactMod.ReactNs.SelectHTMLAttributes[reactLib.HTMLSelectElement]
     with atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLSelectElement] {
  /** Whether this element should fill its container. */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /** Props to spread to the `<Icon>` element. */
  var iconProps: js.UndefOr[stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsIconIconMod.IIconProps]] = js.undefined
  /** Whether to use large styles. */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to use minimal styles. */
  var minimal: js.UndefOr[scala.Boolean] = js.undefined
  /** Multiple select is not supported. */
  @JSName("multiple")
  var multiple_IHTMLSelectProps: js.UndefOr[scala.Nothing] = js.undefined
  /** Change event handler. Use `event.currentTarget.value` to access the new value. */
  @JSName("onChange")
  var onChange_IHTMLSelectProps: js.UndefOr[reactLib.reactMod.ReactNs.ChangeEventHandler[reactLib.HTMLSelectElement]] = js.undefined
  /**
    * Shorthand for supplying options: an array of basic types or
    * `{ label?, value }` objects. If no `label` is supplied, `value`
    * will be used as the label.
    */
  var options: js.UndefOr[
    js.Array[
      java.lang.String | scala.Double | atBlueprintjsCoreLib.libEsmCommonPropsMod.IOptionProps
    ]
  ] = js.undefined
  /** Controlled value of this component. */
  @JSName("value")
  var value_IHTMLSelectProps: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object IHTMLSelectProps {
  @scala.inline
  def apply(
    IElementRefProps: atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod.IElementRefProps[reactLib.HTMLSelectElement] = null,
    SelectHTMLAttributes: reactLib.reactMod.ReactNs.SelectHTMLAttributes[reactLib.HTMLSelectElement] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    iconProps: stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsIconIconMod.IIconProps] = null,
    large: js.UndefOr[scala.Boolean] = js.undefined,
    minimal: js.UndefOr[scala.Boolean] = js.undefined,
    multiple: js.UndefOr[scala.Nothing] = js.undefined,
    onChange: reactLib.reactMod.ReactNs.ChangeEventHandler[reactLib.HTMLSelectElement] = null,
    options: js.Array[
      java.lang.String | scala.Double | atBlueprintjsCoreLib.libEsmCommonPropsMod.IOptionProps
    ] = null,
    value: java.lang.String | scala.Double = null
  ): IHTMLSelectProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IElementRefProps)
    js.Dynamic.global.Object.assign(__obj, SelectHTMLAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (options != null) __obj.updateDynamic("options")(options)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelectProps]
  }
}

