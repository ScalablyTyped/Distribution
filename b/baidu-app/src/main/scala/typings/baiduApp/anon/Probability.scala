package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Probability extends js.Object {
   // 分类结果置信度（0–1.0）
  var location: Height
   // type=0 为1千种高优商标识别结果；type=1 为2万类logo库的结果；其它type为自定义logo库结果。
  var name: Double
   // 识别的品牌名称
  var probability: Double
  // 菜品识别结果数组
  var `type`: Double
}

object Probability {
  @scala.inline
  def apply(location: Height, name: Double, probability: Double, `type`: Double): Probability = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Probability]
  }
}

