package typings.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromTo extends js.Object {
  var from: Double
  var to: Double
}

object AnonFromTo {
  @scala.inline
  def apply(from: Double, to: Double): AnonFromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFromTo]
  }
}

