package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCollectionOption extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[ShapeType] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
}

object PointCollectionOption {
  @scala.inline
  def apply(
    color: String = null,
    shape: js.UndefOr[ShapeType] = js.undefined,
    size: js.UndefOr[SizeType] = js.undefined
  ): PointCollectionOption = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(shape)) __obj.updateDynamic("shape")(shape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCollectionOption]
  }
}

