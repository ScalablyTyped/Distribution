package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPass extends js.Object {
   // 待人工复审的类别列表与详情
  var pass: js.Array[AnonHit]
   // 请求中是否包含违禁，0表示非违禁，1表示违禁，2表示建议人工复审 。
  var reject: js.Array[_]
   // 审核未通过的类别列表与详情
  var review: js.Array[_]
  // 审核结果详情
  var spam: Double
}

object AnonPass {
  @scala.inline
  def apply(pass: js.Array[AnonHit], reject: js.Array[_], review: js.Array[_], spam: Double): AnonPass = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], reject = reject.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPass]
  }
}

