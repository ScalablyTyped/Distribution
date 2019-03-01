package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hit extends js.Object {
   // 违禁检测分，范围 0~1，数值从低到高代表风险程度的高低 。
  var hit: js.Array[java.lang.String]
  // 审核通过的类别列表与详情
  var label: scala.Double
   // 请求中的违禁类型
  var score: scala.Double
}

object Anon_Hit {
  @scala.inline
  def apply(hit: js.Array[java.lang.String], label: scala.Double, score: scala.Double): Anon_Hit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hit")(hit)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[Anon_Hit]
  }
}

