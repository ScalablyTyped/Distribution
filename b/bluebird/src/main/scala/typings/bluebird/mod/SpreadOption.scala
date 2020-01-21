package typings.bluebird.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadOption extends js.Object {
  var spread: Boolean
}

object SpreadOption {
  @scala.inline
  def apply(spread: Boolean): SpreadOption = {
    val __obj = js.Dynamic.literal(spread = spread.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpreadOption]
  }
}

