package typings
package atBlueprintjsSelectLib.libEsmComponentsOmnibarOmnibarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOmnibarProps[T]
  extends atBlueprintjsSelectLib.libEsmCommonListItemsPropsMod.IListItemsProps[T] {
  /**
    * Props to spread to the query `InputGroup`. Use `query` and
    * `onQueryChange` instead of `inputProps.value` and `inputProps.onChange`
    * to control this input.
    */
  var inputProps: js.UndefOr[
    atBlueprintjsCoreLib.libEsmComponentsFormsInputGroupMod.IInputGroupProps with atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps
  ] = js.native
  /**
    * Toggles the visibility of the omnibar.
    * This prop is required because the component is controlled.
    */
  var isOpen: scala.Boolean = js.native
  /**
    * A callback that is invoked when user interaction causes the omnibar to
    * close, such as clicking on the overlay or pressing the `esc` key (if
    * enabled). Receives the event from the user's interaction, if there was an
    * event (generally either a mouse or key event).
    *
    * Note that due to controlled usage, this component will not actually close
    * itself until the `isOpen` prop becomes `false`.
    * .
    */
  var onClose: js.UndefOr[
    js.Function1[
      /* event */ js.UndefOr[reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ]
  ] = js.native
  /** Props to spread to `Overlay`. */
  var overlayProps: js.UndefOr[
    stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod.IOverlayProps]
  ] = js.native
}

