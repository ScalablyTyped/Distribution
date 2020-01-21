package typings.debounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  def clear(): Unit
  def flush(): Unit
}

object AnonClear {
  @scala.inline
  def apply(clear: () => Unit, flush: () => Unit): AnonClear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush))
  
    __obj.asInstanceOf[AnonClear]
  }
}

