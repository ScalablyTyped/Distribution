package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Keyword extends js.Object {
  // 标签结果数组
  var keyword: java.lang.String
   // 置信度，0-1
  var root: java.lang.String
   // 图片中的物体或场景名称
  var score: scala.Double
}

object Anon_Keyword {
  @scala.inline
  def apply(keyword: java.lang.String, root: java.lang.String, score: scala.Double): Anon_Keyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyword")(keyword)
    __obj.updateDynamic("root")(root)
    __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[Anon_Keyword]
  }
}

