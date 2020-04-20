package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyword extends js.Object {
  // 标签结果数组
  var keyword: String
   // 置信度，0-1
  var root: String
   // 图片中的物体或场景名称
  var score: Double
}

object AnonKeyword {
  @scala.inline
  def apply(keyword: String, root: String, score: Double): AnonKeyword = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyword]
  }
}

