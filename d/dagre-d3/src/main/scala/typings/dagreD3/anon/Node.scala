package typings.dagreD3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dagre.dagre.Node<{}> */
trait Node extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var height: Double
  var label: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var paddingX: js.UndefOr[Double] = js.undefined
  var paddingY: js.UndefOr[Double] = js.undefined
  var rx: js.UndefOr[Double] = js.undefined
  var ry: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var width: Double
  var x: Double
  var y: Double
}

object Node {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    `class`: String = null,
    label: String = null,
    padding: js.UndefOr[Double] = js.undefined,
    paddingX: js.UndefOr[Double] = js.undefined,
    paddingY: js.UndefOr[Double] = js.undefined,
    rx: js.UndefOr[Double] = js.undefined,
    ry: js.UndefOr[Double] = js.undefined,
    shape: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingX)) __obj.updateDynamic("paddingX")(paddingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingY)) __obj.updateDynamic("paddingY")(paddingY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rx)) __obj.updateDynamic("rx")(rx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ry)) __obj.updateDynamic("ry")(ry.get.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

