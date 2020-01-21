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
  def apply(nextScrollLeft: Int | Double = null, nextScrollTop: Int | Double = null): ITableSnapshot = {
    val __obj = js.Dynamic.literal()
    if (nextScrollLeft != null) __obj.updateDynamic("nextScrollLeft")(nextScrollLeft.asInstanceOf[js.Any])
    if (nextScrollTop != null) __obj.updateDynamic("nextScrollTop")(nextScrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableSnapshot]
  }
}

