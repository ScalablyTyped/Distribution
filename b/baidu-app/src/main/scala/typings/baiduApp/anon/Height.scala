package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
   // 像素宽
  var height: Double
  var left: Double
   // 左起像素位置
  var top: Double
   // 上起像素位置
  var width: Double
}

object Height {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

