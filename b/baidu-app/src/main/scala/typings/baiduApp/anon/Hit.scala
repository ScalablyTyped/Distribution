package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hit extends js.Object {
   // 违禁检测分，范围 0~1，数值从低到高代表风险程度的高低 。
  var hit: js.Array[String]
  // 审核通过的类别列表与详情
  var label: Double
   // 请求中的违禁类型
  var score: Double
}

object Hit {
  @scala.inline
  def apply(hit: js.Array[String], label: Double, score: Double): Hit = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit]
  }
}

