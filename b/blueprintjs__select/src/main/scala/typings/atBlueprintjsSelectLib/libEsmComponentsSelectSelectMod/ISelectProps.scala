package typings
package atBlueprintjsSelectLib.libEsmComponentsSelectSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectProps[T]
  extends atBlueprintjsSelectLib.libEsmCommonListItemsPropsMod.IListItemsProps[T] {
  /**
       * Whether the component is non-interactive.
       * Note that you'll also need to disable the component's children, if appropriate.
       * @default false
       */
  var disabled: js.UndefOr[scala.Boolean] = js.native
  /**
       * Whether the dropdown list can be filtered.
       * Disabling this option will remove the `InputGroup` and ignore `inputProps`.
       * @default true
       */
  var filterable: js.UndefOr[scala.Boolean] = js.native
  /**
       * Props to spread to the query `InputGroup`. Use `query` and
       * `onQueryChange` instead of `inputProps.value` and `inputProps.onChange`
       * to control this input.
       */
  var inputProps: js.UndefOr[
    atBlueprintjsCoreLib.libEsmComponentsFormsInputGroupMod.IInputGroupProps with atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps
  ] = js.native
  /** Props to spread to `Popover`. Note that `content` cannot be changed. */
  var popoverProps: js.UndefOr[
    stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod.IPopoverProps] with js.Object
  ] = js.native
  /**
       * Whether the active item should be reset to the first matching item _when
       * the popover closes_. The query will also be reset to the empty string.
       * @default false
       */
  var resetOnClose: js.UndefOr[scala.Boolean] = js.native
}

