package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsControlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IControlProps
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement] {
  /**
    * Alignment of the indicator within container.
    * @default Alignment.LEFT
    */
  var alignIndicator: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonAlignmentMod.Alignment] = js.undefined
  /** Whether the control should appear as an inline element. */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /** Ref handler that receives HTML `<input>` element backing this component. */
  var inputRef: js.UndefOr[js.Function1[/* ref */ reactLib.HTMLInputElement | scala.Null, _]] = js.undefined
  /**
    * Text label for the control.
    *
    * Use `children` or `labelElement` to supply JSX content. This prop actually supports JSX elements,
    * but TypeScript will throw an error because `HTMLAttributes` only allows strings.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * JSX Element label for the control.
    *
    * This prop is a workaround for TypeScript consumers as the type definition for `label` only
    * accepts strings. JavaScript consumers can provide a JSX element directly to `label`.
    */
  var labelElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Whether this control should use large styles. */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of the HTML tag that wraps the checkbox.
    *
    * By default a `<label>` is used, which effectively enlarges the click
    * target to include all of its children. Supply a different tag name if
    * this behavior is undesirable or you're listening to click events from a
    * parent element (as the label can register duplicate clicks).
    *
    * @default "label"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any
  ] = js.undefined
}

object IControlProps {
  @scala.inline
  def apply(
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null,
    InputHTMLAttributes: reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement] = null,
    alignIndicator: atBlueprintjsCoreLib.libEsmCommonAlignmentMod.Alignment = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    inputRef: js.Function1[/* ref */ reactLib.HTMLInputElement | scala.Null, _] = null,
    label: java.lang.String = null,
    labelElement: reactLib.reactMod.ReactNs.ReactNode = null,
    large: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: reactLib.reactMod.ReactNs.FormEventHandler[reactLib.HTMLInputElement] = null,
    tagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any = null
  ): IControlProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IProps)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (alignIndicator != null) __obj.updateDynamic("alignIndicator")(alignIndicator)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelElement != null) __obj.updateDynamic("labelElement")(labelElement.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IControlProps]
  }
}

