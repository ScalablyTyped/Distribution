package typings.blueprintjsSelect.suggestMod

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsSelect.anon.PartialIPopoverProps
import typings.blueprintjsSelect.listItemsPropsMod.IListItemsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISuggestProps[T] extends IListItemsProps[T] {
  
  /**
    * Whether the popover should close after selecting an item.
    * @default true
    */
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * The uncontrolled default selected item.
    * This prop is ignored if `selectedItem` is used to control the state.
    */
  var defaultSelectedItem: js.UndefOr[T] = js.native
  
  /** Whether the input field should be disabled. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the component should take up the full width of its container.
    * This overrides `popoverProps.fill` and `inputProps.fill`.
    */
  var fill: js.UndefOr[Boolean] = js.native
  
  /**
    * Props to spread to the query `InputGroup`. To control this input, use
    * `query` and `onQueryChange` instead of `inputProps.value` and
    * `inputProps.onChange`.
    */
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
  
  /** Custom renderer to transform an item into a string for the input value. */
  def inputValueRenderer(item: T): String = js.native
  
  /**
    * If true, the component waits until a keydown event in the TagInput
    * before opening its popover.
    *
    * If false, the popover opens immediately after a mouse click or TAB key
    * interaction focuses the component's TagInput.
    *
    * @default false
    */
  var openOnKeyDown: js.UndefOr[Boolean] = js.native
  
  /** Props to spread to `Popover`. Note that `content` cannot be changed. */
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.native
  
  /**
    * Whether the active item should be reset to the first matching item _when
    * the popover closes_. The query will also be reset to the empty string.
    * @default false
    */
  var resetOnClose: js.UndefOr[Boolean] = js.native
  
  /**
    * The currently selected item, or `null` to indicate that no item is selected.
    * If omitted or `undefined`, this prop will be uncontrolled (managed by the component's state).
    * Use `onItemSelect` to listen for updates.
    */
  var selectedItem: js.UndefOr[T | Null] = js.native
}
