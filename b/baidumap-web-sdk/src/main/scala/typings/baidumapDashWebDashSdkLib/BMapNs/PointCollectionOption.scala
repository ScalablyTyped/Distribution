package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCollectionOption extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var shape: js.UndefOr[ShapeType] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
}

object PointCollectionOption {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    shape: js.UndefOr[ShapeType] = js.undefined,
    size: js.UndefOr[SizeType] = js.undefined
  ): PointCollectionOption = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(shape)) __obj.updateDynamic("shape")(shape)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[PointCollectionOption]
  }
}

