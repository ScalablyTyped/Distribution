package typings.blueprintjsTable.resizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeableState extends js.Object {
  /**
    * The dimensional size, respecting minimum and maximum constraints.
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * The dimensional size, ignoring minimum and maximum constraints.
    */
  var unclampedSize: js.UndefOr[Double] = js.undefined
}

object IResizeableState {
  @scala.inline
  def apply(size: js.UndefOr[Double] = js.undefined, unclampedSize: js.UndefOr[Double] = js.undefined): IResizeableState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unclampedSize)) __obj.updateDynamic("unclampedSize")(unclampedSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeableState]
  }
}

