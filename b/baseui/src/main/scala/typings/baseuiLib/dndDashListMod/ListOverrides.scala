package typings
package baseuiLib.dndDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOverrides extends js.Object {
  var CloseHandle: js.UndefOr[baseuiLib.Override[SharedStylePropsArgT]] = js.undefined
  var DragHandle: js.UndefOr[baseuiLib.Override[SharedStylePropsArgT]] = js.undefined
  var Item: js.UndefOr[baseuiLib.Override[SharedStylePropsArgT]] = js.undefined
  var Label: js.UndefOr[baseuiLib.Override[SharedStylePropsArgT]] = js.undefined
  var List: js.UndefOr[baseuiLib.Override[SharedStylePropsArgT]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[SharedStylePropsArgT]] = js.undefined
}

object ListOverrides {
  @scala.inline
  def apply(
    CloseHandle: baseuiLib.Override[SharedStylePropsArgT] = null,
    DragHandle: baseuiLib.Override[SharedStylePropsArgT] = null,
    Item: baseuiLib.Override[SharedStylePropsArgT] = null,
    Label: baseuiLib.Override[SharedStylePropsArgT] = null,
    List: baseuiLib.Override[SharedStylePropsArgT] = null,
    Root: baseuiLib.Override[SharedStylePropsArgT] = null
  ): ListOverrides = {
    val __obj = js.Dynamic.literal()
    if (CloseHandle != null) __obj.updateDynamic("CloseHandle")(CloseHandle.asInstanceOf[js.Any])
    if (DragHandle != null) __obj.updateDynamic("DragHandle")(DragHandle.asInstanceOf[js.Any])
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (List != null) __obj.updateDynamic("List")(List.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOverrides]
  }
}

