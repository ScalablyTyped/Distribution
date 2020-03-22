package typings.baseui.layoutGridMod

import typings.baseui.AnonCell
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps extends js.Object {
  var align: js.UndefOr[Responsive[ALIGNMENT]] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var order: js.UndefOr[Responsive[Double]] = js.undefined
  var overrides: js.UndefOr[AnonCell] = js.undefined
  var skip: js.UndefOr[Responsive[Double]] = js.undefined
  var span: js.UndefOr[Responsive[Double]] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    align: Responsive[ALIGNMENT] = null,
    children: ReactNode = null,
    order: Responsive[Double] = null,
    overrides: AnonCell = null,
    skip: Responsive[Double] = null,
    span: Responsive[Double] = null
  ): CellProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
}

