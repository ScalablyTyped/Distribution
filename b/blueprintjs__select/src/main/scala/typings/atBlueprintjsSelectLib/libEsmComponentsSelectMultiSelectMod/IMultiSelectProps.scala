package typings
package atBlueprintjsSelectLib.libEsmComponentsSelectMultiSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMultiSelectProps[T]
  extends atBlueprintjsSelectLib.libEsmCommonListItemsPropsMod.IListItemsProps[T] {
  /**
    * Whether the component should take up the full width of its container.
    * This overrides `popoverProps.fill` and `tagInputProps.fill`.
    */
  var fill: js.UndefOr[scala.Boolean] = js.native
  /**
    * Whether the popover opens on key down or when `TagInput` is focused.
    * @default false
    */
  var openOnKeyDown: js.UndefOr[scala.Boolean] = js.native
  /**
    * Input placeholder text. Shorthand for `tagInputProps.placeholder`.
    * @default "Search..."
    */
  var placeholder: js.UndefOr[java.lang.String] = js.native
  /** Props to spread to `Popover`. Note that `content` cannot be changed. */
  var popoverProps: js.UndefOr[
    stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod.IPopoverProps] with js.Object
  ] = js.native
  /** Controlled selected values. */
  var selectedItems: js.UndefOr[js.Array[T]] = js.native
  /** Props to spread to `TagInput`. Use `query` and `onQueryChange` to control the input. */
  var tagInputProps: js.UndefOr[
    stdLib.Partial[atBlueprintjsCoreLib.libEsmComponentsTagDashInputTagInputMod.ITagInputProps] with js.Object
  ] = js.native
  /** Custom renderer to transform an item into tag content. */
  def tagRenderer(item: T): reactLib.reactMod.ReactNode = js.native
}

