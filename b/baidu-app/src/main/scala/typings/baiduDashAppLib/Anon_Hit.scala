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

