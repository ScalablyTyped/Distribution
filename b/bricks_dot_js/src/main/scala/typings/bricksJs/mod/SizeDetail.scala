package typings.bricksJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeDetail extends js.Object {
  var columns: Double
  var gutter: Double
  var mq: js.UndefOr[String] = js.undefined
}

object SizeDetail {
  @scala.inline
  def apply(columns: Double, gutter: Double, mq: String = null): SizeDetail = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], gutter = gutter.asInstanceOf[js.Any])
    if (mq != null) __obj.updateDynamic("mq")(mq.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeDetail]
  }
}

