package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
   // 车型名称，示例：宝马x6
  var score: Double
   // 置信度，示例：0.5321
  var year: String
}

object Name {
  @scala.inline
  def apply(name: String, score: Double, year: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

