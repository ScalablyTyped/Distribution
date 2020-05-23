package typings.cordovaSqliteStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var length: Double
  def item(i: Double): js.Any
}

object Item {
  @scala.inline
  def apply(item: Double => js.Any, length: Double): Item = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

