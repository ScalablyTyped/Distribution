package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calorie extends js.Object {
   // 菜名，示例：鱼香肉丝。
  var calorie: scala.Double
  // 菜品识别结果数组
  var name: java.lang.String
   // 卡路里，每100g的卡路里含量。
  var probability: scala.Double
}

object Anon_Calorie {
  @scala.inline
  def apply(calorie: scala.Double, name: java.lang.String, probability: scala.Double): Anon_Calorie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calorie")(calorie)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("probability")(probability)
    __obj.asInstanceOf[Anon_Calorie]
  }
}

