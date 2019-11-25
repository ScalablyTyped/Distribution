package typings.baiduDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Padding extends js.Object {
   // 要显示在可视区域内的坐标点列表，[{latitude, longitude}] 。
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  var points: js.Array[Anon_LatitudeLongitude]
}

object Anon_Padding {
  @scala.inline
  def apply(points: js.Array[Anon_LatitudeLongitude], padding: js.Array[Double] = null): Anon_Padding = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Padding]
  }
}

