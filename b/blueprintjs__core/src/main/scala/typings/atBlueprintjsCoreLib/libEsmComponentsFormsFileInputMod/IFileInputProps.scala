package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsFileInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IFileInputProps
  extends reactLib.reactMod.ReactNs.LabelHTMLAttributes[stdLib.HTMLLabelElement] {
  /**
    * Whether the file input is non-interactive.
    * Setting this to `true` will automatically disable the child input too.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the file input should take up the full width of its container.
    */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the user has made a selection in the input. This will affect the component's
    * text styling. Make sure to set a non-empty value for the text prop as well.
    * @default false
    */
  var hasSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The props to pass to the child input.
    * `disabled` will be ignored in favor of the top-level prop.
    * `type` will be ignored, because the input _must_ be `type="file"`.
    * Pass `onChange` here to be notified when the user selects a file.
    */
  var inputProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLProps[stdLib.HTMLInputElement]] = js.undefined
  /**
    * Whether the file input should appear with large styling.
    */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback invoked on `<input>` `change` events.
    *
    * This callback is offered as a convenience; it is equivalent to passing
    * `onChange` to `inputProps`.
    *
    * __Note:__ The top-level `onChange` prop is passed to the wrapping
    * `<label>` rather than the `<input>`, which may not be what you expect.
    */
  var onInputChange: js.UndefOr[reactLib.reactMod.ReactNs.FormEventHandler[stdLib.HTMLInputElement]] = js.undefined
  /**
    * The text to display.
    * @default "Choose file..."
    */
  var text: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object IFileInputProps {
  @scala.inline
  def apply(
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null,
    LabelHTMLAttributes: reactLib.reactMod.ReactNs.LabelHTMLAttributes[stdLib.HTMLLabelElement] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    hasSelection: js.UndefOr[scala.Boolean] = js.undefined,
    inputProps: reactLib.reactMod.ReactNs.HTMLProps[stdLib.HTMLInputElement] = null,
    large: js.UndefOr[scala.Boolean] = js.undefined,
    onInputChange: reactLib.reactMod.ReactNs.FormEventHandler[stdLib.HTMLInputElement] = null,
    text: reactLib.reactMod.ReactNs.ReactNode = null
  ): IFileInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IProps)
    js.Dynamic.global.Object.assign(__obj, LabelHTMLAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(hasSelection)) __obj.updateDynamic("hasSelection")(hasSelection)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(onInputChange)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileInputProps]
  }
}

