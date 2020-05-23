package typings.blueprintjsTable.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableSnapshot extends js.Object {
  var nextScrollLeft: js.UndefOr[Double] = js.undefined
  var nextScrollTop: js.UndefOr[Double] = js.undefined
}

object ITableSnapshot {
  @scala.inline
  def apply(
    nextScrollLeft: js.UndefOr[Double] = js.undefined,
    nextScrollTop: js.UndefOr[Double] = js.undefined
  ): ITableSnapshot = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nextScrollLeft)) __obj.updateDynamic("nextScrollLeft")(nextScrollLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nextScrollTop)) __obj.updateDynamic("nextScrollTop")(nextScrollTop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableSnapshot]
  }
}

