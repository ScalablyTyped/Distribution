package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalorie extends js.Object {
   // 菜名，示例：鱼香肉丝。
  var calorie: Double
  // 菜品识别结果数组
  var name: String
   // 卡路里，每100g的卡路里含量。
  var probability: Double
}

object AnonCalorie {
  @scala.inline
  def apply(calorie: Double, name: String, probability: Double): AnonCalorie = {
    val __obj = js.Dynamic.literal(calorie = calorie.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalorie]
  }
}

