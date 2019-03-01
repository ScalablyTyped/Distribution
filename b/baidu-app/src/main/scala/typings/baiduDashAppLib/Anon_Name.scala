package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
   // 车型名称，示例：宝马x6
  var score: scala.Double
   // 置信度，示例：0.5321
  var year: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, score: scala.Double, year: java.lang.String): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("score")(score)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[Anon_Name]
  }
}

