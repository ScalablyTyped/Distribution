package typings.baseui.layoutDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledCellProps extends js.Object {
  @JSName("$align")
  var $align: js.UndefOr[Responsive[ALIGNMENT]] = js.undefined
  @JSName("$gridColumns")
  var $gridColumns: js.UndefOr[Responsive[Double]] = js.undefined
  @JSName("$gridGaps")
  var $gridGaps: js.UndefOr[Responsive[Double]] = js.undefined
  @JSName("$gridGutters")
  var $gridGutters: js.UndefOr[Responsive[Double]] = js.undefined
  @JSName("$order")
  var $order: js.UndefOr[Responsive[Double]] = js.undefined
  @JSName("$skip")
  var $skip: js.UndefOr[Responsive[Double]] = js.undefined
  @JSName("$span")
  var $span: js.UndefOr[Responsive[Double]] = js.undefined
}

object StyledCellProps {
  @scala.inline
  def apply(
    $align: Responsive[ALIGNMENT] = null,
    $gridColumns: Responsive[Double] = null,
    $gridGaps: Responsive[Double] = null,
    $gridGutters: Responsive[Double] = null,
    $order: Responsive[Double] = null,
    $skip: Responsive[Double] = null,
    $span: Responsive[Double] = null
  ): StyledCellProps = {
    val __obj = js.Dynamic.literal()
    if ($align != null) __obj.updateDynamic("$align")($align.asInstanceOf[js.Any])
    if ($gridColumns != null) __obj.updateDynamic("$gridColumns")($gridColumns.asInstanceOf[js.Any])
    if ($gridGaps != null) __obj.updateDynamic("$gridGaps")($gridGaps.asInstanceOf[js.Any])
    if ($gridGutters != null) __obj.updateDynamic("$gridGutters")($gridGutters.asInstanceOf[js.Any])
    if ($order != null) __obj.updateDynamic("$order")($order.asInstanceOf[js.Any])
    if ($skip != null) __obj.updateDynamic("$skip")($skip.asInstanceOf[js.Any])
    if ($span != null) __obj.updateDynamic("$span")($span.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledCellProps]
  }
}

