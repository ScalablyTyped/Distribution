package typings.cordovaSqliteStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var length: Double
  def item(i: Double): js.Any
}

object AnonItem {
  @scala.inline
  def apply(item: Double => js.Any, length: Double): AnonItem = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItem]
  }
}

