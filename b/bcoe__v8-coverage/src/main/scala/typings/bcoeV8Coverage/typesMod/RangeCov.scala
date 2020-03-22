package typings.bcoeV8Coverage.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeCov extends js.Object {
  var count: Double
  var endOffset: Double
  var startOffset: Double
}

object RangeCov {
  @scala.inline
  def apply(count: Double, endOffset: Double, startOffset: Double): RangeCov = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeCov]
  }
}

