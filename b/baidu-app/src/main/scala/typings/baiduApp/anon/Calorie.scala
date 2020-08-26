package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calorie extends js.Object {
   // 菜名，示例：鱼香肉丝。
  var calorie: Double = js.native
  // 菜品识别结果数组
  var name: String = js.native
   // 卡路里，每100g的卡路里含量。
  var probability: Double = js.native
}

object Calorie {
  @scala.inline
  def apply(calorie: Double, name: String, probability: Double): Calorie = {
    val __obj = js.Dynamic.literal(calorie = calorie.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calorie]
  }
  @scala.inline
  implicit class CalorieOps[Self <: Calorie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCalorie(value: Double): Self = this.set("calorie", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProbability(value: Double): Self = this.set("probability", value.asInstanceOf[js.Any])
  }
  
}

