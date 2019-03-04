package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
   // 像素宽
  var height: scala.Double
  var left: scala.Double
   // 左起像素位置
  var top: scala.Double
   // 上起像素位置
  var width: scala.Double
}

object Anon_Height {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[Anon_Height]
  }
}

