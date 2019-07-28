package typings.baiduDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
   // 车型名称，示例：宝马x6
  var score: Double
   // 置信度，示例：0.5321
  var year: String
}

object Anon_Name {
  @scala.inline
  def apply(name: String, score: Double, year: String): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, score = score, year = year)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

