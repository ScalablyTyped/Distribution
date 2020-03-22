package typings.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var bottom: Double
  var left: Double
  var top: Double
}

object AnonLeft {
  @scala.inline
  def apply(bottom: Double, left: Double, top: Double): AnonLeft = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLeft]
  }
}

