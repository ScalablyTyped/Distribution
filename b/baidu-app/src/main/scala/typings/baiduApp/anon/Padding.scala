package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Padding extends js.Object {
   // 要显示在可视区域内的坐标点列表，[{latitude, longitude}] 。
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  var points: js.Array[Longitude]
}

object Padding {
  @scala.inline
  def apply(points: js.Array[Longitude], padding: js.Array[Double] = null): Padding = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
}

