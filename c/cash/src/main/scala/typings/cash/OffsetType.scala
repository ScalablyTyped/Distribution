package typings.cash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetType extends js.Object {
  var left: Double
  var top: Double
}

object OffsetType {
  @scala.inline
  def apply(left: Double, top: Double): OffsetType = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OffsetType]
  }
}

