package typings.baidumapDashWebDashSdk.BMap

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
  def apply(color: String = null, shape: Int | Double = null, size: Int | Double = null): PointCollectionOption = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCollectionOption]
  }
}

