package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LocationName extends js.Object {
   // 分类结果置信度（0–1.0）
  var location: Anon_Height
   // type=0 为1千种高优商标识别结果；type=1 为2万类logo库的结果；其它type为自定义logo库结果。
  var name: scala.Double
   // 识别的品牌名称
  var probability: scala.Double
  // 菜品识别结果数组
  var `type`: scala.Double
}

object Anon_LocationName {
  @scala.inline
  def apply(location: Anon_Height, name: scala.Double, probability: scala.Double, `type`: scala.Double): Anon_LocationName = {
    val __obj = js.Dynamic.literal(location = location, name = name, probability = probability)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_LocationName]
  }
}

