package typings.bcoeV8Coverage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.RangeCov> */
trait ReadonlyRangeCov extends js.Object {
  val count: Double
  val endOffset: Double
  val startOffset: Double
}

object ReadonlyRangeCov {
  @scala.inline
  def apply(count: Double, endOffset: Double, startOffset: Double): ReadonlyRangeCov = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyRangeCov]
  }
}

