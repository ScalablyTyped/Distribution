package typings
package atBlueprintjsSelectLib.libEsmComponentsSelectSuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestProps[T]
  extends atBlueprintjsSelectLib.libEsmCommonListItemsPropsMod.IListItemsProps[T] {
  /**
       * Whether the popover should close after selecting an item.
       * @default true
       */
  var closeOnSelect: js.UndefOr[scala.Boolean] = js.native
  /**
       * The uncontrolled default selected item.
       * This prop is ignored if `selectedItem` is used to control the state.
       */
  var defaultSelectedItem: js.UndefOr[T] = js.native
  /**
       * Props to spread to the query `InputGroup`. To control this input, use
       * `query` and `onQueryChange` instead of `inputProps.value` and
       * `inputProps.onChange`.
       */
  var inputProps: js.UndefOr[
    atBlueprintjsCoreLib.libEsmComponentsFormsInputGroupMod.IInputGroupProps with atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps
  ] = js.native
  /**
       * Whether the popover opens on key down or when the input is focused.
       * @default false
       */
  var openOnKeyDown: js.UndefOr[scala.Boolean] = js.native
  /** Props to spread to `Popover`. Note that `content` cannot be changed. */
  var popoverProps: js.UndefOr[
    stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod.IPopoverProps] with js.Object
  ] = js.native
  /**
       * The currently selected item, or `null` to indicate that no item is selected.
       * If omitted, this prop will be uncontrolled (managed by the component's state).
       * Use `onItemSelect` to listen for updates.
       */
  var selectedItem: js.UndefOr[T | scala.Null] = js.native
  /** Custom renderer to transform an item into a string for the input value. */
  def inputValueRenderer(item: T): java.lang.String = js.native
}

