package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Padding extends js.Object {
   // 要显示在可视区域内的坐标点列表，[{latitude, longitude}] 。
  var padding: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var points: js.Array[Anon_LatitudeLongitude]
}

object Anon_Padding {
  @scala.inline
  def apply(points: js.Array[Anon_LatitudeLongitude], padding: js.Array[scala.Double] = null): Anon_Padding = {
    val __obj = js.Dynamic.literal(points = points)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[Anon_Padding]
  }
}

