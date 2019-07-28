package typings.baiduDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameScore extends js.Object {
  // 菜品识别结果数组
  var name: Double
   // 植物名称，示例：吉娃莲。
  var score: Double
}

object Anon_NameScore {
  @scala.inline
  def apply(name: Double, score: Double): Anon_NameScore = {
    val __obj = js.Dynamic.literal(name = name, score = score)
  
    __obj.asInstanceOf[Anon_NameScore]
  }
}

