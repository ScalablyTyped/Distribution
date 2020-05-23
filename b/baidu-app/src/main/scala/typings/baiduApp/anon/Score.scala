package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Score extends js.Object {
  // 菜品识别结果数组
  var name: Double
   // 植物名称，示例：吉娃莲。
  var score: Double
}

object Score {
  @scala.inline
  def apply(name: Double, score: Double): Score = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
}

