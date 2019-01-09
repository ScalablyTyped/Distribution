package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsFileInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait IFileInputProps
  extends reactLib.reactMod.ReactNs.LabelHTMLAttributes[reactLib.HTMLLabelElement] {
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
    * The props to pass to the child input.
    * `disabled` will be ignored in favor of the top-level prop.
    * `type` will be ignored, because the input _must_ be `type="file"`.
    * Pass `onChange` here to be notified when the user selects a file.
    */
  var inputProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLInputElement]] = js.undefined
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
  var onInputChange: js.UndefOr[reactLib.reactMod.ReactNs.FormEventHandler[reactLib.HTMLInputElement]] = js.undefined
  /**
    * The text to display.
    * @default "Choose file..."
    */
  var text: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

