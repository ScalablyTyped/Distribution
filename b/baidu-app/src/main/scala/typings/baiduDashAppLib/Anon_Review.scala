package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Review extends js.Object {
   // 待人工复审的类别列表与详情
  var pass: js.Array[Anon_Hit]
   // 请求中是否包含违禁，0表示非违禁，1表示违禁，2表示建议人工复审 。
  var reject: js.Array[_]
   // 审核未通过的类别列表与详情
  var review: js.Array[_]
  // 审核结果详情
  var spam: scala.Double
}

