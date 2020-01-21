package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPadding extends js.Object {
   // 要显示在可视区域内的坐标点列表，[{latitude, longitude}] 。
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  var points: js.Array[AnonLatitudeLongitude]
}

object AnonPadding {
  @scala.inline
  def apply(points: js.Array[AnonLatitudeLongitude], padding: js.Array[Double] = null): AnonPadding = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPadding]
  }
}

