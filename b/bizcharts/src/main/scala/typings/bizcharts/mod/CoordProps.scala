package typings.bizcharts.mod

import typings.bizcharts.bizchartsStrings.x
import typings.bizcharts.bizchartsStrings.y
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoordProps
  extends Props[js.Any] {
  var endAngle: js.UndefOr[Double] = js.undefined
  var innerRadius: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var reflect: js.UndefOr[x | y] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
  var transpose: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[CoordType] = js.undefined
}

object CoordProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    endAngle: js.UndefOr[Double] = js.undefined,
    innerRadius: js.UndefOr[Double] = js.undefined,
    key: Key = null,
    radius: js.UndefOr[Double] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[js.Any]] = js.undefined,
    reflect: x | y = null,
    rotate: js.UndefOr[Double] = js.undefined,
    scale: js.Tuple2[Double, Double] = null,
    startAngle: js.UndefOr[Double] = js.undefined,
    transpose: js.UndefOr[Boolean] = js.undefined,
    `type`: CoordType = null
  ): CoordProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRadius)) __obj.updateDynamic("innerRadius")(innerRadius.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (reflect != null) __obj.updateDynamic("reflect")(reflect.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transpose)) __obj.updateDynamic("transpose")(transpose.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordProps]
  }
}

