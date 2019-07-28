package typings.baiduDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Keyword extends js.Object {
  // 标签结果数组
  var keyword: String
   // 置信度，0-1
  var root: String
   // 图片中的物体或场景名称
  var score: Double
}

object Anon_Keyword {
  @scala.inline
  def apply(keyword: String, root: String, score: Double): Anon_Keyword = {
    val __obj = js.Dynamic.literal(keyword = keyword, root = root, score = score)
  
    __obj.asInstanceOf[Anon_Keyword]
  }
}

