package typings.atBlueprintjsCore.libEsmComponentsHtmlDashSelectHtmlSelectMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IOptionProps
import typings.atBlueprintjsCore.libEsmComponentsHtmlHtmlMod.IElementRefProps
import typings.atBlueprintjsCore.libEsmComponentsIconIconMod.IIconProps
import typings.react.reactMod.ChangeEventHandler
import typings.react.reactMod.SelectHTMLAttributes
import typings.std.HTMLSelectElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLSelectProps
  extends SelectHTMLAttributes[HTMLSelectElement]
     with IElementRefProps[HTMLSelectElement] {
  /** Whether this element should fill its container. */
  var fill: js.UndefOr[Boolean] = js.undefined
  /** Props to spread to the `<Icon>` element. */
  var iconProps: js.UndefOr[Partial[IIconProps]] = js.undefined
  /** Whether to use large styles. */
  var large: js.UndefOr[Boolean] = js.undefined
  /** Whether to use minimal styles. */
  var minimal: js.UndefOr[Boolean] = js.undefined
  /** Change event handler. Use `event.currentTarget.value` to access the new value. */
  @JSName("onChange")
  var onChange_IHTMLSelectProps: js.UndefOr[ChangeEventHandler[HTMLSelectElement]] = js.undefined
  /**
    * Shorthand for supplying options: an array of basic types or
    * `{ label?, value }` objects. If no `label` is supplied, `value`
    * will be used as the label.
    */
  var options: js.UndefOr[js.Array[String | Double | IOptionProps]] = js.undefined
  /** Controlled value of this component. */
  @JSName("value")
  var value_IHTMLSelectProps: js.UndefOr[String | Double] = js.undefined
}

object IHTMLSelectProps {
  @scala.inline
  def apply(
    IElementRefProps: IElementRefProps[HTMLSelectElement] = null,
    SelectHTMLAttributes: SelectHTMLAttributes[HTMLSelectElement] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    iconProps: Partial[IIconProps] = null,
    large: js.UndefOr[Boolean] = js.undefined,
    minimal: js.UndefOr[Boolean] = js.undefined,
    onChange: ChangeEventHandler[HTMLSelectElement] = null,
    options: js.Array[String | Double | IOptionProps] = null,
    value: String | Double = null
  ): IHTMLSelectProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IElementRefProps)
    js.Dynamic.global.Object.assign(__obj, SelectHTMLAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (options != null) __obj.updateDynamic("options")(options)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelectProps]
  }
}

