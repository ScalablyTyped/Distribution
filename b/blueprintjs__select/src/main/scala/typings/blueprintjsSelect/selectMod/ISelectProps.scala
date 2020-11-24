package typings.blueprintjsSelect.selectMod

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsSelect.anon.PartialIPopoverProps
import typings.blueprintjsSelect.listItemsPropsMod.IListItemsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectProps[T] extends IListItemsProps[T] {
  
  /**
    * Whether the component is non-interactive.
    * If true, the list's item renderer will not be called.
    * Note that you'll also need to disable the component's children, if appropriate.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the dropdown list can be filtered.
    * Disabling this option will remove the `InputGroup` and ignore `inputProps`.
    * @default true
    */
  var filterable: js.UndefOr[Boolean] = js.native
  
  /**
    * Props to spread to the query `InputGroup`. Use `query` and
    * `onQueryChange` instead of `inputProps.value` and `inputProps.onChange`
    * to control this input.
    */
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
  
  /** Props to spread to `Popover`. Note that `content` cannot be changed. */
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.native
  
  /**
    * Whether the active item should be reset to the first matching item _when
    * the popover closes_. The query will also be reset to the empty string.
    * @default false
    */
  var resetOnClose: js.UndefOr[Boolean] = js.native
}
