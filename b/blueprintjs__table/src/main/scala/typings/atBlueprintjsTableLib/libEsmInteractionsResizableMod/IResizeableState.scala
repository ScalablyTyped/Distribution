package typings
package atBlueprintjsTableLib.libEsmInteractionsResizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeableState extends js.Object {
  /**
    * The dimensional size, respecting minimum and maximum constraints.
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * The dimensional size, ignoring minimum and maximum constraints.
    */
  var unclampedSize: js.UndefOr[scala.Double] = js.undefined
}

object IResizeableState {
  @scala.inline
  def apply(size: scala.Int | scala.Double = null, unclampedSize: scala.Int | scala.Double = null): IResizeableState = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (unclampedSize != null) __obj.updateDynamic("unclampedSize")(unclampedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeableState]
  }
}

