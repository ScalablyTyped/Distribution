package typings.bizcharts.bizchartsMod

import typings.bizcharts.bizchartsStrings.x
import typings.bizcharts.bizchartsStrings.y
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
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
    endAngle: Int | Double = null,
    innerRadius: Int | Double = null,
    key: Key = null,
    radius: Int | Double = null,
    ref: LegacyRef[js.Any] = null,
    reflect: x | y = null,
    rotate: Int | Double = null,
    scale: js.Tuple2[Double, Double] = null,
    startAngle: Int | Double = null,
    transpose: js.UndefOr[Boolean] = js.undefined,
    `type`: CoordType = null
  ): CoordProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (reflect != null) __obj.updateDynamic("reflect")(reflect.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(transpose)) __obj.updateDynamic("transpose")(transpose.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordProps]
  }
}

